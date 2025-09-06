package com.coupang.ads.custom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.b;
import com.coupang.ads.tools.h;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsWidgetCallToAction extends FrameLayout implements View.OnClickListener, AdsWidgetPlacement, AdsWidgetProduct {
    @m
    private AdsProductPage adsProductPage;
    @m
    private AdsProductWidgetModel adsProductWidgetModel;

    @j
    public AdsWidgetCallToAction(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsWidgetCallToAction(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
    }

    public AdsWidgetCallToAction(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    @m
    public AdsProductPage getAdsProductPage() {
        return this.adsProductPage;
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    @m
    public AdsProductWidgetModel getAdsProductWidgetModel() {
        return this.adsProductWidgetModel;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@m View view0) {
        AdsProductWidgetModel adsProductWidgetModel0 = this.getAdsProductWidgetModel();
        S0 s00 = null;
        if(adsProductWidgetModel0 != null) {
            AdsProduct adsProduct0 = adsProductWidgetModel0.getProduct();
            if(adsProduct0 != null) {
                Context context0 = this.getContext();
                L.o(context0, "context");
                h.a(adsProduct0, context0);
                s00 = S0.a;
            }
        }
        if(s00 == null) {
            AdsProduct adsProduct1 = b.a(this.getAdsProductPage());
            if(adsProduct1 != null) {
                Context context1 = this.getContext();
                L.o(context1, "context");
                h.a(adsProduct1, context1);
            }
        }
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int v = this.getChildCount();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                this.getChildAt(v1).setOnClickListener(this);
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    public void setAdsProductPage(@m AdsProductPage adsProductPage0) {
        this.adsProductPage = adsProductPage0;
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    public void setAdsProductWidgetModel(@m AdsProductWidgetModel adsProductWidgetModel0) {
        this.adsProductWidgetModel = adsProductWidgetModel0;
        this.setOnClickListener(this);
    }
}

