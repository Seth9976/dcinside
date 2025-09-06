package com.tbuonomo.viewpagerdotsindicator.compose.type;

import A3.o;
import A3.p;
import A3.q;
import M2.a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
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
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSpringIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/SpringIndicatorType\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,101:1\n50#2:102\n49#2:103\n50#2:110\n49#2:111\n460#2,13:137\n83#2,3:151\n25#2:160\n36#2:168\n473#2,3:175\n1114#3,6:104\n1114#3,6:112\n1114#3,6:154\n1114#3,6:161\n1114#3,6:169\n67#4,6:118\n73#4:150\n77#4:179\n75#5:124\n76#5,11:126\n89#5:178\n76#6:125\n76#6:167\n174#7:180\n51#8:181\n76#9:182\n102#9,2:183\n76#9:185\n102#9,2:186\n76#9:188\n76#9:189\n*S KotlinDebug\n*F\n+ 1 SpringIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/SpringIndicatorType\n*L\n30#1:102\n30#1:103\n31#1:110\n31#1:111\n32#1:137,13\n35#1:151,3\n60#1:160\n66#1:168\n32#1:175,3\n30#1:104,6\n31#1:112,6\n35#1:154,6\n60#1:161,6\n66#1:169,6\n32#1:118,6\n32#1:150\n32#1:179\n32#1:124\n32#1:126,11\n32#1:178\n32#1:125\n65#1:167\n98#1:180\n99#1:181\n30#1:182\n30#1:183,2\n31#1:185\n31#1:186,2\n60#1:188\n66#1:189\n*E\n"})
public final class d extends b {
    @l
    private final a b;
    @l
    private final a c;
    public static final int d;

    static {
    }

    public d() {
        this(null, null, 3, null);
    }

    public d(@l a a0, @l a a1) {
        L.p(a0, "dotsGraphic");
        L.p(a1, "selectorDotGraphic");
        super();
        this.b = a0;
        this.c = a1;
    }

