package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

@Suppress("unused")
class Chart {
    @SerializedName("codeMarket")
    var codeMarket: String? = null

    @SerializedName("idNotation")
    var idNotation: Long? = null

    @SerializedName("isoCurrency")
    var isoCurrency: String? = null

    @SerializedName("ranges")
    var ranges: List<String>? = null

    @SerializedName("selectedRange")
    var selectedRange: String? = null
}
