package com.facebook.fresco.vito.renderer;

import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d {
    @m
    private c a;
    @l
    private final Matrix b;
    @m
    private Matrix c;

    public d() {
        this(null, 1, null);
    }

    public d(@m c c0) {
        this.a = c0;
        this.b = new Matrix();
    }

    public d(c c0, int v, w w0) {
        if((v & 1) != 0) {
            c0 = null;
        }
        this(c0);
    }

    public final void a(@l Rect rect0, int v, int v1) {
        L.p(rect0, "bounds");
        Matrix matrix0 = null;
        if(v > 0 && v1 > 0) {
            c c0 = this.a;
            if(c0 != null) {
                matrix0 = c0.a(this.b, rect0, v, v1);
            }
            this.c = matrix0;
            return;
        }
        this.c = null;
    }

    @m
    public final c b() {
        return this.a;
    }

    @m
    public final Matrix c() {
        return this.c;
    }

    public final void d(@m c c0) {
        this.a = c0;
    }
}

