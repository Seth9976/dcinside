package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class DefaultFlingBehavior implements FlingBehavior {
    @l
    private final DecayAnimationSpec a;
    @l
    private final MotionDurationScale b;
    private int c;

    public DefaultFlingBehavior(@l DecayAnimationSpec decayAnimationSpec0, @l MotionDurationScale motionDurationScale0) {
        L.p(decayAnimationSpec0, "flingDecay");
        L.p(motionDurationScale0, "motionDurationScale");
        super();
        this.a = decayAnimationSpec0;
        this.b = motionDurationScale0;
    }

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec0, MotionDurationScale motionDurationScale0, int v, w w0) {
        if((v & 2) != 0) {
            motionDurationScale0 = ScrollableKt.f();
        }
        this(decayAnimationSpec0, motionDurationScale0);
    }

    @Override  // androidx.compose.foundation.gestures.FlingBehavior
    @m
    public Object a(@l ScrollScope scrollScope0, float f, @l d d0) {
        this.c = 0;
        androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2 defaultFlingBehavior$performFling$20 = new o(this, scrollScope0, null) {
            Object k;
            int l;
            final float m;
            final DefaultFlingBehavior n;
            final ScrollScope o;

            {
                this.m = f;
                this.n = defaultFlingBehavior0;
                this.o = scrollScope0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2(this.m, this.n, this.o, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        if(Math.abs(this.m) > 1.0f) {
                            e l0$e0 = new e();
                            l0$e0.a = this.m;
                            e l0$e1 = new e();
                            AnimationState animationState0 = AnimationStateKt.c(0.0f, this.m, 0L, 0L, false, 28, null);
                            androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1 defaultFlingBehavior$performFling$2$10 = new Function1(this.o, l0$e0, this.n) {
                                final e e;
                                final ScrollScope f;
                                final e g;
                                final DefaultFlingBehavior h;

                                {
                                    this.e = l0$e0;
                                    this.f = scrollScope0;
                                    this.g = l0$e1;
                                    this.h = defaultFlingBehavior0;
                                    super(1);
                                }

                                public final void a(@l AnimationScope animationScope0) {
                                    L.p(animationScope0, "$this$animateDecay");
                                    float f = ((Number)animationScope0.g()).floatValue() - this.e.a;
                                    float f1 = this.f.a(f);
                                    this.e.a = ((Number)animationScope0.g()).floatValue();
                                    this.g.a = ((Number)animationScope0.h()).floatValue();
                                    if(Math.abs(f - f1) > 0.5f) {
                                        animationScope0.a();
                                    }
                                    this.h.d(this.h.c() + 1);
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((AnimationScope)object0));
                                    return S0.a;
                                }
                            };
                            this.k = l0$e0;
                            this.l = 1;
                            return SuspendAnimationKt.k(animationState0, this.n.a, false, defaultFlingBehavior$performFling$2$10, this, 2, null) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.e(l0$e0.a);
                        }
                        return kotlin.coroutines.jvm.internal.b.e(this.m);
                    }
                    case 1: {
                        e l0$e2 = (e)this.k;
                        f0.n(object0);
                        return kotlin.coroutines.jvm.internal.b.e(l0$e2.a);
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        };
        return i.h(this.b, defaultFlingBehavior$performFling$20, d0);
    }

    public final int c() {
        return this.c;
    }

    public final void d(int v) {
        this.c = v;
    }
}

