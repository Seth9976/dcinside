package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class Scale {
    private final float a;
    private final long b;
    @l
    private final FiniteAnimationSpec c;

    private Scale(float f, long v, FiniteAnimationSpec finiteAnimationSpec0) {
        this.a = f;
        this.b = v;
        this.c = finiteAnimationSpec0;
    }

    public Scale(float f, long v, FiniteAnimationSpec finiteAnimationSpec0, w w0) {
        this(f, v, finiteAnimationSpec0);
    }

    public final float a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @l
    public final FiniteAnimationSpec c() {
        return this.c;
    }

    @l
    public final Scale d(float f, long v, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(finiteAnimationSpec0, "animationSpec");
        return new Scale(f, v, finiteAnimationSpec0, null);
    }

    public static Scale e(Scale scale0, float f, long v, FiniteAnimationSpec finiteAnimationSpec0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = scale0.a;
        }
        if((v1 & 2) != 0) {
            v = scale0.b;
        }
        if((v1 & 4) != 0) {
            finiteAnimationSpec0 = scale0.c;
        }
        return scale0.d(f, v, finiteAnimationSpec0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Scale)) {
            return false;
        }
        if(Float.compare(this.a, ((Scale)object0).a) != 0) {
            return false;
        }
        return TransformOrigin.i(this.b, ((Scale)object0).b) ? L.g(this.c, ((Scale)object0).c) : false;
    }

    @l
    public final FiniteAnimationSpec f() {
        return this.c;
    }

    public final float g() {
        return this.a;
    }

    public final long h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return (Float.floatToIntBits(this.a) * 0x1F + TransformOrigin.m(this.b)) * 0x1F + this.c.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + TransformOrigin.n(this.b) + ", animationSpec=" + this.c + ')';
    }
}

