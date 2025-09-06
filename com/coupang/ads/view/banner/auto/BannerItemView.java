package com.coupang.ads.view.banner.auto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.c;
import com.bumptech.glide.n;
import com.coupang.ads.R.color;
import com.coupang.ads.R.drawable;
import com.coupang.ads.R.id;
import com.coupang.ads.R.layout;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.tools.g;
import com.coupang.ads.tools.h;
import com.coupang.ads.tools.i;
import com.coupang.ads.tools.q;
import com.coupang.ads.view.image.RoundImageView;
import com.coupang.ads.view.rating.StarRating;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class BannerItemView extends RelativeLayout {
    @m
    private RoundImageView a;
    @m
    private TextView b;
    @m
    private StarRating c;
    @m
    private TextView d;
    @m
    private ImageView e;
    @m
    private TextView f;
    @m
    private AdsProduct g;

    @j
    public BannerItemView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public BannerItemView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public BannerItemView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.setId(id.ads_banner_background);
        View.inflate(context0, layout.ads_item_banner_img, this);
        this.setBackgroundColor(ContextCompat.getColor(context0, color.rds_bluegray_100));
        this.a = (RoundImageView)this.findViewById(id.ads_product_img);
        this.c = (StarRating)this.findViewById(id.ads_product_rating);
        this.b = (TextView)this.findViewById(id.ads_product_title);
        this.e = (ImageView)this.findViewById(id.ads_product_deliver);
        this.d = (TextView)this.findViewById(id.ads_product_sale_price);
        this.f = (TextView)this.findViewById(id.ads_product_free);
    }

    public BannerItemView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void b() {
    }

    private final void c() {
        String s = this.g == null ? null : this.g.getRocketBadge();
        if(s == null) {
        label_38:
            ImageView imageView6 = this.e;
            if(imageView6 != null) {
                imageView6.setVisibility(8);
            }
            TextView textView4 = this.f;
            if(textView4 != null) {
                textView4.setVisibility(8);
            }
        }
        else {
            switch(s) {
                case "CONDITIONAL_FREE": {
                    ImageView imageView3 = this.e;
                    if(imageView3 != null) {
                        q.b(imageView3);
                    }
                    TextView textView2 = this.f;
                    if(textView2 != null) {
                        q.h(textView2);
                        return;
                    }
                    break;
                }
                case "FREE": {
                    ImageView imageView2 = this.e;
                    if(imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    TextView textView1 = this.f;
                    if(textView1 != null) {
                        textView1.setVisibility(0);
                        return;
                    }
                    break;
                }
                case "FRESH": {
                    ImageView imageView4 = this.e;
                    if(imageView4 != null) {
                        imageView4.setBackground(this.getRootView().getContext().getDrawable(drawable.ic_ads_fresh));
                    }
                    ImageView imageView5 = this.e;
                    if(imageView5 != null) {
                        q.h(imageView5);
                    }
                    TextView textView3 = this.f;
                    if(textView3 != null) {
                        q.b(textView3);
                        return;
                    }
                    break;
                }
                case "ROCKET": {
                    ImageView imageView0 = this.e;
                    if(imageView0 != null) {
                        imageView0.setBackground(ContextCompat.getDrawable(this.getContext(), drawable.ic_ads_rocket));
                    }
                    ImageView imageView1 = this.e;
                    if(imageView1 != null) {
                        imageView1.setVisibility(0);
                    }
                    TextView textView0 = this.f;
                    if(textView0 != null) {
                        textView0.setVisibility(8);
                        return;
                    }
                    break;
                }
                default: {
                    goto label_38;
                }
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void d(@l AdsProduct adsProduct0) {
        String s1;
        L.p(adsProduct0, "data");
        this.g = adsProduct0;
        RoundImageView roundImageView0 = this.a;
        if(roundImageView0 != null) {
            n n0 = c.F(this.getContext());
            L.o(n0, "with(context)");
            ((com.bumptech.glide.m)g.a(n0, adsProduct0.getImageMainPath(), roundImageView0).x0(drawable.ic_ads_placeholder_loading)).q1(roundImageView0);
        }
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setText(adsProduct0.getTitle());
        }
        StarRating starRating0 = this.c;
        if(starRating0 != null) {
            starRating0.setStarRatingAutoVisible(adsProduct0.getRatingCount(), adsProduct0.getRatingAverage());
        }
        TextView textView1 = this.d;
        if(textView1 != null) {
            String s = adsProduct0.getPrice();
            if(s == null) {
                s1 = null;
            }
            else {
                Context context0 = this.getContext();
                L.o(context0, "context");
                s1 = i.a(s, context0);
            }
            textView1.setText(s1);
        }
        this.c();
        this.g();
    }

    private final void e() {
        AdsProduct adsProduct0 = this.g;
        if(adsProduct0 != null) {
            Context context0 = this.getContext();
            L.o(context0, "context");
            h.a(adsProduct0, context0);
        }
    }

    public final void f() {
        AdsProduct adsProduct0 = this.g;
        if(adsProduct0 != null) {
            h.f(adsProduct0);
        }
    }

    private final void g() {
        this.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.e();
        });
    }

    @m
    public final ImageView getDeliver() {
        return this.e;
    }

    @m
    public final TextView getFree() {
        return this.f;
    }

    @m
    public final AdsProduct getOriginalData() {
        return this.g;
    }

    @m
    public final TextView getPrice() {
        return this.d;
    }

    @m
    public final RoundImageView getProductImageView() {
        return this.a;
    }

    @m
    public final TextView getProductTitle() {
        return this.b;
    }

    @m
    public final StarRating getRatingView() {
        return this.c;
    }

    // 检测为 Lambda 实现
    private static final void h(BannerItemView bannerItemView0, View view0) [...]

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f();
    }

    public final void setDeliver(@m ImageView imageView0) {
        this.e = imageView0;
    }

    public final void setFree(@m TextView textView0) {
        this.f = textView0;
    }

    public final void setOriginalData(@m AdsProduct adsProduct0) {
        this.g = adsProduct0;
    }

    public final void setPrice(@m TextView textView0) {
        this.d = textView0;
    }

    public final void setProductImageView(@m RoundImageView roundImageView0) {
        this.a = roundImageView0;
    }

    public final void setProductTitle(@m TextView textView0) {
        this.b = textView0;
    }

    public final void setRatingView(@m StarRating starRating0) {
        this.c = starRating0;
    }
}

