package com.example.sampledax.ui.dax.domain.entity

import com.example.sampledax.ui.dax.data.response.FlopList
import com.example.sampledax.ui.dax.data.response.TopList
import com.example.sampledax.ui.dax.presentation.model.IndexModel


class IndexEntity {
    var name: String? = null
    var wkn: String? = null
    var isin: String? = null
    var profil: String? = null
    var topList: ArrayList<TopList>? = null
    var flopList: ArrayList<FlopList>? = null

    fun toEntity(): IndexModel {
        return IndexModel(
            this.name,
            this.wkn,
            this.isin,
            this.profil,
            this.topList,
            this.flopList
        )
    }
}