
package com.example.sampledax.ui.dax.data.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class IndicesDetails {

    @SerializedName("branch")
    private Object mBranch;
    @SerializedName("categories")
    private List<Object> mCategories;
    @SerializedName("etfBenchmark")
    private Boolean mEtfBenchmark;
    @SerializedName("idContinent")
    private String mIdContinent;
    @SerializedName("idFamily")
    private String mIdFamily;
    @SerializedName("idIndexType")
    private Long mIdIndexType;
    @SerializedName("idInstrument")
    private Long mIdInstrument;
    @SerializedName("idSecuritySubType")
    private Long mIdSecuritySubType;
    @SerializedName("isoCountry")
    private String mIsoCountry;
    @SerializedName("isoCurrencyMarketCapitalization")
    private Object mIsoCurrencyMarketCapitalization;
    @SerializedName("marketCapitalization")
    private Object mMarketCapitalization;
    @SerializedName("nameContinent")
    private String mNameContinent;
    @SerializedName("nameCountry")
    private String mNameCountry;
    @SerializedName("nameFamily")
    private String mNameFamily;
    @SerializedName("nameIndexType")
    private String mNameIndexType;
    @SerializedName("nameSecuritySubType")
    private String mNameSecuritySubType;
    @SerializedName("numberConstituents")
    private Object mNumberConstituents;
    @SerializedName("unitType")
    private Object mUnitType;

    public Object getBranch() {
        return mBranch;
    }

    public void setBranch(Object branch) {
        mBranch = branch;
    }

    public List<Object> getCategories() {
        return mCategories;
    }

    public void setCategories(List<Object> categories) {
        mCategories = categories;
    }

    public Boolean getEtfBenchmark() {
        return mEtfBenchmark;
    }

    public void setEtfBenchmark(Boolean etfBenchmark) {
        mEtfBenchmark = etfBenchmark;
    }

    public String getIdContinent() {
        return mIdContinent;
    }

    public void setIdContinent(String idContinent) {
        mIdContinent = idContinent;
    }

    public String getIdFamily() {
        return mIdFamily;
    }

    public void setIdFamily(String idFamily) {
        mIdFamily = idFamily;
    }

    public Long getIdIndexType() {
        return mIdIndexType;
    }

    public void setIdIndexType(Long idIndexType) {
        mIdIndexType = idIndexType;
    }

    public Long getIdInstrument() {
        return mIdInstrument;
    }

    public void setIdInstrument(Long idInstrument) {
        mIdInstrument = idInstrument;
    }

    public Long getIdSecuritySubType() {
        return mIdSecuritySubType;
    }

    public void setIdSecuritySubType(Long idSecuritySubType) {
        mIdSecuritySubType = idSecuritySubType;
    }

    public String getIsoCountry() {
        return mIsoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        mIsoCountry = isoCountry;
    }

    public Object getIsoCurrencyMarketCapitalization() {
        return mIsoCurrencyMarketCapitalization;
    }

    public void setIsoCurrencyMarketCapitalization(Object isoCurrencyMarketCapitalization) {
        mIsoCurrencyMarketCapitalization = isoCurrencyMarketCapitalization;
    }

    public Object getMarketCapitalization() {
        return mMarketCapitalization;
    }

    public void setMarketCapitalization(Object marketCapitalization) {
        mMarketCapitalization = marketCapitalization;
    }

    public String getNameContinent() {
        return mNameContinent;
    }

    public void setNameContinent(String nameContinent) {
        mNameContinent = nameContinent;
    }

    public String getNameCountry() {
        return mNameCountry;
    }

    public void setNameCountry(String nameCountry) {
        mNameCountry = nameCountry;
    }

    public String getNameFamily() {
        return mNameFamily;
    }

    public void setNameFamily(String nameFamily) {
        mNameFamily = nameFamily;
    }

    public String getNameIndexType() {
        return mNameIndexType;
    }

    public void setNameIndexType(String nameIndexType) {
        mNameIndexType = nameIndexType;
    }

    public String getNameSecuritySubType() {
        return mNameSecuritySubType;
    }

    public void setNameSecuritySubType(String nameSecuritySubType) {
        mNameSecuritySubType = nameSecuritySubType;
    }

    public Object getNumberConstituents() {
        return mNumberConstituents;
    }

    public void setNumberConstituents(Object numberConstituents) {
        mNumberConstituents = numberConstituents;
    }

    public Object getUnitType() {
        return mUnitType;
    }

    public void setUnitType(Object unitType) {
        mUnitType = unitType;
    }

}
