package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.internal.n;
import com.facebook.imageutils.c;
import o3.h;
import p3.d;

@d
public class b extends a implements g {
    @h
    @p3.a("this")
    private com.facebook.common.references.a d;
    @h
    private volatile Bitmap e;
    private final r f;
    private final int g;
    private final int h;
    private static boolean i = false;

    static {
    }

    protected b(Bitmap bitmap0, com.facebook.common.references.h h0, r r0, int v, int v1) {
        this.e = (Bitmap)n.i(bitmap0);
        this.d = com.facebook.common.references.a.w(this.e, ((com.facebook.common.references.h)n.i(h0)));
        this.f = r0;
        this.g = v;
        this.h = v1;
    }

    protected b(com.facebook.common.references.a a0, r r0, int v) {
        this(a0, r0, v, 0);
    }

    protected b(com.facebook.common.references.a a0, r r0, int v, int v1) {
        com.facebook.common.references.a a1 = (com.facebook.common.references.a)n.i(a0.c());
        this.d = a1;
        this.e = (Bitmap)a1.n();
        this.f = r0;
        this.g = v;
        this.h = v1;
    }

    @Override  // com.facebook.imagepipeline.image.g
    public int A0() {
        return this.h;
    }

    @Override  // com.facebook.imagepipeline.image.d
    public Bitmap D3() {
        return this.e;
    }

    @Override  // com.facebook.imagepipeline.image.a, com.facebook.imagepipeline.image.e
    public r I() {
        return this.f;
    }

    private static int L(@h Bitmap bitmap0) {
        return bitmap0 == null ? 0 : bitmap0.getHeight();
    }

    @Override  // com.facebook.imagepipeline.image.g
    @h
    public com.facebook.common.references.a N() {
        synchronized(this) {
            return com.facebook.common.references.a.e(this.d);
        }
    }

    private static int Q(@h Bitmap bitmap0) {
        return bitmap0 == null ? 0 : bitmap0.getWidth();
    }

    public static void R(boolean z) {
        b.i = z;
    }

    public static boolean T() [...] // 潜在的解密器

    @Override  // com.facebook.imagepipeline.image.g
    public com.facebook.common.references.a U2() {
        synchronized(this) {
            n.j(this.d, "Cannot convert a closed static bitmap");
            return this.x();
        }
    }

    @Override  // com.facebook.imagepipeline.image.e
    public void close() {
        com.facebook.common.references.a a0 = this.x();
        if(a0 != null) {
            a0.close();
        }
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int getHeight() {
        return this.g % 180 != 0 || (this.h == 5 || this.h == 7) ? b.Q(this.e) : b.L(this.e);
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int getWidth() {
        return this.g % 180 != 0 || (this.h == 5 || this.h == 7) ? b.L(this.e) : b.Q(this.e);
    }

    @Override  // com.facebook.imagepipeline.image.e
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.d == null;
    }

    @Override  // com.facebook.imagepipeline.image.g
    public int k3() {
        return this.g;
    }

    private com.facebook.common.references.a x() {
        com.facebook.common.references.a a0;
        synchronized(this) {
            a0 = this.d;
            this.d = null;
            this.e = null;
        }
        return a0;
    }

    @Override  // com.facebook.imagepipeline.image.e
    public int z() {
        return c.l(this.e);
    }
}

