package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName

@Suppress("unused")
class Profile {
    @SerializedName("ignoreIfUnknown")
    var ignoreIfUnknown: Boolean? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("value")
    var value: String? = null
}
