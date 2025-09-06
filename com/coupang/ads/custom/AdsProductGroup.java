package com.coupang.ads.custom;

import y4.l;
import y4.m;

public interface AdsProductGroup {
    public interface BinderCallback {
        void onBind(int arg1, @l AdsProductLayout arg2);

        void onProductLayoutCreated(@l AdsProductLayout arg1);
    }

    @m
    AdsProductLayout getFocusProductLayout();

    void onAdLoaded(int arg1);

    void setCallback(@m BinderCallback arg1);
}

