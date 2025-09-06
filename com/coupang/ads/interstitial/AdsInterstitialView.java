package com.coupang.ads.interstitial;

import J.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.coupang.ads.R.layout;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.tools.q;
import com.coupang.ads.view.base.AdsBaseView;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsInterstitialView extends AdsBaseView {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static enum b {
        SINGLE,
        SCROLL,
        GRID;

        private static final b[] a() [...] // Inlined contents
    }

    public final class c {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            arr_v[b.a.ordinal()] = 1;
            arr_v[b.c.ordinal()] = 2;
            c.a = arr_v;
        }
    }

    @m
    private final AttributeSet a;
    @m
    private b b;
    @m
    private com.coupang.ads.view.a c;
    @m
    private com.coupang.ads.view.a d;
    @m
    private i e;
    @l
    public static final a f = null;
    @l
    public static final String g = "InterstitialView";

    static {
        AdsInterstitialView.f = new a(null);
    }

    @j
    public AdsInterstitialView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsInterstitialView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsInterstitialView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = attributeSet0;
        this.h(this.getResources().getConfiguration().orientation);
    }

    public AdsInterstitialView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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

    private final b f(AdsProductPage adsProductPage0) {
        ArrayList arrayList0 = adsProductPage0.getAdsProductList();
        int v = arrayList0 == null ? 0 : arrayList0.size();
        if(v > 1 && (!L.g(adsProductPage0.getCreativeTemplate(), "GRID") || v >= 4)) {
            return L.g(adsProductPage0.getCreativeTemplate(), "GRID") ? b.c : b.b;
        }
        return b.a;
    }

    private final int g(boolean z) {
        switch((this.b == null ? -1 : c.a[this.b.ordinal()])) {
            case 1: {
                return z ? layout.ads_view_interstitial_single_vertical : layout.ads_view_interstitial_single_horizontal;
            }
            case 2: {
                return z ? layout.ads_view_interstitial_grid_vertical : layout.ads_view_interstitial_grid_horizontal;
            }
            default: {
                return z ? layout.ads_view_interstitial_linear_vertical : layout.ads_view_interstitial_linear_horizontal;
            }
        }
    }

    @m
    public final AttributeSet getAttrs() {
        return this.a;
    }

    @m
    public final i getOnAdsClickListener() {
        return this.e;
    }

    private final void h(Integer integer0) {
        if(integer0 != null && ((int)integer0) == 2) {
            com.coupang.ads.view.a a0 = this.d;
            if(a0 != null) {
                View view0 = a0.j();
                if(view0 != null) {
                    q.h(view0);
                }
            }
            com.coupang.ads.view.a a1 = this.c;
            if(a1 != null) {
                View view1 = a1.j();
                if(view1 != null) {
                    q.b(view1);
                }
            }
        }
        else if(integer0 != null && ((int)integer0) == 1) {
            com.coupang.ads.view.a a2 = this.d;
            if(a2 != null) {
                View view2 = a2.j();
                if(view2 != null) {
                    q.b(view2);
                }
            }
            com.coupang.ads.view.a a3 = this.c;
            if(a3 != null) {
                View view3 = a3.j();
                if(view3 != null) {
                    q.h(view3);
                }
            }
        }
    }

    private final void i(AdsProductPage adsProductPage0) {
        b adsInterstitialView$b0 = this.f(adsProductPage0);
        if(adsInterstitialView$b0 == this.b) {
            return;
        }
        this.b = adsInterstitialView$b0;
        View view0 = View.inflate(this.getContext(), this.g(true), null);
        this.addView(view0);
        L.o(view0, "inflate(\n               …iew(it)\n                }");
        this.c = new com.coupang.ads.view.a(view0);
        View view1 = View.inflate(this.getContext(), this.g(false), null);
        this.addView(view1);
        L.o(view1, "inflate(\n               …iew(it)\n                }");
        this.d = new com.coupang.ads.view.a(view1);
        this.h(this.getResources().getConfiguration().orientation);
        com.coupang.ads.view.a a0 = this.c;
        if(a0 != null) {
            a0.l(this.e);
        }
        com.coupang.ads.view.a a1 = this.d;
        if(a1 != null) {
            a1.l(this.e);
        }
    }

    @Override  // com.coupang.ads.view.base.AdsBaseView
    public void onBindModelData(@l DTO dTO0) {
        L.p(dTO0, "data");
        AdsProductPage adsProductPage0 = com.coupang.ads.dto.b.c(dTO0);
        if(adsProductPage0 != null) {
            this.i(adsProductPage0);
            com.coupang.ads.view.a a0 = this.c;
            if(a0 != null) {
                a0.k(adsProductPage0);
            }
            com.coupang.ads.view.a a1 = this.d;
            if(a1 != null) {
                a1.k(adsProductPage0);
            }
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        com.coupang.ads.clog.b.a.a("InterstitialView", "onMeasure");
        this.h(this.getResources().getConfiguration().orientation);
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        com.coupang.ads.clog.b.a.a("InterstitialView", "onSizeChanged widh:" + v + " height:" + v1);
    }

    public final void setOnAdsClickListener(@m i i0) {
        this.e = i0;
        com.coupang.ads.view.a a0 = this.c;
        if(a0 != null) {
            a0.l(i0);
        }
        com.coupang.ads.view.a a1 = this.d;
        if(a1 != null) {
            a1.l(i0);
        }
    }
}

