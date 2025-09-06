package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.core.graphics.ColorUtils;

@RestrictTo({Scope.b})
public class CamColor {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private static final float j = 0.2f;
    private static final float k = 1.0f;
    private static final float l = 0.4f;
    private static final float m = 0.01f;

    CamColor(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
    }

    float a(CamColor camColor0) {
        float f = this.l();
        float f1 = camColor0.l();
        float f2 = this.g();
        float f3 = camColor0.g();
        float f4 = this.h();
        float f5 = camColor0.h();
        return (float)(Math.pow(Math.sqrt((f - f1) * (f - f1) + (f2 - f3) * (f2 - f3) + (f4 - f5) * (f4 - f5)), 0.63) * 1.41);
    }

    private static CamColor b(@FloatRange(from = 0.0, to = 360.0) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 100.0) float f2) {
        float f3 = 100.0f;
        float f4 = 1000.0f;
        CamColor camColor0 = null;
        float f5 = 1000.0f;
        float f6 = 0.0f;
        while(Math.abs(f6 - f3) > 0.01f) {
            float f7 = (f3 - f6) / 2.0f + f6;
            int v = CamColor.e(f7, f1, f).t();
            float f8 = CamUtils.b(v);
            float f9 = Math.abs(f2 - f8);
            if(f9 < 0.2f) {
                CamColor camColor1 = CamColor.c(v);
                float f10 = camColor1.a(CamColor.e(camColor1.k(), camColor1.i(), f));
                if(f10 <= 1.0f) {
                    camColor0 = camColor1;
                    f4 = f9;
                    f5 = f10;
                }
            }
            if(f4 == 0.0f && f5 == 0.0f) {
                break;
            }
            if(f8 < f2) {
                f6 = f7;
            }
            else {
                f3 = f7;
            }
        }
        return camColor0;
    }

    static CamColor c(@ColorInt int v) {
        float[] arr_f = new float[7];
        float[] arr_f1 = new float[3];
        CamColor.d(v, ViewingConditions.k, arr_f, arr_f1);
        return new CamColor(arr_f1[0], arr_f1[1], arr_f[0], arr_f[1], arr_f[2], arr_f[3], arr_f[4], arr_f[5], arr_f[6]);
    }

    static void d(@ColorInt int v, ViewingConditions viewingConditions0, @Size(7L) float[] arr_f, @Size(3L) float[] arr_f1) {
        CamUtils.f(v, arr_f1);
        float f = arr_f1[0];
        float[] arr_f2 = CamUtils.a[0];
        float f1 = arr_f2[0] * f;
        float f2 = arr_f1[1];
        float f3 = f1 + arr_f2[1] * f2;
        float f4 = arr_f1[2];
        float f5 = f3 + arr_f2[2] * f4;
        float[] arr_f3 = CamUtils.a[1];
        float f6 = arr_f3[0] * f + arr_f3[1] * f2 + arr_f3[2] * f4;
        float[] arr_f4 = CamUtils.a[2];
        float f7 = f * arr_f4[0] + f2 * arr_f4[1] + f4 * arr_f4[2];
        float f8 = viewingConditions0.i()[0] * f5;
        float f9 = viewingConditions0.i()[1] * f6;
        float f10 = viewingConditions0.i()[2] * f7;
        float f11 = (float)Math.pow(((double)(viewingConditions0.c() * Math.abs(f8))) / 100.0, 0.42);
        float f12 = (float)Math.pow(((double)(viewingConditions0.c() * Math.abs(f9))) / 100.0, 0.42);
        float f13 = (float)Math.pow(((double)(viewingConditions0.c() * Math.abs(f10))) / 100.0, 0.42);
        float f14 = Math.signum(f8) * 400.0f * f11 / (f11 + 27.129999f);
        float f15 = Math.signum(f9) * 400.0f * f12 / (f12 + 27.129999f);
        float f16 = Math.signum(f10) * 400.0f * f13 / (f13 + 27.129999f);
        float f17 = ((float)(((double)f14) * 11.0 + ((double)f15) * -12.0 + ((double)f16))) / 11.0f;
        float f18 = ((float)(((double)(f14 + f15)) - ((double)f16) * 2.0)) / 9.0f;
        float f19 = ((float)Math.atan2(f18, f17)) * 180.0f / 3.141593f;
        if(f19 < 0.0f) {
            f19 += 360.0f;
        }
        else if(f19 >= 360.0f) {
            f19 -= 360.0f;
        }
        float f20 = ((float)Math.pow((f14 * 40.0f + f15 * 20.0f + f16) / 20.0f * viewingConditions0.f() / viewingConditions0.a(), viewingConditions0.b() * viewingConditions0.j())) * 100.0f;
        float f21 = 4.0f / viewingConditions0.b() * ((float)Math.sqrt(f20 / 100.0f)) * (viewingConditions0.a() + 4.0f) * viewingConditions0.d();
        float f22 = ((float)Math.pow(1.64 - Math.pow(0.29, viewingConditions0.e()), 0.73)) * ((float)Math.pow(((float)(Math.cos(((double)(((double)f19) < 20.14 ? f19 + 360.0f : f19)) * 3.141593 / 180.0 + 2.0) + 3.8)) * 961.538452f * viewingConditions0.g() * viewingConditions0.h() * ((float)Math.sqrt(f17 * f17 + f18 * f18)) / ((f14 * 20.0f + f15 * 20.0f + 21.0f * f16) / 20.0f + 0.305f), 0.9));
        float f23 = ((float)Math.sqrt(((double)f20) / 100.0)) * f22;
        float f24 = viewingConditions0.d() * f23;
        float f25 = ((float)Math.sqrt(f22 * viewingConditions0.b() / (viewingConditions0.a() + 4.0f))) * 50.0f;
        float f26 = ((float)Math.log(0.0228f * f24 + 1.0f)) * 43.85965f;
        double f27 = (double)(3.141593f * f19 / 180.0f);
        float f28 = ((float)Math.cos(f27)) * f26;
        float f29 = f26 * ((float)Math.sin(f27));
        arr_f1[0] = f19;
        arr_f1[1] = f23;
        if(arr_f != null) {
            arr_f[0] = f20;
            arr_f[1] = f21;
            arr_f[2] = f24;
            arr_f[3] = f25;
            arr_f[4] = 1.7f * f20 / (0.007f * f20 + 1.0f);
            arr_f[5] = f28;
            arr_f[6] = f29;
        }
    }

    private static CamColor e(@FloatRange(from = 0.0, to = 100.0) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 360.0) float f2) {
        return CamColor.f(f, f1, f2, ViewingConditions.k);
    }

    private static CamColor f(@FloatRange(from = 0.0, to = 100.0) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 360.0) float f2, ViewingConditions viewingConditions0) {
        float f3 = f1 * viewingConditions0.d();
        float f4 = ((float)Math.log(((double)f3) * 0.0228 + 1.0)) * 43.85965f;
        double f5 = (double)(3.141593f * f2 / 180.0f);
        return new CamColor(f2, f1, f, 4.0f / viewingConditions0.b() * ((float)Math.sqrt(((double)f) / 100.0)) * (viewingConditions0.a() + 4.0f) * viewingConditions0.d(), f3, ((float)Math.sqrt(f1 / ((float)Math.sqrt(((double)f) / 100.0)) * viewingConditions0.b() / (viewingConditions0.a() + 4.0f))) * 50.0f, 1.7f * f / (0.007f * f + 1.0f), f4 * ((float)Math.cos(f5)), f4 * ((float)Math.sin(f5)));
    }

    @FloatRange(from = -Infinity, fromInclusive = false, to = Infinity, toInclusive = false)
    float g() {
        return this.h;
    }

    @FloatRange(from = -Infinity, fromInclusive = false, to = Infinity, toInclusive = false)
    float h() {
        return this.i;
    }

    @FloatRange(from = 0.0, to = Infinity, toInclusive = false)
    float i() {
        return this.b;
    }

    @FloatRange(from = 0.0, to = 360.0, toInclusive = false)
    float j() {
        return this.a;
    }

    @FloatRange(from = 0.0, to = 100.0)
    float k() {
        return this.c;
    }

    @FloatRange(from = 0.0, to = 100.0)
    float l() {
        return this.g;
    }

    @FloatRange(from = 0.0, to = Infinity, toInclusive = false)
    float m() {
        return this.e;
    }

    public static void n(@ColorInt int v, @Size(3L) float[] arr_f) {
        CamColor.d(v, ViewingConditions.k, null, arr_f);
        arr_f[2] = CamUtils.b(v);
    }

    @FloatRange(from = 0.0, to = Infinity, toInclusive = false)
    float o() {
        return this.d;
    }

    @FloatRange(from = 0.0, to = Infinity, toInclusive = false)
    float p() {
        return this.f;
    }

    public static int q(@FloatRange(from = 0.0, to = 360.0) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 100.0) float f2) {
        return CamColor.r(f, f1, f2, ViewingConditions.k);
    }

    @ColorInt
    static int r(@FloatRange(from = 0.0, to = 360.0) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 100.0) float f2, ViewingConditions viewingConditions0) {
        if(((double)f1) >= 1.0 && ((double)Math.round(f2)) > 0.0 && ((double)Math.round(f2)) < 100.0) {
            float f3 = f < 0.0f ? 0.0f : Math.min(360.0f, f);
            float f4 = f1;
            CamColor camColor0 = null;
            float f5 = 0.0f;
            boolean z = true;
            while(Math.abs(f5 - f1) >= 0.4f) {
                CamColor camColor1 = CamColor.b(f3, f4, f2);
                if(z) {
                    if(camColor1 != null) {
                        return camColor1.s(viewingConditions0);
                    }
                    f4 = (f1 - f5) / 2.0f + f5;
                    z = false;
                }
                else {
                    if(camColor1 == null) {
                        f1 = f4;
                    }
                    else {
                        f5 = f4;
                        camColor0 = camColor1;
                    }
                    f4 = (f1 - f5) / 2.0f + f5;
                }
            }
            return camColor0 == null ? CamUtils.a(f2) : camColor0.s(viewingConditions0);
        }
        return CamUtils.a(f2);
    }

    @ColorInt
    int s(ViewingConditions viewingConditions0) {
        float f = (float)Math.pow(((double)(((double)this.i()) == 0.0 || ((double)this.k()) == 0.0 ? 0.0f : this.i() / ((float)Math.sqrt(((double)this.k()) / 100.0)))) / Math.pow(1.64 - Math.pow(0.29, viewingConditions0.e()), 0.73), 1.111111);
        double f1 = (double)(this.j() * 3.141593f / 180.0f);
        float f2 = viewingConditions0.a() * ((float)Math.pow(((double)this.k()) / 100.0, 1.0 / ((double)viewingConditions0.b()) / ((double)viewingConditions0.j()))) / viewingConditions0.f();
        float f3 = (float)Math.sin(f1);
        float f4 = (float)Math.cos(f1);
        float f5 = (f2 + 0.305f) * 23.0f * f / (((float)(Math.cos(f1 + 2.0) + 3.8)) * 961.538452f * viewingConditions0.g() * viewingConditions0.h() * 23.0f + 11.0f * f * f4 + f * 108.0f * f3);
        float f6 = f4 * f5;
        float f7 = f5 * f3;
        float f8 = (451.0f * f6 + f2 * 460.0f + 288.0f * f7) / 1403.0f;
        float f9 = (f2 * 460.0f - 891.0f * f6 - 261.0f * f7) / 1403.0f;
        float f10 = (f2 * 460.0f - f6 * 220.0f - f7 * 6300.0f) / 1403.0f;
        float f11 = Math.signum(f8) * (100.0f / viewingConditions0.c()) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f8)) * 27.13 / (400.0 - ((double)Math.abs(f8))))), 2.380952)) / viewingConditions0.i()[0];
        float f12 = Math.signum(f9) * (100.0f / viewingConditions0.c()) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f9)) * 27.13 / (400.0 - ((double)Math.abs(f9))))), 2.380952)) / viewingConditions0.i()[1];
        float f13 = Math.signum(f10) * (100.0f / viewingConditions0.c()) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f10)) * 27.13 / (400.0 - ((double)Math.abs(f10))))), 2.380952)) / viewingConditions0.i()[2];
        float[] arr_f = CamUtils.b[0];
        float f14 = arr_f[0] * f11 + arr_f[1] * f12 + arr_f[2] * f13;
        float[] arr_f1 = CamUtils.b[1];
        float f15 = arr_f1[0] * f11 + arr_f1[1] * f12 + arr_f1[2] * f13;
        float[] arr_f2 = CamUtils.b[2];
        return ColorUtils.h(f14, f15, f11 * arr_f2[0] + f12 * arr_f2[1] + f13 * arr_f2[2]);
    }

    @ColorInt
    int t() {
        return this.s(ViewingConditions.k);
    }
}

