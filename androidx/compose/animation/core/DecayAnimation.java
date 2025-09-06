package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

@StabilityInferred(parameters = 0)
public final class DecayAnimation implements Animation {
    @l
    private final VectorizedDecayAnimationSpec a;
    @l
    private final TwoWayConverter b;
    private final Object c;
    @l
    private final AnimationVector d;
    @l
    private final AnimationVector e;
    @l
    private final AnimationVector f;
    private final Object g;
    private final long h;
    private final boolean i;
    public static final int j;

    static {
    }

    public DecayAnimation(@l DecayAnimationSpec decayAnimationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, @l AnimationVector animationVector0) {
        L.p(decayAnimationSpec0, "animationSpec");
        L.p(twoWayConverter0, "typeConverter");
        L.p(animationVector0, "initialVelocityVector");
        this(decayAnimationSpec0.a(twoWayConverter0), twoWayConverter0, object0, animationVector0);
    }

    public DecayAnimation(@l DecayAnimationSpec decayAnimationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, Object object1) {
        L.p(decayAnimationSpec0, "animationSpec");
        L.p(twoWayConverter0, "typeConverter");
        this(decayAnimationSpec0.a(twoWayConverter0), twoWayConverter0, object0, ((AnimationVector)twoWayConverter0.a().invoke(object1)));
    }

    public DecayAnimation(@l VectorizedDecayAnimationSpec vectorizedDecayAnimationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, @l AnimationVector animationVector0) {
        L.p(vectorizedDecayAnimationSpec0, "animationSpec");
        L.p(twoWayConverter0, "typeConverter");
        L.p(animationVector0, "initialVelocityVector");
        super();
        this.a = vectorizedDecayAnimationSpec0;
        this.b = twoWayConverter0;
        this.c = object0;
        AnimationVector animationVector1 = (AnimationVector)this.d().a().invoke(object0);
        this.d = animationVector1;
        this.e = AnimationVectorsKt.e(animationVector0);
        this.g = this.d().b().invoke(vectorizedDecayAnimationSpec0.d(animationVector1, animationVector0));
        this.h = vectorizedDecayAnimationSpec0.c(animationVector1, animationVector0);
        AnimationVector animationVector2 = AnimationVectorsKt.e(vectorizedDecayAnimationSpec0.b(this.c(), animationVector1, animationVector0));
        this.f = animationVector2;
        int v = animationVector2.b();
        for(int v1 = 0; v1 < v; ++v1) {
            float f = s.H(this.f.a(v1), -this.a.a(), this.a.a());
            this.f.e(v1, f);
        }
    }

    @Override  // androidx.compose.animation.core.Animation
    public boolean a() {
        return this.i;
    }

    @Override  // androidx.compose.animation.core.Animation
    public boolean b(long v) {
        return a.a(this, v);
    }

    @Override  // androidx.compose.animation.core.Animation
    public long c() {
        return this.h;
    }

    @Override  // androidx.compose.animation.core.Animation
    @l
    public TwoWayConverter d() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object e(long v) {
        return this.b(v) ? this.f() : this.d().b().invoke(this.a.e(v, this.d, this.e));
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object f() {
        return this.g;
    }

    @Override  // androidx.compose.animation.core.Animation
    @l
    public AnimationVector g(long v) {
        return this.b(v) ? this.f : this.a.b(v, this.d, this.e);
    }

    public final Object h() {
        return this.c;
    }

    @l
    public final AnimationVector i() {
        return this.e;
    }
}

