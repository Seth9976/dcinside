package com.facebook.imagepipeline.bitmaps;

import A0.a;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import com.facebook.common.memory.i;
import com.facebook.imagepipeline.memory.N;
import com.facebook.imagepipeline.memory.y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class c implements a {
    public static final class com.facebook.imagepipeline.bitmaps.c.a {
        private com.facebook.imagepipeline.bitmaps.c.a() {
        }

        public com.facebook.imagepipeline.bitmaps.c.a(w w0) {
        }

        private final BitmapFactory.Options b(int v, Bitmap.Config bitmap$Config0) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inDither = true;
            bitmapFactory$Options0.inPreferredConfig = bitmap$Config0;
            bitmapFactory$Options0.inPurgeable = true;
            bitmapFactory$Options0.inInputShareable = true;
            bitmapFactory$Options0.inSampleSize = v;
            bitmapFactory$Options0.inMutable = true;
            return bitmapFactory$Options0;
        }
    }

    @l
    private final b a;
    @l
    private final y b;
    @l
    public static final com.facebook.imagepipeline.bitmaps.c.a c;

    static {
        c.c = new com.facebook.imagepipeline.bitmaps.c.a(null);
    }

    public c(@l N n0) {
        L.p(n0, "poolFactory");
        super();
        this.a = new b(n0.h());
        y y0 = n0.d();
        L.o(y0, "getFlexByteArrayPool(...)");
        this.b = y0;
    }

    @Override  // A0.a
    @l
    public Bitmap a(int v, int v1, @l Bitmap.Config bitmap$Config0) {
        com.facebook.common.references.a a1;
        com.facebook.imagepipeline.image.l l0;
        L.p(bitmap$Config0, "bitmapConfig");
        com.facebook.common.references.a a0 = this.a.a(((short)v), ((short)v1));
        L.o(a0, "generate(...)");
        try {
            l0 = new com.facebook.imagepipeline.image.l(a0);
            l0.u0(X0.b.b);
            BitmapFactory.Options bitmapFactory$Options0 = c.c.b(l0.q(), bitmap$Config0);
            int v3 = ((i)a0.n()).size();
            Object object0 = a0.n();
            L.o(object0, "get(...)");
            a1 = this.b.a(v3 + 2);
            Object object1 = a1.n();
            L.o(object1, "get(...)");
            ((i)object0).m(0, ((byte[])object1), 0, v3);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(((byte[])object1), 0, v3, bitmapFactory$Options0);
            if(bitmap0 != null) {
                bitmap0.setHasAlpha(true);
                bitmap0.eraseColor(0);
                return bitmap0;
            }
        }
        finally {
            com.facebook.common.references.a.j(a1);
            com.facebook.imagepipeline.image.l.c(l0);
            com.facebook.common.references.a.j(a0);
        }
        throw new IllegalStateException("Required value was null.");
    }
}

