package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.a;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,477:1\n76#2:478\n102#2,2:479\n76#2:481\n102#2,2:482\n1#3:484\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n96#1:478\n96#1:479,2\n103#1:481\n103#1:482,2\n*E\n"})
public final class Animatable {
    @l
    private final TwoWayConverter a;
    @m
    private final Object b;
    @l
    private final String c;
    @l
    private final AnimationState d;
    @l
    private final MutableState e;
    @l
    private final MutableState f;
    @m
    private Object g;
    @m
    private Object h;
    @l
    private final MutatorMutex i;
    @l
    private final SpringSpec j;
    @l
    private final AnimationVector k;
    @l
    private final AnimationVector l;
    @l
    private AnimationVector m;
    @l
    private AnimationVector n;
    public static final int o = 8;

    static {
    }

    @k(level = kotlin.m.c, message = "Maintained for binary compatibility", replaceWith = @c0(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public Animatable(Object object0, TwoWayConverter twoWayConverter0, Object object1) {
        L.p(twoWayConverter0, "typeConverter");
        this(object0, twoWayConverter0, object1, "Animatable");
    }

    public Animatable(Object object0, TwoWayConverter twoWayConverter0, Object object1, int v, w w0) {
        if((v & 4) != 0) {
            object1 = null;
        }
        this(object0, twoWayConverter0, object1);
    }

    public Animatable(Object object0, @l TwoWayConverter twoWayConverter0, @m Object object1, @l String s) {
        L.p(twoWayConverter0, "typeConverter");
        L.p(s, "label");
        super();
        this.a = twoWayConverter0;
        this.b = object1;
        this.c = s;
        this.d = new AnimationState(twoWayConverter0, object0, null, 0L, 0L, false, 60, null);
        this.e = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
        this.i = new MutatorMutex();
        this.j = new SpringSpec(0.0f, 0.0f, object1, 3, null);
        AnimationVector animationVector0 = this.l(object0, -Infinityf);
        this.k = animationVector0;
        AnimationVector animationVector1 = this.l(object0, Infinityf);
        this.l = animationVector1;
        this.m = animationVector0;
        this.n = animationVector1;
    }

    public Animatable(Object object0, TwoWayConverter twoWayConverter0, Object object1, String s, int v, w w0) {
        if((v & 4) != 0) {
            object1 = null;
        }
        if((v & 8) != 0) {
            s = "Animatable";
        }
        this(object0, twoWayConverter0, object1, s);
    }

    private final void A(Object object0) {
        this.f.setValue(object0);
    }

    @m
    public final Object B(Object object0, @l d d0) {
        androidx.compose.animation.core.Animatable.snapTo.2 animatable$snapTo$20 = new Function1(object0, null) {
            int k;
            final Animatable l;
            final Object m;

            {
                this.l = animatable0;
                this.m = object0;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@l d d0) {
                return new androidx.compose.animation.core.Animatable.snapTo.2(this.l, this.m, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((d)object0));
            }

            @m
            public final Object invoke(@m d d0) {
                return ((androidx.compose.animation.core.Animatable.snapTo.2)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m();
                Object object1 = this.l.k(this.m);
                this.l.o().p(object1);
                this.l.A(object1);
                return S0.a;
            }
        };
        Object object1 = MutatorMutex.e(this.i, null, animatable$snapTo$20, d0, 1, null);
        return object1 == b.l() ? object1 : S0.a;
    }

    @m
    public final Object C(@l d d0) {
        androidx.compose.animation.core.Animatable.stop.2 animatable$stop$20 = new Function1(null) {
            int k;
            final Animatable l;

            {
                this.l = animatable0;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@l d d0) {
                return new androidx.compose.animation.core.Animatable.stop.2(this.l, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((d)object0));
            }

            @m
            public final Object invoke(@m d d0) {
                return ((androidx.compose.animation.core.Animatable.stop.2)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m();
                return S0.a;
            }
        };
        Object object0 = MutatorMutex.e(this.i, null, animatable$stop$20, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    public final void D(@m Object object0, @m Object object1) {
        AnimationVector animationVector1;
        AnimationVector animationVector0;
        if(object0 == null) {
            animationVector0 = this.k;
        }
        else {
            animationVector0 = (AnimationVector)this.a.a().invoke(object0);
            if(animationVector0 == null) {
                animationVector0 = this.k;
            }
        }
        if(object1 == null) {
            animationVector1 = this.l;
        }
        else {
            animationVector1 = (AnimationVector)this.a.a().invoke(object1);
            if(animationVector1 == null) {
                animationVector1 = this.l;
            }
        }
        int v = animationVector0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            if(animationVector0.a(v1) > animationVector1.a(v1)) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + animationVector0 + " is greater than upper bound " + animationVector1 + " on index " + v1).toString());
            }
        }
        this.m = animationVector0;
        this.n = animationVector1;
        this.h = object1;
        this.g = object0;
        if(!this.x()) {
            Object object2 = this.k(this.u());
            if(!L.g(object2, this.u())) {
                this.d.p(object2);
            }
        }
    }

    public static void E(Animatable animatable0, Object object0, Object object1, int v, Object object2) {
        if((v & 1) != 0) {
            object0 = animatable0.g;
        }
        if((v & 2) != 0) {
            object1 = animatable0.h;
        }
        animatable0.D(object0, object1);
    }

    public static final Object c(Animatable animatable0, Animation animation0, Object object0, Function1 function10, d d0) {
        return animatable0.y(animation0, object0, function10, d0);
    }

    @m
    public final Object f(Object object0, @l DecayAnimationSpec decayAnimationSpec0, @m Function1 function10, @l d d0) {
        Object object1 = this.u();
        AnimationVector animationVector0 = (AnimationVector)this.a.a().invoke(object0);
        return this.y(new DecayAnimation(decayAnimationSpec0, this.a, object1, animationVector0), object0, function10, d0);
    }

    public static Object g(Animatable animatable0, Object object0, DecayAnimationSpec decayAnimationSpec0, Function1 function10, d d0, int v, Object object1) {
        if((v & 4) != 0) {
            function10 = null;
        }
        return animatable0.f(object0, decayAnimationSpec0, function10, d0);
    }

    @m
    public final Object h(Object object0, @l AnimationSpec animationSpec0, Object object1, @m Function1 function10, @l d d0) {
        Object object2 = this.u();
        return this.y(AnimationKt.c(animationSpec0, this.a, object2, object0, object1), object1, function10, d0);
    }

    public static Object i(Animatable animatable0, Object object0, AnimationSpec animationSpec0, Object object1, Function1 function10, d d0, int v, Object object2) {
        if((v & 2) != 0) {
            animationSpec0 = animatable0.j;
        }
        if((v & 4) != 0) {
            object1 = animatable0.v();
        }
        if((v & 8) != 0) {
            function10 = null;
        }
        return animatable0.h(object0, animationSpec0, object1, function10, d0);
    }

    @l
    public final State j() {
        return this.d;
    }

    private final Object k(Object object0) {
        if(L.g(this.m, this.k) && L.g(this.n, this.l)) {
            return object0;
        }
        AnimationVector animationVector0 = (AnimationVector)this.a.a().invoke(object0);
        int v = animationVector0.b();
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            if(animationVector0.a(v1) < this.m.a(v1) || animationVector0.a(v1) > this.n.a(v1)) {
                animationVector0.e(v1, s.H(animationVector0.a(v1), this.m.a(v1), this.n.a(v1)));
                z = true;
            }
        }
        return z ? this.a.b().invoke(animationVector0) : object0;
    }

    private final AnimationVector l(Object object0, float f) {
        AnimationVector animationVector0 = (AnimationVector)this.a.a().invoke(object0);
        int v = animationVector0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            animationVector0.e(v1, f);
        }
        return animationVector0;
    }

