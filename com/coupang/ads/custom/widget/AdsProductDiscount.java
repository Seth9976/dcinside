package com.coupang.ads.custom.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.coupang.ads.R.style;
import com.coupang.ads.tools.i;
import com.coupang.ads.tools.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@SuppressLint({"AppCompatCustomView"})
public final class AdsProductDiscount extends TextView implements AdsWidgetProduct {
    @m
    private AdsProductWidgetModel adsProductWidgetModel;

    @j
    public AdsProductDiscount(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsProductDiscount(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0, 0, style.AdsDiscountTextView);
    }

    public AdsProductDiscount(Context context0, AttributeSet attributeSet0, int v, w w0) {
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
        CharSequence charSequence0 = null;
        if(adsProductWidgetModel0 != null) {
            Integer integer0 = adsProductWidgetModel0.getDiscount();
            if(integer0 != null) {
                Context context0 = this.getContext();
                L.o(context0, "context");
                charSequence0 = i.b(integer0, context0);
            }
        }
        q.a(this, charSequence0);
    }
}