    public d(a a0, a a1, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new a(0.0f, 0L, null, null, 0L, 0x1F, null);
        }
        if((v & 2) != 0) {
            a1 = new a(0.0f, 0xFF00000000000000L, null, null, 0L, 29, null);
        }
        this(a0, a1);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.compose.type.b
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void a(@l A3.a a0, @l Modifier modifier0, int v, float f, @m Function1 function10, @m Composer composer0, int v1) {
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.a extends N implements Function1 {
            final int e;
            final MutableState f;
            final MutableState g;
            final d h;
            final Function1 i;
            final int j;

            com.tbuonomo.viewpagerdotsindicator.compose.type.d.a(int v, MutableState mutableState0, MutableState mutableState1, d d0, Function1 function10, int v1) {
                this.e = v;
                this.f = mutableState0;
                this.g = mutableState1;
                this.h = d0;
                this.i = function10;
                this.j = v1;
                super(1);
            }

            public final void a(@l LazyListScope lazyListScope0) {
                @s0({"SMAP\nSpringIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/SpringIndicatorType$IndicatorTypeComposable$1$1$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n36#2:102\n36#2:109\n50#2:116\n49#2:117\n1114#3,6:103\n1114#3,6:110\n1114#3,6:118\n*S KotlinDebug\n*F\n+ 1 SpringIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/SpringIndicatorType$IndicatorTypeComposable$1$1$1$1\n*L\n39#1:102\n44#1:109\n50#1:116\n50#1:117\n39#1:103,6\n44#1:110,6\n50#1:118,6\n*E\n"})
                static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a extends N implements q {
                    final MutableState e;
                    final int f;
                    final MutableState g;
                    final d h;
                    final Function1 i;
                    final int j;

                    com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a(MutableState mutableState0, int v, MutableState mutableState1, d d0, Function1 function10, int v1) {
                        this.e = mutableState0;
                        this.f = v;
                        this.g = mutableState1;
                        this.h = d0;
                        this.i = function10;
                        this.j = v1;
                        super(4);
                    }

                    @Override  // A3.q
                    public Object T0(Object object0, Object object1, Object object2, Object object3) {
                        this.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                        return S0.a;
                    }

                    @Composable
                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    public final void a(@l LazyItemScope lazyItemScope0, int v, @m Composer composer0, int v1) {
                        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.a extends N implements A3.a {
                            final Function1 e;
                            final int f;

                            com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.a(Function1 function10, int v) {
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


                        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.b extends N implements Function1 {
                            final MutableState e;

                            com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.b(MutableState mutableState0) {
                                this.e = mutableState0;
                                super(1);
                            }

                            public final void a(@l LayoutCoordinates layoutCoordinates0) {
                                L.p(layoutCoordinates0, "it");
                                float f = Offset.p(LayoutCoordinatesKt.e(layoutCoordinates0));
                                d.e(this.e, f);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((LayoutCoordinates)object0));
                                return S0.a;
                            }
                        }


                        static final class c extends N implements Function1 {
                            final MutableState e;

                            c(MutableState mutableState0) {
                                this.e = mutableState0;
                                super(1);
                            }

                            public final void a(@l LayoutCoordinates layoutCoordinates0) {
                                L.p(layoutCoordinates0, "it");
                                float f = Offset.p(LayoutCoordinatesKt.e(layoutCoordinates0));
                                d.g(this.e, f);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((LayoutCoordinates)object0));
                                return S0.a;
                            }
                        }

                        Modifier modifier0;
                        L.p(lazyItemScope0, "$this$items");
                        if((v1 & 0x70) == 0) {
                            v1 |= (composer0.z(v) ? 0x20 : 16);
                        }
                        if((v1 & 721) == 0x90 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(38602305, v1, -1, "com.tbuonomo.viewpagerdotsindicator.compose.type.SpringIndicatorType.IndicatorTypeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpringIndicatorType.kt:35)");
                        }
                        if(v == 0) {
                            composer0.V(0x5B6DEF92);
                            Companion modifier$Companion0 = Modifier.m0;
                            MutableState mutableState0 = this.e;
                            composer0.V(0x44FAF204);
                            boolean z = composer0.t(mutableState0);
                            com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.b d$a$a$b0 = composer0.W();
                            if(z || d$a$a$b0 == Composer.a.a()) {
                                d$a$a$b0 = new com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.b(mutableState0);
                                composer0.O(d$a$a$b0);
                            }
                            composer0.g0();
                            modifier0 = OnGloballyPositionedModifierKt.a(modifier$Companion0, d$a$a$b0);
                            composer0.g0();
                        }
                        else if(v == this.f - 1) {
                            composer0.V(0x5B6DF090);
                            Companion modifier$Companion1 = Modifier.m0;
                            MutableState mutableState1 = this.g;
                            composer0.V(0x44FAF204);
                            boolean z1 = composer0.t(mutableState1);
                            c d$a$a$c0 = composer0.W();
                            if(z1 || d$a$a$c0 == Composer.a.a()) {
                                d$a$a$c0 = new c(mutableState1);
                                composer0.O(d$a$a$c0);
                            }
                            composer0.g0();
                            modifier0 = OnGloballyPositionedModifierKt.a(modifier$Companion1, d$a$a$c0);
                            composer0.g0();
                        }
                        else {
                            composer0.V(0x5B6DF185);
                            composer0.g0();
                            modifier0 = Modifier.m0;
                        }
                        a a0 = this.h.b;
                        Function1 function10 = this.i;
                        composer0.V(0x1E7B2B64);
                        boolean z2 = composer0.t(this.i);
                        boolean z3 = composer0.t(v);
                        com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.a d$a$a$a0 = composer0.W();
                        if(z2 || z3 || d$a$a$a0 == Composer.a.a()) {
                            d$a$a$a0 = new com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a.a(function10, v);
                            composer0.O(d$a$a$a0);
                        }
                        composer0.g0();
                        com.tbuonomo.viewpagerdotsindicator.compose.a.a(a0, ClickableKt.e(modifier0, false, null, null, d$a$a$a0, 7, null), composer0, 0);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }
                }

                L.p(lazyListScope0, "$this$LazyRow");
                ComposableLambda composableLambda0 = ComposableLambdaKt.c(38602305, true, new com.tbuonomo.viewpagerdotsindicator.compose.type.d.a.a(this.f, this.e, this.g, this.h, this.i, this.j));
                LazyListScope.-CC.l(lazyListScope0, this.e, null, null, composableLambda0, 6, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LazyListScope)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nSpringIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/SpringIndicatorType$IndicatorTypeComposable$1$centeredOffset$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,101:1\n58#2:102\n75#2:103\n*S KotlinDebug\n*F\n+ 1 SpringIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/SpringIndicatorType$IndicatorTypeComposable$1$centeredOffset$2$1\n*L\n62#1:102\n62#1:103\n*E\n"})
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.b extends N implements A3.a {
            final d e;

            com.tbuonomo.viewpagerdotsindicator.compose.type.d.b(d d0) {
                this.e = d0;
                super(0);
            }

            public final float b() {
                return Dp.g(Dp.g(this.e.b.l() - this.e.c.l()) / 2.0f);
            }

            @Override  // A3.a
            public Object invoke() {
                return Dp.d(this.b());
            }
        }


        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.c extends N implements A3.a {
            final d e;
            final int f;
            final A3.a g;
            final float h;
            final MutableState i;
            final MutableState j;
            final State k;

            com.tbuonomo.viewpagerdotsindicator.compose.type.d.c(d d0, int v, A3.a a0, float f, MutableState mutableState0, MutableState mutableState1, State state0) {
                this.e = d0;
                this.f = v;
                this.g = a0;
                this.h = f;
                this.i = mutableState0;
                this.j = mutableState1;
                this.k = state0;
                super(0);
            }

            public final float b() {
                float f = d.b(this.i);
                float f1 = d.f(this.j);
                float f2 = ((Number)this.g.invoke()).floatValue();
                float f3 = d.d(this.k);
                return this.e.p(f, f1, this.f, f2, this.h, f3);
            }

            @Override  // A3.a
            public Object invoke() {
                return Dp.d(this.b());
            }
        }


        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.d.d extends N implements o {
            final d e;
            final A3.a f;
            final Modifier g;
            final int h;
            final float i;
            final Function1 j;
            final int k;

            com.tbuonomo.viewpagerdotsindicator.compose.type.d.d(d d0, A3.a a0, Modifier modifier0, int v, float f, Function1 function10, int v1) {
                this.e = d0;
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
        Composer composer1 = composer0.G(1001950278);
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
                ComposerKt.w0(1001950278, v2, -1, "com.tbuonomo.viewpagerdotsindicator.compose.type.SpringIndicatorType.IndicatorTypeComposable (SpringIndicatorType.kt:22)");
            }
            composer1.V(0x1E7B2B64);
            boolean z = composer1.t(v);
            boolean z1 = composer1.t(this.b);
            MutableState mutableState0 = composer1.W();
            if(z || z1 || mutableState0 == Composer.a.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(-1.0f, null, 2, null);
                composer1.O(mutableState0);
            }
            composer1.g0();
            composer1.V(0x1E7B2B64);
            boolean z2 = composer1.t(v);
            boolean z3 = composer1.t(this.b);
            MutableState mutableState1 = composer1.W();
            if(z2 || z3 || mutableState1 == Composer.a.a()) {
                mutableState1 = SnapshotStateKt__SnapshotStateKt.g(-1.0f, null, 2, null);
                composer1.O(mutableState1);
            }
            composer1.g0();
            composer1.V(0x2BB5B5D7);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.a;
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
            Object[] arr_object = {v, mutableState0, mutableState1, this, function10};
            composer1.V(0xDE219177);
            boolean z4 = false;
            for(int v3 = 0; v3 < 5; ++v3) {
                z4 |= composer1.t(arr_object[v3]);
            }
            com.tbuonomo.viewpagerdotsindicator.compose.type.d.a d$a0 = composer1.W();
            if(z4 || d$a0 == Composer.a.a()) {
                com.tbuonomo.viewpagerdotsindicator.compose.type.d.a d$a1 = new com.tbuonomo.viewpagerdotsindicator.compose.type.d.a(v, mutableState0, mutableState1, this, function10, v2);
                composer1.O(d$a1);
                d$a0 = d$a1;
            }
            composer1.g0();
            LazyDslKt.d(modifier1, null, paddingValues0, false, arrangement$Horizontal0, null, null, false, d$a0, composer1, 6, 0xEA);
            if(d.b(mutableState0) != -1.0f && d.f(mutableState1) != -1.0f) {
                composer1.V(0xE2A708A4);
                State state0 = composer1.W();
                androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.a;
                if(state0 == composer$Companion0.a()) {
                    state0 = SnapshotStateKt.c(new com.tbuonomo.viewpagerdotsindicator.compose.type.d.b(this));
                    composer1.O(state0);
                }
                composer1.g0();
                float f1 = ((Density)composer1.L(CompositionLocalsKt.i())).getDensity();
                composer1.V(0x44FAF204);
                boolean z5 = composer1.t(a0);
                State state1 = composer1.W();
                if(z5 || state1 == composer$Companion0.a()) {
                    state1 = SnapshotStateKt.c(new com.tbuonomo.viewpagerdotsindicator.compose.type.d.c(this, v, a0, f1, mutableState0, mutableState1, state0));
                    composer1.O(state1);
                }
                composer1.g0();
                float f2 = d.c(state1);
                float f3 = d.d(state0);
                Modifier modifier2 = OffsetKt.e(Modifier.m0, f2, f3);
                com.tbuonomo.viewpagerdotsindicator.compose.a.a(this.c, modifier2, composer1, 0);
            }
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
            scopeUpdateScope0.a(new com.tbuonomo.viewpagerdotsindicator.compose.type.d.d(this, a0, modifier0, v, f, function10, v1));
        }
    }

    private static final float b(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    private static final float c(State state0) {
        return ((Dp)state0.getValue()).w();
    }

    private static final float d(State state0) {
        return ((Dp)state0.getValue()).w();
    }

    private static final void e(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    private static final float f(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    private static final void g(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    private final float p(float f, float f1, int v, float f2, float f3, float f4) {
        return Dp.g(Dp.g((f + (f1 - f) / ((float)(v - 1)) * f2) / f3) + f4);
    }
}

