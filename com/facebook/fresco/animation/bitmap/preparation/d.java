package com.facebook.fresco.animation.bitmap.preparation;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class d implements a {
    private final int a;
    @l
    private final Class b;

    @j
    public d() {
        this(0, 1, null);
    }

    @j
    public d(int v) {
        this.a = v;
        this.b = d.class;
    }

    public d(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 3;
        }
        this(v);
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void a(int v, int v1, @m A3.a a0) {
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    @m
    public com.facebook.common.references.a b(int v, int v1, int v2) {
        return null;
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void c() {
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void d(@l b b0, @l I0.d d0, @l com.facebook.fresco.animation.backend.a a0, int v, @m A3.a a1) {
        L.p(b0, "bitmapFramePreparer");
        L.p(d0, "bitmapFrameCache");
        L.p(a0, "animationBackend");
        int v1 = this.a;
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = (v + v2) % a0.b();
                if(x0.a.R(2)) {
                    x0.a.W(this.b, "Preparing frame %d, last drawn: %d", v3, v);
                }
                if(!b0.a(d0, a0, v3)) {
                    return;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        if(a1 != null) {
            a1.invoke();
        }
    }

    @Override  // com.facebook.fresco.animation.bitmap.preparation.a
    public void onStop() {
    }
}

