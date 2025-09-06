package androidx.compose.animation.core;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.i;

@Stable
@s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n76#2:1165\n102#2,2:1166\n76#2:1168\n102#2,2:1169\n76#2:1171\n102#2,2:1172\n76#2:1174\n1855#3,2:1175\n1855#3,2:1177\n1855#3,2:1179\n1855#3,2:1181\n1855#3,2:1183\n1855#3,2:1192\n36#4:1185\n1057#5,6:1186\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n212#1:1156\n212#1:1157,2\n219#1:1159\n219#1:1160,2\n234#1:1162\n234#1:1163,2\n235#1:1165\n235#1:1166,2\n238#1:1168\n238#1:1169,2\n258#1:1171\n258#1:1172,2\n270#1:1174\n294#1:1175,2\n303#1:1177,2\n364#1:1179,2\n377#1:1181,2\n416#1:1183,2\n453#1:1192,2\n431#1:1185\n431#1:1186,6\n*E\n"})
public final class Transition {
    @InternalAnimationApi
    @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n655#1:1156\n655#1:1157,2\n*E\n"})
    public final class DeferredAnimation {
        public final class DeferredAnimationData implements State {
            @l
            private final TransitionAnimationState a;
            @l
            private Function1 b;
            @l
            private Function1 c;
            final DeferredAnimation d;

            public DeferredAnimationData(@l TransitionAnimationState transition$TransitionAnimationState0, @l Function1 function10, @l Function1 function11) {
                L.p(transition$TransitionAnimationState0, "animation");
                L.p(function10, "transitionSpec");
                L.p(function11, "targetValueByState");
                this.d = transition$DeferredAnimation0;
                super();
                this.a = transition$TransitionAnimationState0;
                this.b = function10;
                this.c = function11;
            }

            @l
            public final TransitionAnimationState b() {
                return this.a;
            }

            @l
            public final Function1 d() {
                return this.c;
            }

            @l
            public final Function1 g() {
                return this.b;
            }

            @Override  // androidx.compose.runtime.State
            public Object getValue() {
                this.k(this.d.d.m());
                return this.a.getValue();
            }

            public final void h(@l Function1 function10) {
                L.p(function10, "<set-?>");
                this.c = function10;
            }

            public final void j(@l Function1 function10) {
                L.p(function10, "<set-?>");
                this.b = function10;
            }

            public final void k(@l Segment transition$Segment0) {
                L.p(transition$Segment0, "segment");
                Object object0 = this.c.invoke(transition$Segment0.b());
                if(this.d.d.t()) {
                    Object object1 = this.c.invoke(transition$Segment0.c());
                    FiniteAnimationSpec finiteAnimationSpec0 = (FiniteAnimationSpec)this.b.invoke(transition$Segment0);
                    this.a.B(object1, object0, finiteAnimationSpec0);
                    return;
                }
                FiniteAnimationSpec finiteAnimationSpec1 = (FiniteAnimationSpec)this.b.invoke(transition$Segment0);
                this.a.C(object0, finiteAnimationSpec1);
            }
        }

        @l
        private final TwoWayConverter a;
        @l
        private final String b;
        @l
        private final MutableState c;
        final Transition d;

        public DeferredAnimation(@l TwoWayConverter twoWayConverter0, @l String s) {
            L.p(twoWayConverter0, "typeConverter");
            L.p(s, "label");
            this.d = transition0;
            super();
            this.a = twoWayConverter0;
            this.b = s;
            this.c = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
        }

        @l
        public final State a(@l Function1 function10, @l Function1 function11) {
            L.p(function10, "transitionSpec");
            L.p(function11, "targetValueByState");
            State state0 = this.b();
            if(state0 == null) {
                Object object0 = function11.invoke(this.d.h());
                Object object1 = function11.invoke(this.d.h());
                AnimationVector animationVector0 = AnimationStateKt.i(this.a, object1);
                state0 = new DeferredAnimationData(this, new TransitionAnimationState(this.d, object0, animationVector0, this.a, this.b), function10, function11);
                this.e(((DeferredAnimationData)state0));
                this.d.d(((DeferredAnimationData)state0).b());
            }
            ((DeferredAnimationData)state0).h(function11);
            ((DeferredAnimationData)state0).j(function10);
            ((DeferredAnimationData)state0).k(this.d.m());
            return state0;
        }

        @m
        public final DeferredAnimationData b() {
            return (DeferredAnimationData)this.c.getValue();
        }

        @l
        public final String c() {
            return this.b;
        }

        @l
        public final TwoWayConverter d() {
            return this.a;
        }

