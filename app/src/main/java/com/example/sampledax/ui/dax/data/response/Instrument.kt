package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

@Suppress("unused")
class Instrument {
    @SerializedName("displayType")
    var displayType: String? = null

    @SerializedName("entityAttributes")
    var entityAttributes: List<String>? = null

    @SerializedName("entityType")
    var entityType: String? = null

    @SerializedName("entityValue")
    var entityValue: String? = null

    @SerializedName("homeSymbol")
    var homeSymbol: String? = null

    @SerializedName("instrumentType")
    var instrumentType: String? = null

    @SerializedName("isin")
    var isin: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("symbol")
    var symbol: String? = null

    @SerializedName("tinyName")
    var tinyName: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("underlyingEntity")
    var underlyingEntity: UnderlyingEntity? = null

    @SerializedName("urlName")
    var urlName: String? = null

    @SerializedName("urls")
    var urls: Urls? = null

    @SerializedName("wkn")
    var wkn: String? = null
}
