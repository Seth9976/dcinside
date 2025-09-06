package androidx.compose.animation.core;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1155:1\n857#1,5:1228\n857#1,5:1233\n857#1,5:1238\n857#1,5:1243\n857#1,5:1248\n857#1,5:1253\n857#1,5:1258\n857#1,5:1263\n25#2:1156\n36#2:1163\n36#2:1170\n36#2:1177\n36#2:1184\n36#2:1191\n36#2:1198\n50#2:1205\n49#2:1206\n36#2:1213\n50#2:1220\n49#2:1221\n1057#3,6:1157\n1057#3,6:1164\n1057#3,6:1171\n1057#3,6:1178\n1057#3,6:1185\n1057#3,6:1192\n1057#3,6:1199\n1057#3,6:1207\n1057#3,6:1214\n1057#3,6:1222\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n939#1:1228,5\n970#1:1233,5\n1001#1:1238,5\n1032#1:1243,5\n1063#1:1248,5\n1094#1:1253,5\n1124#1:1258,5\n1154#1:1263,5\n71#1:1156\n73#1:1163\n154#1:1170\n158#1:1177\n753#1:1184\n786#1:1191\n799#1:1198\n803#1:1205\n803#1:1206\n873#1:1213\n896#1:1220\n896#1:1221\n71#1:1157,6\n73#1:1164,6\n154#1:1171,6\n158#1:1178,6\n753#1:1185,6\n786#1:1192,6\n799#1:1199,6\n803#1:1207,6\n873#1:1214,6\n896#1:1222,6\n*E\n"})
public final class TransitionKt {
    public static final int a = 1;

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State a(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0xB02CD07);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateDp.1.e;
        }
        if((v1 & 2) != 0) {
            s = "DpAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.e(Dp.b);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateDp.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateDp.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateDp.1.e = new androidx.compose.animation.core.TransitionKt.animateDp.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateDp.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(-575880366);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-575880366, v, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:963)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, Dp.d(VisibilityThresholdsKt.a(Dp.b)), 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State b(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0xB03404EB);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateFloat.1.e;
        }
        if((v1 & 2) != 0) {
            s = "FloatAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.i(A.a);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateFloat$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateFloat.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateFloat.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateFloat.1.e = new androidx.compose.animation.core.TransitionKt.animateFloat.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateFloat.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0xE0E066C0);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xE0E066C0, v, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:934)");
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State c(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0x4E9CDBFE);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateInt.1.e;
        }
        if((v1 & 2) != 0) {
            s = "IntAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.j(J.a);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateInt$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateInt.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateInt.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateInt.1.e = new androidx.compose.animation.core.TransitionKt.animateInt.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateInt.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0xD131AF13);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xD131AF13, v, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:1087)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, 1, 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State d(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0x2E42D4F1);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateIntOffset.1.e;
        }
        if((v1 & 2) != 0) {
            s = "IntOffsetAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.g(IntOffset.b);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateIntOffset.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateIntOffset.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateIntOffset.1.e = new androidx.compose.animation.core.TransitionKt.animateIntOffset.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateIntOffset.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0x8B904446);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x8B904446, v, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:1058)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, IntOffset.b(IntOffsetKt.a(1, 1)), 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State e(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0x8295A09F);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateIntSize.1.e;
        }
        if((v1 & 2) != 0) {
            s = "IntSizeAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.h(IntSize.b);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateIntSize.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateIntSize.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateIntSize.1.e = new androidx.compose.animation.core.TransitionKt.animateIntSize.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateIntSize.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(967893300);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(967893300, v, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:1119)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, IntSize.b(0x100000001L), 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State f(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0x7BE30D0E);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateOffset.1.e;
        }
        if((v1 & 2) != 0) {
            s = "OffsetAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.b(Offset.b);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateOffset$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateOffset.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateOffset.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateOffset.1.e = new androidx.compose.animation.core.TransitionKt.animateOffset.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateOffset.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0x60C2E5D9);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x60C2E5D9, v, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:994)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, Offset.d(VisibilityThresholdsKt.c(Offset.b)), 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State g(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0x592F64DF);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateRect.1.e;
        }
        if((v1 & 2) != 0) {
            s = "RectAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.c(Rect.e);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateRect.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateRect.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateRect.1.e = new androidx.compose.animation.core.TransitionKt.animateRect.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateRect.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0x2934F46A);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x2934F46A, v, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:1149)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, VisibilityThresholdsKt.h(Rect.e), 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State h(@l Transition transition0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p1, "targetValueByState");
        composer0.V(0xD02F3BFC);
        if((v1 & 1) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateSize.1.e;
        }
        if((v1 & 2) != 0) {
            s = "SizeAnimation";
        }
        TwoWayConverter twoWayConverter0 = VectorConvertersKt.d(Size.b);
        int v2 = v & 14 | v << 3 & 0x380 | v << 3 & 0x1C00 | v << 3 & 0xE000;
        composer0.V(0xF77F2E11);
        int v3 = v2 >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v3), p1.invoke(transition0.o(), composer0, v3), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v2 >> 3 & 0x70)))), twoWayConverter0, s, composer0, v2 & 14 | v2 << 6 & 0x70000);
        composer0.g0();
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateSize$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateSize.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateSize.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateSize.1.e = new androidx.compose.animation.core.TransitionKt.animateSize.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateSize.1() {
                super(3);
            }

            @Composable
            @l
            public final SpringSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                L.p(transition$Segment0, "$this$null");
                composer0.V(0xA034CB87);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xA034CB87, v, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:1025)");
                }
                SpringSpec springSpec0 = AnimationSpecKt.o(0.0f, 0.0f, Size.c(VisibilityThresholdsKt.d(Size.b)), 3, null);
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

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    @l
    public static final State i(@l Transition transition0, @l TwoWayConverter twoWayConverter0, @m p p0, @m String s, @l p p1, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(twoWayConverter0, "typeConverter");
        L.p(p1, "targetValueByState");
        composer0.V(0xF77F2E11);
        if((v1 & 2) != 0) {
            p0 = androidx.compose.animation.core.TransitionKt.animateValue.1.e;
        }
        if((v1 & 4) != 0) {
            s = "ValueAnimation";
        }
        int v2 = v >> 9 & 0x70;
        State state0 = TransitionKt.m(transition0, p1.invoke(transition0.h(), composer0, v2), p1.invoke(transition0.o(), composer0, v2), ((FiniteAnimationSpec)p0.invoke(transition0.m(), composer0, ((int)(v >> 3 & 0x70)))), twoWayConverter0, s, composer0, v & 14 | 0xE000 & v << 9 | v << 6 & 0x70000);
        composer0.g0();
        return state0;

        @s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,1155:1\n*E\n"})
        public final class androidx.compose.animation.core.TransitionKt.animateValue.1 extends N implements p {
            public static final androidx.compose.animation.core.TransitionKt.animateValue.1 e;

            static {
                androidx.compose.animation.core.TransitionKt.animateValue.1.e = new androidx.compose.animation.core.TransitionKt.animateValue.1();
            }

            public androidx.compose.animation.core.TransitionKt.animateValue.1() {
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

    @ExperimentalTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @l
    public static final Transition j(@l Transition transition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(p0, "transformToChildState");
        composer0.V(0x48730564);
        if((v1 & 1) != 0) {
            s = "ChildTransition";
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(transition0);
        Object object0 = composer0.W();
        if(z || object0 == Composer.a.a()) {
            object0 = transition0.h();
            composer0.O(object0);
        }
        composer0.g0();
        if(transition0.t()) {
            object0 = transition0.h();
        }
        int v2 = v >> 3 & 0x70;
        Transition transition1 = TransitionKt.k(transition0, p0.invoke(object0, composer0, v2), p0.invoke(transition0.o(), composer0, v2), s, composer0, v & 14 | v << 6 & 0x1C00);
        composer0.g0();
        return transition1;
    }

    @Composable
    @b0
    @l
    public static final Transition k(@l Transition transition0, Object object0, Object object1, @l String s, @m Composer composer0, int v) {
        L.p(transition0, "<this>");
        L.p(s, "childLabel");
        composer0.V(0xF42E10CA);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xF42E10CA, v, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:793)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(transition0);
        Transition transition1 = composer0.W();
        if(z || transition1 == Composer.a.a()) {
            transition1 = new Transition(new MutableTransitionState(object0), transition0.i() + " > " + s);
            composer0.O(transition1);
        }
        composer0.g0();
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(transition0);
        boolean z2 = composer0.t(transition1);
        androidx.compose.animation.core.TransitionKt.createChildTransitionInternal.1.1 transitionKt$createChildTransitionInternal$1$10 = composer0.W();
        if(z1 || z2 || transitionKt$createChildTransitionInternal$1$10 == Composer.a.a()) {
            transitionKt$createChildTransitionInternal$1$10 = new Function1(transition0, transition1) {
                final Transition e;
                final Transition f;

                {
                    this.e = transition0;
                    this.f = transition1;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    this.e.e(this.f);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.f.B(this.b);
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            };
            composer0.O(transitionKt$createChildTransitionInternal$1$10);
        }
        composer0.g0();
        EffectsKt.c(transition1, transitionKt$createChildTransitionInternal$1$10, composer0, 0);
        if(transition0.t()) {
            transition1.C(object0, object1, transition0.j());
        }
        else {
            transition1.L(object1, composer0, v >> 3 & 8 | v >> 6 & 14);
            transition1.G(false);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return transition1;
    }

    @InternalAnimationApi
    @Composable
    @l
    public static final DeferredAnimation l(@l Transition transition0, @l TwoWayConverter twoWayConverter0, @m String s, @m Composer composer0, int v, int v1) {
        L.p(transition0, "<this>");
        L.p(twoWayConverter0, "typeConverter");
        composer0.V(0x99D490E0);
        if((v1 & 2) != 0) {
            s = "DeferredAnimation";
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x99D490E0, v, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:748)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(transition0);
        DeferredAnimation transition$DeferredAnimation0 = composer0.W();
        if(z || transition$DeferredAnimation0 == Composer.a.a()) {
            transition$DeferredAnimation0 = new DeferredAnimation(transition0, twoWayConverter0, s);
            composer0.O(transition$DeferredAnimation0);
        }
        composer0.g0();
        EffectsKt.c(transition$DeferredAnimation0, new Function1(transition0, transition$DeferredAnimation0) {
            final Transition e;
            final DeferredAnimation f;

            {
                this.e = transition0;
                this.f = transition$DeferredAnimation0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.f.z(this.b);
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer0, 0);
        if(transition0.t()) {
            transition$DeferredAnimation0.f();
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return transition$DeferredAnimation0;
    }

    @Composable
    @b0
    @l
    public static final State m(@l Transition transition0, Object object0, Object object1, @l FiniteAnimationSpec finiteAnimationSpec0, @l TwoWayConverter twoWayConverter0, @l String s, @m Composer composer0, int v) {
        L.p(transition0, "<this>");
        L.p(finiteAnimationSpec0, "animationSpec");
        L.p(twoWayConverter0, "typeConverter");
        L.p(s, "label");
        composer0.V(-304821198);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-304821198, v, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:865)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(transition0);
        TransitionAnimationState transition$TransitionAnimationState0 = composer0.W();
        if(z || transition$TransitionAnimationState0 == Composer.a.a()) {
            transition$TransitionAnimationState0 = new TransitionAnimationState(transition0, object0, AnimationStateKt.i(twoWayConverter0, object1), twoWayConverter0, s);
            composer0.O(transition$TransitionAnimationState0);
        }
        composer0.g0();
        if(transition0.t()) {
            transition$TransitionAnimationState0.B(object0, object1, finiteAnimationSpec0);
        }
        else {
            transition$TransitionAnimationState0.C(object1, finiteAnimationSpec0);
        }
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(transition0);
        boolean z2 = composer0.t(transition$TransitionAnimationState0);
        androidx.compose.animation.core.TransitionKt.createTransitionAnimation.1.1 transitionKt$createTransitionAnimation$1$10 = composer0.W();
        if(z1 || z2 || transitionKt$createTransitionAnimation$1$10 == Composer.a.a()) {
            transitionKt$createTransitionAnimation$1$10 = new Function1(transition0, transition$TransitionAnimationState0) {
                final Transition e;
                final TransitionAnimationState f;

                {
                    this.e = transition0;
                    this.f = transition$TransitionAnimationState0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    this.e.d(this.f);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.f.A(this.b);
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            };
            composer0.O(transitionKt$createTransitionAnimation$1$10);
        }
        composer0.g0();
        EffectsKt.c(transition$TransitionAnimationState0, transitionKt$createTransitionAnimation$1$10, composer0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return transition$TransitionAnimationState0;
    }

    @Composable
    @l
    public static final Transition n(@l MutableTransitionState mutableTransitionState0, @m String s, @m Composer composer0, int v, int v1) {
        L.p(mutableTransitionState0, "transitionState");
        composer0.V(0x34A03233);
        if((v1 & 2) != 0) {
            s = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x34A03233, v, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:149)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(mutableTransitionState0);
        Transition transition0 = composer0.W();
        if(z || transition0 == Composer.a.a()) {
            transition0 = new Transition(mutableTransitionState0, s);
            composer0.O(transition0);
        }
        composer0.g0();
        transition0.f(mutableTransitionState0.b(), composer0, 0);
        composer0.V(0x44FAF204);
        boolean z1 = composer0.t(transition0);
        androidx.compose.animation.core.TransitionKt.updateTransition.2.1 transitionKt$updateTransition$2$10 = composer0.W();
        if(z1 || transitionKt$updateTransition$2$10 == Composer.a.a()) {
            transitionKt$updateTransition$2$10 = new Function1(transition0) {
                final Transition e;

                {
                    this.e = transition0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.x();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            };
            composer0.O(transitionKt$updateTransition$2$10);
        }
        composer0.g0();
        EffectsKt.c(transition0, transitionKt$updateTransition$2$10, composer0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return transition0;
    }

    @Composable
    @l
    public static final Transition o(Object object0, @m String s, @m Composer composer0, int v, int v1) {
        composer0.V(0x78F2A0AD);
        if((v1 & 2) != 0) {
            s = null;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x78F2A0AD, v, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:66)");
        }
        composer0.V(0xE2A708A4);
        Transition transition0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(transition0 == composer$Companion0.a()) {
            transition0 = new Transition(object0, s);
            composer0.O(transition0);
        }
        composer0.g0();
        transition0.f(object0, composer0, v & 8 | 0x30 | v & 14);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(transition0);
        androidx.compose.animation.core.TransitionKt.updateTransition.1.1 transitionKt$updateTransition$1$10 = composer0.W();
        if(z || transitionKt$updateTransition$1$10 == composer$Companion0.a()) {
            transitionKt$updateTransition$1$10 = new Function1(transition0) {
                final Transition e;

                {
                    this.e = transition0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.x();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            };
            composer0.O(transitionKt$updateTransition$1$10);
        }
        composer0.g0();
        EffectsKt.c(transition0, transitionKt$updateTransition$1$10, composer0, 6);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return transition0;
    }
}