        public final void e(@m DeferredAnimationData transition$DeferredAnimation$DeferredAnimationData0) {
            this.c.setValue(transition$DeferredAnimation$DeferredAnimationData0);
        }

        public final void f() {
            DeferredAnimationData transition$DeferredAnimation$DeferredAnimationData0 = this.b();
            if(transition$DeferredAnimation$DeferredAnimationData0 != null) {
                transition$DeferredAnimation$DeferredAnimationData0.b().B(transition$DeferredAnimation$DeferredAnimationData0.d().invoke(this.d.m().c()), transition$DeferredAnimation$DeferredAnimationData0.d().invoke(this.d.m().b()), ((FiniteAnimationSpec)transition$DeferredAnimation$DeferredAnimationData0.g().invoke(this.d.m())));
            }
        }
    }

    public interface Segment {
        public static final class DefaultImpls {
            @Deprecated
            public static boolean a(@l Segment transition$Segment0, Object object0, Object object1) {
                return e.a(transition$Segment0, object0, object1);
            }
        }

        boolean a(Object arg1, Object arg2);

        Object b();

        Object c();
    }

    static final class SegmentImpl implements Segment {
        private final Object a;
        private final Object b;

        public SegmentImpl(Object object0, Object object1) {
            this.a = object0;
            this.b = object1;
        }

        @Override  // androidx.compose.animation.core.Transition$Segment
        public boolean a(Object object0, Object object1) {
            return e.a(this, object0, object1);
        }

        @Override  // androidx.compose.animation.core.Transition$Segment
        public Object b() {
            return this.b;
        }

        @Override  // androidx.compose.animation.core.Transition$Segment
        public Object c() {
            return this.a;
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean equals(@m Object object0) {
            return object0 instanceof Segment && L.g(this.c(), ((Segment)object0).c()) && L.g(this.b(), ((Segment)object0).b());
        }

        @Override
        public int hashCode() {
            Object object0 = this.c();
            int v = 0;
            int v1 = object0 == null ? 0 : object0.hashCode();
            Object object1 = this.b();
            if(object1 != null) {
                v = object1.hashCode();
            }
            return v1 * 0x1F + v;
        }
    }

    @Stable
    @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n76#2:1165\n102#2,2:1166\n76#2:1168\n102#2,2:1169\n76#2:1171\n102#2,2:1172\n76#2:1174\n102#2,2:1175\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n476#1:1156\n476#1:1157,2\n482#1:1159\n482#1:1160,2\n489#1:1162\n489#1:1163,2\n497#1:1165\n497#1:1166,2\n498#1:1168\n498#1:1169,2\n499#1:1171\n499#1:1172,2\n502#1:1174\n502#1:1175,2\n*E\n"})
    public final class TransitionAnimationState implements State {
        @l
        private final TwoWayConverter a;
        @l
        private final String b;
        @l
        private final MutableState c;
        @l
        private final MutableState d;
        @l
        private final MutableState e;
        @l
        private final MutableState f;
        @l
        private final MutableState g;
        @l
        private final MutableState h;
        @l
        private final MutableState i;
        @l
        private AnimationVector j;
        @l
        private final FiniteAnimationSpec k;
        final Transition l;

