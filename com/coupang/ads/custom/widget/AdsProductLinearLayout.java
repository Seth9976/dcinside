package com.coupang.ads.custom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.coupang.ads.tools.p;
import com.coupang.ads.tools.q;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsProductLinearLayout extends LinearLayout implements AdsWidgetProduct {
    @m
    private AdsProductWidgetModel adsProductWidgetModel;
    @l
    private final LinkedList products;

    @j
    public AdsProductLinearLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsProductLinearLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsProductLinearLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.products = new LinkedList();
    }

    public AdsProductLinearLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    @m
    public AdsProductWidgetModel getAdsProductWidgetModel() {
        return this.adsProductWidgetModel;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.products.clear();
        q.f(this, false, new Function1() {
            {
                AdsProductLinearLayout.this = adsProductLinearLayout0;
                super(1);
            }

            @l
            public final p invoke(@l View view0) {
                L.p(view0, "v");
                if(view0 instanceof AdsWidgetProduct) {
                    AdsProductLinearLayout.this.products.add(view0);
                    return p.c;
                }
                return p.a;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((View)object0));
            }
        });
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetProduct
    public void setAdsProductWidgetModel(@m AdsProductWidgetModel adsProductWidgetModel0) {
        this.adsProductWidgetModel = adsProductWidgetModel0;
        for(Object object0: this.products) {
            ((AdsWidgetProduct)object0).setAdsProductWidgetModel(this.getAdsProductWidgetModel());
        }
    }
}

