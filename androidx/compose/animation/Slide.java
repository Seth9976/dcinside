package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Immutable
public final class Slide {
    @l
    private final Function1 a;
    @l
    private final FiniteAnimationSpec b;

    public Slide(@l Function1 function10, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(function10, "slideOffset");
        L.p(finiteAnimationSpec0, "animationSpec");
        super();
        this.a = function10;
        this.b = finiteAnimationSpec0;
    }

    @l
    public final Function1 a() {
        return this.a;
    }

    @l
    public final FiniteAnimationSpec b() {
        return this.b;
    }

    @l
    public final Slide c(@l Function1 function10, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(function10, "slideOffset");
        L.p(finiteAnimationSpec0, "animationSpec");
        return new Slide(function10, finiteAnimationSpec0);
    }

    public static Slide d(Slide slide0, Function1 function10, FiniteAnimationSpec finiteAnimationSpec0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = slide0.a;
        }
        if((v & 2) != 0) {
            finiteAnimationSpec0 = slide0.b;
        }
        return slide0.c(function10, finiteAnimationSpec0);
    }

    @l
    public final FiniteAnimationSpec e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Slide)) {
            return false;
        }
        return L.g(this.a, ((Slide)object0).a) ? L.g(this.b, ((Slide)object0).b) : false;
    }

    @l
    public final Function1 f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