        public TransitionAnimationState(Object object0, @l AnimationVector animationVector0, @l TwoWayConverter twoWayConverter0, @l String s) {
            L.p(animationVector0, "initialVelocityVector");
            Object object1;
            L.p(twoWayConverter0, "typeConverter");
            L.p(s, "label");
            this.l = transition0;
            super();
            this.a = twoWayConverter0;
            this.b = s;
            this.c = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            this.d = SnapshotStateKt__SnapshotStateKt.g(AnimationSpecKt.o(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.e = SnapshotStateKt__SnapshotStateKt.g(new TargetBasedAnimation(this.d(), twoWayConverter0, object0, this.m(), animationVector0), null, 2, null);
            this.f = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
            this.g = SnapshotStateKt__SnapshotStateKt.g(0L, null, 2, null);
            this.h = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
            this.i = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
            this.j = animationVector0;
            Float float0 = (Float)VisibilityThresholdsKt.i().get(twoWayConverter0);
            if(float0 == null) {
                object1 = null;
            }
            else {
                float f = float0.floatValue();
                AnimationVector animationVector1 = (AnimationVector)twoWayConverter0.a().invoke(object0);
                int v = animationVector1.b();
                for(int v1 = 0; v1 < v; ++v1) {
                    animationVector1.e(v1, f);
                }
                object1 = this.a.b().invoke(animationVector1);
            }
            this.k = AnimationSpecKt.o(0.0f, 0.0f, object1, 3, null);
        }

        static void A(TransitionAnimationState transition$TransitionAnimationState0, Object object0, boolean z, int v, Object object1) {
            if((v & 1) != 0) {
                object0 = transition$TransitionAnimationState0.getValue();
            }
            if((v & 2) != 0) {
                z = false;
            }
            transition$TransitionAnimationState0.z(object0, z);
        }

        public final void B(Object object0, Object object1, @l FiniteAnimationSpec finiteAnimationSpec0) {
            L.p(finiteAnimationSpec0, "animationSpec");
            this.x(object1);
            this.t(finiteAnimationSpec0);
            if(L.g(this.b().i(), object0) && L.g(this.b().f(), object1)) {
                return;
            }
            TransitionAnimationState.A(this, object0, false, 2, null);
        }

        public final void C(Object object0, @l FiniteAnimationSpec finiteAnimationSpec0) {
            L.p(finiteAnimationSpec0, "animationSpec");
            if(!L.g(this.m(), object0) || this.j()) {
                this.x(object0);
                this.t(finiteAnimationSpec0);
                TransitionAnimationState.A(this, null, !this.o(), 1, null);
                this.u(false);
                this.w(this.l.k());
                this.v(false);
            }
        }

        @l
        public final TargetBasedAnimation b() {
            return (TargetBasedAnimation)this.e.getValue();
        }

        @l
        public final FiniteAnimationSpec d() {
            return (FiniteAnimationSpec)this.d.getValue();
        }

        public final long g() {
            return this.b().c();
        }

        @Override  // androidx.compose.runtime.State
        public Object getValue() {
            return this.i.getValue();
        }

        @l
        public final String h() {
            return this.b;
        }

        private final boolean j() {
            return ((Boolean)this.h.getValue()).booleanValue();
        }

        private final long k() {
            return ((Number)this.g.getValue()).longValue();
        }

        private final Object m() {
            return this.c.getValue();
        }

        @l
        public final TwoWayConverter n() {
            return this.a;
        }

        public final boolean o() {
            return ((Boolean)this.f.getValue()).booleanValue();
        }

        public final void p(long v, float f) {
            long v1;
            if(f > 0.0f) {
                float f1 = ((float)(v - this.k())) / f;
                if(Float.isNaN(f1)) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f + ",playTimeNanos: " + v + ", offsetTimeNanos: " + this.k()).toString());
                }
                v1 = (long)f1;
            }
            else {
                v1 = this.b().c();
            }
            this.y(this.b().e(v1));
            this.j = this.b().g(v1);
            if(this.b().b(v1)) {
                this.u(true);
                this.w(0L);
            }
        }

        public final void q() {
            this.v(true);
        }

        public final void r(long v) {
            this.y(this.b().e(v));
            this.j = this.b().g(v);
        }

        private final void s(TargetBasedAnimation targetBasedAnimation0) {
            this.e.setValue(targetBasedAnimation0);
        }

        private final void t(FiniteAnimationSpec finiteAnimationSpec0) {
            this.d.setValue(finiteAnimationSpec0);
        }

        public final void u(boolean z) {
            this.f.setValue(Boolean.valueOf(z));
        }

        private final void v(boolean z) {
            this.h.setValue(Boolean.valueOf(z));
        }

        private final void w(long v) {
            this.g.setValue(v);
        }

        private final void x(Object object0) {
            this.c.setValue(object0);
        }

        public void y(Object object0) {
            this.i.setValue(object0);
        }

        private final void z(Object object0, boolean z) {
            FiniteAnimationSpec finiteAnimationSpec0;
            if(!z) {
                finiteAnimationSpec0 = this.d();
            }
            else if(this.d() instanceof SpringSpec) {
                finiteAnimationSpec0 = this.d();
            }
            else {
                finiteAnimationSpec0 = this.k;
            }
            Object object1 = this.m();
            this.s(new TargetBasedAnimation(finiteAnimationSpec0, this.a, object0, object1, this.j));
            this.l.v();
        }
    }

    @l
    private final MutableTransitionState a;
    @m
    private final String b;
    @l
    private final MutableState c;
    @l
    private final MutableState d;
    @l
    private final MutableState e;
    @l
    private final MutableState f;
    @l
    private final MutableState g;
    @l
    private final SnapshotStateList h;
    @l
    private final SnapshotStateList i;
    @l
    private final MutableState j;
    private long k;
    @l
    private final State l;
    public static final int m;

    static {
    }

