package com.apm.insight.g;

import android.os.Looper;
import android.os.SystemClock;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.ICrashFilter;
import com.apm.insight.IOOMCallback;
import com.apm.insight.e;
import com.apm.insight.entity.b;
import com.apm.insight.k.d;
import com.apm.insight.k.h;
import com.apm.insight.l.j;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.l;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class a implements Thread.UncaughtExceptionHandler {
    private static a a = null;
    private Thread.UncaughtExceptionHandler b;
    private c c;
    private c d;
    private volatile int e;
    private volatile int f;
    private ConcurrentHashMap g;
    private ConcurrentHashMap h;
    private static volatile boolean i = false;
    private static volatile ThreadLocal j;
    private JSONArray k;
    private static volatile long l;
    private static ArrayList m;

    static {
        a.j = new ThreadLocal();
        a.l = 10000L;
        a.m = new ArrayList();
    }

    private a() {
        this.e = 0;
        this.f = 0;
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
        if(thread$UncaughtExceptionHandler0 != this) {
            this.b = thread$UncaughtExceptionHandler0;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public static a a() {
        if(a.a == null) {
            a.a = new a();
        }
        return a.a;
    }

    private String a(File file0, Throwable throwable0, Thread thread0, boolean z) {
        FileOutputStream fileOutputStream0;
        String s1;
        String s = file0.getAbsolutePath();
        this.h.put(file0.getName(), file0);
        try {
            file0.getParentFile().mkdirs();
            file0.createNewFile();
            NativeImpl.c(s);
            s1 = null;
        }
        catch(Throwable unused_ex) {
        }
        if(!z) {
            fileOutputStream0 = new FileOutputStream(file0, true);
            goto label_28;
        }
        int v = NativeImpl.h(s);
        if(v > 0) {
            try {
                NativeImpl.a(v, "");
                NativeImpl.a(v, "\n");
                NativeImpl.a(v, throwable0.getMessage());
                NativeImpl.a(v, "\n");
                NativeImpl.a(v, throwable0.getClass().getName());
                if(throwable0.getMessage() != null) {
                    NativeImpl.a(v, ": ");
                    NativeImpl.a(v, throwable0.getMessage());
                }
                NativeImpl.a(v, "\n");
                NativeImpl.a(v, thread0.getName());
                NativeImpl.a(v, "\n");
            }
            catch(Throwable unused_ex) {
            }
            try {
                NativeImpl.a(v, "stack:");
                NativeImpl.a(v, "\n");
            }
            catch(Throwable unused_ex) {
            }
            m.a(throwable0, v);
            NativeImpl.b(v);
            return s1;
        }
        return s1;
        try {
        label_28:
            fileOutputStream0.write("\n".getBytes());
            fileOutputStream0.write((throwable0.getMessage() + "\n").getBytes());
            fileOutputStream0.write((throwable0 + "\n").getBytes());
            fileOutputStream0.write((thread0.getName() + "\n").getBytes());
        }
        catch(Throwable unused_ex) {
        }
        try {
            fileOutputStream0.write("stack:\n".getBytes());
        }
        catch(Throwable unused_ex) {
        }
        try {
            PrintStream printStream0 = new PrintStream(fileOutputStream0);
            com.apm.insight.l.e.a e$a0 = Looper.getMainLooper() == Looper.myLooper() ? new com.apm.insight.l.e.a() {
                private boolean a;
                private a b;

                {
                    this.a = false;
                }

                @Override  // com.apm.insight.l.e$a
                public final boolean a(String s) {
                    if(!this.a && s.contains("android.os.Looper.loop")) {
                        this.a = true;
                    }
                    return !this.a;
                }
            } : new com.apm.insight.l.e.a();
            s1 = m.a(throwable0, printStream0, e$a0);
            com.apm.insight.a.a(fileOutputStream0);
            goto label_48;
        }
        catch(Throwable throwable1) {
        }
        try {
            throwable0.printStackTrace(new PrintStream(fileOutputStream0));
        }
        catch(Throwable throwable2) {
            try {
                fileOutputStream0.write("err:\n".getBytes());
                fileOutputStream0.write((throwable1 + "\n").getBytes());
                fileOutputStream0.write((throwable2 + "\n").getBytes());
            }
            catch(Throwable unused_ex) {
            }
        }
    label_48:
        com.apm.insight.a.a(fileOutputStream0);
        return s1;
    }

    private Throwable a(Thread thread0, Throwable throwable0) {
        boolean z6;
        String s2;
        String s1;
        File file0;
        String s;
        boolean z2;
        boolean z1;
        boolean z;
        long v;
        if(this.e >= 3) {
            return null;
        }
        try {
            ++this.e;
            ++this.f;
            a.i = true;
            v = System.currentTimeMillis();
            z = false;
            z1 = false;
            z1 = m.c(throwable0);
            if(!z1 || !m.d(throwable0)) {
                goto label_15;
            }
            else {
                goto label_13;
            }
            goto label_16;
        }
        catch(Throwable unused_ex) {
            try {
                z2 = false;
                goto label_17;
            label_13:
                boolean z3 = true;
                goto label_16;
            label_15:
                z3 = false;
            label_16:
                z2 = z3;
            label_17:
                s = e.a(v, CrashType.LAUNCH, z1, false);
                file0 = new File(j.a(e.g()), s);
                s1 = this.a(new File(file0, "logEventStack"), throwable0, thread0, z2);
                if((a.f() & 1) != 0) {
                    goto label_35;
                }
                else if(s1 == null) {
                    z6 = false;
                }
                else if(!e.i().isCrashIgnored(s1)) {
                    z6 = false;
                }
                else {
                    z6 = true;
                }
                goto label_36;
            }
            catch(Throwable throwable1) {
            }
        }
        boolean z4 = z2;
        long v1 = v;
        boolean z5 = false;
        goto label_101;
    label_35:
        z6 = true;
        try {
        label_36:
            JSONArray jSONArray0 = b.a(throwable0, thread0, file0);
            this.k = jSONArray0;
            if(jSONArray0 != null && !z6) {
                goto label_50;
            }
            else {
                goto label_39;
            }
            goto label_51;
        }
        catch(Throwable throwable1) {
            goto label_56;
        }
        try {
        label_39:
            s2 = e.a(v, CrashType.LAUNCH, z1, true);
            File file1 = new File(j.a(e.g()), s2);
            file0.renameTo(file1);
            new File(file1, "logEventStack");
            goto label_51;
        }
        catch(Throwable throwable1) {
            z4 = z2;
            v1 = v;
            z = z6;
            z5 = false;
            goto label_101;
        }
    label_50:
        s2 = s;
        try {
        label_51:
            com.apm.insight.a.d();
            com.apm.insight.k.b.a().b();
            if(com.apm.insight.runtime.a.a(new String[]{"exception_modules", "oom_callback"}) == 1) {
                z5 = true;
            }
            else {
                goto label_63;
            }
            goto label_64;
        }
        catch(Throwable throwable1) {
        label_56:
            z4 = z2;
            v1 = v;
            z = z6;
            z5 = false;
            goto label_101;
        }
        z5 = true;
        goto label_64;
    label_63:
        z5 = false;
    label_64:
        if(z2 && z5) {
            try {
                this.a(thread0, throwable0, true, v);
            }
            catch(Throwable throwable1) {
                z4 = true;
                v1 = v;
                z = z6;
                goto label_101;
            }
        }
        try {
            com.apm.insight.a.a("[uncaughtException] isLaunchCrash=true");
            com.apm.insight.a.a.a();
            boolean z7 = a.b(thread0, throwable0);
            if(z7) {
                goto label_81;
            }
            else {
                goto label_91;
            }
            goto label_127;
        }
        catch(Throwable throwable1) {
            try {
                z4 = z2;
                v1 = v;
                z = z6;
                goto label_101;
            label_81:
                c c0 = this.c;
                if(c0 == null) {
                    z4 = z2;
                    v1 = v;
                    goto label_93;
                label_91:
                    z4 = z2;
                    v1 = v;
                label_93:
                    if(z7) {
                        c c1 = this.d;
                        if(c1 != null) {
                            c1.a(v1, thread0, throwable0, s2, s1, z6);
                            com.apm.insight.a.a(("[uncaughtException] mLaunchCrashDisposer " + throwable0.toString()));
                        }
                    }
                }
                else {
                    z4 = z2;
                    v1 = v;
                    c0.a(v, thread0, throwable0, s2, s1, z6);
                    com.apm.insight.a.a(("[uncaughtException] mLaunchCrashDisposer " + throwable0.toString()));
                }
                goto label_127;
            }
            catch(Throwable throwable1) {
                z = z6;
            }
        }
        try {
        label_101:
            if(!m.c(throwable1)) {
                com.apm.insight.a.a(throwable1);
            }
        }
        catch(Throwable throwable2) {
            if(!z) {
                try {
                    if(z4 && !z5) {
                        this.a(thread0, throwable0, true, v1);
                    }
                    a.e();
                    this.d();
                    this.c(thread0, throwable0);
                }
                catch(Throwable unused_ex) {
                }
                throw throwable2;
            }
            synchronized(this) {
                --this.f;
                --this.e;
            }
            return a.g();
        }
        if(!z) {
            try {
                if(z4 && !z5) {
                    this.a(thread0, throwable0, true, v1);
                }
                a.e();
                goto label_131;
            }
            catch(Throwable unused_ex) {
                return null;
            }
        }
        __monitor_enter(this);
        --this.f;
        --this.e;
        __monitor_exit(this);
        return a.g();
    label_127:
        if(!z6) {
            try {
                if(z4 && !z5) {
                    this.a(thread0, throwable0, true, v1);
                }
                a.e();
            label_131:
                this.d();
                this.c(thread0, throwable0);
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }
        synchronized(this) {
            --this.f;
            --this.e;
        }
        return a.g();
    }

    public static void a(long v) {
        a.l = v;
    }

    private void a(Thread thread0, Throwable throwable0, boolean z, long v) {
        CrashType crashType0 = z ? CrashType.LAUNCH : CrashType.JAVA;
        for(Object object0: l.a().a()) {
            IOOMCallback iOOMCallback0 = (IOOMCallback)object0;
            try {
                if(iOOMCallback0 instanceof com.apm.insight.b) {
                    ((com.apm.insight.b)iOOMCallback0).a(crashType0, throwable0, thread0, v, this.k);
                    continue;
                }
                iOOMCallback0.onCrash(crashType0, throwable0, thread0, v);
                continue;
            }
            catch(Throwable throwable1) {
            }
            com.apm.insight.a.b(throwable1);
        }
    }

    public static void a(Throwable throwable0) {
        if(throwable0 == null) {
            return;
        }
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() {
                @Override
                public final void run() {
                    try {
                        com.apm.insight.entity.a a0 = com.apm.insight.entity.a.a(System.currentTimeMillis(), e.g(), throwable0);
                        a0.a("userdefine", 1);
                        com.apm.insight.entity.a a1 = f.a().a(CrashType.CUSTOM_JAVA, a0);
                        if(a1 != null) {
                            d.a().c(a1.c());
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            });
        }
        catch(Throwable unused_ex) {
        }
    }

    public final void a(c c0) {
        this.c = c0;
    }

    public final void a(String s) {
        this.g.put(s, new Object());
    }

    public final void a(Thread thread0, Throwable throwable0, boolean z, com.apm.insight.entity.a a0) {
        CrashType crashType0;
        List list0;
        if(z) {
            list0 = l.a().b();
            crashType0 = CrashType.LAUNCH;
        }
        else {
            list0 = l.a().c();
            crashType0 = CrashType.JAVA;
        }
        for(Object object0: list0) {
            ICrashCallback iCrashCallback0 = (ICrashCallback)object0;
            long v = SystemClock.uptimeMillis();
            try {
                if(iCrashCallback0 instanceof com.apm.insight.b) {
                    ((com.apm.insight.b)iCrashCallback0).a(crashType0, m.a(throwable0), thread0, this.k);
                }
                else {
                    iCrashCallback0.onCrash(crashType0, m.a(throwable0), thread0);
                }
                a0.b("callback_cost_" + iCrashCallback0.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - v));
                continue;
            }
            catch(Throwable throwable1) {
            }
            com.apm.insight.a.b(throwable1);
            a0.b("callback_err_" + iCrashCallback0.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - v));
        }
    }

    public static boolean b() [...] // 潜在的解密器

    private static boolean b(Thread thread0, Throwable throwable0) {
        ICrashFilter iCrashFilter0 = e.b().b();
        if(iCrashFilter0 != null) {
            try {
                if(!iCrashFilter0.onJavaCrashFilter(throwable0, thread0)) {
                    return false;
                }
            }
            catch(Throwable unused_ex) {
            }
        }
        return true;
    }

    public final void b(c c0) {
        this.d = c0;
    }

    public final boolean b(String s) {
        return this.g.containsKey(s);
    }

    public static void c(String s) {
        if(s == null) {
            return;
        }
        try {
            com.apm.insight.runtime.m.a().a(new Runnable() {
                @Override
                public final void run() {
                    try {
                        com.apm.insight.entity.a a0 = new com.apm.insight.entity.a();
                        a0.a("data", s);
                        a0.a("userdefine", 1);
                        com.apm.insight.entity.a a1 = f.a().a(CrashType.CUSTOM_JAVA, a0);
                        if(a1 != null) {
                            d.a().c(a1.c());
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            });
        }
        catch(Throwable unused_ex) {
        }
    }

    private void c(Thread thread0, Throwable throwable0) {
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.b;
        if(thread$UncaughtExceptionHandler0 != null && thread$UncaughtExceptionHandler0 != this) {
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
        }
    }

    public static boolean c() {
        Boolean boolean0 = (Boolean)a.j.get();
        return boolean0 != null && boolean0.booleanValue();
    }

    private void d() {
        synchronized(this) {
            --this.f;
        }
        long v = SystemClock.uptimeMillis();
        while(this.f != 0 && SystemClock.uptimeMillis() - v < a.l) {
            SystemClock.sleep(50L);
        }
    }

    private static void e() {
        File file0 = j.a(e.g());
        File file1 = j.a();
        if(com.apm.insight.l.f.b(file0) && com.apm.insight.l.f.b(file1)) {
            return;
        }
        long v = SystemClock.uptimeMillis();
        while(!h.a() && SystemClock.uptimeMillis() - v < a.l) {
            try {
                SystemClock.sleep(500L);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static int f() {
        com.apm.insight.g.b b0;
        int v1 = 0;
        for(int v = 0; v < a.m.size(); ++v) {
            try {
                b0 = (com.apm.insight.g.b)a.m.get(v);
            }
            catch(Throwable unused_ex) {
                break;
            }
            try {
                v1 |= b0.a();
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            }
        }
        return v1;
    }

    private static Throwable g() {
        int v = 0;
        while(v < a.m.size()) {
            try {
                a.m.get(v);
                ++v;
                continue;
            }
            catch(Throwable unused_ex) {
            }
            break;
        }
        if(Looper.getMainLooper() == Looper.myLooper()) {
            try {
                Looper.loop();
                return null;
            }
            catch(Throwable throwable0) {
                return throwable0;
            }
        }
        return null;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        do {
            throwable0 = this.a(thread0, throwable0);
        }
        while(throwable0 != null);
    }
}

