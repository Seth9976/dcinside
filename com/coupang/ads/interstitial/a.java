package com.coupang.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.coupang.ads.custom.AdsNativeView;
import com.coupang.ads.tools.d;
import com.coupang.ads.viewmodels.AdsViewModel;
import kotlin.e0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class a implements f {
    @m
    private AdsNativeView a;
    @m
    private AdsViewModel b;
    @m
    private f c;
    @m
    private b d;

    public a() {
        this(null, 1, null);
    }

    public a(@m AdsNativeView adsNativeView0) {
        this.a = adsNativeView0;
    }

    public a(AdsNativeView adsNativeView0, int v, w w0) {
        if((v & 1) != 0) {
            adsNativeView0 = null;
        }
        this(adsNativeView0);
    }

    @Override  // com.coupang.ads.interstitial.f
    public boolean C() {
        AdsViewModel adsViewModel0 = this.b;
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
        Activity activity0 = d.d(context0);
        if(activity0 == null) {
            b b0 = this.getListener();
            if(b0 != null) {
                b0.onAdFailedToShow(new com.coupang.ads.b(null, "actualContext require Activity but is " + null, null, 0, 12, null));
            }
            return;
        }
        if(activity0 instanceof FragmentActivity) {
            f f0 = this.c;
            if(!(f0 instanceof e)) {
                if(f0 != null) {
                    f0.d(null);
                }
                f f1 = this.c;
                if(f1 != null) {
                    f1.dismiss();
                }
                e e0 = new e();
                e0.w0(this.a());
                e0.d(this.getListener());
                AdsViewModel adsViewModel0 = this.b();
                if(adsViewModel0 != null) {
                    e0.m(adsViewModel0);
                }
                this.c = e0;
            }
        }
        else {
            f f2 = this.c;
            if(!(f2 instanceof com.coupang.ads.interstitial.d)) {
                if(f2 != null) {
                    f2.d(null);
                }
                f f3 = this.c;
                if(f3 != null) {
                    f3.dismiss();
                }
                com.coupang.ads.interstitial.d d0 = new com.coupang.ads.interstitial.d();
                d0.B(this.a());
                d0.d(this.getListener());
                AdsViewModel adsViewModel1 = this.b();
                if(adsViewModel1 != null) {
                    d0.m(adsViewModel1);
                }
                this.c = d0;
            }
        }
        f f4 = this.c;
        if(f4 != null) {
            f4.X(context0);
        }
    }

    @m
    public final AdsNativeView a() {
        return this.a;
    }

    @m
    public final AdsViewModel b() {
        return this.b;
    }

    public final void c(@m AdsNativeView adsNativeView0) {
        this.a = adsNativeView0;
    }

    @Override  // com.coupang.ads.interstitial.f
    public void d(@m b b0) {
        this.d = b0;
        f f0 = this.c;
        if(f0 != null) {
            f0.d(b0);
        }
    }

    @Override  // com.coupang.ads.interstitial.f
    public void dismiss() {
        f f0 = this.c;
        if(f0 != null) {
            f0.dismiss();
        }
    }

    @Override  // com.coupang.ads.interstitial.f
    @m
    public b getListener() {
        return this.d;
    }

    @Override  // com.coupang.ads.interstitial.f
    public void m(@l AdsViewModel adsViewModel0) {
        L.p(adsViewModel0, "viewModel");
        this.b = adsViewModel0;
        f f0 = this.c;
        if(f0 != null) {
            f0.m(adsViewModel0);
        }
    }
}

