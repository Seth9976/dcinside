package com.coupang.ads.custom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.tools.p;
import com.coupang.ads.tools.q;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsPlacementConstraintLayout extends ConstraintLayout implements AdsWidgetPlacement {
    @m
    private AdsProductPage adsProductPage;
    @l
    private final LinkedList placements;
    @l
    private final LinkedList products;

    @j
    public AdsPlacementConstraintLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsPlacementConstraintLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsPlacementConstraintLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.products = new LinkedList();
        this.placements = new LinkedList();
    }

    public AdsPlacementConstraintLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    @m
    public AdsProductPage getAdsProductPage() {
        return this.adsProductPage;
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.products.clear();
        this.placements.clear();
        q.f(this, false, new Function1() {
            {
                AdsPlacementConstraintLayout.this = adsPlacementConstraintLayout0;
                super(1);
            }

            @l
            public final p invoke(@l View view0) {
                L.p(view0, "v");
                if(view0 instanceof AdsWidgetProduct) {
                    AdsPlacementConstraintLayout.this.products.add(view0);
                    return p.c;
                }
                if(view0 instanceof AdsWidgetPlacement) {
                    AdsPlacementConstraintLayout.this.placements.add(view0);
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

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    public void setAdsProductPage(@m AdsProductPage adsProductPage0) {
        this.adsProductPage = adsProductPage0;
        int v = 0;
        for(Object object0: this.products) {
            AdsProductWidgetModel adsProductWidgetModel0 = null;
            if(adsProductPage0 != null) {
                ArrayList arrayList0 = adsProductPage0.getAdsProductList();
                if(arrayList0 != null) {
                    AdsProduct adsProduct0 = (AdsProduct)u.W2(arrayList0, v);
                    if(adsProduct0 != null) {
                        adsProductWidgetModel0 = new AdsProductWidgetModel(adsProduct0);
                    }
                    ++v;
                }
            }
            ((AdsWidgetProduct)object0).setAdsProductWidgetModel(adsProductWidgetModel0);
        }
    }
}

