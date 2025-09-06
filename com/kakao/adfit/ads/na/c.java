package com.kakao.adfit.ads.na;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.kakao.adfit.a.l;
import com.kakao.adfit.a.t;
import com.kakao.adfit.ads.AdError;
import com.kakao.adfit.e.h;
import com.kakao.adfit.e.i;
import com.kakao.adfit.e.j;
import com.kakao.adfit.m.A;
import com.kakao.adfit.m.C;
import com.kakao.adfit.m.f;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;

public final class c extends AdFitNativeAdLoader {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final AdFitNativeAdLoader a(Context context0, String s) {
            L.p(context0, "context");
            L.p(s, "adUnitId");
            A.a.b(context0);
            return new c(context0, s, null);
        }
    }

    private final String a;
    private final String b;
    private final WeakReference c;
    private final i d;
    private final j e;
    private C f;
    private long g;
    public static final a h;

    static {
        c.h = new a(null);
    }

    private c(Context context0, String s) {
        this.a = s;
        String s1 = "AdFitNativeAdLoader(\"" + s + "\")@" + this.hashCode();
        this.b = s1;
        this.c = new WeakReference(context0);
        this.d = new i();
        this.e = new j(context0, s);
        f.a((s1 + " is created."));
    }

    public c(Context context0, String s, w w0) {
        this(context0, s);
    }

    private final long a() {
        return SystemClock.elapsedRealtime() - this.g;
    }

    private final h a(Context context0, AdFitNativeAdRequest adFitNativeAdRequest0) {
        static final class b extends N implements A3.a {
            public static final b a;

            static {
                b.a = new b();
            }

            b() {
                super(0);
            }

            // 去混淆评级： 低(20)
            public final Boolean a() {
                return com.kakao.adfit.m.b.a.b() || com.kakao.adfit.m.b.a.a();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.a();
            }
        }

        h h0 = new h(context0);
        h0.a(this.a);
        h0.a(b.a);
        h0.a(adFitNativeAdRequest0.getTestModeEnabled());
        return h0;
    }

    private final Object a(Context context0, m m0, d d0) {
        static final class g extends kotlin.coroutines.jvm.internal.d {
            Object a;
            Object b;
            final c c;
            int d;

            g(c c0, d d0) {
                this.c = c0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                this.b = object0;
                this.d |= 0x80000000;
                return this.c.a(null, null, this);
            }
        }

        com.kakao.adfit.ads.na.d d2;
        g c$g0;
        if(d0 instanceof g) {
            c$g0 = (g)d0;
            int v = c$g0.d;
            if((v & 0x80000000) == 0) {
                c$g0 = new g(this, d0);
            }
            else {
                c$g0.d = v ^ 0x80000000;
            }
        }
        else {
            c$g0 = new g(this, d0);
        }
        Object object0 = c$g0.b;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(c$g0.d) {
            case 0: {
                f0.n(object0);
                com.kakao.adfit.ads.na.d d1 = new com.kakao.adfit.ads.na.d(context0);
                c$g0.a = d1;
                c$g0.d = 1;
                Object object2 = d1.a(m0, c$g0);
                if(object2 == object1) {
                    return object1;
                }
                object0 = object2;
                d2 = d1;
                goto label_25;
            }
            case 1: {
                d2 = (com.kakao.adfit.ads.na.d)c$g0.a;
                f0.n(object0);
            label_25:
                c$g0.a = d2;
                c$g0.d = 2;
                object0 = k.H1(((kotlinx.coroutines.flow.i)object0), c$g0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                d2 = (com.kakao.adfit.ads.na.d)c$g0.a;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return !((Boolean)object0).booleanValue() ? null : d2;
    }

    private final Object a(C c0, int v, String s, AdLoadListener adFitNativeAdLoader$AdLoadListener0, d d0) {
        static final class e extends kotlin.coroutines.jvm.internal.d {
            Object a;
            Object b;
            Object c;
            Object d;
            int e;
            Object f;
            final c g;
            int h;

            e(c c0, d d0) {
                this.g = c0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                this.f = object0;
                this.h |= 0x80000000;
                return this.g.a(null, 0, null, null, this);
            }
        }

        c c2;
        C c1;
        e c$e0;
        if(d0 instanceof e) {
            c$e0 = (e)d0;
            int v1 = c$e0.h;
            if((v1 & 0x80000000) == 0) {
                c$e0 = new e(this, d0);
            }
            else {
                c$e0.h = v1 ^ 0x80000000;
            }
        }
        else {
            c$e0 = new e(this, d0);
        }
        Object object0 = c$e0.f;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(c$e0.h) {
            case 0: {
                f0.n(object0);
                c$e0.a = c0;
                c$e0.b = s;
                c$e0.c = adFitNativeAdLoader$AdLoadListener0;
                c$e0.d = this;
                c$e0.e = v;
                c$e0.h = 1;
                object0 = c0.b(c$e0);
                if(object0 == object1) {
                    return object1;
                }
                c1 = c0;
                c2 = this;
                break;
            }
            case 1: {
                v = c$e0.e;
                c2 = (c)c$e0.d;
                adFitNativeAdLoader$AdLoadListener0 = (AdLoadListener)c$e0.c;
                s = (String)c$e0.b;
                c1 = (C)c$e0.a;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue() && L.g(c2.f, c1)) {
            c2.f = null;
            f.a((c2.b + " loading is finished. " + s + " [elapsed = " + c2.a() + "ms]"));
            com.kakao.adfit.common.matrix.c c3 = com.kakao.adfit.common.matrix.c.a;
            try {
                adFitNativeAdLoader$AdLoadListener0.onAdLoadError(v);
                return S0.a;
            }
            catch(Throwable throwable0) {
                throw c3.b(throwable0);
            }
        }
        return S0.a;
    }

    private final Object a(C c0, AdFitNativeAdBinder adFitNativeAdBinder0, String s, AdLoadListener adFitNativeAdLoader$AdLoadListener0, d d0) {
        static final class com.kakao.adfit.ads.na.c.f extends kotlin.coroutines.jvm.internal.d {
            Object a;
            Object b;
            Object c;
            Object d;
            Object e;
            Object f;
            final c g;
            int h;

            com.kakao.adfit.ads.na.c.f(c c0, d d0) {
                this.g = c0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                this.f = object0;
                this.h |= 0x80000000;
                return this.g.a(null, null, null, null, this);
            }
        }

        c c2;
        C c1;
        com.kakao.adfit.ads.na.c.f c$f0;
        if(d0 instanceof com.kakao.adfit.ads.na.c.f) {
            c$f0 = (com.kakao.adfit.ads.na.c.f)d0;
            int v = c$f0.h;
            if((v & 0x80000000) == 0) {
                c$f0 = new com.kakao.adfit.ads.na.c.f(this, d0);
            }
            else {
                c$f0.h = v ^ 0x80000000;
            }
        }
        else {
            c$f0 = new com.kakao.adfit.ads.na.c.f(this, d0);
        }
        Object object0 = c$f0.f;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(c$f0.h) {
            case 0: {
                f0.n(object0);
                c$f0.a = c0;
                c$f0.b = adFitNativeAdBinder0;
                c$f0.c = s;
                c$f0.d = adFitNativeAdLoader$AdLoadListener0;
                c$f0.e = this;
                c$f0.h = 1;
                object0 = c0.b(c$f0);
                if(object0 == object1) {
                    return object1;
                }
                c1 = c0;
                c2 = this;
                break;
            }
            case 1: {
                c2 = (c)c$f0.e;
                adFitNativeAdLoader$AdLoadListener0 = (AdLoadListener)c$f0.d;
                s = (String)c$f0.c;
                adFitNativeAdBinder0 = (AdFitNativeAdBinder)c$f0.b;
                c1 = (C)c$f0.a;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue() && L.g(c2.f, c1)) {
            c2.f = null;
            f.a((c2.b + " loading is finished. " + s + " [elapsed = " + c2.a() + "ms]"));
            com.kakao.adfit.common.matrix.c c3 = com.kakao.adfit.common.matrix.c.a;
            try {
                adFitNativeAdLoader$AdLoadListener0.onAdLoaded(adFitNativeAdBinder0);
                return S0.a;
            }
            catch(Throwable throwable0) {
                throw c3.b(throwable0);
            }
        }
        return S0.a;
    }

    public final String b() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader
    public boolean isLoading() {
        return this.f != null && this.f.c();
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdLoader
    public boolean loadAd(AdFitNativeAdRequest adFitNativeAdRequest0, AdLoadListener adFitNativeAdLoader$AdLoadListener0) {
        static final class com.kakao.adfit.ads.na.c.c extends o implements A3.o {
            int a;
            Object b;
            final c c;
            final Context d;
            final m e;
            final AdLoadListener f;
            final AdFitNativeAdRequest g;

            com.kakao.adfit.ads.na.c.c(c c0, Context context0, m m0, AdLoadListener adFitNativeAdLoader$AdLoadListener0, AdFitNativeAdRequest adFitNativeAdRequest0, d d0) {
                this.c = c0;
                this.d = context0;
                this.e = m0;
                this.f = adFitNativeAdLoader$AdLoadListener0;
                this.g = adFitNativeAdRequest0;
                super(2, d0);
            }

            public final Object a(C c0, d d0) {
                return ((com.kakao.adfit.ads.na.c.c)this.create(c0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new com.kakao.adfit.ads.na.c.c(this.c, this.d, this.e, this.f, this.g, d0);
                d1.b = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((C)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                C c0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.a) {
                    case 0: {
                        f0.n(object0);
                        c0 = (C)this.b;
                        this.b = c0;
                        this.a = 1;
                        object0 = this.c.a(this.d, this.e, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        c0 = (C)this.b;
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((com.kakao.adfit.ads.na.d)object0) == null) {
                    this.b = null;
                    this.a = 2;
                    return this.c.a(c0, AdError.NO_AD.getErrorCode(), "Preparing failed.", this.f, this) == object1 ? object1 : S0.a;
                }
                com.kakao.adfit.ads.na.a a0 = new com.kakao.adfit.ads.na.a(this.g, this.e, ((com.kakao.adfit.ads.na.d)object0));
                this.b = null;
                this.a = 3;
                return this.c.a(c0, a0, "Cached native ad is prepared.", this.f, this) == object1 ? object1 : S0.a;
            }
        }


        static final class com.kakao.adfit.ads.na.c.d extends o implements A3.o {
            Object a;
            Object b;
            Object c;
            int d;
            Object e;
            final c f;
            final AdLoadListener g;
            final Context h;
            final AdFitNativeAdRequest i;

            com.kakao.adfit.ads.na.c.d(c c0, AdLoadListener adFitNativeAdLoader$AdLoadListener0, Context context0, AdFitNativeAdRequest adFitNativeAdRequest0, d d0) {
                this.f = c0;
                this.g = adFitNativeAdLoader$AdLoadListener0;
                this.h = context0;
                this.i = adFitNativeAdRequest0;
                super(2, d0);
            }

            public final Object a(C c0, d d0) {
                return ((com.kakao.adfit.ads.na.c.d)this.create(c0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                d d1 = new com.kakao.adfit.ads.na.c.d(this.f, this.g, this.h, this.i, d0);
                d1.e = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((C)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                static final class com.kakao.adfit.ads.na.c.d.a extends N implements Function1 {
                    final c a;
                    final String b;

                    com.kakao.adfit.ads.na.c.d.a(c c0, String s) {
                        this.a = c0;
                        this.b = s;
                        super(1);
                    }

                    public final void a(com.kakao.adfit.a.d.c d$c0) {
                        String s = this.a.a;
                        n.a.a(s, this.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.kakao.adfit.a.d.c)object0));
                        return S0.a;
                    }
                }


                static final class com.kakao.adfit.ads.na.c.d.b extends N implements Function1 {
                    final c a;
                    final String b;

                    com.kakao.adfit.ads.na.c.d.b(c c0, String s) {
                        this.a = c0;
                        this.b = s;
                        super(1);
                    }

                    public final void a(com.kakao.adfit.a.d.c d$c0) {
                        n.a.a(this.a.a, this.b);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((com.kakao.adfit.a.d.c)object0));
                        return S0.a;
                    }
                }

                C c2;
                m m1;
                t t2;
                Object object4;
                String s;
                C c1;
                Object object2;
                h h0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.d) {
                    case 0: {
                        f0.n(object0);
                        C c0 = (C)this.e;
                        if(j.a(this.f.e, 0L, 1, null)) {
                            this.d = 1;
                            return this.f.a(c0, AdError.NO_AD.getErrorCode(), "Request is blocked.", this.g, this) == object1 ? object1 : S0.a;
                        }
                        h0 = this.f.a(this.h, this.i);
                        this.f.e.e();
                        this.e = c0;
                        this.a = h0;
                        this.d = 2;
                        object2 = l.a(this.f.d, this.f.b(), h0, 0, this, 4, null);
                        if(object2 == object1) {
                            return object1;
                        }
                        c1 = c0;
                        goto label_33;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        h h1 = (h)this.a;
                        c1 = (C)this.e;
                        f0.n(object0);
                        h0 = h1;
                        object2 = object0;
                    label_33:
                        if(!(((com.kakao.adfit.a.k)object2) instanceof com.kakao.adfit.a.m)) {
                            if(((com.kakao.adfit.a.k)object2) instanceof com.kakao.adfit.a.j) {
                                if(((com.kakao.adfit.a.j)(((com.kakao.adfit.a.k)object2))).a() == AdError.NO_AD) {
                                    t t0 = ((com.kakao.adfit.a.j)(((com.kakao.adfit.a.k)object2))).c();
                                    if(t0 != null) {
                                        this.f.e.a(t0);
                                        com.kakao.adfit.m.i.a(com.kakao.adfit.m.i.a, h0.getContext(), t0, null, 4, null);
                                    }
                                }
                                int v = ((com.kakao.adfit.a.j)(((com.kakao.adfit.a.k)object2))).a().getErrorCode();
                                this.e = null;
                                this.a = null;
                                this.d = 3;
                                if(this.f.a(c1, v, "Request failed. [error = " + v + ", " + ((com.kakao.adfit.a.j)(((com.kakao.adfit.a.k)object2))).b() + ']', this.g, this) == object1) {
                                    return object1;
                                }
                            }
                            return S0.a;
                        }
                        s = ((com.kakao.adfit.a.m)(((com.kakao.adfit.a.k)object2))).b();
                        Object object3 = u.B2(((com.kakao.adfit.a.m)(((com.kakao.adfit.a.k)object2))).a());
                        t t1 = ((com.kakao.adfit.a.m)(((com.kakao.adfit.a.k)object2))).c();
                        m m0 = m.y.a(this.h, this.f.a, s, 0, ((com.kakao.adfit.ads.na.k)object3), t1, false);
                        this.f.e.a(t1);
                        com.kakao.adfit.m.i.a(com.kakao.adfit.m.i.a, this.h, t1, null, 4, null);
                        f.d((this.f.b() + " receive native ad. [ad = " + m0.j() + "] [elapsed = " + this.f.a() + "ms]"));
                        this.e = c1;
                        this.a = s;
                        this.b = t1;
                        this.c = m0;
                        this.d = 4;
                        object4 = this.f.a(this.h, m0, this);
                        if(object4 == object1) {
                            return object1;
                        }
                        t2 = t1;
                        m1 = m0;
                        c2 = c1;
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 4: {
                        m1 = (m)this.c;
                        t2 = (t)this.b;
                        s = (String)this.a;
                        c2 = (C)this.e;
                        f0.n(object0);
                        object4 = object0;
                        break;
                    }
                    case 5: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 6: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(((com.kakao.adfit.ads.na.d)object4) == null) {
                    this.e = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 5;
                    return this.f.a(c2, AdError.NO_AD.getErrorCode(), "Preparing failed.", this.g, this) == object1 ? object1 : S0.a;
                }
                Long long0 = t2 == null ? null : t2.b();
                if(long0 != null && ((long)long0) > 0L) {
                    List list0 = u.k(m1);
                    n.a.a(this.f.a, s, list0, ((long)long0));
                    com.kakao.adfit.a.c c3 = m1.g();
                    c3.d().b(new com.kakao.adfit.ads.na.c.d.a(this.f, s));
                    c3.b().b(new com.kakao.adfit.ads.na.c.d.b(this.f, s));
                }
                com.kakao.adfit.ads.na.a a0 = new com.kakao.adfit.ads.na.a(this.i, m1, ((com.kakao.adfit.ads.na.d)object4));
                this.e = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 6;
                return this.f.a(c2, a0, "Native ad is prepared.", this.g, this) == object1 ? object1 : S0.a;
            }
        }

        m m0;
        L.p(adFitNativeAdRequest0, "request");
        L.p(adFitNativeAdLoader$AdLoadListener0, "listener");
        if(!L.g(Looper.myLooper(), Looper.getMainLooper())) {
            throw new RuntimeException("Must be called from the main thread.");
        }
        Object object0 = this.c.get();
        if(((Context)object0) == null) {
            f.e("The context is cleared.");
            return false;
        }
        if(this.isLoading()) {
            f.e((this.b + " loading is already started."));
            return false;
        }
        f.c("Request Native AD");
        f.a((this.b + " loading is started."));
        this.g = SystemClock.elapsedRealtime();
        com.kakao.adfit.ads.na.n.a n$a0 = n.a.a(this.a);
        if(n$a0 == null) {
            m0 = null;
        }
        else {
            List list0 = n$a0.a();
            m0 = list0 == null ? null : ((m)u.B2(list0));
        }
        if(m0 != null) {
            f.a((m0.j() + " is cached."));
            kotlin.coroutines.g g0 = j1.c(null, 1, null).plus(h0.e().u1());
            com.kakao.adfit.ads.na.c.c c$c0 = new com.kakao.adfit.ads.na.c.c(this, ((Context)object0), m0, adFitNativeAdLoader$AdLoadListener0, adFitNativeAdRequest0, null);
            this.f = C.c.a(g0, c$c0);
            return true;
        }
        kotlin.coroutines.g g1 = j1.c(null, 1, null).plus(h0.e().u1());
        com.kakao.adfit.ads.na.c.d c$d0 = new com.kakao.adfit.ads.na.c.d(this, adFitNativeAdLoader$AdLoadListener0, ((Context)object0), adFitNativeAdRequest0, null);
        this.f = C.c.a(g1, c$d0);
        return true;
    }
}

