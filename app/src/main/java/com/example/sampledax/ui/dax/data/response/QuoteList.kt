package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class QuoteList {
    @SerializedName("expires")
    var expires: Long? = null

    @SerializedName("list")
    var list: kotlin.collections.List<List>? = null
}
