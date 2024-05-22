
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class TopList {

    @SerializedName("cnDivYield")
    private Double mCnDivYield;
    @SerializedName("cnPeg")
    private Double mCnPeg;
    @SerializedName("cnPer")
    private Double mCnPer;
    @SerializedName("datetimeLast")
    private String mDatetimeLast;
    @SerializedName("idNotation")
    private Long mIdNotation;
    @SerializedName("instrument")
    private Instrument mInstrument;
    @SerializedName("isoCurrency")
    private String mIsoCurrency;
    @SerializedName("last")
    private Double mLast;
    @SerializedName("money")
    private Double mMoney;
    @SerializedName("performance")
    private Double mPerformance;
    @SerializedName("performancePct")
    private Double mPerformancePct;
    @SerializedName("volume")
    private Double mVolume;

    public Double getCnDivYield() {
        return mCnDivYield;
    }

    public void setCnDivYield(Double cnDivYield) {
        mCnDivYield = cnDivYield;
    }

    public Double getCnPeg() {
        return mCnPeg;
    }

    public void setCnPeg(Double cnPeg) {
        mCnPeg = cnPeg;
    }

    public Double getCnPer() {
        return mCnPer;
    }

    public void setCnPer(Double cnPer) {
        mCnPer = cnPer;
    }

    public String getDatetimeLast() {
        return mDatetimeLast;
    }

    public void setDatetimeLast(String datetimeLast) {
        mDatetimeLast = datetimeLast;
    }

    public Long getIdNotation() {
        return mIdNotation;
    }

    public void setIdNotation(Long idNotation) {
        mIdNotation = idNotation;
    }

    public Instrument getInstrument() {
        return mInstrument;
    }

    public void setInstrument(Instrument instrument) {
        mInstrument = instrument;
    }

    public String getIsoCurrency() {
        return mIsoCurrency;
    }

    public void setIsoCurrency(String isoCurrency) {
        mIsoCurrency = isoCurrency;
    }

    public Double getLast() {
        return mLast;
    }

    public void setLast(Double last) {
        mLast = last;
    }

    public Double getMoney() {
        return mMoney;
    }

    public void setMoney(Double money) {
        mMoney = money;
    }

    public Double getPerformance() {
        return mPerformance;
    }

    public void setPerformance(Double performance) {
        mPerformance = performance;
    }

    public Double getPerformancePct() {
        return mPerformancePct;
    }

    public void setPerformancePct(Double performancePct) {
        mPerformancePct = performancePct;
    }

    public Double getVolume() {
        return mVolume;
    }

    public void setVolume(Double volume) {
        mVolume = volume;
    }

}
