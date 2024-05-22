
package com.example.sampledax.ui.dax.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class IndexResponse {

    @SerializedName("chart")
    private Chart mChart;
    @SerializedName("cnPerformance")
    private CnPerformance mCnPerformance;
    @SerializedName("expires")
    private Long mExpires;
    @SerializedName("indicesDetails")
    private IndicesDetails mIndicesDetails;
    @SerializedName("indicesTopFlopEntityList")
    private IndicesTopFlopEntityList mIndicesTopFlopEntityList;
    @SerializedName("instrument")
    private Instrument mInstrument;
    @SerializedName("instrumentSnapshotGenericData")
    private InstrumentSnapshotGenericData mInstrumentSnapshotGenericData;
    @SerializedName("keywords")
    private Keywords mKeywords;
    @SerializedName("numberConstituents")
    private Long mNumberConstituents;
    @SerializedName("profile")
    private List<Profile> mProfile;
    @SerializedName("quote")
    private Quote mQuote;
    @SerializedName("quoteList")
    private QuoteList mQuoteList;
    @SerializedName("relatedInstrumentItemList")
    private List<Object> mRelatedInstrumentItemList;
    @SerializedName("type")
    private String mType;

    public Chart getChart() {
        return mChart;
    }

    public void setChart(Chart chart) {
        mChart = chart;
    }

    public CnPerformance getCnPerformance() {
        return mCnPerformance;
    }

    public void setCnPerformance(CnPerformance cnPerformance) {
        mCnPerformance = cnPerformance;
    }

    public Long getExpires() {
        return mExpires;
    }

    public void setExpires(Long expires) {
        mExpires = expires;
    }

    public IndicesDetails getIndicesDetails() {
        return mIndicesDetails;
    }

    public void setIndicesDetails(IndicesDetails indicesDetails) {
        mIndicesDetails = indicesDetails;
    }

    public IndicesTopFlopEntityList getIndicesTopFlopEntityList() {
        return mIndicesTopFlopEntityList;
    }

    public void setIndicesTopFlopEntityList(IndicesTopFlopEntityList indicesTopFlopEntityList) {
        mIndicesTopFlopEntityList = indicesTopFlopEntityList;
    }

    public Instrument getInstrument() {
        return mInstrument;
    }

    public void setInstrument(Instrument instrument) {
        mInstrument = instrument;
    }

    public InstrumentSnapshotGenericData getInstrumentSnapshotGenericData() {
        return mInstrumentSnapshotGenericData;
    }

    public void setInstrumentSnapshotGenericData(InstrumentSnapshotGenericData instrumentSnapshotGenericData) {
        mInstrumentSnapshotGenericData = instrumentSnapshotGenericData;
    }

    public Keywords getKeywords() {
        return mKeywords;
    }

    public void setKeywords(Keywords keywords) {
        mKeywords = keywords;
    }

    public Long getNumberConstituents() {
        return mNumberConstituents;
    }

    public void setNumberConstituents(Long numberConstituents) {
        mNumberConstituents = numberConstituents;
    }

    public List<Profile> getProfile() {
        return mProfile;
    }

    public void setProfile(List<Profile> profile) {
        mProfile = profile;
    }

    public Quote getQuote() {
        return mQuote;
    }

    public void setQuote(Quote quote) {
        mQuote = quote;
    }

    public QuoteList getQuoteList() {
        return mQuoteList;
    }

    public void setQuoteList(QuoteList quoteList) {
        mQuoteList = quoteList;
    }

    public List<Object> getRelatedInstrumentItemList() {
        return mRelatedInstrumentItemList;
    }

    public void setRelatedInstrumentItemList(List<Object> relatedInstrumentItemList) {
        mRelatedInstrumentItemList = relatedInstrumentItemList;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
