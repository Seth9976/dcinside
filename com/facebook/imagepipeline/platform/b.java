package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools.Pool;
import com.facebook.common.references.h;
import com.facebook.imagepipeline.bitmaps.g;
import com.facebook.imagepipeline.image.l;
import com.facebook.imagepipeline.memory.k;
import com.facebook.imagepipeline.memory.w;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;
import p3.d;

@n(a.a)
@d
public abstract class b implements com.facebook.imagepipeline.platform.d {
    static final class com.facebook.imagepipeline.platform.b.a implements h {
        private static final com.facebook.imagepipeline.platform.b.a a;

        static {
            com.facebook.imagepipeline.platform.b.a.a = new com.facebook.imagepipeline.platform.b.a();
        }

        @Override  // com.facebook.common.references.h
        public void a(Object object0) {
        }

        public void c(Bitmap bitmap0) {
        }
    }

    private final k a;
    private boolean b;
    private boolean c;
    @o3.h
    private final PreverificationHelper d;
    @VisibleForTesting
    final Pool e;
    private static final Class f;
    private static final byte[] g;

    static {
        b.f = b.class;
        b.g = new byte[]{-1, -39};
    }

    public b(k k0, Pool pools$Pool0, f f0) {
        this.d = Build.VERSION.SDK_INT < 26 ? null : new PreverificationHelper();
        this.a = k0;
        if(k0 instanceof w) {
            this.b = f0.a();
            this.c = f0.b();
        }
        this.e = pools$Pool0;
    }

    @Override  // com.facebook.imagepipeline.platform.d
    @o3.h
    public com.facebook.common.references.a a(l l0, Bitmap.Config bitmap$Config0, @o3.h Rect rect0) {
        return this.c(l0, bitmap$Config0, rect0, null);
    }

    @Override  // com.facebook.imagepipeline.platform.d
    @o3.h
    public com.facebook.common.references.a b(l l0, Bitmap.Config bitmap$Config0, @o3.h Rect rect0, int v, @o3.h ColorSpace colorSpace0) {
        com.facebook.common.references.a a1;
        com.facebook.common.references.a a0;
        boolean z = l0.x(v);
        BitmapFactory.Options bitmapFactory$Options0 = b.h(l0, bitmap$Config0, this.b);
        InputStream inputStream0 = l0.o();
        com.facebook.common.internal.n.i(inputStream0);
        if(l0.getSize() > v) {
            inputStream0 = new z0.a(inputStream0, v);
        }
        if(!z) {
            inputStream0 = new z0.b(inputStream0, b.g);
        }
        try {
            try {
                boolean z1 = bitmapFactory$Options0.inPreferredConfig != Bitmap.Config.ARGB_8888;
                a0 = this.e(inputStream0, bitmapFactory$Options0, rect0, colorSpace0);
                goto label_26;
            }
            catch(RuntimeException runtimeException0) {
            }
            if(!z1) {
                throw runtimeException0;
            }
            a1 = this.b(l0, Bitmap.Config.ARGB_8888, rect0, v, colorSpace0);
        }
        catch(Throwable throwable0) {
            goto label_21;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
        }
        return a1;
        try {
        label_21:
            inputStream0.close();
        }
        catch(IOException iOException1) {
            iOException1.printStackTrace();
        }
        throw throwable0;
        try {
        label_26:
            inputStream0.close();
        }
        catch(IOException iOException2) {
            iOException2.printStackTrace();
        }
        return a0;
    }

