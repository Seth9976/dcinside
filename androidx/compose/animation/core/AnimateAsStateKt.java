package androidx.compose.animation.core;

import A3.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.channels.p;
import y4.l;
import y4.m;

@s0({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,584:1\n36#2:585\n25#2:592\n25#2:599\n25#2:606\n25#2:613\n25#2:620\n1057#3,6:586\n1057#3,6:593\n1057#3,6:600\n1057#3,6:607\n1057#3,6:614\n1057#3,6:621\n76#4:627\n76#4:628\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n72#1:585\n394#1:592\n400#1:599\n401#1:606\n414#1:613\n573#1:620\n72#1:586,6\n394#1:593,6\n400#1:600,6\n401#1:607,6\n414#1:614,6\n573#1:621,6\n402#1:627\n403#1:628\n*E\n"})
public final class AnimateAsStateKt {
    @l
    private static final SpringSpec a;
    @l
    private static final SpringSpec b;
    @l
    private static final SpringSpec c;
    @l
    private static final SpringSpec d;
    @l
    private static final SpringSpec e;
    @l
    private static final SpringSpec f;
    @l
    private static final SpringSpec g;
    @l
    private static final SpringSpec h;

    static {
        AnimateAsStateKt.a = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
        AnimateAsStateKt.b = AnimationSpecKt.o(0.0f, 0.0f, Dp.d(VisibilityThresholdsKt.a(Dp.b)), 3, null);
        AnimateAsStateKt.c = AnimationSpecKt.o(0.0f, 0.0f, Size.c(VisibilityThresholdsKt.d(Size.b)), 3, null);
        AnimateAsStateKt.d = AnimationSpecKt.o(0.0f, 0.0f, Offset.d(VisibilityThresholdsKt.c(Offset.b)), 3, null);
        AnimateAsStateKt.e = AnimationSpecKt.o(0.0f, 0.0f, VisibilityThresholdsKt.h(Rect.e), 3, null);
        AnimateAsStateKt.f = AnimationSpecKt.o(0.0f, 0.0f, VisibilityThresholdsKt.b(J.a), 3, null);
        AnimateAsStateKt.g = AnimationSpecKt.o(0.0f, 0.0f, IntOffset.b(VisibilityThresholdsKt.f(IntOffset.b)), 3, null);
        AnimateAsStateKt.h = AnimationSpecKt.o(0.0f, 0.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 3, null);
    }

    @Composable
    @l
    public static final State c(float f, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v, int v1) {
        composer0.V(-1407150062);
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.b;
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1407150062, v, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:108)");
        }
        State state0 = AnimateAsStateKt.s(Dp.d(f), VectorConvertersKt.e(Dp.b), animationSpec1, null, ((v1 & 4) == 0 ? s : "DpAnimation"), ((v1 & 8) == 0 ? function10 : null), composer0, v & 14 | v << 3 & 0x380 | 0xE000 & v << 6 | v << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State d(float f, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v, int v1) {
        composer0.V(704104481);
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.b;
        }
        if((v1 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(704104481, v, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:458)");
        }
        State state0 = AnimateAsStateKt.s(Dp.d(f), VectorConvertersKt.e(Dp.b), animationSpec0, null, null, function10, composer0, v & 14 | v << 3 & 0x380 | v << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State e(float f, @m AnimationSpec animationSpec0, float f1, @m String s, @m Function1 function10, @m Composer composer0, int v, int v1) {
        composer0.V(668842840);
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.a;
        float f2 = (v1 & 4) == 0 ? f1 : 0.01f;
        if(ComposerKt.g0()) {
            ComposerKt.w0(668842840, v, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:62)");
        }
        composer0.V(0x3226A5FE);
        if(animationSpec1 == AnimateAsStateKt.a) {
            composer0.V(0x44FAF204);
            boolean z = composer0.t(f2);
            SpringSpec springSpec0 = composer0.W();
            if(z || springSpec0 == Composer.a.a()) {
                springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, f2, 3, null);
                composer0.O(springSpec0);
            }
            composer0.g0();
            animationSpec1 = springSpec0;
        }
        composer0.g0();
        State state0 = AnimateAsStateKt.s(f, VectorConvertersKt.i(A.a), animationSpec1, f2, ((v1 & 8) == 0 ? s : "FloatAnimation"), ((v1 & 16) == 0 ? function10 : null), composer0, v << 3 & 0x1C00 | v & 14 | 0xE000 & v << 3 | v << 3 & 0x70000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State f(float f, AnimationSpec animationSpec0, float f1, Function1 function10, Composer composer0, int v, int v1) {
        composer0.V(1091643291);
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.a;
        }
        if((v1 & 8) != 0) {
            function10 = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(1091643291, v, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:441)");
        }
        State state0 = AnimateAsStateKt.e(f, animationSpec0, ((v1 & 4) == 0 ? f1 : 0.01f), null, function10, composer0, v & 0x3FE | v << 3 & 0xE000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State g(int v, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v1, int v2) {
        composer0.V(428074472);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.f;
        if(ComposerKt.g0()) {
            ComposerKt.w0(428074472, v1, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:268)");
        }
        State state0 = AnimateAsStateKt.s(v, VectorConvertersKt.j(J.a), animationSpec1, null, ((v2 & 4) == 0 ? s : "IntAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State h(int v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        composer0.V(0xCDC6BF0B);
        if((v2 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.f;
        }
        if((v2 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xCDC6BF0B, v1, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:524)");
        }
        State state0 = AnimateAsStateKt.s(v, VectorConvertersKt.j(J.a), animationSpec0, null, null, function10, composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State i(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        composer0.V(1010307371);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.g;
        if(ComposerKt.g0()) {
            ComposerKt.w0(1010307371, v1, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:539)");
        }
        State state0 = AnimateAsStateKt.s(IntOffset.b(v), VectorConvertersKt.g(IntOffset.b), animationSpec1, null, null, ((v2 & 4) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State j(long v, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v1, int v2) {
        composer0.V(0xD677EFC8);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.g;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xD677EFC8, v1, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:308)");
        }
        State state0 = AnimateAsStateKt.s(IntOffset.b(v), VectorConvertersKt.g(IntOffset.b), animationSpec1, null, ((v2 & 4) == 0 ? s : "IntOffsetAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State k(long v, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v1, int v2) {
        composer0.V(0x22B968C8);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.h;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x22B968C8, v1, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:346)");
        }
        State state0 = AnimateAsStateKt.s(IntSize.b(v), VectorConvertersKt.h(IntSize.b), animationSpec1, null, ((v2 & 4) == 0 ? s : "IntSizeAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State l(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        composer0.V(0x97BCB82B);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.h;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x97BCB82B, v1, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:554)");
        }
        State state0 = AnimateAsStateKt.s(IntSize.b(v), VectorConvertersKt.h(IntSize.b), animationSpec1, null, null, ((v2 & 4) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State m(long v, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v1, int v2) {
        composer0.V(357896800);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.d;
        if(ComposerKt.g0()) {
            ComposerKt.w0(357896800, v1, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:189)");
        }
        State state0 = AnimateAsStateKt.s(Offset.d(v), VectorConvertersKt.b(Offset.b), animationSpec1, null, ((v2 & 4) == 0 ? s : "OffsetAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State n(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        composer0.V(0xE4CA2993);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.d;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE4CA2993, v1, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:494)");
        }
        State state0 = AnimateAsStateKt.s(Offset.d(v), VectorConvertersKt.b(Offset.b), animationSpec1, null, null, ((v2 & 4) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State o(@l Rect rect0, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v, int v1) {
        L.p(rect0, "targetValue");
        composer0.V(0x1FF3AC02);
        AnimationSpec animationSpec1 = (v1 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.e;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1FF3AC02, v, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:230)");
        }
        State state0 = AnimateAsStateKt.s(rect0, VectorConvertersKt.c(Rect.e), animationSpec1, null, ((v1 & 4) == 0 ? s : "RectAnimation"), ((v1 & 8) == 0 ? function10 : null), composer0, v & 14 | v << 3 & 0x380 | 0xE000 & v << 6 | v << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State p(Rect rect0, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v, int v1) {
        L.p(rect0, "targetValue");
        composer0.V(0xD15A4231);
        if((v1 & 2) != 0) {
            animationSpec0 = AnimateAsStateKt.e;
        }
        if((v1 & 4) != 0) {
            function10 = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xD15A4231, v, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:509)");
        }
        State state0 = AnimateAsStateKt.s(rect0, VectorConvertersKt.c(Rect.e), animationSpec0, null, null, function10, composer0, v & 14 | v << 3 & 0x380 | v << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State q(long v, AnimationSpec animationSpec0, Function1 function10, Composer composer0, int v1, int v2) {
        composer0.V(0x342AAEB7);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.c;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x342AAEB7, v1, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:476)");
        }
        State state0 = AnimateAsStateKt.s(Size.c(v), VectorConvertersKt.d(Size.b), animationSpec1, null, null, ((v2 & 4) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | v1 << 9 & 0x70000, 24);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State r(long v, @m AnimationSpec animationSpec0, @m String s, @m Function1 function10, @m Composer composer0, int v1, int v2) {
        composer0.V(0x51EF3CBC);
        AnimationSpec animationSpec1 = (v2 & 2) == 0 ? animationSpec0 : AnimateAsStateKt.c;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x51EF3CBC, v1, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:149)");
        }
        State state0 = AnimateAsStateKt.s(Size.c(v), VectorConvertersKt.d(Size.b), animationSpec1, null, ((v2 & 4) == 0 ? s : "SizeAnimation"), ((v2 & 8) == 0 ? function10 : null), composer0, v1 & 14 | v1 << 3 & 0x380 | 0xE000 & v1 << 6 | v1 << 6 & 0x70000, 8);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State s(Object object0, @l TwoWayConverter twoWayConverter0, @m AnimationSpec animationSpec0, @m Object object1, @m String s, @m Function1 function10, @m Composer composer0, int v, int v1) {
        AnimationSpec animationSpec1;
        L.p(twoWayConverter0, "typeConverter");
        composer0.V(0x892044A4);
        if((v1 & 4) == 0) {
            animationSpec1 = animationSpec0;
        }
        else {
            composer0.V(0xE2A708A4);
            SpringSpec springSpec0 = composer0.W();
            if(springSpec0 == Composer.a.a()) {
                springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
                composer0.O(springSpec0);
            }
            composer0.g0();
            animationSpec1 = springSpec0;
        }
        Object object2 = (v1 & 8) == 0 ? object1 : null;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x892044A4, v, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:390)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(mutableState0 == composer$Companion0.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        composer0.V(0xE2A708A4);
        Animatable animatable0 = composer0.W();
        if(animatable0 == composer$Companion0.a()) {
            animatable0 = new Animatable(object0, twoWayConverter0, object2, ((v1 & 16) == 0 ? s : "ValueAnimation"));
            composer0.O(animatable0);
        }
        composer0.g0();
        State state0 = SnapshotStateKt.t(((v1 & 0x20) == 0 ? function10 : null), composer0, v >> 15 & 14);
        if(object2 != null && animationSpec1 instanceof SpringSpec && !L.g(((SpringSpec)animationSpec1).h(), object2)) {
            animationSpec1 = AnimationSpecKt.n(((SpringSpec)animationSpec1).f(), ((SpringSpec)animationSpec1).g(), object2);
        }
        State state1 = SnapshotStateKt.t(animationSpec1, composer0, 0);
        composer0.V(0xE2A708A4);
        kotlinx.coroutines.channels.l l0 = composer0.W();
        if(l0 == composer$Companion0.a()) {
            l0 = o.d(-1, null, null, 6, null);
            composer0.O(l0);
        }
        composer0.g0();
        EffectsKt.k(new a(l0, object0) {
            final kotlinx.coroutines.channels.l e;
            final Object f;

            {
                this.e = l0;
                this.f = object0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.l(this.f);
            }
        }, composer0, 0);
        EffectsKt.g(l0, new A3.o(l0, animatable0, state1, state0, null) {
            Object k;
            int l;
            private Object m;
            final kotlinx.coroutines.channels.l n;
            final Animatable o;
            final State p;
            final State q;

            {
                this.n = l0;
                this.o = animatable0;
                this.p = state0;
                this.q = state1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState.3(this.n, this.o, this.p, this.q, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState.3)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object2;
                n n0;
                O o0;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.m;
                        n0 = this.n.iterator();
                        goto label_15;
                    }
                    case 1: {
                        n0 = (n)this.k;
                        o0 = (O)this.m;
                        f0.n(object0);
                        object2 = object0;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                while(((Boolean)object2).booleanValue()) {
                    Object object3 = n0.next();
                    Object object4 = p.h(this.n.v());
                    kotlinx.coroutines.k.f(o0, null, null, new A3.o(this.o, this.p, this.q, null) {
                        int k;
                        final Object l;
                        final Animatable m;
                        final State n;
                        final State o;

                        {
                            this.l = object0;
                            this.m = animatable0;
                            this.n = state0;
                            this.o = state1;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState.3.1(this.l, this.m, this.n, this.o, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.animation.core.AnimateAsStateKt.animateValueAsState.3.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    Object object2 = this.m.r();
                                    if(!L.g(this.l, object2)) {
                                        AnimationSpec animationSpec0 = AnimateAsStateKt.v(this.n);
                                        this.k = 1;
                                        if(Animatable.i(this.m, this.l, animationSpec0, null, null, this, 12, null) == object1) {
                                            return object1;
                                        }
                                        goto label_11;
                                    }
                                    break;
                                }
                                case 1: {
                                    f0.n(object0);
                                label_11:
                                    Function1 function10 = AnimateAsStateKt.u(this.o);
                                    if(function10 != null) {
                                        function10.invoke(this.m.u());
                                    }
                                    break;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            return S0.a;
                        }
                    }, 3, null);
                label_15:
                    this.m = o0;
                    this.k = n0;
                    this.l = 1;
                    object2 = n0.b(this);
                    if(object2 != object1) {
                        continue;
                    }
                    return object1;
                }
                return S0.a;
            }
        }, composer0, 72);
        State state2 = (State)mutableState0.getValue();
        if(state2 == null) {
            state2 = animatable0.j();
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state2;
    }

    @Composable
    @k(level = kotlin.m.c, message = "animate*AsState APIs now have a new label parameter added.")
    public static final State t(Object object0, TwoWayConverter twoWayConverter0, AnimationSpec animationSpec0, Object object1, Function1 function10, Composer composer0, int v, int v1) {
        AnimationSpec animationSpec1;
        L.p(twoWayConverter0, "typeConverter");
        composer0.V(0xCD8D3BCF);
        if((v1 & 4) == 0) {
            animationSpec1 = animationSpec0;
        }
        else {
            composer0.V(0xE2A708A4);
            SpringSpec springSpec0 = composer0.W();
            if(springSpec0 == Composer.a.a()) {
                springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
                composer0.O(springSpec0);
            }
            composer0.g0();
            animationSpec1 = springSpec0;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xCD8D3BCF, v, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:569)");
        }
        State state0 = AnimateAsStateKt.s(object0, twoWayConverter0, animationSpec1, ((v1 & 8) == 0 ? object1 : null), "ValueAnimation", ((v1 & 16) == 0 ? function10 : null), composer0, (v & 8) << 9 | (v & 8 | 0x6000 | v & 14 | v & 0x70 | v & 0x380) | v & 0x1C00 | v << 3 & 0x70000, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    private static final Function1 u(State state0) {
        return (Function1)state0.getValue();
    }

    private static final AnimationSpec v(State state0) {
        return (AnimationSpec)state0.getValue();
    }
}

