package com.coupang.ads.custom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.coupang.ads.custom.AdsNativeView;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.b;
import com.coupang.ads.tools.p;
import com.coupang.ads.tools.q;
import java.util.LinkedList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class AdsCustomWidgetView extends AdsNativeView {
    @l
    private final LinkedList adsWidgetPlacementList;
    @l
    private final LinkedList adsWidgetProductList;

    @j
    public AdsCustomWidgetView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsCustomWidgetView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsCustomWidgetView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.adsWidgetPlacementList = new LinkedList();
        this.adsWidgetProductList = new LinkedList();
    }

    public AdsCustomWidgetView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.coupang.ads.custom.AdsNativeView
    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.AdsNativeView
    public void onBindProductPage(@m AdsProductPage adsProductPage0) {
        for(Object object0: this.adsWidgetPlacementList) {
            ((AdsWidgetPlacement)object0).setAdsProductPage(adsProductPage0);
        }
        if(!this.adsWidgetProductList.isEmpty() && adsProductPage0 != null) {
            AdsProduct adsProduct0 = b.a(adsProductPage0);
            if(adsProduct0 != null) {
                AdsProductWidgetModel adsProductWidgetModel0 = new AdsProductWidgetModel(adsProduct0);
                for(Object object1: this.adsWidgetProductList) {
                    ((AdsWidgetProduct)object1).setAdsProductWidgetModel(adsProductWidgetModel0);
                }
            }
        }
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.adsWidgetPlacementList.clear();
        this.adsWidgetProductList.clear();
        q.f(this, false, new Function1() {
            {
                AdsCustomWidgetView.this = adsCustomWidgetView0;
                super(1);
            }

            @l
            public final p invoke(@l View view0) {
                L.p(view0, "v");
                if(view0 instanceof AdsWidgetPlacement) {
                    AdsCustomWidgetView.this.adsWidgetPlacementList.add(view0);
                    return p.c;
                }
                if(view0 instanceof AdsWidgetProduct) {
                    AdsCustomWidgetView.this.adsWidgetProductList.add(view0);
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
}