    @Override  // com.facebook.imagepipeline.platform.d
    @o3.h
    public com.facebook.common.references.a c(l l0, Bitmap.Config bitmap$Config0, @o3.h Rect rect0, @o3.h ColorSpace colorSpace0) {
        BitmapFactory.Options bitmapFactory$Options0 = b.h(l0, bitmap$Config0, this.b);
        boolean z = bitmapFactory$Options0.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return this.e(((InputStream)com.facebook.common.internal.n.i(l0.o())), bitmapFactory$Options0, rect0, colorSpace0);
        }
        catch(RuntimeException runtimeException0) {
            if(!z) {
                throw runtimeException0;
            }
            return this.c(l0, Bitmap.Config.ARGB_8888, rect0, colorSpace0);
        }
    }

    @Override  // com.facebook.imagepipeline.platform.d
    @o3.h
    public com.facebook.common.references.a d(l l0, Bitmap.Config bitmap$Config0, @o3.h Rect rect0, int v) {
        return this.b(l0, bitmap$Config0, rect0, v, null);
    }

    @o3.h
    private com.facebook.common.references.a e(InputStream inputStream0, BitmapFactory.Options bitmapFactory$Options0, @o3.h Rect rect0, @o3.h ColorSpace colorSpace0) {
        Bitmap bitmap1;
        BitmapRegionDecoder bitmapRegionDecoder1;
        Bitmap.Config bitmap$Config0;
        Bitmap bitmap0;
        com.facebook.common.internal.n.i(inputStream0);
        int v = bitmapFactory$Options0.outWidth;
        int v1 = bitmapFactory$Options0.outHeight;
        if(rect0 != null) {
            v = rect0.width() / bitmapFactory$Options0.inSampleSize;
            v1 = rect0.height() / bitmapFactory$Options0.inSampleSize;
        }
        int v2 = Build.VERSION.SDK_INT;
        boolean z = v2 >= 26 && (this.d != null && this.d.shouldUseHardwareBitmapConfig(bitmapFactory$Options0.inPreferredConfig));
        BitmapRegionDecoder bitmapRegionDecoder0 = null;
        if(rect0 != null || !z) {
            if(rect0 != null && z) {
                bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            if(this.b) {
                bitmap0 = null;
            }
            else {
                int v3 = this.g(v, v1, bitmapFactory$Options0);
                bitmap0 = (Bitmap)this.a.get(v3);
                if(bitmap0 == null) {
                    throw new NullPointerException("BitmapPool.get returned null");
                }
            }
        }
        else {
            bitmapFactory$Options0.inMutable = false;
            bitmap0 = null;
        }
        bitmapFactory$Options0.inBitmap = bitmap0;
        if(v2 >= 26) {
            if(colorSpace0 == null) {
                colorSpace0 = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            bitmapFactory$Options0.inPreferredColorSpace = colorSpace0;
        }
        ByteBuffer byteBuffer0 = (ByteBuffer)this.e.b();
        if(byteBuffer0 == null) {
            byteBuffer0 = ByteBuffer.allocate(0x4000);
        }
        try {
            bitmapFactory$Options0.inTempStorage = byteBuffer0.array();
            if(rect0 == null || bitmap0 == null) {
                goto label_60;
            }
            else {
                bitmap$Config0 = bitmapFactory$Options0.inPreferredConfig;
                if(bitmap$Config0 == null) {
                    bitmap1 = null;
                }
                else {
                    goto label_34;
                }
            }
            goto label_61;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            goto label_65;
        }
        catch(RuntimeException runtimeException0) {
            goto label_78;
        }
        finally {
            this.e.a(byteBuffer0);
        }
        try {
        label_34:
            bitmap0.reconfigure(v, v1, bitmap$Config0);
            bitmapRegionDecoder1 = null;
            bitmapRegionDecoder1 = BitmapRegionDecoder.newInstance(inputStream0, true);
            goto label_40;
        }
        catch(IOException unused_ex) {
            goto label_43;
        }
        catch(Throwable throwable0) {
        }
        goto label_52;
    label_40:
        if(bitmapRegionDecoder1 == null) {
            goto label_56;
        }
        else {
            try {
                try {
                    bitmap1 = bitmapRegionDecoder1.decodeRegion(rect0, bitmapFactory$Options0);
                    goto label_57;
                }
                catch(IOException unused_ex) {
                }
            label_43:
                x0.a.s(b.f, "Could not decode region %s, decoding full bitmap instead.", new Object[]{rect0});
                if(bitmapRegionDecoder1 == null) {
                    bitmap1 = null;
                }
                else {
                    goto label_45;
                }
                goto label_61;
            }
            catch(Throwable throwable0) {
                goto label_51;
            }
            try {
            label_45:
                bitmapRegionDecoder1.recycle();
                bitmap1 = null;
                goto label_61;
            label_51:
                bitmapRegionDecoder0 = bitmapRegionDecoder1;
            label_52:
                if(bitmapRegionDecoder0 != null) {
                    bitmapRegionDecoder0.recycle();
                }
                throw throwable0;
            label_56:
                bitmap1 = null;
            label_57:
                if(bitmapRegionDecoder1 != null) {
                    bitmapRegionDecoder1.recycle();
                    goto label_61;
                label_60:
                    bitmap1 = null;
                }
            label_61:
                if(bitmap1 == null) {
                    bitmap1 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
                }
                goto label_82;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                goto label_65;
            }
            catch(RuntimeException runtimeException0) {
                goto label_78;
            }
        }
        goto label_61;
    label_65:
        if(bitmap0 != null) {
            this.a.a(bitmap0);
        }
        try {
            inputStream0.reset();
            Bitmap bitmap2 = BitmapFactory.decodeStream(inputStream0);
            if(bitmap2 != null) {
                return com.facebook.common.references.a.w(bitmap2, g.b());
            }
        }
        catch(IOException unused_ex) {
        }
        throw illegalArgumentException0;
    label_78:
        if(bitmap0 != null) {
            this.a.a(bitmap0);
        }
        throw runtimeException0;
    label_82:
        if(bitmap0 != null && bitmap0 != bitmap1) {
            this.a.a(bitmap0);
            if(bitmap1 != null) {
                bitmap1.recycle();
            }
            throw new IllegalStateException();
        }
        return this.c ? com.facebook.common.references.a.w(bitmap1, com.facebook.imagepipeline.platform.b.a.a) : com.facebook.common.references.a.w(bitmap1, this.a);
    }

    @o3.h
    protected com.facebook.common.references.a f(InputStream inputStream0, BitmapFactory.Options bitmapFactory$Options0, @o3.h Rect rect0) {
        return this.e(inputStream0, bitmapFactory$Options0, rect0, null);
    }

    public abstract int g(int arg1, int arg2, BitmapFactory.Options arg3);

    private static BitmapFactory.Options h(l l0, Bitmap.Config bitmap$Config0, boolean z) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inSampleSize = l0.q();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        bitmapFactory$Options0.inDither = true;
        boolean z1 = Build.VERSION.SDK_INT >= 26 && bitmap$Config0 == Bitmap.Config.HARDWARE;
        if(!z1) {
            bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
        }
        bitmapFactory$Options0.inMutable = true;
        if(!z) {
            BitmapFactory.decodeStream(l0.o(), null, bitmapFactory$Options0);
            if(bitmapFactory$Options0.outWidth == -1 || bitmapFactory$Options0.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if(z1) {
            bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
        }
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return bitmapFactory$Options0;
    }
}

