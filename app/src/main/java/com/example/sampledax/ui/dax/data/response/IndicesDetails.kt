package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

@Suppress("unused")
class IndicesDetails {
    @SerializedName("branch")
    var branch: Any? = null

    @SerializedName("categories")
    var categories: List<Any>? = null

    @SerializedName("etfBenchmark")
    var etfBenchmark: Boolean? = null

    @SerializedName("idContinent")
    var idContinent: String? = null

    @SerializedName("idFamily")
    var idFamily: String? = null

    @SerializedName("idIndexType")
    var idIndexType: Long? = null

    @SerializedName("idInstrument")
    var idInstrument: Long? = null

    @SerializedName("idSecuritySubType")
    var idSecuritySubType: Long? = null

    @SerializedName("isoCountry")
    var isoCountry: String? = null

    @SerializedName("isoCurrencyMarketCapitalization")
    var isoCurrencyMarketCapitalization: Any? = null

    @SerializedName("marketCapitalization")
    var marketCapitalization: Any? = null

    @SerializedName("nameContinent")
    var nameContinent: String? = null

    @SerializedName("nameCountry")
    var nameCountry: String? = null

    @SerializedName("nameFamily")
    var nameFamily: String? = null

    @SerializedName("nameIndexType")
    var nameIndexType: String? = null

    @SerializedName("nameSecuritySubType")
    var nameSecuritySubType: String? = null

    @SerializedName("numberConstituents")
    var numberConstituents: Any? = null

    @SerializedName("unitType")
    var unitType: Any? = null
}
