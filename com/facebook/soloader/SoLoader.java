package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.text.TextUtils;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jeb.synthetic.FIN;
import o3.h;
import p1.f;
import p1.g;
import p3.c;
import p3.d;

@d
public class SoLoader {
    interface a {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;

    }

    @c
    static class b {
        static void a() {
            synchronized(SoLoader.class) {
                SoLoader.k.clear();
                SoLoader.l.clear();
                SoLoader.d = null;
                SoLoader.g = null;
                SoLoader.j = null;
            }
            b.d(null);
        }

        static void b(Context context0) {
            SoLoader.g = context0;
        }

        static void c(A a0) {
            SoLoader.d = a0;
        }

        static void d(H[] arr_h) {
            SoLoader.f.writeLock().lock();
            try {
                SoLoader.h = arr_h;
                SoLoader.i.getAndIncrement();
            }
            finally {
                SoLoader.f.writeLock().unlock();
            }
        }
    }

    public static final class com.facebook.soloader.SoLoader.c extends UnsatisfiedLinkError {
        com.facebook.soloader.SoLoader.c(Throwable throwable0, String s) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.m()) + " error: " + s);
            this.initCause(throwable0);
        }
    }

    public static final int A = 0x200;
    @p3.a("sSoSourcesLock")
    private static int B = 0;
    private static int C = 0;
    public static final String a = "SoLoader";
    static final boolean b = false;
    static final boolean c = false;
    @h
    static A d = null;
    public static String e = "0.10.5";
    private static final ReentrantReadWriteLock f = null;
    static Context g = null;
    @h
    @p3.a("sSoSourcesLock")
    private static volatile H[] h = null;
    @p3.a("sSoSourcesLock")
    private static final AtomicInteger i = null;
    @h
    @p3.a("SoLoader.class")
    private static g j = null;
    @p3.a("SoLoader.class")
    private static final HashSet k = null;
    @p3.a("SoLoader.class")
    private static final Map l = null;
    private static final Set m = null;
    @h
    private static J n = null;
    private static boolean o = false;
    private static final String p = "lib-main";
    private static final String q = "lib-";
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 4;
    public static final int u = 8;
    public static final int v = 16;
    @Deprecated
    public static final int w = 0x20;
    @Deprecated
    public static final int x = 0x40;
    public static final int y = 0x80;
    public static final int z = 0x100;

    static {
        SoLoader.f = new ReentrantReadWriteLock();
        SoLoader.g = null;
        SoLoader.h = null;
        SoLoader.i = new AtomicInteger(0);
        SoLoader.j = null;
        SoLoader.k = new HashSet();
        SoLoader.l = new HashMap();
        SoLoader.m = Collections.newSetFromMap(new ConcurrentHashMap());
        SoLoader.n = null;
        SoLoader.o = true;
        SoLoader.C = 0;
        SoLoader.c = true;
    }

    public static void A(Context context0, boolean z) {
        try {
            SoLoader.z(context0, ((int)z), null);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    private static void B() {
        if(SoLoader.h != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.writeLock().lock();
        if(SoLoader.h != null) {
            reentrantReadWriteLock0.writeLock().unlock();
            return;
        }
        SoLoader.h = new H[0];
        reentrantReadWriteLock0.writeLock().unlock();
    }

    private static boolean C(Context context0) {
        if(Build.VERSION.SDK_INT < 23) {
            return true;
        }
        try {
            Bundle bundle0 = context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80).metaData;
            return bundle0 == null || bundle0.getBoolean("com.facebook.soloader.enabled", true);
        }
        catch(Exception exception0) {
            p.k("SoLoader", "Unexpected issue with package manager (com.dcinside.app.android)", exception0);
            throw new NullPointerException();
        }
    }

    private static void D(@h Context context0, @h A a0) {
        synchronized(SoLoader.class) {
            if(context0 != null) {
                Context context1 = context0.getApplicationContext();
                if(context1 == null) {
                    p.j("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context0.getApplicationInfo().nativeLibraryDir);
                }
                else {
                    context0 = context1;
                }
                SoLoader.g = context0;
                SoLoader.j = new p1.d(context0);
            }
            if(a0 == null && SoLoader.d != null) {
                return;
            }
            if(a0 != null) {
                SoLoader.d = a0;
                return;
            }
            SoLoader.d = new B();
        }
    }

    private static void E(Context context0, int v) throws IOException {
        if(SoLoader.h != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.writeLock().lock();
        if(SoLoader.h != null) {
            reentrantReadWriteLock0.writeLock().unlock();
            return;
        }
        try {
            SoLoader.B = v;
            ArrayList arrayList0 = new ArrayList();
            if((v & 0x200) == 0) {
                SoLoader.k(arrayList0);
                if(context0 != null) {
                    if((v & 1) == 0) {
                        if(SysUtil.p(context0, SoLoader.C)) {
                            SoLoader.j(context0, arrayList0);
                        }
                        SoLoader.g(arrayList0, SoLoader.s());
                        SoLoader.h(context0, arrayList0, 1);
                    }
                    else {
                        SoLoader.g(arrayList0, SoLoader.s());
                        p.a("SoLoader", "Adding exo package source: lib-main");
                        arrayList0.add(0, new m(context0, "lib-main"));
                    }
                }
            }
            else {
                SoLoader.l(context0, arrayList0);
            }
            H[] arr_h = (H[])arrayList0.toArray(new H[arrayList0.size()]);
            int v2 = SoLoader.N();
            for(int v3 = arr_h.length; v3 > 0; --v3) {
                p.a("SoLoader", "Preparing SO source: " + arr_h[v3 - 1]);
                boolean z = SoLoader.c;
                if(z) {
                    Api18TraceUtils.a("SoLoader", "_", arr_h[v3 - 1].getClass().getSimpleName());
                }
                arr_h[v3 - 1].j(v2);
                if(z) {
                    Api18TraceUtils.b();
                }
            }
            SoLoader.h = arr_h;
            SoLoader.i.getAndIncrement();
            p.a("SoLoader", "init finish: " + SoLoader.h.length + " SO sources prepared");
        }
        finally {
            SoLoader.f.writeLock().unlock();
        }
    }

    public static boolean F() {
        boolean z = true;
        if(SoLoader.h != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.readLock().lock();
        if(SoLoader.h == null) {
            z = false;
        }
        reentrantReadWriteLock0.readLock().unlock();
        return z;
    }

    static void G(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        SoLoader.K(s, null, null, v | 1, strictMode$ThreadPolicy0);
    }

    // 去混淆评级： 低(20)
    public static boolean H(String s) {
        return SoLoader.o ? SoLoader.I(s, 0) : o1.a.f(s);
    }

    public static boolean I(String s, int v) throws UnsatisfiedLinkError {
        Boolean boolean0 = SoLoader.L(s);
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(!SoLoader.o) {
            return o1.a.f(s);
        }
        if(SoLoader.C == 2 || SoLoader.C == 3) {
            J j0 = SoLoader.n;
            if(j0 != null) {
                j0.a(s);
                return true;
            }
        }
        return SoLoader.J(System.mapLibraryName(s), s, null, v, null);
    }

    private static boolean J(String s, @h String s1, @h String s2, int v, @h StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        f f0 = null;
        while(true) {
            try {
                return SoLoader.K(s, s1, s2, v, strictMode$ThreadPolicy0);
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            }
            p.k("SoLoader", "Starting recovery for " + s, unsatisfiedLinkError0);
            SoLoader.f.writeLock().lock();
            try {
                try {
                    if(f0 == null) {
                        f0 = SoLoader.w();
                    }
                    if(f0 == null || !f0.a(unsatisfiedLinkError0, SoLoader.h)) {
                        break;
                    }
                    SoLoader.i.getAndIncrement();
                    p.j("SoLoader", "Attempting to load library again");
                    goto label_22;
                }
                catch(w w0) {
                }
                catch(Exception exception0) {
                    p.d("SoLoader", "Got an exception during recovery, will throw the initial error instead", exception0);
                    throw unsatisfiedLinkError0;
                }
                p.d("SoLoader", "Base APK not found during recovery", w0);
                throw w0;
            }
            catch(Throwable throwable0) {
            }
            SoLoader.f.writeLock().unlock();
            throw throwable0;
        label_22:
            SoLoader.f.writeLock().unlock();
        }
        SoLoader.f.writeLock().unlock();
        p.j("SoLoader", "Failed to recover");
        throw unsatisfiedLinkError0;
    }

    private static boolean K(String s, @h String s1, @h String s2, int v, @h StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        HashSet hashSet0;
        Class class2;
        Class class1;
        int v3;
        Object object0;
        int v2;
        boolean z = false;
        if(!TextUtils.isEmpty(s1) && SoLoader.m.contains(s1)) {
            return false;
        }
        synchronized(SoLoader.class) {
            hashSet0 = SoLoader.k;
            if(hashSet0.contains(s)) {
                if(s2 == null) {
                    return false;
                }
                v2 = 1;
            }
            else {
                v2 = 0;
            }
            Map map0 = SoLoader.l;
            if(map0.containsKey(s)) {
                object0 = map0.get(s);
            }
            else {
                Object object1 = new Object();
                map0.put(s, object1);
                object0 = object1;
            }
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.readLock().lock();
        try {
            __monitor_enter(object0);
            v3 = FIN.finallyOpen$NT();
            if(v2 == 0) {
                class1 = SoLoader.class;
                __monitor_enter(class1);
                goto label_31;
            }
            goto label_67;
        }
        catch(Throwable throwable0) {
            goto label_90;
        }
        try {
        label_31:
            if(hashSet0.contains(s)) {
                goto label_37;
            }
            goto label_45;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(class1);
                FIN.finallyExec$NT(v3);
                throw throwable1;
            label_37:
                if(s2 == null) {
                    __monitor_exit(class1);
                    FIN.finallyCodeBegin$NT(v3);
                    __monitor_exit(object0);
                    FIN.finallyCodeEnd$NT(v3);
                    goto label_42;
                }
                goto label_44;
            }
            catch(Throwable throwable0) {
                goto label_90;
            }
        }
    label_42:
        reentrantReadWriteLock0.readLock().unlock();
        return false;
    label_44:
        v2 = 1;
        try {
        label_45:
            __monitor_exit(class1);
            if(v2 == 0) {
                try {
                    p.a("SoLoader", "About to load: " + s);
                    SoLoader.q(s, v, strictMode$ThreadPolicy0);
                }
                catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                    String s3 = unsatisfiedLinkError0.getMessage();
                    if(s3 != null && s3.contains("unexpected e_machine:")) {
                        FIN.finallyExec$NT(v3);
                        throw new com.facebook.soloader.SoLoader.c(unsatisfiedLinkError0, s3.substring(s3.lastIndexOf("unexpected e_machine:")));
                    }
                    FIN.finallyExec$NT(v3);
                    throw unsatisfiedLinkError0;
                }
                p.a("SoLoader", "Loaded: " + s);
                class2 = SoLoader.class;
                __monitor_enter(class2);
                goto label_60;
            }
            goto label_67;
        }
        catch(Throwable throwable0) {
            goto label_90;
        }
        try {
        label_60:
            hashSet0.add(s);
            goto label_66;
        }
        catch(Throwable throwable2) {
            try {
                __monitor_exit(class2);
                FIN.finallyExec$NT(v3);
                throw throwable2;
            label_66:
                __monitor_exit(class2);
            label_67:
                if((v & 16) == 0) {
                    if(!TextUtils.isEmpty(s1) && SoLoader.m.contains(s1)) {
                        z = true;
                    }
                    if(s2 != null && !z) {
                        boolean z1 = SoLoader.c;
                        if(z1) {
                            Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", s1, "]");
                        }
                        goto label_74;
                    }
                }
                goto label_87;
            }
            catch(Throwable throwable0) {
                goto label_90;
            }
        }
        try {
            try {
            label_74:
                p.a("SoLoader", "About to merge: " + s1 + " / " + s);
                q.a(s1);
                SoLoader.m.add(s1);
                goto label_85;
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError1) {
                throw new RuntimeException("Failed to call JNI_OnLoad from \'" + s1 + "\', which has been merged into \'" + s + "\'.  See comment for details.", unsatisfiedLinkError1);
            }
        }
        catch(Throwable throwable3) {
            try {
                if(SoLoader.c) {
                    Api18TraceUtils.b();
                }
                FIN.finallyExec$NT(v3);
                throw throwable3;
            label_85:
                if(z1) {
                    Api18TraceUtils.b();
                }
            label_87:
                FIN.finallyExec$NT(v3);
                goto label_92;
            }
            catch(Throwable throwable0) {
            }
        }
    label_90:
        SoLoader.f.readLock().unlock();
        throw throwable0;
    label_92:
        reentrantReadWriteLock0.readLock().unlock();
        return v2 ^ 1;
    }

    @h
    private static Boolean L(String s) {
        if(SoLoader.h == null) {
            ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
            reentrantReadWriteLock0.readLock().lock();
            if(SoLoader.h == null) {
                try {
                    SoLoader.n();
                    goto label_9;
                }
                catch(Throwable throwable0) {
                }
                SoLoader.f.readLock().unlock();
                throw throwable0;
            }
        label_9:
            reentrantReadWriteLock0.readLock().unlock();
            return null;
        }
        return null;
    }

    public static String M() {
        SoLoader.f.readLock().lock();
        try {
            SoLoader.n();
            ArrayList arrayList0 = new ArrayList();
            H[] arr_h = SoLoader.h;
            if(arr_h != null) {
                for(int v1 = 0; v1 < arr_h.length; ++v1) {
                    arr_h[v1].c(arrayList0);
                }
            }
            String s = TextUtils.join(":", arrayList0);
            p.a("SoLoader", "makeLdLibraryPath final path: " + s);
            return s;
        }
        finally {
            SoLoader.f.readLock().unlock();
        }
    }

    private static int N() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.writeLock().lock();
        int v = (SoLoader.B & 2) == 0 ? 0 : 1;
        if((SoLoader.B & 0x100) != 0) {
            v |= 4;
        }
        reentrantReadWriteLock0.writeLock().unlock();
        return v;
    }

    public static void O(H h0) throws IOException {
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.writeLock().lock();
        try {
            SoLoader.n();
            h0.j(SoLoader.N());
            H[] arr_h = new H[SoLoader.h.length + 1];
            arr_h[0] = h0;
            System.arraycopy(SoLoader.h, 0, arr_h, 1, SoLoader.h.length);
            SoLoader.h = arr_h;
            SoLoader.i.getAndIncrement();
            p.a("SoLoader", "Prepended to SO sources: " + h0);
        }
        catch(Throwable throwable0) {
            SoLoader.f.writeLock().unlock();
            throw throwable0;
        }
        reentrantReadWriteLock0.writeLock().unlock();
    }

    public static void P() {
        b.d(new H[]{new x()});
    }

    static void Q(g g0) {
        synchronized(SoLoader.class) {
            SoLoader.j = g0;
        }
    }

    public static void R(J j0) {
        SoLoader.n = j0;
    }

    public static File S(String s) throws UnsatisfiedLinkError {
        SoLoader.n();
        try {
            return SoLoader.T(System.mapLibraryName(s));
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    static File T(String s) throws IOException {
        SoLoader.f.readLock().lock();
        try {
            H[] arr_h = SoLoader.h;
            for(int v1 = 0; v1 < arr_h.length; ++v1) {
                File file0 = arr_h[v1].k(s);
                if(file0 != null) {
                    return file0;
                }
            }
        }
        finally {
            SoLoader.f.readLock().unlock();
        }
        throw new FileNotFoundException(s);
    }

    public static boolean U(Context context0, boolean z, boolean z1) {
        return s.s(context0, z, z1);
    }

    private static void g(ArrayList arrayList0, int v) {
        com.facebook.soloader.a a0 = new com.facebook.soloader.a(SoLoader.g, v);
        p.a("SoLoader", "Adding application source: " + a0.toString());
        arrayList0.add(0, a0);
    }

    @SuppressLint({"CatchGeneralException"})
    private static void h(Context context0, ArrayList arrayList0, int v) throws IOException {
        if((SoLoader.B & 8) != 0) {
            File file0 = L.u(context0, "lib-main");
            try {
                if(file0.exists()) {
                    SysUtil.c(file0);
                    return;
                }
            }
            catch(Throwable throwable0) {
                p.k("SoLoader", "Failed to delete " + file0.getCanonicalPath(), throwable0);
            }
            return;
        }
        File file1 = new File(context0.getApplicationInfo().sourceDir);
        ArrayList arrayList1 = new ArrayList();
        com.facebook.soloader.c c0 = new com.facebook.soloader.c(context0, file1, "lib-main", v);
        arrayList1.add(c0);
        p.a("SoLoader", "adding backup source from : " + c0.toString());
        SoLoader.i(context0, v, arrayList1);
        arrayList0.addAll(0, arrayList1);
    }

    private static void i(Context context0, int v, ArrayList arrayList0) throws IOException {
        if(context0.getApplicationInfo().splitSourceDirs != null) {
            p.a("SoLoader", "adding backup sources from split apks");
            String[] arr_s = context0.getApplicationInfo().splitSourceDirs;
            int v1 = 0;
            for(int v2 = 0; v1 < arr_s.length; ++v2) {
                com.facebook.soloader.c c0 = new com.facebook.soloader.c(context0, new File(arr_s[v1]), "lib-" + v2, v);
                p.a("SoLoader", "adding backup source: " + c0.toString());
                if(c0.D()) {
                    arrayList0.add(c0);
                }
                ++v1;
            }
        }
    }

    public static void init(Context context0, int v) throws IOException {
        SoLoader.z(context0, v, null);
    }

    private static void j(Context context0, ArrayList arrayList0) {
        com.facebook.soloader.d d0 = new com.facebook.soloader.d(context0);
        p.a("SoLoader", "validating/adding directApk source: " + d0.toString());
        if(d0.t()) {
            arrayList0.add(0, d0);
        }
    }

    private static void k(ArrayList arrayList0) {
        String s = SysUtil.n() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String s1 = System.getenv("LD_LIBRARY_PATH");
        if(s1 != null && !s1.equals("")) {
            s = s1 + ":" + s;
        }
        for(Object object0: new HashSet(Arrays.asList(s.split(":")))) {
            p.a("SoLoader", "adding system library source: " + ((String)object0));
            arrayList0.add(new e(new File(((String)object0)), 2));
        }
    }

    private static void l(Context context0, ArrayList arrayList0) {
        K k0 = new K();
        p.a("SoLoader", "adding systemLoadWrapper source: " + k0);
        arrayList0.add(0, k0);
    }

    public static boolean m() {
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.readLock().lock();
        if(SoLoader.h != null) {
            try {
                String[] arr_s = SysUtil.m();
                H[] arr_h = SoLoader.h;
                int v = 0;
                while(true) {
                    if(v >= arr_h.length) {
                        goto label_28;
                    }
                    String[] arr_s1 = arr_h[v].h();
                    int v1 = 0;
                    while(v1 < arr_s1.length) {
                        String s = arr_s1[v1];
                        boolean z = false;
                        for(int v2 = 0; v2 < arr_s.length && !z; ++v2) {
                            z = s.equals(arr_s[v2]);
                        }
                        if(z) {
                            ++v1;
                            continue;
                        }
                        p.c("SoLoader", "abi not supported: " + s);
                        reentrantReadWriteLock0 = SoLoader.f;
                        goto label_30;
                    }
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            SoLoader.f.readLock().unlock();
            throw throwable0;
        label_28:
            SoLoader.f.readLock().unlock();
            return true;
        }
    label_30:
        reentrantReadWriteLock0.readLock().unlock();
        return false;
    }

    private static void n() {
        if(!SoLoader.F()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    public static H[] o() {
        H[] arr_h;
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.readLock().lock();
        try {
            arr_h = SoLoader.h == null ? new H[0] : ((H[])SoLoader.h.clone());
        }
        catch(Throwable throwable0) {
            SoLoader.f.readLock().unlock();
            throw throwable0;
        }
        reentrantReadWriteLock0.readLock().unlock();
        return arr_h;
    }

    public static void p() {
        b.d(null);
    }

    private static void q(String s, int v, @h StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws UnsatisfiedLinkError {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock0 = SoLoader.f;
        reentrantReadWriteLock0.readLock().lock();
        if(SoLoader.h != null) {
            reentrantReadWriteLock0.readLock().unlock();
            if(strictMode$ThreadPolicy0 == null) {
                strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                z = true;
            }
            else {
                z = false;
            }
            if(SoLoader.c) {
                Api18TraceUtils.a("SoLoader.loadLibrary[", s, "]");
            }
            try {
                reentrantReadWriteLock0.readLock().lock();
                try {
                    H[] arr_h = SoLoader.h;
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= arr_h.length) {
                            throw E.b(s, SoLoader.g, SoLoader.h);
                        }
                        if(arr_h[v1].i(s, v, strictMode$ThreadPolicy0) != 0) {
                            break;
                        }
                    }
                }
                catch(IOException iOException0) {
                    F f0 = new F(s, iOException0.toString());
                    f0.initCause(iOException0);
                    throw f0;
                }
                finally {
                    SoLoader.f.readLock().unlock();
                }
            }
            catch(Throwable throwable0) {
                if(SoLoader.c) {
                    Api18TraceUtils.b();
                }
                if(z) {
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                }
                throw throwable0;
            }
            if(SoLoader.c) {
                Api18TraceUtils.b();
            }
            if(z) {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            return;
        }
        try {
            p.c("SoLoader", "Could not load: " + s + " because SoLoader is not initialized");
            throw new UnsatisfiedLinkError("SoLoader not initialized, couldn\'t find DSO to load: " + s);
        }
        catch(Throwable throwable1) {
            SoLoader.f.readLock().unlock();
            throw throwable1;
        }
    }

    private static int r(Context context0) {
        int v = 1;
        int v1 = SoLoader.C;
        if(v1 != 0) {
            return v1;
        }
        if(context0 == null) {
            p.a("SoLoader", "context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
        int v2 = applicationInfo0.flags;
        if((v2 & 1) != 0) {
            v = (v2 & 0x80) == 0 ? 2 : 3;
        }
        p.a("SoLoader", "ApplicationInfo.flags is: " + applicationInfo0.flags + " appType is: " + v);
        return v;
    }

    private static int s() {
        switch(SoLoader.C) {
            case 1: {
                return 0;
            }
            case 2: 
            case 3: {
                return 1;
            }
            default: {
                throw new RuntimeException("Unsupported app type, we should not reach here");
            }
        }
    }

    @h
    public static String[] t(String s) throws IOException {
        String[] arr_s = null;
        SoLoader.f.readLock().lock();
        try {
            if(SoLoader.h != null) {
                for(int v1 = 0; arr_s == null && v1 < SoLoader.h.length; ++v1) {
                    arr_s = SoLoader.h[v1].d(s);
                }
            }
            return arr_s;
        }
        finally {
            SoLoader.f.readLock().unlock();
        }
    }

    @h
    public static String u(String s) throws IOException {
        String s1 = null;
        SoLoader.f.readLock().lock();
        try {
            if(SoLoader.h != null) {
                for(int v1 = 0; s1 == null && v1 < SoLoader.h.length; ++v1) {
                    s1 = SoLoader.h[v1].e(s);
                }
            }
            return s1;
        }
        finally {
            SoLoader.f.readLock().unlock();
        }
    }

    public static int v() {
        return SoLoader.k.size();
    }

    @h
    private static f w() {
        synchronized(SoLoader.class) {
            return SoLoader.j == null ? null : SoLoader.j.get();
        }
    }

    @h
    public static File x(String s) {
        String s1 = System.mapLibraryName(s);
        SoLoader.f.readLock().lock();
        try {
            if(SoLoader.h != null) {
                for(int v1 = 0; v1 < SoLoader.h.length; ++v1) {
                    H h0 = SoLoader.h[v1];
                    try {
                        File file0 = h0.g(s1);
                        if(file0 != null) {
                            return file0;
                        }
                    }
                    catch(IOException unused_ex) {
                    }
                }
            }
            return null;
        }
        finally {
            SoLoader.f.readLock().unlock();
        }
    }

    public static int y() {
        return SoLoader.i.get();
    }

    public static void z(Context context0, int v, @h A a0) throws IOException {
        if(SoLoader.F()) {
            p.j("SoLoader", "SoLoader already initialized");
            return;
        }
        p.j("SoLoader", "Initializing SoLoader: " + v);
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskWrites();
        try {
            boolean z = SoLoader.C(context0);
            SoLoader.o = z;
            if(z) {
                int v2 = SoLoader.r(context0);
                SoLoader.C = v2;
                if((v & 0x80) == 0 && SysUtil.p(context0, v2)) {
                    v |= 8;
                }
                SoLoader.D(context0, a0);
                SoLoader.E(context0, v);
                p.h("SoLoader", "Init SoLoader delegate");
                o1.a.d(new v());
            }
            else {
                SoLoader.B();
                p.h("SoLoader", "Init System Loader delegate");
                o1.a.d(new o1.c());
            }
            p.j("SoLoader", "SoLoader initialized: " + v);
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

