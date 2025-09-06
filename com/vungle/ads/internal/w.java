package com.vungle.ads.internal;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import com.vungle.ads.N0;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.U0;
import com.vungle.ads.V0;
import com.vungle.ads.VungleAds.WrapperFramework;
import com.vungle.ads.W0;
import com.vungle.ads.d1;
import com.vungle.ads.f0;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.model.h;
import com.vungle.ads.internal.network.n;
import com.vungle.ads.internal.task.g;
import com.vungle.ads.internal.task.j;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.j0;
import com.vungle.ads.r;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.v;
import y4.l;

public final class w {
    public static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w w0) {
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String TAG = "VungleInitializer";
    @l
    private final CopyOnWriteArrayList initializationCallbackArray;
    @l
    private AtomicBoolean isInitialized;

    static {
        w.Companion = new a(null);
    }

    public w() {
        this.isInitialized = new AtomicBoolean(false);
        this.initializationCallbackArray = new CopyOnWriteArrayList();
    }

    private final void configure(Context context0, String s) {
        public static final class b extends N implements A3.a {
            final Context $context;

            public b(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }


        public static final class c extends N implements A3.a {
            final Context $context;

            public c(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.persistence.b.class);
            }
        }


        public static final class d extends N implements A3.a {
            final Context $context;

            public d(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }


        public static final class e extends N implements A3.a {
            final Context $context;

            public e(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(g.class);
            }
        }


        static final class f extends N implements Function1 {
            final Context $context;

            f(w w0, Context context0) {
                w.this = w0;
                this.$context = context0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    w.this.downloadMraidJs(this.$context);
                }
            }
        }

        boolean z;
        H h0 = H.a;
        D d0 = E.c(h0, new b(context0));
        try {
            D d1 = E.c(h0, new c(context0));
            k k0 = k.INSTANCE;
            h h1 = k0.getCachedConfig(w.configure$lambda-5(d1), s);
            if(h1 == null) {
                z = false;
            }
            else {
                k.initWithConfig$vungle_ads_release$default(k0, context0, h1, true, null, 8, null);
                z = true;
            }
            D d2 = E.c(h0, new d(context0));
            com.vungle.ads.internal.network.l l0 = w.configure$lambda-4(d0);
            i i0 = w.configure$lambda-6(d2).getLoggerExecutor();
            r.INSTANCE.init$vungle_ads_release(l0, i0, 1, false);
            this.isInitialized.set(true);
            this.onInitSuccess();
            p.Companion.d("VungleInitializer", "Running cleanup and resend tpat jobs. " + Thread.currentThread().getId());
            D d3 = E.c(h0, new e(context0));
            w.configure$lambda-7(d3).execute(com.vungle.ads.internal.task.a.a.makeJobInfo$default(com.vungle.ads.internal.task.a.Companion, null, 1, null));
            w.configure$lambda-7(d3).execute(j.Companion.makeJobInfo());
            if(!z) {
                k0.fetchConfigAsync$vungle_ads_release(context0, new f(this, context0));
                return;
            }
            this.downloadMraidJs(context0);
            return;
        }
        catch(Throwable throwable0) {
        }
        p.Companion.e("VungleInitializer", "Cannot get config", throwable0);
    }

    private static final com.vungle.ads.internal.network.l configure$lambda-4(D d0) {
        return (com.vungle.ads.internal.network.l)d0.getValue();
    }

    private static final com.vungle.ads.internal.persistence.b configure$lambda-5(D d0) {
        return (com.vungle.ads.internal.persistence.b)d0.getValue();
    }

    private static final com.vungle.ads.internal.executor.a configure$lambda-6(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }

    private static final g configure$lambda-7(D d0) {
        return (g)d0.getValue();
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        com.vungle.ads.internal.network.l.Companion.reset$vungle_ads_release();
        this.isInitialized.set(false);
    }

    private final void downloadMraidJs(Context context0) {
        public static final class com.vungle.ads.internal.w.g extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.w.g(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(q.class);
            }
        }


        public static final class com.vungle.ads.internal.w.h extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.w.h(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.downloader.e.class);
            }
        }


        public static final class com.vungle.ads.internal.w.i extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.w.i(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }

        com.vungle.ads.internal.w.g w$g0 = new com.vungle.ads.internal.w.g(context0);
        D d0 = E.c(H.a, w$g0);
        com.vungle.ads.internal.w.h w$h0 = new com.vungle.ads.internal.w.h(context0);
        D d1 = E.c(H.a, w$h0);
        com.vungle.ads.internal.w.i w$i0 = new com.vungle.ads.internal.w.i(context0);
        D d2 = E.c(H.a, w$i0);
        q q0 = w.downloadMraidJs$lambda-8(d0);
        com.vungle.ads.internal.downloader.e e0 = w.downloadMraidJs$lambda-9(d1);
        i i0 = w.downloadMraidJs$lambda-10(d2).getBackgroundExecutor();
        com.vungle.ads.internal.load.k.downloadJs$default(com.vungle.ads.internal.load.k.INSTANCE, q0, e0, i0, null, null, 24, null);
    }

    private static final com.vungle.ads.internal.executor.a downloadMraidJs$lambda-10(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }

    private static final q downloadMraidJs$lambda-8(D d0) {
        return (q)d0.getValue();
    }

    private static final com.vungle.ads.internal.downloader.e downloadMraidJs$lambda-9(D d0) {
        return (com.vungle.ads.internal.downloader.e)d0.getValue();
    }

    private final boolean hasInvalidChar(String s) {
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(!Character.isLetterOrDigit(((char)v1)) && v1 != 46) {
                return true;
            }
        }
        return false;
    }

    public final void init(@l String s, @l Context context0, @l f0 f00) {
        public static final class com.vungle.ads.internal.w.j extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.w.j(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.executor.a.class);
            }
        }


        public static final class com.vungle.ads.internal.w.k extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.w.k(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.l.class);
            }
        }

        L.p(s, "appId");
        L.p(context0, "context");
        L.p(f00, "initializationCallback");
        W0 w00 = new W0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.SDK_INIT_API);
        r.logMetric$vungle_ads_release$default(r.INSTANCE, w00, null, null, 6, null);
        this.initializationCallbackArray.add(f00);
        com.vungle.ads.internal.util.b.Companion.init(context0);
        if(this.isAppIdInvalid(s)) {
            this.onInitError(new j0("App id invalid: " + s + ", package name: " + "com.dcinside.app.android").logError$vungle_ads_release());
            return;
        }
        if(Build.VERSION.SDK_INT < 25) {
            p.Companion.e("VungleInitializer", "SDK is supported only for API versions 25 and above.");
            this.onInitError(new V0("SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        k.INSTANCE.setAppId$vungle_ads_release(s);
        if(this.isInitialized.get()) {
            p.Companion.d("VungleInitializer", "init already complete");
            this.onInitSuccess();
            return;
        }
        if(PermissionChecker.a(context0, "android.permission.ACCESS_NETWORK_STATE") == 0 && PermissionChecker.a(context0, "android.permission.INTERNET") == 0) {
            com.vungle.ads.internal.w.j w$j0 = new com.vungle.ads.internal.w.j(context0);
            D d0 = E.c(H.a, w$j0);
            com.vungle.ads.internal.w.k w$k0 = new com.vungle.ads.internal.w.k(context0);
            D d1 = E.c(H.a, w$k0);
            w.init$lambda-0(d0).getBackgroundExecutor().execute(() -> {
                L.p(context0, "$context");
                L.p(s, "$appId");
                L.p(this, "this$0");
                L.p(d1, "$vungleApiClient$delegate");
                V2.c.INSTANCE.init(context0);
                w.init$lambda-1(d1).initialize(s);
                this.configure(context0, s);
            }, () -> {
                L.p(this, "this$0");
                this.onInitError(new N0("Config: Out of Memory").logError$vungle_ads_release());
            });
            return;
        }
        p.Companion.e("VungleInitializer", "Network permissions not granted");
        this.onInitError(new U0("Network permissions not granted").logError$vungle_ads_release());
    }

    private static final com.vungle.ads.internal.executor.a init$lambda-0(D d0) {
        return (com.vungle.ads.internal.executor.a)d0.getValue();
    }

    private static final com.vungle.ads.internal.network.l init$lambda-1(D d0) {
        return (com.vungle.ads.internal.network.l)d0.getValue();
    }

    // 检测为 Lambda 实现
    private static final void init$lambda-2(Context context0, String s, w w0, D d0) [...]

    // 检测为 Lambda 实现
    private static final void init$lambda-3(w w0) [...]

    // 去混淆评级： 低(20)
    private final boolean isAppIdInvalid(String s) {
        return v.x3(s) || this.hasInvalidChar(s);
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    @l
    public final AtomicBoolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    @VisibleForTesting
    public static void isInitialized$vungle_ads_release$annotations() {
    }

    private final void onInitError(d1 d10) {
        s s0 = () -> {
            L.p(this, "this$0");
            L.p(d10, "$exception");
            p.Companion.e("VungleInitializer", "onError");
            for(Object object0: this.initializationCallbackArray) {
                ((f0)object0).onError(d10);
            }
            this.initializationCallbackArray.clear();
        };
        com.vungle.ads.internal.util.v.INSTANCE.runOnUiThread(s0);
        String s1 = d10.getLocalizedMessage();
        if(s1 == null) {
            s1 = "Exception code is " + d10.getCode();
        }
        p.Companion.e("VungleInitializer", s1);
    }

    // 检测为 Lambda 实现
    private static final void onInitError$lambda-12(w w0, d1 d10) [...]

    private final void onInitSuccess() {
        p.Companion.d("VungleInitializer", "onSuccess " + Thread.currentThread().getId());
        com.vungle.ads.internal.v v0 = () -> {
            L.p(this, "this$0");
            for(Object object0: this.initializationCallbackArray) {
                ((f0)object0).onSuccess();
            }
            this.initializationCallbackArray.clear();
        };
        com.vungle.ads.internal.util.v.INSTANCE.runOnUiThread(v0);
    }

    // 检测为 Lambda 实现
    private static final void onInitSuccess$lambda-14(w w0) [...]

    public final void setInitialized$vungle_ads_release(@l AtomicBoolean atomicBoolean0) {
        L.p(atomicBoolean0, "<set-?>");
        this.isInitialized = atomicBoolean0;
    }

    public final void setIntegrationName(@l WrapperFramework vungleAds$WrapperFramework0, @l String s) {
        L.p(vungleAds$WrapperFramework0, "wrapperFramework");
        L.p(s, "wrapperFrameworkVersion");
        if(vungleAds$WrapperFramework0 == WrapperFramework.none) {
            p.Companion.e("VungleInitializer", "Wrapper is null or is none");
            return;
        }
        n n0 = n.INSTANCE;
        String s1 = n0.getHeaderUa();
        String s2 = vungleAds$WrapperFramework0.name() + (s.length() <= 0 ? "" : '/' + s);
        if(v.W2(s1, s2, false, 2, null)) {
            p.Companion.w("VungleInitializer", "Wrapper info already set");
            return;
        }
        n0.setHeaderUa(s1 + ';' + s2);
        if(this.isInitialized()) {
            p.Companion.w("VungleInitializer", "VUNGLE WARNING: SDK already initialized, you should\'ve set wrapper info before");
        }
    }
}

