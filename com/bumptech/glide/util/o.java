package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.model.m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class o {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[Bitmap.Config.values().length];
            a.a = arr_v;
            try {
                arr_v[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.RGB_565.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final int a = 0x1F;
    private static final int b = 17;
    private static final char[] c;
    private static final char[] d;
    @Nullable
    private static volatile Handler e;

    static {
        o.c = "0123456789abcdef".toCharArray();
        o.d = new char[0x40];
    }

    @NonNull
    public static String A(@NonNull byte[] arr_b) {
        synchronized(o.d) {
        }
        return o.f(arr_b, o.d);
    }

    public static void a() {
        if(!o.u()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if(!o.v()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@Nullable com.bumptech.glide.request.a a0, @Nullable com.bumptech.glide.request.a a1) {
        return a0 == null ? a1 == null : a0.Z(a1);
    }

    public static boolean d(@Nullable Object object0, @Nullable Object object1) {
        if(object0 == null) {
            return object1 == null;
        }
        return object0 instanceof m ? ((m)object0).a(object1) : object0.equals(object1);
    }

    public static boolean e(@Nullable Object object0, @Nullable Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    @NonNull
    private static String f(@NonNull byte[] arr_b, @NonNull char[] arr_c) {
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            arr_c[v * 2] = o.c[(v1 & 0xFF) >>> 4];
            arr_c[v * 2 + 1] = o.c[v1 & 15];
        }
        return new String(arr_c);
    }

    @NonNull
    public static Queue g(int v) {
        return new ArrayDeque(v);
    }

    public static int h(int v, int v1, @Nullable Bitmap.Config bitmap$Config0) {
        return v * v1 * o.j(bitmap$Config0);
    }

    @TargetApi(19)
    public static int i(@NonNull Bitmap bitmap0) {
        if(!bitmap0.isRecycled()) {
            try {
                return bitmap0.getAllocationByteCount();
            }
            catch(NullPointerException unused_ex) {
                return bitmap0.getHeight() * bitmap0.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap0 + "[" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] " + bitmap0.getConfig());
    }

    public static int j(@Nullable Bitmap.Config bitmap$Config0) [...] // 潜在的解密器

    @Deprecated
    public static int k(@NonNull Bitmap bitmap0) {
        return o.i(bitmap0);
    }

    @NonNull
    public static List l(@NonNull Collection collection0) {
        List list0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    private static Handler m() {
        if(o.e == null) {
            Class class0 = o.class;
            synchronized(class0) {
                if(o.e == null) {
                    o.e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return o.e;
    }

    public static int n(float f) {
        return o.o(f, 17);
    }

    public static int o(float f, int v) {
        return v * 0x1F + Float.floatToIntBits(f);
    }

    public static int p(int v) {
        return v + 0x20F;
    }

    public static int q(int v, int v1) [...] // Inlined contents

    public static int r(@Nullable Object object0, int v) {
        return object0 == null ? v * 0x1F : v * 0x1F + object0.hashCode();
    }

    public static int s(boolean z) {
        return o.t(z, 17);
    }

    public static int t(boolean z, int v) {
        return v * 0x1F + ((int)z);
    }

    public static boolean u() {
        return !o.v();
    }

    public static boolean v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean w(int v) {
        return v > 0 || v == 0x80000000;
    }

    // 去混淆评级： 低(20)
    public static boolean x(int v, int v1) {
        return o.w(v) && o.w(v1);
    }

    public static void y(Runnable runnable0) {
        o.m().post(runnable0);
    }

    public static void z(Runnable runnable0) {
        o.m().removeCallbacks(runnable0);
    }
}

