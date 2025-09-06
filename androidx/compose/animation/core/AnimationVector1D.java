package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class AnimationVector1D extends AnimationVector {
    private float b;
    private final int c;
    public static final int d = 8;

    static {
    }

    public AnimationVector1D(float f) {
        super(null);
        this.b = f;
        this.c = 1;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public float a(int v) {
        return v == 0 ? this.b : 0.0f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int b() {
        return this.c;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector c() {
        return this.g();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void d() {
        this.b = 0.0f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void e(int v, float f) {
        if(v == 0) {
            this.b = f;
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof AnimationVector1D && ((AnimationVector1D)object0).b == this.b;
    }

    public final float f() {
        return this.b;
    }

    @l
    public AnimationVector1D g() {
        return new AnimationVector1D(0.0f);
    }

    public final void h(float f) {
        this.b = f;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    @Override
    @l
    public String toString() {
        return "AnimationVector1D: value = " + this.b;
    }
}

