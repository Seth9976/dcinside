package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.f;
import com.facebook.common.internal.s;
import com.facebook.common.memory.i;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.memory.j;
import com.facebook.imagepipeline.platform.d;
import com.facebook.imageutils.c;
import java.util.Locale;
import k1.n.a;
import k1.n;
import o3.h;

@f
@n(a.a)
public abstract class DalvikPurgeableDecoder implements d {
    @com.facebook.soloader.f
    static class OreoUtils {
        @TargetApi(26)
        static void a(BitmapFactory.Options bitmapFactory$Options0, @h ColorSpace colorSpace0) {
            if(colorSpace0 == null) {
                colorSpace0 = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            bitmapFactory$Options0.inPreferredColorSpace = colorSpace0;
        }
    }

    private final com.facebook.imagepipeline.memory.h a;
    protected static final byte[] b;

    static {
        com.facebook.imagepipeline.nativecode.a.a();
        DalvikPurgeableDecoder.b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
        this.a = j.a();
    }

    @Override  // com.facebook.imagepipeline.platform.d
    public com.facebook.common.references.a a(l l0, Bitmap.Config bitmap$Config0, @h Rect rect0) {
        return this.c(l0, bitmap$Config0, rect0, null);
    }

    @Override  // com.facebook.imagepipeline.platform.d
    public com.facebook.common.references.a b(l l0, Bitmap.Config bitmap$Config0, @h Rect rect0, int v, @h ColorSpace colorSpace0) {
        BitmapFactory.Options bitmapFactory$Options0 = DalvikPurgeableDecoder.h(l0.q(), bitmap$Config0);
        if(Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(bitmapFactory$Options0, colorSpace0);
        }
        com.facebook.common.references.a a0 = l0.f();
        com.facebook.common.internal.n.i(a0);
        try {
            return this.i(this.f(a0, v, bitmapFactory$Options0));
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    @Override  // com.facebook.imagepipeline.platform.d
    public com.facebook.common.references.a c(l l0, Bitmap.Config bitmap$Config0, @h Rect rect0, @h ColorSpace colorSpace0) {
        BitmapFactory.Options bitmapFactory$Options0 = DalvikPurgeableDecoder.h(l0.q(), bitmap$Config0);
        if(Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(bitmapFactory$Options0, colorSpace0);
        }
        com.facebook.common.references.a a0 = l0.f();
        com.facebook.common.internal.n.i(a0);
        try {
            return this.i(this.e(a0, bitmapFactory$Options0));
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    @Override  // com.facebook.imagepipeline.platform.d
    public com.facebook.common.references.a d(l l0, Bitmap.Config bitmap$Config0, @h Rect rect0, int v) {
        return this.b(l0, bitmap$Config0, rect0, v, null);
    }

    protected abstract Bitmap e(com.facebook.common.references.a arg1, BitmapFactory.Options arg2);

    protected abstract Bitmap f(com.facebook.common.references.a arg1, int arg2, BitmapFactory.Options arg3);

    @VisibleForTesting
    public static boolean g(com.facebook.common.references.a a0, int v) {
        i i0 = (i)a0.n();
        return v >= 2 && i0.G(v - 2) == -1 && i0.G(v - 1) == -39;
    }

    @VisibleForTesting
    public static BitmapFactory.Options h(int v, Bitmap.Config bitmap$Config0) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inDither = true;
        bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
        bitmapFactory$Options0.inPurgeable = true;
        bitmapFactory$Options0.inInputShareable = true;
        bitmapFactory$Options0.inSampleSize = v;
        bitmapFactory$Options0.inMutable = true;
        return bitmapFactory$Options0;
    }

    public com.facebook.common.references.a i(Bitmap bitmap0) {
        com.facebook.common.internal.n.i(bitmap0);
        try {
            DalvikPurgeableDecoder.nativePinBitmap(bitmap0);
        }
        catch(Exception exception0) {
            bitmap0.recycle();
            throw s.d(exception0);
        }
        if(this.a.g(bitmap0)) {
            return com.facebook.common.references.a.w(bitmap0, this.a.e());
        }
        int v = c.l(bitmap0);
        bitmap0.recycle();
        throw new com.facebook.imagepipeline.common.j(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", v, this.a.b(), this.a.f(), this.a.c(), this.a.d()));
    }

    @f
    private static native void nativePinBitmap(Bitmap arg0) {
    }
}

