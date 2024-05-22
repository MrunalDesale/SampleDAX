
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class InstrumentSnapshotGenericData {

    @SerializedName("codeEntityCategory")
    private String mCodeEntityCategory;
    @SerializedName("entityCategory")
    private String mEntityCategory;
    @SerializedName("seoDescription")
    private String mSeoDescription;

    public String getCodeEntityCategory() {
        return mCodeEntityCategory;
    }

    public void setCodeEntityCategory(String codeEntityCategory) {
        mCodeEntityCategory = codeEntityCategory;
    }

    public String getEntityCategory() {
        return mEntityCategory;
    }

    public void setEntityCategory(String entityCategory) {
        mEntityCategory = entityCategory;
    }

    public String getSeoDescription() {
        return mSeoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        mSeoDescription = seoDescription;
    }

}
