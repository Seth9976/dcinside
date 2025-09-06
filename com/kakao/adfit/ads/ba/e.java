package com.kakao.adfit.ads.ba;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import com.kakao.adfit.a.l;
import com.kakao.adfit.a.m;
import com.kakao.adfit.a.t;
import com.kakao.adfit.ads.AdError;
import com.kakao.adfit.ads.AdListener;
import com.kakao.adfit.b.a;
import com.kakao.adfit.b.b;
import com.kakao.adfit.b.c;
import com.kakao.adfit.m.H;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.g;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;

public final class e {
    private final b a;
    private final a b;
    private d c;
    private final g d;
    private final com.kakao.adfit.b.d e;
    private final c f;
    private final Handler g;
    private final Runnable h;
    private long i;
    private long j;
    private H k;

    public e(b b0, a a0) {
        static final class j extends N implements A3.a {
            final e a;

            j(e e0) {
                this.a = e0;
                super(0);
            }

            public final void a() {
                this.a.m();
            }

            @Override  // A3.a
            public Object invoke() {
                this.a();
                return S0.a;
            }
        }


        static final class k extends N implements A3.a {
            final e a;

            k(e e0) {
                this.a = e0;
                super(0);
            }

            public final void a() {
                this.a.m();
            }

            @Override  // A3.a
            public Object invoke() {
                this.a();
                return S0.a;
            }
        }

        L.p(b0, "view");
        L.p(a0, "config");
        super();
        this.a = b0;
        this.b = a0;
        this.d = new g(new k(this));
        this.e = new com.kakao.adfit.b.d();
        this.f = new c(new j(this));
        this.g = new Handler(Looper.getMainLooper());
        this.h = () -> {
            L.p(this, "this$0");
            e.a(this, false, 1, null);
        };
    }

    public e(b b0, a a0, int v, w w0) {
        if((v & 2) != 0) {
            a0 = new a(b0);
        }
        this(b0, a0);
    }

    private final void a(d d0, A3.a a0) {
        static final class com.kakao.adfit.ads.ba.e.a extends N implements A3.a {
            public static final com.kakao.adfit.ads.ba.e.a a;

            static {
                com.kakao.adfit.ads.ba.e.a.a = new com.kakao.adfit.ads.ba.e.a();
            }

            com.kakao.adfit.ads.ba.e.a() {
                super(0);
            }

            public final void a() {
            }

            @Override  // A3.a
            public Object invoke() {
                return S0.a;
            }
        }

        this.a(d0, com.kakao.adfit.ads.ba.e.a.a, a0);
    }

    private final void a(d d0, A3.a a0, A3.a a1) {
        static final class com.kakao.adfit.ads.ba.e.b extends N implements A3.a {
            final e a;
            final A3.a b;

            com.kakao.adfit.ads.ba.e.b(e e0, A3.a a0) {
                this.a = e0;
                this.b = a0;
                super(0);
            }

            public final void a() {
                this.a.k = null;
                this.b.invoke();
            }

            @Override  // A3.a
            public Object invoke() {
                this.a();
                return S0.a;
            }
        }

        H h0 = this.k;
        if(h0 != null) {
            h0.c();
        }
        com.kakao.adfit.ads.ba.e.b e$b0 = new com.kakao.adfit.ads.ba.e.b(this, a1);
        H h1 = this.a.a(d0, a0, e$b0);
        this.k = h1;
        if(this.f.a() && this.d.d()) {
            h1.b();
        }
    }

    static void a(e e0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        e0.a(z);
    }

    private final void a(String s) {
        this.f.d(false);
        f.a((this.f() + " loading is finished. " + s + " [elapsed = " + this.e() + "ms]"));
    }

