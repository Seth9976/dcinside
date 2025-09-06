package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import y4.m;

@Immutable
public final class CubicBezierEasing implements Easing {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    public static final int e;

    static {
    }

    public CubicBezierEasing(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        if(Float.isNaN(f) || Float.isNaN(f1) || Float.isNaN(f2) || Float.isNaN(f3)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f1 + ", " + f2 + ", " + f3 + '.').toString());
        }
    }

    @Override  // androidx.compose.animation.core.Easing
    public float a(float f) {
        float f3;
        float f1 = 1.0f;
        float f2 = 0.0f;
        if(f > 0.0f && f < 1.0f) {
            while(true) {
                f3 = (f2 + f1) / 2.0f;
                float f4 = this.b(this.a, this.c, f3);
                if(Math.abs(f - f4) < 0.001f) {
                    break;
                }
                if(f4 < f) {
                    f2 = f3;
                }
                else {
                    f1 = f3;
                }
            }
            return this.b(this.b, this.d, f3);
        }
        return f;
    }

    private final float b(float f, float f1, float f2) {
        return f * 3.0f * (1.0f - f2) * (1.0f - f2) * f2 + 3.0f * f1 * (1.0f - f2) * f2 * f2 + f2 * f2 * f2;
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof CubicBezierEasing && this.a == ((CubicBezierEasing)object0).a && this.b == ((CubicBezierEasing)object0).b && this.c == ((CubicBezierEasing)object0).c && this.d == ((CubicBezierEasing)object0).d;
    }

    @Override
    public int hashCode() {
        return ((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d);
    }
}

