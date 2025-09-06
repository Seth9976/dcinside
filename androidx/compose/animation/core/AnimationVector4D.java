package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class AnimationVector4D extends AnimationVector {
    private float b;
    private float c;
    private float d;
    private float e;
    private final int f;
    public static final int g = 8;

    static {
    }

    public AnimationVector4D(float f, float f1, float f2, float f3) {
        super(null);
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = 4;
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
            case 2: {
                return this.d;
            }
            case 3: {
                return this.e;
            }
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int b() {
        return this.f;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector c() {
        return this.j();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void d() {
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
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
                return;
            }
            case 2: {
                this.d = f;
                return;
            }
            case 3: {
                this.e = f;
            }
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof AnimationVector4D && ((AnimationVector4D)object0).b == this.b && ((AnimationVector4D)object0).c == this.c && ((AnimationVector4D)object0).d == this.d && ((AnimationVector4D)object0).e == this.e;
    }

    public final float f() {
        return this.b;
    }

    public final float g() {
        return this.c;
    }

    public final float h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return ((Float.floatToIntBits(this.b) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e);
    }

    public final float i() {
        return this.e;
    }

    @l
    public AnimationVector4D j() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void k(float f) {
        this.b = f;
    }

    public final void l(float f) {
        this.c = f;
    }

    public final void m(float f) {
        this.d = f;
    }

    public final void n(float f) {
        this.e = f;
    }

    @Override
    @l
    public String toString() {
        return "AnimationVector4D: v1 = " + this.b + ", v2 = " + this.c + ", v3 = " + this.d + ", v4 = " + this.e;
    }
}

