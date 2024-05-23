package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName
import kotlin.collections.List


@Suppress("unused")
class TopList {
    @SerializedName("cnDivYield")
    var cnDivYield: Double? = null

    @SerializedName("cnPeg")
    var cnPeg: Double? = null

    @SerializedName("cnPer")
    var cnPer: Double? = null

    @SerializedName("datetimeLast")
    var datetimeLast: String? = null

    @SerializedName("idNotation")
    var idNotation: Long? = null

    @SerializedName("instrument")
    var instrument: Instrument? = null

    @SerializedName("isoCurrency")
    var isoCurrency: String? = null

    @SerializedName("last")
    var last: Double? = null

    @SerializedName("money")
    var money: Double? = null

    @SerializedName("performance")
    var performance: Double? = null

    @SerializedName("performancePct")
    var performancePct: Double? = null

    @SerializedName("volume")
    var volume: Double? = null

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
}
