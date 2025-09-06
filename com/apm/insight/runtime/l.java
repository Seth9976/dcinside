package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.g.a;
import com.apm.insight.g.d;
import com.apm.insight.i.b;
import com.apm.insight.k.g;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import java.io.File;
import java.util.Map;

public final class l {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static boolean e = false;
    private static c f;
    private static volatile boolean g;
    private static boolean h;

    static {
        l.f = new c();
        l.g = false;
        l.h = false;
    }

    public static c a() {
        return l.f;
    }

    public static void a(long v) {
        NativeImpl.a(v);
    }

    public static void a(@NonNull Application application0, @NonNull Context context0) {
        synchronized(l.class) {
            long v1 = SystemClock.uptimeMillis();
            l.a = true;
            if(context0 != null && application0 != null) {
                e.a(application0, context0);
                a a0 = a.a();
                a0.a(new b(context0));
                a0.b(new d(context0));
                l.b = true;
                NativeImpl.a();
                boolean z = NativeImpl.a(context0);
                l.d = z;
                if(!z) {
                    l.e = true;
                }
                if(Looper.myLooper() == Looper.getMainLooper()) {
                    l.g = true;
                    NativeImpl.i();
                }
                m.a().a(new Runnable() {
                    private boolean a;

                    @Override
                    public final void run() {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            private com.apm.insight.runtime.l.2 a;

                            @Override
                            public final void run() {
                                l.r();
                                NativeImpl.i();
                            }
                        });
                        l.e(this.a);
                    }
                }, 0L);
                com.apm.insight.a.a(("Npth.init takes " + (SystemClock.uptimeMillis() - v1) + " ms."));
                return;
            }
        }
        throw new IllegalArgumentException("context or Application must be not null.");
    }

    public static void a(@NonNull Context context0) {
        Application application0;
        synchronized(l.class) {
            if(e.h() != null) {
                application0 = e.h();
                l.a(application0, context0);
                return;
            }
            if(context0 instanceof Application) {
                application0 = (Application)context0;
                if(application0.getBaseContext() == null) {
                    throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                }
                l.a(application0, context0);
                return;
            }
            try {
                application0 = (Application)context0.getApplicationContext();
            }
            catch(Throwable unused_ex) {
                throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
            }
            if(application0 != null) {
                if(application0.getBaseContext() != null) {
                    context0 = application0.getBaseContext();
                }
                l.a(application0, context0);
                return;
            }
        }
        throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
    }

    public static void a(ICrashCallback iCrashCallback0, CrashType crashType0) {
        l.f.a(iCrashCallback0, crashType0);
    }

    public static void a(IOOMCallback iOOMCallback0) {
        l.f.a(iOOMCallback0);
    }

    public static void a(com.apm.insight.b.h.a h$a0) {
        h.a(h$a0);
    }

    public static void a(@NonNull com.apm.insight.b.i.a i$a0) {
        e.i().setEncryptImpl$22f2d42e(i$a0);
    }

    public static void a(String s) {
        if(!TextUtils.isEmpty(s)) {
            com.apm.insight.d.a.a(s);
        }
    }

    public static void a(String s, com.apm.insight.b.h.a h$a0) {
        m.a().a(new Runnable() {
            @Override
            public final void run() {
                if(com.apm.insight.l.a.c(e.g())) {
                    com.apm.insight.b.d.a(s, h$a0);
                }
            }
        });
    }

    public static void a(String s, com.apm.insight.b.i.a i$a0, com.apm.insight.b.i.a i$a1) {
        if(!TextUtils.isEmpty(s) && new File(s).exists()) {
            com.apm.insight.a.a.a().a(s, i$a0, i$a1);
        }
    }

    public static void a(String s, @Nullable Map map0, @Nullable Map map1, @Nullable com.apm.insight.b.h.a h$a0) {
        if(!TextUtils.isEmpty(s)) {
            com.apm.insight.d.a.a(s, map0, map1, h$a0);
        }
    }

    public static void a(String s, @Nullable Map map0, @Nullable Map map1, @Nullable Map map2, @Nullable com.apm.insight.b.h.a h$a0) {
        if(!TextUtils.isEmpty(s)) {
            com.apm.insight.d.a.a(s, map0, map1, map2, h$a0);
        }
    }

    @Deprecated
    public static void a(@NonNull Throwable throwable0) {
        if(!e.i().isReportErrorEnable()) {
            return;
        }
        a.a(throwable0);
    }

    public static void a(boolean z) {
        e.a(z);
    }

    public static void b(long v) {
        NativeImpl.b(v);
    }

    public static void b(ICrashCallback iCrashCallback0, CrashType crashType0) {
        l.f.b(iCrashCallback0, crashType0);
    }

    public static void b(IOOMCallback iOOMCallback0) {
        l.f.b(iOOMCallback0);
    }

    public static void b(com.apm.insight.b.h.a h$a0) {
        com.apm.insight.k.e.a(h$a0);
    }

    @Deprecated
    public static void b(String s) {
        if(!e.i().isReportErrorEnable()) {
            return;
        }
        a.c(s);
    }

    public static void b(boolean z) {
        e.b(z);
    }

    public static boolean b() [...] // 潜在的解密器

    private static boolean b(Context context0) {
        try {
            return new File(j.j(context0), "npth").exists();
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static void c(String s) {
        NativeImpl.b(s);
    }

    public static void c(boolean z) {
        e.c(z);
    }

    public static boolean c() [...] // 潜在的解密器

    private static boolean c(Context context0) {
        try {
            return new File(context0.getApplicationInfo().nativeLibraryDir, "libapminsighta.so").exists();
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static void d(boolean z) {
        e.d(z);
    }

    public static boolean d() [...] // 潜在的解密器

    static void e(boolean z) {
        Context context0 = e.g();
        f.a();
        com.apm.insight.runtime.j.a();
        int v = NativeImpl.b();
        if(l.e) {
            com.apm.insight.b.a.a("NativeLibraryLoad faild");
        }
        else if(v < 0) {
            com.apm.insight.b.a.a("createCallbackThread faild");
        }
        com.apm.insight.e.a.a().a(context0);
        com.apm.insight.k.h.a(context0);
        if(z) {
            com.apm.insight.b.f.a(context0).c();
            l.c = true;
        }
        g.a().b();
        NativeImpl.g();
        com.apm.insight.k.j.d();
        NativeImpl.k();
        n.a("afterNpthInitAsync", "noValue");
    }

    public static boolean e() [...] // 潜在的解密器

    public static void f() {
    }

    public static void g() {
    }

    public static boolean h() {
        return l.d;
    }

    public static boolean i() {
        return com.apm.insight.b.c.c();
    }

    public static void j() {
    }

    public static void k() {
    }

    // 去混淆评级： 低(40)
    public static boolean l() {
        return NativeImpl.e();
    }

    // 去混淆评级： 低(20)
    public static boolean m() {
        return a.c() || NativeImpl.e();
    }

    // 去混淆评级： 低(20)
    public static boolean n() [...] // 潜在的解密器

    public static boolean o() [...] // 潜在的解密器

    public static void p() {
        l.h = true;
    }

    static boolean q() [...] // 潜在的解密器

    static boolean r() {
        l.g = true;
        return true;
    }
}

