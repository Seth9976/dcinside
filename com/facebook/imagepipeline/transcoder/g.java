package com.facebook.imagepipeline.transcoder;

import X0.b;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import com.facebook.imagepipeline.common.h;
import java.io.OutputStream;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class g implements c {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final Bitmap.CompressFormat b(X0.c c0) {
            if(c0 == null) {
                return Bitmap.CompressFormat.JPEG;
            }
            if(c0 == b.b) {
                return Bitmap.CompressFormat.JPEG;
            }
            if(c0 == b.c) {
                return Bitmap.CompressFormat.PNG;
            }
            return b.a(c0) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
        }
    }

    private final boolean a;
    private final int b;
    @l
    private final String c;
    @l
    public static final a d = null;
    @l
    private static final String e = "SimpleImageTranscoder";

    static {
        g.d = new a(null);
    }

    public g(boolean z, int v) {
        this.a = z;
        this.b = v;
        this.c = "SimpleImageTranscoder";
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    @l
    public String a() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    public boolean b(@l X0.c c0) {
        L.p(c0, "imageFormat");
        return c0 == b.l || c0 == b.b;
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    @l
    public com.facebook.imagepipeline.transcoder.b c(@l com.facebook.imagepipeline.image.l l0, @l OutputStream outputStream0, @m h h0, @m com.facebook.imagepipeline.common.g g0, @m X0.c c0, @m Integer integer0, @m ColorSpace colorSpace0) {
        Bitmap bitmap1;
        Bitmap bitmap0;
        L.p(l0, "encodedImage");
        L.p(outputStream0, "outputStream");
        Integer integer1 = integer0 == null ? 85 : integer0;
        h h1 = h0 == null ? h.c.a() : h0;
        int v = this.e(l0, h1, g0);
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inSampleSize = v;
        if(colorSpace0 != null && Build.VERSION.SDK_INT >= 26) {
            bitmapFactory$Options0.inPreferredColorSpace = colorSpace0;
        }
        try {
            bitmap0 = BitmapFactory.decodeStream(l0.o(), null, bitmapFactory$Options0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            x0.a.v("SimpleImageTranscoder", "Out-Of-Memory during transcode", outOfMemoryError0);
            return new com.facebook.imagepipeline.transcoder.b(2);
        }
        if(bitmap0 == null) {
            x0.a.u("SimpleImageTranscoder", "Couldn\'t decode the EncodedImage InputStream ! ");
            return new com.facebook.imagepipeline.transcoder.b(2);
        }
        Matrix matrix0 = e.h(l0, h1);
        try {
            if(matrix0 == null) {
                goto label_23;
            }
            else {
                try {
                    bitmap1 = bitmap0;
                    bitmap1 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, false);
                    goto label_24;
                label_23:
                    bitmap1 = bitmap0;
                label_24:
                    bitmap1.compress(g.d.b(c0), ((int)integer1), outputStream0);
                    return new com.facebook.imagepipeline.transcoder.b((v <= 1 ? 1 : 0));
                }
                catch(OutOfMemoryError outOfMemoryError1) {
                }
                x0.a.v("SimpleImageTranscoder", "Out-Of-Memory during transcode", outOfMemoryError1);
                return new com.facebook.imagepipeline.transcoder.b(2);
            }
            goto label_24;
        }
        finally {
            bitmap1.recycle();
            bitmap0.recycle();
        }
    }

    @Override  // com.facebook.imagepipeline.transcoder.c
    public boolean d(@l com.facebook.imagepipeline.image.l l0, @m h h0, @m com.facebook.imagepipeline.common.g g0) {
        L.p(l0, "encodedImage");
        if(h0 == null) {
            h0 = h.c.a();
        }
        return this.a && com.facebook.imagepipeline.transcoder.a.b(h0, g0, l0, this.b) > 1;
    }

    private final int e(com.facebook.imagepipeline.image.l l0, h h0, com.facebook.imagepipeline.common.g g0) {
        return this.a ? com.facebook.imagepipeline.transcoder.a.b(h0, g0, l0, this.b) : 1;
    }
}

