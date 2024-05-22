package com.example.sampledax.ui.dax.presentation.model

import com.example.sampledax.ui.dax.data.response.FlopList
import com.example.sampledax.ui.dax.data.response.TopList
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class IndexModel {
    constructor(
        name: String?,
        wkn: String?,
        isin: String?,
        profil: String?,
        topList: ArrayList<TopList>?,
        flopList: ArrayList<FlopList>?
    ) {
        this.name = name
        this.wkn = wkn
        this.isin = isin
        this.profil = profil
    }

    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("wkn")
    @Expose
    var wkn: String? = null

    @SerializedName("isin")
    @Expose
    var isin: String? = null

    @SerializedName("profile")
    @Expose
    var profil: String? = null

    @SerializedName("topList")
    @Expose
    var topList: ArrayList<TopList>? = null

    @SerializedName("flopList")
    @Expose
    var flopList: ArrayList<FlopList>? = null
}
