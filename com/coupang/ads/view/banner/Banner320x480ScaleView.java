package com.coupang.ads.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.coupang.ads.R.drawable;
import com.coupang.ads.R.id;
import com.coupang.ads.R.layout;
import com.coupang.ads.tools.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class Banner320x480ScaleView extends BaseBannerView {
    @l
    private final View e;
    private final float f;
    private final float g;
    @m
    private final View h;

    @j
    public Banner320x480ScaleView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public Banner320x480ScaleView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public Banner320x480ScaleView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.f = (float)d.b(context0, 320);
        this.g = (float)d.b(context0, 480);
        this.setId(id.ads_banner_background);
        View.inflate(context0, layout.ads_view_banner_320x480, this);
        View view0 = this.findViewById(id.ads_scale_container);
        L.o(view0, "findViewById(R.id.ads_scale_container)");
        this.e = view0;
        this.setBackgroundResource(drawable.bg_ads_rectangle_stroke);
        View view1 = this.findViewById(id.ads_placement_opt_out);
        if(!(view1 instanceof View)) {
            view1 = null;
        }
        this.h = view1;
    }

    public Banner320x480ScaleView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.coupang.ads.view.banner.BaseBannerView
    public void _$_clearFindViewByIdCache() {
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        float f = ((float)v) / ((float)v1) > this.f / this.g ? ((float)v1) / this.g : ((float)v) / this.f;
        this.e.setScaleX(f);
        this.e.setScaleY(f);
        View view0 = this.h;
        if(view0 != null) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            Float float0 = viewGroup$LayoutParams0 == null ? null : ((float)viewGroup$LayoutParams0.width);
            view0.setPivotX((float0 == null ? view0.getPivotX() : ((float)float0)));
            view0.setPivotY(0.0f);
            view0.setScaleX(f);
            view0.setScaleY(f);
        }
    }
}

