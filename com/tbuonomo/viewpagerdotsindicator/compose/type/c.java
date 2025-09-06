package com.tbuonomo.viewpagerdotsindicator.compose.type;

import A3.o;
import A3.p;
import A3.q;
import M2.a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope.-CC;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nShiftIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShiftIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/ShiftIndicatorType\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,57:1\n67#2,6:58\n73#2:90\n77#2:104\n75#3:64\n76#3,11:66\n89#3:103\n76#4:65\n460#5,13:77\n83#5,3:91\n473#5,3:100\n1114#6,6:94\n178#7:105\n88#8:106\n51#8:107\n*S KotlinDebug\n*F\n+ 1 ShiftIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/ShiftIndicatorType\n*L\n27#1:58,6\n27#1:90\n27#1:104\n27#1:64\n27#1:66,11\n27#1:103\n27#1:65\n27#1:77,13\n29#1:91,3\n27#1:100,3\n29#1:94,6\n54#1:105\n54#1:106\n55#1:107\n*E\n"})
public final class c extends b {
    @l
    private final a b;
    private final float c;
    public static final int d;

    static {
    }

    public c() {
        this(null, 0.0f, 3, null);
    }

    public c(@l a a0, float f) {
        L.p(a0, "dotsGraphic");
        super();
        this.b = a0;
        this.c = f;
    }

