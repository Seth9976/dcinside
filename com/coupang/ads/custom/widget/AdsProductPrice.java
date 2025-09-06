package com.coupang.ads.custom.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.coupang.ads.R.style;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.tools.i;
import com.coupang.ads.tools.q;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@SuppressLint({"AppCompatCustomView"})
public final class AdsProductPrice extends TextView implements AdsWidgetProduct {
    @m
    private AdsProductWidgetModel adsProductWidgetModel;

    @j
    public AdsProductPrice(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsProductPrice(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0, 0, style.AdsPriceTextView);
    }

    public AdsProductPrice(Context context0, AttributeSet attributeSet0, int v, w w0) {
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
        String s;
        this.adsProductWidgetModel = adsProductWidgetModel0;
        S0 s00 = null;
        if(adsProductWidgetModel0 == null) {
            s = null;
        }
        else {
            AdsProduct adsProduct0 = adsProductWidgetModel0.getProduct();
            s = adsProduct0 == null ? null : adsProduct0.getPrice();
        }
        Context context0 = this.getContext();
        L.o(context0, "context");
        String s1 = i.a(s, context0);
        if(s1 != null) {
            q.a(this, s1);
            q.h(this);
            s00 = S0.a;
        }
        if(s00 == null) {
            q.b(this);
        }
    }
}

