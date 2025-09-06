package com.coupang.ads.interstitial;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.coupang.ads.R.layout;
import com.coupang.ads.R.style;
import com.coupang.ads.custom.AdsNativeView;
import com.coupang.ads.dto.AdsProduct;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.tools.h;
import com.coupang.ads.tools.j;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.S0;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e extends i implements f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private AdsNativeView u;
    @m
    private AdsViewModel v;
    @m
    private AdsInterstitialView w;
    @m
    private b x;
    @l
    public static final a y = null;
    @l
    public static final String z = "Interstitial";

    static {
        e.y = new a(null);
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
            super.p0(context0, "Interstitial");
            s00 = S0.a;
        }
        catch(Throwable throwable0) {
            s00 = e0.b(f0.a(throwable0));
        }
        Throwable throwable1 = e0.e(s00);
        if(throwable1 != null) {
            b b0 = this.getListener();
            if(b0 != null) {
                AdsViewModel adsViewModel0 = this.u0();
                b0.onAdFailedToShow(new com.coupang.ads.b((adsViewModel0 == null ? null : adsViewModel0.getRequest()), "showAds failed", throwable1, 0, 8, null));
            }
        }
    }

    @Override  // com.coupang.ads.interstitial.f
    public void d(@m b b0) {
        this.x = b0;
    }

    @Override  // com.coupang.ads.interstitial.f
    @m
    public b getListener() {
        return this.x;
    }

    @Override  // com.coupang.ads.interstitial.i
    public void i0() {
    }

    @Override  // com.coupang.ads.interstitial.i
    public void l0() {
        AdsViewModel adsViewModel0 = this.v;
        if(adsViewModel0 != null) {
            MutableLiveData mutableLiveData0 = adsViewModel0.getDataResult();
            if(mutableLiveData0 != null) {
                DTO dTO0 = (DTO)j.a(mutableLiveData0);
                if(dTO0 != null) {
                    AdsProductPage adsProductPage0 = com.coupang.ads.dto.b.c(dTO0);
                    if(adsProductPage0 != null) {
                        h.e(adsProductPage0);
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
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)this.getViewLifecycleOwnerLiveData().f();
        if(lifecycleOwner0 != null) {
            AdsInterstitialView adsInterstitialView0 = this.w;
            if(adsInterstitialView0 != null) {
                adsInterstitialView0.bindViewModel(lifecycleOwner0, adsViewModel0);
            }
            AdsNativeView adsNativeView0 = this.t0();
            if(adsNativeView0 != null) {
                adsNativeView0.bindViewModel(lifecycleOwner0, adsViewModel0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setAttributes(window0.getAttributes());
            }
        }
    }

    @Override  // com.coupang.ads.interstitial.i
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        return new Dialog(this.requireContext(), style.FullScreenDialog);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        AdsInterstitialView adsInterstitialView0 = this.u;
        if(adsInterstitialView0 == null) {
            View view0 = layoutInflater0.inflate(layout.ads_dialog_interstitial, viewGroup0, false);
            if(view0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.coupang.ads.interstitial.AdsInterstitialView");
            }
            this.w = (AdsInterstitialView)view0;
            return (AdsInterstitialView)view0;
        }
        return adsInterstitialView0;
    }

    @Override  // com.coupang.ads.interstitial.i
    public void onDismiss(@m DialogInterface dialogInterface0) {
        com.coupang.ads.clog.b.a.a("Interstitial", "Interstitial.onDismiss");
        super.onDismiss(dialogInterface0);
        b b0 = this.getListener();
        if(b0 != null) {
            b0.onAdDismissed();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        public static final class com.coupang.ads.interstitial.e.b implements J.i {
            public final class com.coupang.ads.interstitial.e.b.a {
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
                    com.coupang.ads.interstitial.e.b.a.a = arr_v;
                }
            }

            final e a;

            com.coupang.ads.interstitial.e.b(e e0) {
                this.a = e0;
                super();
            }

            @Override  // J.i
            public void onClickPlacement(@m View view0, @l J.f f0, @m AdsProductPage adsProductPage0, @m AdsProduct adsProduct0) {
                L.p(f0, "viewType");
                switch(f0) {
                    case 1: 
                    case 2: 
                    case 3: {
                        this.a.v0(adsProduct0);
                        break;
                    }
                    case 6: {
                        this.a.dismiss();
                        break;
                    }
                    case 7: {
                        if(adsProductPage0 != null) {
                            Context context0 = this.a.requireContext();
                            L.o(context0, "requireContext()");
                            h.b(adsProductPage0, context0);
                        }
                    }
                }
                b b0 = this.a.getListener();
                if(b0 != null) {
                    b0.onClick(f0);
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
                        this.a.v0(adsProduct0);
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
        this.setCancelable(false);
        AdsViewModel adsViewModel0 = this.v;
        if(adsViewModel0 != null) {
            AdsInterstitialView adsInterstitialView0 = this.w;
            if(adsInterstitialView0 != null) {
                adsInterstitialView0.bindViewModel(this.getViewLifecycleOwner(), adsViewModel0);
            }
            AdsNativeView adsNativeView0 = this.t0();
            if(adsNativeView0 != null) {
                adsNativeView0.bindViewModel(this.getViewLifecycleOwner(), adsViewModel0);
            }
        }
        com.coupang.ads.interstitial.e.b e$b0 = new com.coupang.ads.interstitial.e.b(this);
        AdsInterstitialView adsInterstitialView1 = this.w;
        if(adsInterstitialView1 != null) {
            adsInterstitialView1.setOnAdsClickListener(e$b0);
        }
        AdsNativeView adsNativeView1 = this.u;
        if(adsNativeView1 != null) {
            adsNativeView1.setExtOnAdsClickListener(e$b0);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewStateRestored(@m Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(bundle0 != null) {
            try {
                FragmentActivity fragmentActivity0 = this.getActivity();
                if(fragmentActivity0 != null && !fragmentActivity0.isFinishing() && this.getDialog() != null) {
                    this.dismiss();
                }
            }
            catch(IllegalStateException unused_ex) {
            }
        }
    }

    @m
    public final AdsNativeView t0() {
        return this.u;
    }

    @m
    public final AdsViewModel u0() {
        return this.v;
    }

    private final void v0(AdsProduct adsProduct0) {
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
        if(adsProduct0 != null) {
            String s = adsProduct0.getClickUrl();
            if(s != null && s.length() > 0) {
                Context context0 = this.requireContext();
                L.o(context0, "requireContext()");
                h.a(adsProduct0, context0);
            }
        }
    }

    public final void w0(@m AdsNativeView adsNativeView0) {
        this.u = adsNativeView0;
    }
}

