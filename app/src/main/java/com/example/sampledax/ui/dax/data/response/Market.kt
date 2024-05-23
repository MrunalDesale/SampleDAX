package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class Market {
    @SerializedName("codeExchange")
    var codeExchange: String? = null

    @SerializedName("codeMarket")
    var codeMarket: String? = null

    @SerializedName("idNotation")
    var idNotation: Long? = null

    @SerializedName("isoCountry")
    var isoCountry: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("nameExchange")
    var nameExchange: String? = null
}
