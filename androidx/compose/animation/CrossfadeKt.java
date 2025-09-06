package androidx.compose.animation;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,147:1\n25#2:148\n25#2:156\n36#2:163\n460#2,13:202\n473#2,3:222\n1057#3,3:149\n1060#3,3:153\n1057#3,6:157\n1057#3,6:164\n1#4:152\n350#5,7:170\n32#6,6:177\n32#6,6:216\n67#7,6:183\n73#7:215\n77#7:226\n75#8:189\n76#8,11:191\n89#8:225\n76#9:190\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n112#1:163\n139#1:202,13\n139#1:222,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:164,6\n118#1:170,7\n127#1:177,6\n140#1:216,6\n139#1:183,6\n139#1:215\n139#1:226\n139#1:189\n139#1:191,11\n139#1:225\n139#1:190\n*E\n"})
public final class CrossfadeKt {
    @ExperimentalAnimationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@l Transition transition0, @m Modifier modifier0, @m FiniteAnimationSpec finiteAnimationSpec0, @m Function1 function10, @l p p0, @m Composer composer0, int v, int v1) {
        Function1 function12;
        Modifier modifier1;
        FiniteAnimationSpec finiteAnimationSpec1;
        Function1 function11;
        int v2;
        L.p(transition0, "<this>");
        L.p(p0, "content");
        Composer composer1 = composer0.G(679005231);
        if((v1 & 0x80000000) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(transition0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            function11 = function10;
        }
        else if((v & 0x1C00) == 0) {
            function11 = function10;
            v2 |= (composer1.t(function11) ? 0x800 : 0x400);
        }
        else {
            function11 = function10;
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.t(p0) ? 0x4000 : 0x2000);
        }
        if((v1 & 2) != 2 || (0xB6DB & v2) != 9362 || !composer1.c()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.m0;
            FiniteAnimationSpec finiteAnimationSpec2 = (v1 & 2) == 0 ? finiteAnimationSpec0 : AnimationSpecKt.q(0, 0, null, 7, null);
            if((v1 & 4) != 0) {
                function11 = androidx.compose.animation.CrossfadeKt.Crossfade.3.e;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(679005231, v2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            composer1.V(0xE2A708A4);
            SnapshotStateList snapshotStateList0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(snapshotStateList0 == composer$Companion0.a()) {
                snapshotStateList0 = SnapshotStateKt.f();
                snapshotStateList0.add(transition0.h());
                composer1.O(snapshotStateList0);
            }
            composer1.g0();
            composer1.V(0xE2A708A4);
            LinkedHashMap linkedHashMap0 = composer1.W();
            if(linkedHashMap0 == composer$Companion0.a()) {
                linkedHashMap0 = new LinkedHashMap();
                composer1.O(linkedHashMap0);
            }
            composer1.g0();
            composer1.V(0x9F5AA603);
            if(L.g(transition0.h(), transition0.o()) && (snapshotStateList0.size() != 1 || !L.g(snapshotStateList0.get(0), transition0.o()))) {
                composer1.V(0x44FAF204);
                boolean z = composer1.t(transition0);
                androidx.compose.animation.CrossfadeKt.Crossfade.4.1 crossfadeKt$Crossfade$4$10 = composer1.W();
                if(z || crossfadeKt$Crossfade$4$10 == composer$Companion0.a()) {
                    crossfadeKt$Crossfade$4$10 = new Function1(transition0) {
                        final Transition e;

                        {
                            this.e = transition0;
                            super(1);
                        }

                        @l
                        public final Boolean a(Object object0) {
                            return Boolean.valueOf(!L.g(object0, this.e.o()));
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(object0);
                        }
                    };
                    composer1.O(crossfadeKt$Crossfade$4$10);
                }
                composer1.g0();
                u.L0(snapshotStateList0, crossfadeKt$Crossfade$4$10);
                linkedHashMap0.clear();
            }
            composer1.g0();
            if(!linkedHashMap0.containsKey(transition0.o())) {
                int v3 = 0;
                Iterator iterator0 = snapshotStateList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v3 = -1;
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(L.g(function11.invoke(object0), function11.invoke(transition0.o()))) {
                        break;
                    }
                    ++v3;
                }
                if(v3 == -1) {
                    snapshotStateList0.add(transition0.o());
                }
                else {
                    snapshotStateList0.set(v3, transition0.o());
                }
                linkedHashMap0.clear();
                int v4 = snapshotStateList0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Object object1 = snapshotStateList0.get(v5);
                    linkedHashMap0.put(object1, ComposableLambdaKt.b(composer1, 0xAAFA89D8, true, new o(transition0, v2, finiteAnimationSpec2, object1, p0) {
                        final Transition e;
                        final int f;
                        final FiniteAnimationSpec g;
                        final Object h;
                        final p i;

                        {
                            this.e = transition0;
                            this.f = v;
                            this.g = finiteAnimationSpec0;
                            this.h = object0;
                            this.i = p0;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        public final void b(@m Composer composer0, int v) {
                            if((v & 11) == 2 && composer0.c()) {
                                composer0.m();
                                return;
                            }
                            if(ComposerKt.g0()) {
                                ComposerKt.w0(0xAAFA89D8, v, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
                            }
                            Transition transition0 = this.e;
                            androidx.compose.animation.CrossfadeKt.Crossfade.5.1.alpha.2 crossfadeKt$Crossfade$5$1$alpha$20 = new p() {
                                final FiniteAnimationSpec e;

                                {
                                    this.e = finiteAnimationSpec0;
                                    super(3);
                                }

                                @Composable
                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @l
                                public final FiniteAnimationSpec a(@l Segment transition$Segment0, @m Composer composer0, int v) {
                                    L.p(transition$Segment0, "$this$animateFloat");
                                    composer0.V(438406499);
                                    if(ComposerKt.g0()) {
                                        ComposerKt.w0(438406499, v, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                                    }
                                    FiniteAnimationSpec finiteAnimationSpec0 = this.e;
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
                            Object object0 = this.h;
                            int v1 = this.f;
                            composer0.V(0xB03404EB);
                            TwoWayConverter twoWayConverter0 = VectorConvertersKt.i(A.a);
                            composer0.V(0xF77F2E11);
                            Object object1 = transition0.h();
                            composer0.V(0xE5DA4D14);
                            if(ComposerKt.g0()) {
                                ComposerKt.w0(0xE5DA4D14, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
                            }
                            float f = 0.0f;
                            float f1 = L.g(object1, object0) ? 1.0f : 0.0f;
                            if(ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            composer0.g0();
                            Float float0 = f1;
                            Object object2 = transition0.o();
                            composer0.V(0xE5DA4D14);
                            if(ComposerKt.g0()) {
                                ComposerKt.w0(0xE5DA4D14, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
                            }
                            if(L.g(object2, object0)) {
                                f = 1.0f;
                            }
                            if(ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            composer0.g0();
                            State state0 = TransitionKt.m(transition0, float0, f, ((FiniteAnimationSpec)crossfadeKt$Crossfade$5$1$alpha$20.invoke(transition0.m(), composer0, 0)), twoWayConverter0, "FloatAnimation", composer0, v1 & 14);
                            composer0.g0();
                            composer0.g0();
                            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.m0;
                            composer0.V(0x44FAF204);
                            boolean z = composer0.t(state0);
                            androidx.compose.animation.CrossfadeKt.Crossfade.5.1.1.1 crossfadeKt$Crossfade$5$1$1$10 = composer0.W();
                            if(z || crossfadeKt$Crossfade$5$1$1$10 == Composer.a.a()) {
                                crossfadeKt$Crossfade$5$1$1$10 = new Function1() {
                                    final State e;

                                    {
                                        this.e = state0;
                                        super(1);
                                    }

                                    public final void a(@l GraphicsLayerScope graphicsLayerScope0) {
                                        L.p(graphicsLayerScope0, "$this$graphicsLayer");
                                        graphicsLayerScope0.j(androidx.compose.animation.CrossfadeKt.Crossfade.5.1.c(this.e));
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.a(((GraphicsLayerScope)object0));
                                        return S0.a;
                                    }
                                };
                                composer0.O(crossfadeKt$Crossfade$5$1$1$10);
                            }
                            composer0.g0();
                            Modifier modifier0 = GraphicsLayerModifierKt.a(modifier$Companion0, crossfadeKt$Crossfade$5$1$1$10);
                            p p0 = this.i;
                            Object object3 = this.h;
                            int v2 = this.f;
                            composer0.V(0x2BB5B5D7);
                            MeasurePolicy measurePolicy0 = BoxKt.k(Alignment.a.C(), false, composer0, 0);
                            composer0.V(-1323940314);
                            Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
                            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
                            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
                            a a0 = composeUiNode$Companion0.a();
                            p p1 = LayoutKt.f(modifier0);
                            if(!(composer0.H() instanceof Applier)) {
                                ComposablesKt.n();
                            }
                            composer0.h();
                            if(composer0.E()) {
                                composer0.k(a0);
                            }
                            else {
                                composer0.f();
                            }
                            composer0.b0();
                            Composer composer1 = Updater.b(composer0);
                            Updater.j(composer1, measurePolicy0, composeUiNode$Companion0.d());
                            Updater.j(composer1, density0, composeUiNode$Companion0.b());
                            Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
                            Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
                            composer0.y();
                            p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
                            composer0.V(2058660585);
                            composer0.V(0x809A5680);
                            p0.invoke(object3, composer0, ((int)(v2 >> 9 & 0x70)));
                            composer0.g0();
                            composer0.g0();
                            composer0.g();
                            composer0.g0();
                            composer0.g0();
                            if(ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        private static final float c(State state0) {
                            return ((Number)state0.getValue()).floatValue();
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            this.b(((Composer)object0), ((Number)object1).intValue());
                            return S0.a;
                        }
                    }));
                }
            }
            composer1.V(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = BoxKt.k(Alignment.a.C(), false, composer1, 0);
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p1 = LayoutKt.f(modifier2);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(a0);
            }
            else {
                composer1.f();
            }
            composer1.b0();
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, measurePolicy0, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            composer1.y();
            p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            composer1.V(0x809A5680);
            composer1.V(0x9F5AAAEE);
            int v6 = snapshotStateList0.size();
            for(int v7 = 0; v7 < v6; ++v7) {
                Object object2 = snapshotStateList0.get(v7);
                composer1.a0(-450541366, function11.invoke(object2));
                o o0 = (o)linkedHashMap0.get(object2);
                if(o0 != null) {
                    o0.invoke(composer1, 0);
                }
                composer1.f0();
            }
            composer1.g0();
            composer1.g0();
            composer1.g0();
            composer1.g();
            composer1.g0();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            function12 = function11;
            modifier1 = modifier2;
            finiteAnimationSpec1 = finiteAnimationSpec2;
        }
        else {
            composer1.m();
            finiteAnimationSpec1 = finiteAnimationSpec0;
            modifier1 = modifier0;
            function12 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(transition0, modifier1, finiteAnimationSpec1, function12, p0, v, v1) {
                final Transition e;
                final Modifier f;
                final FiniteAnimationSpec g;
                final Function1 h;
                final p i;
                final int j;
                final int k;

                {
                    this.e = transition0;
                    this.f = modifier0;
                    this.g = finiteAnimationSpec0;
                    this.h = function10;
                    this.i = p0;
                    this.j = v;
                    this.k = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CrossfadeKt.a(this.e, this.f, this.g, this.h, this.i, composer0, this.j | 1, this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.CrossfadeKt.Crossfade.3 extends N implements Function1 {
            public static final androidx.compose.animation.CrossfadeKt.Crossfade.3 e;

            static {
                androidx.compose.animation.CrossfadeKt.Crossfade.3.e = new androidx.compose.animation.CrossfadeKt.Crossfade.3();
            }

            androidx.compose.animation.CrossfadeKt.Crossfade.3() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                return object0;
            }
        }

    }

    @Composable
    @k(level = kotlin.m.c, message = "Crossfade API now has a new label parameter added.")
    public static final void b(Object object0, Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, p p0, Composer composer0, int v, int v1) {
        int v2;
        L.p(p0, "content");
        Composer composer1 = composer0.G(523603005);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(p0) ? 0x800 : 0x400);
        }
        if((v1 & 4) != 4 || (v2 & 5851) != 1170 || !composer1.c()) {
            if((v1 & 2) != 0) {
                modifier0 = Modifier.m0;
            }
            if((v1 & 4) != 0) {
                finiteAnimationSpec0 = AnimationSpecKt.q(0, 0, null, 7, null);
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(523603005, v2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            CrossfadeKt.a(TransitionKt.o(object0, null, composer1, v2 & 14, 2), modifier0, finiteAnimationSpec0, null, p0, composer1, v2 & 0x70 | 0x200 | v2 << 3 & 0xE000, 4);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, modifier0, finiteAnimationSpec0, p0, v, v1) {
                final Object e;
                final Modifier f;
                final FiniteAnimationSpec g;
                final p h;
                final int i;
                final int j;

                {
                    this.e = object0;
                    this.f = modifier0;
                    this.g = finiteAnimationSpec0;
                    this.h = p0;
                    this.i = v;
                    this.j = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CrossfadeKt.b(this.e, this.f, this.g, this.h, composer0, this.i | 1, this.j);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    public static final void c(Object object0, @m Modifier modifier0, @m FiniteAnimationSpec finiteAnimationSpec0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s1;
        Modifier modifier1;
        FiniteAnimationSpec finiteAnimationSpec1;
        int v2;
        L.p(p0, "content");
        Composer composer1 = composer0.G(0xED7B4BE0);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(object0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(s) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.t(p0) ? 0x4000 : 0x2000);
        }
        if((v1 & 4) != 4 || (0xB6DB & v2) != 9362 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            FiniteAnimationSpec finiteAnimationSpec2 = (v1 & 4) == 0 ? finiteAnimationSpec0 : AnimationSpecKt.q(0, 0, null, 7, null);
            String s2 = (v1 & 8) == 0 ? s : "Crossfade";
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xED7B4BE0, v2, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            CrossfadeKt.a(TransitionKt.o(object0, s2, composer1, v2 & 14 | v2 >> 6 & 0x70, 0), modifier2, finiteAnimationSpec2, null, p0, composer1, v2 & 0x70 | 0x200 | v2 & 0xE000, 4);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            s1 = s2;
            modifier1 = modifier2;
            finiteAnimationSpec1 = finiteAnimationSpec2;
        }
        else {
            composer1.m();
            finiteAnimationSpec1 = finiteAnimationSpec0;
            modifier1 = modifier0;
            s1 = s;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, modifier1, finiteAnimationSpec1, s1, p0, v, v1) {
                final Object e;
                final Modifier f;
                final FiniteAnimationSpec g;
                final String h;
                final p i;
                final int j;
                final int k;

                {
                    this.e = object0;
                    this.f = modifier0;
                    this.g = finiteAnimationSpec0;
                    this.h = s;
                    this.i = p0;
                    this.j = v;
                    this.k = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CrossfadeKt.c(this.e, this.f, this.g, this.h, this.i, composer0, this.j | 1, this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }
}

