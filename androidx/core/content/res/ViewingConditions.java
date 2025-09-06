package androidx.core.content.res;

final class ViewingConditions {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float[] g;
    private final float h;
    private final float i;
    private final float j;
    static final ViewingConditions k;

    static {
        ViewingConditions.k = ViewingConditions.k(CamUtils.c, 11.725677f, 50.0f, 2.0f, false);
    }

    private ViewingConditions(float f, float f1, float f2, float f3, float f4, float f5, float[] arr_f, float f6, float f7, float f8) {
        this.f = f;
        this.a = f1;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.g = arr_f;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }

    float a() {
        return this.a;
    }

    float b() {
        return this.d;
    }

    float c() {
        return this.h;
    }

    float d() {
        return this.i;
    }

    float e() {
        return this.f;
    }

    float f() {
        return this.b;
    }

    float g() {
        return this.e;
    }

    float h() {
        return this.c;
    }

    float[] i() {
        return this.g;
    }

    float j() {
        return this.j;
    }

    static ViewingConditions k(float[] arr_f, float f, float f1, float f2, boolean z) {
        float f3 = arr_f[0];
        float[] arr_f1 = CamUtils.a[0];
        float f4 = arr_f1[0] * f3;
        float f5 = arr_f[1];
        float f6 = f4 + arr_f1[1] * f5;
        float f7 = arr_f[2];
        float f8 = f6 + arr_f1[2] * f7;
        float[] arr_f2 = CamUtils.a[1];
        float f9 = arr_f2[0] * f3 + arr_f2[1] * f5 + arr_f2[2] * f7;
        float[] arr_f3 = CamUtils.a[2];
        float f10 = f3 * arr_f3[0] + f5 * arr_f3[1] + f7 * arr_f3[2];
        float f11 = f2 / 10.0f + 0.8f;
        float f12 = z ? 1.0f : (1.0f - ((float)Math.exp((-f - 42.0f) / 92.0f)) * 0.277778f) * f11;
        if(((double)f12) > 1.0) {
            f12 = 1.0f;
        }
        else if(((double)f12) < 0.0) {
            f12 = 0.0f;
        }
        float[] arr_f4 = {100.0f / f8 * f12 + 1.0f - f12, 100.0f / f9 * f12 + 1.0f - f12, 100.0f / f10 * f12 + 1.0f - f12};
        float f13 = 1.0f / (5.0f * f + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = f14 * f + 0.1f * (1.0f - f14) * (1.0f - f14) * ((float)Math.cbrt(((double)f) * 5.0));
        float f16 = CamUtils.h(f1) / arr_f[1];
        float f17 = 0.725f / ((float)Math.pow(f16, 0.2));
        float f18 = (float)Math.pow(((double)(arr_f4[0] * f15 * f8)) / 100.0, 0.42);
        float f19 = (float)Math.pow(((double)(arr_f4[1] * f15 * f9)) / 100.0, 0.42);
        float f20 = (float)Math.pow(((double)(arr_f4[2] * f15 * f10)) / 100.0, 0.42);
        new float[]{f18 * 400.0f / (f18 + 27.129999f), f19 * 400.0f / (f19 + 27.129999f), 400.0f * f20 / (f20 + 27.129999f)};
        return new ViewingConditions(f16, (f18 * 400.0f / (f18 + 27.129999f) * 2.0f + f19 * 400.0f / (f19 + 27.129999f) + 400.0f * f20 / (f20 + 27.129999f) * 0.05f) * f17, f17, f17, (((double)f11) >= 0.9 ? 0.59f + 0.1f * ((f11 - 0.9f) * 10.0f) : 0.525f + 0.065f * ((f11 - 0.8f) * 10.0f)), f11, arr_f4, f15, ((float)Math.pow(f15, 0.25)), ((float)Math.sqrt(f16)) + 1.48f);
    }
}

