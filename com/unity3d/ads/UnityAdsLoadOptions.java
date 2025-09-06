package com.unity3d.ads;

public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP;

    public UnityAdsLoadOptions() {
        this.AD_MARKUP = "adMarkup";
    }

    public void setAdMarkup(String s) {
        this.set(this.AD_MARKUP, s);
    }
}

