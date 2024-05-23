package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName


@Suppress("unused")
class InstrumentSnapshotGenericData {
    @SerializedName("codeEntityCategory")
    var codeEntityCategory: String? = null

    @SerializedName("entityCategory")
    var entityCategory: String? = null

    @SerializedName("seoDescription")
    var seoDescription: String? = null
}
