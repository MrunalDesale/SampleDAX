package com.example.sampledax.ui.dax.data.mapper

import com.example.sampledax.ui.dax.data.response.FlopList
import com.example.sampledax.ui.dax.data.response.IndexResponse
import com.example.sampledax.ui.dax.data.response.TopList
import com.example.sampledax.ui.dax.domain.entity.IndexEntity
import retrofit2.Response



//Data Mapper class to transform Response class to Entity Class
class DataMapper {


    fun mapIndex(response: Response<IndexResponse>): IndexEntity {
        val indexResponse: IndexResponse? = response.body()

        val indexEntity = IndexEntity()

        indexEntity.wkn = indexResponse?.instrument?.wkn
        indexEntity.isin = indexResponse?.instrument?.isin
        indexEntity.name = indexResponse?.instrument?.name

        if(indexResponse?.profile != null)
            if(indexResponse.profile!!.isNotEmpty())
                indexEntity.profil = indexResponse.profile!![0].value

        if(indexResponse?.indicesTopFlopEntityList != null) {
            if (indexResponse.indicesTopFlopEntityList!!.numberTop!! > 0) {
                indexEntity.topList = ArrayList()
                indexResponse.indicesTopFlopEntityList!!.topList?.forEach {
                    val topList = TopList()
                    val instrument = TopList.Instrument()
                    instrument.name = it.instrument?.name
                    topList.instrument = instrument
                    topList.performancePct = it.performancePct
                    indexEntity.topList?.add(topList)
                }
            }
            if(indexResponse.indicesTopFlopEntityList!!.numberFlop!! > 0) {
                indexEntity.flopList = ArrayList()
                indexResponse.indicesTopFlopEntityList!!.flopList?.forEach {
                    val flopList = FlopList()
                    val instrument = FlopList.Instrument()
                    instrument.name = it.instrument?.name
                    flopList.instrument = instrument
                    flopList.performancePct = it.performancePct
                    indexEntity.flopList?.add(flopList)
                }
            }
        }

        return indexEntity
    }
}