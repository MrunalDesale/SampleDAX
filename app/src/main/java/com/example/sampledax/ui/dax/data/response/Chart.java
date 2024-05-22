
package com.example.sampledax.ui.dax.data.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Chart {

    @SerializedName("codeMarket")
    private String mCodeMarket;
    @SerializedName("idNotation")
    private Long mIdNotation;
    @SerializedName("isoCurrency")
    private String mIsoCurrency;
    @SerializedName("ranges")
    private List<String> mRanges;
    @SerializedName("selectedRange")
    private String mSelectedRange;

    public String getCodeMarket() {
        return mCodeMarket;
    }

    public void setCodeMarket(String codeMarket) {
        mCodeMarket = codeMarket;
    }

    public Long getIdNotation() {
        return mIdNotation;
    }

    public void setIdNotation(Long idNotation) {
        mIdNotation = idNotation;
    }

    public String getIsoCurrency() {
        return mIsoCurrency;
    }

    public void setIsoCurrency(String isoCurrency) {
        mIsoCurrency = isoCurrency;
    }

    public List<String> getRanges() {
        return mRanges;
    }

    public void setRanges(List<String> ranges) {
        mRanges = ranges;
    }

    public String getSelectedRange() {
        return mSelectedRange;
    }

    public void setSelectedRange(String selectedRange) {
        mSelectedRange = selectedRange;
    }

}
