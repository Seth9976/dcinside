package com.facebook.fresco.animation.bitmap.wrapper;

import I0.d;
import I0.e;
import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b implements e {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final d a;
    @l
    private com.facebook.imagepipeline.animated.base.a b;
    private final boolean c;
    @l
    private com.facebook.imagepipeline.animated.impl.d d;
    @l
    private final com.facebook.imagepipeline.animated.impl.d.b e;
    @l
    public static final a f;
    @l
    private static final Class g;

    static {
        b.f = new a(null);
        b.g = b.class;
    }

    public b(@l d d0, @l com.facebook.imagepipeline.animated.base.a a0, boolean z) {
        public static final class com.facebook.fresco.animation.bitmap.wrapper.b.b implements com.facebook.imagepipeline.animated.impl.d.b {
            final b a;

            com.facebook.fresco.animation.bitmap.wrapper.b.b(b b0) {
                this.a = b0;
                super();
            }

            @Override  // com.facebook.imagepipeline.animated.impl.d$b
            public void a(int v, Bitmap bitmap0) {
                L.p(bitmap0, "bitmap");
            }

            @Override  // com.facebook.imagepipeline.animated.impl.d$b
            public com.facebook.common.references.a b(int v) {
                return this.a.a.E(v);
            }
        }

        L.p(d0, "bitmapFrameCache");
        L.p(a0, "animatedDrawableBackend");
        super();
        this.a = d0;
        this.b = a0;
        this.c = z;
        com.facebook.fresco.animation.bitmap.wrapper.b.b b$b0 = new com.facebook.fresco.animation.bitmap.wrapper.b.b(this);
        this.e = b$b0;
        this.d = new com.facebook.imagepipeline.animated.impl.d(this.b, z, b$b0);
    }

    @Override  // I0.e
    public int d() {
        return this.b.getWidth();
    }

    @Override  // I0.e
    public int e() {
        return this.b.getHeight();
    }

    @Override  // I0.e
    public void f(@m Rect rect0) {
        com.facebook.imagepipeline.animated.base.a a0 = this.b.m(rect0);
        L.o(a0, "forNewBounds(...)");
        if(a0 != this.b) {
            this.b = a0;
            this.d = new com.facebook.imagepipeline.animated.impl.d(a0, this.c, this.e);
        }
    }

    @Override  // I0.e
    public boolean g(int v, @l Bitmap bitmap0) {
        L.p(bitmap0, "targetBitmap");
        try {
            this.d.h(v, bitmap0);
            return true;
        }
        catch(IllegalStateException illegalStateException0) {
            x0.a.t(b.g, illegalStateException0, "Rendering of frame unsuccessful. Frame number: %d", new Object[]{v});
            return false;
        }
    }
}

