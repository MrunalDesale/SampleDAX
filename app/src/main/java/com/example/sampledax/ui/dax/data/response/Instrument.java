
package com.example.sampledax.ui.dax.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Instrument {

    @SerializedName("displayType")
    private String mDisplayType;
    @SerializedName("entityAttributes")
    private List<String> mEntityAttributes;
    @SerializedName("entityType")
    private String mEntityType;
    @SerializedName("entityValue")
    private String mEntityValue;
    @SerializedName("homeSymbol")
    private String mHomeSymbol;
    @SerializedName("instrumentType")
    private String mInstrumentType;
    @SerializedName("isin")
    private String mIsin;
    @SerializedName("name")
    private String mName;
    @SerializedName("symbol")
    private String mSymbol;
    @SerializedName("tinyName")
    private String mTinyName;
    @SerializedName("type")
    private String mType;
    @SerializedName("underlyingEntity")
    private UnderlyingEntity mUnderlyingEntity;
    @SerializedName("urlName")
    private String mUrlName;
    @SerializedName("urls")
    private Urls mUrls;
    @SerializedName("wkn")
    private String mWkn;

    public String getDisplayType() {
        return mDisplayType;
    }

    public void setDisplayType(String displayType) {
        mDisplayType = displayType;
    }

    public List<String> getEntityAttributes() {
        return mEntityAttributes;
    }

    public void setEntityAttributes(List<String> entityAttributes) {
        mEntityAttributes = entityAttributes;
    }

    public String getEntityType() {
        return mEntityType;
    }

    public void setEntityType(String entityType) {
        mEntityType = entityType;
    }

    public String getEntityValue() {
        return mEntityValue;
    }

    public void setEntityValue(String entityValue) {
        mEntityValue = entityValue;
    }

    public String getHomeSymbol() {
        return mHomeSymbol;
    }

    public void setHomeSymbol(String homeSymbol) {
        mHomeSymbol = homeSymbol;
    }

    public String getInstrumentType() {
        return mInstrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        mInstrumentType = instrumentType;
    }

    public String getIsin() {
        return mIsin;
    }

    public void setIsin(String isin) {
        mIsin = isin;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSymbol() {
        return mSymbol;
    }

    public void setSymbol(String symbol) {
        mSymbol = symbol;
    }

    public String getTinyName() {
        return mTinyName;
    }

    public void setTinyName(String tinyName) {
        mTinyName = tinyName;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public UnderlyingEntity getUnderlyingEntity() {
        return mUnderlyingEntity;
    }

    public void setUnderlyingEntity(UnderlyingEntity underlyingEntity) {
        mUnderlyingEntity = underlyingEntity;
    }

    public String getUrlName() {
        return mUrlName;
    }

    public void setUrlName(String urlName) {
        mUrlName = urlName;
    }

    public Urls getUrls() {
        return mUrls;
    }

    public void setUrls(Urls urls) {
        mUrls = urls;
    }

    public String getWkn() {
        return mWkn;
    }

    public void setWkn(String wkn) {
        mWkn = wkn;
    }

}
