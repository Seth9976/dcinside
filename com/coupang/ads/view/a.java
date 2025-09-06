package com.coupang.ads.view;

import J.h;
import J.i;
import android.view.View;
import android.widget.ImageView;
import com.coupang.ads.R.id;
import com.coupang.ads.custom.AdsPlacementLayout.Builder;
import com.coupang.ads.custom.AdsPlacementLayout;
import com.coupang.ads.custom.AdsProductGroup;
import com.coupang.ads.dto.AdsProductPage;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class a {
    public static final class com.coupang.ads.view.a.a {
        private com.coupang.ads.view.a.a() {
        }

        public com.coupang.ads.view.a.a(w w0) {
        }
    }

    @l
    private final View a;
    @m
    private final ImageView b;
    @m
    private final View c;
    @m
    private final View d;
    @m
    private final ImageView e;
    @m
    private final h f;
    @m
    private final View g;
    @l
    private final AdsPlacementLayout h;
    @m
    private AdsProductPage i;
    @m
    private i j;
    @l
    public static final com.coupang.ads.view.a.a k = null;
    @l
    public static final String l = "AdsPlacementViewHolder";

    static {
        a.k = new com.coupang.ads.view.a.a(null);
    }

    public a(@l View view0) {
        L.p(view0, "rootView");
        super();
        this.a = view0;
        View view1 = view0.findViewById(id.ads_placement_opt_out);
        AdsProductGroup adsProductGroup0 = null;
        ImageView imageView0 = view1 instanceof ImageView ? ((ImageView)view1) : null;
        this.b = imageView0;
        View view2 = view0.findViewById(id.ads_placement_close);
        if(!(view2 instanceof View)) {
            view2 = null;
        }
        this.c = view2;
        View view3 = view0.findViewById(id.ads_placement_positive);
        if(!(view3 instanceof View)) {
            view3 = null;
        }
        this.d = view3;
        View view4 = view0.findViewById(id.ads_placement_logo);
        ImageView imageView1 = view4 instanceof ImageView ? ((ImageView)view4) : null;
        this.e = imageView1;
        View view5 = view0.findViewById(id.ads_placement_content);
        h h0 = view5 instanceof h ? ((h)view5) : null;
        this.f = h0;
        View view6 = view0.findViewById(id.ads_placement_ad);
        if(!(view6 instanceof View)) {
            view6 = null;
        }
        this.g = view6;
        Builder adsPlacementLayout$Builder0 = new Builder().setCloseView$ads_release(view2).setLogoView(imageView1).setPositiveView$ads_release(view3).setAdsInfoView(imageView0).setCallToActionView((h0 instanceof View ? ((View)h0) : null));
        if(h0 != null) {
            adsProductGroup0 = h0.getProductsGroup();
        }
        this.h = adsPlacementLayout$Builder0.setProductsGroup(adsProductGroup0).build();
    }

    @m
    public final View a() {
        return this.g;
    }

    @l
    public final AdsPlacementLayout b() {
        return this.h;
    }

    @m
    public final AdsProductPage c() {
        return this.i;
    }

    @m
    public final View d() {
        return this.c;
    }

    @m
    public final ImageView e() {
        return this.e;
    }

    @m
    public final i f() {
        return this.j;
    }

    @m
    public final ImageView g() {
        return this.b;
    }

    @m
    public final View h() {
        return this.d;
    }

    @m
    public final h i() {
        return this.f;
    }

    @l
    public final View j() {
        return this.a;
    }

    public final void k(@m AdsProductPage adsProductPage0) {
        this.i = adsProductPage0;
        this.h.setAdsProductPage(adsProductPage0);
    }

    public final void l(@m i i0) {
        this.j = i0;
        this.h.setOnAdsClickListener(i0);
    }
}

