package com.bumptech.glide.integration.webp.decoder;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.integration.webp.WebpBitmapFactory;
import com.bumptech.glide.integration.webp.d;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.N;
import com.bumptech.glide.load.resource.bitmap.h;
import com.bumptech.glide.load.resource.bitmap.r.g;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.x.b;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public final class k {
    static final class a implements b {
        @Override  // com.bumptech.glide.load.resource.bitmap.x$b
        public void a() {
        }

        @Override  // com.bumptech.glide.load.resource.bitmap.x$b
        public void b(e e0, Bitmap bitmap0) throws IOException {
        }
    }

    private final e a;
    private final DisplayMetrics b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private final List d;
    private static final String e = "WebpDownsampler";
    public static final i f = null;
    public static final i g = null;
    private static final b h = null;
    private static final Queue i = null;
    private static final int j = 0xA00000;
    private static final int k = 1000000000;

    static {
        k.f = i.g("com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder", Boolean.FALSE);
        k.g = i.g("com.bumptech.glide.integration.webp.decoder.WebpDownsampler.SystemDecoder", Boolean.TRUE);
        k.h = new a();
        k.i = o.g(0);
    }

    public k(List list0, DisplayMetrics displayMetrics0, e e0, com.bumptech.glide.load.engine.bitmap_recycle.b b0) {
        this.d = list0;
        this.b = (DisplayMetrics)m.e(displayMetrics0);
        this.a = (e)m.e(e0);
        this.c = (com.bumptech.glide.load.engine.bitmap_recycle.b)m.e(b0);
    }

    private static int a(double f) {
        int v = k.s(1000000000.0 * f);
        return k.s(f / ((double)(((float)v) / 1000000000.0f)) * ((double)v));
    }

    private void b(InputStream inputStream0, com.bumptech.glide.load.b b0, boolean z, boolean z1, BitmapFactory.Options bitmapFactory$Options0, int v, int v1) throws IOException {
        boolean z2;
        if(b0 != com.bumptech.glide.load.b.a) {
            try {
                z2 = f.f(this.d, inputStream0, this.c).hasAlpha();
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Cannot determine whether the image has alpha or not from header, format " + b0, iOException0);
                }
                z2 = false;
            }
            Bitmap.Config bitmap$Config0 = z2 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
            if(bitmap$Config0 == Bitmap.Config.RGB_565 || bitmap$Config0 == Bitmap.Config.ARGB_4444 || bitmap$Config0 == Bitmap.Config.ALPHA_8) {
                bitmapFactory$Options0.inDither = true;
            }
            return;
        }
        bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    static void c(ImageType imageHeaderParser$ImageType0, InputStream inputStream0, b x$b0, e e0, r r0, int v, int v1, int v2, int v3, int v4, BitmapFactory.Options bitmapFactory$Options0) throws IOException {
        int v10;
        int v9;
        if(v1 > 0 && v2 > 0) {
            float f = v == 90 || v == 270 ? r0.b(v2, v1, v3, v4) : r0.b(v1, v2, v3, v4);
            if(f <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + f + " from: " + r0 + ", source: [" + v1 + "x" + v2 + "], target: [" + v3 + "x" + v4 + "]");
            }
            g r$g0 = r0.a(v1, v2, v3, v4);
            if(r$g0 == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int v5 = v1 / k.s(f * ((float)v1));
            int v6 = v2 / k.s(f * ((float)v2));
            int v7 = r$g0 == g.a ? Math.max(v5, v6) : Math.min(v5, v6);
            int v8 = Math.max(1, Integer.highestOneBit(v7));
            v8 = r$g0 != g.a || ((float)v8) >= 1.0f / f ? Math.max(1, Integer.highestOneBit(v7)) : v8 << 1;
            bitmapFactory$Options0.inSampleSize = v8;
            if(imageHeaderParser$ImageType0 == ImageType.JPEG) {
                float f1 = (float)Math.min(v8, 8);
                v9 = (int)Math.ceil(((float)v1) / f1);
                v10 = (int)Math.ceil(((float)v2) / f1);
                if(v8 / 8 > 0) {
                    v9 /= v8 / 8;
                    v10 /= v8 / 8;
                }
            }
            else if(imageHeaderParser$ImageType0 == ImageType.PNG || imageHeaderParser$ImageType0 == ImageType.PNG_A) {
                v9 = (int)Math.floor(((float)v1) / ((float)v8));
                v10 = (int)Math.floor(((float)v2) / ((float)v8));
            }
            else if(imageHeaderParser$ImageType0 == ImageType.WEBP || imageHeaderParser$ImageType0 == ImageType.WEBP_A) {
                if(Build.VERSION.SDK_INT >= 24) {
                    v9 = Math.round(((float)v1) / ((float)v8));
                    v10 = Math.round(((float)v2) / ((float)v8));
                }
                else {
                    v9 = (int)Math.floor(((float)v1) / ((float)v8));
                    v10 = (int)Math.floor(((float)v2) / ((float)v8));
                }
            }
            else if(v1 % v8 != 0 || v2 % v8 != 0) {
                int[] arr_v = k.j(inputStream0, bitmapFactory$Options0, x$b0, e0);
                v9 = arr_v[0];
                v10 = arr_v[1];
            }
            else {
                v9 = v1 / v8;
                v10 = v2 / v8;
            }
            double f2 = (double)r0.b(v9, v10, v3, v4);
            bitmapFactory$Options0.inTargetDensity = k.a(f2);
            bitmapFactory$Options0.inDensity = 1000000000;
            if(k.n(bitmapFactory$Options0)) {
                bitmapFactory$Options0.inScaled = true;
            }
            else {
                bitmapFactory$Options0.inTargetDensity = 0;
                bitmapFactory$Options0.inDensity = 0;
            }
            if(Log.isLoggable("WebpDownsampler", 2)) {
                Log.v("WebpDownsampler", "Calculate scaling, source: [" + v1 + "x" + v2 + "], target: [" + v3 + "x" + v4 + "], power of two scaled: [" + v9 + "x" + v10 + "], exact scale factor: " + f + ", power of 2 sample size: " + v8 + ", adjusted scale factor: " + f2 + ", target density: " + bitmapFactory$Options0.inTargetDensity + ", density: " + bitmapFactory$Options0.inDensity);
            }
        }
    }

    public v d(InputStream inputStream0, int v, int v1, j j0) throws IOException {
        return this.e(inputStream0, v, v1, j0, k.h);
    }

    public v e(InputStream inputStream0, int v, int v1, j j0, b x$b0) throws IOException {
        m.b(inputStream0.markSupported(), "You must provide an InputStream that supports mark()");
        Object object0 = this.c.d(0x10000, byte[].class);
        BitmapFactory.Options bitmapFactory$Options0 = k.i();
        bitmapFactory$Options0.inTempStorage = (byte[])object0;
        com.bumptech.glide.load.b b0 = (com.bumptech.glide.load.b)j0.c(x.g);
        r r0 = (r)j0.c(x.i);
        boolean z = ((Boolean)j0.c(x.j)).booleanValue();
        boolean z1 = j0.c(x.k) != null && ((Boolean)j0.c(x.k)).booleanValue();
        try {
            return h.c(this.f(inputStream0, bitmapFactory$Options0, r0, b0, z1, v, v1, z, x$b0), this.a);
        }
        finally {
            k.q(bitmapFactory$Options0);
            this.c.f(((byte[])object0), byte[].class);
        }
    }

    private Bitmap f(InputStream inputStream0, BitmapFactory.Options bitmapFactory$Options0, r r0, com.bumptech.glide.load.b b0, boolean z, int v, int v1, boolean z1, b x$b0) throws IOException {
        int v9;
        int v8;
        long v2 = com.bumptech.glide.util.i.b();
        int[] arr_v = k.j(inputStream0, bitmapFactory$Options0, x$b0, this.a);
        int v3 = arr_v[0];
        int v4 = arr_v[1];
        String s = bitmapFactory$Options0.outMimeType;
        int v5 = f.b(this.d, inputStream0, this.c);
        int v6 = v == 0x80000000 ? v3 : v;
        int v7 = v1 == 0x80000000 ? v4 : v1;
        k.c(f.f(this.d, inputStream0, this.c), inputStream0, x$b0, this.a, r0, N.j(v5), v3, v4, v6, v7, bitmapFactory$Options0);
        this.b(inputStream0, b0, (v3 == -1 || v4 == -1 ? false : z), N.m(v5), bitmapFactory$Options0, v6, v7);
        if(z1) {
            v8 = v6;
            v9 = v7;
        }
        else {
            float f = k.n(bitmapFactory$Options0) ? ((float)bitmapFactory$Options0.inTargetDensity) / ((float)bitmapFactory$Options0.inDensity) : 1.0f;
            int v10 = bitmapFactory$Options0.inSampleSize;
            v8 = Math.round(((float)(((int)Math.ceil(((float)v3) / ((float)v10))))) * f);
            v9 = Math.round(((float)(((int)Math.ceil(((float)v4) / ((float)v10))))) * f);
            if(Log.isLoggable("WebpDownsampler", 2)) {
                Log.v("WebpDownsampler", "Calculated target [" + v8 + "x" + v9 + "] for source [" + v3 + "x" + v4 + "], sampleSize: " + v10 + ", targetDensity: " + bitmapFactory$Options0.inTargetDensity + ", density: " + bitmapFactory$Options0.inDensity + ", density multiplier: " + f);
            }
        }
        if(v8 > 0 && v9 > 0) {
            k.t(bitmapFactory$Options0, this.a, v8, v9);
        }
        Bitmap bitmap0 = k.g(inputStream0, bitmapFactory$Options0, x$b0, this.a);
        x$b0.b(this.a, bitmap0);
        if(Log.isLoggable("WebpDownsampler", 2)) {
            k.o(v3, v4, s, bitmapFactory$Options0, bitmap0, v, v1, v2);
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

    private static Bitmap g(InputStream inputStream0, BitmapFactory.Options bitmapFactory$Options0, b x$b0, e e0) throws IOException {
        Bitmap bitmap0;
        if(bitmapFactory$Options0.inJustDecodeBounds) {
            inputStream0.mark(0xA00000);
        }
        else {
            x$b0.a();
        }
        int v = bitmapFactory$Options0.outWidth;
        int v1 = bitmapFactory$Options0.outHeight;
        String s = bitmapFactory$Options0.outMimeType;
        N.i().lock();
        try {
            bitmap0 = WebpBitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            IOException iOException0 = k.p(illegalArgumentException0, v, v1, s, bitmapFactory$Options0);
            if(Log.isLoggable("WebpDownsampler", 3)) {
                Log.d("WebpDownsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException0);
            }
            if(bitmapFactory$Options0.inBitmap != null) {
                try {
                    inputStream0.reset();
                    e0.e(bitmapFactory$Options0.inBitmap);
                    bitmapFactory$Options0.inBitmap = null;
                    return k.g(inputStream0, bitmapFactory$Options0, x$b0, e0);
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
        if(bitmapFactory$Options0.inJustDecodeBounds) {
            inputStream0.reset();
        }
        return bitmap0;
    }

    @TargetApi(19)
    @Nullable
    private static String h(Bitmap bitmap0) {
        return bitmap0 == null ? null : "[" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] " + bitmap0.getConfig() + (" (" + bitmap0.getAllocationByteCount() + ")");
    }

    private static BitmapFactory.Options i() {
        BitmapFactory.Options bitmapFactory$Options0;
        synchronized(k.class) {
            Queue queue0 = k.i;
            synchronized(queue0) {
                bitmapFactory$Options0 = (BitmapFactory.Options)queue0.poll();
            }
            if(bitmapFactory$Options0 == null) {
                bitmapFactory$Options0 = new BitmapFactory.Options();
                k.r(bitmapFactory$Options0);
            }
            return bitmapFactory$Options0;
        }
    }

    private static int[] j(InputStream inputStream0, BitmapFactory.Options bitmapFactory$Options0, b x$b0, e e0) throws IOException {
        bitmapFactory$Options0.inJustDecodeBounds = true;
        k.g(inputStream0, bitmapFactory$Options0, x$b0, e0);
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return new int[]{bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight};
    }

    private static String k(BitmapFactory.Options bitmapFactory$Options0) {
        return k.h(bitmapFactory$Options0.inBitmap);
    }

    public boolean l(InputStream inputStream0, j j0) throws IOException {
        if(((Boolean)j0.c(k.f)).booleanValue()) {
            return false;
        }
        if(((Boolean)j0.c(k.g)).booleanValue()) {
            if(d.k) {
                return false;
            }
            com.bumptech.glide.integration.webp.d.e d$e0 = d.b(inputStream0, this.c);
            return d.i(d$e0) && d$e0 != com.bumptech.glide.integration.webp.d.e.c;
        }
        return d.i(d.b(inputStream0, this.c));
    }

    public boolean m(ByteBuffer byteBuffer0, j j0) throws IOException {
        if(((Boolean)j0.c(k.f)).booleanValue()) {
            return false;
        }
        if(((Boolean)j0.c(k.g)).booleanValue()) {
            if(d.k) {
                return false;
            }
            com.bumptech.glide.integration.webp.d.e d$e0 = d.c(byteBuffer0);
            return d.i(d$e0) && d$e0 != com.bumptech.glide.integration.webp.d.e.c;
        }
        return d.i(d.c(byteBuffer0));
    }

    private static boolean n(BitmapFactory.Options bitmapFactory$Options0) {
        return bitmapFactory$Options0.inTargetDensity > 0 && (bitmapFactory$Options0.inDensity > 0 && bitmapFactory$Options0.inTargetDensity != bitmapFactory$Options0.inDensity);
    }

    private static void o(int v, int v1, String s, BitmapFactory.Options bitmapFactory$Options0, Bitmap bitmap0, int v2, int v3, long v4) {
        Log.v("WebpDownsampler", "Decoded " + k.h(bitmap0) + " from [" + v + "x" + v1 + "] " + s + " with inBitmap " + k.k(bitmapFactory$Options0) + " for [" + v2 + "x" + v3 + "], sample size: " + bitmapFactory$Options0.inSampleSize + ", density: " + bitmapFactory$Options0.inDensity + ", target density: " + bitmapFactory$Options0.inTargetDensity + ", thread: " + "jeb-dexdec-sb-st-3713" + ", duration: " + com.bumptech.glide.util.i.a(v4));
    }

    private static IOException p(IllegalArgumentException illegalArgumentException0, int v, int v1, String s, BitmapFactory.Options bitmapFactory$Options0) {
        return new IOException("Exception decoding bitmap, outWidth: " + v + ", outHeight: " + v1 + ", outMimeType: " + s + ", inBitmap: " + k.k(bitmapFactory$Options0), illegalArgumentException0);
    }

    private static void q(BitmapFactory.Options bitmapFactory$Options0) {
        k.r(bitmapFactory$Options0);
        synchronized(k.i) {
            k.i.offer(bitmapFactory$Options0);
        }
    }

    private static void r(BitmapFactory.Options bitmapFactory$Options0) {
        bitmapFactory$Options0.inTempStorage = null;
        bitmapFactory$Options0.inDither = false;
        bitmapFactory$Options0.inScaled = false;
        bitmapFactory$Options0.inSampleSize = 1;
        bitmapFactory$Options0.inPreferredConfig = null;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        bitmapFactory$Options0.inDensity = 0;
        bitmapFactory$Options0.inTargetDensity = 0;
        bitmapFactory$Options0.outWidth = 0;
        bitmapFactory$Options0.outHeight = 0;
        bitmapFactory$Options0.outMimeType = null;
        bitmapFactory$Options0.inBitmap = null;
        bitmapFactory$Options0.inMutable = true;
    }

    private static int s(double f) {
        return (int)(((long)f) + 0x3FE0000000000000L);
    }

    @TargetApi(26)
    private static void t(BitmapFactory.Options bitmapFactory$Options0, e e0, int v, int v1) {
        if(Build.VERSION.SDK_INT >= 26 && bitmapFactory$Options0.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        }
        bitmapFactory$Options0.inBitmap = e0.g(v, v1, bitmapFactory$Options0.inPreferredConfig);
    }

    private boolean u(ImageType imageHeaderParser$ImageType0) throws IOException [...] // Inlined contents
}

