package com.coupang.ads.custom;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class AdsSingleProductGroup implements AdsProductGroup {
    @l
    private final AdsProductLayout adsProductLayout;
    @m
    private BinderCallback binderCallback;

    public AdsSingleProductGroup(@l AdsProductLayout adsProductLayout0) {
        L.p(adsProductLayout0, "adsProductLayout");
        super();
        this.adsProductLayout = adsProductLayout0;
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    @l
    public AdsProductLayout getFocusProductLayout() {
        return this.adsProductLayout;
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    public void onAdLoaded(int v) {
        if(v > 0) {
            BinderCallback adsProductGroup$BinderCallback0 = this.binderCallback;
            if(adsProductGroup$BinderCallback0 != null) {
                adsProductGroup$BinderCallback0.onBind(0, this.adsProductLayout);
            }
        }
    }

    @Override  // com.coupang.ads.custom.AdsProductGroup
    public void setCallback(@m BinderCallback adsProductGroup$BinderCallback0) {
        this.binderCallback = adsProductGroup$BinderCallback0;
        if(adsProductGroup$BinderCallback0 != null) {
            adsProductGroup$BinderCallback0.onProductLayoutCreated(this.adsProductLayout);
        }
    }
}

