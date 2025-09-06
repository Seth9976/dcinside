package com.coupang.ads.interstitial;

import J.i;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import com.coupang.ads.R.layout;
import com.coupang.ads.R.style;
import com.coupang.ads.custom.AdsNativeView;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.tools.j;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d extends h implements LifecycleOwner, f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final String A = "Interstitial";
    @m
    private AdsNativeView u;
    @m
    private AdsViewModel v;
    @l
    private final D w;
    @m
    private AdsInterstitialView x;
    @m
    private b y;
    @l
    public static final a z;

    static {
        d.z = new a(null);
    }

    public d() {
        static final class com.coupang.ads.interstitial.d.b extends N implements A3.a {
            final d e;

            com.coupang.ads.interstitial.d.b(d d0) {
                this.e = d0;
                super(0);
            }

            @l
            public final LifecycleRegistry b() {
                return new LifecycleRegistry(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        this.w = E.a(new com.coupang.ads.interstitial.d.b(this));
    }

    private final void A(AdsProduct adsProduct0) {
        if(adsProduct0 == null) {
            AdsViewModel adsViewModel0 = this.v;
            if(adsViewModel0 == null) {
                adsProduct0 = null;
            }
            else {
                MutableLiveData mutableLiveData0 = adsViewModel0.getDataResult();
                if(mutableLiveData0 == null) {
                    adsProduct0 = null;
                }
                else {
                    e0 e00 = (e0)mutableLiveData0.f();
                    if(e00 == null) {
                        adsProduct0 = null;
                    }
                    else {
                        Object object0 = e00.l();
                        if(e0.i(object0)) {
                            object0 = null;
                        }
                        adsProduct0 = ((DTO)object0) == null ? null : com.coupang.ads.dto.b.a(((DTO)object0));
                    }
                }
            }
        }
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        if(adsProduct0 != null) {
            String s = adsProduct0.getClickUrl();
            if(s != null && s.length() > 0) {
                com.coupang.ads.tools.h.a(adsProduct0, context0);
            }
        }
    }

    public final void B(@m AdsNativeView adsNativeView0) {
        this.u = adsNativeView0;
    }

    @Override  // com.coupang.ads.interstitial.f
    public boolean C() {
        AdsViewModel adsViewModel0 = this.v;
        if(adsViewModel0 != null) {
            MutableLiveData mutableLiveData0 = adsViewModel0.getDataResult();
            if(mutableLiveData0 != null) {
                e0 e00 = (e0)mutableLiveData0.f();
                return e00 != null && e0.j(e00.l());
            }
        }
        return false;
    }

    @Override  // com.coupang.ads.interstitial.f
    public void X(@m Context context0) {
        S0 s00;
        try {
            super.t(context0, "Interstitial");
            s00 = S0.a;
        }
        catch(Throwable throwable0) {
            s00 = e0.b(f0.a(throwable0));
        }
        Throwable throwable1 = e0.e(s00);
        if(throwable1 != null) {
            b b0 = this.getListener();
            if(b0 != null) {
                AdsViewModel adsViewModel0 = this.z();
                b0.onAdFailedToShow(new com.coupang.ads.b((adsViewModel0 == null ? null : adsViewModel0.getRequest()), "showAds failed", throwable1, 0, 8, null));
            }
        }
    }

    @Override  // com.coupang.ads.interstitial.h
    public void a() {
    }

    @Override  // com.coupang.ads.interstitial.f
    public void d(@m b b0) {
        this.y = b0;
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @l
    public Lifecycle getLifecycle() {
        return this.y();
    }

    @Override  // com.coupang.ads.interstitial.f
    @m
    public b getListener() {
        return this.y;
    }

    @Override  // com.coupang.ads.interstitial.h
    @l
    public Dialog i(@m Bundle bundle0) {
        return new Dialog(this.getContext(), style.FullScreenDialog);
    }

    @Override  // com.coupang.ads.interstitial.h
    public void j() {
        AdsViewModel adsViewModel0 = this.v;
        if(adsViewModel0 != null) {
            MutableLiveData mutableLiveData0 = adsViewModel0.getDataResult();
            if(mutableLiveData0 != null) {
                DTO dTO0 = (DTO)j.a(mutableLiveData0);
                if(dTO0 != null) {
                    AdsProductPage adsProductPage0 = com.coupang.ads.dto.b.c(dTO0);
                    if(adsProductPage0 != null) {
                        com.coupang.ads.tools.h.e(adsProductPage0);
                    }
                }
            }
        }
        b b0 = this.getListener();
        if(b0 != null) {
            b0.onAdShowed();
        }
    }

    @Override  // com.coupang.ads.interstitial.f
    public void m(@l AdsViewModel adsViewModel0) {
        L.p(adsViewModel0, "viewModel");
        this.v = adsViewModel0;
        AdsInterstitialView adsInterstitialView0 = this.x;
        if(adsInterstitialView0 != null) {
            adsInterstitialView0.bindViewModel(this, adsViewModel0);
        }
    }

    @Override  // android.app.Fragment
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        Dialog dialog0 = this.e();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setAttributes(window0.getAttributes());
            }
        }
    }

    @Override  // com.coupang.ads.interstitial.h
    public void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        LifecycleRegistry lifecycleRegistry0 = this.y();
        lifecycleRegistry0.l(Event.ON_CREATE);
        lifecycleRegistry0.l(Event.ON_START);
        lifecycleRegistry0.l(Event.ON_RESUME);
    }

    @Override  // android.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        AdsInterstitialView adsInterstitialView0 = this.u;
        if(adsInterstitialView0 == null) {
            View view0 = layoutInflater0.inflate(layout.ads_dialog_interstitial, viewGroup0, false);
            if(view0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.coupang.ads.interstitial.AdsInterstitialView");
            }
            this.x = (AdsInterstitialView)view0;
            return (AdsInterstitialView)view0;
        }
        return adsInterstitialView0;
    }

    @Override  // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.y();
        this.y().l(Event.ON_PAUSE);
        this.y().l(Event.ON_STOP);
        this.y().l(Event.ON_DESTROY);
    }

    @Override  // com.coupang.ads.interstitial.h
    public void onDismiss(@m DialogInterface dialogInterface0) {
        com.coupang.ads.clog.b.a.a("Interstitial", "Interstitial.onDismiss");
        super.onDismiss(dialogInterface0);
        b b0 = this.getListener();
        if(b0 != null) {
            b0.onAdDismissed();
        }
    }

    @Override  // android.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        public static final class c implements i {
            public final class com.coupang.ads.interstitial.d.c.a {
                public static final int[] a;

                static {
                    int[] arr_v = new int[J.f.values().length];
                    arr_v[J.f.d.ordinal()] = 1;
                    arr_v[J.f.f.ordinal()] = 2;
                    arr_v[J.f.e.ordinal()] = 3;
                    arr_v[J.f.h.ordinal()] = 4;
                    arr_v[J.f.c.ordinal()] = 5;
                    arr_v[J.f.b.ordinal()] = 6;
                    arr_v[J.f.g.ordinal()] = 7;
                    com.coupang.ads.interstitial.d.c.a.a = arr_v;
                }
            }

            final d a;

            c(d d0) {
                this.a = d0;
                super();
            }

            @Override  // J.i
            public void onClickPlacement(@m View view0, @l J.f f0, @m AdsProductPage adsProductPage0, @m AdsProduct adsProduct0) {
                L.p(f0, "viewType");
                b b0 = this.a.getListener();
                if(b0 != null) {
                    b0.onClick(f0);
                }
                switch(f0) {
                    case 1: 
                    case 2: 
                    case 3: {
                        this.a.A(adsProduct0);
                        break;
                    }
                    case 6: {
                        this.a.dismiss();
                        return;
                    }
                    case 7: {
                        if(view0 != null) {
                            Context context0 = view0.getContext();
                            if(context0 != null && adsProductPage0 != null) {
                                com.coupang.ads.tools.h.b(adsProductPage0, context0);
                                return;
                            }
                        }
                        break;
                    }
                }
            }

            @Override  // J.i
            public void onClickProduct(@m View view0, @l J.f f0, @m AdsProduct adsProduct0) {
                L.p(f0, "viewType");
                switch(f0) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: {
                        this.a.A(adsProduct0);
                    }
                }
                b b0 = this.a.getListener();
                if(b0 != null) {
                    b0.onClick(f0);
                }
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.k(false);
        AdsViewModel adsViewModel0 = this.v;
        if(adsViewModel0 != null) {
            AdsInterstitialView adsInterstitialView0 = this.x;
            if(adsInterstitialView0 != null) {
                adsInterstitialView0.bindViewModel(this, adsViewModel0);
            }
            AdsNativeView adsNativeView0 = this.x();
            if(adsNativeView0 != null) {
                adsNativeView0.bindViewModel(this, adsViewModel0);
            }
        }
        c d$c0 = new c(this);
        AdsInterstitialView adsInterstitialView1 = this.x;
        if(adsInterstitialView1 != null) {
            adsInterstitialView1.setOnAdsClickListener(d$c0);
        }
        AdsNativeView adsNativeView1 = this.u;
        if(adsNativeView1 != null) {
            adsNativeView1.setExtOnAdsClickListener(d$c0);
        }
    }

    @Override  // android.app.Fragment
    public void onViewStateRestored(@m Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(bundle0 != null) {
            try {
                Activity activity0 = this.getActivity();
                if(activity0 != null && !activity0.isFinishing() && this.e() != null) {
                    this.dismiss();
                }
            }
            catch(IllegalStateException unused_ex) {
            }
        }
    }

    @m
    public final AdsNativeView x() {
        return this.u;
    }

    private final LifecycleRegistry y() {
        return (LifecycleRegistry)this.w.getValue();
    }

    @m
    public final AdsViewModel z() {
        return this.v;
    }
}

