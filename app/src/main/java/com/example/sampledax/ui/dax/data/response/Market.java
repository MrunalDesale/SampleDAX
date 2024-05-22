
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Market {

    @SerializedName("codeExchange")
    private String mCodeExchange;
    @SerializedName("codeMarket")
    private String mCodeMarket;
    @SerializedName("idNotation")
    private Long mIdNotation;
    @SerializedName("isoCountry")
    private String mIsoCountry;
    @SerializedName("name")
    private String mName;
    @SerializedName("nameExchange")
    private String mNameExchange;

    public String getCodeExchange() {
        return mCodeExchange;
    }

    public void setCodeExchange(String codeExchange) {
        mCodeExchange = codeExchange;
    }

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

    public String getIsoCountry() {
        return mIsoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        mIsoCountry = isoCountry;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNameExchange() {
        return mNameExchange;
    }

    public void setNameExchange(String nameExchange) {
        mNameExchange = nameExchange;
    }

}
