package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.e;
import com.facebook.imagepipeline.image.g;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class j implements h0 {
    static class com.facebook.imagepipeline.producers.j.a extends u {
        private final int i;
        private final int j;

        com.facebook.imagepipeline.producers.j.a(com.facebook.imagepipeline.producers.n n0, int v, int v1) {
            super(n0);
            this.i = v;
            this.j = v1;
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.s(((com.facebook.common.references.a)object0), v);
        }

        private void r(@h com.facebook.common.references.a a0) {
            if(a0 != null && a0.q()) {
                e e0 = (e)a0.n();
                if(e0 != null && !e0.isClosed() && e0 instanceof g) {
                    Bitmap bitmap0 = ((g)e0).D3();
                    if(bitmap0 == null) {
                        return;
                    }
                    int v = bitmap0.getRowBytes() * bitmap0.getHeight();
                    if(v < this.i) {
                        return;
                    }
                    if(v > this.j) {
                        return;
                    }
                    bitmap0.prepareToDraw();
                }
            }
        }

        protected void s(@h com.facebook.common.references.a a0, int v) {
            this.r(a0);
            this.q().b(a0, v);
        }
    }

    private final h0 a;
    private final int b;
    private final int c;
    private final boolean d;
    public static final String e = "BitmapPrepareProducer";

    public j(h0 h00, int v, int v1, boolean z) {
        com.facebook.common.internal.n.d(Boolean.valueOf(v <= v1));
        this.a = (h0)com.facebook.common.internal.n.i(h00);
        this.b = v;
        this.c = v1;
        this.d = z;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        if(j00.t() && !this.d) {
            this.a.a(n0, j00);
            return;
        }
        com.facebook.imagepipeline.producers.j.a j$a0 = new com.facebook.imagepipeline.producers.j.a(n0, this.b, this.c);
        this.a.a(j$a0, j00);
    }
}

