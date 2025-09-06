package androidx.compose.animation;

import A3.o;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.animation.core.e;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;

@ExperimentalAnimationApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n76#2:798\n102#2,2:799\n36#3:784\n36#3:791\n1057#4,6:785\n1057#4,6:792\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentScope\n*L\n478#1:781\n478#1:782,2\n493#1:798\n493#1:799,2\n493#1:784\n505#1:791\n493#1:785,6\n505#1:792,6\n*E\n"})
public final class AnimatedContentScope implements Segment {
    public static final class ChildData implements ParentDataModifier {
        private boolean a;

        public ChildData(boolean z) {
            this.a = z;
        }

        @Override  // androidx.compose.ui.layout.ParentDataModifier
        @l
        public Object E(@l Density density0, @m Object object0) {
            L.p(density0, "<this>");
            return this;
        }

        @Override  // androidx.compose.ui.Modifier$Element
        public boolean H(Function1 function10) {
            return b.b(this, function10);
        }

        @Override  // androidx.compose.ui.Modifier$Element
        public Object P(Object object0, o o0) {
            return b.c(this, object0, o0);
        }

        @Override  // androidx.compose.ui.Modifier$Element
        public Object U(Object object0, o o0) {
            return b.d(this, object0, o0);
        }

        public final boolean a() {
            return this.a;
        }

        @l
        public final ChildData b(boolean z) {
            return new ChildData(z);
        }

        public static ChildData d(ChildData animatedContentScope$ChildData0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = animatedContentScope$ChildData0.a;
            }
            return animatedContentScope$ChildData0.b(z);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ChildData ? this.a == ((ChildData)object0).a : false;
        }

        @Override
        public int hashCode() {
            return this.a ? 1 : 0;
        }

        public final boolean i() {
            return this.a;
        }

        public final void j(boolean z) {
            this.a = z;
        }

        @Override  // androidx.compose.ui.Modifier
        public Modifier r0(Modifier modifier0) {
            return a.a(this, modifier0);
        }

        @Override
        @l
        public String toString() {
            return "ChildData(isTarget=" + this.a + ')';
        }

