
package com.example.sampledax.ui.dax.data.response;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Urls {

    @SerializedName("DERIVATIVES_FINDER")
    private String mDERIVATIVESFINDER;
    @SerializedName("ETF_FINDER")
    private String mETFFINDER;
    @SerializedName("NEWS")
    private String mNEWS;
    @SerializedName("WEBSITE")
    private String mWEBSITE;

    public String getDERIVATIVESFINDER() {
        return mDERIVATIVESFINDER;
    }

    public void setDERIVATIVESFINDER(String dERIVATIVESFINDER) {
        mDERIVATIVESFINDER = dERIVATIVESFINDER;
    }

    public String getETFFINDER() {
        return mETFFINDER;
    }

    public void setETFFINDER(String eTFFINDER) {
        mETFFINDER = eTFFINDER;
    }

    public String getNEWS() {
        return mNEWS;
    }

    public void setNEWS(String nEWS) {
        mNEWS = nEWS;
    }

    public String getWEBSITE() {
        return mWEBSITE;
    }

    public void setWEBSITE(String wEBSITE) {
        mWEBSITE = wEBSITE;
    }

}
