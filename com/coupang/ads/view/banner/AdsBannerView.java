package com.coupang.ads.view.banner;

import J.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.coupang.ads.tools.d;
import com.coupang.ads.tools.o;
import com.coupang.ads.tools.q;
import com.coupang.ads.viewmodels.AdsRequest;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.j;

public final class AdsBannerView extends RelativeLayout {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            arr_v[b.a.ordinal()] = 1;
            arr_v[b.b.ordinal()] = 2;
            arr_v[b.c.ordinal()] = 3;
            arr_v[b.d.ordinal()] = 4;
            arr_v[b.e.ordinal()] = 5;
            arr_v[b.f.ordinal()] = 6;
            arr_v[b.g.ordinal()] = 7;
            arr_v[b.h.ordinal()] = 8;
            arr_v[b.i.ordinal()] = 9;
            a.a = arr_v;
        }
    }

    @m
    private b a;
    @m
    private BaseBannerView b;
    @m
    private L.a c;
    @m
    private LifecycleOwner d;
    @m
    private AdsViewModel e;
    private Drawable[] f;
    @m
    private View.OnClickListener g;

    @j
    public AdsBannerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdsBannerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdsBannerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
    }

    public AdsBannerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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

    public final void b() {
        Banner320x50View banner320x50View0;
        b b0 = this.a;
        if(b0 == null) {
            return;
        }
        switch(b0) {
            case 1: {
                Context context4 = this.getContext();
                L.o(context4, "context");
                banner320x50View0 = new Banner320x50View(context4, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
                relativeLayout$LayoutParams1.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams1);
                break;
            }
            case 2: {
                Context context5 = this.getContext();
                L.o(context5, "context");
                banner320x50View0 = new Banner320x100View(context5, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                relativeLayout$LayoutParams2.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams2);
                break;
            }
            case 3: {
                Context context6 = this.getContext();
                L.o(context6, "context");
                banner320x50View0 = new Banner300x250View(context6, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                relativeLayout$LayoutParams3.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams3);
                break;
            }
            case 4: {
                Context context7 = this.getContext();
                L.o(context7, "context");
                banner320x50View0 = new Banner320x480ScaleView(context7, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(d.b(banner320x50View0.getContext(), 320), d.b(banner320x50View0.getContext(), 480));
                relativeLayout$LayoutParams4.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams4);
                break;
            }
            case 5: {
                Context context8 = this.getContext();
                L.o(context8, "context");
                banner320x50View0 = new Banner320x480ScaleView(context8, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(d.b(banner320x50View0.getContext(), 480), d.b(banner320x50View0.getContext(), 640));
                relativeLayout$LayoutParams5.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams5);
                break;
            }
            case 6: {
                Context context9 = this.getContext();
                L.o(context9, "context");
                banner320x50View0 = new Banner320x480ScaleView(context9, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(d.b(banner320x50View0.getContext(), 640), d.b(banner320x50View0.getContext(), 960));
                relativeLayout$LayoutParams6.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams6);
                break;
            }
            case 7: {
                Context context10 = this.getContext();
                L.o(context10, "context");
                banner320x50View0 = new Banner480x320ScaleView(context10, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout.LayoutParams(d.b(banner320x50View0.getContext(), 480), d.b(banner320x50View0.getContext(), 320));
                relativeLayout$LayoutParams7.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams7);
                break;
            }
            case 8: {
                Context context11 = this.getContext();
                L.o(context11, "context");
                banner320x50View0 = new Banner480x320ScaleView(context11, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams8 = new RelativeLayout.LayoutParams(d.b(banner320x50View0.getContext(), 640), d.b(banner320x50View0.getContext(), 480));
                relativeLayout$LayoutParams8.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams8);
                break;
            }
            case 9: {
                Context context12 = this.getContext();
                L.o(context12, "context");
                banner320x50View0 = new Banner480x320ScaleView(context12, null, 0, 6, null);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams9 = new RelativeLayout.LayoutParams(d.b(banner320x50View0.getContext(), 960), d.b(banner320x50View0.getContext(), 640));
                relativeLayout$LayoutParams9.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams9);
                break;
            }
            default: {
                Context context0 = this.getContext();
                L.o(context0, "context");
                int v = o.d(context0);
                if(v <= 400) {
                    Context context1 = this.getContext();
                    L.o(context1, "context");
                    banner320x50View0 = new SmartBanner32View(context1, null, 0, 6, null);
                }
                else if(401 > v || v > 720) {
                    Context context3 = this.getContext();
                    L.o(context3, "context");
                    banner320x50View0 = new SmartBanner90View(context3, null, 0, 6, null);
                }
                else {
                    Context context2 = this.getContext();
                    L.o(context2, "context");
                    banner320x50View0 = new SmartBanner50View(context2, null, 0, 6, null);
                }
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
                relativeLayout$LayoutParams0.addRule(13);
                banner320x50View0.setLayoutParams(relativeLayout$LayoutParams0);
            }
        }
        q.c(banner320x50View0);
        this.removeAllViews();
        banner320x50View0.setAdsListener(this.c);
        banner320x50View0.setOnClickListener(this.g);
        Drawable[] arr_drawable = this.f;
        if(arr_drawable != null) {
            if(arr_drawable == null) {
                L.S("extBackground");
                arr_drawable = null;
            }
            banner320x50View0.setBackground(((Drawable)kotlin.collections.l.Pe(arr_drawable, 0)));
        }
        this.addView(banner320x50View0);
        AdsViewModel adsViewModel0 = this.e;
        if(adsViewModel0 != null) {
            LifecycleOwner lifecycleOwner0 = this.d;
            if(lifecycleOwner0 == null) {
                lifecycleOwner0 = banner320x50View0;
            }
            banner320x50View0.bindViewModel(lifecycleOwner0, adsViewModel0);
        }
        this.b = banner320x50View0;
    }

    public final void c(@m LifecycleOwner lifecycleOwner0, @l AdsViewModel adsViewModel0) {
        L.p(adsViewModel0, "viewModel");
        this.d = lifecycleOwner0;
        this.e = adsViewModel0;
        if(this.a != adsViewModel0.getRequest().getCreativeSize()) {
            this.a = adsViewModel0.getRequest().getCreativeSize();
            this.b();
            return;
        }
        BaseBannerView baseBannerView0 = this.b;
        if(baseBannerView0 != null) {
            if(lifecycleOwner0 == null) {
                lifecycleOwner0 = baseBannerView0;
            }
            baseBannerView0.bindViewModel(lifecycleOwner0, adsViewModel0);
        }
    }

    public static void d(AdsBannerView adsBannerView0, LifecycleOwner lifecycleOwner0, AdsViewModel adsViewModel0, int v, Object object0) {
        if((v & 1) != 0) {
            lifecycleOwner0 = null;
        }
        adsBannerView0.c(lifecycleOwner0, adsViewModel0);
    }

    @k(message = "Use this function may case view leakage", replaceWith = @c0(expression = "bindViewModel", imports = {}))
    public final void e(long v, @m String s, @m String s1) {
        AdsViewModel adsViewModel0 = new AdsViewModel(new AdsRequest(String.valueOf(v), (this.a == null ? b.j : this.a), null, s, s1, null, 36, null));
        adsViewModel0.loadAdData();
        this.c(null, adsViewModel0);
    }

    public static void f(AdsBannerView adsBannerView0, long v, String s, String s1, int v1, Object object0) {
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            s1 = null;
        }
        adsBannerView0.e(v, s, s1);
    }

    @m
    public final L.a getAdsListener() {
        return this.c;
    }

    @m
    public final AdsViewModel getViewModel() {
        return this.e;
    }

    @k(message = "", replaceWith = @c0(expression = "AdsRequest.creativeSize", imports = {}))
    public final void setAdSize(int v) {
        b b0;
        switch(v) {
            case 1: {
                b0 = b.a;
                break;
            }
            case 2: {
                b0 = b.b;
                break;
            }
            case 3: {
                b0 = b.c;
                break;
            }
            default: {
                b0 = b.j;
            }
        }
        if(this.a != b0) {
            this.a = b0;
            this.b();
        }
    }

    public final void setAdsListener(@m L.a a0) {
        BaseBannerView baseBannerView0 = this.b;
        if(baseBannerView0 != null) {
            baseBannerView0.setAdsListener(a0);
        }
        this.c = a0;
    }

    @Override  // android.view.View
    public void setBackground(@m Drawable drawable0) {
        BaseBannerView baseBannerView0 = this.b;
        if(baseBannerView0 != null) {
            baseBannerView0.setBackground(drawable0);
        }
        this.f = new Drawable[]{drawable0};
    }

    @Override  // android.view.View
    public void setOnClickListener(@m View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        this.g = view$OnClickListener0;
        BaseBannerView baseBannerView0 = this.b;
        if(baseBannerView0 != null) {
            baseBannerView0.setOnClickListener(view$OnClickListener0);
        }
    }
}

