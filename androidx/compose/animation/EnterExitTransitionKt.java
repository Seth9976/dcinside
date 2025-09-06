package androidx.compose.animation;

import A3.p;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition.DeferredAnimation;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.J;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n36#2:1188\n25#2:1195\n25#2:1208\n67#2,3:1231\n66#2:1234\n36#2:1241\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n1057#3,6:1209\n1057#3,6:1235\n1057#3,6:1242\n939#4:1202\n857#4,5:1203\n939#4:1215\n857#4,5:1216\n852#4,10:1221\n76#5:1248\n102#5,2:1249\n76#5:1251\n102#5,2:1252\n76#5:1254\n76#5:1255\n76#5:1256\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n846#1:1181\n847#1:1188\n871#1:1195\n894#1:1208\n923#1:1231,3\n923#1:1234\n930#1:1241\n846#1:1182,6\n847#1:1189,6\n871#1:1196,6\n894#1:1209,6\n923#1:1235,6\n930#1:1242,6\n861#1:1202\n861#1:1203,5\n884#1:1215\n884#1:1216,5\n910#1:1221,10\n846#1:1248\n846#1:1249,2\n847#1:1251\n847#1:1252,2\n860#1:1254\n884#1:1255\n910#1:1256\n*E\n"})
public final class EnterExitTransitionKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[EnterExitState.values().length];
            try {
                arr_v[EnterExitState.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EnterExitState.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EnterExitState.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private static final TwoWayConverter a;
    @l
    private static final MutableState b;
    @l
    private static final SpringSpec c;
    @l
    private static final SpringSpec d;
    @l
    private static final SpringSpec e;

    static {
        EnterExitTransitionKt.a = VectorConvertersKt.a(EnterExitTransitionKt.TransformOriginVectorConverter.1.e, EnterExitTransitionKt.TransformOriginVectorConverter.2.e);
        EnterExitTransitionKt.b = SnapshotStateKt__SnapshotStateKt.g(1.0f, null, 2, null);
        EnterExitTransitionKt.c = AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        EnterExitTransitionKt.d = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        EnterExitTransitionKt.e = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
    }

    @ExperimentalAnimationApi
    @Stable
    @l
    public static final ExitTransition A(@l FiniteAnimationSpec finiteAnimationSpec0, float f, long v) {
        L.p(finiteAnimationSpec0, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f, v, finiteAnimationSpec0, null), 7, null));
    }

    public static ExitTransition B(FiniteAnimationSpec finiteAnimationSpec0, float f, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            v = 0x3F0000003F000000L;
        }
        return EnterExitTransitionKt.A(finiteAnimationSpec0, f, v);
    }

    private static final Modifier C(Modifier modifier0, Transition transition0, State state0, State state1, String s) {
        return ComposedModifierKt.j(modifier0, null, new p(transition0, state0, state1, s) {
            final Transition e;
            final State f;
            final State g;
            final String h;

            {
                this.e = transition0;
                this.f = state0;
                this.g = state1;
                this.h = s;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                Modifier modifier1;
                Alignment alignment0;
                L.p(modifier0, "$this$composed");
                composer0.V(-140634085);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-140634085, v, -1, "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1033)");
                }
                composer0.V(0x44FAF204);
                boolean z = composer0.t(this.e);
                MutableState mutableState0 = composer0.W();
                if(z || mutableState0 == Composer.a.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                boolean z1 = true;
                if(this.e.h() == this.e.o() && !this.e.t()) {
                    androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1.c(mutableState0, false);
                }
                else if(this.f.getValue() != null || this.g.getValue() != null) {
                    androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1.c(mutableState0, true);
                }
                if(androidx.compose.animation.EnterExitTransitionKt.shrinkExpand.1.b(mutableState0)) {
                    boolean z2 = this.e.m().a(EnterExitState.a, EnterExitState.b);
                    State state0 = this.f;
                    State state1 = this.g;
                    if(z2) {
                        ChangeSize changeSize0 = (ChangeSize)state0.getValue();
                        if(changeSize0 == null) {
                        label_26:
                            ChangeSize changeSize1 = (ChangeSize)state1.getValue();
                            alignment0 = changeSize1 == null ? null : changeSize1.g();
                        }
                        else {
                            alignment0 = changeSize0.g();
                            if(alignment0 == null) {
                                goto label_26;
                            }
                        }
                    }
                    else {
                        ChangeSize changeSize2 = (ChangeSize)state1.getValue();
                        if(changeSize2 == null) {
                        label_36:
                            ChangeSize changeSize3 = (ChangeSize)state0.getValue();
                            alignment0 = changeSize3 == null ? null : changeSize3.g();
                        }
                        else {
                            alignment0 = changeSize2.g();
                            if(alignment0 == null) {
                                goto label_36;
                            }
                        }
                    }
                    State state2 = SnapshotStateKt.t(alignment0, composer0, 0);
                    Transition transition0 = this.e;
                    TwoWayConverter twoWayConverter0 = VectorConvertersKt.h(IntSize.b);
                    String s = this.h;
                    composer0.V(0xE2A708A4);
                    String s1 = composer0.W();
                    Companion composer$Companion0 = Composer.a;
                    if(s1 == composer$Companion0.a()) {
                        s1 = s + " shrink/expand";
                        composer0.O(s1);
                    }
                    composer0.g0();
                    DeferredAnimation transition$DeferredAnimation0 = TransitionKt.l(transition0, twoWayConverter0, s1, composer0, 0x1C0, 0);
                    if(this.e.h() != this.e.o()) {
                        z1 = false;
                    }
                    composer0.a0(0xA36BD748, Boolean.valueOf(z1));
                    Transition transition1 = this.e;
                    TwoWayConverter twoWayConverter1 = VectorConvertersKt.g(IntOffset.b);
                    String s2 = this.h;
                    composer0.V(0xE2A708A4);
                    String s3 = composer0.W();
                    if(s3 == composer$Companion0.a()) {
                        s3 = s2 + " InterruptionHandlingOffset";
                        composer0.O(s3);
                    }
                    composer0.g0();
                    DeferredAnimation transition$DeferredAnimation1 = TransitionKt.l(transition1, twoWayConverter1, s3, composer0, 0x1C0, 0);
                    composer0.f0();
                    State state3 = this.f;
                    State state4 = this.g;
                    composer0.V(0x44FAF204);
                    boolean z3 = composer0.t(this.e);
                    ExpandShrinkModifier expandShrinkModifier0 = composer0.W();
                    if(z3 || expandShrinkModifier0 == composer$Companion0.a()) {
                        expandShrinkModifier0 = new ExpandShrinkModifier(transition$DeferredAnimation0, transition$DeferredAnimation1, state3, state4, state2);
                        composer0.O(expandShrinkModifier0);
                    }
                    composer0.g0();
                    if(this.e.h() == this.e.o()) {
                        expandShrinkModifier0.n(null);
                    }
                    else if(expandShrinkModifier0.b() == null) {
                        Alignment alignment1 = (Alignment)state2.getValue();
                        if(alignment1 == null) {
                            alignment1 = Alignment.a.C();
                        }
                        expandShrinkModifier0.n(alignment1);
                    }
                    ChangeSize changeSize4 = (ChangeSize)this.f.getValue();
                    if(changeSize4 != null && !changeSize4.i()) {
                        modifier1 = Modifier.m0;
                    }
                    else {
                        ChangeSize changeSize5 = (ChangeSize)this.g.getValue();
                        modifier1 = changeSize5 == null || changeSize5.i() ? ClipKt.b(Modifier.m0) : Modifier.m0;
                    }
                    modifier0 = modifier0.r0(modifier1).r0(expandShrinkModifier0);
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier0;
            }

            private static final boolean b(MutableState mutableState0) {
                return ((Boolean)mutableState0.getValue()).booleanValue();
            }

            private static final void c(MutableState mutableState0, boolean z) {
                mutableState0.setValue(Boolean.valueOf(z));
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null);
    }

    @Stable
    @l
    public static final ExitTransition D(@l FiniteAnimationSpec finiteAnimationSpec0, @l Horizontal alignment$Horizontal0, boolean z, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(alignment$Horizontal0, "shrinkTowards");
        L.p(function10, "targetWidth");
        return EnterExitTransitionKt.F(finiteAnimationSpec0, EnterExitTransitionKt.W(alignment$Horizontal0), z, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntSizeKt.a(((Number)this.e.invoke(((int)(v >> 0x20)))).intValue(), ((int)(v & 0xFFFFFFFFL)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static ExitTransition E(FiniteAnimationSpec finiteAnimationSpec0, Horizontal alignment$Horizontal0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Horizontal0 = Alignment.a.s();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1.e;
        }
        return EnterExitTransitionKt.D(finiteAnimationSpec0, alignment$Horizontal0, z, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1.e = new androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @Stable
    @l
    public static final ExitTransition F(@l FiniteAnimationSpec finiteAnimationSpec0, @l Alignment alignment0, boolean z, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(alignment0, "shrinkTowards");
        L.p(function10, "targetSize");
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment0, function10, finiteAnimationSpec0, z), null, 11, null));
    }

    public static ExitTransition G(FiniteAnimationSpec finiteAnimationSpec0, Alignment alignment0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.a.e();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1.e;
        }
        return EnterExitTransitionKt.F(finiteAnimationSpec0, alignment0, z, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1.e = new androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.shrinkOut.1() {
                super(1);
            }

            // 去混淆评级： 低(20)
            public final long a(long v) {
                return 0L;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        }

    }

    @Stable
    @l
    public static final ExitTransition H(@l FiniteAnimationSpec finiteAnimationSpec0, @l Vertical alignment$Vertical0, boolean z, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(alignment$Vertical0, "shrinkTowards");
        L.p(function10, "targetHeight");
        return EnterExitTransitionKt.F(finiteAnimationSpec0, EnterExitTransitionKt.X(alignment$Vertical0), z, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntSizeKt.a(((int)(v >> 0x20)), ((Number)this.e.invoke(((int)(v & 0xFFFFFFFFL)))).intValue());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static ExitTransition I(FiniteAnimationSpec finiteAnimationSpec0, Vertical alignment$Vertical0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Vertical0 = Alignment.a.a();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1.e;
        }
        return EnterExitTransitionKt.H(finiteAnimationSpec0, alignment$Vertical0, z, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1.e = new androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.shrinkVertically.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @Stable
    @l
    public static final EnterTransition J(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "initialOffset");
        return new EnterTransitionImpl(new TransitionData(null, new Slide(function10, finiteAnimationSpec0), null, null, 13, null));
    }

    public static EnterTransition K(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        return EnterExitTransitionKt.J(finiteAnimationSpec0, function10);
    }

    @Stable
    @l
    public static final EnterTransition L(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "initialOffsetX");
        return EnterExitTransitionKt.J(finiteAnimationSpec0, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntOffsetKt.a(((Number)this.e.invoke(((int)(v >> 0x20)))).intValue(), 0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntOffset.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static EnterTransition M(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        if((v & 2) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1.e;
        }
        return EnterExitTransitionKt.L(finiteAnimationSpec0, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1.e = new androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.slideInHorizontally.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return (int)(-v / 2);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    private static final Modifier N(Modifier modifier0, Transition transition0, State state0, State state1, String s) {
        return ComposedModifierKt.j(modifier0, null, new p(transition0, state0, state1, s) {
            final Transition e;
            final State f;
            final State g;
            final String h;

            {
                this.e = transition0;
                this.f = state0;
                this.g = state1;
                this.h = s;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x970ADD0);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x970ADD0, v, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:951)");
                }
                composer0.V(0x44FAF204);
                boolean z = composer0.t(this.e);
                MutableState mutableState0 = composer0.W();
                if(z || mutableState0 == Composer.a.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                if(this.e.h() == this.e.o() && !this.e.t()) {
                    androidx.compose.animation.EnterExitTransitionKt.slideInOut.1.c(mutableState0, false);
                }
                else if(this.f.getValue() != null || this.g.getValue() != null) {
                    androidx.compose.animation.EnterExitTransitionKt.slideInOut.1.c(mutableState0, true);
                }
                if(androidx.compose.animation.EnterExitTransitionKt.slideInOut.1.b(mutableState0)) {
                    Transition transition0 = this.e;
                    TwoWayConverter twoWayConverter0 = VectorConvertersKt.g(IntOffset.b);
                    String s = this.h;
                    composer0.V(0xE2A708A4);
                    String s1 = composer0.W();
                    Companion composer$Companion0 = Composer.a;
                    if(s1 == composer$Companion0.a()) {
                        s1 = s + " slide";
                        composer0.O(s1);
                    }
                    composer0.g0();
                    DeferredAnimation transition$DeferredAnimation0 = TransitionKt.l(transition0, twoWayConverter0, s1, composer0, 0x1C0, 0);
                    State state0 = this.f;
                    State state1 = this.g;
                    composer0.V(0x44FAF204);
                    boolean z1 = composer0.t(this.e);
                    SlideModifier slideModifier0 = composer0.W();
                    if(z1 || slideModifier0 == composer$Companion0.a()) {
                        slideModifier0 = new SlideModifier(transition$DeferredAnimation0, state0, state1);
                        composer0.O(slideModifier0);
                    }
                    composer0.g0();
                    modifier0 = modifier0.r0(slideModifier0);
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier0;
            }

            private static final boolean b(MutableState mutableState0) {
                return ((Boolean)mutableState0.getValue()).booleanValue();
            }

            private static final void c(MutableState mutableState0, boolean z) {
                mutableState0.setValue(Boolean.valueOf(z));
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null);
    }

    @Stable
    @l
    public static final EnterTransition O(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "initialOffsetY");
        return EnterExitTransitionKt.J(finiteAnimationSpec0, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntOffsetKt.a(0, ((Number)this.e.invoke(((int)(v & 0xFFFFFFFFL)))).intValue());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntOffset.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static EnterTransition P(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        if((v & 2) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1.e;
        }
        return EnterExitTransitionKt.O(finiteAnimationSpec0, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1.e = new androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.slideInVertically.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return (int)(-v / 2);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @Stable
    @l
    public static final ExitTransition Q(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "targetOffset");
        return new ExitTransitionImpl(new TransitionData(null, new Slide(function10, finiteAnimationSpec0), null, null, 13, null));
    }

    public static ExitTransition R(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        return EnterExitTransitionKt.Q(finiteAnimationSpec0, function10);
    }

    @Stable
    @l
    public static final ExitTransition S(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "targetOffsetX");
        return EnterExitTransitionKt.Q(finiteAnimationSpec0, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntOffsetKt.a(((Number)this.e.invoke(((int)(v >> 0x20)))).intValue(), 0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntOffset.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static ExitTransition T(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        if((v & 2) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1.e;
        }
        return EnterExitTransitionKt.S(finiteAnimationSpec0, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1.e = new androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.slideOutHorizontally.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return (int)(-v / 2);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @Stable
    @l
    public static final ExitTransition U(@l FiniteAnimationSpec finiteAnimationSpec0, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(function10, "targetOffsetY");
        return EnterExitTransitionKt.Q(finiteAnimationSpec0, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntOffsetKt.a(0, ((Number)this.e.invoke(((int)(v & 0xFFFFFFFFL)))).intValue());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntOffset.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static ExitTransition V(FiniteAnimationSpec finiteAnimationSpec0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 1, null);
        }
        if((v & 2) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1.e;
        }
        return EnterExitTransitionKt.U(finiteAnimationSpec0, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1.e = new androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.slideOutVertically.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return (int)(-v / 2);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    private static final Alignment W(Horizontal alignment$Horizontal0) {
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.a;
        if(L.g(alignment$Horizontal0, alignment$Companion0.u())) {
            return alignment$Companion0.o();
        }
        return L.g(alignment$Horizontal0, alignment$Companion0.s()) ? alignment$Companion0.k() : alignment$Companion0.i();
    }

    private static final Alignment X(Vertical alignment$Vertical0) {
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.a;
        if(L.g(alignment$Vertical0, alignment$Companion0.w())) {
            return alignment$Companion0.y();
        }
        return L.g(alignment$Vertical0, alignment$Companion0.a()) ? alignment$Companion0.c() : alignment$Companion0.i();
    }

    @Composable
    @l
    public static final Modifier g(@l Transition transition0, @l EnterTransition enterTransition0, @l ExitTransition exitTransition0, @l String s, @m Composer composer0, int v) {
        TransformOrigin transformOrigin1;
        TransformOrigin transformOrigin0;
        float f3;
        State state2;
        int v2;
        MutableState mutableState3;
        float f2;
        int v1;
        MutableState mutableState2;
        float f1;
        L.p(transition0, "<this>");
        L.p(enterTransition0, "enter");
        L.p(exitTransition0, "exit");
        L.p(s, "label");
        composer0.V(914000546);
        if(ComposerKt.g0()) {
            ComposerKt.w0(914000546, v, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:820)");
        }
        State state0 = SnapshotStateKt.t(enterTransition0.b().j(), composer0, 0);
        State state1 = SnapshotStateKt.t(exitTransition0.b().j(), composer0, 0);
        Modifier modifier0 = EnterExitTransitionKt.C(EnterExitTransitionKt.N(Modifier.m0, transition0, state0, state1, s), transition0, SnapshotStateKt.t(enterTransition0.b().g(), composer0, 0), SnapshotStateKt.t(exitTransition0.b().g(), composer0, 0), s);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(transition0);
        MutableState mutableState0 = composer0.W();
        if(z || mutableState0 == Composer.a.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        composer0.V(0x44FAF204);
        boolean z1 = composer0.t(transition0);
        MutableState mutableState1 = composer0.W();
        if(z1 || mutableState1 == Composer.a.a()) {
            mutableState1 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
            composer0.O(mutableState1);
        }
        composer0.g0();
        if(transition0.h() != transition0.o() || transition0.t()) {
            if(enterTransition0.b().h() != null || exitTransition0.b().h() != null) {
                EnterExitTransitionKt.k(mutableState0, true);
            }
            if(enterTransition0.b().i() != null || exitTransition0.b().i() != null) {
                EnterExitTransitionKt.m(mutableState1, true);
            }
        }
        else {
            EnterExitTransitionKt.k(mutableState0, false);
            EnterExitTransitionKt.m(mutableState1, false);
        }
        composer0.V(0x62C77FD9);
        float f = 1.0f;
        if(EnterExitTransitionKt.h(mutableState0)) {
            androidx.compose.animation.EnterExitTransitionKt.createModifier.alpha.2 enterExitTransitionKt$createModifier$alpha$20 = new p(enterTransition0, exitTransition0) {
                final EnterTransition e;
                final ExitTransition f;

                {
                    this.e = enterTransition0;
                    this.f = exitTransition0;
                    super(3);
                }

                @Composable
                @l
                public final FiniteAnimationSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                    FiniteAnimationSpec finiteAnimationSpec0;
                    L.p(transition$Segment0, "$this$animateFloat");
                    composer0.V(-57153604);
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(-57153604, v, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:861)");
                    }
                    EnterExitState enterExitState0 = EnterExitState.b;
                    if(transition$Segment0.a(EnterExitState.a, enterExitState0)) {
                        Fade fade0 = this.e.b().h();
                        if(fade0 == null) {
                            finiteAnimationSpec0 = EnterExitTransitionKt.c;
                        }
                        else {
                            finiteAnimationSpec0 = fade0.f();
                            if(finiteAnimationSpec0 == null) {
                                finiteAnimationSpec0 = EnterExitTransitionKt.c;
                            }
                        }
                    }
                    else if(transition$Segment0.a(enterExitState0, EnterExitState.c)) {
                        Fade fade1 = this.f.b().h();
                        if(fade1 == null) {
                            finiteAnimationSpec0 = EnterExitTransitionKt.c;
                        }
                        else {
                            finiteAnimationSpec0 = fade1.f();
                            if(finiteAnimationSpec0 == null) {
                                finiteAnimationSpec0 = EnterExitTransitionKt.c;
                            }
                        }
                    }
                    else {
                        finiteAnimationSpec0 = EnterExitTransitionKt.c;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    composer0.g0();
                    return finiteAnimationSpec0;
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
                }
            };
            composer0.V(0xE2A708A4);
            String s1 = composer0.W();
            if(s1 == Composer.a.a()) {
                s1 = s + " alpha";
                composer0.O(s1);
            }
            composer0.g0();
            composer0.V(0xB03404EB);
            TwoWayConverter twoWayConverter0 = VectorConvertersKt.i(A.a);
            composer0.V(0xF77F2E11);
            EnterExitState enterExitState0 = (EnterExitState)transition0.h();
            composer0.V(0x2D0AE6CE);
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x2D0AE6CE, 0, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)");
            }
            int[] arr_v = WhenMappings.a;
            switch(arr_v[enterExitState0.ordinal()]) {
                case 1: {
                    f1 = 1.0f;
                    break;
                }
                case 2: {
                    Fade fade0 = enterTransition0.b().h();
                    if(fade0 != null) {
                        f1 = fade0.e();
                        break;
                    }
                    f1 = 1.0f;
                    break;
                }
                case 3: {
                    Fade fade1 = exitTransition0.b().h();
                    f1 = fade1 == null ? 1.0f : fade1.e();
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            Float float0 = f1;
            EnterExitState enterExitState1 = (EnterExitState)transition0.o();
            composer0.V(0x2D0AE6CE);
            if(ComposerKt.g0()) {
                mutableState2 = mutableState0;
                v1 = v & 14;
                ComposerKt.w0(0x2D0AE6CE, 0, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)");
            }
            else {
                mutableState2 = mutableState0;
                v1 = v & 14;
            }
            switch(arr_v[enterExitState1.ordinal()]) {
                case 1: {
                    f2 = 1.0f;
                    break;
                }
                case 2: {
                    Fade fade2 = enterTransition0.b().h();
                    if(fade2 != null) {
                        f2 = fade2.e();
                        break;
                    }
                    f2 = 1.0f;
                    break;
                }
                case 3: {
                    Fade fade3 = exitTransition0.b().h();
                    f2 = fade3 == null ? 1.0f : fade3.e();
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            mutableState3 = mutableState1;
            v2 = v1;
            state2 = TransitionKt.m(transition0, float0, f2, ((FiniteAnimationSpec)enterExitTransitionKt$createModifier$alpha$20.invoke(transition0.m(), composer0, 0)), twoWayConverter0, s1, composer0, ((v & 14 | 0x180) & 14 | 0xC00) & 14 | 0x30000);
            composer0.g0();
            composer0.g0();
        }
        else {
            mutableState3 = mutableState1;
            mutableState2 = mutableState0;
            v2 = v & 14;
            state2 = EnterExitTransitionKt.b;
        }
        composer0.g0();
        if(EnterExitTransitionKt.l(mutableState3)) {
            composer0.V(0x62C7835D);
            androidx.compose.animation.EnterExitTransitionKt.createModifier.scale.2 enterExitTransitionKt$createModifier$scale$20 = new p(enterTransition0, exitTransition0) {
                final EnterTransition e;
                final ExitTransition f;

                {
                    this.e = enterTransition0;
                    this.f = exitTransition0;
                    super(3);
                }

                @Composable
                @l
                public final FiniteAnimationSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                    FiniteAnimationSpec finiteAnimationSpec0;
                    L.p(transition$Segment0, "$this$animateFloat");
                    composer0.V(-53984035);
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(-53984035, v, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:884)");
                    }
                    EnterExitState enterExitState0 = EnterExitState.b;
                    if(transition$Segment0.a(EnterExitState.a, enterExitState0)) {
                        Scale scale0 = this.e.b().i();
                        if(scale0 == null) {
                            finiteAnimationSpec0 = EnterExitTransitionKt.c;
                        }
                        else {
                            finiteAnimationSpec0 = scale0.f();
                            if(finiteAnimationSpec0 == null) {
                                finiteAnimationSpec0 = EnterExitTransitionKt.c;
                            }
                        }
                    }
                    else if(transition$Segment0.a(enterExitState0, EnterExitState.c)) {
                        Scale scale1 = this.f.b().i();
                        if(scale1 == null) {
                            finiteAnimationSpec0 = EnterExitTransitionKt.c;
                        }
                        else {
                            finiteAnimationSpec0 = scale1.f();
                            if(finiteAnimationSpec0 == null) {
                                finiteAnimationSpec0 = EnterExitTransitionKt.c;
                            }
                        }
                    }
                    else {
                        finiteAnimationSpec0 = EnterExitTransitionKt.c;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    composer0.g0();
                    return finiteAnimationSpec0;
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
                }
            };
            composer0.V(0xE2A708A4);
            String s2 = composer0.W();
            Companion composer$Companion0 = Composer.a;
            if(s2 == composer$Companion0.a()) {
                s2 = s + " scale";
                composer0.O(s2);
            }
            composer0.g0();
            composer0.V(0xB03404EB);
            TwoWayConverter twoWayConverter1 = VectorConvertersKt.i(A.a);
            composer0.V(0xF77F2E11);
            EnterExitState enterExitState2 = (EnterExitState)transition0.h();
            composer0.V(0xDC77C76F);
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDC77C76F, 0, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)");
            }
            int[] arr_v1 = WhenMappings.a;
            switch(arr_v1[enterExitState2.ordinal()]) {
                case 1: {
                    f3 = 1.0f;
                    break;
                }
                case 2: {
                    Scale scale0 = enterTransition0.b().i();
                    if(scale0 != null) {
                        f3 = scale0.g();
                        break;
                    }
                    f3 = 1.0f;
                    break;
                }
                case 3: {
                    Scale scale1 = exitTransition0.b().i();
                    f3 = scale1 == null ? 1.0f : scale1.g();
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            Float float1 = f3;
            EnterExitState enterExitState3 = (EnterExitState)transition0.o();
            composer0.V(0xDC77C76F);
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDC77C76F, 0, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)");
            }
            switch(arr_v1[enterExitState3.ordinal()]) {
                case 1: {
                    break;
                }
                case 2: {
                    Scale scale2 = enterTransition0.b().i();
                    if(scale2 != null) {
                        f = scale2.g();
                    }
                    break;
                }
                case 3: {
                    Scale scale3 = exitTransition0.b().i();
                    if(scale3 != null) {
                        f = scale3.g();
                    }
                    break;
                }
                default: {
                    throw new J();
                }
            }
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            State state3 = TransitionKt.m(transition0, float1, f, ((FiniteAnimationSpec)enterExitTransitionKt$createModifier$scale$20.invoke(transition0.m(), composer0, 0)), twoWayConverter1, s2, composer0, ((v2 | 0x180) & 14 | 0xC00) & 14 | 0x30000);
            composer0.g0();
            composer0.g0();
            if(transition0.h() == EnterExitState.a) {
                Scale scale4 = enterTransition0.b().i();
                if(scale4 == null) {
                    scale4 = exitTransition0.b().i();
                    transformOrigin0 = scale4 == null ? null : TransformOrigin.b(scale4.h());
                }
                else {
                    transformOrigin0 = TransformOrigin.b(scale4.h());
                }
            }
            else {
                Scale scale5 = exitTransition0.b().i();
                if(scale5 == null) {
                    scale5 = enterTransition0.b().i();
                    transformOrigin0 = scale5 == null ? null : TransformOrigin.b(scale5.h());
                }
                else {
                    transformOrigin0 = TransformOrigin.b(scale5.h());
                }
            }
            TwoWayConverter twoWayConverter2 = EnterExitTransitionKt.a;
            composer0.V(0xF77F2E11);
            androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1 enterExitTransitionKt$createModifier$$inlined$animateValue$10 = androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1.e;
            EnterExitState enterExitState4 = (EnterExitState)transition0.h();
            composer0.V(0xEED2F1DB);
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xEED2F1DB, 0, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)");
            }
            switch(arr_v1[enterExitState4.ordinal()]) {
                case 1: {
                    transformOrigin1 = transformOrigin0;
                    break;
                }
                case 2: {
                    Scale scale6 = enterTransition0.b().i();
                    if(scale6 == null) {
                        scale6 = exitTransition0.b().i();
                        transformOrigin1 = scale6 == null ? null : TransformOrigin.b(scale6.h());
                    }
                    else {
                        transformOrigin1 = TransformOrigin.b(scale6.h());
                    }
                    break;
                }
                case 3: {
                    Scale scale7 = exitTransition0.b().i();
                    if(scale7 == null) {
                        scale7 = enterTransition0.b().i();
                        transformOrigin1 = scale7 == null ? null : TransformOrigin.b(scale7.h());
                    }
                    else {
                        transformOrigin1 = TransformOrigin.b(scale7.h());
                    }
                    break;
                }
                default: {
                    throw new J();
                }
            }
            long v3 = transformOrigin1 == null ? 0x3F0000003F000000L : transformOrigin1.o();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            TransformOrigin transformOrigin2 = TransformOrigin.b(v3);
            EnterExitState enterExitState5 = (EnterExitState)transition0.o();
            composer0.V(0xEED2F1DB);
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xEED2F1DB, 0, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)");
            }
            switch(arr_v1[enterExitState5.ordinal()]) {
                case 1: {
                    break;
                }
                case 2: {
                    Scale scale8 = enterTransition0.b().i();
                    if(scale8 == null) {
                        scale8 = exitTransition0.b().i();
                        transformOrigin0 = scale8 == null ? null : TransformOrigin.b(scale8.h());
                    }
                    else {
                        transformOrigin0 = TransformOrigin.b(scale8.h());
                    }
                    break;
                }
                case 3: {
                    Scale scale9 = exitTransition0.b().i();
                    if(scale9 == null) {
                        scale9 = enterTransition0.b().i();
                        transformOrigin0 = scale9 == null ? null : TransformOrigin.b(scale9.h());
                    }
                    else {
                        transformOrigin0 = TransformOrigin.b(scale9.h());
                    }
                    break;
                }
                default: {
                    throw new J();
                }
            }
            long v4 = transformOrigin0 == null ? 0x3F0000003F000000L : transformOrigin0.o();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            composer0.g0();
            State state4 = TransitionKt.m(transition0, transformOrigin2, TransformOrigin.b(v4), ((FiniteAnimationSpec)enterExitTransitionKt$createModifier$$inlined$animateValue$10.invoke(transition0.m(), composer0, 0)), twoWayConverter2, "TransformOriginInterruptionHandling", composer0, (v2 | 0xC40) & 14 | 0x38000);
            composer0.g0();
            composer0.V(0x607FB4C4);
            boolean z2 = composer0.t(state2);
            boolean z3 = composer0.t(state3);
            boolean z4 = composer0.t(state4);
            androidx.compose.animation.EnterExitTransitionKt.createModifier.1.1 enterExitTransitionKt$createModifier$1$10 = composer0.W();
            if((z2 | z3 | z4) != 0 || enterExitTransitionKt$createModifier$1$10 == composer$Companion0.a()) {
                enterExitTransitionKt$createModifier$1$10 = new Function1(state2, state3, state4) {
                    final State e;
                    final State f;
                    final State g;

                    {
                        this.e = state0;
                        this.f = state1;
                        this.g = state2;
                        super(1);
                    }

                    public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                        L.p(graphicsLayerScope0, "$this$graphicsLayer");
                        graphicsLayerScope0.j(EnterExitTransitionKt.n(this.e));
                        graphicsLayerScope0.R(EnterExitTransitionKt.i(this.f));
                        graphicsLayerScope0.W(EnterExitTransitionKt.i(this.f));
                        graphicsLayerScope0.p0(EnterExitTransitionKt.j(this.g));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((GraphicsLayerScope)object0));
                        return S0.a;
                    }
                };
                composer0.O(enterExitTransitionKt$createModifier$1$10);
            }
            composer0.g0();
            modifier0 = GraphicsLayerModifierKt.a(modifier0, enterExitTransitionKt$createModifier$1$10);
        }
        else if(EnterExitTransitionKt.h(mutableState2)) {
            composer0.V(1657244550);
            composer0.V(0x44FAF204);
            boolean z5 = composer0.t(state2);
            androidx.compose.animation.EnterExitTransitionKt.createModifier.2.1 enterExitTransitionKt$createModifier$2$10 = composer0.W();
            if(z5 || enterExitTransitionKt$createModifier$2$10 == Composer.a.a()) {
                enterExitTransitionKt$createModifier$2$10 = new Function1(state2) {
                    final State e;

                    {
                        this.e = state0;
                        super(1);
                    }

                    public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                        L.p(graphicsLayerScope0, "$this$graphicsLayer");
                        graphicsLayerScope0.j(EnterExitTransitionKt.n(this.e));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((GraphicsLayerScope)object0));
                        return S0.a;
                    }
                };
                composer0.O(enterExitTransitionKt$createModifier$2$10);
            }
            composer0.g0();
            modifier0 = GraphicsLayerModifierKt.a(modifier0, enterExitTransitionKt$createModifier$2$10);
        }
        else {
            composer0.V(0x62C78BE2);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1 extends N implements p {
            public static final androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1.e = new androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1();
            }

            public androidx.compose.animation.EnterExitTransitionKt.createModifier..inlined.animateValue.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0xCA9F45E6);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xCA9F45E6, v, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:851)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return springSpec0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Segment)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    private static final boolean h(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    private static final float i(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    private static final long j(State state0) {
        return ((TransformOrigin)state0.getValue()).o();
    }

    private static final void k(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    private static final boolean l(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    private static final void m(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    private static final float n(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    @Stable
    @l
    public static final EnterTransition o(@l FiniteAnimationSpec finiteAnimationSpec0, @l Horizontal alignment$Horizontal0, boolean z, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(alignment$Horizontal0, "expandFrom");
        L.p(function10, "initialWidth");
        return EnterExitTransitionKt.q(finiteAnimationSpec0, EnterExitTransitionKt.W(alignment$Horizontal0), z, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntSizeKt.a(((Number)this.e.invoke(((int)(v >> 0x20)))).intValue(), ((int)(v & 0xFFFFFFFFL)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static EnterTransition p(FiniteAnimationSpec finiteAnimationSpec0, Horizontal alignment$Horizontal0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Horizontal0 = Alignment.a.s();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1.e;
        }
        return EnterExitTransitionKt.o(finiteAnimationSpec0, alignment$Horizontal0, z, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1.e = new androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.expandHorizontally.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @Stable
    @l
    public static final EnterTransition q(@l FiniteAnimationSpec finiteAnimationSpec0, @l Alignment alignment0, boolean z, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(alignment0, "expandFrom");
        L.p(function10, "initialSize");
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment0, function10, finiteAnimationSpec0, z), null, 11, null));
    }

    public static EnterTransition r(FiniteAnimationSpec finiteAnimationSpec0, Alignment alignment0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
        }
        if((v & 2) != 0) {
            alignment0 = Alignment.a.e();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.expandIn.1.e;
        }
        return EnterExitTransitionKt.q(finiteAnimationSpec0, alignment0, z, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.expandIn.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.expandIn.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.expandIn.1.e = new androidx.compose.animation.EnterExitTransitionKt.expandIn.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.expandIn.1() {
                super(1);
            }

            // 去混淆评级： 低(20)
            public final long a(long v) {
                return 0L;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        }

    }

    @Stable
    @l
    public static final EnterTransition s(@l FiniteAnimationSpec finiteAnimationSpec0, @l Vertical alignment$Vertical0, boolean z, @l Function1 function10) {
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(alignment$Vertical0, "expandFrom");
        L.p(function10, "initialHeight");
        return EnterExitTransitionKt.q(finiteAnimationSpec0, EnterExitTransitionKt.X(alignment$Vertical0), z, new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final long a(long v) {
                return IntSizeKt.a(((int)(v >> 0x20)), ((Number)this.e.invoke(((int)(v & 0xFFFFFFFFL)))).intValue());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return IntSize.b(this.a(((IntSize)object0).q()));
            }
        });
    }

    public static EnterTransition t(FiniteAnimationSpec finiteAnimationSpec0, Vertical alignment$Vertical0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 1, null);
        }
        if((v & 2) != 0) {
            alignment$Vertical0 = Alignment.a.a();
        }
        if((v & 4) != 0) {
            z = true;
        }
        if((v & 8) != 0) {
            function10 = androidx.compose.animation.EnterExitTransitionKt.expandVertically.1.e;
        }
        return EnterExitTransitionKt.s(finiteAnimationSpec0, alignment$Vertical0, z, function10);

        final class androidx.compose.animation.EnterExitTransitionKt.expandVertically.1 extends N implements Function1 {
            public static final androidx.compose.animation.EnterExitTransitionKt.expandVertically.1 e;

            static {
                androidx.compose.animation.EnterExitTransitionKt.expandVertically.1.e = new androidx.compose.animation.EnterExitTransitionKt.expandVertically.1();
            }

            androidx.compose.animation.EnterExitTransitionKt.expandVertically.1() {
                super(1);
            }

            @l
            public final Integer a(int v) {
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }

    }

    @Stable
    @l
    public static final EnterTransition u(@l FiniteAnimationSpec finiteAnimationSpec0, float f) {
        L.p(finiteAnimationSpec0, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec0), null, null, null, 14, null));
    }

    public static EnterTransition v(FiniteAnimationSpec finiteAnimationSpec0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return EnterExitTransitionKt.u(finiteAnimationSpec0, f);
    }

    @Stable
    @l
    public static final ExitTransition w(@l FiniteAnimationSpec finiteAnimationSpec0, float f) {
        L.p(finiteAnimationSpec0, "animationSpec");
        return new ExitTransitionImpl(new TransitionData(new Fade(f, finiteAnimationSpec0), null, null, null, 14, null));
    }

    public static ExitTransition x(FiniteAnimationSpec finiteAnimationSpec0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        }
        if((v & 2) != 0) {
            f = 0.0f;
        }
        return EnterExitTransitionKt.w(finiteAnimationSpec0, f);
    }

    @ExperimentalAnimationApi
    @Stable
    @l
    public static final EnterTransition y(@l FiniteAnimationSpec finiteAnimationSpec0, float f, long v) {
        L.p(finiteAnimationSpec0, "animationSpec");
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f, v, finiteAnimationSpec0, null), 7, null));
    }

    public static EnterTransition z(FiniteAnimationSpec finiteAnimationSpec0, float f, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            v = 0x3F0000003F000000L;
        }
        return EnterExitTransitionKt.y(finiteAnimationSpec0, f, v);
    }
}

