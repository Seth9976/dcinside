package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;

@StabilityInferred(parameters = 0)
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    private final float a;
    private final float b;
    public static final int c;

    static {
    }

    public FloatExponentialDecaySpec() {
        this(0.0f, 0.0f, 3, null);
    }

    public FloatExponentialDecaySpec(float f, float f1) {
        this.a = Math.max(1.000000E-07f, Math.abs(f1));
        this.b = Math.max(0.0001f, f) * -4.2f;
    }

    public FloatExponentialDecaySpec(float f, float f1, int v, w w0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.1f;
        }
        this(f, f1);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float a() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float b(long v, float f, float f1) {
        return f1 * ((float)Math.exp(((float)(v / 1000000L)) / 1000.0f * this.b));
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long c(float f, float f1) {
        return ((long)(((float)Math.log(this.a() / Math.abs(f1))) * 1000.0f / this.b)) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float d(float f, float f1) {
        return Math.abs(f1) <= this.a() ? f : f - f1 / this.b + f1 / this.b * ((float)Math.exp(((double)this.b) * (Math.log(Math.abs(this.a() / f1)) / ((double)this.b) * 1000.0) / 1000.0));
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float e(long v, float f, float f1) {
        return f - f1 / this.b + f1 / this.b * ((float)Math.exp(this.b * ((float)(v / 1000000L)) / 1000.0f));
    }
}