    @b0
    public Transition(@l MutableTransitionState mutableTransitionState0, @m String s) {
        L.p(mutableTransitionState0, "transitionState");
        super();
        this.a = mutableTransitionState0;
        this.b = s;
        this.c = SnapshotStateKt__SnapshotStateKt.g(this.h(), null, 2, null);
        this.d = SnapshotStateKt__SnapshotStateKt.g(new SegmentImpl(this.h(), this.h()), null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.g(0L, null, 2, null);
        this.f = SnapshotStateKt__SnapshotStateKt.g(0x8000000000000000L, null, 2, null);
        this.g = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
        this.h = SnapshotStateKt.f();
        this.i = SnapshotStateKt.f();
        this.j = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        this.l = SnapshotStateKt.c(new a() {
            final Transition e;

            {
                this.e = transition0;
                super(0);
            }

            @l
            public final Long invoke() {
                long v = 0L;
                for(Object object0: this.e.h) {
                    v = Math.max(v, ((TransitionAnimationState)object0).g());
                }
                for(Object object1: this.e.i) {
                    v = Math.max(v, ((Transition)object1).p());
                }
                return v;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    public Transition(MutableTransitionState mutableTransitionState0, String s, int v, w w0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(mutableTransitionState0, s);
    }

    public Transition(Object object0, @m String s) {
        this(new MutableTransitionState(object0), s);
    }

    public final void A(@l TransitionAnimationState transition$TransitionAnimationState0) {
        L.p(transition$TransitionAnimationState0, "animation");
        this.h.remove(transition$TransitionAnimationState0);
    }

    public final boolean B(@l Transition transition0) {
        L.p(transition0, "transition");
        return this.i.remove(transition0);
    }

    @i(name = "seek")
    public final void C(Object object0, Object object1, long v) {
        this.I(0x8000000000000000L);
        this.a.f(false);
        if(!this.t() || !L.g(this.h(), object0) || !L.g(this.o(), object1)) {
            this.D(object0);
            this.J(object1);
            this.G(true);
            this.H(new SegmentImpl(object0, object1));
        }
        for(Object object2: this.i) {
            Transition transition0 = (Transition)object2;
            L.n(transition0, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if(transition0.t()) {
                transition0.C(transition0.h(), transition0.o(), v);
            }
        }
        for(Object object3: this.h) {
            ((TransitionAnimationState)object3).r(v);
        }
        this.k = v;
    }

    public final void D(Object object0) {
        this.a.e(object0);
    }

    public final void E(long v) {
        this.k = v;
    }

    public final void F(long v) {
        this.e.setValue(v);
    }

    public final void G(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    private final void H(Segment transition$Segment0) {
        this.d.setValue(transition$Segment0);
    }

    private final void I(long v) {
        this.f.setValue(v);
    }

    public final void J(Object object0) {
        this.c.setValue(object0);
    }

    public final void K(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    @Composable
    public final void L(Object object0, @m Composer composer0, int v) {
        Composer composer1 = composer0.G(0xDD3140E7);
        int v1 = (v & 14) == 0 ? (composer1.t(object0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(this) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDD3140E7, v, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:399)");
            }
            if(!this.t() && !L.g(this.o(), object0)) {
                this.H(new SegmentImpl(this.o(), object0));
                this.D(this.o());
                this.J(object0);
                if(!this.s()) {
                    this.K(true);
                }
                for(Object object1: this.h) {
                    ((TransitionAnimationState)object1).q();
                }
            }
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, v) {
                final Transition e;
                final Object f;
                final int g;

                {
                    this.e = transition0;
                    this.f = object0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.L(this.f, composer0, this.g | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    public final boolean d(@l TransitionAnimationState transition$TransitionAnimationState0) {
        L.p(transition$TransitionAnimationState0, "animation");
        return this.h.add(transition$TransitionAnimationState0);
    }

    public final boolean e(@l Transition transition0) {
        L.p(transition0, "transition");
        return this.i.add(transition0);
    }

    @Composable
    public final void f(Object object0, @m Composer composer0, int v) {
        Composer composer1 = composer0.G(0xA6F9B301);
        int v1 = (v & 14) == 0 ? (composer1.t(object0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(this) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xA6F9B301, v1, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:424)");
            }
            if(!this.t()) {
                this.L(object0, composer1, v1 & 0x7E);
                if(!L.g(object0, this.h()) || this.s() || this.r()) {
                    composer1.V(0x44FAF204);
                    boolean z = composer1.t(this);
                    androidx.compose.animation.core.Transition.animateTo.1.1 transition$animateTo$1$10 = composer1.W();
                    if(z || transition$animateTo$1$10 == Composer.a.a()) {
                        transition$animateTo$1$10 = new o(null) {
                            int k;
                            private Object l;
                            final Transition m;

                            {
                                this.m = transition0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                d d1 = new androidx.compose.animation.core.Transition.animateTo.1.1(this.m, d0);
                                d1.l = object0;
                                return d1;
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.animation.core.Transition.animateTo.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                O o0;
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        o0 = (O)this.l;
                                        break;
                                    }
                                    case 1: {
                                        o0 = (O)this.l;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                do {
                                    float f = SuspendAnimationKt.q(o0.getCoroutineContext());
                                    androidx.compose.animation.core.Transition.animateTo.1.1.1 transition$animateTo$1$1$10 = new Function1(f) {
                                        final Transition e;
                                        final float f;

                                        {
                                            this.e = transition0;
                                            this.f = f;
                                            super(1);
                                        }

                                        public final void a(long v) {
                                            if(!this.e.t()) {
                                                this.e.w(v, this.f);
                                            }
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((Number)object0).longValue());
                                            return S0.a;
                                        }
                                    };
                                    this.l = o0;
                                    this.k = 1;
                                }
                                while(MonotonicFrameClockKt.f(transition$animateTo$1$1$10, this) != object1);
                                return object1;
                            }
                        };
                        composer1.O(transition$animateTo$1$10);
                    }
                    composer1.g0();
                    EffectsKt.g(this, transition$animateTo$1$10, composer1, v1 >> 3 & 14 | 0x40);
                }
            }
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, v) {
                final Transition e;
                final Object f;
                final int g;

                {
                    this.e = transition0;
                    this.f = object0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    this.e.f(this.f, composer0, this.g | 1);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @l
    public final List g() {
        return this.h;
    }

    public final Object h() {
        return this.a.a();
    }

    @m
    public final String i() {
        return this.b;
    }

    public final long j() {
        return this.k;
    }

    public final long k() {
        return ((Number)this.e.getValue()).longValue();
    }

    @InternalAnimationApi
    public static void l() {
    }

    @l
    public final Segment m() {
        return (Segment)this.d.getValue();
    }

    private final long n() {
        return ((Number)this.f.getValue()).longValue();
    }

    public final Object o() {
        return this.c.getValue();
    }

    public final long p() {
        return ((Number)this.l.getValue()).longValue();
    }

    @l
    public final List q() {
        return this.i;
    }

    public final boolean r() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    public final boolean s() {
        return this.n() != 0x8000000000000000L;
    }

    public final boolean t() {
        return ((Boolean)this.j.getValue()).booleanValue();
    }

    @InternalAnimationApi
    public static void u() {
    }

    private final void v() {
        this.K(true);
        if(this.t()) {
            long v = 0L;
            for(Object object0: this.h) {
                v = Math.max(v, ((TransitionAnimationState)object0).g());
                ((TransitionAnimationState)object0).r(this.k);
            }
            this.K(false);
        }
    }

    public final void w(long v, float f) {
        if(this.n() == 0x8000000000000000L) {
            this.y(v);
        }
        this.K(false);
        this.F(v - this.n());
        boolean z = true;
        for(Object object0: this.h) {
            TransitionAnimationState transition$TransitionAnimationState0 = (TransitionAnimationState)object0;
            if(!transition$TransitionAnimationState0.o()) {
                transition$TransitionAnimationState0.p(this.k(), f);
            }
            if(!transition$TransitionAnimationState0.o()) {
                z = false;
            }
        }
        for(Object object1: this.i) {
            Transition transition0 = (Transition)object1;
            if(!L.g(transition0.o(), transition0.h())) {
                transition0.w(this.k(), f);
            }
            if(!L.g(transition0.o(), transition0.h())) {
                z = false;
            }
        }
        if(z) {
            this.x();
        }
    }

    public final void x() {
        this.I(0x8000000000000000L);
        this.D(this.o());
        this.F(0L);
        this.a.f(false);
    }

    public final void y(long v) {
        this.I(v);
        this.a.f(true);
    }

    public final void z(@l DeferredAnimation transition$DeferredAnimation0) {
        L.p(transition$DeferredAnimation0, "deferredAnimation");
        DeferredAnimationData transition$DeferredAnimation$DeferredAnimationData0 = transition$DeferredAnimation0.b();
        if(transition$DeferredAnimation$DeferredAnimationData0 != null) {
            TransitionAnimationState transition$TransitionAnimationState0 = transition$DeferredAnimation$DeferredAnimationData0.b();
            if(transition$TransitionAnimationState0 != null) {
                this.A(transition$TransitionAnimationState0);
            }
        }
    }
}

