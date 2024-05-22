package com.example.sampledax.ui.dax.data.repository


import com.example.sampledax.ui.dax.domain.repository.IndexRepository
import com.example.sampledax.ui.dax.data.mapper.DataMapper
import com.example.sampledax.ui.dax.data.service.RestApi
import com.example.sampledax.ui.dax.domain.entity.IndexEntity
import io.reactivex.Observable

class DataRepository constructor(var mRestApi: RestApi, var mDataMapper: DataMapper) :
    IndexRepository {

    override fun getIndexData(): Observable<IndexEntity> {
        return mRestApi.doIndexAPI().map(mDataMapper::mapIndex)
    }
}
