package com.coupang.ads.custom.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.coupang.ads.R.style;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.tools.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@SuppressLint({"AppCompatCustomView"})
public final class AdsProductFree extends TextView implements AdsWidgetProduct {
    @m
    private AdsProductWidgetModel adsProductWidgetModel;

    @j
    public AdsProductFree(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsProductFree(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0, 0, style.AdsFreeTextView);
    }

    public AdsProductFree(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    @m
    public AdsProductWidgetModel getAdsProductWidgetModel() {
        return this.adsProductWidgetModel;
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    public void setAdsProductWidgetModel(@m AdsProductWidgetModel adsProductWidgetModel0) {
        this.adsProductWidgetModel = adsProductWidgetModel0;
        String s = null;
        if(adsProductWidgetModel0 != null) {
            AdsProduct adsProduct0 = adsProductWidgetModel0.getProduct();
            if(adsProduct0 != null) {
                s = adsProduct0.getRocketBadge();
            }
        }
        if((L.g(s, "CONDITIONAL_FREE") ? true : L.g(s, "FREE"))) {
            q.h(this);
            return;
        }
        q.b(this);
    }
}

