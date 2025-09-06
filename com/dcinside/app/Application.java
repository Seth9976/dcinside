package com.dcinside.app;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.net.http.HttpResponseCache;
import android.os.Build.VERSION;
import android.os.Process;
import android.webkit.WebView;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.dcinside.app.http.k;
import com.dcinside.app.realm.B;
import com.dcinside.app.system.g;
import com.dcinside.app.system.h;
import com.dcinside.app.type.P;
import com.dcinside.app.util.Clipboards;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.Vk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.zk;
import com.getkeepsafe.relinker.e;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.j;
import com.hjq.toast.s;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.I0;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import pl.droidsonroids.gif.o;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Application.kt\ncom/dcinside/app/Application\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,377:1\n177#2,9:378\n177#2,9:387\n129#2,15:397\n37#3:396\n*S KotlinDebug\n*F\n+ 1 Application.kt\ncom/dcinside/app/Application\n*L\n174#1:378,9\n188#1:387,9\n215#1:397,15\n208#1:396\n*E\n"})
public final class Application extends android.app.Application {
    static final class a extends N implements A3.a {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(0);
        }

        @Override  // A3.a
        public Object invoke() {
            return this.invoke();
        }

        @l
        public final OkHttpClient invoke() {
            return new Builder().addInterceptor(new k()).build();
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        @n
        public final OkHttpClient a() {
            return this.e();
        }

        @l
        @n
        public final Context c() {
            WeakReference weakReference0 = Application.j;
            if(weakReference0 == null) {
                L.S("CONTEXT");
                weakReference0 = null;
            }
            Object object0 = weakReference0.get();
            L.m(object0);
            return (Context)object0;
        }

        @l
        public final WeakReference d() {
            WeakReference weakReference0 = Application.i;
            if(weakReference0 != null) {
                return weakReference0;
            }
            L.S("APPLICATION");
            return null;
        }

        private final OkHttpClient e() {
            return (OkHttpClient)Application.f.getValue();
        }

        @l
        @n
        public final Application f() {
            Object object0 = this.d().get();
            L.m(object0);
            return (Application)object0;
        }

        public final void g(@l WeakReference weakReference0) {
            L.p(weakReference0, "<set-?>");
            Application.i = weakReference0;
        }
    }

    static final class c implements Interceptor {
        @Override  // okhttp3.Interceptor
        @l
        public Response intercept(@l Chain interceptor$Chain0) throws IOException {
            L.p(interceptor$Chain0, "chain");
            Request request0 = interceptor$Chain0.request();
            String s = request0.url().toString();
            timber.log.b.b b$b0 = timber.log.b.a;
            b$b0.u("Request to %s", new Object[]{s});
            Response response0 = interceptor$Chain0.proceed(request0);
            ResponseBody responseBody0 = response0.body();
            L.m(responseBody0);
            MediaType mediaType0 = responseBody0.contentType();
            if(mediaType0 != null && !L.g("text", mediaType0.type()) && !L.g("application/json", mediaType0.toString())) {
                b$b0.u("Responsed other from %s - %s", new Object[]{s, responseBody0.contentType()});
                return response0;
            }
            String s1 = responseBody0.string();
            b$b0.u("Responsed texts from %s - %s\n%s", new Object[]{s, responseBody0.contentType(), s1});
            MediaType mediaType1 = responseBody0.contentType();
            ResponseBody responseBody1 = ResponseBody.Companion.create(s1, mediaType1);
            return response0.newBuilder().body(responseBody1).build();
        }
    }

    static final class d extends timber.log.b.a {
        private final int g;
        private final Pattern h;

        public d() {
            this.g = 23;
            this.h = Pattern.compile("(\\$\\d+)+$");
        }

        @Override  // timber.log.b$a
        @l
        protected String D(@l StackTraceElement stackTraceElement0) {
            L.p(stackTraceElement0, "element");
            String s = stackTraceElement0.getClassName();
            L.o(s, "getClassName(...)");
            String s1 = v.u5(s, '.', null, 2, null);
            Matcher matcher0 = this.h.matcher(s1);
            if(matcher0.find()) {
                s1 = matcher0.replaceAll("");
                L.o(s1, "replaceAll(...)");
            }
            String s2 = "$|" + s1;
            int v = this.g;
            if(s2.length() > v && Build.VERSION.SDK_INT < 26) {
                s2 = s2.substring(0, v);
                L.o(s2, "substring(...)");
            }
            return s2;
        }
    }

    @m
    private I0 a;
    @m
    private FirebaseAnalytics b;
    private boolean c;
    @l
    private final FutureTask d;
    @l
    public static final b e = null;
    @l
    private static final D f = null;
    private static final long g = 0x100000L;
    private static final long h = 20000L;
    public static WeakReference i;
    private static WeakReference j;

    static {
        Application.e = new b(null);
        Application.f = E.a(a.e);
    }

    public Application() {
        this.d = new FutureTask(() -> {
            L.p(this, "this$0");
            return new com.google.android.gms.vision.barcode.BarcodeDetector.Builder(this.getApplicationContext()).setBarcodeFormats(0x100).build();
        });
    }

    @l
    @n
    public static final OkHttpClient a() {
        return Application.e.a();
    }

    // 检测为 Lambda 实现
    private static final BarcodeDetector d(Application application0) [...]

    @l
    @n
    public static final Context e() {
        return Application.e.c();
    }

    public final void f() {
        if(this.a != null && this.a.isActive()) {
            return;
        }
        this.a = com.dcinside.app.realm.helper.a.a.g();
    }

