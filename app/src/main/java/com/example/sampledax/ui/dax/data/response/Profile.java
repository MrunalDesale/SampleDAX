
package com.example.sampledax.ui.dax.data.response;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Profile {

    @SerializedName("ignoreIfUnknown")
    private Boolean mIgnoreIfUnknown;
    @SerializedName("type")
    private String mType;
    @SerializedName("value")
    private String mValue;

    public Boolean getIgnoreIfUnknown() {
        return mIgnoreIfUnknown;
    }

    public void setIgnoreIfUnknown(Boolean ignoreIfUnknown) {
        mIgnoreIfUnknown = ignoreIfUnknown;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
