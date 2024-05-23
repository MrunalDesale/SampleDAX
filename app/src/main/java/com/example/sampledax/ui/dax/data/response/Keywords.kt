package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class Keywords {
    @SerializedName("entityType")
    var entityType: String? = null

    @SerializedName("entityValue")
    var entityValue: String? = null

    @SerializedName("idFamily")
    var idFamily: String? = null

    @SerializedName("isin")
    var isin: String? = null

    @SerializedName("wkn")
    var wkn: String? = null
}
