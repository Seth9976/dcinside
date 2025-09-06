package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Pair;
import androidx.core.util.Pools.SynchronizedPool;
import com.facebook.common.memory.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtil.kt\ncom/facebook/imageutils/BitmapUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,226:1\n1#2:227\n*E\n"})
public final class c {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[Bitmap.Config.values().length];
            try {
                arr_v[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.Config.RGB_565.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Bitmap.Config.HARDWARE.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    public static final c a = null;
    private static final int b = 12;
    @l
    private static final D c = null;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 2;
    public static final int h = 8;
    public static final int i = 4;
    public static final float j = 2048.0f;
    private static boolean k;
    private static boolean l;

    static {
        c.a = new c();
        c.c = E.a(() -> new SynchronizedPool(12));
    }

    // 检测为 Lambda 实现
    private static final SynchronizedPool b() [...]

    // 去混淆评级： 低(20)
    private final ByteBuffer c() {
        return c.k ? b.a.d() : ((ByteBuffer)this.i().b());
    }

    @m
    @n
    public static final Pair d(@l Uri uri0) {
        L.p(uri0, "uri");
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri0.getPath(), bitmapFactory$Options0);
        return bitmapFactory$Options0.outWidth == -1 || bitmapFactory$Options0.outHeight == -1 ? null : new Pair(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight);
    }

    @m
    @n
    public static final Pair e(@m InputStream inputStream0) {
        Pair pair0;
        if(inputStream0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c c0 = c.a;
        ByteBuffer byteBuffer0 = c0.m();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        try {
            bitmapFactory$Options0.inTempStorage = byteBuffer0.array();
            pair0 = null;
            c0.h(inputStream0, null, bitmapFactory$Options0);
            if(bitmapFactory$Options0.outWidth != -1 && bitmapFactory$Options0.outHeight != -1) {
                pair0 = new Pair(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight);
            }
        }
        catch(Throwable throwable0) {
            c.a.n(byteBuffer0);
            throw throwable0;
        }
        c0.n(byteBuffer0);
        return pair0;
    }

    @m
    @n
    public static final Pair f(@m byte[] arr_b) {
        return c.e(new ByteArrayInputStream(arr_b));
    }

    @l
    @n
    public static final e g(@m InputStream inputStream0) {
        e e0;
        if(inputStream0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c c0 = c.a;
        ByteBuffer byteBuffer0 = c0.m();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        try {
            bitmapFactory$Options0.inTempStorage = byteBuffer0.array();
            ColorSpace colorSpace0 = null;
            c0.h(inputStream0, null, bitmapFactory$Options0);
            if(Build.VERSION.SDK_INT >= 26) {
                colorSpace0 = bitmapFactory$Options0.outColorSpace;
            }
            e0 = new e(bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight, colorSpace0);
        }
        catch(Throwable throwable0) {
            c.a.n(byteBuffer0);
            throw throwable0;
        }
        c0.n(byteBuffer0);
        return e0;
    }

    @m
    public final Bitmap h(@m InputStream inputStream0, @m Rect rect0, @m BitmapFactory.Options bitmapFactory$Options0) {
        if(c.l) {
            try {
                return BitmapFactory.decodeStream(inputStream0, rect0, bitmapFactory$Options0);
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }
        return BitmapFactory.decodeStream(inputStream0, rect0, bitmapFactory$Options0);
    }

    private final SynchronizedPool i() {
        return (SynchronizedPool)c.c.getValue();
    }

    @SuppressLint({"NewApi"})
    @n
    public static final int j(@m Bitmap.Config bitmap$Config0) {
        switch((bitmap$Config0 == null ? -1 : a.a[bitmap$Config0.ordinal()])) {
            case 2: {
                return 1;
            }
            case 3: 
            case 4: {
                return 2;
            }
            case 5: {
                return 8;
            }
            case 1: 
            case 6: 
            case 7: {
                return 4;
            }
            default: {
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
            }
        }
    }

    @n
    public static final int k(int v, int v1, @m Bitmap.Config bitmap$Config0) {
        if(v <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + v).toString());
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException(("height must be > 0, height is: " + v1).toString());
        }
        int v2 = c.j(bitmap$Config0);
        int v3 = v * v1 * v2;
        if(v3 <= 0) {
            throw new IllegalStateException(("size must be > 0: size: " + v3 + ", width: " + v + ", height: " + v1 + ", pixelSize: " + v2).toString());
        }
        return v3;
    }

    @SuppressLint({"NewApi"})
    @n
    public static final int l(@m Bitmap bitmap0) {
        if(bitmap0 == null) {
            return 0;
        }
        try {
            return bitmap0.getAllocationByteCount();
        }
        catch(NullPointerException unused_ex) {
            return bitmap0.getByteCount();
        }
    }

    private final ByteBuffer m() {
        ByteBuffer byteBuffer0 = this.c();
        if(byteBuffer0 == null) {
            byteBuffer0 = ByteBuffer.allocate(0x4000);
            L.o(byteBuffer0, "allocate(...)");
        }
        return byteBuffer0;
    }

    private final void n(ByteBuffer byteBuffer0) {
        if(!c.k) {
            this.i().a(byteBuffer0);
        }
    }

    @n
    public static final void o(boolean z) {
        c.l = z;
    }

    @n
    public static final void p(boolean z) {
        c.k = z;
    }
}

