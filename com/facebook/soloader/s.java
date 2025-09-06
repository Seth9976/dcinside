package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o3.h;

public final class s {
    private static final int a = 3;
    private static final int b = 3;
    private static final int c = 0;
    private static final float d = 1.0f;
    private static final int e = 0x1505;
    private static final int f = 3;
    private static final String g = "NativeDeps";
    private static volatile boolean h = false;
    @h
    private static byte[] i = null;
    private static List j = null;
    private static Map k = null;
    private static volatile boolean l = false;
    private static final ReentrantReadWriteLock m;

    static {
        s.c = 6;
        s.m = new ReentrantReadWriteLock();
    }

    @h
    private static String[] d(String s) {
        String[] arr_s;
        if(s.h) {
            return s.r(s);
        }
        if(!s.l) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = s.m;
        reentrantReadWriteLock0.readLock().lock();
        try {
            arr_s = s.r(s);
        }
        catch(Throwable throwable0) {
            s.m.readLock().unlock();
            throw throwable0;
        }
        reentrantReadWriteLock0.readLock().unlock();
        return arr_s;
    }

    private static int e(byte[] arr_b, int v) {
        while(v < arr_b.length && arr_b[v] != 10) {
            ++v;
        }
        return v >= arr_b.length ? v : v + 1;
    }

