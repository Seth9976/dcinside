package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.h;
import com.google.android.material.shape.r;

public class d extends h implements Cloneable {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private static final int g = 90;
    private static final int h = 180;
    private static final int i = 270;
    private static final int j = 180;
    private static final float k = 1.75f;

    public d(float f, float f1, float f2) {
        this.f = -1.0f;
        this.b = f;
        this.a = f1;
        this.k(f2);
        this.e = 0.0f;
    }

    @Override  // com.google.android.material.shape.h
    public void b(float f, float f1, float f2, @NonNull r r0) {
        float f10;
        float f9;
        float f3 = this.c;
        if(f3 == 0.0f) {
            r0.n(f, 0.0f);
            return;
        }
        float f4 = (this.b * 2.0f + f3) / 2.0f;
        float f5 = f2 * this.a;
        float f6 = f1 + this.e;
        float f7 = this.d * f2 + (1.0f - f2) * f4;
        if(f7 / f4 >= 1.0f) {
            r0.n(f, 0.0f);
            return;
        }
        float f8 = this.f * f2;
        boolean z = this.f == -1.0f || Math.abs(this.f * 2.0f - f3) < 0.1f;
        if(z) {
            f10 = f7;
            f9 = 0.0f;
        }
        else {
            f9 = 1.75f;
            f10 = 0.0f;
        }
        float f11 = f10 + f5;
        float f12 = (float)Math.sqrt((f4 + f5) * (f4 + f5) - f11 * f11);
        float f13 = f6 - f12;
        float f14 = (float)Math.toDegrees(Math.atan(f12 / f11));
        float f15 = 90.0f - f14 + f9;
        r0.n(f13, 0.0f);
        r0.a(f13 - f5, 0.0f, f13 + f5, f5 * 2.0f, 270.0f, f14);
        if(z) {
            r0.a(f6 - f4, -f4 - f10, f6 + f4, f4 - f10, 180.0f - f15, f15 * 2.0f - 180.0f);
        }
        else {
            r0.a(f6 - f4, -(f8 + this.b), f6 - f4 + (this.b + f8 * 2.0f), this.b + f8, 180.0f - f15, (f15 * 2.0f - 180.0f) / 2.0f);
            float f16 = f6 + f4;
            r0.n(f16 - (this.b / 2.0f + f8), this.b + f8);
            r0.a(f16 - (f8 * 2.0f + this.b), -(f8 + this.b), f16, this.b + f8, 90.0f, f15 - 90.0f);
        }
        r0.a(f6 + f12 - f5, 0.0f, f6 + f12 + f5, f5 * 2.0f, 270.0f - f14, f14);
        r0.n(f, 0.0f);
    }

    float d() {
        return this.d;
    }

    public float e() {
        return this.f;
    }

    float f() {
        return this.b;
    }

    float g() {
        return this.a;
    }

    @RestrictTo({Scope.b})
    public float h() {
        return this.c;
    }

    @RestrictTo({Scope.b})
    public float j() {
        return this.e;
    }

    void k(@FloatRange(from = 0.0) float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.d = f;
    }

    public void l(float f) {
        this.f = f;
    }

    void m(float f) {
        this.b = f;
    }

    void n(float f) {
        this.a = f;
    }

    @RestrictTo({Scope.b})
    public void o(float f) {
        this.c = f;
    }

    void p(float f) {
        this.e = f;
    }
}

