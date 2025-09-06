package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;
import j..util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class x {
    class a implements b {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.x$b
        public void a() {
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.x$b
        public void b(e e0, Bitmap bitmap0) {
        }
    }

    public interface b {
        void a();

        void b(e arg1, Bitmap arg2) throws IOException;
    }

    private final e a;
    private final DisplayMetrics b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private final List d;
    private final D e;
    static final String f = "Downsampler";
    public static final i g = null;
    public static final i h = null;
    @Deprecated
    public static final i i = null;
    public static final i j = null;
    public static final i k = null;
    private static final String l = "image/vnd.wap.wbmp";
    private static final String m = "image/x-ico";
    private static final Set n;
    private static final b o;
    private static final Set p;
    private static final Queue q;

    static {
        x.g = i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.c);
        x.h = i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
        x.i = r.h;
        x.j = i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
        x.k = i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
        x.n = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        x.o = new a();
        x.p = DesugarCollections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
        x.q = o.g(0);
    }

    public x(List list0, DisplayMetrics displayMetrics0, e e0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        this.e = D.c();
        this.d = list0;
        this.b = (DisplayMetrics)m.e(displayMetrics0);
        this.a = (e)m.e(e0);
        this.c = (com.bumptech.glide.load.engine.bitmap_recycle.b)m.e(b0);
    }

    private static int A(double f) {
        return (int)(((long)f) + 0x3FE0000000000000L);
    }

    @TargetApi(26)
    private static void B(BitmapFactory.Options bitmapFactory$Options0, e e0, int v, int v1) {
        Bitmap.Config bitmap$Config0;
        if(Build.VERSION.SDK_INT >= 26) {
            if(bitmapFactory$Options0.inPreferredConfig == Bitmap.Config.HARDWARE) {
                return;
            }
            bitmap$Config0 = bitmapFactory$Options0.outConfig;
        }
        else {
            bitmap$Config0 = null;
        }
        if(bitmap$Config0 == null) {
            bitmap$Config0 = bitmapFactory$Options0.inPreferredConfig;
        }
        bitmapFactory$Options0.inBitmap = e0.g(v, v1, bitmap$Config0);
    }

    private boolean C(ImageType imageHeaderParser$ImageType0) [...] // Inlined contents

    private static int a(double f) {
        int v = x.o(f);
        int v1 = x.A(((double)v) * f);
        return x.A(f / ((double)(((float)v1) / ((float)v))) * ((double)v1));
    }

    private void b(E e0, com.bumptech.glide.load.b b0, boolean z, boolean z1, BitmapFactory.Options bitmapFactory$Options0, int v, int v1) {
        boolean z2;
        if(this.e.h(v, v1, bitmapFactory$Options0, z, z1)) {
            return;
        }
        if(b0 != com.bumptech.glide.load.b.a) {
            try {
                z2 = e0.d().hasAlpha();
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + b0, iOException0);
                }
                z2 = false;
            }
            bitmapFactory$Options0.inPreferredConfig = z2 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            if((z2 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565) == Bitmap.Config.RGB_565) {
                bitmapFactory$Options0.inDither = true;
            }
            return;
        }
        bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    private static void c(ImageType imageHeaderParser$ImageType0, E e0, b x$b0, e e1, r r0, int v, int v1, int v2, int v3, int v4, BitmapFactory.Options bitmapFactory$Options0) throws IOException {
        int v14;
        int v13;
        int v11;
        int v6;
        int v5;
        if(v1 > 0 && v2 > 0) {
            if(x.u(v)) {
                v5 = v1;
                v6 = v2;
            }
            else {
                v6 = v1;
                v5 = v2;
            }
            float f = r0.b(v6, v5, v3, v4);
            if(f <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + f + " from: " + r0 + ", source: [" + v1 + "x" + v2 + "], target: [" + v3 + "x" + v4 + "]");
            }
            g r$g0 = r0.a(v6, v5, v3, v4);
            if(r$g0 == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int v7 = v6 / x.A(f * ((float)v6));
            int v8 = v5 / x.A(f * ((float)v5));
            g r$g1 = g.a;
            int v9 = r$g0 == r$g1 ? Math.max(v7, v8) : Math.min(v7, v8);
            int v10 = Build.VERSION.SDK_INT;
            if(v10 > 23 || !x.n.contains(bitmapFactory$Options0.outMimeType)) {
                int v12 = Math.max(1, Integer.highestOneBit(v9));
                v11 = r$g0 != r$g1 || ((float)v12) >= 1.0f / f ? Math.max(1, Integer.highestOneBit(v9)) : v12 << 1;
            }
            else {
                v11 = 1;
            }
            bitmapFactory$Options0.inSampleSize = v11;
            if(imageHeaderParser$ImageType0 == ImageType.JPEG) {
                float f1 = (float)Math.min(v11, 8);
                v13 = (int)Math.ceil(((float)v6) / f1);
                v14 = (int)Math.ceil(((float)v5) / f1);
                if(v11 / 8 > 0) {
                    v13 /= v11 / 8;
                    v14 /= v11 / 8;
                }
            }
            else if(imageHeaderParser$ImageType0 == ImageType.PNG || imageHeaderParser$ImageType0 == ImageType.PNG_A) {
                v13 = (int)Math.floor(((float)v6) / ((float)v11));
                v14 = (int)Math.floor(((float)v5) / ((float)v11));
            }
            else if(!imageHeaderParser$ImageType0.isWebp()) {
                if(v6 % v11 == 0 && v5 % v11 == 0) {
                    v13 = v6 / v11;
                    v14 = v5 / v11;
                }
                else {
                    int[] arr_v = x.p(e0, bitmapFactory$Options0, x$b0, e1);
                    v13 = arr_v[0];
                    v14 = arr_v[1];
                }
            }
            else if(v10 >= 24) {
                v13 = Math.round(((float)v6) / ((float)v11));
                v14 = Math.round(((float)v5) / ((float)v11));
            }
            else {
                v13 = (int)Math.floor(((float)v6) / ((float)v11));
                v14 = (int)Math.floor(((float)v5) / ((float)v11));
            }
            double f2 = (double)r0.b(v13, v14, v3, v4);
            bitmapFactory$Options0.inTargetDensity = x.a(f2);
            bitmapFactory$Options0.inDensity = x.o(f2);
            if(x.v(bitmapFactory$Options0)) {
                bitmapFactory$Options0.inScaled = true;
            }
            else {
                bitmapFactory$Options0.inTargetDensity = 0;
                bitmapFactory$Options0.inDensity = 0;
            }
            if(Log.isLoggable("Downsampler", 2)) {
                Log.v("Downsampler", "Calculate scaling, source: [" + v1 + "x" + v2 + "], degreesToRotate: " + v + ", target: [" + v3 + "x" + v4 + "], power of two scaled: [" + v13 + "x" + v14 + "], exact scale factor: " + f + ", power of 2 sample size: " + v11 + ", adjusted scale factor: " + f2 + ", target density: " + bitmapFactory$Options0.inTargetDensity + ", density: " + bitmapFactory$Options0.inDensity);
            }
            return;
        }
        if(Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageHeaderParser$ImageType0 + " with target [" + v3 + "x" + v4 + "]");
        }
    }

    @RequiresApi(21)
    public v d(ParcelFileDescriptor parcelFileDescriptor0, int v, int v1, j j0) throws IOException {
        return this.e(new com.bumptech.glide.load.resource.bitmap.E.e(parcelFileDescriptor0, this.d, this.c), v, v1, j0, x.o);
    }

    private v e(E e0, int v, int v1, j j0, b x$b0) throws IOException {
        Object object0 = this.c.d(0x10000, byte[].class);
        BitmapFactory.Options bitmapFactory$Options0 = x.n();
        bitmapFactory$Options0.inTempStorage = (byte[])object0;
        com.bumptech.glide.load.b b0 = (com.bumptech.glide.load.b)j0.c(x.g);
        k k0 = (k)j0.c(x.h);
        r r0 = (r)j0.c(r.h);
        boolean z = ((Boolean)j0.c(x.j)).booleanValue();
        boolean z1 = j0.c(x.k) != null && ((Boolean)j0.c(x.k)).booleanValue();
        try {
            return h.c(this.k(e0, bitmapFactory$Options0, r0, b0, k0, z1, v, v1, z, x$b0), this.a);
        }
        finally {
            x.y(bitmapFactory$Options0);
            this.c.put(((byte[])object0));
        }
    }

    public v f(InputStream inputStream0, int v, int v1, j j0) throws IOException {
        return this.g(inputStream0, v, v1, j0, x.o);
    }

    public v g(InputStream inputStream0, int v, int v1, j j0, b x$b0) throws IOException {
        return this.e(new d(inputStream0, this.d, this.c), v, v1, j0, x$b0);
    }

    public v h(ByteBuffer byteBuffer0, int v, int v1, j j0) throws IOException {
        return this.e(new com.bumptech.glide.load.resource.bitmap.E.b(byteBuffer0, this.d, this.c), v, v1, j0, x.o);
    }

    @VisibleForTesting
    void i(File file0, int v, int v1, j j0) throws IOException {
        this.e(new c(file0, this.d, this.c), v, v1, j0, x.o);
    }

    @VisibleForTesting
    void j(byte[] arr_b, int v, int v1, j j0) throws IOException {
        this.e(new com.bumptech.glide.load.resource.bitmap.E.a(arr_b, this.d, this.c), v, v1, j0, x.o);
    }

    private Bitmap k(E e0, BitmapFactory.Options bitmapFactory$Options0, r r0, com.bumptech.glide.load.b b0, k k0, boolean z, int v, int v1, boolean z1, b x$b0) throws IOException {
        int v11;
        int v10;
        int v8;
        int v7;
        long v2 = com.bumptech.glide.util.i.b();
        int[] arr_v = x.p(e0, bitmapFactory$Options0, x$b0, this.a);
        int v3 = arr_v[0];
        int v4 = arr_v[1];
        String s = bitmapFactory$Options0.outMimeType;
        int v5 = e0.b();
        int v6 = N.j(v5);
        boolean z2 = N.m(v5);
        if(v != 0x80000000) {
            v7 = v;
        }
        else if(x.u(v6)) {
            v7 = v4;
        }
        else {
            v7 = v3;
        }
        if(v1 != 0x80000000) {
            v8 = v1;
        }
        else if(x.u(v6)) {
            v8 = v3;
        }
        else {
            v8 = v4;
        }
        x.c(e0.d(), e0, x$b0, this.a, r0, v6, v3, v4, v7, v8, bitmapFactory$Options0);
        this.b(e0, b0, (v3 == -1 || v4 == -1 ? false : z), z2, bitmapFactory$Options0, v7, v8);
        int v9 = Build.VERSION.SDK_INT;
        if(v3 < 0 || v4 < 0 || !z1) {
            float f = x.v(bitmapFactory$Options0) ? ((float)bitmapFactory$Options0.inTargetDensity) / ((float)bitmapFactory$Options0.inDensity) : 1.0f;
            int v12 = bitmapFactory$Options0.inSampleSize;
            v10 = Math.round(((float)(((int)Math.ceil(((float)v3) / ((float)v12))))) * f);
            v11 = Math.round(((float)(((int)Math.ceil(((float)v4) / ((float)v12))))) * f);
            if(Log.isLoggable("Downsampler", 2)) {
                Log.v("Downsampler", "Calculated target [" + v10 + "x" + v11 + "] for source [" + v3 + "x" + v4 + "], sampleSize: " + v12 + ", targetDensity: " + bitmapFactory$Options0.inTargetDensity + ", density: " + bitmapFactory$Options0.inDensity + ", density multiplier: " + f);
            }
        }
        else {
            v10 = v7;
            v11 = v8;
        }
        if(v10 > 0 && v11 > 0) {
            x.B(bitmapFactory$Options0, this.a, v10, v11);
        }
        if(k0 != null) {
            if(v9 >= 28) {
                bitmapFactory$Options0.inPreferredColorSpace = ColorSpace.get((k0 != k.b || bitmapFactory$Options0.outColorSpace == null || !bitmapFactory$Options0.outColorSpace.isWideGamut() ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3));
            }
            else if(v9 >= 26) {
                bitmapFactory$Options0.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmap0 = x.l(e0, bitmapFactory$Options0, x$b0, this.a);
        x$b0.b(this.a, bitmap0);
        if(Log.isLoggable("Downsampler", 2)) {
            x.w(v3, v4, s, bitmapFactory$Options0, bitmap0, v, v1, v2);
        }
        if(bitmap0 != null) {
            bitmap0.setDensity(this.b.densityDpi);
            Bitmap bitmap1 = N.o(this.a, bitmap0, v5);
            if(!bitmap0.equals(bitmap1)) {
                this.a.e(bitmap0);
                return bitmap1;
            }
            return bitmap1;
        }
        return null;
    }

    private static Bitmap l(E e0, BitmapFactory.Options bitmapFactory$Options0, b x$b0, e e1) throws IOException {
        if(!bitmapFactory$Options0.inJustDecodeBounds) {
            x$b0.a();
            e0.a();
        }
        int v = bitmapFactory$Options0.outWidth;
        int v1 = bitmapFactory$Options0.outHeight;
        String s = bitmapFactory$Options0.outMimeType;
        N.i().lock();
        try {
            return e0.c(bitmapFactory$Options0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            IOException iOException0 = x.x(illegalArgumentException0, v, v1, s, bitmapFactory$Options0);
            if(Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException0);
            }
            Bitmap bitmap1 = bitmapFactory$Options0.inBitmap;
            if(bitmap1 != null) {
                try {
                    e1.e(bitmap1);
                    bitmapFactory$Options0.inBitmap = null;
                    return x.l(e0, bitmapFactory$Options0, x$b0, e1);
                }
                catch(IOException unused_ex) {
                    throw iOException0;
                }
            }
            throw iOException0;
        }
        finally {
            N.i().unlock();
        }
    }

    @TargetApi(19)
    @Nullable
    private static String m(Bitmap bitmap0) {
        return bitmap0 == null ? null : "[" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] " + bitmap0.getConfig() + (" (" + bitmap0.getAllocationByteCount() + ")");
    }

    private static BitmapFactory.Options n() {
        BitmapFactory.Options bitmapFactory$Options0;
        synchronized(x.class) {
            Queue queue0 = x.q;
            synchronized(queue0) {
                bitmapFactory$Options0 = (BitmapFactory.Options)queue0.poll();
            }
            if(bitmapFactory$Options0 == null) {
                bitmapFactory$Options0 = new BitmapFactory.Options();
                x.z(bitmapFactory$Options0);
            }
            return bitmapFactory$Options0;
        }
    }

    private static int o(double f) {
        if(f > 1.0) {
            f = 1.0 / f;
        }
        return (int)Math.round(f * 2147483647.0);
    }

    private static int[] p(E e0, BitmapFactory.Options bitmapFactory$Options0, b x$b0, e e1) throws IOException {
        bitmapFactory$Options0.inJustDecodeBounds = true;
        x.l(e0, bitmapFactory$Options0, x$b0, e1);
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return new int[]{bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight};
    }

    private static String q(BitmapFactory.Options bitmapFactory$Options0) {
        return x.m(bitmapFactory$Options0.inBitmap);
    }

    // 去混淆评级： 低(20)
    public boolean r(ParcelFileDescriptor parcelFileDescriptor0) {
        return 1;
    }

    public boolean s(InputStream inputStream0) [...] // Inlined contents

    public boolean t(ByteBuffer byteBuffer0) [...] // Inlined contents

    private static boolean u(int v) {
        return v == 90 || v == 270;
    }

    private static boolean v(BitmapFactory.Options bitmapFactory$Options0) {
        return bitmapFactory$Options0.inTargetDensity > 0 && (bitmapFactory$Options0.inDensity > 0 && bitmapFactory$Options0.inTargetDensity != bitmapFactory$Options0.inDensity);
    }

    private static void w(int v, int v1, String s, BitmapFactory.Options bitmapFactory$Options0, Bitmap bitmap0, int v2, int v3, long v4) {
        Log.v("Downsampler", "Decoded " + x.m(bitmap0) + " from [" + v + "x" + v1 + "] " + s + " with inBitmap " + x.q(bitmapFactory$Options0) + " for [" + v2 + "x" + v3 + "], sample size: " + bitmapFactory$Options0.inSampleSize + ", density: " + bitmapFactory$Options0.inDensity + ", target density: " + bitmapFactory$Options0.inTargetDensity + ", thread: " + "jeb-dexdec-sb-st-3725" + ", duration: " + com.bumptech.glide.util.i.a(v4));
    }

    private static IOException x(IllegalArgumentException illegalArgumentException0, int v, int v1, String s, BitmapFactory.Options bitmapFactory$Options0) {
        return new IOException("Exception decoding bitmap, outWidth: " + v + ", outHeight: " + v1 + ", outMimeType: " + s + ", inBitmap: " + x.q(bitmapFactory$Options0), illegalArgumentException0);
    }

    private static void y(BitmapFactory.Options bitmapFactory$Options0) {
        x.z(bitmapFactory$Options0);
        synchronized(x.q) {
            x.q.offer(bitmapFactory$Options0);
        }
    }

    private static void z(BitmapFactory.Options bitmapFactory$Options0) {
        bitmapFactory$Options0.inTempStorage = null;
        bitmapFactory$Options0.inDither = false;
        bitmapFactory$Options0.inScaled = false;
        bitmapFactory$Options0.inSampleSize = 1;
        bitmapFactory$Options0.inPreferredConfig = null;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        bitmapFactory$Options0.inDensity = 0;
        bitmapFactory$Options0.inTargetDensity = 0;
        if(Build.VERSION.SDK_INT >= 26) {
            bitmapFactory$Options0.inPreferredColorSpace = null;
            bitmapFactory$Options0.outColorSpace = null;
            bitmapFactory$Options0.outConfig = null;
        }
        bitmapFactory$Options0.outWidth = 0;
        bitmapFactory$Options0.outHeight = 0;
        bitmapFactory$Options0.outMimeType = null;
        bitmapFactory$Options0.inBitmap = null;
        bitmapFactory$Options0.inMutable = true;
    }
}