    public static String[] f(String s, j j0) throws IOException {
        String[] arr_s1;
        String[] arr_s;
        boolean z = SoLoader.c;
        if(z) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", s, "]");
        }
        try {
            try {
                arr_s = s.d(s);
                if(arr_s == null) {
                    arr_s1 = r.a(j0);
                    goto label_13;
                }
                goto label_16;
            }
            catch(a r$a0) {
                throw G.b(s, r$a0);
            }
        }
        catch(Throwable throwable0) {
            if(SoLoader.c) {
                Api18TraceUtils.b();
            }
            throw throwable0;
        }
    label_13:
        if(z) {
            Api18TraceUtils.b();
        }
        return arr_s1;
    label_16:
        if(z) {
            Api18TraceUtils.b();
        }
        return arr_s;
    }

    @h
    private static String[] g(int v, int v1) {
        ArrayList arrayList0 = new ArrayList();
        int v2 = v + v1 - s.c;
        int v3 = 0;
        boolean z = false;
        while(true) {
            byte[] arr_b = s.i;
            if(v2 >= arr_b.length) {
                break;
            }
            int v4 = arr_b[v2];
            if(v4 == 10) {
                break;
            }
            if(v4 != 0x20) {
                if(v4 < 0x30 || v4 > 57) {
                    return null;
                }
                v3 = v3 * 10 + (v4 - 0x30);
                z = true;
            }
            else if(z) {
                String s = s.h(v3);
                if(s == null) {
                    return null;
                }
                arrayList0.add(s);
                v3 = 0;
                z = false;
            }
            ++v2;
        }
        if(z) {
            String s1 = s.h(v3);
            if(s1 == null) {
                return null;
            }
            arrayList0.add(s1);
        }
        return arrayList0.isEmpty() ? null : ((String[])arrayList0.toArray(new String[arrayList0.size()]));
    }

    @h
    private static String h(int v) {
        if(v >= s.j.size()) {
            return null;
        }
        int v1 = (int)(((Integer)s.j.get(v)));
        int v2;
        for(v2 = v1; v2 < s.i.length && s.i[v2] > 0x20; ++v2) {
        }
        int v3 = v2 - v1 + s.c;
        char[] arr_c = new char[v3];
        arr_c[0] = 'l';
        arr_c[1] = 'i';
        arr_c[2] = 'b';
        for(int v4 = 0; v4 < v3 - s.c; ++v4) {
            arr_c[s.a + v4] = (char)s.i[v1 + v4];
        }
        arr_c[v3 - 3] = '.';
        arr_c[v3 - 2] = 's';
        arr_c[v3 - 1] = 'o';
        return new String(arr_c);
    }

    private static int i(String s) {
        Integer integer0 = s.j(s);
        List list0 = (List)s.k.get(integer0);
        if(list0 == null) {
            return -1;
        }
        for(Object object0: list0) {
            int v = (int)(((Integer)object0));
            if(s.n(s, v)) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    private static int j(String s) {
        int v = s.a;
        int v1 = 0x1505;
        while(v < s.length() - s.b) {
            v1 = s.codePointAt(v) + ((v1 << 5) + v1);
            ++v;
        }
        return v1;
    }

    // This method was un-flattened
    private static void k(byte[] arr_b, int v) {
        boolean z;
        while(true) {
            int v1 = 0x1505;
            int v2 = v;
            try {
                int v3;
                while((v3 = arr_b[v2]) > 0x20) {
                    v1 = (v1 << 5) + v1 + v3;
                    ++v2;
                }
                s.l(v1, v);
            }
            catch(IndexOutOfBoundsException unused_ex) {
                goto label_20;
            }
            if(v3 == 0x20) {
                z = false;
                int v4 = v;
                for(v = v2 + 1; true; ++v) {
                    try {
                        if(arr_b[v] == 10) {
                            break;
                        }
                        continue;
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        v = v4;
                    }
                label_20:
                    if(z && v != arr_b.length) {
                        s.l(v1, v);
                    }
                    return;
                }
                z = true;
                ++v;
            }
            else {
                z = true;
                v = v2 + 1;
            }
        }
    }

    private static void l(int v, int v1) {
        s.j.add(v1);
        List list0 = (List)s.k.get(v);
        if(list0 == null) {
            list0 = new ArrayList();
            s.k.put(v, list0);
        }
        list0.add(v1);
    }

    private static boolean m(Context context0, boolean z) throws IOException {
        s.v();
        return z ? s.q(SysUtil.q(new File(context0.getApplicationInfo().sourceDir), context0), t.k(context0)) : s.q(null, t.j(context0));
    }

    private static boolean n(String s, int v) {
        int v1 = s.a;
        while(v1 < s.length() - s.b && v < s.i.length && (s.codePointAt(v1) & 0xFF) == s.i[v]) {
            ++v1;
            ++v;
        }
        return v1 == s.length() - 3;
    }

    public static void o(String s, j j0, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) throws IOException {
        String[] arr_s = s.f(s, j0);
        p.a("SoLoader", "Loading " + s + "\'s dependencies: " + Arrays.toString(arr_s));
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s1 = arr_s[v1];
            if(!s1.startsWith("/")) {
                SoLoader.G(s1, v, strictMode$ThreadPolicy0);
            }
        }
    }

    private static int p(byte[] arr_b, int v, int v1) {
        try {
            return Integer.parseInt(new String(arr_b, v, v1));
        }
        catch(NumberFormatException unused_ex) {
            return -1;
        }
    }

    static boolean q(byte[] arr_b, byte[] arr_b1) throws IOException {
        int v;
        if(arr_b == null) {
            v = 0;
        }
        else {
            v = s.u(arr_b, arr_b1);
            if(v == -1) {
                return false;
            }
        }
        int v1 = s.e(arr_b1, v);
        if(v1 >= arr_b1.length) {
            return false;
        }
        int v2 = s.p(arr_b1, v, v1 - v - 1);
        if(v2 <= 0) {
            return false;
        }
        s.k = new HashMap(((int)(((float)v2) / 1.0f)) + 1, 1.0f);
        s.j = new ArrayList(v2);
        s.k(arr_b1, v1);
        if(s.j.size() != v2) {
            return false;
        }
        s.i = arr_b1;
        s.h = true;
        return true;
    }

    @h
    static String[] r(String s) {
        if(!s.h) {
            return null;
        }
        if(s.length() <= s.c) {
            return null;
        }
        int v = s.i(s);
        return v == -1 ? null : s.g(v, s.length());
    }

    public static boolean s(Context context0, boolean z, boolean z1) {
        class com.facebook.soloader.s.a implements Runnable {
            final Context a;
            final boolean b;

            com.facebook.soloader.s.a(Context context0, boolean z) {
                this.b = z;
                super();
            }

            @Override
            public void run() {
                s.m.writeLock().lock();
                s.l = true;
                try {
                    s.t(this.a, this.b);
                }
                finally {
                    int v1 = s.m.getReadLockCount();
                    if(v1 >= 3) {
                        p.j("NativeDeps", "NativeDeps initialization finished with " + Integer.toString(v1) + " threads waiting.");
                    }
                    s.m.writeLock().unlock();
                    s.l = false;
                }
            }
        }

        if(!z) {
            return s.t(context0, z1);
        }
        new Thread(new com.facebook.soloader.s.a(context0, z1), "soloader-nativedeps-init").start();
        return true;
    }

    private static boolean t(Context context0, boolean z) {
        boolean z1 = false;
        try {
            z1 = s.m(context0, z);
        }
        catch(IOException unused_ex) {
        }
        if(!z1 && z) {
            try {
                t.c(context0);
                z1 = s.m(context0, true);
            }
            catch(IOException unused_ex) {
            }
        }
        if(!z1) {
            p.j("NativeDeps", "Failed to extract native deps from APK, falling back to using MinElf to get library dependencies.");
        }
        return z1;
    }

    private static int u(@h byte[] arr_b, @h byte[] arr_b1) {
        if(arr_b == null || arr_b.length == 0 || arr_b1.length < arr_b.length + 4) {
            return -1;
        }
        int v = ByteBuffer.wrap(arr_b1, arr_b.length, 4).getInt();
        if(arr_b1.length != arr_b.length + 4 + v) {
            return -1;
        }
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            if(arr_b[v1] != arr_b1[v1]) {
                return -1;
            }
        }
        return arr_b.length + 4;
    }

    private static void v() {
        if(!s.h) {
            return;
        }
        synchronized(s.class) {
            if(!s.h) {
                return;
            }
        }
        throw new IllegalStateException("Trying to initialize NativeDeps but it was already initialized");
    }
}