    private final void a(boolean z) {
        static final class h extends N implements A3.a {
            final e a;

            h(e e0) {
                this.a = e0;
                super(0);
            }

            public final void a() {
                this.a.a(true);
            }

            @Override  // A3.a
            public Object invoke() {
                this.a();
                return S0.a;
            }
        }


        static final class i extends o implements A3.o {
            int a;
            final e b;
            final String c;

            i(e e0, String s, kotlin.coroutines.d d0) {
                this.b = e0;
                this.c = s;
                super(2, d0);
            }

            public final Object a(O o0, kotlin.coroutines.d d0) {
                return ((i)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object object0, kotlin.coroutines.d d0) {
                return new i(this.b, this.c, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.ads.ba.e.i.a extends N implements Function1 {
                    final String a;
                    final d b;

                    com.kakao.adfit.ads.ba.e.i.a(String s, d d0) {
                        this.a = s;
                        this.b = d0;
                        super(1);
                    }

                    public final void a(com.kakao.adfit.a.d.c d$c0) {
                        com.kakao.adfit.ads.ba.f.a.a(this.a, this.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.kakao.adfit.a.d.c)object0));
                        return S0.a;
                    }
                }


                static final class com.kakao.adfit.ads.ba.e.i.b extends N implements Function1 {
                    final String a;
                    final d b;

                    com.kakao.adfit.ads.ba.e.i.b(String s, d d0) {
                        this.a = s;
                        this.b = d0;
                        super(1);
                    }

                    public final void a(com.kakao.adfit.a.d.c d$c0) {
                        com.kakao.adfit.ads.ba.f.a.a(this.a, this.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.kakao.adfit.a.d.c)object0));
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.a) {
                    case 0: {
                        f0.n(object0);
                        String s = this.b.a.getName();
                        this.a = 1;
                        object0 = l.a(this.b.e, s, this.b.b, 0, this, 4, null);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                Long long0 = null;
                if(((com.kakao.adfit.a.k)object0) instanceof m) {
                    Context context0 = this.b.a.getContext().getApplicationContext();
                    String s1 = ((m)(((com.kakao.adfit.a.k)object0))).b();
                    com.kakao.adfit.ads.ba.b b0 = (com.kakao.adfit.ads.ba.b)u.B2(((m)(((com.kakao.adfit.a.k)object0))).a());
                    t t0 = ((m)(((com.kakao.adfit.a.k)object0))).c();
                    L.o(context0, "context");
                    com.kakao.adfit.a.c c0 = new com.kakao.adfit.a.c(context0, b0, new com.kakao.adfit.a.e(context0, s1, this.c, b0.c()));
                    d d0 = new d(this.c, b0.d(), b0.b(), b0.e(), c0, t0);
                    if(t0 != null) {
                        long0 = t0.b();
                    }
                    if(long0 != null && ((long)long0) > 0L) {
                        com.kakao.adfit.ads.ba.f.a.a(this.c, d0, ((long)long0));
                        com.kakao.adfit.a.c c1 = d0.c();
                        c1.d().b(new com.kakao.adfit.ads.ba.e.i.a(this.c, d0));
                        c1.b().b(new com.kakao.adfit.ads.ba.e.i.b(this.c, d0));
                    }
                    com.kakao.adfit.m.i.a(com.kakao.adfit.m.i.a, this.b.b.getContext(), t0, null, 4, null);
                    this.b.c = d0;
                    if(d0.e() != null) {
                        this.b.a(((long)d0.e()));
                    }
                    this.b.a("Receive a banner ad: " + b0.d());
                    this.b.b(d0);
                    return S0.a;
                }
                if(((com.kakao.adfit.a.k)object0) instanceof com.kakao.adfit.a.j) {
                    int v = ((com.kakao.adfit.a.j)(((com.kakao.adfit.a.k)object0))).a().getErrorCode();
                    String s2 = ((com.kakao.adfit.a.j)(((com.kakao.adfit.a.k)object0))).b();
                    this.b.a("Failed to receive a banner ad: " + v + ", " + s2);
                    this.b.a(null, v, s2);
                }
                return S0.a;
            }
        }

        if(!this.f.a()) {
            return;
        }
        if(this.i() > 0L && !this.j()) {
            this.q();
            return;
        }
        if(this.c != null) {
            if(this.g() <= 0L) {
                return;
            }
            if(this.j <= 0L) {
                return;
            }
            if(!z) {
                if(this.k == null) {
                    d d0 = this.c;
                    L.m(d0);
                    this.a(d0, new h(this));
                }
                return;
            }
        }
        else if(this.h() > 0) {
            Context context0 = this.a.getContext();
            Activity activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
            if(activity0 != null) {
                if(activity0 instanceof LifecycleOwner) {
                    State lifecycle$State0 = ((LifecycleOwner)activity0).getLifecycle().b();
                    L.o(lifecycle$State0, "activity.lifecycle.currentState");
                    if(!lifecycle$State0.b(State.d)) {
                        f.e(("Activity is not started. [clientId = " + this.b.j() + "] [activity = " + activity0.getClass().getName() + "] [state = " + lifecycle$State0 + ']'));
                        f.b("AdFit publisher should call \"pause()\" API when \"BannerAdView\" is running in the background.");
                        this.p();
                        return;
                    }
                }
                else if(!com.kakao.adfit.m.b.a.a(activity0)) {
                    f.e(("Activity is not started. [clientId = " + this.b.j() + "] [activity = " + activity0.getClass().getName() + ']'));
                    f.b("AdFit publisher should call \"pause()\" API when \"BannerAdView\" is running in the background.");
                    this.p();
                    return;
                }
            }
        }
        String s = this.b.j();
        if(s != null && !v.x3(s)) {
            com.kakao.adfit.ads.ba.f.a f$a0 = com.kakao.adfit.ads.ba.f.a.a(s);
            if(f$a0 != null) {
                f.a((f$a0.b() + " is cached."));
                this.i = SystemClock.elapsedRealtime();
                this.j = 0L;
                d d1 = f$a0.a();
                this.c = d1;
                if(d1.e() != null) {
                    this.a(((long)d1.e()));
                }
                this.b(d1);
                return;
            }
            f.c("Request Banner AD");
            f.a((this.a.getName() + " loading is started."));
            this.f.d(true);
            this.a(this.h() + 1);
            this.i = SystemClock.elapsedRealtime();
            this.j = 0L;
            kotlinx.coroutines.k.f(P.a(j1.c(null, 1, null).plus(h0.e().u1())), null, null, new i(this, s, null), 3, null);
            return;
        }
        this.a(null, AdError.UNKNOWN_CLIENT_ID, "\"clientId\" is null");
    }

    public void a() {
        String s = this.c();
        if(s != null && !v.x3(s)) {
            if(!this.f.b()) {
                this.f.b(true);
            }
            return;
        }
        L.o("UNKNOWN_CLIENT_ID(There\'s no client id in your app. Please provide a valid \'clientId\' attribute in the \'com.kakao.adfit.ads.ba.BannerAdView\' tag of layout XML. For example, clientId=\"yourClientId\". Or you can use setClientId() method.)", "UNKNOWN_CLIENT_ID.toString()");
        f.b("UNKNOWN_CLIENT_ID(There\'s no client id in your app. Please provide a valid \'clientId\' attribute in the \'com.kakao.adfit.ads.ba.BannerAdView\' tag of layout XML. For example, clientId=\"yourClientId\". Or you can use setClientId() method.)");
    }

    public void a(int v) {
        this.b.b(v);
    }

    public void a(long v) {
        this.b.a(v);
    }

    public void a(AdListener adListener0) {
        this.b.a(adListener0);
    }

    public void a(d d0) {
        static final class com.kakao.adfit.ads.ba.e.c extends N implements A3.a {
            final e a;
            final d b;

            com.kakao.adfit.ads.ba.e.c(e e0, d d0) {
                this.a = e0;
                this.b = d0;
                super(0);
            }

            public final com.kakao.adfit.a.d a() {
                com.kakao.adfit.a.d.a d$a0 = this.a.a.g();
                return com.kakao.adfit.a.d.b.a(this.a.a, this.b.c(), d$a0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        L.p(d0, "bannerAd");
        d0.c().a().a(new com.kakao.adfit.ads.ba.e.c(this, d0));
        this.b.m();
    }

    public void a(d d0, int v, String s) {
        L.p(s, "message");
        if(d0 != null) {
            com.kakao.adfit.ads.ba.f.a.a(d0.a(), d0);
        }
        this.b.a(v);
        this.j = this.i + this.g();
        this.q();
    }

    public void a(d d0, AdError adError0, String s) {
        L.p(adError0, "error");
        L.p(s, "message");
        this.a(d0, adError0.getErrorCode(), s);
    }

    public void a(String s, String s1) {
        this.b.a(s, s1);
    }

    public String b() {
        return this.b.j();
    }

    public void b(int v) {
        this.b.c(v);
    }

    public void b(d d0) {
        L.p(d0, "bannerAd");
        this.a.a(d0);
    }

    public void b(String s) {
        this.b.a(s);
    }

    public void b(boolean z) {
        this.b.a(z);
    }

    public String c() {
        return this.b.g();
    }

    public void c(d d0) {
        static final class com.kakao.adfit.ads.ba.e.d extends N implements A3.a {
            final e a;
            final d b;

            com.kakao.adfit.ads.ba.e.d(e e0, d d0) {
                this.a = e0;
                this.b = d0;
                super(0);
            }

            public final com.kakao.adfit.a.d a() {
                return com.kakao.adfit.a.d.b.a(this.a.a, this.b.c());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        L.p(d0, "bannerAd");
        if(d0.c().c().e()) {
            return;
        }
        d0.c().c().a(new com.kakao.adfit.ads.ba.e.d(this, d0));
    }

    public Bundle d() {
        return this.b.k();
    }

    public void d(d d0) {
        static final class com.kakao.adfit.ads.ba.e.e extends N implements A3.a {
            final e a;
            final d b;

            com.kakao.adfit.ads.ba.e.e(e e0, d d0) {
                this.a = e0;
                this.b = d0;
                super(0);
            }

            public final void a() {
                this.a.c(this.b);
            }

            @Override  // A3.a
            public Object invoke() {
                this.a();
                return S0.a;
            }
        }


        static final class com.kakao.adfit.ads.ba.e.f extends N implements A3.a {
            final e a;
            final d b;

            com.kakao.adfit.ads.ba.e.f(e e0, d d0) {
                this.a = e0;
                this.b = d0;
                super(0);
            }

            public final void a() {
                this.a.e(this.b);
            }

            @Override  // A3.a
            public Object invoke() {
                this.a();
                return S0.a;
            }
        }

        L.p(d0, "bannerAd");
        this.b.n();
        this.a(d0, new com.kakao.adfit.ads.ba.e.e(this, d0), new com.kakao.adfit.ads.ba.e.f(this, d0));
    }

    private final long e() {
        return SystemClock.elapsedRealtime() - this.i;
    }

    // 检测为 Lambda 实现
    private static final void e(e e0) [...]

    public void e(d d0) {
        static final class com.kakao.adfit.ads.ba.e.g extends N implements A3.a {
            final e a;
            final d b;

            com.kakao.adfit.ads.ba.e.g(e e0, d d0) {
                this.a = e0;
                this.b = d0;
                super(0);
            }

            public final com.kakao.adfit.a.d a() {
                return com.kakao.adfit.a.d.b.a(this.a.a, this.b.c());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        L.p(d0, "bannerAd");
        if(d0.c().d().e()) {
            return;
        }
        d0.c().d().a(new com.kakao.adfit.ads.ba.e.g(this, d0));
        this.j = SystemClock.elapsedRealtime() + this.g();
        this.q();
    }

    private final String f() {
        return this.a.getName();
    }

    public long g() {
        return this.b.d();
    }

    public int h() {
        return this.b.a();
    }

    private final long i() {
        return this.j - SystemClock.elapsedRealtime();
    }

    public boolean j() {
        return this.b.i();
    }

    public void k() {
        boolean z = this.a.b();
        if(this.d.c() == z) {
            return;
        }
        this.d.a(z);
        if(z) {
            boolean z1 = this.a.e();
            this.d.e(z1);
            boolean z2 = this.a.f();
            this.d.f(z2);
            boolean z3 = this.a.a();
            this.d.d(z3);
            boolean z4 = this.a.c() > 0 && this.a.d() > 0;
            this.d.c(z4);
        }
    }

    public void l() {
        boolean z = this.a.c() > 0 && this.a.d() > 0;
        this.d.c(z);
    }

    private final void m() {
        if(this.f.a()) {
            this.q();
        }
        else {
            this.s();
        }
        if(!this.f.a() || !this.d.d()) {
            H h1 = this.k;
            if(h1 != null) {
                h1.c();
            }
        }
        else {
            H h0 = this.k;
            if(h0 != null) {
                h0.b();
            }
        }
    }

    public void n() {
        boolean z = this.a.e();
        this.d.e(z);
    }

    public void o() {
        boolean z = this.a.a();
        this.d.d(z);
    }

    public void p() {
        this.f.c(true);
    }

    private final void q() {
        this.g.removeCallbacks(this.h);
        long v = Math.max(this.i(), 0L);
        this.g.postDelayed(this.h, v);
    }

    public void r() {
        this.f.c(false);
    }

    private final void s() {
        this.g.removeCallbacks(this.h);
    }

    public void t() {
        if(!this.f.e()) {
            this.f.e(true);
            this.a.h();
        }
    }
}

