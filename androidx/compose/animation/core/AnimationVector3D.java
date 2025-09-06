package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class AnimationVector3D extends AnimationVector {
    private float b;
    private float c;
    private float d;
    private final int e;
    public static final int f = 8;

    static {
    }

    public AnimationVector3D(float f, float f1, float f2) {
        super(null);
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = 3;
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
            default: {
                return 0.0f;
            }
        }
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public int b() {
        return this.e;
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public AnimationVector c() {
        return this.i();
    }

    @Override  // androidx.compose.animation.core.AnimationVector
    public void d() {
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
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
            }
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof AnimationVector3D && ((AnimationVector3D)object0).b == this.b && ((AnimationVector3D)object0).c == this.c && ((AnimationVector3D)object0).d == this.d;
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
        return (Float.floatToIntBits(this.b) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d);
    }

    @l
    public AnimationVector3D i() {
        return new AnimationVector3D(0.0f, 0.0f, 0.0f);
    }

    public final void j(float f) {
        this.b = f;
    }

    public final void k(float f) {
        this.c = f;
    }

    public final void l(float f) {
        this.d = f;
    }

    @Override
    @l
    public String toString() {
        return "AnimationVector3D: v1 = " + this.b + ", v2 = " + this.c + ", v3 = " + this.d;
    }
}

