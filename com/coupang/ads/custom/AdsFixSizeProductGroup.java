package com.coupang.ads.custom;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class AdsFixSizeProductGroup implements AdsProductGroup {
    @l
    private final AdsProductLayout[] adsProductLayouts;
    @m
    private BinderCallback binderCallback;

    public AdsFixSizeProductGroup(@l AdsProductLayout[] arr_adsProductLayout) {
        L.p(arr_adsProductLayout, "adsProductLayouts");
        super();
        this.adsProductLayouts = arr_adsProductLayout;
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    @l
    public AdsProductLayout getFocusProductLayout() {
        return this.adsProductLayouts[0];
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    public void onAdLoaded(int v) {
        int v1 = this.adsProductLayouts.length - 1;
        if(v1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                if(v2 < v) {
                    BinderCallback adsProductGroup$BinderCallback0 = this.binderCallback;
                    if(adsProductGroup$BinderCallback0 != null) {
                        adsProductGroup$BinderCallback0.onBind(v2, this.adsProductLayouts[v2]);
                    }
                }
                else {
                    this.adsProductLayouts[v2].hide();
                }
                if(v2 + 1 > v1) {
                    break;
                }
            }
        }
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    public void setCallback(@m BinderCallback adsProductGroup$BinderCallback0) {
        this.binderCallback = adsProductGroup$BinderCallback0;
        AdsProductLayout[] arr_adsProductLayout = this.adsProductLayouts;
        for(int v = 0; v < arr_adsProductLayout.length; ++v) {
            AdsProductLayout adsProductLayout0 = arr_adsProductLayout[v];
            if(adsProductGroup$BinderCallback0 != null) {
                adsProductGroup$BinderCallback0.onProductLayoutCreated(adsProductLayout0);
            }
        }
    }
}

