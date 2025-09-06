package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Immutable
public final class Fade {
    private final float a;
    @l
    private final FiniteAnimationSpec b;

    public Fade(float f, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(finiteAnimationSpec0, "animationSpec");
        super();
        this.a = f;
        this.b = finiteAnimationSpec0;
    }

    public final float a() {
        return this.a;
    }

    @l
    public final FiniteAnimationSpec b() {
        return this.b;
    }

    @l
    public final Fade c(float f, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(finiteAnimationSpec0, "animationSpec");
        return new Fade(f, finiteAnimationSpec0);
    }

    public static Fade d(Fade fade0, float f, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if((v & 1) != 0) {
            f = fade0.a;
        }
        if((v & 2) != 0) {
            finiteAnimationSpec0 = fade0.b;
        }
        return fade0.c(f, finiteAnimationSpec0);
    }

    public final float e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Fade)) {
            return false;
        }
        return Float.compare(this.a, ((Fade)object0).a) == 0 ? L.g(this.b, ((Fade)object0).b) : false;
    }

    @l
    public final FiniteAnimationSpec f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.a) * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