    private final void m() {
        this.d.j().d();
        this.d.n(0x8000000000000000L);
        this.z(false);
    }

    @l
    public final SpringSpec n() {
        return this.j;
    }

    @l
    public final AnimationState o() {
        return this.d;
    }

    @l
    public final String p() {
        return this.c;
    }

    @m
    public final Object q() {
        return this.g;
    }

    public final Object r() {
        return this.f.getValue();
    }

    @l
    public final TwoWayConverter s() {
        return this.a;
    }

    @m
    public final Object t() {
        return this.h;
    }

    public final Object u() {
        return this.d.getValue();
    }

    public final Object v() {
        return this.a.b().invoke(this.w());
    }

    @l
    public final AnimationVector w() {
        return this.d.j();
    }

    public final boolean x() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    private final Object y(Animation animation0, Object object0, Function1 function10, d d0) {
        androidx.compose.animation.core.Animatable.runAnimation.2 animatable$runAnimation$20 = new Function1(object0, animation0, this.d.d(), function10, null) {
            Object k;
            Object l;
            int m;
            final Animatable n;
            final Object o;
            final Animation p;
            final long q;
            final Function1 r;

            {
                this.n = animatable0;
                this.o = object0;
                this.p = animation0;
                this.q = v;
                this.r = function10;
                super(1, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@l d d0) {
                return new androidx.compose.animation.core.Animatable.runAnimation.2(this.n, this.o, this.p, this.q, this.r, d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((d)object0));
            }

            @m
            public final Object invoke(@m d d0) {
                return ((androidx.compose.animation.core.Animatable.runAnimation.2)this.create(d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                a l0$a1;
                AnimationState animationState1;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        try {
                            Function1 function10 = this.n.s().a();
                            this.n.o().q(((AnimationVector)function10.invoke(this.o)));
                            Object object2 = this.p.f();
                            this.n.A(object2);
                            this.n.z(true);
                            AnimationState animationState0 = AnimationStateKt.h(this.n.o(), null, null, 0L, 0x8000000000000000L, false, 23, null);
                            a l0$a0 = new a();
                            androidx.compose.animation.core.Animatable.runAnimation.2.1 animatable$runAnimation$2$10 = new Function1(animationState0, this.r, l0$a0) {
                                final Animatable e;
                                final AnimationState f;
                                final Function1 g;
                                final a h;

                                {
                                    this.e = animatable0;
                                    this.f = animationState0;
                                    this.g = function10;
                                    this.h = l0$a0;
                                    super(1);
                                }

                                public final void a(@l AnimationScope animationScope0) {
                                    L.p(animationScope0, "$this$animate");
                                    SuspendAnimationKt.r(animationScope0, this.e.o());
                                    Object object0 = animationScope0.g();
                                    Object object1 = this.e.k(object0);
                                    if(!L.g(object1, animationScope0.g())) {
                                        this.e.o().p(object1);
                                        this.f.p(object1);
                                        Function1 function10 = this.g;
                                        if(function10 != null) {
                                            function10.invoke(this.e);
                                        }
                                        animationScope0.a();
                                        this.h.a = true;
                                        return;
                                    }
                                    Function1 function11 = this.g;
                                    if(function11 != null) {
                                        function11.invoke(this.e);
                                    }
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((AnimationScope)object0));
                                    return S0.a;
                                }
                            };
                            this.k = animationState0;
                            this.l = l0$a0;
                            this.m = 1;
                            if(SuspendAnimationKt.d(animationState0, this.p, this.q, animatable$runAnimation$2$10, this) == object1) {
                                return object1;
                            }
                            animationState1 = animationState0;
                            l0$a1 = l0$a0;
                            goto label_23;
                        }
                        catch(CancellationException cancellationException0) {
                            break;
                        }
                    }
                    case 1: {
                        l0$a1 = (a)this.l;
                        animationState1 = (AnimationState)this.k;
                        try {
                            f0.n(object0);
                        label_23:
                            AnimationEndReason animationEndReason0 = l0$a1.a ? AnimationEndReason.a : AnimationEndReason.b;
                            this.n.m();
                            return new AnimationResult(animationState1, animationEndReason0);
                        }
                        catch(CancellationException cancellationException0) {
                            break;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.n.m();
                throw cancellationException0;
            }
        };
        return MutatorMutex.e(this.i, null, animatable$runAnimation$20, d0, 1, null);
    }

    private final void z(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }
}

