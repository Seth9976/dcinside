package com.kakao.adfit.ads.na;

import android.os.Looper;
import com.kakao.adfit.ads.R.id;
import com.kakao.adfit.c.b;
import com.kakao.adfit.m.f;
import kotlin.J;
import kotlin.jvm.internal.L;

public final class a extends AdFitNativeAdBinder {
    public abstract class com.kakao.adfit.ads.na.a.a {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] arr_v = new int[AdFitVideoAutoPlayPolicy.values().length];
            try {
                arr_v[AdFitVideoAutoPlayPolicy.NONE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AdFitVideoAutoPlayPolicy.WIFI_ONLY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AdFitVideoAutoPlayPolicy.ALWAYS.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.kakao.adfit.ads.na.a.a.a = arr_v;
            int[] arr_v1 = new int[AdFitAdInfoIconPosition.values().length];
            try {
                arr_v1[AdFitAdInfoIconPosition.LEFT_TOP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[AdFitAdInfoIconPosition.LEFT_BOTTOM.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[AdFitAdInfoIconPosition.RIGHT_TOP.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[AdFitAdInfoIconPosition.RIGHT_BOTTOM.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.kakao.adfit.ads.na.a.a.b = arr_v1;
        }
    }

    private final m a;
    private final d b;
    private final String c;
    private OnAdClickListener d;
    private final b e;
    private final int f;
    private com.kakao.adfit.ads.na.b g;

    public a(AdFitNativeAdRequest adFitNativeAdRequest0, m m0, d d0) {
        L.p(adFitNativeAdRequest0, "request");
        int v1;
        L.p(m0, "nativeAd");
        L.p(d0, "imageContainer");
        super();
        this.a = m0;
        this.b = d0;
        String s = "AdFit" + m0.j() + '@' + this.hashCode();
        this.c = s;
        b b0 = new b();
        switch(adFitNativeAdRequest0.getVideoAutoPlayPolicy()) {
            case 1: {
                b0.b(false);
                b0.a(false);
                break;
            }
            case 2: {
                b0.b(true);
                b0.a(false);
                break;
            }
            case 3: {
                b0.b(true);
                b0.a(true);
            }
        }
        this.e = b0;
        int v = com.kakao.adfit.ads.na.a.a.b[adFitNativeAdRequest0.getAdInfoIconPosition().ordinal()];
        switch(v) {
            case 1: {
                v1 = 51;
                break;
            }
            case 2: {
                v1 = 83;
                break;
            }
            case 3: {
                v1 = 53;
                break;
            }
            default: {
                if(v != 4) {
                    throw new J();
                }
                v1 = 85;
                break;
            }
        }
        this.f = v1;
        f.a((s + " is created."));
    }

    private final AdFitNativeAdBinder a(AdFitNativeAdLayout adFitNativeAdLayout0) {
        Object object0 = adFitNativeAdLayout0.getContainerView().getTag(id.adfit_binder);
        return object0 instanceof AdFitNativeAdBinder ? ((AdFitNativeAdBinder)object0) : null;
    }

    private final void a(AdFitNativeAdLayout adFitNativeAdLayout0, AdFitNativeAdBinder adFitNativeAdBinder0) {
        adFitNativeAdLayout0.getContainerView().setTag(id.adfit_binder, adFitNativeAdBinder0);
    }

    private final boolean a() {
        return this.g != null;
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder
    public void bind(AdFitNativeAdLayout adFitNativeAdLayout0) {
        L.p(adFitNativeAdLayout0, "layout");
        if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
            throw new RuntimeException("Must be called from the main thread.");
        }
        if(this.a() && (L.g((this.g == null ? null : this.g.a()), adFitNativeAdLayout0) && L.g(this.a(adFitNativeAdLayout0), this))) {
            f.d((this.c + " is already bound. [layout = " + adFitNativeAdLayout0.getName$library_networkRelease() + ']'));
            return;
        }
        this.unbind();
        AdFitNativeAdBinder adFitNativeAdBinder0 = this.a(adFitNativeAdLayout0);
        if(adFitNativeAdBinder0 != null) {
            adFitNativeAdBinder0.unbind();
        }
        this.a(adFitNativeAdLayout0, this);
        adFitNativeAdLayout0.setAdUnitId$library_networkRelease(this.a.c());
        this.g = new com.kakao.adfit.ads.na.b(this, adFitNativeAdLayout0, this.a, this.b, this.e, this.f);
        f.a((this.c + " is bound. [layout = " + adFitNativeAdLayout0.getName$library_networkRelease() + ']'));
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder
    public void bind(AdFitNativeAdTemplateLayout adFitNativeAdTemplateLayout0) {
        L.p(adFitNativeAdTemplateLayout0, "layout");
        this.bind(adFitNativeAdTemplateLayout0.getNativeAdLayout());
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder
    public OnAdClickListener getOnAdClickListener() {
        return this.d;
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder
    public void setOnAdClickListener(OnAdClickListener adFitNativeAdBinder$OnAdClickListener0) {
        this.d = adFitNativeAdBinder$OnAdClickListener0;
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdBinder
    public void unbind() {
        if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
            throw new RuntimeException("Must be called from the main thread.");
        }
        com.kakao.adfit.ads.na.b b0 = this.g;
        if(b0 == null) {
            return;
        }
        this.g = null;
        this.a(b0.a(), null);
        b0.b();
        f.a((this.c + " is unbound. [layout = " + b0.a().getName$library_networkRelease() + ']'));
    }
}

