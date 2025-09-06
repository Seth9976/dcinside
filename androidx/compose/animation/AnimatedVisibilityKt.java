package androidx.compose.animation;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

@s0({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,863:1\n775#1,4:898\n781#1,2:909\n779#1:912\n780#1:939\n785#1:944\n25#2:864\n36#2:872\n36#2:880\n50#2:890\n49#2:891\n36#2:902\n25#2:911\n460#2,13:926\n473#2,3:940\n36#2:945\n25#2:952\n460#2,16:972\n25#2:989\n1057#3,6:865\n1057#3,6:873\n1057#3,6:881\n1057#3,6:892\n1057#3,6:903\n1057#3,6:946\n1057#3,6:953\n1057#3,6:990\n1#4:871\n786#5:879\n787#5,3:887\n75#6:913\n76#6,11:915\n89#6:943\n75#6:959\n76#6,11:961\n89#6:988\n76#7:914\n76#7:960\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n753#1:898,4\n753#1:909,2\n753#1:912\n753#1:939\n753#1:944\n710#1:864\n735#1:872\n740#1:880\n744#1:890\n744#1:891\n753#1:902\n753#1:911\n753#1:926,13\n753#1:940,3\n778#1:945\n782#1:952\n779#1:972,16\n847#1:989\n710#1:865,6\n735#1:873,6\n740#1:881,6\n744#1:892,6\n753#1:903,6\n778#1:946,6\n782#1:953,6\n847#1:990,6\n740#1:879\n740#1:887,3\n753#1:913\n753#1:915,11\n753#1:943\n779#1:959\n779#1:961,11\n779#1:988\n753#1:914\n779#1:960\n*E\n"})
public final class AnimatedVisibilityKt {
    @ExperimentalAnimationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void a(Transition transition0, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, p p0, Composer composer0, int v) {
        composer0.V(-1967270694);
        if(transition0.h() == EnterExitState.b || transition0.o() == EnterExitState.b) {
            composer0.V(0x44FAF204);
            boolean z = composer0.t(transition0);
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl0 = composer0.W();
            if(z || animatedVisibilityScopeImpl0 == Composer.a.a()) {
                animatedVisibilityScopeImpl0 = new AnimatedVisibilityScopeImpl(transition0);
                composer0.O(animatedVisibilityScopeImpl0);
            }
            composer0.g0();
            Modifier modifier1 = modifier0.r0(EnterExitTransitionKt.g(transition0, enterTransition0, exitTransition0, "Built-in", composer0, v & 14 | 0xC00 | v >> 3 & 0x70 | v >> 3 & 0x380));
            composer0.V(0xE2A708A4);
            AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy0 = composer0.W();
            if(animatedEnterExitMeasurePolicy0 == Composer.a.a()) {
                animatedEnterExitMeasurePolicy0 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl0);
                composer0.O(animatedEnterExitMeasurePolicy0);
            }
            composer0.g0();
            composer0.V(-1323940314);
            Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p1 = LayoutKt.f(modifier1);
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
            Updater.j(composer1, animatedEnterExitMeasurePolicy0, composeUiNode$Companion0.d());
            Updater.j(composer1, density0, composeUiNode$Companion0.b());
            Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
            composer0.y();
            p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
            composer0.V(2058660585);
            p0.invoke(animatedVisibilityScopeImpl0, composer0, ((int)(v >> 9 & 0x70 | 8)));
            composer0.g0();
            composer0.g();
            composer0.g0();
        }
        composer0.g0();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void b(Transition transition0, Function1 function10, Modifier modifier0, EnterTransition enterTransition0, ExitTransition exitTransition0, p p0, Composer composer0, int v) {
        MutableState mutableState1;
        Composer composer1 = composer0.G(0x302CF9ED);
        int v1 = (v & 14) == 0 ? (composer1.t(transition0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.t(enterTransition0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.t(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.t(p0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v1) != 74898 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x302CF9ED, v1, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            composer1.V(0x44FAF204);
            boolean z = composer1.t(transition0);
            MutableState mutableState0 = composer1.W();
            if(z || mutableState0 == Composer.a.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(function10.invoke(transition0.h()), null, 2, null);
                composer1.O(mutableState0);
            }
            composer1.g0();
            if(((Boolean)function10.invoke(transition0.o())).booleanValue() || ((Boolean)mutableState0.getValue()).booleanValue() || transition0.t()) {
                composer1.V(0x48730564);
                composer1.V(0x44FAF204);
                boolean z1 = composer1.t(transition0);
                Object object0 = composer1.W();
                if(z1 || object0 == Composer.a.a()) {
                    object0 = transition0.h();
                    composer1.O(object0);
                }
                composer1.g0();
                if(transition0.t()) {
                    object0 = transition0.h();
                }
                composer1.V(0xB73F666E);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xB73F666E, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnterExitState enterExitState0 = AnimatedVisibilityKt.l(transition0, function10, object0, composer1, v1 & 0x7E);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer1.g0();
                Object object1 = transition0.o();
                composer1.V(0xB73F666E);
                if(ComposerKt.g0()) {
                    mutableState1 = mutableState0;
                    ComposerKt.w0(0xB73F666E, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                else {
                    mutableState1 = mutableState0;
                }
                EnterExitState enterExitState1 = AnimatedVisibilityKt.l(transition0, function10, object1, composer1, v1 & 0x7E);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer1.g0();
                Transition transition1 = TransitionKt.k(transition0, enterExitState0, enterExitState1, "EnterExitTransition", composer1, (v1 & 14 | 0x30) & 14 | 0xC00);
                composer1.g0();
                composer1.V(0x1E7B2B64);
                boolean z2 = composer1.t(transition1);
                boolean z3 = composer1.t(mutableState1);
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.1.1 animatedVisibilityKt$AnimatedEnterExitImpl$1$10 = composer1.W();
                if(z2 || z3 || animatedVisibilityKt$AnimatedEnterExitImpl$1$10 == Composer.a.a()) {
                    animatedVisibilityKt$AnimatedEnterExitImpl$1$10 = new o(transition1, mutableState1, null) {
                        int k;
                        final Transition l;
                        final MutableState m;

                        {
                            this.l = transition0;
                            this.m = mutableState0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.1.1(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    i i0 = SnapshotStateKt.v(new a() {
                                        final Transition e;

                                        {
                                            this.e = transition0;
                                            super(0);
                                        }

                                        @l
                                        public final Boolean b() {
                                            return this.e.h() == EnterExitState.b || this.e.o() == EnterExitState.b;
                                        }

                                        @Override  // A3.a
                                        public Object invoke() {
                                            return this.b();
                                        }
                                    });
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl.1.1.2 animatedVisibilityKt$AnimatedEnterExitImpl$1$1$20 = new j() {
                                        @m
                                        public final Object a(boolean z, @l d d0) {
                                            this.a.setValue(kotlin.coroutines.jvm.internal.b.a(z));
                                            return S0.a;
                                        }

                                        @Override  // kotlinx.coroutines.flow.j
                                        public Object emit(Object object0, d d0) {
                                            return this.a(((Boolean)object0).booleanValue(), d0);
                                        }
                                    };
                                    this.k = 1;
                                    return i0.collect(animatedVisibilityKt$AnimatedEnterExitImpl$1$1$20, this) == object1 ? object1 : S0.a;
                                }
                                case 1: {
                                    f0.n(object0);
                                    return S0.a;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                        }
                    };
                    composer1.O(animatedVisibilityKt$AnimatedEnterExitImpl$1$10);
                }
                composer1.g0();
                EffectsKt.g(transition1, animatedVisibilityKt$AnimatedEnterExitImpl$1$10, composer1, 0x40);
                int v2 = v1 >> 3 & 0xFFF0;
                composer1.V(-1967270694);
                if(transition1.h() == EnterExitState.b || transition1.o() == EnterExitState.b) {
                    composer1.V(0x44FAF204);
                    boolean z4 = composer1.t(transition1);
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl0 = composer1.W();
                    if(z4 || animatedVisibilityScopeImpl0 == Composer.a.a()) {
                        animatedVisibilityScopeImpl0 = new AnimatedVisibilityScopeImpl(transition1);
                        composer1.O(animatedVisibilityScopeImpl0);
                    }
                    composer1.g0();
                    Modifier modifier1 = modifier0.r0(EnterExitTransitionKt.g(transition1, enterTransition0, exitTransition0, "Built-in", composer1, v2 >> 3 & 0x70 | 0xC00 | v2 >> 3 & 0x380));
                    composer1.V(0xE2A708A4);
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy0 = composer1.W();
                    if(animatedEnterExitMeasurePolicy0 == Composer.a.a()) {
                        animatedEnterExitMeasurePolicy0 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl0);
                        composer1.O(animatedEnterExitMeasurePolicy0);
                    }
                    composer1.g0();
                    composer1.V(-1323940314);
                    Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
                    ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
                    Companion composeUiNode$Companion0 = ComposeUiNode.p0;
                    a a0 = composeUiNode$Companion0.a();
                    p p1 = LayoutKt.f(modifier1);
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
                    Updater.j(composer2, animatedEnterExitMeasurePolicy0, composeUiNode$Companion0.d());
                    Updater.j(composer2, density0, composeUiNode$Companion0.b());
                    Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
                    Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
                    composer1.y();
                    p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
                    composer1.V(2058660585);
                    p0.invoke(animatedVisibilityScopeImpl0, composer1, ((int)(v2 >> 9 & 0x70 | 8)));
                    composer1.g0();
                    composer1.g();
                    composer1.g0();
                }
                composer1.g0();
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
            scopeUpdateScope0.a(new o(transition0, function10, modifier0, enterTransition0, exitTransition0, p0, v) {
                final Transition e;
                final Function1 f;
                final Modifier g;
                final EnterTransition h;
                final ExitTransition i;
                final p j;
                final int k;

                {
                    this.e = transition0;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = enterTransition0;
                    this.i = exitTransition0;
                    this.j = p0;
                    this.k = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.b(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1);
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
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void c(@l MutableTransitionState mutableTransitionState0, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s2;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        String s1;
        int v2;
        L.p(mutableTransitionState0, "visibleState");
        L.p(p0, "content");
        Composer composer1 = composer0.G(0xF2B6D706);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(mutableTransitionState0) ? 4 : 2) | v : v;
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
            v2 |= (composer1.t(enterTransition0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(exitTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            s1 = s;
        }
        else if((v & 0xE000) == 0) {
            s1 = s;
            v2 |= (composer1.t(s1) ? 0x4000 : 0x2000);
        }
        else {
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.t(p0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
            if((v1 & 16) != 0) {
                s1 = "AnimatedVisibility";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xF2B6D706, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
            }
            AnimatedVisibilityKt.b(TransitionKt.n(mutableTransitionState0, s1, composer1, MutableTransitionState.d | v2 & 14 | v2 >> 9 & 0x70, 0), androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7.e, modifier2, enterTransition2, exitTransition2, p0, composer1, v2 << 3 & 0xE000 | (v2 << 3 & 0x380 | 0x30 | v2 << 3 & 0x1C00) | v2 & 0x70000);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            s2 = s1;
            exitTransition1 = exitTransition2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(mutableTransitionState0, modifier1, enterTransition1, exitTransition1, s2, p0, v, v1) {
                final MutableTransitionState e;
                final Modifier f;
                final EnterTransition g;
                final ExitTransition h;
                final String i;
                final p j;
                final int k;
                final int l;

                {
                    this.e = mutableTransitionState0;
                    this.f = modifier0;
                    this.g = enterTransition0;
                    this.h = exitTransition0;
                    this.i = s;
                    this.j = p0;
                    this.k = v;
                    this.l = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.c(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1, this.l);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7 e;

            static {
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7.e = new androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7();
            }

            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.7() {
                super(1);
            }

            @l
            public final Boolean b(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }

    }

    @ExperimentalAnimationApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void d(@l Transition transition0, @l Function1 function10, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @l p p0, @m Composer composer0, int v, int v1) {
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        int v2;
        L.p(transition0, "<this>");
        L.p(function10, "visible");
        L.p(p0, "content");
        Composer composer1 = composer0.G(1031950689);
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
            v2 |= (composer1.t(function10) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x380) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.t(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.t(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.t(p0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            if(ComposerKt.g0()) {
                ComposerKt.w0(1031950689, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
            }
            AnimatedVisibilityKt.b(transition0, function10, modifier2, enterTransition2, exitTransition2, p0, composer1, v2 & 0x7FFFE);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            exitTransition1 = exitTransition2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.m();
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(transition0, function10, modifier1, enterTransition1, exitTransition1, p0, v, v1) {
                final Transition e;
                final Function1 f;
                final Modifier g;
                final EnterTransition h;
                final ExitTransition i;
                final p j;
                final int k;
                final int l;

                {
                    this.e = transition0;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = enterTransition0;
                    this.i = exitTransition0;
                    this.j = p0;
                    this.k = v;
                    this.l = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.d(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1, this.l);
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
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void e(@l ColumnScope columnScope0, @l MutableTransitionState mutableTransitionState0, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s2;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        String s1;
        int v2;
        L.p(columnScope0, "<this>");
        L.p(mutableTransitionState0, "visibleState");
        L.p(p0, "content");
        Composer composer1 = composer0.G(0xCD4C0296);
        if((v1 & 1) == 0) {
            v2 = (v & 0x70) == 0 ? (composer1.t(mutableTransitionState0) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.t(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) == 0) {
            s1 = s;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(s1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.t(p0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x2DB6D1) != 0x92490 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            if((v1 & 16) != 0) {
                s1 = "AnimatedVisibility";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xCD4C0296, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
            }
            AnimatedVisibilityKt.b(TransitionKt.n(mutableTransitionState0, s1, composer1, MutableTransitionState.d | v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11.e, modifier2, enterTransition2, exitTransition2, p0, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            s2 = s1;
            enterTransition1 = enterTransition2;
            exitTransition1 = exitTransition2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(columnScope0, mutableTransitionState0, modifier1, enterTransition1, exitTransition1, s2, p0, v, v1) {
                final ColumnScope e;
                final MutableTransitionState f;
                final Modifier g;
                final EnterTransition h;
                final ExitTransition i;
                final String j;
                final p k;
                final int l;
                final int m;

                {
                    this.e = columnScope0;
                    this.f = mutableTransitionState0;
                    this.g = modifier0;
                    this.h = enterTransition0;
                    this.i = exitTransition0;
                    this.j = s;
                    this.k = p0;
                    this.l = v;
                    this.m = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.e(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, this.l | 1, this.m);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11 e;

            static {
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11.e = new androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11();
            }

            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.11() {
                super(1);
            }

            @l
            public final Boolean b(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }

    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void f(@l ColumnScope columnScope0, boolean z, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s2;
        ExitTransition exitTransition2;
        EnterTransition enterTransition1;
        String s1;
        ExitTransition exitTransition1;
        Modifier modifier1;
        int v2;
        L.p(columnScope0, "<this>");
        L.p(p0, "content");
        Composer composer1 = composer0.G(1766503102);
        if((v1 & 1) == 0) {
            v2 = (v & 0x70) == 0 ? (composer1.v(z) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x380) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.t(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
            exitTransition1 = exitTransition0;
        }
        else if((v & 0xE000) == 0) {
            exitTransition1 = exitTransition0;
            v2 |= (composer1.t(exitTransition1) ? 0x4000 : 0x2000);
        }
        else {
            exitTransition1 = exitTransition0;
        }
        if((v1 & 16) == 0) {
            s1 = s;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(s1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.t(p0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x2DB6D1) != 0x92490 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
            if((v1 & 8) != 0) {
                exitTransition1 = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
            }
            if((v1 & 16) != 0) {
                s1 = "AnimatedVisibility";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(1766503102, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
            }
            AnimatedVisibilityKt.b(TransitionKt.o(Boolean.valueOf(z), s1, composer1, v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5.e, modifier2, enterTransition2, exitTransition1, p0, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            exitTransition2 = exitTransition1;
            s2 = s1;
            modifier1 = modifier2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.m();
            enterTransition1 = enterTransition0;
            exitTransition2 = exitTransition1;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(columnScope0, z, modifier1, enterTransition1, exitTransition2, s2, p0, v, v1) {
                final ColumnScope e;
                final boolean f;
                final Modifier g;
                final EnterTransition h;
                final ExitTransition i;
                final String j;
                final p k;
                final int l;
                final int m;

                {
                    this.e = columnScope0;
                    this.f = z;
                    this.g = modifier0;
                    this.h = enterTransition0;
                    this.i = exitTransition0;
                    this.j = s;
                    this.k = p0;
                    this.l = v;
                    this.m = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.f(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, this.l | 1, this.m);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5 e;

            static {
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5.e = new androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5();
            }

            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.5() {
                super(1);
            }

            @l
            public final Boolean b(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }

    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void g(@l RowScope rowScope0, @l MutableTransitionState mutableTransitionState0, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s2;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        String s1;
        int v2;
        L.p(rowScope0, "<this>");
        L.p(mutableTransitionState0, "visibleState");
        L.p(p0, "content");
        Composer composer1 = composer0.G(836509870);
        if((v1 & 1) == 0) {
            v2 = (v & 0x70) == 0 ? (composer1.t(mutableTransitionState0) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.t(exitTransition0) ? 0x4000 : 0x2000);
        }
        if((v1 & 16) == 0) {
            s1 = s;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(s1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.t(p0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x2DB6D1) != 0x92490 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            if((v1 & 16) != 0) {
                s1 = "AnimatedVisibility";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(836509870, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
            }
            AnimatedVisibilityKt.b(TransitionKt.n(mutableTransitionState0, s1, composer1, MutableTransitionState.d | v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9.e, modifier2, enterTransition2, exitTransition2, p0, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            s2 = s1;
            enterTransition1 = enterTransition2;
            exitTransition1 = exitTransition2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(rowScope0, mutableTransitionState0, modifier1, enterTransition1, exitTransition1, s2, p0, v, v1) {
                final RowScope e;
                final MutableTransitionState f;
                final Modifier g;
                final EnterTransition h;
                final ExitTransition i;
                final String j;
                final p k;
                final int l;
                final int m;

                {
                    this.e = rowScope0;
                    this.f = mutableTransitionState0;
                    this.g = modifier0;
                    this.h = enterTransition0;
                    this.i = exitTransition0;
                    this.j = s;
                    this.k = p0;
                    this.l = v;
                    this.m = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.g(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, this.l | 1, this.m);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9 e;

            static {
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9.e = new androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9();
            }

            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.9() {
                super(1);
            }

            @l
            public final Boolean b(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }

    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void h(@l RowScope rowScope0, boolean z, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s2;
        ExitTransition exitTransition2;
        EnterTransition enterTransition1;
        String s1;
        ExitTransition exitTransition1;
        Modifier modifier1;
        int v2;
        L.p(rowScope0, "<this>");
        L.p(p0, "content");
        Composer composer1 = composer0.G(-1741346906);
        if((v1 & 1) == 0) {
            v2 = (v & 0x70) == 0 ? (composer1.v(z) ? 0x20 : 16) | v : v;
        }
        else {
            v2 = v | 0x30;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x380) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.t(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(enterTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 8) != 0) {
            v2 |= 0x6000;
            exitTransition1 = exitTransition0;
        }
        else if((v & 0xE000) == 0) {
            exitTransition1 = exitTransition0;
            v2 |= (composer1.t(exitTransition1) ? 0x4000 : 0x2000);
        }
        else {
            exitTransition1 = exitTransition0;
        }
        if((v1 & 16) == 0) {
            s1 = s;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(s1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.t(p0) ? 0x100000 : 0x80000);
        }
        if((v2 & 0x2DB6D1) != 0x92490 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
            if((v1 & 8) != 0) {
                exitTransition1 = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
            }
            if((v1 & 16) != 0) {
                s1 = "AnimatedVisibility";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(-1741346906, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
            }
            AnimatedVisibilityKt.b(TransitionKt.o(Boolean.valueOf(z), s1, composer1, v2 >> 3 & 14 | v2 >> 12 & 0x70, 0), androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3.e, modifier2, enterTransition2, exitTransition1, p0, composer1, v2 & 0xE000 | (v2 & 0x380 | 0x30 | v2 & 0x1C00) | v2 >> 3 & 0x70000);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            exitTransition2 = exitTransition1;
            s2 = s1;
            modifier1 = modifier2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.m();
            enterTransition1 = enterTransition0;
            exitTransition2 = exitTransition1;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(rowScope0, z, modifier1, enterTransition1, exitTransition2, s2, p0, v, v1) {
                final RowScope e;
                final boolean f;
                final Modifier g;
                final EnterTransition h;
                final ExitTransition i;
                final String j;
                final p k;
                final int l;
                final int m;

                {
                    this.e = rowScope0;
                    this.f = z;
                    this.g = modifier0;
                    this.h = enterTransition0;
                    this.i = exitTransition0;
                    this.j = s;
                    this.k = p0;
                    this.l = v;
                    this.m = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.h(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, this.l | 1, this.m);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3 e;

            static {
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3.e = new androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3();
            }

            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.3() {
                super(1);
            }

            @l
            public final Boolean b(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }

    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void i(boolean z, @m Modifier modifier0, @m EnterTransition enterTransition0, @m ExitTransition exitTransition0, @m String s, @l p p0, @m Composer composer0, int v, int v1) {
        String s2;
        ExitTransition exitTransition1;
        EnterTransition enterTransition1;
        Modifier modifier1;
        String s1;
        int v2;
        L.p(p0, "content");
        Composer composer1 = composer0.G(0x7C7F8C4E);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.v(z) ? 4 : 2) | v : v;
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
            v2 |= (composer1.t(enterTransition0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(exitTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            s1 = s;
        }
        else if((v & 0xE000) == 0) {
            s1 = s;
            v2 |= (composer1.t(s1) ? 0x4000 : 0x2000);
        }
        else {
            s1 = s;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.t(p0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            EnterTransition enterTransition2 = (v1 & 4) == 0 ? enterTransition0 : EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            ExitTransition exitTransition2 = (v1 & 8) == 0 ? exitTransition0 : EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            if((v1 & 16) != 0) {
                s1 = "AnimatedVisibility";
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x7C7F8C4E, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
            }
            AnimatedVisibilityKt.b(TransitionKt.o(Boolean.valueOf(z), s1, composer1, v2 & 14 | v2 >> 9 & 0x70, 0), androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1.e, modifier2, enterTransition2, exitTransition2, p0, composer1, v2 << 3 & 0xE000 | (v2 << 3 & 0x380 | 0x30 | v2 << 3 & 0x1C00) | v2 & 0x70000);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            s2 = s1;
            exitTransition1 = exitTransition2;
            enterTransition1 = enterTransition2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            enterTransition1 = enterTransition0;
            exitTransition1 = exitTransition0;
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(z, modifier1, enterTransition1, exitTransition1, s2, p0, v, v1) {
                final boolean e;
                final Modifier f;
                final EnterTransition g;
                final ExitTransition h;
                final String i;
                final p j;
                final int k;
                final int l;

                {
                    this.e = z;
                    this.f = modifier0;
                    this.g = enterTransition0;
                    this.h = exitTransition0;
                    this.i = s;
                    this.j = p0;
                    this.k = v;
                    this.l = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.i(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1, this.l);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1 extends N implements Function1 {
            public static final androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1 e;

            static {
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1.e = new androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1();
            }

            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility.1() {
                super(1);
            }

            @l
            public final Boolean b(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }

    }

    @ExperimentalAnimationApi
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @k(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @c0(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    public static final void j(boolean z, @m Modifier modifier0, @l EnterTransition enterTransition0, @l ExitTransition exitTransition0, boolean z1, @l o o0, @m Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        L.p(enterTransition0, "enter");
        L.p(exitTransition0, "exit");
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x42D9FD54);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.v(z) ? 4 : 2) | v : v;
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
            v2 |= (composer1.t(enterTransition0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(exitTransition0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.v(z1) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.t(o0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            Modifier modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x42D9FD54, v2, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
            }
            composer1.V(0xE2A708A4);
            MutableTransitionState mutableTransitionState0 = composer1.W();
            if(mutableTransitionState0 == Composer.a.a()) {
                mutableTransitionState0 = new MutableTransitionState(Boolean.valueOf(z1));
                composer1.O(mutableTransitionState0);
            }
            composer1.g0();
            mutableTransitionState0.g(Boolean.valueOf(z));
            AnimatedVisibilityKt.c(mutableTransitionState0, modifier2, enterTransition0, exitTransition0, null, ComposableLambdaKt.b(composer1, 0x76FD702C, true, new p(o0, v2) {
                final o e;
                final int f;

                {
                    this.e = o0;
                    this.f = v;
                    super(3);
                }

                @Composable
                public final void a(@l AnimatedVisibilityScope animatedVisibilityScope0, @m Composer composer0, int v) {
                    L.p(animatedVisibilityScope0, "$this$AnimatedVisibility");
                    if((v & 81) == 16 && composer0.c()) {
                        composer0.m();
                        return;
                    }
                    if(ComposerKt.g0()) {
                        ComposerKt.w0(0x76FD702C, v, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
                    }
                    this.e.invoke(composer0, ((int)(this.f >> 15 & 14)));
                    if(ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((AnimatedVisibilityScope)object0), ((Composer)object1), ((Number)object2).intValue());
                    return S0.a;
                }
            }), composer1, MutableTransitionState.d | 0x30000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00, 16);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(z, modifier1, enterTransition0, exitTransition0, z1, o0, v, v1) {
                final boolean e;
                final Modifier f;
                final EnterTransition g;
                final ExitTransition h;
                final boolean i;
                final o j;
                final int k;
                final int l;

                {
                    this.e = z;
                    this.f = modifier0;
                    this.g = enterTransition0;
                    this.h = exitTransition0;
                    this.i = z1;
                    this.j = o0;
                    this.k = v;
                    this.l = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AnimatedVisibilityKt.j(this.e, this.f, this.g, this.h, this.i, this.j, composer0, this.k | 1, this.l);
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
    private static final EnterExitState l(Transition transition0, Function1 function10, Object object0, Composer composer0, int v) {
        EnterExitState enterExitState0;
        composer0.V(0x158D233E);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x158D233E, v, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        composer0.a0(0xD4F9A240, transition0);
        if(!transition0.t()) {
            composer0.V(0xE2A708A4);
            MutableState mutableState0 = composer0.W();
            if(mutableState0 == Composer.a.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
                composer0.O(mutableState0);
            }
            composer0.g0();
            if(((Boolean)function10.invoke(transition0.h())).booleanValue()) {
                mutableState0.setValue(Boolean.TRUE);
            }
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                enterExitState0 = EnterExitState.b;
            }
            else {
                enterExitState0 = ((Boolean)mutableState0.getValue()).booleanValue() ? EnterExitState.c : EnterExitState.a;
            }
        }
        else if(((Boolean)function10.invoke(object0)).booleanValue()) {
            enterExitState0 = EnterExitState.b;
        }
        else if(((Boolean)function10.invoke(transition0.h())).booleanValue()) {
            enterExitState0 = EnterExitState.c;
        }
        else {
            enterExitState0 = EnterExitState.a;
        }
        composer0.f0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return enterExitState0;
    }
}

