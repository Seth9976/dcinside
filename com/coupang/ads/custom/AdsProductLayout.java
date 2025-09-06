package com.coupang.ads.custom;

import J.f;
import J.i;
import P.e;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.n;
import com.coupang.ads.R.drawable;
import com.coupang.ads.custom.widget.AdsStarRating;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.tools.g;
import com.coupang.ads.tools.h;
import com.coupang.ads.tools.q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdsProductLayout {
    public static final class Builder {
        @m
        private View callToAction;
        @m
        private TextView descriptionView;
        @m
        private TextView discountTipView;
        @m
        private TextView discountView;
        @m
        private TextView freeView;
        @m
        private ImageView mainImageView;
        @m
        private TextView originalPriceView;
        @m
        private TextView priceView;
        @m
        private ImageView rocketBadgeView;
        @m
        private AdsStarRating starRatingView;
        @m
        private TextView titleView;

        @l
        public final AdsProductLayout build() {
            AdsProductLayout adsProductLayout0 = new AdsProductLayout(null);
            adsProductLayout0.titleView = this.titleView;
            adsProductLayout0.descriptionView = this.descriptionView;
            adsProductLayout0.mainImageView = this.mainImageView;
            adsProductLayout0.priceView = this.priceView;
            adsProductLayout0.freeView = this.freeView;
            adsProductLayout0.rocketBadgeView = this.rocketBadgeView;
            adsProductLayout0.discountView = this.discountView;
            adsProductLayout0.discountTipView = this.discountTipView;
            adsProductLayout0.originalPriceView = this.originalPriceView;
            adsProductLayout0.starRatingView = this.starRatingView;
            adsProductLayout0.callToActionView = this.callToAction;
            adsProductLayout0.setup();
            return adsProductLayout0;
        }

        @l
        public final Builder setCallToActionView(@m View view0) {
            this.callToAction = view0;
            return this;
        }

        @l
        public final Builder setDescriptionView(@m TextView textView0) {
            this.descriptionView = textView0;
            return this;
        }

        @l
        public final Builder setDiscountTipView$ads_release(@m TextView textView0) {
            this.discountView = textView0;
            return this;
        }

        @l
        public final Builder setDiscountView$ads_release(@m TextView textView0) {
            this.discountView = textView0;
            return this;
        }

        @l
        public final Builder setFreeView$ads_release(@m TextView textView0) {
            this.freeView = textView0;
            return this;
        }

        @l
        public final Builder setMainImageView(@m ImageView imageView0) {
            this.mainImageView = imageView0;
            return this;
        }

        @l
        public final Builder setOriginalPriceView$ads_release(@m TextView textView0) {
            this.originalPriceView = textView0;
            return this;
        }

        @l
        public final Builder setPriceView(@m TextView textView0) {
            this.priceView = textView0;
            return this;
        }

        @l
        public final Builder setRatingView(@m AdsStarRating adsStarRating0) {
            this.starRatingView = adsStarRating0;
            return this;
        }

        @l
        public final Builder setRocketBadgeView(@m ImageView imageView0) {
            this.rocketBadgeView = imageView0;
            return this;
        }

        @l
        public final Builder setTitleView(@m TextView textView0) {
            this.titleView = textView0;
            return this;
        }
    }

    @m
    private AdsProduct adsProduct;
    @m
    private View[] allViews;
    @m
    private View callToActionView;
    @m
    private TextView descriptionView;
    @m
    private TextView discountTipView;
    @m
    private TextView discountView;
    @m
    private TextView freeView;
    @m
    private ImageView mainImageView;
    @m
    private e onAdsClickListenerRef;
    @m
    private TextView originalPriceView;
    @m
    private TextView priceView;
    @m
    private ImageView rocketBadgeView;
    @m
    private AdsStarRating starRatingView;
    @m
    private TextView titleView;
    @l
    private final View.OnClickListener viewClickListener;

    private AdsProductLayout() {
        this.viewClickListener = (View view0) -> {
            f f0;
            L.p(this, "this$0");
            e e0 = this.getOnAdsClickListenerRef();
            if(e0 != null) {
                i i0 = (i)e0.a();
                if(i0 != null) {
                    if(L.g(view0, this.mainImageView)) {
                        f0 = f.c;
                    }
                    else if(L.g(view0, this.titleView)) {
                        f0 = f.h;
                    }
                    else {
                        f0 = L.g(view0, this.callToActionView) ? f.d : f.a;
                    }
                    i0.onClickProduct(view0, f0, this.getAdsProduct());
                }
            }
        };
    }

    public AdsProductLayout(w w0) {
    }

    @m
    public final AdsProduct getAdsProduct() {
        return this.adsProduct;
    }

    @m
    public final e getOnAdsClickListenerRef() {
        return this.onAdsClickListenerRef;
    }

    public final void hide() {
        View[] arr_view = this.allViews;
        if(arr_view != null) {
            for(int v = 0; v < arr_view.length; ++v) {
                q.b(arr_view[v]);
            }
        }
    }

    private final void initRocketBadge(AdsProduct adsProduct0) {
        String s = adsProduct0.getRocketBadge();
        if(s == null) {
        label_27:
            ImageView imageView3 = this.rocketBadgeView;
            if(imageView3 != null) {
                q.b(imageView3);
            }
            TextView textView3 = this.freeView;
            if(textView3 != null) {
                q.b(textView3);
            }
        }
        else {
            switch(s) {
                case "CONDITIONAL_FREE": 
                case "FREE": {
                    ImageView imageView1 = this.rocketBadgeView;
                    if(imageView1 != null) {
                        q.b(imageView1);
                    }
                    TextView textView1 = this.freeView;
                    if(textView1 != null) {
                        q.h(textView1);
                        return;
                    }
                    break;
                }
                case "FRESH": {
                    ImageView imageView2 = this.rocketBadgeView;
                    if(imageView2 != null) {
                        imageView2.setImageDrawable(imageView2.getContext().getDrawable(drawable.ic_ads_fresh));
                        q.h(imageView2);
                    }
                    TextView textView2 = this.freeView;
                    if(textView2 != null) {
                        q.b(textView2);
                        return;
                    }
                    break;
                }
                case "ROCKET": {
                    ImageView imageView0 = this.rocketBadgeView;
                    if(imageView0 != null) {
                        imageView0.setImageDrawable(imageView0.getContext().getDrawable(drawable.ic_ads_rocket_logo_pdp_hc));
                        q.h(imageView0);
                    }
                    TextView textView0 = this.freeView;
                    if(textView0 != null) {
                        q.b(textView0);
                        return;
                    }
                    break;
                }
                default: {
                    goto label_27;
                }
            }
        }
    }

    public final void setAdsProduct(@m AdsProduct adsProduct0) {
        this.adsProduct = adsProduct0;
        this.updateModel();
    }

    public final void setOnAdsClickListenerRef(@m e e0) {
        this.onAdsClickListenerRef = e0;
    }

    public final void setup() {
        ImageView imageView0 = this.mainImageView;
        if(imageView0 != null) {
            imageView0.setOnClickListener(this.viewClickListener);
        }
        TextView textView0 = this.titleView;
        if(textView0 != null) {
            textView0.setOnClickListener(this.viewClickListener);
        }
        View view0 = this.callToActionView;
        if(view0 != null) {
            view0.setOnClickListener(this.viewClickListener);
        }
        this.allViews = new View[]{this.titleView, this.mainImageView, this.priceView, this.freeView, this.rocketBadgeView, this.discountTipView, this.discountView, this.originalPriceView, this.starRatingView, this.callToActionView, this.descriptionView};
    }

    private final void updateModel() {
        AdsProduct adsProduct0 = this.adsProduct;
        if(adsProduct0 == null) {
            return;
        }
        h.f(adsProduct0);
        ImageView imageView0 = this.mainImageView;
        if(imageView0 != null) {
            n n0 = c.F(imageView0.getContext());
            L.o(n0, "with(it.context)");
            ((com.bumptech.glide.m)g.a(n0, adsProduct0.getImageMainPath(), imageView0).x0(drawable.ic_ads_placeholder_loading)).q1(imageView0);
        }
        TextView textView0 = this.titleView;
        if(textView0 != null) {
            q.a(textView0, adsProduct0.getTitle());
        }
        TextView textView1 = this.descriptionView;
        if(textView1 != null) {
            q.a(textView1, adsProduct0.getTitle());
        }
        AdsStarRating adsStarRating0 = this.starRatingView;
        if(adsStarRating0 != null) {
            adsStarRating0.setStarRatingAutoVisible(adsProduct0.getRatingCount(), adsProduct0.getRatingAverage());
        }
        TextView textView2 = this.discountTipView;
        if(textView2 != null) {
            q.b(textView2);
        }
        TextView textView3 = this.discountView;
        if(textView3 != null) {
            String s = adsProduct0.getPrice();
            double f = NaN;
            double f1 = s == null ? NaN : Double.parseDouble(s);
            String s1 = adsProduct0.getOrgPrice();
            if(s1 != null) {
                f = Double.parseDouble(s1);
            }
            double f2 = 100.0 * (1.0 - f1 / f);
            String s2 = null;
            Number number0 = Double.isInfinite(f2) || Double.isNaN(f2) || f2 <= 0.0 || f2 >= 100.0 ? null : ((int)f2);
            if(number0 != null) {
                Context context0 = textView3.getContext();
                L.o(context0, "it.context");
                s2 = com.coupang.ads.tools.i.b(number0, context0);
            }
            if(q.a(textView3, s2)) {
                TextView textView4 = this.discountTipView;
                if(textView4 != null) {
                    q.h(textView4);
                }
                TextView textView5 = this.originalPriceView;
                if(textView5 != null) {
                    Context context1 = textView3.getContext();
                    L.o(context1, "it.context");
                    q.a(textView5, com.coupang.ads.tools.i.a(adsProduct0.getOrgPrice(), context1));
                }
            }
            else {
                TextView textView6 = this.discountTipView;
                if(textView6 != null) {
                    q.b(textView6);
                }
                TextView textView7 = this.originalPriceView;
                if(textView7 != null) {
                    q.b(textView7);
                }
            }
        }
        TextView textView8 = this.priceView;
        if(textView8 != null) {
            Context context2 = textView8.getContext();
            L.o(context2, "it.context");
            q.a(textView8, com.coupang.ads.tools.i.a(adsProduct0.getPrice(), context2));
        }
        this.initRocketBadge(adsProduct0);
    }

    // 检测为 Lambda 实现
    private static final void viewClickListener$lambda-0(AdsProductLayout adsProductLayout0, View view0) [...]
}

