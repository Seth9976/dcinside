package com.coupang.ads.custom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import com.bumptech.glide.c;
import com.bumptech.glide.n;
import com.coupang.ads.R.drawable;
import com.coupang.ads.R.style;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.tools.g;
import com.coupang.ads.tools.h;
import com.coupang.ads.view.image.RoundImageView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsProductMainImage extends RoundImageView implements View.OnClickListener, AdsWidgetProduct {
    @m
    private AdsProductWidgetModel adsProductWidgetModel;

    @j
    public AdsProductMainImage(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsProductMainImage(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0, 0, style.AdsMainImageView);
    }

    public AdsProductMainImage(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    @Override  // com.coupang.ads.view.image.RoundImageView
    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    @m
    public AdsProductWidgetModel getAdsProductWidgetModel() {
        return this.adsProductWidgetModel;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@m View view0) {
        AdsProductWidgetModel adsProductWidgetModel0 = this.getAdsProductWidgetModel();
        if(adsProductWidgetModel0 != null) {
            AdsProduct adsProduct0 = adsProductWidgetModel0.getProduct();
            if(adsProduct0 != null) {
                Context context0 = this.getContext();
                L.o(context0, "context");
                h.a(adsProduct0, context0);
            }
        }
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    public void setAdsProductWidgetModel(@m AdsProductWidgetModel adsProductWidgetModel0) {
        this.adsProductWidgetModel = adsProductWidgetModel0;
        if(adsProductWidgetModel0 != null) {
            AdsProduct adsProduct0 = adsProductWidgetModel0.getProduct();
            if(adsProduct0 != null) {
                String s = adsProduct0.getImageMainPath();
                if(s != null) {
                    n n0 = c.F(this.getContext());
                    L.o(n0, "with(context)");
                    ((com.bumptech.glide.m)g.a(n0, s, this).x0(drawable.ic_ads_placeholder_loading)).q1(this);
                }
            }
        }
        if(adsProductWidgetModel0 != null) {
            AdsProduct adsProduct1 = adsProductWidgetModel0.getProduct();
            if(adsProduct1 != null) {
                h.f(adsProduct1);
            }
        }
        this.setOnClickListener(this);
    }
}

