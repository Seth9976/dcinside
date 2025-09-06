package com.coupang.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import androidx.lifecycle.ViewModelStore;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.D;
import kotlin.E;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

@SuppressLint({"ObsoleteSdkInt"})
public final class a {
    public static final class c {
        private c() {
        }

        public c(w w0) {
        }

        @l
        public final String a() {
            return this.b().d();
        }

        @l
        public final a b() {
            a a0 = a.p;
            L.m(a0);
            return a0;
        }
    }

    @l
    private final WeakReference a;
    @m
    private String b;
    private boolean c;
    @m
    private String d;
    @m
    private String e;
    private volatile boolean f;
    @l
    private final D g;
    @l
    private final D h;
    @l
    private final D i;
    @l
    private final D j;
    @l
    private final D k;
    @l
    private final D l;
    @l
    private final D m;
    @l
    private final D n;
    @l
    public static final c o = null;
    @m
    private static a p = null;
    public static final long q = 13L;
    @l
    public static final String r = "1.3.0";
    @l
    public static final String s = "AdsContext";
    @l
    public static final String t = "APP_ANON_ID";

    static {
        a.o = new c(null);
    }

    public a(@l Context context0) {
        @f(c = "com.coupang.ads.AdsContext$1$1", f = "AdsContext.kt", i = {}, l = {0x85}, m = "invokeSuspend", n = {}, s = {})
        static final class com.coupang.ads.a.a extends o implements A3.o {
            int k;
            final a l;

            com.coupang.ads.a.a(a a0, d d0) {
                this.l = a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.coupang.ads.a.a(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.coupang.ads.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.coupang.ads.AdsContext$1$1$ad$1", f = "AdsContext.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.coupang.ads.a.a.a extends o implements A3.o {
                    int k;

                    com.coupang.ads.a.a.a(d d0) {
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.coupang.ads.a.a.a(d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.coupang.ads.a.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k == 0) {
                            f0.n(object0);
                            try {
                                return com.coupang.ads.tools.l.a(e0.b(AdvertisingIdClient.getAdvertisingIdInfo(a.o.b().m()).getId()), "AdsContext");
                            }
                            catch(Throwable throwable0) {
                                return com.coupang.ads.tools.l.a(e0.b(f0.a(throwable0)), "AdsContext");
                            }
                        }
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }

                Object object1 = b.l();
                String s = null;
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.coupang.ads.a.a.a a$a$a0 = new com.coupang.ads.a.a.a(null);
                        this.k = 1;
                        object0 = i.h(h0.c(), a$a$a0, this);
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
                String s1 = (String)object0;
                if(s1 != null) {
                    if(s1.length() <= 0) {
                        s1 = null;
                    }
                    if(s1 != null) {
                        if(!this.l.g() || O.a.a.a().length() == 0) {
                            O.a.a.b(s1);
                        }
                        s = s1;
                    }
                }
                com.coupang.ads.clog.b.a.a("AdsContext", "getAdvertisingIdInfo:" + s);
                return S0.a;
            }
        }


        @f(c = "com.coupang.ads.AdsContext$2$1", f = "AdsContext.kt", i = {}, l = {0x95}, m = "invokeSuspend", n = {}, s = {})
        static final class com.coupang.ads.a.b extends o implements A3.o {
            int k;
            final a l;

            com.coupang.ads.a.b(a a0, d d0) {
                this.l = a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.coupang.ads.a.b(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.coupang.ads.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.coupang.ads.AdsContext$2$1$1", f = "AdsContext.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.coupang.ads.a.b.a extends o implements A3.o {
                    int k;
                    final a l;

                    com.coupang.ads.a.b.a(a a0, d d0) {
                        this.l = a0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        return new com.coupang.ads.a.b.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.coupang.ads.a.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        return e0.a(com.coupang.ads.coupangapp.d.e(this.l.b(), null, 1, null));
                    }
                }

                Object object1 = b.l();
                Object object2 = null;
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        com.coupang.ads.a.b.a a$b$a0 = new com.coupang.ads.a.b.a(this.l, null);
                        this.k = 1;
                        object0 = i.h(h0.c(), a$b$a0, this);
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
                Object object3 = ((e0)object0).l();
                com.coupang.ads.clog.b b0 = com.coupang.ads.clog.b.a;
                if(!e0.i(object3)) {
                    object2 = object3;
                }
                b0.a("AdsContext", "adTokenRequester.getAdToken:" + object2);
                return S0.a;
            }
        }


        static final class com.coupang.ads.a.d extends N implements A3.a {
            final Context e;

            com.coupang.ads.a.d(Context context0) {
                this.e = context0;
                super(0);
            }

            @l
            public final com.coupang.ads.coupangapp.d b() {
                return new com.coupang.ads.coupangapp.d(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class e extends N implements A3.a {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(0);
            }

            @l
            public final com.coupang.ads.tools.c b() {
                return new com.coupang.ads.tools.c();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.a.f extends N implements A3.a {
            public static final com.coupang.ads.a.f e;

            static {
                com.coupang.ads.a.f.e = new com.coupang.ads.a.f();
            }

            com.coupang.ads.a.f() {
                super(0);
            }

            @l
            public final com.coupang.ads.network.interceptor.a b() {
                return new com.coupang.ads.network.interceptor.a();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class g extends N implements A3.a {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(0);
            }

            @l
            public final com.coupang.ads.tools.f b() {
                return new com.coupang.ads.tools.f();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class h extends N implements A3.a {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(0);
            }

            @l
            public final LinkedList b() {
                LinkedList linkedList0 = new LinkedList();
                linkedList0.add(new com.coupang.ads.viewmodels.b());
                return linkedList0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.coupang.ads.a.i extends N implements A3.a {
            public static final com.coupang.ads.a.i e;

            static {
                com.coupang.ads.a.i.e = new com.coupang.ads.a.i();
            }

            com.coupang.ads.a.i() {
                super(0);
            }

            @l
            public final Gson b() {
                return new Gson();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class j extends N implements A3.a {
            final a e;

            j(a a0) {
                this.e = a0;
                super(0);
            }

            @l
            public final com.coupang.ads.network.a b() {
                return new com.coupang.ads.network.a(this.e.k());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class k extends N implements A3.a {
            public static final k e;

            static {
                k.e = new k();
            }

            k() {
                super(0);
            }

            @l
            public final ViewModelStore b() {
                return new ViewModelStore();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        L.p(context0, "context");
        super();
        this.a = new WeakReference(context0.getApplicationContext());
        this.c = true;
        this.g = E.a(com.coupang.ads.a.i.e);
        this.h = E.a(g.e);
        this.i = E.a(e.e);
        this.j = E.a(new j(this));
        this.k = E.a(k.e);
        this.l = E.a(h.e);
        this.m = E.a(com.coupang.ads.a.f.e);
        this.n = E.a(new com.coupang.ads.a.d(context0));
        a.p = this;
        com.coupang.ads.clog.b b0 = com.coupang.ads.clog.b.a;
        b0.a("AdsContext", "AdsContext init 13 1.3.0");
        ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80);
        L.o(applicationInfo0, "context.packageManager.g…r.GET_META_DATA\n        )");
        this.d = applicationInfo0.metaData.getString(context0.getString(string.KEY_META_DATA_AFFILIATE_ID), "");
        this.e = applicationInfo0.metaData.getString(context0.getString(string.KEY_META_DATA_SUB_ID), "");
        b0.a("AdsContext", "affiliateId:" + this.d + " subId:" + this.e);
        int v = Build.VERSION.SDK_INT;
        if(v < 23) {
            b0.n("AdsContext", "The minimum API version supported by the SDK is 23, but current is " + v + ", This is going to have some unforeseen crashes.");
        }
        try {
            com.coupang.ads.a.a a$a0 = new com.coupang.ads.a.a(this, null);
            kotlinx.coroutines.k.f(() -> kotlin.coroutines.i.a, null, null, a$a0, 3, null);
        }
        catch(Throwable throwable0) {
            f0.a(throwable0);
        }
        try {
            com.coupang.ads.a.b a$b0 = new com.coupang.ads.a.b(this, null);
            kotlinx.coroutines.k.f(() -> kotlin.coroutines.i.a, null, null, a$b0, 3, null);
        }
        catch(Throwable throwable1) {
            f0.a(throwable1);
        }
    }

    @l
    public final com.coupang.ads.coupangapp.d b() {
        return (com.coupang.ads.coupangapp.d)this.n.getValue();
    }

    @m
    public final String c() {
        return this.d;
    }

    @l
    public final String d() {
        String s = this.b;
        if(s == null) {
            SharedPreferences sharedPreferences0 = this.m().getSharedPreferences("AdsContext", 0);
            String s1 = sharedPreferences0.getString("APP_ANON_ID", null);
            if(s1 == null) {
                s1 = "66d7b218-b197-4da2-8f57-1c2be4948e7f";
                sharedPreferences0.edit().putString("APP_ANON_ID", "66d7b218-b197-4da2-8f57-1c2be4948e7f").apply();
            }
            s = s1;
            this.b = s;
            L.o(s, "requireAppContext.getSha…Id = it\n                }");
        }
        return s;
    }

    @l
    public final com.coupang.ads.tools.c e() {
        return (com.coupang.ads.tools.c)this.i.getValue();
    }

    public final boolean f() {
        return this.c;
    }

    public final boolean g() {
        return this.f;
    }

    @l
    public final com.coupang.ads.network.interceptor.a h() {
        return (com.coupang.ads.network.interceptor.a)this.m.getValue();
    }

    @l
    public final com.coupang.ads.tools.f i() {
        return (com.coupang.ads.tools.f)this.h.getValue();
    }

    @l
    public final LinkedList j() {
        return (LinkedList)this.l.getValue();
    }

    @l
    public final Gson k() {
        return (Gson)this.g.getValue();
    }

    @l
    public final com.coupang.ads.network.a l() {
        return (com.coupang.ads.network.a)this.j.getValue();
    }

    @l
    public final Context m() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            throw new RuntimeException("empty App context ref!");
        }
        return context0;
    }

    @m
    public final String n() {
        return this.e;
    }

    @l
    public final ViewModelStore o() {
        return (ViewModelStore)this.k.getValue();
    }

    public final void p(@m String s) {
        this.d = s;
    }

    public final void q(boolean z) {
        this.c = z;
    }

    public final void r(boolean z) {
        this.f = z;
    }

    public final void s(@m String s) {
        this.e = s;
    }
}

