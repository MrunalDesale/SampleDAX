
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class UnderlyingEntity {

    @SerializedName("name")
    private String mName;
    @SerializedName("type")
    private String mType;
    @SerializedName("urlName")
    private String mUrlName;
    @SerializedName("value")
    private String mValue;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUrlName() {
        return mUrlName;
    }

    public void setUrlName(String urlName) {
        mUrlName = urlName;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
