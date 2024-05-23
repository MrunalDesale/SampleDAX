package com.example.sampledax.ui.dax.presentation.model

import com.example.sampledax.ui.dax.data.response.FlopList
import com.example.sampledax.ui.dax.data.response.TopList
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class IndexModel(
    @SerializedName("name")
    @Expose var name: String?, @SerializedName("wkn")
    @Expose var wkn: String?, @SerializedName("isin")
    @Expose var isin: String?, @SerializedName("profile")
    @Expose var profil: String?, @SerializedName("topList")
    @Expose var topList: ArrayList<TopList>?, @SerializedName("flopList")
    @Expose var flopList: ArrayList<FlopList>?
)