package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class List {
    @SerializedName("addendum")
    var addendum: String? = null

    @SerializedName("codeQualityPrice")
    var codeQualityPrice: String? = null

    @SerializedName("codeQualityPriceBidAsk")
    var codeQualityPriceBidAsk: String? = null

    @SerializedName("datetimeHigh")
    var datetimeHigh: String? = null

    @SerializedName("datetimeHighPrice1Year")
    var datetimeHighPrice1Year: String? = null

    @SerializedName("datetimeLast")
    var datetimeLast: String? = null

    @SerializedName("datetimeLow")
    var datetimeLow: String? = null

    @SerializedName("datetimeLowPrice1Year")
    var datetimeLowPrice1Year: String? = null

    @SerializedName("datetimeOpen")
    var datetimeOpen: String? = null

    @SerializedName("datetimePreviousLast")
    var datetimePreviousLast: String? = null

    @SerializedName("displayUnit")
    var displayUnit: String? = null

    @SerializedName("entityType")
    var entityType: String? = null

    @SerializedName("entityValue")
    var entityValue: String? = null

    @SerializedName("expires")
    var expires: Long? = null

    @SerializedName("high")
    var high: Double? = null

    @SerializedName("highPrice1Year")
    var highPrice1Year: Double? = null

    @SerializedName("idInstrument")
    var idInstrument: String? = null

    @SerializedName("idTradingSchedule")
    var idTradingSchedule: Long? = null

    @SerializedName("idTypePrice")
    var idTypePrice: Long? = null

    @SerializedName("isoCurrency")
    var isoCurrency: String? = null

    @SerializedName("last")
    var last: Double? = null

    @SerializedName("low")
    var low: Double? = null

    @SerializedName("lowPrice1Year")
    var lowPrice1Year: Double? = null

    @SerializedName("market")
    var market: Market? = null

    @SerializedName("open")
    var open: Double? = null

    @SerializedName("performance")
    var performance: Double? = null

    @SerializedName("performance1Year")
    var performance1Year: Double? = null

    @SerializedName("performance1YearPct")
    var performance1YearPct: Double? = null

    @SerializedName("performancePct")
    var performancePct: Double? = null

    @SerializedName("previousLast")
    var previousLast: Double? = null

    @SerializedName("totalMoney")
    var totalMoney: Double? = null

    @SerializedName("totalVolume")
    var totalVolume: Double? = null

    @SerializedName("unitType")
    var unitType: String? = null

    @SerializedName("volume4Weeks")
    var volume4Weeks: Double? = null
}
