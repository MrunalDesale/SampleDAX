
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Keywords {

    @SerializedName("entityType")
    private String mEntityType;
    @SerializedName("entityValue")
    private String mEntityValue;
    @SerializedName("idFamily")
    private String mIdFamily;
    @SerializedName("isin")
    private String mIsin;
    @SerializedName("wkn")
    private String mWkn;

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

    public String getIdFamily() {
        return mIdFamily;
    }

    public void setIdFamily(String idFamily) {
        mIdFamily = idFamily;
    }

    public String getIsin() {
        return mIsin;
    }

    public void setIsin(String isin) {
        mIsin = isin;
    }

    public String getWkn() {
        return mWkn;
    }

    public void setWkn(String wkn) {
        mWkn = wkn;
    }

}