        @Override  // androidx.compose.ui.Modifier$Element
        public boolean u(Function1 function10) {
            return b.a(this, function10);
        }
    }

    @ExperimentalAnimationApi
    final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        @l
        private final DeferredAnimation a;
        @l
        private final State b;
        final AnimatedContentScope c;

        public SizeModifier(@l DeferredAnimation transition$DeferredAnimation0, @l State state0) {
            L.p(transition$DeferredAnimation0, "sizeAnimation");
            L.p(state0, "sizeTransform");
            this.c = animatedContentScope0;
            super();
            this.a = transition$DeferredAnimation0;
            this.b = state0;
        }

        @l
        public final DeferredAnimation a() {
            return this.a;
        }

        @l
        public final State b() {
            return this.b;
        }

        @Override  // androidx.compose.ui.layout.LayoutModifier
        @l
        public MeasureResult h(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
            L.p(measureScope0, "$this$measure");
            L.p(measurable0, "measurable");
            Placeable placeable0 = measurable0.r1(v);
            androidx.compose.animation.AnimatedContentScope.SizeModifier.measure.size.1 animatedContentScope$SizeModifier$measure$size$10 = new Function1(this) {
                final AnimatedContentScope e;
                final SizeModifier f;

                {
                    this.e = animatedContentScope0;
                    this.f = animatedContentScope$SizeModifier0;
                    super(1);
                }

                @l
                public final FiniteAnimationSpec a(@l Segment transition$Segment0) {
                    L.p(transition$Segment0, "$this$animate");
                    Object object0 = transition$Segment0.c();
                    State state0 = (State)this.e.o().get(object0);
                    long v = state0 == null ? 0L : ((IntSize)state0.getValue()).q();
                    Object object1 = transition$Segment0.b();
                    State state1 = (State)this.e.o().get(object1);
                    long v1 = state1 == null ? 0L : ((IntSize)state1.getValue()).q();
                    SizeTransform sizeTransform0 = (SizeTransform)this.f.b().getValue();
                    if(sizeTransform0 != null) {
                        FiniteAnimationSpec finiteAnimationSpec0 = sizeTransform0.e(v, v1);
                        if(finiteAnimationSpec0 != null) {
                            return finiteAnimationSpec0;
                        }
                    }
                    return AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Segment)object0));
                }
            };
            androidx.compose.animation.AnimatedContentScope.SizeModifier.measure.size.2 animatedContentScope$SizeModifier$measure$size$20 = new Function1() {
                final AnimatedContentScope e;

                {
                    this.e = animatedContentScope0;
                    super(1);
                }

                public final long a(Object object0) {
                    State state0 = (State)this.e.o().get(object0);
                    return state0 == null ? 0L : ((IntSize)state0.getValue()).q();
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return IntSize.b(this.a(object0));
                }
            };
            State state0 = this.a.a(animatedContentScope$SizeModifier$measure$size$10, animatedContentScope$SizeModifier$measure$size$20);
            this.c.s(state0);
            long v1 = this.c.k().a(IntSizeKt.a(placeable0.N1(), placeable0.K1()), ((IntSize)state0.getValue()).q(), LayoutDirection.a);
            return MeasureScope.-CC.p(measureScope0, IntSize.m(((IntSize)state0.getValue()).q()), IntSize.j(((IntSize)state0.getValue()).q()), null, new Function1(v1) {
                final Placeable e;
                final long f;

                {
                    this.e = placeable0;
                    this.f = v;
                    super(1);
                }

                public final void a(@l PlacementScope placeable$PlacementScope0) {
                    L.p(placeable$PlacementScope0, "$this$layout");
                    PlacementScope.r(placeable$PlacementScope0, this.e, this.f, 0.0f, 2, null);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((PlacementScope)object0));
                    return S0.a;
                }
            }, 4, null);
        }
    }

    @Immutable
    @g
    public static final class SlideDirection {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            public final int a() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int b() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int c() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int d() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int e() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int f() [...] // 潜在的解密器
        }

        private final int a;
        @l
        public static final Companion b;
        private static final int c;
        private static final int d;
        private static final int e;
        private static final int f;
        private static final int g;
        private static final int h;

        static {
            SlideDirection.b = new Companion(null);
            SlideDirection.c = 0;
            SlideDirection.d = 1;
            SlideDirection.e = 2;
            SlideDirection.f = 3;
            SlideDirection.g = 4;
            SlideDirection.h = 5;
        }

        private SlideDirection(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final int c() [...] // 潜在的解密器

        public static final int d() [...] // 潜在的解密器

        public static final int e() [...] // 潜在的解密器

        @Override
        public boolean equals(Object object0) {
            return SlideDirection.i(this.a, object0);
        }

        public static final int f() [...] // 潜在的解密器

        public static final SlideDirection g(int v) {
            return new SlideDirection(v);
        }

        public static int h(int v) [...] // Inlined contents

        @Override
        public int hashCode() {
            return this.a;
        }

        public static boolean i(int v, Object object0) {
            return object0 instanceof SlideDirection ? v == ((SlideDirection)object0).m() : false;
        }

        public static final boolean j(int v, int v1) {
            return v == v1;
        }

        public static int k(int v) [...] // Inlined contents

        @l
        public static String l(int v) {
            if(SlideDirection.j(v, SlideDirection.c)) {
                return "Left";
            }
            if(SlideDirection.j(v, SlideDirection.d)) {
                return "Right";
            }
            if(SlideDirection.j(v, SlideDirection.e)) {
                return "Up";
            }
            if(SlideDirection.j(v, SlideDirection.f)) {
                return "Down";
            }
            if(SlideDirection.j(v, SlideDirection.g)) {
                return "Start";
            }
            return SlideDirection.j(v, SlideDirection.h) ? "End" : "Invalid";
        }

        public final int m() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return SlideDirection.l(this.a);
        }
    }

    @l
    private final Transition a;
    @l
    private Alignment b;
    @l
    private LayoutDirection c;
    @l
    private final MutableState d;
    @l
    private final Map e;
    @m
    private State f;
    public static final int g = 8;

    static {
    }

    public AnimatedContentScope(@l Transition transition0, @l Alignment alignment0, @l LayoutDirection layoutDirection0) {
        L.p(transition0, "transition");
        L.p(alignment0, "contentAlignment");
        L.p(layoutDirection0, "layoutDirection");
        super();
        this.a = transition0;
        this.b = alignment0;
        this.c = layoutDirection0;
        this.d = SnapshotStateKt__SnapshotStateKt.g(IntSize.b(0L), null, 2, null);
        this.e = new LinkedHashMap();
    }

    @ExperimentalAnimationApi
    @l
    public final ContentTransform A(@l ContentTransform contentTransform0, @m SizeTransform sizeTransform0) {
        L.p(contentTransform0, "<this>");
        contentTransform0.e(sizeTransform0);
        return contentTransform0;
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public boolean a(Object object0, Object object1) {
        return e.a(this, object0, object1);
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public Object b() {
        return this.a.m().b();
    }

    @Override  // androidx.compose.animation.core.Transition$Segment
    public Object c() {
        return this.a.m().c();
    }

    private final long f(long v, long v1) {
        return this.b.a(v, v1, LayoutDirection.a);
    }

    @Composable
    @l
    public final Modifier g(@l ContentTransform contentTransform0, @m Composer composer0, int v) {
        Modifier modifier2;
        L.p(contentTransform0, "contentTransform");
        composer0.V(0xAF940CE9);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xAF940CE9, v, -1, "androidx.compose.animation.AnimatedContentScope.createSizeAnimationModifier (AnimatedContent.kt:489)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(this);
        MutableState mutableState0 = composer0.W();
        if(z || mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        State state0 = SnapshotStateKt.t(contentTransform0.b(), composer0, 0);
        if(L.g(this.a.h(), this.a.o())) {
            AnimatedContentScope.i(mutableState0, false);
        }
        else if(state0.getValue() != null) {
            AnimatedContentScope.i(mutableState0, true);
        }
        if(AnimatedContentScope.h(mutableState0)) {
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.h(IntSize.b);
            DeferredAnimation transition$DeferredAnimation0 = TransitionKt.l(this.a, twoWayConverter0, null, composer0, 0x40, 2);
            composer0.V(0x44FAF204);
            boolean z1 = composer0.t(transition$DeferredAnimation0);
            Modifier modifier0 = composer0.W();
            if(z1 || modifier0 == Composer.a.a()) {
                SizeTransform sizeTransform0 = (SizeTransform)state0.getValue();
                Modifier modifier1 = sizeTransform0 == null || sizeTransform0.d() ? ClipKt.b(Modifier.m0) : Modifier.m0;
                modifier0 = modifier1.r0(new SizeModifier(this, transition$DeferredAnimation0, state0));
                composer0.O(modifier0);
            }
            composer0.g0();
            modifier2 = modifier0;
        }
        else {
            this.f = null;
            modifier2 = Modifier.m0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier2;
    }

    private static final boolean h(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    private static final void i(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    @m
    public final State j() {
        return this.f;
    }

    @l
    public final Alignment k() {
        return this.b;
    }

    private final long l() {
        State state0 = this.f;
        return state0 == null ? this.n() : ((IntSize)state0.getValue()).q();
    }

    @l
    public final LayoutDirection m() {
        return this.c;
    }

    public final long n() {
        return ((IntSize)this.d.getValue()).q();
    }

    @l
    public final Map o() {
        return this.e;
    }

    @l
    public final Transition p() {
        return this.a;
    }

    // 去混淆评级： 中等(90)
    private final boolean q(int v) {
        return SlideDirection.j(v, 0) || SlideDirection.j(v, 4) && this.c == LayoutDirection.a || SlideDirection.j(v, 5) && this.c == LayoutDirection.b;
    }

    // 去混淆评级： 中等(90)
    private final boolean r(int v) {
        return SlideDirection.j(v, 1) || SlideDirection.j(v, 4) && this.c == LayoutDirection.b || SlideDirection.j(v, 5) && this.c == LayoutDirection.a;
    }

    public final void s(@m State state0) {
        this.f = state0;
    }

    public final void t(@l Alignment alignment0) {
        L.p(alignment0, "<set-?>");
        this.b = alignment0;
    }

    public final void u(@l LayoutDirection layoutDirection0) {
        L.p(layoutDirection0, "<set-?>");
        this.c = layoutDirection0;
    }

    public final void v(long v) {
        IntSize intSize0 = IntSize.b(v);
        this.d.setValue(intSize0);
    }

    @l
    public final EnterTransition w(int v, @l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "initialOffset");
        if(this.q(v)) {
            return EnterExitTransitionKt.L(finiteAnimationSpec0, new Function1(this) {
                final Function1 e;
                final AnimatedContentScope f;

                {
                    this.e = function10;
                    this.f = animatedContentScope0;
                    super(1);
                }

                @l
                public final Integer a(int v) {
                    int v1 = IntSize.m(this.f.l());
                    long v2 = this.f.l();
                    Integer integer0 = (int)(v1 - IntOffset.m(this.f.f(IntSizeKt.a(v, v), v2)));
                    return (Integer)this.e.invoke(integer0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            });
        }
        if(this.r(v)) {
            return EnterExitTransitionKt.L(finiteAnimationSpec0, new Function1(this) {
                final Function1 e;
                final AnimatedContentScope f;

                {
                    this.e = function10;
                    this.f = animatedContentScope0;
                    super(1);
                }

                @l
                public final Integer a(int v) {
                    long v1 = this.f.l();
                    Integer integer0 = (int)(-IntOffset.m(this.f.f(IntSizeKt.a(v, v), v1)) - v);
                    return (Integer)this.e.invoke(integer0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            });
        }
        if(SlideDirection.j(v, 2)) {
            return EnterExitTransitionKt.O(finiteAnimationSpec0, new Function1(this) {
                final Function1 e;
                final AnimatedContentScope f;

                {
                    this.e = function10;
                    this.f = animatedContentScope0;
                    super(1);
                }

                @l
                public final Integer a(int v) {
                    int v1 = IntSize.j(this.f.l());
                    long v2 = this.f.l();
                    Integer integer0 = (int)(v1 - IntOffset.o(this.f.f(IntSizeKt.a(v, v), v2)));
                    return (Integer)this.e.invoke(integer0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            });
        }
        return SlideDirection.j(v, 3) ? EnterExitTransitionKt.O(finiteAnimationSpec0, new Function1(this) {
            final Function1 e;
            final AnimatedContentScope f;

            {
                this.e = function10;
                this.f = animatedContentScope0;
                super(1);
            }

            @l
            public final Integer a(int v) {
                long v1 = this.f.l();
                Integer integer0 = (int)(-IntOffset.o(this.f.f(IntSizeKt.a(v, v), v1)) - v);
                return (Integer)this.e.invoke(integer0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }) : EnterTransition.a.a();
    }

    public static EnterTransition x(AnimatedContentScope animatedContentScope0, int v, FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 0.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 3, null);
        }
        if((v1 & 4) != 0) {
            function10 = androidx.compose.animation.AnimatedContentScope.slideIntoContainer.1.e;
        }
        return animatedContentScope0.w(v, finiteAnimationSpec0, function10);

        final class androidx.compose.animation.AnimatedContentScope.slideIntoContainer.1 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedContentScope.slideIntoContainer.1 e;

            static {
                androidx.compose.animation.AnimatedContentScope.slideIntoContainer.1.e = new androidx.compose.animation.AnimatedContentScope.slideIntoContainer.1();
            }

            androidx.compose.animation.AnimatedContentScope.slideIntoContainer.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return v;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @l
    public final ExitTransition y(int v, @l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "targetOffset");
        if(this.q(v)) {
            return EnterExitTransitionKt.S(finiteAnimationSpec0, new Function1(function10) {
                final AnimatedContentScope e;
                final Function1 f;

                {
                    this.e = animatedContentScope0;
                    this.f = function10;
                    super(1);
                }

                @l
                public final Integer a(int v) {
                    Object object0 = this.e.p().o();
                    State state0 = (State)this.e.o().get(object0);
                    long v1 = state0 == null ? 0L : ((IntSize)state0.getValue()).q();
                    Integer integer0 = (int)(-IntOffset.m(this.e.f(IntSizeKt.a(v, v), v1)) - v);
                    return (Integer)this.f.invoke(integer0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            });
        }
        if(this.r(v)) {
            return EnterExitTransitionKt.S(finiteAnimationSpec0, new Function1(function10) {
                final AnimatedContentScope e;
                final Function1 f;

                {
                    this.e = animatedContentScope0;
                    this.f = function10;
                    super(1);
                }

                @l
                public final Integer a(int v) {
                    Object object0 = this.e.p().o();
                    State state0 = (State)this.e.o().get(object0);
                    long v1 = state0 == null ? 0L : ((IntSize)state0.getValue()).q();
                    Integer integer0 = (int)(((int)(v1 >> 0x20)) - IntOffset.m(this.e.f(IntSizeKt.a(v, v), v1)));
                    return (Integer)this.f.invoke(integer0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            });
        }
        if(SlideDirection.j(v, 2)) {
            return EnterExitTransitionKt.U(finiteAnimationSpec0, new Function1(function10) {
                final AnimatedContentScope e;
                final Function1 f;

                {
                    this.e = animatedContentScope0;
                    this.f = function10;
                    super(1);
                }

                @l
                public final Integer a(int v) {
                    Object object0 = this.e.p().o();
                    State state0 = (State)this.e.o().get(object0);
                    long v1 = state0 == null ? 0L : ((IntSize)state0.getValue()).q();
                    Integer integer0 = (int)(-IntOffset.o(this.e.f(IntSizeKt.a(v, v), v1)) - v);
                    return (Integer)this.f.invoke(integer0);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).intValue());
                }
            });
        }
        return SlideDirection.j(v, 3) ? EnterExitTransitionKt.U(finiteAnimationSpec0, new Function1(function10) {
            final AnimatedContentScope e;
            final Function1 f;

            {
                this.e = animatedContentScope0;
                this.f = function10;
                super(1);
            }

            @l
            public final Integer a(int v) {
                Object object0 = this.e.p().o();
                State state0 = (State)this.e.o().get(object0);
                long v1 = state0 == null ? 0L : ((IntSize)state0.getValue()).q();
                Integer integer0 = (int)(((int)(v1 & 0xFFFFFFFFL)) - IntOffset.o(this.e.f(IntSizeKt.a(v, v), v1)));
                return (Integer)this.f.invoke(integer0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }) : ExitTransition.a.a();
    }

    public static ExitTransition z(AnimatedContentScope animatedContentScope0, int v, FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 0.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 3, null);
        }
        if((v1 & 4) != 0) {
            function10 = androidx.compose.animation.AnimatedContentScope.slideOutOfContainer.1.e;
        }
        return animatedContentScope0.y(v, finiteAnimationSpec0, function10);

        final class androidx.compose.animation.AnimatedContentScope.slideOutOfContainer.1 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedContentScope.slideOutOfContainer.1 e;

            static {
                androidx.compose.animation.AnimatedContentScope.slideOutOfContainer.1.e = new androidx.compose.animation.AnimatedContentScope.slideOutOfContainer.1();
            }

            androidx.compose.animation.AnimatedContentScope.slideOutOfContainer.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return v;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }
}

