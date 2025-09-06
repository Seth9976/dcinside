package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.facebook.common.memory.i;
import jeb.synthetic.TWR;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import p3.d;
import y4.l;

@d
public final class com.facebook.imagepipeline.bitmaps.d extends e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final b a;
    @l
    private final com.facebook.imagepipeline.platform.d b;
    @l
    private final com.facebook.imagepipeline.core.a c;
    private boolean d;
    @l
    public static final a e;
    private static final String f;

    static {
        com.facebook.imagepipeline.bitmaps.d.e = new a(null);
        com.facebook.imagepipeline.bitmaps.d.f = "d";
    }

    public com.facebook.imagepipeline.bitmaps.d(@l b b0, @l com.facebook.imagepipeline.platform.d d0, @l com.facebook.imagepipeline.core.a a0) {
        L.p(b0, "jpegGenerator");
        L.p(d0, "purgeableDecoder");
        L.p(a0, "closeableReferenceFactory");
        super();
        this.a = b0;
        this.b = d0;
        this.c = a0;
    }

    private final com.facebook.common.references.a E(int v, int v1, Bitmap.Config bitmap$Config0) {
        Bitmap bitmap0 = Bitmap.createBitmap(v, v1, bitmap$Config0);
        g g0 = g.b();
        com.facebook.common.references.a a0 = this.c.c(bitmap0, g0);
        L.o(a0, "create(...)");
        return a0;
    }

    @Override  // com.facebook.imagepipeline.bitmaps.e
    @TargetApi(12)
    @l
    public com.facebook.common.references.a z(int v, int v1, @l Bitmap.Config bitmap$Config0) {
        com.facebook.common.references.a a2;
        com.facebook.common.references.a a1;
        com.facebook.imagepipeline.image.l l0;
        L.p(bitmap$Config0, "bitmapConfig");
        if(this.d) {
            return this.E(v, v1, bitmap$Config0);
        }
        com.facebook.common.references.a a0 = this.a.a(((short)v), ((short)v1));
        L.o(a0, "generate(...)");
        try {
            l0 = new com.facebook.imagepipeline.image.l(a0);
            l0.u0(X0.b.b);
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        try {
            int v2 = ((i)a0.n()).size();
            a1 = this.b.d(l0, bitmap$Config0, null, v2);
            if(a1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if(!((Bitmap)a1.n()).isMutable()) {
                com.facebook.common.references.a.j(a1);
                this.d = true;
                x0.a.w0("d", "Immutable bitmap returned by decoder");
                a2 = this.E(v, v1, bitmap$Config0);
                goto label_16;
            }
            goto label_19;
        }
        catch(Throwable throwable1) {
            goto label_23;
        }
        try {
        label_16:
            com.facebook.imagepipeline.image.l.c(l0);
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        a0.close();
        return a2;
        try {
        label_19:
            ((Bitmap)a1.n()).setHasAlpha(true);
            ((Bitmap)a1.n()).eraseColor(0);
            goto label_25;
        }
        catch(Throwable throwable1) {
            try {
            label_23:
                com.facebook.imagepipeline.image.l.c(l0);
                throw throwable1;
            label_25:
                com.facebook.imagepipeline.image.l.c(l0);
                goto label_30;
            }
            catch(Throwable throwable0) {
            }
        }
    label_28:
        TWR.safeClose$NT(a0, throwable0);
        throw throwable0;
    label_30:
        a0.close();
        return a1;
    }
}

