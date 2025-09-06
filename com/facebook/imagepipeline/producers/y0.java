package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.g;
import com.facebook.imagepipeline.image.l;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class y0 implements h0 {
    class com.facebook.imagepipeline.producers.y0.a extends u {
        private final j0 i;
        private final int j;
        @h
        private final g k;
        final y0 l;

        public com.facebook.imagepipeline.producers.y0.a(com.facebook.imagepipeline.producers.n n0, j0 j00, int v) {
            super(n0);
            this.i = j00;
            this.j = v;
            this.k = j00.b().v();
        }

        @Override  // com.facebook.imagepipeline.producers.u
        protected void h(Throwable throwable0) {
            if(!y0.this.e(this.j + 1, this.q(), this.i)) {
                this.q().onFailure(throwable0);
            }
        }

        @Override  // com.facebook.imagepipeline.producers.c
        protected void i(@h Object object0, int v) {
            this.r(((l)object0), v);
        }

        protected void r(@h l l0, int v) {
            if(l0 != null && (c.f(v) || A0.c(l0, this.k))) {
                this.q().b(l0, v);
                return;
            }
            if(c.e(v)) {
                l.c(l0);
                if(!y0.this.e(this.j + 1, this.q(), this.i)) {
                    this.q().b(null, 1);
                }
            }
        }
    }

    private final z0[] a;

    public y0(z0[] arr_z0) {
        z0[] arr_z01 = (z0[])com.facebook.common.internal.n.i(arr_z0);
        this.a = arr_z01;
        com.facebook.common.internal.n.g(0, arr_z01.length);
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(com.facebook.imagepipeline.producers.n n0, j0 j00) {
        if(j00.b().v() == null) {
            n0.b(null, 1);
            return;
        }
        if(!this.e(0, n0, j00)) {
            n0.b(null, 1);
        }
    }

    private int d(int v, @h g g0) {
        while(true) {
            z0[] arr_z0 = this.a;
            if(v >= arr_z0.length) {
                break;
            }
            if(arr_z0[v].b(g0)) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    private boolean e(int v, com.facebook.imagepipeline.producers.n n0, j0 j00) {
        int v1 = this.d(v, j00.b().v());
        if(v1 == -1) {
            return false;
        }
        this.a[v1].a(new com.facebook.imagepipeline.producers.y0.a(this, n0, j00, v1), j00);
        return true;
    }
}

