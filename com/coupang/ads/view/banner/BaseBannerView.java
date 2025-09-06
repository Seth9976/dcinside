package com.coupang.ads.view.banner;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.tools.h;
import com.coupang.ads.tools.q;
import com.coupang.ads.view.base.AdsBaseView;
import com.coupang.ads.viewmodels.AdsRequest;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.j;

public abstract class BaseBannerView extends AdsBaseView {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final D a;
    @l
    private final D b;
    @l
    public static final a c = null;
    @l
    public static final String d = "AdsBaseBannerView";

    static {
        BaseBannerView.c = new a(null);
    }

    @j
    public BaseBannerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public BaseBannerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public BaseBannerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class b extends N implements A3.a {
            final BaseBannerView e;

            b(BaseBannerView baseBannerView0) {
                this.e = baseBannerView0;
                super(0);
            }

            @l
            public final com.coupang.ads.view.a b() {
                return new com.coupang.ads.view.a(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class c extends N implements A3.a {
            final BaseBannerView e;

            c(BaseBannerView baseBannerView0) {
                this.e = baseBannerView0;
                super(0);
            }

            @l
            public final com.coupang.ads.view.b b() {
                return new com.coupang.ads.view.b(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = E.a(new c(this));
        this.b = E.a(new b(this));
    }

    public BaseBannerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void _$_clearFindViewByIdCache() {
    }

    @k(message = "Use this function may case view leakage", replaceWith = @c0(expression = "bindViewModel", imports = {}))
    public final void f(long v, @m String s, @m String s1) {
        AdsViewModel adsViewModel0 = new AdsViewModel(new AdsRequest(String.valueOf(v), J.b.j, null, s, s1, null, 36, null));
        adsViewModel0.loadAdData();
        this.bindViewModel(null, adsViewModel0);
    }

    @l
    protected final com.coupang.ads.view.a getAdsPlacementViewHolder() {
        return (com.coupang.ads.view.a)this.b.getValue();
    }

    @l
    protected final com.coupang.ads.view.b getAdsProductViewHolder() {
        return (com.coupang.ads.view.b)this.a.getValue();
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    @SuppressLint({"SetTextI18n"})
    public void onBindModelData(@l DTO dTO0) {
        L.p(dTO0, "data");
        q.h(this);
        AdsProductPage adsProductPage0 = com.coupang.ads.dto.b.c(dTO0);
        AdsProduct adsProduct0 = null;
        if(adsProductPage0 != null) {
            com.coupang.ads.view.a a0 = this.getAdsPlacementViewHolder();
            h.e(adsProductPage0);
            S0 s00 = S0.a;
            a0.k(adsProductPage0);
            com.coupang.ads.view.b b0 = this.getAdsProductViewHolder();
            AdsProduct adsProduct1 = com.coupang.ads.dto.b.a(adsProductPage0);
            if(adsProduct1 != null) {
                h.f(adsProduct1);
                adsProduct0 = adsProduct1;
            }
            if(adsProduct0 == null) {
                throw new com.coupang.ads.b(null, "no Product find", null, 0, 12, null);
            }
            b0.l(adsProduct0);
            adsProduct0 = s00;
        }
        if(adsProduct0 == null) {
            throw new com.coupang.ads.b(null, "no ProductPage find", null, 0, 12, null);
        }
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void onClick(@l DTO dTO0) {
        L.p(dTO0, "data");
        AdsProduct adsProduct0 = com.coupang.ads.dto.b.a(dTO0);
        if(adsProduct0 != null) {
            String s = adsProduct0.getClickUrl();
            if(s != null) {
                if(s.length() <= 0) {
                    s = null;
                }
                if(s != null) {
                    com.coupang.ads.clog.b.a.a("AdsBaseBannerView", "onSendClickEvent " + s);
                    Context context0 = this.getContext();
                    L.o(context0, "context");
                    h.a(adsProduct0, context0);
                }
            }
        }
    }

    @Override  // android.view.View
    public void setBackground(@m Drawable drawable0) {
        if(L.g(this.getAdsProductViewHolder().c(), this)) {
            super.setBackground(drawable0);
            return;
        }
        View view0 = this.getAdsProductViewHolder().c();
        if(view0 != null) {
            view0.setBackground(drawable0);
        }
    }
}

