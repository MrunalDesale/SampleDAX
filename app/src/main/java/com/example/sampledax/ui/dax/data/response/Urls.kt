package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class Urls {
    @SerializedName("DERIVATIVES_FINDER")
    var dERIVATIVESFINDER: String? = null

    @SerializedName("ETF_FINDER")
    var eTFFINDER: String? = null

    @SerializedName("NEWS")
    var nEWS: String? = null

    @SerializedName("WEBSITE")
    var wEBSITE: String? = null
}
