package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

@Suppress("unused")
class IndicesTopFlopEntityList {
    @SerializedName("expires")
    var expires: Long? = null

    @SerializedName("flopList")
    var flopList: List<FlopList>? = null

    @SerializedName("numberEqual")
    var numberEqual: Long? = null

    @SerializedName("numberFlop")
    var numberFlop: Long? = null

    @SerializedName("numberTop")
    var numberTop: Long? = null

    @SerializedName("topList")
    var topList: List<TopList>? = null

    @SerializedName("total")
    var total: Long? = null
}
