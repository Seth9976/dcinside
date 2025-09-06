package com.canhub.cropper;

import android.graphics.RectF;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class y {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    private final RectF a;
    @l
    private final RectF b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;

    public y() {
        this.a = new RectF();
        this.b = new RectF();
        this.k = 1.0f;
        this.l = 1.0f;
    }

    private final float a(float f, float f1, float f2, float f3) {
        return Math.max(Math.abs(f - f2), Math.abs(f1 - f3));
    }

    private final boolean b() {
        return !this.x();
    }

    public final float c() {
        return s.A(this.f, this.j / this.l);
    }

    public final float d() {
        return s.A(this.e, this.i / this.k);
    }

    public final float e() {
        return s.t(this.d, this.h / this.l);
    }

    public final float f() {
        return s.t(this.c, this.g / this.k);
    }

    @m
    public final z g(float f, float f1, float f2, @l d cropImageView$d0, boolean z) {
        b z$b0;
        L.p(cropImageView$d0, "cropShape");
        switch(cropImageView$d0) {
            case 1: {
                z$b0 = this.k(f, f1, f2, z);
                return z$b0 == null ? null : new z(z$b0, this, f, f1);
            }
            case 2: {
                z$b0 = this.h(f, f1, z);
                return z$b0 == null ? null : new z(z$b0, this, f, f1);
            }
            case 3: {
                z$b0 = this.l(f, f1, f2, z);
                return z$b0 == null ? null : new z(z$b0, this, f, f1);
            }
            case 4: {
                z$b0 = this.j(f, f1, f2, z);
                return z$b0 == null ? null : new z(z$b0, this, f, f1);
            }
            default: {
                throw new J();
            }
        }
    }

    private final b h(float f, float f1, boolean z) {
        float f2 = this.a.width();
        float f3 = this.a.left;
        float f4 = this.a.height();
        float f5 = this.a.top + f4 / 6.0f;
        float f6 = this.a.top + 5.0f * (f4 / 6.0f);
        if(f < f3 + f2 / 6.0f) {
            if(f1 < f5) {
                return b.a;
            }
            return f1 < f6 ? b.e : b.c;
        }
        if(f < f3 + f2 / 6.0f * 5.0f) {
            if(f1 < f5) {
                return b.f;
            }
            if(f1 < f6) {
                return z ? b.i : null;
            }
            return b.h;
        }
        if(f1 < f5) {
            return b.b;
        }
        return f1 < f6 ? b.g : b.d;
    }

    @l
    public final RectF i() {
        this.b.set(this.a);
        return this.b;
    }

    private final b j(float f, float f1, float f2, boolean z) {
        if(this.a(f, f1, this.a.left, this.a.centerY()) <= f2) {
            return b.e;
        }
        if(this.a(f, f1, this.a.right, this.a.centerY()) <= f2) {
            return b.g;
        }
        return !z || !this.o(f, f1, this.a.left, this.a.top, this.a.right, this.a.bottom) ? this.h(f, f1, z) : b.i;
    }

    private final b k(float f, float f1, float f2, boolean z) {
        if(this.p(f, f1, this.a.left, this.a.top, f2)) {
            return b.a;
        }
        if(this.p(f, f1, this.a.right, this.a.top, f2)) {
            return b.b;
        }
        if(this.p(f, f1, this.a.left, this.a.bottom, f2)) {
            return b.c;
        }
        if(this.p(f, f1, this.a.right, this.a.bottom, f2)) {
            return b.d;
        }
        if(z && this.o(f, f1, this.a.left, this.a.top, this.a.right, this.a.bottom) && this.b()) {
            return b.i;
        }
        if(this.q(f, f1, this.a.left, this.a.right, this.a.top, f2)) {
            return b.f;
        }
        if(this.q(f, f1, this.a.left, this.a.right, this.a.bottom, f2)) {
            return b.h;
        }
        if(this.r(f, f1, this.a.left, this.a.top, this.a.bottom, f2)) {
            return b.e;
        }
        if(this.r(f, f1, this.a.right, this.a.top, this.a.bottom, f2)) {
            return b.g;
        }
        return !z || !this.o(f, f1, this.a.left, this.a.top, this.a.right, this.a.bottom) || this.b() ? this.h(f, f1, z) : b.i;
    }

    private final b l(float f, float f1, float f2, boolean z) {
        if(this.a(f, f1, this.a.centerX(), this.a.top) <= f2) {
            return b.f;
        }
        if(this.a(f, f1, this.a.centerX(), this.a.bottom) <= f2) {
            return b.h;
        }
        return !z || !this.o(f, f1, this.a.left, this.a.top, this.a.right, this.a.bottom) ? this.h(f, f1, z) : b.i;
    }

    public final float m() {
        return this.l;
    }

    public final float n() {
        return this.k;
    }

    private final boolean o(float f, float f1, float f2, float f3, float f4, float f5) {
        return f > f2 && f < f4 && f1 > f3 && f1 < f5;
    }

    private final boolean p(float f, float f1, float f2, float f3, float f4) {
        return this.a(f, f1, f2, f3) <= f4;
    }

    private final boolean q(float f, float f1, float f2, float f3, float f4, float f5) {
        return f > f2 && f < f3 && Math.abs(f1 - f4) <= f5;
    }

    private final boolean r(float f, float f1, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f2) <= f5 && f1 > f3 && f1 < f4;
    }

    public final void s(float f, float f1, float f2, float f3) {
        this.e = f;
        this.f = f1;
        this.k = f2;
        this.l = f3;
    }

    public final void t(@l CropImageOptions cropImageOptions0) {
        L.p(cropImageOptions0, "options");
        this.c = (float)cropImageOptions0.G;
        this.d = (float)cropImageOptions0.H;
        this.g = (float)cropImageOptions0.I;
        this.h = (float)cropImageOptions0.J;
        this.i = (float)cropImageOptions0.K;
        this.j = (float)cropImageOptions0.L;
    }

    public final void u(int v, int v1) {
        this.i = (float)v;
        this.j = (float)v1;
    }

    public final void v(int v, int v1) {
        this.g = (float)v;
        this.h = (float)v1;
    }

    public final void w(@l RectF rectF0) {
        L.p(rectF0, "rect");
        this.a.set(rectF0);
    }

    public final boolean x() {
        return this.a.width() >= 100.0f && this.a.height() >= 100.0f;
    }
}

