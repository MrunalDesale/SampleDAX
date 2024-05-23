package com.example.sampledax.ui.dax.data.response

import com.google.gson.annotations.SerializedName
import kotlin.collections.List

@Suppress("unused")
class IndexResponse {
    @SerializedName("chart")
    var chart: Chart? = null

    @SerializedName("cnPerformance")
    var cnPerformance: CnPerformance? = null

    @SerializedName("expires")
    var expires: Long? = null

    @SerializedName("indicesDetails")
    var indicesDetails: IndicesDetails? = null

    @SerializedName("indicesTopFlopEntityList")
    var indicesTopFlopEntityList: IndicesTopFlopEntityList? = null

    @SerializedName("instrument")
    var instrument: Instrument? = null

    @SerializedName("instrumentSnapshotGenericData")
    var instrumentSnapshotGenericData: InstrumentSnapshotGenericData? = null

    @SerializedName("keywords")
    var keywords: Keywords? = null

    @SerializedName("numberConstituents")
    var numberConstituents: Long? = null

    @SerializedName("profile")
    var profile: List<Profile>? = null

    @SerializedName("quote")
    var quote: Quote? = null

    @SerializedName("quoteList")
    var quoteList: QuoteList? = null

    @SerializedName("relatedInstrumentItemList")
    var relatedInstrumentItemList: List<Any>? = null

    @SerializedName("type")
    var type: String? = null
}
