package com.facebook.imagepipeline.memory;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.e;
import com.facebook.common.references.h;
import java.util.Map;
import k1.n.a;
import k1.n;
import p3.d;

@n(a.a)
@d
public class y {
    @VisibleForTesting
    static class b extends z {
        public b(e e0, O o0, P p0) {
            super(e0, o0, p0);
        }

        @Override  // com.facebook.imagepipeline.memory.g
        com.facebook.imagepipeline.memory.n J(int v) {
            return new J(v, this.c.g, 0);
        }
    }

    private final h a;
    @VisibleForTesting
    final b b;

    public y(e e0, O o0) {
        class com.facebook.imagepipeline.memory.y.a implements h {
            final y a;

            @Override  // com.facebook.common.references.h
            public void a(Object object0) {
                this.b(((byte[])object0));
            }

            public void b(byte[] arr_b) {
                y.this.d(arr_b);
            }
        }

        com.facebook.common.internal.n.d(Boolean.valueOf(o0.g > 0));
        this.b = new b(e0, o0, I.h());
        this.a = new com.facebook.imagepipeline.memory.y.a(this);
    }

    public com.facebook.common.references.a a(int v) {
        return com.facebook.common.references.a.w(((byte[])this.b.get(v)), this.a);
    }

    public int b() {
        return this.b.S();
    }

    public Map c() {
        return this.b.B();
    }

    public void d(byte[] arr_b) {
        this.b.a(arr_b);
    }
}

