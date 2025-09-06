package androidx.compose.animation;

import A3.a;
import A3.o;
import A3.p;
import A3.q;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,780:1\n76#2:781\n76#2:832\n36#3:782\n36#3:789\n36#3:796\n50#3:816\n49#3:817\n25#3:824\n460#3,13:844\n473#3,3:859\n1057#4,6:783\n1057#4,6:790\n1057#4,6:797\n1057#4,6:818\n1057#4,6:825\n350#5,7:803\n1855#5,2:857\n32#6,6:810\n75#7:831\n76#7,11:833\n89#7:862\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n617#1:781\n709#1:832\n618#1:782\n623#1:789\n624#1:796\n707#1:816\n707#1:817\n718#1:824\n709#1:844,13\n709#1:859,3\n618#1:783,6\n623#1:790,6\n624#1:797,6\n707#1:818,6\n718#1:825,6\n653#1:803,7\n712#1:857,2\n663#1:810,6\n709#1:831\n709#1:833,11\n709#1:862\n*E\n"})
public final class AnimatedContentKt {
    @ExperimentalAnimationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@l Transition transition0, @m Modifier modifier0, @m Function1 function10, @m Alignment alignment0, @m Function1 function11, @l q q0, @m Composer composer0, int v, int v1) {
        Function1 function15;
        Function1 function14;
        Modifier modifier1;
        Function1 function13;
        Alignment alignment1;
        Function1 function12;
        int v2;
        L.p(transition0, "<this>");
        L.p(q0, "content");
        Composer composer1 = composer0.G(0xF929FA7C);
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
            v2 |= 0x180;
            function12 = function10;
        }
        else if((v & 0x380) == 0) {
            function12 = function10;
            v2 |= (composer1.t(function12) ? 0x100 : 0x80);
        }
        else {
            function12 = function10;
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
            alignment1 = alignment0;
        }
        else if((v & 0x1C00) == 0) {
            alignment1 = alignment0;
            v2 |= (composer1.t(alignment1) ? 0x800 : 0x400);
        }
        else {
            alignment1 = alignment0;
        }
        if((v1 & 8) == 0) {
            function13 = function11;
            if((v & 0xE000) == 0) {
                v2 |= (composer1.t(function13) ? 0x4000 : 0x2000);
            }
        }
        else {
            v2 |= 0x6000;
            function13 = function11;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.t(q0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.m0;
            if((v1 & 2) != 0) {
                function12 = androidx.compose.animation.AnimatedContentKt.AnimatedContent.5.e;
            }
            if((v1 & 4) != 0) {
                alignment1 = Alignment.a.C();
            }
            if((v1 & 8) != 0) {
                function13 = androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.e;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xF929FA7C, v2, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:605)");
            }
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            composer1.V(0x44FAF204);
            boolean z = composer1.t(transition0);
            AnimatedContentScope animatedContentScope0 = composer1.W();
            if(z || animatedContentScope0 == Composer.a.a()) {
                animatedContentScope0 = new AnimatedContentScope(transition0, alignment1, layoutDirection0);
                composer1.O(animatedContentScope0);
            }
            composer1.g0();
            composer1.V(0x44FAF204);
            boolean z1 = composer1.t(transition0);
            SnapshotStateList snapshotStateList0 = composer1.W();
            if(z1 || snapshotStateList0 == Composer.a.a()) {
                snapshotStateList0 = SnapshotStateKt.g(new Object[]{transition0.h()});
                composer1.O(snapshotStateList0);
            }
            composer1.g0();
            composer1.V(0x44FAF204);
            boolean z2 = composer1.t(transition0);
            LinkedHashMap linkedHashMap0 = composer1.W();
            if(z2 || linkedHashMap0 == Composer.a.a()) {
                linkedHashMap0 = new LinkedHashMap();
                composer1.O(linkedHashMap0);
            }
            composer1.g0();
            if(!snapshotStateList0.contains(transition0.h())) {
                snapshotStateList0.clear();
                snapshotStateList0.add(transition0.h());
            }
            if(L.g(transition0.h(), transition0.o())) {
                if(snapshotStateList0.size() != 1 || !L.g(snapshotStateList0.get(0), transition0.h())) {
                    snapshotStateList0.clear();
                    snapshotStateList0.add(transition0.h());
                }
                if(linkedHashMap0.size() != 1 || linkedHashMap0.containsKey(transition0.h())) {
                    linkedHashMap0.clear();
                }
                animatedContentScope0.t(alignment1);
                animatedContentScope0.u(layoutDirection0);
            }
            if(!L.g(transition0.h(), transition0.o()) && !snapshotStateList0.contains(transition0.o())) {
                int v3 = 0;
                Iterator iterator0 = snapshotStateList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v3 = -1;
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(L.g(function13.invoke(object0), function13.invoke(transition0.o()))) {
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
            }
            if(!linkedHashMap0.containsKey(transition0.o()) || !linkedHashMap0.containsKey(transition0.h())) {
                linkedHashMap0.clear();
                int v4 = snapshotStateList0.size();
                for(int v5 = 0; v5 < v4; ++v5) {
                    Object object1 = snapshotStateList0.get(v5);
                    linkedHashMap0.put(object1, ComposableLambdaKt.b(composer1, 885640742, true, new o(transition0, object1, v2, function12, animatedContentScope0, q0, snapshotStateList0) {
                        final Transition e;
                        final Object f;
                        final int g;
                        final Function1 h;
                        final AnimatedContentScope i;
                        final q j;
                        final SnapshotStateList k;

                        {
                            this.e = transition0;
                            this.f = object0;
                            this.g = v;
                            this.h = function10;
                            this.i = animatedContentScope0;
                            this.j = q0;
                            this.k = snapshotStateList0;
                            super(2);
                        }

                        @Composable
                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        public final void a(@m Composer composer0, int v) {
                            if((v & 11) == 2 && composer0.c()) {
                                composer0.m();
                                return;
                            }
                            if(ComposerKt.g0()) {
                                ComposerKt.w0(885640742, v, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:663)");
                            }
                            Function1 function10 = this.h;
                            AnimatedContentScope animatedContentScope0 = this.i;
                            composer0.V(0xE2A708A4);
                            ContentTransform contentTransform0 = composer0.W();
                            Companion composer$Companion0 = Composer.a;
                            if(contentTransform0 == composer$Companion0.a()) {
                                contentTransform0 = (ContentTransform)function10.invoke(animatedContentScope0);
                                composer0.O(contentTransform0);
                            }
                            composer0.g0();
                            Boolean boolean0 = Boolean.valueOf(L.g(this.e.m().b(), this.f));
                            Transition transition0 = this.e;
                            Object object0 = this.f;
                            Function1 function11 = this.h;
                            AnimatedContentScope animatedContentScope1 = this.i;
                            composer0.V(0x44FAF204);
                            boolean z = composer0.t(boolean0);
                            ExitTransition exitTransition0 = composer0.W();
                            if(z || exitTransition0 == composer$Companion0.a()) {
                                exitTransition0 = L.g(transition0.m().b(), object0) ? ExitTransition.a.a() : ((ContentTransform)function11.invoke(animatedContentScope1)).a();
                                composer0.O(exitTransition0);
                            }
                            composer0.g0();
                            Object object1 = this.f;
                            Transition transition1 = this.e;
                            composer0.V(0xE2A708A4);
                            ChildData animatedContentScope$ChildData0 = composer0.W();
                            if(animatedContentScope$ChildData0 == composer$Companion0.a()) {
                                animatedContentScope$ChildData0 = new ChildData(L.g(object1, transition1.o()));
                                composer0.O(animatedContentScope$ChildData0);
                            }
                            composer0.g0();
                            androidx.compose.animation.AnimatedContentKt.AnimatedContent.7.1.1 animatedContentKt$AnimatedContent$7$1$10 = new p() {
                                final ContentTransform e;

                                {
                                    this.e = contentTransform0;
                                    super(3);
                                }

                                @l
                                public final MeasureResult a(@l MeasureScope measureScope0, @l Measurable measurable0, long v) {
                                    L.p(measureScope0, "$this$layout");
                                    L.p(measurable0, "measurable");
                                    Placeable placeable0 = measurable0.r1(v);
                                    return MeasureScope.-CC.p(measureScope0, placeable0.N1(), placeable0.K1(), null, new Function1(this.e) {
                                        final Placeable e;
                                        final ContentTransform f;

                                        {
                                            this.e = placeable0;
                                            this.f = contentTransform0;
                                            super(1);
                                        }

                                        public final void a(@l PlacementScope placeable$PlacementScope0) {
                                            L.p(placeable$PlacementScope0, "$this$layout");
                                            float f = this.f.d();
                                            placeable$PlacementScope0.o(this.e, 0, 0, f);
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((PlacementScope)object0));
                                            return S0.a;
                                        }
                                    }, 4, null);
                                }

                                @Override  // A3.p
                                public Object invoke(Object object0, Object object1, Object object2) {
                                    return this.a(((MeasureScope)object0), ((Measurable)object1), ((Constraints)object2).x());
                                }
                            };
                            Modifier modifier0 = LayoutModifierKt.a(Modifier.m0, animatedContentKt$AnimatedContent$7$1$10);
                            Object object2 = this.e.o();
                            animatedContentScope$ChildData0.j(L.g(this.f, object2));
                            Modifier modifier1 = modifier0.r0(animatedContentScope$ChildData0);
                            androidx.compose.animation.AnimatedContentKt.AnimatedContent.7.1.3 animatedContentKt$AnimatedContent$7$1$30 = new Function1() {
                                final Object e;

                                {
                                    this.e = object0;
                                    super(1);
                                }

                                @l
                                public final Boolean a(Object object0) {
                                    return Boolean.valueOf(L.g(object0, this.e));
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    return this.a(object0);
                                }
                            };
                            ComposableLambda composableLambda0 = ComposableLambdaKt.b(composer0, 0x8F0E27EF, true, new p(this.f, this.j, this.g, this.k) {
                                final AnimatedContentScope e;
                                final Object f;
                                final q g;
                                final int h;
                                final SnapshotStateList i;

                                {
                                    this.e = animatedContentScope0;
                                    this.f = object0;
                                    this.g = q0;
                                    this.h = v;
                                    this.i = snapshotStateList0;
                                    super(3);
                                }

                                @Composable
                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                public final void a(@l AnimatedVisibilityScope animatedVisibilityScope0, @m Composer composer0, int v) {
                                    L.p(animatedVisibilityScope0, "$this$AnimatedVisibility");
                                    if((v & 14) == 0) {
                                        v |= (composer0.t(animatedVisibilityScope0) ? 4 : 2);
                                    }
                                    if((v & 91) == 18 && composer0.c()) {
                                        composer0.m();
                                        return;
                                    }
                                    if(ComposerKt.g0()) {
                                        ComposerKt.w0(0x8F0E27EF, v, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:690)");
                                    }
                                    EffectsKt.c(animatedVisibilityScope0, new Function1(this.f, this.e) {
                                        final SnapshotStateList e;
                                        final Object f;
                                        final AnimatedContentScope g;

                                        {
                                            this.e = snapshotStateList0;
                                            this.f = object0;
                                            this.g = animatedContentScope0;
                                            super(1);
                                        }

                                        @l
                                        public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                                            L.p(disposableEffectScope0, "$this$DisposableEffect");
                                            return new DisposableEffectResult() {
                                                @Override  // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    this.f.remove(this.g);
                                                    this.c.o().remove(this.g);
                                                }
                                            };
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            return this.a(((DisposableEffectScope)object0));
                                        }
                                    }, composer0, v & 14);
                                    MutableState mutableState0 = ((AnimatedVisibilityScopeImpl)animatedVisibilityScope0).c();
                                    this.e.o().put(this.f, mutableState0);
                                    this.g.T0(animatedVisibilityScope0, this.f, composer0, ((int)(v & 14 | this.h >> 9 & 0x380)));
                                    if(ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override  // A3.p
                                public Object invoke(Object object0, Object object1, Object object2) {
                                    this.a(((AnimatedVisibilityScope)object0), ((Composer)object1), ((Number)object2).intValue());
                                    return S0.a;
                                }
                            });
                            AnimatedVisibilityKt.d(this.e, animatedContentKt$AnimatedContent$7$1$30, modifier1, contentTransform0.c(), exitTransition0, composableLambda0, composer0, 0x30000 | this.g & 14, 0);
                            if(ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            this.a(((Composer)object0), ((Number)object1).intValue());
                            return S0.a;
                        }
                    }));
                }
            }
            Segment transition$Segment0 = transition0.m();
            composer1.V(0x1E7B2B64);
            boolean z3 = composer1.t(animatedContentScope0);
            boolean z4 = composer1.t(transition$Segment0);
            ContentTransform contentTransform0 = composer1.W();
            if(z4 || z3 || contentTransform0 == Composer.a.a()) {
                contentTransform0 = (ContentTransform)function12.invoke(animatedContentScope0);
                composer1.O(contentTransform0);
            }
            composer1.g0();
            Modifier modifier3 = modifier2.r0(animatedContentScope0.g(contentTransform0, composer1, 72));
            composer1.V(0xE2A708A4);
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy0 = composer1.W();
            if(animatedContentMeasurePolicy0 == Composer.a.a()) {
                animatedContentMeasurePolicy0 = new AnimatedContentMeasurePolicy(animatedContentScope0);
                composer1.O(animatedContentMeasurePolicy0);
            }
            composer1.g0();
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p0 = LayoutKt.f(modifier3);
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
            Updater.j(composer2, animatedContentMeasurePolicy0, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection1, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            composer1.y();
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            composer1.V(0xE5AF0ED6);
            for(Object object2: snapshotStateList0) {
                composer1.a0(0x98505AB2, function13.invoke(object2));
                o o0 = (o)linkedHashMap0.get(object2);
                if(o0 != null) {
                    o0.invoke(composer1, 0);
                }
                composer1.f0();
            }
            composer1.g0();
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            function14 = function12;
            function15 = function13;
            modifier1 = modifier2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            function14 = function12;
            function15 = function13;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(transition0, modifier1, function14, alignment1, function15, q0, v, v1) {
                final Transition e;
                final Modifier f;
                final Function1 g;
                final Alignment h;
                final Function1 i;
                final q j;
                final int k;
                final int l;

                {
                    this.e = transition0;
                    this.f = modifier0;
                    this.g = function10;
                    this.h = alignment0;
                    this.i = function11;
                    this.j = q0;
                    this.k = v;
                    this.l = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedContentKt.a(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1, this.l);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedContentKt.AnimatedContent.5 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedContentKt.AnimatedContent.5 e;

            static {
                androidx.compose.animation.AnimatedContentKt.AnimatedContent.5.e = new androidx.compose.animation.AnimatedContentKt.AnimatedContent.5();
            }

            androidx.compose.animation.AnimatedContentKt.AnimatedContent.5() {
                super(1);
            }

            @l
            public final ContentTransform a(@l AnimatedContentScope animatedContentScope0) {
                L.p(animatedContentScope0, "$this$null");
                return AnimatedContentKt.f(EnterExitTransitionKt.v(AnimationSpecKt.q(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.z(AnimationSpecKt.q(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.x(AnimationSpecKt.q(90, 0, null, 6, null), 0.0f, 2, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((AnimatedContentScope)object0));
            }
        }


        final class androidx.compose.animation.AnimatedContentKt.AnimatedContent.6 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedContentKt.AnimatedContent.6 e;

            static {
                androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.e = new androidx.compose.animation.AnimatedContentKt.AnimatedContent.6();
            }

            androidx.compose.animation.AnimatedContentKt.AnimatedContent.6() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public final Object invoke(Object object0) {
                return object0;
            }
        }

    }

    @ExperimentalAnimationApi
    @Composable
    @k(level = kotlin.m.c, message = "AnimatedContent API now has a new label parameter added.")
    public static final void b(Object object0, Modifier modifier0, Function1 function10, Alignment alignment0, q q0, Composer composer0, int v, int v1) {
        Alignment alignment1;
        Function1 function11;
        Modifier modifier1;
        int v2;
        L.p(q0, "content");
        Composer composer1 = composer0.G(0x7EA20F6B);
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
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(alignment0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.t(q0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            Function1 function12 = (v1 & 4) == 0 ? function10 : androidx.compose.animation.AnimatedContentKt.AnimatedContent.3.e;
            Alignment alignment2 = (v1 & 8) == 0 ? alignment0 : Alignment.a.C();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x7EA20F6B, v2, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:148)");
            }
            AnimatedContentKt.c(object0, modifier2, function12, alignment2, "AnimatedContent", q0, composer1, v2 & 8 | 0x6000 | v2 & 14 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | v2 << 3 & 0x70000, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            function11 = function12;
            alignment1 = alignment2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            function11 = function10;
            alignment1 = alignment0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, modifier1, function11, alignment1, q0, v, v1) {
                final Object e;
                final Modifier f;
                final Function1 g;
                final Alignment h;
                final q i;
                final int j;
                final int k;

                {
                    this.e = object0;
                    this.f = modifier0;
                    this.g = function10;
                    this.h = alignment0;
                    this.i = q0;
                    this.j = v;
                    this.k = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedContentKt.b(this.e, this.f, this.g, this.h, this.i, composer0, this.j | 1, this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedContentKt.AnimatedContent.3 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedContentKt.AnimatedContent.3 e;

            static {
                androidx.compose.animation.AnimatedContentKt.AnimatedContent.3.e = new androidx.compose.animation.AnimatedContentKt.AnimatedContent.3();
            }

            androidx.compose.animation.AnimatedContentKt.AnimatedContent.3() {
                super(1);
            }

            @l
            public final ContentTransform a(@l AnimatedContentScope animatedContentScope0) {
                L.p(animatedContentScope0, "$this$null");
                return AnimatedContentKt.f(EnterExitTransitionKt.v(AnimationSpecKt.q(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.z(AnimationSpecKt.q(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.x(AnimationSpecKt.q(90, 0, null, 6, null), 0.0f, 2, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((AnimatedContentScope)object0));
            }
        }

    }

    @ExperimentalAnimationApi
    @Composable
    public static final void c(Object object0, @m Modifier modifier0, @m Function1 function10, @m Alignment alignment0, @m String s, @l q q0, @m Composer composer0, int v, int v1) {
        String s2;
        Alignment alignment1;
        Function1 function11;
        Modifier modifier1;
        String s1;
        int v2;
        L.p(q0, "content");
        Composer composer1 = composer0.G(0xD02DF0E0);
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
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(function10) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(alignment0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            s1 = s;
        }
        else if((0xE000 & v) == 0) {
            s1 = s;
            v2 |= (composer1.t(s1) ? 0x4000 : 0x2000);
        }
        else {
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.t(q0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            Function1 function12 = (v1 & 4) == 0 ? function10 : androidx.compose.animation.AnimatedContentKt.AnimatedContent.1.e;
            Alignment alignment2 = (v1 & 8) == 0 ? alignment0 : Alignment.a.C();
            if((v1 & 16) != 0) {
                s1 = "AnimatedContent";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xD02DF0E0, v2, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:120)");
            }
            AnimatedContentKt.a(TransitionKt.o(object0, s1, composer1, v2 & 14 | v2 >> 9 & 0x70, 0), modifier2, function12, alignment2, null, q0, composer1, v2 & 0x71FF0, 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            s2 = s1;
            modifier1 = modifier2;
            function11 = function12;
            alignment1 = alignment2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            function11 = function10;
            alignment1 = alignment0;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(object0, modifier1, function11, alignment1, s2, q0, v, v1) {
                final Object e;
                final Modifier f;
                final Function1 g;
                final Alignment h;
                final String i;
                final q j;
                final int k;
                final int l;

                {
                    this.e = object0;
                    this.f = modifier0;
                    this.g = function10;
                    this.h = alignment0;
                    this.i = s;
                    this.j = q0;
                    this.k = v;
                    this.l = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedContentKt.c(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1, this.l);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedContentKt.AnimatedContent.1 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedContentKt.AnimatedContent.1 e;

            static {
                androidx.compose.animation.AnimatedContentKt.AnimatedContent.1.e = new androidx.compose.animation.AnimatedContentKt.AnimatedContent.1();
            }

            androidx.compose.animation.AnimatedContentKt.AnimatedContent.1() {
                super(1);
            }

            @l
            public final ContentTransform a(@l AnimatedContentScope animatedContentScope0) {
                L.p(animatedContentScope0, "$this$null");
                return AnimatedContentKt.f(EnterExitTransitionKt.v(AnimationSpecKt.q(220, 90, null, 4, null), 0.0f, 2, null).c(EnterExitTransitionKt.z(AnimationSpecKt.q(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.x(AnimationSpecKt.q(90, 0, null, 6, null), 0.0f, 2, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((AnimatedContentScope)object0));
            }
        }

    }

    @ExperimentalAnimationApi
    @l
    public static final SizeTransform d(boolean z, @l o o0) {
        L.p(o0, "sizeAnimationSpec");
        return new SizeTransformImpl(z, o0);
    }

    public static SizeTransform e(boolean z, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            o0 = androidx.compose.animation.AnimatedContentKt.SizeTransform.1.e;
        }
        return AnimatedContentKt.d(z, o0);

        final class androidx.compose.animation.AnimatedContentKt.SizeTransform.1 extends N implements o {
            public static final androidx.compose.animation.AnimatedContentKt.SizeTransform.1 e;

            static {
                androidx.compose.animation.AnimatedContentKt.SizeTransform.1.e = new androidx.compose.animation.AnimatedContentKt.SizeTransform.1();
            }

            androidx.compose.animation.AnimatedContentKt.SizeTransform.1() {
                super(2);
            }

            @l
            public final SpringSpec a(long v, long v1) {
                return AnimationSpecKt.o(0.0f, 0.0f, IntSize.b(VisibilityThresholdsKt.g(IntSize.b)), 3, null);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((IntSize)object0).q(), ((IntSize)object1).q());
            }
        }

    }

    @ExperimentalAnimationApi
    @l
    public static final ContentTransform f(@l EnterTransition enterTransition0, @l ExitTransition exitTransition0) {
        L.p(enterTransition0, "<this>");
        L.p(exitTransition0, "exit");
        return new ContentTransform(enterTransition0, exitTransition0, 0.0f, null, 12, null);
    }
}

