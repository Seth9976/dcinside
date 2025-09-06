package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class AnimationVector2D extends AnimationVector {
    private float b;
    private float c;
    private final int d;
    public static final int e = 8;

    static {
    }

    public AnimationVector2D(float f, float f1) {
        super(null);
        this.b = f;
        this.c = f1;
        this.d = 2;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public float a(int v) {
        switch(v) {
            case 0: {
                return this.b;
            }
            case 1: {
                return this.c;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int b() {
        return this.d;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector c() {
        return this.h();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void d() {
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void e(int v, float f) {
        switch(v) {
            case 0: {
                this.b = f;
                return;
            }
            case 1: {
                this.c = f;
            }
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof AnimationVector2D && ((AnimationVector2D)object0).b == this.b && ((AnimationVector2D)object0).c == this.c;
    }

    public final float f() {
        return this.b;
    }

    public final float g() {
        return this.c;
    }

    @l
    public AnimationVector2D h() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.b) * 0x1F + Float.floatToIntBits(this.c);
    }

    public final void i(float f) {
        this.b = f;
    }

    public final void j(float f) {
        this.c = f;
    }

    @Override
    @l
    public String toString() {
        return "AnimationVector2D: v1 = " + this.b + ", v2 = " + this.c;
    }
}

