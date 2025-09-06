package com.coupang.ads.custom.widget;

import com.coupang.ads.dto.AdsProductPage;
import y4.m;

public interface AdsWidgetPlacement extends AdsWidget {
    @m
    AdsProductPage getAdsProductPage();

    void setAdsProductPage(@m AdsProductPage arg1);
}

