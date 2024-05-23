package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class UnderlyingEntity {
    @SerializedName("name")
    var name: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("urlName")
    var urlName: String? = null

    @SerializedName("value")
    var value: String? = null
}