    @m
    public final BarcodeDetector g() {
        try {
            return (BarcodeDetector)this.d.get(20000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException interruptedException0) {
            interruptedException0.printStackTrace();
            return null;
        }
        catch(ExecutionException executionException0) {
            executionException0.printStackTrace();
            return null;
        }
        catch(TimeoutException timeoutException0) {
            timeoutException0.printStackTrace();
            return null;
        }
    }

    @l
    public final native String getText(@l Context arg1, @l String arg2, @l String arg3, @l String arg4) {
    }

    @l
    @n
    public static final Application h() {
        return Application.e.f();
    }

    private final String i(Context context0) {
        String s;
        if(context0 == null) {
            return null;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            try {
                s = null;
                s = android.app.Application.getProcessName();
            }
            catch(Exception unused_ex) {
            }
            if(s != null) {
                return s;
            }
        }
        Object object0 = context0.getSystemService("activity");
        L.n(object0, "null cannot be cast to non-null type android.app.ActivityManager");
        for(Object object1: ((ActivityManager)object0).getRunningAppProcesses()) {
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object1;
            if(activityManager$RunningAppProcessInfo0.pid == Process.myPid()) {
                return activityManager$RunningAppProcessInfo0.processName;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private final String j() {
        return String.valueOf(dl.a.V0());
    }

    public final void k(@m F0 f00) {
        if(f00 == null) {
            return;
        }
        if(this.c) {
            return;
        }
        RealmQuery realmQuery0 = f00.C4(B.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        g1 g10 = realmQuery0.b0("flagAuto", Boolean.FALSE).b0("flagChoose", Boolean.TRUE).p0();
        if(g10.size() > 0) {
            if(f00.E0()) {
                for(Object object0: g10) {
                    B b0 = (B)object0;
                    if(b0 == null) {
                    }
                    else if(b0.g6()) {
                        b0.Q6(false);
                    }
                    else {
                        b0.z5();
                    }
                }
            }
            else {
                f00.beginTransaction();
                try {
                    for(Object object1: g10) {
                        B b1 = (B)object1;
                        if(b1 == null) {
                        }
                        else if(b1.g6()) {
                            b1.Q6(false);
                        }
                        else {
                            b1.z5();
                        }
                    }
                    f00.p();
                    this.c = true;
                    return;
                }
                catch(Throwable throwable0) {
                }
                if(f00.E0()) {
                    f00.e();
                }
                throw throwable0;
            }
        }
        this.c = true;
    }

    private final void l() {
        Executors.newSingleThreadExecutor().execute(this.d);
    }

    public final void m() {
        if(this.b == null) {
            FirebaseAnalytics firebaseAnalytics0 = FirebaseAnalytics.getInstance(this);
            L.o(firebaseAnalytics0, "getInstance(...)");
            firebaseAnalytics0.j("store_name", "GOOGLE");
        }
    }

    private final void n() {
        if(HttpResponseCache.getInstalled() == null) {
            try {
                HttpResponseCache.install(new File(this.getApplicationContext().getCacheDir(), "http"), 0x100000L);
            }
            catch(IOException iOException0) {
                timber.log.b.a.x("HTTP response cache installation failed: " + iOException0.getMessage(), new Object[0]);
            }
        }
    }

    public final boolean o() {
        return this.a != null && this.a.isActive();
    }

    @Override  // android.app.Application
    public void onConfigurationChanged(@l Configuration configuration0) {
        L.p(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        Dk.k(this);
    }

    @Override  // android.app.Application
    public void onCreate() {
        super.onCreate();
        WeakReference weakReference0 = new WeakReference(this);
        Application.e.g(weakReference0);
        Context context0 = this.getApplicationContext();
        Application.j = new WeakReference(context0);
        j.e().m(true);
        ll.I(context0);
        ll.V(3, new h());
        String s = this.i(this);
        zk.b("ProcessName", (s == null ? "unknown" : s));
        if(L.g(s, "com.dcinside.app.android")) {
            Application.r(this, null, 1, null);
        }
        else {
            this.q(String.valueOf((s == null ? 0 : s.hashCode())));
        }
        e.b(this, "native-lib");
        e.b(this, "NativeImageProcessor");
        o.b(context0);
        Dk.k(context0);
        F0.p4(context0);
        F0.B4(new io.realm.Q0.a().x(97L).r(new g()).c(true).g().e());
        Vk.a.c(this);
        try {
            Gk.I(this.getApplicationContext().getApplicationInfo().dataDir);
        }
        catch(Exception unused_ex) {
        }
        this.n();
        this.l();
        P p0 = dl.a.t2();
        P.b.e(p0);
        s.o(this, new com.hjq.toast.style.b(0x7F0E028E));  // layout:view_toast
        this.p();
        ProcessLifecycleOwner.i.a().getLifecycle().a(Clipboards.a);
    }

    private final void p() {
        com.facebook.cache.disk.d d0 = com.facebook.cache.disk.d.n(this).w(0xFA00000L).x(0x2800000L).y(0xA00000L).n();
        Context context0 = this.getApplicationContext();
        L.o(context0, "getApplicationContext(...)");
        com.facebook.drawee.backends.pipeline.d.f(this, com.facebook.imagepipeline.backends.okhttp3.a.a(context0, Application.e.e()).z0(d0).a());
    }

    private final void q(String s) {
        if(Build.VERSION.SDK_INT >= 28) {
            try {
                WebView.setDataDirectorySuffix(("_dc" + s));
            }
            catch(Exception unused_ex) {
            }
        }
    }

    static void r(Application application0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = application0.j();
        }
        application0.q(s);
    }
}

