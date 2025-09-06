package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;

final class a {
    final int a;
    float b;
    int c;
    int d;
    float e;
    float f;
    final int g;
    final float h;
    private static final float i = 0.1f;

    a(int v, float f, float f1, float f2, int v1, float f3, int v2, float f4, int v3, float f5) {
        this.a = v;
        this.b = MathUtils.d(f, f1, f2);
        this.c = v1;
        this.e = f3;
        this.d = v2;
        this.f = f4;
        this.g = v3;
        this.d(f5, f1, f2, f4);
        this.h = this.b(f4);
    }

    private float a(float f, int v, float f1, int v1, int v2) {
        if(v <= 0) {
            f1 = 0.0f;
        }
        return (f - (((float)v) + ((float)v1) / 2.0f) * f1) / (((float)v2) + ((float)v1) / 2.0f);
    }

    private float b(float f) {
        return this.g() ? Math.abs(f - this.f) * ((float)this.a) : 3.402823E+38f;
    }

    static a c(float f, float f1, float f2, float f3, int[] arr_v, float f4, int[] arr_v1, float f5, int[] arr_v2) {
        a a0 = null;
        int v = 1;
        for(int v1 = 0; v1 < arr_v2.length; ++v1) {
            int v2 = arr_v2[v1];
            for(int v3 = 0; v3 < arr_v1.length; ++v3) {
                int v4 = arr_v1[v3];
                for(int v5 = 0; v5 < arr_v.length; ++v5) {
                    a a1 = new a(v, f1, f2, f3, arr_v[v5], f4, v4, f5, v2, f);
                    if(a0 == null || a1.h < a0.h) {
                        if(a1.h == 0.0f) {
                            return a1;
                        }
                        a0 = a1;
                    }
                    ++v;
                }
            }
        }
        return a0;
    }

    private void d(float f, float f1, float f2, float f3) {
        float f4 = f - this.f();
        int v = this.c;
        if(v > 0 && f4 > 0.0f) {
            this.b += Math.min(f4 / ((float)v), f2 - this.b);
        }
        else if(v > 0 && f4 < 0.0f) {
            this.b += Math.max(f4 / ((float)v), f1 - this.b);
        }
        float f5 = this.c <= 0 ? 0.0f : this.b;
        this.b = f5;
        float f6 = this.a(f, this.c, f5, this.d, this.g);
        this.f = f6;
        float f7 = (this.b + f6) / 2.0f;
        this.e = f7;
        int v1 = this.d;
        if(v1 > 0 && f6 != f3) {
            float f8 = (f3 - f6) * ((float)this.g);
            float f9 = Math.min(Math.abs(f8), f7 * 0.1f * ((float)v1));
            if(f8 > 0.0f) {
                this.e -= f9 / ((float)this.d);
                this.f += f9 / ((float)this.g);
                return;
            }
            this.e += f9 / ((float)this.d);
            this.f -= f9 / ((float)this.g);
        }
    }

    int e() {
        return this.c + this.d + this.g;
    }

    private float f() {
        return this.f * ((float)this.g) + this.e * ((float)this.d) + this.b * ((float)this.c);
    }

    private boolean g() {
        return this.g <= 0 || this.c <= 0 || this.d <= 0 ? this.g <= 0 || this.c <= 0 || this.f > this.b : this.f > this.e && this.e > this.b;
    }

    @Override
    @NonNull
    public String toString() {
        return "Arrangement [priority=" + this.a + ", smallCount=" + this.c + ", smallSize=" + this.b + ", mediumCount=" + this.d + ", mediumSize=" + this.e + ", largeCount=" + this.g + ", largeSize=" + this.f + ", cost=" + this.h + "]";
    }
}

