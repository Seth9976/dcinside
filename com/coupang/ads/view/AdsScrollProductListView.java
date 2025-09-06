package com.coupang.ads.view;

import J.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.coupang.ads.R.id;
import com.coupang.ads.R.layout;
import com.coupang.ads.custom.AdsProductGroup;
import com.coupang.ads.custom.AdsSingleProductGroup;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsScrollProductListView extends ScrollView implements h {
    private int a;
    private LinearLayout b;
    @l
    private final AdsSingleProductGroup c;

    @j
    public AdsScrollProductListView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsScrollProductListView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsScrollProductListView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = 1;
        View.inflate(context0, layout.ads_view_scroll_product_list, this);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, new int[]{0x10100C4});
        L.o(typedArray0, "context.obtainStyledAttr…roid.R.attr.orientation))");
        this.a = typedArray0.getInt(0, this.a);
        typedArray0.recycle();
        this.b = (LinearLayout)this.findViewById(id.ads_product_container);
        View view0 = View.inflate(context0, (this.a == 1 ? layout.ads_view_interstitial_item_linear_vertical : layout.ads_view_interstitial_item_linear_horizontal), null);
        this.b.addView(view0);
        L.o(view0, "inflate(\n               …addView(it)\n            }");
        this.c = new AdsSingleProductGroup(new b(view0).b());
    }

    public AdsScrollProductListView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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

