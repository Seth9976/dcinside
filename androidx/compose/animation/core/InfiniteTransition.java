package androidx.compose.animation.core;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.e;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1182#2:365\n1161#2,2:366\n76#3:368\n102#3,2:369\n76#3:371\n102#3,2:372\n25#4:374\n1057#5,6:375\n460#6,11:381\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374\n173#1:375,6\n217#1:381,11\n*E\n"})
public final class InfiniteTransition {
    @s0({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n76#2:365\n102#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"})
    public final class TransitionAnimationState implements State {
        private Object a;
        private Object b;
        @l
        private final TwoWayConverter c;
        @l
        private final String d;
        @l
        private final MutableState e;
        @l
        private AnimationSpec f;
        @l
        private TargetBasedAnimation g;
        private boolean h;
        private boolean i;
        private long j;
        final InfiniteTransition k;

        public TransitionAnimationState(Object object0, Object object1, @l TwoWayConverter twoWayConverter0, @l AnimationSpec animationSpec0, @l String s) {
            L.p(twoWayConverter0, "typeConverter");
            L.p(animationSpec0, "animationSpec");
            L.p(s, "label");
            this.k = infiniteTransition0;
            super();
            this.a = object0;
            this.b = object1;
            this.c = twoWayConverter0;
            this.d = s;
            this.e = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            this.f = animationSpec0;
            this.g = new TargetBasedAnimation(this.f, twoWayConverter0, this.a, this.b, null, 16, null);
        }

        @l
        public final TargetBasedAnimation b() {
            return this.g;
        }

        @l
        public final AnimationSpec d() {
            return this.f;
        }

        public final Object g() {
            return this.a;
        }

        @Override  // androidx.compose.runtime.State
        public Object getValue() {
            return this.e.getValue();
        }

        @l
        public final String h() {
            return this.d;
        }

        public final Object j() {
            return this.b;
        }

        @l
        public final TwoWayConverter k() {
            return this.c;
        }

        public final boolean m() {
            return this.h;
        }

        public final void n(long v) {
            this.k.n(false);
            if(this.i) {
                this.i = false;
                this.j = v;
            }
            long v1 = v - this.j;
            this.t(this.g.e(v1));
            this.h = this.g.b(v1);
        }

        public final void o() {
            this.i = true;
        }

        public final void p(@l TargetBasedAnimation targetBasedAnimation0) {
            L.p(targetBasedAnimation0, "<set-?>");
            this.g = targetBasedAnimation0;
        }

        public final void q(boolean z) {
            this.h = z;
        }

        public final void r(Object object0) {
            this.a = object0;
        }

        public final void s(Object object0) {
            this.b = object0;
        }

        public void t(Object object0) {
            this.e.setValue(object0);
        }

        public final void u() {
            this.t(this.g.f());
            this.i = true;
        }

        public final void v(Object object0, Object object1, @l AnimationSpec animationSpec0) {
            L.p(animationSpec0, "animationSpec");
            this.a = object0;
            this.b = object1;
            this.f = animationSpec0;
            this.g = new TargetBasedAnimation(animationSpec0, this.c, object0, object1, null, 16, null);
            this.k.n(true);
            this.h = false;
            this.i = true;
        }
    }

    @l
    private final String a;
    @l
    private final MutableVector b;
    @l
    private final MutableState c;
    private long d;
    @l
    private final MutableState e;
    public static final int f = 8;

    static {
    }

    public InfiniteTransition(@l String s) {
        L.p(s, "label");
        super();
        this.a = s;
        this.b = new MutableVector(new TransitionAnimationState[16], 0);
        this.c = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.d = 0x8000000000000000L;
        this.e = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
    }

    public final void f(@l TransitionAnimationState infiniteTransition$TransitionAnimationState0) {
        L.p(infiniteTransition$TransitionAnimationState0, "animation");
        this.b.b(infiniteTransition$TransitionAnimationState0);
        this.n(true);
    }

    @l
    public final List g() {
        return this.b.k();
    }

    @l
    public final String h() {
        return this.a;
    }

    private final boolean i() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    private final void k(long v) {
        int v3;
        MutableVector mutableVector0 = this.b;
        int v1 = mutableVector0.J();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.F();
            int v2 = 0;
            v3 = 1;
            do {
                TransitionAnimationState infiniteTransition$TransitionAnimationState0 = (TransitionAnimationState)arr_object[v2];
                if(!infiniteTransition$TransitionAnimationState0.m()) {
                    infiniteTransition$TransitionAnimationState0.n(v);
                }
                if(!infiniteTransition$TransitionAnimationState0.m()) {
                    v3 = 0;
                }
                ++v2;
            }
            while(v2 < v1);
        }
        else {
            v3 = 1;
        }
        this.o(((boolean)(v3 ^ 1)));
    }

    public final void l(@l TransitionAnimationState infiniteTransition$TransitionAnimationState0) {
        L.p(infiniteTransition$TransitionAnimationState0, "animation");
        this.b.a0(infiniteTransition$TransitionAnimationState0);
    }

    @Composable
    public final void m(@m Composer composer0, int v) {
        Composer composer1 = composer0.G(0xED0B0967);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xED0B0967, v, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        composer1.V(0xE2A708A4);
        MutableState mutableState0 = composer1.W();
        if(mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
            composer1.O(mutableState0);
        }
        composer1.g0();
        if(this.j() || this.i()) {
            EffectsKt.g(this, new o(this, null) {
                Object k;
                int l;
                private Object m;
                final MutableState n;
                final InfiniteTransition o;

                {
                    this.n = mutableState0;
                    this.o = infiniteTransition0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.animation.core.InfiniteTransition.run.1(this.n, this.o, d0);
                    d1.m = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.animation.core.InfiniteTransition.run.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    e l0$e0;
                    O o0;
                    Object object1 = b.l();
                    switch(this.l) {
                        case 0: {
                            f0.n(object0);
                            o0 = (O)this.m;
                            l0$e0 = new e();
                            l0$e0.a = 1.0f;
                            break;
                        }
                        case 1: {
                            l0$e0 = (e)this.k;
                            O o1 = (O)this.m;
                            f0.n(object0);
                            o0 = o1;
                            goto label_23;
                        }
                        case 2: {
                            l0$e0 = (e)this.k;
                            O o2 = (O)this.m;
                            f0.n(object0);
                            o0 = o2;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    do {
                        do {
                            androidx.compose.animation.core.InfiniteTransition.run.1.1 infiniteTransition$run$1$10 = new Function1(this.o, l0$e0, o0) {
                                final MutableState e;
                                final InfiniteTransition f;
                                final e g;
                                final O h;

                                {
                                    this.e = mutableState0;
                                    this.f = infiniteTransition0;
                                    this.g = l0$e0;
                                    this.h = o0;
                                    super(1);
                                }

                                public final void a(long v) {
                                    State state0 = (State)this.e.getValue();
                                    long v1 = state0 == null ? v : ((Number)state0.getValue()).longValue();
                                    int v2 = 0;
                                    if(this.f.d == 0x8000000000000000L || this.g.a != SuspendAnimationKt.q(this.h.getCoroutineContext())) {
                                        this.f.d = v;
                                        MutableVector mutableVector0 = this.f.b;
                                        int v3 = mutableVector0.J();
                                        if(v3 > 0) {
                                            Object[] arr_object = mutableVector0.F();
                                            int v4 = 0;
                                            while(true) {
                                                ((TransitionAnimationState)arr_object[v4]).o();
                                                ++v4;
                                                if(v4 >= v3) {
                                                    break;
                                                }
                                            }
                                        }
                                        this.g.a = SuspendAnimationKt.q(this.h.getCoroutineContext());
                                    }
                                    if(this.g.a == 0.0f) {
                                        MutableVector mutableVector1 = this.f.b;
                                        int v5 = mutableVector1.J();
                                        if(v5 > 0) {
                                            Object[] arr_object1 = mutableVector1.F();
                                            do {
                                                ((TransitionAnimationState)arr_object1[v2]).u();
                                                ++v2;
                                            }
                                            while(v2 < v5);
                                        }
                                    }
                                    else {
                                        this.f.k(((long)(((float)(v1 - this.f.d)) / this.g.a)));
                                    }
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((Number)object0).longValue());
                                    return S0.a;
                                }
                            };
                            this.m = o0;
                            this.k = l0$e0;
                            this.l = 1;
                            if(InfiniteAnimationPolicyKt.c(infiniteTransition$run$1$10, this) == object1) {
                                return object1;
                            }
                        label_23:
                        }
                        while(l0$e0.a != 0.0f);
                        i i0 = SnapshotStateKt.v(new a() {
                            final O e;

                            {
                                this.e = o0;
                                super(0);
                            }

                            @l
                            public final Float b() {
                                return SuspendAnimationKt.q(this.e.getCoroutineContext());
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return this.b();
                            }
                        });
                        androidx.compose.animation.core.InfiniteTransition.run.1.3 infiniteTransition$run$1$30 = new o() {
                            int k;
                            float l;

                            {
                                super(2, d0);
                            }

                            @m
                            public final Object a(float f, @m d d0) {
                                return ((androidx.compose.animation.core.InfiniteTransition.run.1.3)this.create(f, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.animation.core.InfiniteTransition.run.1.3(d0);
                                d1.l = ((Number)object0).floatValue();
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.a(((Number)object0).floatValue(), ((d)object1));
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                return this.l > 0.0f ? kotlin.coroutines.jvm.internal.b.a(true) : kotlin.coroutines.jvm.internal.b.a(false);
                            }
                        };
                        this.m = o0;
                        this.k = l0$e0;
                        this.l = 2;
                    }
                    while(k.u0(i0, infiniteTransition$run$1$30, this) != object1);
                    return object1;
                }
            }, composer1, 72);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v) {
                final InfiniteTransition e;
                final int f;

                {
                    this.e = infiniteTransition0;
                    this.f = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.m(composer0, this.f | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private final void n(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    private final void o(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }
}