    public c(a a0, float f, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new a(0.0f, 0L, null, null, 0L, 0x1F, null);
        }
        if((v & 2) != 0) {
            f = 3.0f;
        }
        this(a0, f);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.compose.type.b
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void a(@l A3.a a0, @l Modifier modifier0, int v, float f, @m Function1 function10, @m Composer composer0, int v1) {
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.c.a extends N implements Function1 {
            final int e;
            final A3.a f;
            final c g;
            final Function1 h;

            com.tbuonomo.viewpagerdotsindicator.compose.type.c.a(int v, A3.a a0, c c0, Function1 function10) {
                this.e = v;
                this.f = a0;
                this.g = c0;
                this.h = function10;
                super(1);
            }

            public final void a(@l LazyListScope lazyListScope0) {
                @s0({"SMAP\nShiftIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShiftIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/ShiftIndicatorType$IndicatorTypeComposable$1$1$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,57:1\n36#2:58\n36#2:65\n1114#3,6:59\n1114#3,6:66\n76#4:72\n76#4:73\n*S KotlinDebug\n*F\n+ 1 ShiftIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/ShiftIndicatorType$IndicatorTypeComposable$1$1$1$1\n*L\n31#1:58\n34#1:65\n31#1:59,6\n34#1:66,6\n31#1:72\n34#1:73\n*E\n"})
                static final class com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a extends N implements q {
                    final A3.a e;
                    final c f;
                    final Function1 g;

                    com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a(A3.a a0, c c0, Function1 function10) {
                        this.e = a0;
                        this.f = c0;
                        this.g = function10;
                        super(4);
                    }

                    @Override  // A3.q
                    public Object T0(Object object0, Object object1, Object object2, Object object3) {
                        this.b(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                        return S0.a;
                    }

                    @Composable
                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    public final void b(@l LazyItemScope lazyItemScope0, int v, @m Composer composer0, int v1) {
                        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.a extends N implements A3.a {
                            final Function1 e;
                            final int f;

                            com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.a(Function1 function10, int v) {
                                this.e = function10;
                                this.f = v;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                Function1 function10 = this.e;
                                if(function10 != null) {
                                    function10.invoke(this.f);
                                }
                            }
                        }


                        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.b extends N implements A3.a {
                            final c e;
                            final int f;
                            final A3.a g;

                            com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.b(c c0, int v, A3.a a0) {
                                this.e = c0;
                                this.f = v;
                                this.g = a0;
                                super(0);
                            }

                            public final float b() {
                                float f = ((Number)this.g.invoke()).floatValue();
                                return this.e.d(this.f, f);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return Dp.d(this.b());
                            }
                        }

                        L.p(lazyItemScope0, "$this$items");
                        if((((v1 & 0x70) == 0 ? (composer0.z(v) ? 0x20 : 16) | v1 : v1) & 721) == 0x90 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(1421800519, v1, -1, "com.tbuonomo.viewpagerdotsindicator.compose.type.ShiftIndicatorType.IndicatorTypeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShiftIndicatorType.kt:29)");
                        }
                        Object object0 = this.e.invoke();
                        c c0 = this.f;
                        A3.a a0 = this.e;
                        composer0.V(0x44FAF204);
                        boolean z = composer0.t(object0);
                        State state0 = composer0.W();
                        if(z || state0 == Composer.a.a()) {
                            state0 = SnapshotStateKt.c(new com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.b(c0, v, a0));
                            composer0.O(state0);
                        }
                        composer0.g0();
                        Dp dp0 = Dp.d(com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.c(state0));
                        Function1 function10 = this.g;
                        composer0.V(0x44FAF204);
                        boolean z1 = composer0.t(dp0);
                        MutableState mutableState0 = composer0.W();
                        if(z1 || mutableState0 == Composer.a.a()) {
                            float f = com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.c(state0);
                            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(ClickableKt.e(SizeKt.H(Modifier.m0, f), false, null, null, new com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.a(function10, v), 7, null), null, 2, null);
                            composer0.O(mutableState0);
                        }
                        composer0.g0();
                        com.tbuonomo.viewpagerdotsindicator.compose.a.a(this.f.b, com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a.d(mutableState0), composer0, 0);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    private static final float c(State state0) {
                        return ((Dp)state0.getValue()).w();
                    }

                    private static final Modifier d(MutableState mutableState0) {
                        return (Modifier)mutableState0.getValue();
                    }
                }

                L.p(lazyListScope0, "$this$LazyRow");
                ComposableLambda composableLambda0 = ComposableLambdaKt.c(1421800519, true, new com.tbuonomo.viewpagerdotsindicator.compose.type.c.a.a(this.f, this.g, this.h));
                LazyListScope.-CC.l(lazyListScope0, this.e, null, null, composableLambda0, 6, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LazyListScope)object0));
                return S0.a;
            }
        }


        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.c.b extends N implements o {
            final c e;
            final A3.a f;
            final Modifier g;
            final int h;
            final float i;
            final Function1 j;
            final int k;

            com.tbuonomo.viewpagerdotsindicator.compose.type.c.b(c c0, A3.a a0, Modifier modifier0, int v, float f, Function1 function10, int v1) {
                this.e = c0;
                this.f = a0;
                this.g = modifier0;
                this.h = v;
                this.i = f;
                this.j = function10;
                this.k = v1;
                super(2);
            }

            public final void a(@m Composer composer0, int v) {
                this.e.a(this.f, this.g, this.h, this.i, this.j, composer0, (this.k | 1) & -920350135 | ((0x24924924 & (this.k | 1)) >> 1 | 306783378 & (this.k | 1)) | (306783378 & (this.k | 1)) << 1 & (0x24924924 & (this.k | 1)));
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }

        L.p(a0, "globalOffsetProvider");
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(0xDCEE378C);
        int v2 = (v1 & 14) == 0 ? (composer1.Y(a0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.z(v) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.x(f) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.Y(function10) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.t(this) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDCEE378C, v2, -1, "com.tbuonomo.viewpagerdotsindicator.compose.type.ShiftIndicatorType.IndicatorTypeComposable (ShiftIndicatorType.kt:19)");
            }
            composer1.V(0x2BB5B5D7);
            Companion alignment$Companion0 = Alignment.a;
            MeasurePolicy measurePolicy0 = BoxKt.k(alignment$Companion0.C(), false, composer1, 0);
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            A3.a a1 = composeUiNode$Companion0.a();
            p p0 = LayoutKt.f(modifier0);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(a1);
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
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            Modifier modifier1 = SizeKt.n(Modifier.m0, 0.0f, 1, null);
            Horizontal arrangement$Horizontal0 = Arrangement.a.A(f, alignment$Companion0.m());
            PaddingValues paddingValues0 = PaddingKt.e(f, 0.0f, f, 0.0f, 10, null);
            Object[] arr_object = {v, a0, this, function10};
            composer1.V(0xDE219177);
            boolean z = false;
            for(int v3 = 0; v3 < 4; ++v3) {
                z |= composer1.t(arr_object[v3]);
            }
            com.tbuonomo.viewpagerdotsindicator.compose.type.c.a c$a0 = composer1.W();
            if(z || c$a0 == Composer.a.a()) {
                c$a0 = new com.tbuonomo.viewpagerdotsindicator.compose.type.c.a(v, a0, this, function10);
                composer1.O(c$a0);
            }
            composer1.g0();
            LazyDslKt.d(modifier1, null, paddingValues0, false, arrangement$Horizontal0, null, null, false, c$a0, composer1, 6, 0xEA);
            composer1.g0();
            composer1.g();
            composer1.g0();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new com.tbuonomo.viewpagerdotsindicator.compose.type.c.b(this, a0, modifier0, v, f, function10, v1));
        }
    }

    private final float d(int v, float f) {
        float f1 = s.A(Math.abs(((float)v) - f), 1.0f);
        float f2 = s.t(this.c - 1.0f, 0.0f);
        return Dp.g(this.b.l() + Dp.g(Dp.g(f2 * this.b.l()) * (1.0f - f1)));
    }
}

