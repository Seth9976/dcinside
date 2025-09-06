package com.dcinside.app.read;

import Q.c;
import Q.e;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.PostReadReplyAdView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.kakao.adfit.ads.na.AdFitAdInfoIconPosition;
import com.kakao.adfit.ads.na.AdFitNativeAdBinder;
import com.kakao.adfit.ads.na.AdFitNativeAdLoader.AdLoadListener;
import com.kakao.adfit.ads.na.AdFitNativeAdLoader;
import com.kakao.adfit.ads.na.AdFitNativeAdRequest.Builder;
import com.kakao.adfit.ads.na.AdFitNativeAdRequest;
import com.kakao.adfit.ads.na.AdFitVideoAutoPlayPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class c0 {
    public static final class a {
        @s0({"SMAP\nReadLoaderNativeAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadLoaderNativeAd.kt\ncom/dcinside/app/read/ReadLoaderNativeAd$Companion$AdfitNativeAdCallback\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,255:1\n177#2,9:256\n*S KotlinDebug\n*F\n+ 1 ReadLoaderNativeAd.kt\ncom/dcinside/app/read/ReadLoaderNativeAd$Companion$AdfitNativeAdCallback\n*L\n232#1:256,9\n*E\n"})
        static final class com.dcinside.app.read.c0.a.a implements AdLoadListener {
            @l
            private final WeakReference a;

            public com.dcinside.app.read.c0.a.a(@l c0 c00) {
                L.p(c00, "ads");
                super();
                this.a = new WeakReference(c00);
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader$AdLoadListener
            public void onAdLoadError(int v) {
                c0 c00 = (c0)this.a.get();
                if(c00 == null) {
                    return;
                }
                if(c00.h) {
                    this.a.clear();
                    return;
                }
                c00.g = 0;
                if(c00.l()) {
                    c00.q();
                    return;
                }
                c00.t();
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader$AdLoadListener
            public void onAdLoaded(@l AdFitNativeAdBinder adFitNativeAdBinder0) {
                L.p(adFitNativeAdBinder0, "binder");
                c0 c00 = (c0)this.a.get();
                if(c00 == null) {
                    return;
                }
                if(c00.h) {
                    this.a.clear();
                    try {
                        adFitNativeAdBinder0.unbind();
                    }
                    catch(Exception unused_ex) {
                    }
                    return;
                }
                c00.d = adFitNativeAdBinder0;
                c00.g = 2;
                c00.t();
            }
        }

        @s0({"SMAP\nReadLoaderNativeAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadLoaderNativeAd.kt\ncom/dcinside/app/read/ReadLoaderNativeAd$Companion$NativeAdCallback\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,255:1\n177#2,9:256\n*S KotlinDebug\n*F\n+ 1 ReadLoaderNativeAd.kt\ncom/dcinside/app/read/ReadLoaderNativeAd$Companion$NativeAdCallback\n*L\n193#1:256,9\n*E\n"})
        static final class b extends AdListener implements OnNativeAdLoadedListener {
            @l
            private final WeakReference c;

            public b(@l c0 c00) {
                L.p(c00, "ads");
                super();
                this.c = new WeakReference(c00);
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(@l LoadAdError loadAdError0) {
                L.p(loadAdError0, "p0");
                c0 c00 = (c0)this.c.get();
                if(c00 == null) {
                    return;
                }
                if(c00.h) {
                    this.c.clear();
                    return;
                }
                c00.g = 0;
                if(c00.l()) {
                    c00.q();
                    return;
                }
                c00.t();
            }

            @Override  // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                c0 c00 = (c0)this.c.get();
                if(c00 == null) {
                    return;
                }
                if(c00.h) {
                    this.c.clear();
                    return;
                }
                c00.g = 2;
                c00.t();
            }

            @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
            public void onNativeAdLoaded(@l NativeAd nativeAd0) {
                L.p(nativeAd0, "p0");
                c0 c00 = (c0)this.c.get();
                if(c00 == null) {
                    return;
                }
                if(c00.h) {
                    this.c.clear();
                    try {
                        nativeAd0.destroy();
                    }
                    catch(Exception unused_ex) {
                    }
                    return;
                }
                c00.c = nativeAd0;
            }
        }

        private a() {
        }

        public a(w w0) {
        }
    }

    public final class com.dcinside.app.read.c0.b {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.read.c0.b.a = arr_v;
        }
    }

    @l
    private WeakReference a;
    @l
    private WeakReference b;
    @m
    private NativeAd c;
    @m
    private AdFitNativeAdBinder d;
    @m
    private I0 e;
    @l
    private ArrayList f;
    private int g;
    private boolean h;
    private boolean i;
    @l
    public static final a j = null;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;

    static {
        c0.j = new a(null);
    }

    public c0(@m Context context0, @m x x0) {
        this.a = new WeakReference(context0);
        this.b = new WeakReference(x0);
        this.f = new ArrayList();
    }

    private final AdRequest i() {
        x x0 = (x)this.b.get();
        if(x0 != null) {
            c c0 = x0.P();
            return c0 == null ? new c(false).d() : c0.d();
        }
        return new c(false).d();
    }

    @m
    public final AdFitNativeAdBinder j() {
        return this.d;
    }

    @m
    public final NativeAd k() {
        return this.c;
    }

    private final boolean l() {
        return !this.f.isEmpty();
    }

    public final boolean m() {
        return this.g == 2;
    }

    public final void n() {
        if(this.h) {
            return;
        }
        if(this.g != 0) {
            return;
        }
        this.f.clear();
        ArrayList arrayList0 = this.f;
        List list0 = jl.a.x();
        arrayList0.addAll(Q.a.d.a(list0));
        if(this.f.isEmpty()) {
            return;
        }
        if(this.l()) {
            this.q();
        }
    }

    private final void o(Context context0, String s) {
        @f(c = "com.dcinside.app.read.ReadLoaderNativeAd$loadAdfit$1", f = "ReadLoaderNativeAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.read.c0.c extends o implements A3.o {
            int k;
            final Context l;
            final String m;
            final AdFitNativeAdRequest n;
            final com.dcinside.app.read.c0.a.a o;

            com.dcinside.app.read.c0.c(Context context0, String s, AdFitNativeAdRequest adFitNativeAdRequest0, com.dcinside.app.read.c0.a.a c0$a$a0, d d0) {
                this.l = context0;
                this.m = s;
                this.n = adFitNativeAdRequest0;
                this.o = c0$a$a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.read.c0.c(this.l, this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.read.c0.c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                AdFitNativeAdLoader.Companion.create(this.l, this.m).loadAd(this.n, this.o);
                return S0.a;
            }
        }

        this.g = 1;
        com.dcinside.app.read.c0.a.a c0$a$a0 = new com.dcinside.app.read.c0.a.a(this);
        AdFitNativeAdRequest adFitNativeAdRequest0 = new Builder().setAdInfoIconPosition(AdFitAdInfoIconPosition.RIGHT_TOP).setVideoAutoPlayPolicy(AdFitVideoAutoPlayPolicy.WIFI_ONLY).build();
        I0 i00 = null;
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        LifecycleCoroutineScope lifecycleCoroutineScope0 = appCompatActivity0 == null ? null : LifecycleOwnerKt.a(appCompatActivity0);
        if(lifecycleCoroutineScope0 != null) {
            i00 = k.f(lifecycleCoroutineScope0, h0.e(), null, new com.dcinside.app.read.c0.c(context0, s, adFitNativeAdRequest0, c0$a$a0, null), 2, null);
        }
        this.e = i00;
    }

    private final void p(Context context0, String s) {
        this.g = 1;
        b c0$a$b0 = new b(this);
        NativeAdOptions nativeAdOptions0 = new com.google.android.gms.ads.nativead.NativeAdOptions.Builder().setRequestCustomMuteThisAd(true).setMediaAspectRatio(2).setAdChoicesPlacement(1).build();
        L.o(nativeAdOptions0, "build(...)");
        new com.google.android.gms.ads.AdLoader.Builder(context0, s).forNativeAd(c0$a$b0).withAdListener(c0$a$b0).withNativeAdOptions(nativeAdOptions0).build().loadAd(this.i());
    }

    private final void q() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            return;
        }
        Q.a a0 = (Q.a)u.N0(this.f);
        if(a0 == null) {
            return;
        }
        switch(a0.c()) {
            case 1: {
                this.p(context0, a0.a());
                return;
            }
            case 2: {
                this.o(context0, a0.a());
            }
        }
    }

    public final boolean r() {
        if(this.i) {
            this.i = false;
            return true;
        }
        return false;
    }

    private final void s(x x0) {
        try {
            S s0 = x0.R();
            if(s0 == null) {
                return;
            }
            int v = s0.k0();
            if(v < 0 || x0.getItemCount() <= v) {
                return;
            }
            C c0 = x0.Q(v);
            L.o(c0, "getItem(...)");
            if(c0.j() != 10000013) {
                return;
            }
            WeakReference weakReference0 = x0.d;
            if(weakReference0 == null) {
                return;
            }
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 == null) {
                return;
            }
            LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
            PostReadReplyAdView postReadReplyAdView0 = null;
            LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
            if(linearLayoutManager0 == null) {
                return;
            }
            View view0 = linearLayoutManager0.c0(v);
            if(view0 instanceof PostReadReplyAdView) {
                postReadReplyAdView0 = (PostReadReplyAdView)view0;
            }
            if(postReadReplyAdView0 != null) {
                postReadReplyAdView0.f(this);
            }
        }
        catch(Exception exception0) {
            zk.a(exception0);
        }
    }

    private final void t() {
        x x0 = (x)this.b.get();
        if(x0 == null) {
            return;
        }
        x0.O0(() -> {
            L.p(this, "this$0");
            L.p(x0, "$adt");
            this.s(x0);
        });
    }

    // 检测为 Lambda 实现
    private static final void u(c0 c00, x x0) [...]

    public final void v() {
        NativeAd nativeAd0 = this.c;
        if(nativeAd0 != null || this.d != null) {
            this.i = true;
        }
        if(nativeAd0 != null) {
            nativeAd0.destroy();
        }
        this.c = null;
        I0 i00 = this.e;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.e = null;
        AdFitNativeAdBinder adFitNativeAdBinder0 = this.d;
        if(adFitNativeAdBinder0 != null) {
            adFitNativeAdBinder0.unbind();
        }
        this.d = null;
        this.g = 0;
    }

    public final void w() {
        this.h = true;
        NativeAd nativeAd0 = this.c;
        if(nativeAd0 != null) {
            nativeAd0.destroy();
        }
        this.c = null;
        I0 i00 = this.e;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.e = null;
        AdFitNativeAdBinder adFitNativeAdBinder0 = this.d;
        if(adFitNativeAdBinder0 != null) {
            adFitNativeAdBinder0.unbind();
        }
        this.d = null;
        this.a.clear();
        this.b.clear();
    }
}

