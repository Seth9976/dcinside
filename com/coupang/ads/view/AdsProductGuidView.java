package com.coupang.ads.view;

import J.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.coupang.ads.R.id;
import com.coupang.ads.R.layout;
import com.coupang.ads.custom.AdsFixSizeProductGroup;
import com.coupang.ads.custom.AdsProductGroup;
import com.coupang.ads.custom.AdsProductLayout;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsProductGuidView extends FrameLayout implements h {
    private int a;
    @l
    private final D b;
    @l
    private final AdsFixSizeProductGroup c;

    @j
    public AdsProductGuidView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsProductGuidView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsProductGuidView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class a extends N implements A3.a {
            final AdsProductGuidView e;

            a(AdsProductGuidView adsProductGuidView0) {
                this.e = adsProductGuidView0;
                super(0);
            }

            @l
            public final AdsProductLayout[] b() {
                View view0 = this.e.findViewById(id.ads_view_interstitial_item_0);
                L.o(view0, "findViewById(R.id.ads_view_interstitial_item_0)");
                AdsProductLayout adsProductLayout0 = new b(view0).b();
                View view1 = this.e.findViewById(id.ads_view_interstitial_item_1);
                L.o(view1, "findViewById(R.id.ads_view_interstitial_item_1)");
                AdsProductLayout adsProductLayout1 = new b(view1).b();
                View view2 = this.e.findViewById(id.ads_view_interstitial_item_2);
                L.o(view2, "findViewById(R.id.ads_view_interstitial_item_2)");
                AdsProductLayout adsProductLayout2 = new b(view2).b();
                View view3 = this.e.findViewById(id.ads_view_interstitial_item_3);
                L.o(view3, "findViewById(R.id.ads_view_interstitial_item_3)");
                return new AdsProductLayout[]{adsProductLayout0, adsProductLayout1, adsProductLayout2, new b(view3).b()};
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = 1;
        this.b = E.a(new a(this));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x10100C4});
        L.o(typedArray0, "context.obtainStyledAttr…roid.R.attr.orientation))");
        this.a = typedArray0.getInt(0, this.a);
        typedArray0.recycle();
        View.inflate(context0, (this.a == 1 ? layout.ads_view_interstitial_grid_content_vertical : layout.ads_view_interstitial_grid_content_horizontal), this);
        this.c = new AdsFixSizeProductGroup(this.getItems());
    }

    public AdsProductGuidView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void a() {
    }

    private final AdsProductLayout[] getItems() {
        return (AdsProductLayout[])this.b.getValue();
    }

    public final int getOrientation() {
        return this.a;
    }

    @Override  // J.h
    @l
    public AdsProductGroup getProductsGroup() {
        return this.c;
    }

    public final void setOrientation(int v) {
        this.a = v;
    }
}

