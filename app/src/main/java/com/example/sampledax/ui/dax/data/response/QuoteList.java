
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class QuoteList {

    @SerializedName("expires")
    private Long mExpires;
    @SerializedName("list")
    private java.util.List<List> mList;

    public Long getExpires() {
        return mExpires;
    }

    public void setExpires(Long expires) {
        mExpires = expires;
    }

    public java.util.List<List> getList() {
        return mList;
    }

    public void setList(java.util.List<List> list) {
        mList = list;
    }

}
