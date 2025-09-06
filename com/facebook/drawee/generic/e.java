package com.facebook.drawee.generic;

import androidx.annotation.ColorInt;
import java.util.Arrays;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e {
    public static enum com.facebook.drawee.generic.e.a {
        OVERLAY_COLOR,
        BITMAP_ONLY;

    }

    private com.facebook.drawee.generic.e.a a;
    private boolean b;
    @h
    private float[] c;
    private int d;
    private float e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;

    public e() {
        this.a = com.facebook.drawee.generic.e.a.b;
        this.b = false;
        this.c = null;
        this.d = 0;
        this.e = 0.0f;
        this.f = 0;
        this.g = 0.0f;
        this.h = false;
        this.i = false;
        this.j = false;
    }

    public e A(com.facebook.drawee.generic.e.a e$a0) {
        this.a = e$a0;
        return this;
    }

    public e B(boolean z) {
        this.h = z;
        return this;
    }

    public static e a() {
        return new e().z(true);
    }

    public static e b(float f, float f1, float f2, float f3) {
        return new e().s(f, f1, f2, f3);
    }

    public static e c(float[] arr_f) {
        return new e().t(arr_f);
    }

    public static e d(float f) {
        return new e().u(f);
    }

    public int e() {
        return this.f;
    }

    @Override
    public boolean equals(@h Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.b != ((e)object0).b) {
            return false;
        }
        if(this.d != ((e)object0).d) {
            return false;
        }
        if(Float.compare(((e)object0).e, this.e) != 0) {
            return false;
        }
        if(this.f != ((e)object0).f) {
            return false;
        }
        if(Float.compare(((e)object0).g, this.g) != 0) {
            return false;
        }
        if(this.a != ((e)object0).a) {
            return false;
        }
        if(this.h != ((e)object0).h) {
            return false;
        }
        return this.i == ((e)object0).i ? Arrays.equals(this.c, ((e)object0).c) : false;
    }

    public float f() {
        return this.e;
    }

    @h
    public float[] g() {
        return this.c;
    }

    private float[] h() {
        if(this.c == null) {
            this.c = new float[8];
        }
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b) * 0x1F + (this.c == null ? 0 : Arrays.hashCode(this.c))) * 0x1F + this.d) * 0x1F + (this.e == 0.0f ? 0 : Float.floatToIntBits(this.e))) * 0x1F + this.f) * 0x1F;
        float f = this.g;
        if(f != 0.0f) {
            v = Float.floatToIntBits(f);
        }
        return ((v1 + v) * 0x1F + this.h) * 0x1F + this.i;
    }

    public int i() {
        return this.d;
    }

    public float j() {
        return this.g;
    }

    public boolean k() {
        return this.i;
    }

    public boolean l() {
        return this.j;
    }

    public boolean m() {
        return this.b;
    }

    public com.facebook.drawee.generic.e.a n() {
        return this.a;
    }

    public boolean o() {
        return this.h;
    }

    public e p(@ColorInt int v, float f) {
        com.facebook.common.internal.n.e(f >= 0.0f, "the border width cannot be < 0");
        this.e = f;
        this.f = v;
        return this;
    }

    public e q(@ColorInt int v) {
        this.f = v;
        return this;
    }

    public e r(float f) {
        com.facebook.common.internal.n.e(f >= 0.0f, "the border width cannot be < 0");
        this.e = f;
        return this;
    }

    public e s(float f, float f1, float f2, float f3) {
        float[] arr_f = this.h();
        arr_f[1] = f;
        arr_f[0] = f;
        arr_f[3] = f1;
        arr_f[2] = f1;
        arr_f[5] = f2;
        arr_f[4] = f2;
        arr_f[7] = f3;
        arr_f[6] = f3;
        return this;
    }

    public e t(float[] arr_f) {
        com.facebook.common.internal.n.i(arr_f);
        com.facebook.common.internal.n.e(arr_f.length == 8, "radii should have exactly 8 values");
        System.arraycopy(arr_f, 0, this.h(), 0, 8);
        return this;
    }

    public e u(float f) {
        Arrays.fill(this.h(), f);
        return this;
    }

    public e v(@ColorInt int v) {
        this.d = v;
        this.a = com.facebook.drawee.generic.e.a.a;
        return this;
    }

    public e w(float f) {
        com.facebook.common.internal.n.e(f >= 0.0f, "the padding cannot be < 0");
        this.g = f;
        return this;
    }

    public e x(boolean z) {
        this.i = z;
        return this;
    }

    public e y(boolean z) {
        this.j = z;
        return this;
    }

    public e z(boolean z) {
        this.b = z;
        return this;
    }
}

