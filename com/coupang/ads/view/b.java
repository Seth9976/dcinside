package com.coupang.ads.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.coupang.ads.R.id;
import com.coupang.ads.custom.AdsProductLayout.Builder;
import com.coupang.ads.custom.AdsProductLayout;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.view.rating.StarRating;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class b {
    @m
    private final View a;
    @m
    private final ImageView b;
    @m
    private final TextView c;
    @m
    private final TextView d;
    @m
    private final StarRating e;
    @m
    private final ImageView f;
    @m
    private final TextView g;
    @m
    private final TextView h;
    @m
    private final TextView i;
    @m
    private final TextView j;
    @m
    private final TextView k;
    @m
    private final View l;
    @l
    private final AdsProductLayout m;
    @m
    private AdsProduct n;

    public b(@l View view0) {
        L.p(view0, "rootView");
        super();
        View view1 = view0.findViewById(id.ads_banner_background);
        View view2 = null;
        if(!(view1 instanceof View)) {
            view1 = null;
        }
        this.a = view1;
        View view3 = view0.findViewById(id.ads_product_img);
        ImageView imageView0 = view3 instanceof ImageView ? ((ImageView)view3) : null;
        this.b = imageView0;
        View view4 = view0.findViewById(id.ads_product_title);
        TextView textView0 = view4 instanceof TextView ? ((TextView)view4) : null;
        this.c = textView0;
        View view5 = view0.findViewById(id.ads_product_sale_price);
        this.d = view5 instanceof TextView ? ((TextView)view5) : null;
        View view6 = view0.findViewById(id.ads_product_rating);
        StarRating starRating0 = view6 instanceof StarRating ? ((StarRating)view6) : null;
        this.e = starRating0;
        View view7 = view0.findViewById(id.ads_product_deliver);
        ImageView imageView1 = view7 instanceof ImageView ? ((ImageView)view7) : null;
        this.f = imageView1;
        View view8 = view0.findViewById(id.ads_product_free);
        TextView textView1 = view8 instanceof TextView ? ((TextView)view8) : null;
        this.g = textView1;
        View view9 = view0.findViewById(id.ads_product_discount);
        TextView textView2 = view9 instanceof TextView ? ((TextView)view9) : null;
        this.h = textView2;
        View view10 = view0.findViewById(id.ads_product_original_price);
        TextView textView3 = view10 instanceof TextView ? ((TextView)view10) : null;
        this.i = textView3;
        View view11 = view0.findViewById(id.ads_product_unit_price);
        TextView textView4 = view11 instanceof TextView ? ((TextView)view11) : null;
        this.j = textView4;
        View view12 = view0.findViewById(id.ads_immediate_discount_tip);
        TextView textView5 = view12 instanceof TextView ? ((TextView)view12) : null;
        this.k = textView5;
        View view13 = view0.findViewById(id.ads_product_content);
        if(view13 instanceof View) {
            view2 = view13;
        }
        this.l = view2;
        if(textView3 != null) {
            textView3.setPaintFlags(textView3.getPaintFlags() | 16);
        }
        this.m = new Builder().setFreeView$ads_release(textView1).setDiscountView$ads_release(textView2).setPriceView(textView4).setTitleView(textView0).setMainImageView(imageView0).setRatingView(starRating0).setRocketBadgeView(imageView1).setDiscountTipView$ads_release(textView5).setCallToActionView(view2).setOriginalPriceView$ads_release(textView3).build();
    }

    @m
    public final AdsProduct a() {
        return this.n;
    }

    @l
    public final AdsProductLayout b() {
        return this.m;
    }

    @m
    public final View c() {
        return this.a;
    }

    @m
    public final ImageView d() {
        return this.f;
    }

    @m
    public final TextView e() {
        return this.h;
    }

    @m
    public final TextView f() {
        return this.g;
    }

    @m
    public final ImageView g() {
        return this.b;
    }

    @m
    public final TextView h() {
        return this.i;
    }

    @m
    public final StarRating i() {
        return this.e;
    }

    @m
    public final TextView j() {
        return this.d;
    }

    @m
    public final TextView k() {
        return this.c;
    }

    public final void l(@m AdsProduct adsProduct0) {
        this.n = adsProduct0;
        this.m.setAdsProduct(adsProduct0);
    }
}

