package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import y4.l;

public final class SplineBasedDecayKt {
    private static final float a = 0.35f;
    private static final float b = 0.5f;
    private static final float c = 1.0f;
    private static final float d = 0.175f;
    private static final float e = 0.35f;

    private static final void b(float[] arr_f, float[] arr_f1, int v) {
        float f13;
        float f12;
        float f11;
        float f10;
        float f7;
        float f6;
        float f5;
        float f4;
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            float f2 = ((float)v1) / ((float)v);
            float f3 = 1.0f;
            while(true) {
                f4 = (f3 - f) / 2.0f + f;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f8 = (f5 * 0.175f + f4 * 0.35f) * f6 + f7;
                if(((double)Math.abs(f8 - f2)) < 0.00001) {
                    break;
                }
                if(f8 > f2) {
                    f3 = f4;
                }
                else {
                    f = f4;
                }
            }
            arr_f[v1] = f6 * (f5 * 0.5f + f4) + f7;
            float f9 = 1.0f;
            while(true) {
                f10 = (f9 - f1) / 2.0f + f1;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f14 = (f11 * 0.5f + f10) * f12 + f13;
                if(((double)Math.abs(f14 - f2)) < 0.00001) {
                    break;
                }
                if(f14 > f2) {
                    f9 = f10;
                }
                else {
                    f1 = f10;
                }
            }
            arr_f1[v1] = f12 * (f11 * 0.175f + f10 * 0.35f) + f13;
        }
        arr_f1[v] = 1.0f;
        arr_f[v] = 1.0f;
    }

    @l
    public static final DecayAnimationSpec c(@l Density density0) {
        L.p(density0, "density");
        return DecayAnimationSpecKt.e(new SplineBasedFloatDecayAnimationSpec(density0));
    }
}

