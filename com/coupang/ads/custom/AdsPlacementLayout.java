package com.coupang.ads.custom;

import J.f;
import J.i;
import P.e;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import com.coupang.ads.R.drawable;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.Impression;
import com.coupang.ads.tools.h;
import com.coupang.ads.tools.q;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdsPlacementLayout {
    public static final class Builder {
        @m
        private ImageView adsInfoView;
        @m
        private View callToActionView;
        @m
        private View closeView;
        @m
        private ImageView logoView;
        @m
        private View positiveView;
        @m
        private AdsProductGroup productsContainer;

        @l
        public final AdsPlacementLayout build() {
            AdsPlacementLayout adsPlacementLayout0 = new AdsPlacementLayout();
            adsPlacementLayout0.logoView = this.logoView;
            adsPlacementLayout0.optOutView = this.adsInfoView;
            adsPlacementLayout0.positiveView = this.positiveView;
            adsPlacementLayout0.closeView = this.closeView;
            adsPlacementLayout0.productsContainer = this.productsContainer;
            adsPlacementLayout0.callToActionView = this.callToActionView;
            adsPlacementLayout0.setup();
            return adsPlacementLayout0;
        }

        @l
        public final Builder setAdsInfoView(@m ImageView imageView0) {
            this.adsInfoView = imageView0;
            return this;
        }

        @l
        public final Builder setCallToActionView(@m View view0) {
            this.callToActionView = view0;
            return this;
        }

        @l
        public final Builder setCloseView$ads_release(@m View view0) {
            this.closeView = view0;
            return this;
        }

        @l
        public final Builder setFixSizeProductsGroup(@l AdsFixSizeProductGroup adsFixSizeProductGroup0) {
            L.p(adsFixSizeProductGroup0, "fixSIzeProductGroup");
            this.productsContainer = adsFixSizeProductGroup0;
            return this;
        }

        @l
        public final Builder setLogoView(@m ImageView imageView0) {
            this.logoView = imageView0;
            return this;
        }

        @l
        public final Builder setPositiveView$ads_release(@m View view0) {
            this.positiveView = view0;
            return this;
        }

        @l
        public final Builder setProductLayout(@l AdsProductLayout adsProductLayout0) {
            L.p(adsProductLayout0, "productLayout");
            this.productsContainer = new AdsSingleProductGroup(adsProductLayout0);
            return this;
        }

        @l
        public final Builder setProductsGroup(@m AdsProductGroup adsProductGroup0) {
            this.productsContainer = adsProductGroup0;
            return this;
        }

        @l
        public final Builder setRecyclerViewProductsGroup(@m AdsRecyclerViewProductGroup adsRecyclerViewProductGroup0) {
            this.productsContainer = adsRecyclerViewProductGroup0;
            return this;
        }
    }

    @m
    private AdsProductPage adsProductPage;
    @m
    private View callToActionView;
    @m
    private View closeView;
    @m
    private ImageView logoView;
    @l
    private final e onAdsClickListenerRef;
    @m
    private ImageView optOutView;
    @m
    private View positiveView;
    @m
    private AdsProductGroup productsContainer;
    @l
    private final View.OnClickListener viewClickListener;

    public AdsPlacementLayout() {
        this.onAdsClickListenerRef = new e(null);
        this.viewClickListener = (View view0) -> {
            f f0;
            L.p(this, "this$0");
            i i0 = (i)this.onAdsClickListenerRef.a();
            if(i0 != null) {
                if(L.g(view0, this.logoView)) {
                    f0 = f.c;
                }
                else if(L.g(view0, this.optOutView)) {
                    f0 = f.g;
                }
                else if(L.g(view0, this.closeView)) {
                    f0 = f.b;
                }
                else if(L.g(view0, this.positiveView)) {
                    f0 = f.f;
                }
                else {
                    f0 = L.g(view0, this.callToActionView) ? f.d : f.a;
                }
                AdsProductPage adsProductPage0 = this.getAdsProductPage();
                AdsProductGroup adsProductGroup0 = this.productsContainer;
                AdsProduct adsProduct0 = null;
                if(adsProductGroup0 != null) {
                    AdsProductLayout adsProductLayout0 = adsProductGroup0.getFocusProductLayout();
                    if(adsProductLayout0 != null) {
                        adsProduct0 = adsProductLayout0.getAdsProduct();
                    }
                }
                i0.onClickPlacement(view0, f0, adsProductPage0, adsProduct0);
            }
        };
    }

    @m
    public final AdsProductPage getAdsProductPage() {
        return this.adsProductPage;
    }

    @m
    public final i getOnAdsClickListener() {
        return (i)this.onAdsClickListenerRef.a();
    }

    public final void setAdsProductPage(@m AdsProductPage adsProductPage0) {
        this.adsProductPage = adsProductPage0;
        this.updateModel();
    }

    public final void setOnAdsClickListener(@m i i0) {
        this.onAdsClickListenerRef.e(i0);
    }

    public final void setup() {
        ImageView imageView0 = this.logoView;
        if(imageView0 != null) {
            imageView0.setOnClickListener(this.viewClickListener);
        }
        ImageView imageView1 = this.optOutView;
        if(imageView1 != null) {
            imageView1.setOnClickListener(this.viewClickListener);
        }
        View view0 = this.positiveView;
        if(view0 != null) {
            view0.setOnClickListener(this.viewClickListener);
        }
        View view1 = this.closeView;
        if(view1 != null) {
            view1.setOnClickListener(this.viewClickListener);
        }
        View view2 = this.callToActionView;
        if(view2 != null) {
            view2.setOnClickListener(this.viewClickListener);
        }
        AdsProductGroup adsProductGroup0 = this.productsContainer;
        if(adsProductGroup0 != null) {
            adsProductGroup0.setCallback(new BinderCallback() {
                @Override  // com.coupang.ads.custom.AdsProductGroup$BinderCallback
                public void onBind(int v, @l AdsProductLayout adsProductLayout0) {
                    L.p(adsProductLayout0, "adsProductLayout");
                    AdsProductPage adsProductPage0 = AdsPlacementLayout.this.getAdsProductPage();
                    AdsProduct adsProduct0 = null;
                    if(adsProductPage0 != null) {
                        ArrayList arrayList0 = adsProductPage0.getAdsProductList();
                        if(arrayList0 != null) {
                            adsProduct0 = (AdsProduct)u.W2(arrayList0, v);
                        }
                    }
                    adsProductLayout0.setAdsProduct(adsProduct0);
                }

                @Override  // com.coupang.ads.custom.AdsProductGroup$BinderCallback
                public void onProductLayoutCreated(@l AdsProductLayout adsProductLayout0) {
                    L.p(adsProductLayout0, "adsProductLayout");
                    adsProductLayout0.setOnAdsClickListenerRef(AdsPlacementLayout.this.onAdsClickListenerRef);
                }
            });
        }
        ImageView imageView2 = this.logoView;
        if(imageView2 != null) {
            imageView2.setImageResource(drawable.ic_ads_coupang_logo_350x80);
        }
        ImageView imageView3 = this.optOutView;
        if(imageView3 != null) {
            imageView3.setBackgroundResource(drawable.ic_ads_opt_out);
        }
    }

    private final void updateModel() {
        AdsProductPage adsProductPage0 = this.adsProductPage;
        if(adsProductPage0 == null) {
            return;
        }
        Impression impression0 = adsProductPage0.getBaseImpression();
        if(impression0 != null) {
            h.c(impression0);
        }
        AdsProductGroup adsProductGroup0 = this.productsContainer;
        if(adsProductGroup0 != null) {
            ArrayList arrayList0 = adsProductPage0.getAdsProductList();
            adsProductGroup0.onAdLoaded((arrayList0 == null ? 0 : arrayList0.size()));
        }
        String s = adsProductPage0.getOptOut();
        if(s != null && s.length() > 0) {
            q.h(this.optOutView);
            return;
        }
        q.b(this.optOutView);
    }

    // 检测为 Lambda 实现
    private static final void viewClickListener$lambda-0(AdsPlacementLayout adsPlacementLayout0, View view0) [...]
}

