
package com.example.sampledax.ui.dax.data.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class IndicesTopFlopEntityList {

    @SerializedName("expires")
    private Long mExpires;
    @SerializedName("flopList")
    private List<FlopList> mFlopList;
    @SerializedName("numberEqual")
    private Long mNumberEqual;
    @SerializedName("numberFlop")
    private Long mNumberFlop;
    @SerializedName("numberTop")
    private Long mNumberTop;
    @SerializedName("topList")
    private List<TopList> mTopList;
    @SerializedName("total")
    private Long mTotal;

    public Long getExpires() {
        return mExpires;
    }

    public void setExpires(Long expires) {
        mExpires = expires;
    }

    public List<FlopList> getFlopList() {
        return mFlopList;
    }

    public void setFlopList(List<FlopList> flopList) {
        mFlopList = flopList;
    }

    public Long getNumberEqual() {
        return mNumberEqual;
    }

    public void setNumberEqual(Long numberEqual) {
        mNumberEqual = numberEqual;
    }

    public Long getNumberFlop() {
        return mNumberFlop;
    }

    public void setNumberFlop(Long numberFlop) {
        mNumberFlop = numberFlop;
    }

    public Long getNumberTop() {
        return mNumberTop;
    }

    public void setNumberTop(Long numberTop) {
        mNumberTop = numberTop;
    }

    public List<TopList> getTopList() {
        return mTopList;
    }

    public void setTopList(List<TopList> topList) {
        mTopList = topList;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}
