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
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,108:1\n36#2:109\n36#2:116\n460#2,13:142\n83#2,3:156\n25#2:165\n25#2:173\n50#2:180\n49#2:181\n36#2:188\n36#2:195\n473#2,3:202\n1114#3,6:110\n1114#3,6:117\n1114#3,6:159\n1114#3,6:166\n1114#3,6:174\n1114#3,6:182\n1114#3,6:189\n1114#3,6:196\n67#4,6:123\n73#4:155\n77#4:206\n75#5:129\n76#5,11:131\n89#5:205\n76#6:130\n76#6:172\n76#7:207\n102#7,2:208\n76#7:210\n102#7,2:211\n76#7:213\n76#7:214\n76#7:215\n76#7:216\n76#7:217\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType\n*L\n31#1:109\n32#1:116\n33#1:142,13\n36#1:156,3\n61#1:165\n67#1:173\n72#1:180\n72#1:181\n77#1:188\n86#1:195\n33#1:202,3\n31#1:110,6\n32#1:117,6\n36#1:159,6\n61#1:166,6\n67#1:174,6\n72#1:182,6\n77#1:189,6\n86#1:196,6\n33#1:123,6\n33#1:155\n33#1:206\n33#1:129\n33#1:131,11\n33#1:205\n33#1:130\n66#1:172\n31#1:207\n31#1:208,2\n32#1:210\n32#1:211,2\n61#1:213\n67#1:214\n72#1:215\n77#1:216\n86#1:217\n*E\n"})
public final class e extends b {
    @l
    private final a b;
    @l
    private final a c;
    public static final int d;

    static {
    }

    public e() {
        this(null, null, 3, null);
    }

    public e(@l a a0, @l a a1) {
        L.p(a0, "dotsGraphic");
        L.p(a1, "wormDotGraphic");
        super();
        this.b = a0;
        this.c = a1;
    }

    public e(a a0, a a1, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new a(0.0f, 0L, null, null, 0L, 0x1F, null);
        }
        if((v & 2) != 0) {
            a1 = new a(0.0f, 0xFFFFFFFF00000000L, null, null, 0L, 29, null);
        }
        this(a0, a1);
    }

    @Override  // com.tbuonomo.viewpagerdotsindicator.compose.type.b
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void a(@l A3.a a0, @l Modifier modifier0, int v, float f, @m Function1 function10, @m Composer composer0, int v1) {
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.a extends N implements Function1 {
            final int e;
            final MutableState f;
            final MutableState g;
            final e h;
            final Function1 i;
            final int j;

            com.tbuonomo.viewpagerdotsindicator.compose.type.e.a(int v, MutableState mutableState0, MutableState mutableState1, e e0, Function1 function10, int v1) {
                this.e = v;
                this.f = mutableState0;
                this.g = mutableState1;
                this.h = e0;
                this.i = function10;
                this.j = v1;
                super(1);
            }

            public final void a(@l LazyListScope lazyListScope0) {
                @s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$1$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n36#2:109\n36#2:116\n50#2:123\n49#2:124\n1114#3,6:110\n1114#3,6:117\n1114#3,6:125\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$1$1$1\n*L\n40#1:109\n45#1:116\n51#1:123\n51#1:124\n40#1:110,6\n45#1:117,6\n51#1:125,6\n*E\n"})
                static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a extends N implements q {
                    final MutableState e;
                    final int f;
                    final MutableState g;
                    final e h;
                    final Function1 i;
                    final int j;

                    com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a(MutableState mutableState0, int v, MutableState mutableState1, e e0, Function1 function10, int v1) {
                        this.e = mutableState0;
                        this.f = v;
                        this.g = mutableState1;
                        this.h = e0;
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
                        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.a extends N implements A3.a {
                            final Function1 e;
                            final int f;

                            com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.a(Function1 function10, int v) {
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


                        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.b extends N implements Function1 {
                            final MutableState e;

                            com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.b(MutableState mutableState0) {
                                this.e = mutableState0;
                                super(1);
                            }

                            public final void a(@l LayoutCoordinates layoutCoordinates0) {
                                L.p(layoutCoordinates0, "it");
                                float f = Offset.p(LayoutCoordinatesKt.e(layoutCoordinates0));
                                e.h(this.e, f);
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
                                e.j(this.e, f);
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
                            ComposerKt.w0(0x5EF59F0D, v1, -1, "com.tbuonomo.viewpagerdotsindicator.compose.type.WormIndicatorType.IndicatorTypeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WormIndicatorType.kt:36)");
                        }
                        if(v == 0) {
                            composer0.V(1027879377);
                            Companion modifier$Companion0 = Modifier.m0;
                            MutableState mutableState0 = this.e;
                            composer0.V(0x44FAF204);
                            boolean z = composer0.t(mutableState0);
                            com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.b e$a$a$b0 = composer0.W();
                            if(z || e$a$a$b0 == Composer.a.a()) {
                                e$a$a$b0 = new com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.b(mutableState0);
                                composer0.O(e$a$a$b0);
                            }
                            composer0.g0();
                            modifier0 = OnGloballyPositionedModifierKt.a(modifier$Companion0, e$a$a$b0);
                            composer0.g0();
                        }
                        else if(v == this.f - 1) {
                            composer0.V(0x3D4432CF);
                            Companion modifier$Companion1 = Modifier.m0;
                            MutableState mutableState1 = this.g;
                            composer0.V(0x44FAF204);
                            boolean z1 = composer0.t(mutableState1);
                            c e$a$a$c0 = composer0.W();
                            if(z1 || e$a$a$c0 == Composer.a.a()) {
                                e$a$a$c0 = new c(mutableState1);
                                composer0.O(e$a$a$c0);
                            }
                            composer0.g0();
                            modifier0 = OnGloballyPositionedModifierKt.a(modifier$Companion1, e$a$a$c0);
                            composer0.g0();
                        }
                        else {
                            composer0.V(1027879876);
                            composer0.g0();
                            modifier0 = Modifier.m0;
                        }
                        a a0 = this.h.b;
                        Function1 function10 = this.i;
                        composer0.V(0x1E7B2B64);
                        boolean z2 = composer0.t(this.i);
                        boolean z3 = composer0.t(v);
                        com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.a e$a$a$a0 = composer0.W();
                        if(z2 || z3 || e$a$a$a0 == Composer.a.a()) {
                            e$a$a$a0 = new com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a.a(function10, v);
                            composer0.O(e$a$a$a0);
                        }
                        composer0.g0();
                        com.tbuonomo.viewpagerdotsindicator.compose.a.a(a0, ClickableKt.e(modifier0, false, null, null, e$a$a$a0, 7, null), composer0, 0);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }
                }

                L.p(lazyListScope0, "$this$LazyRow");
                ComposableLambda composableLambda0 = ComposableLambdaKt.c(0x5EF59F0D, true, new com.tbuonomo.viewpagerdotsindicator.compose.type.e.a.a(this.f, this.e, this.g, this.h, this.i, this.j));
                LazyListScope.-CC.l(lazyListScope0, this.e, null, null, composableLambda0, 6, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((LazyListScope)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$centeredOffset$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,108:1\n58#2:109\n75#2:110\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$centeredOffset$2$1\n*L\n63#1:109\n63#1:110\n*E\n"})
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.b extends N implements A3.a {
            final e e;

            com.tbuonomo.viewpagerdotsindicator.compose.type.e.b(e e0) {
                this.e = e0;
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


        @s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$distanceBetween2DotsDp$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,108:1\n174#2:109\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$distanceBetween2DotsDp$2$1\n*L\n69#1:109\n*E\n"})
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.c extends N implements A3.a {
            final int e;
            final float f;
            final MutableState g;
            final MutableState h;

            com.tbuonomo.viewpagerdotsindicator.compose.type.e.c(int v, float f, MutableState mutableState0, MutableState mutableState1) {
                this.e = v;
                this.f = f;
                this.g = mutableState0;
                this.h = mutableState1;
                super(0);
            }

            public final float b() {
                return Dp.g((e.i(this.g) - e.b(this.h)) / ((float)(this.e - 1)) / this.f);
            }

            @Override  // A3.a
            public Object invoke() {
                return Dp.d(this.b());
            }
        }


        @s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$foregroundDotOffsetDp$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,108:1\n164#2:109\n51#3:110\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$foregroundDotOffsetDp$2$1\n*L\n92#1:109\n92#1:110\n*E\n"})
        static final class d extends N implements A3.a {
            final int e;
            final A3.a f;
            final float g;
            final MutableState h;
            final MutableState i;
            final State j;

            d(int v, A3.a a0, float f, MutableState mutableState0, MutableState mutableState1, State state0) {
                this.e = v;
                this.f = a0;
                this.g = f;
                this.h = mutableState0;
                this.i = mutableState1;
                this.j = state0;
                super(0);
            }

            public final float b() {
                double f = (double)e.b(this.h);
                float f1 = e.i(this.i);
                float f2 = e.b(this.h);
                double f3 = Math.floor(((Number)this.f.invoke()).floatValue());
                float f4 = e.g(this.j);
                return Dp.g(Dp.g(((float)((f + ((double)((f1 - f2) / ((float)(this.e - 1)))) * f3) / ((double)this.g)))) + f4);
            }

            @Override  // A3.a
            public Object invoke() {
                return Dp.d(this.b());
            }
        }


        @s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$paddingStartAndEnd$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,108:1\n88#2:109\n88#2:110\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$paddingStartAndEnd$2$1\n*L\n81#1:109\n82#1:110\n*E\n"})
        static final class com.tbuonomo.viewpagerdotsindicator.compose.type.e.e extends N implements A3.a {
            final A3.a e;
            final State f;

            com.tbuonomo.viewpagerdotsindicator.compose.type.e.e(A3.a a0, State state0) {
                this.e = a0;
                this.f = state0;
                super(0);
            }

            @l
            public final V b() {
                float f = s.H(((Number)this.e.invoke()).floatValue() % 1.0f * 2.0f, 0.0f, 1.0f);
                float f1 = s.H((((Number)this.e.invoke()).floatValue() % 1.0f - 0.5f) * 2.0f, 0.0f, 1.0f);
                float f2 = Dp.g(e.c(this.f) * f1);
                float f3 = Dp.g(e.c(this.f) * (1.0f - f));
                return r0.a(Dp.d(f2), Dp.d(f3));
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        @s0({"SMAP\nWormIndicatorType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$selectorDotWidthDp$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,108:1\n51#2:109\n*S KotlinDebug\n*F\n+ 1 WormIndicatorType.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/type/WormIndicatorType$IndicatorTypeComposable$1$selectorDotWidthDp$2$1\n*L\n74#1:109\n*E\n"})
        static final class f extends N implements A3.a {
            final e e;
            final State f;

            f(e e0, State state0) {
                this.e = e0;
                this.f = state0;
                super(0);
            }

            public final float b() {
                return Dp.g(e.c(this.f) + this.e.c.l());
            }

            @Override  // A3.a
            public Object invoke() {
                return Dp.d(this.b());
            }
        }


        static final class g extends N implements o {
            final e e;
            final A3.a f;
            final Modifier g;
            final int h;
            final float i;
            final Function1 j;
            final int k;

            g(e e0, A3.a a0, Modifier modifier0, int v, float f, Function1 function10, int v1) {
                this.e = e0;
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

        MutableState mutableState3;
        MutableState mutableState2;
        L.p(a0, "globalOffsetProvider");
        L.p(modifier0, "modifier");
        Composer composer1 = composer0.G(-1305022574);
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
                ComposerKt.w0(-1305022574, v2, -1, "com.tbuonomo.viewpagerdotsindicator.compose.type.WormIndicatorType.IndicatorTypeComposable (WormIndicatorType.kt:23)");
            }
            composer1.V(0x44FAF204);
            boolean z = composer1.t(v);
            MutableState mutableState0 = composer1.W();
            if(z || mutableState0 == Composer.a.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(-1.0f, null, 2, null);
                composer1.O(mutableState0);
            }
            composer1.g0();
            composer1.V(0x44FAF204);
            boolean z1 = composer1.t(v);
            MutableState mutableState1 = composer1.W();
            if(z1 || mutableState1 == Composer.a.a()) {
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
            boolean z2 = false;
            for(int v3 = 0; v3 < 5; ++v3) {
                z2 |= composer1.t(arr_object[v3]);
            }
            com.tbuonomo.viewpagerdotsindicator.compose.type.e.a e$a0 = composer1.W();
            if(z2 || e$a0 == Composer.a.a()) {
                mutableState2 = mutableState0;
                com.tbuonomo.viewpagerdotsindicator.compose.type.e.a e$a1 = new com.tbuonomo.viewpagerdotsindicator.compose.type.e.a(v, mutableState0, mutableState1, this, function10, v2);
                composer1.O(e$a1);
                e$a0 = e$a1;
            }
            else {
                mutableState2 = mutableState0;
            }
            composer1.g0();
            LazyDslKt.d(modifier1, null, paddingValues0, false, arrangement$Horizontal0, null, null, false, e$a0, composer1, 6, 0xEA);
            if(e.b(mutableState2) != -1.0f && e.i(mutableState1) != -1.0f) {
                composer1.V(0xE2A708A4);
                State state0 = composer1.W();
                androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.a;
                if(state0 == composer$Companion0.a()) {
                    state0 = SnapshotStateKt.c(new com.tbuonomo.viewpagerdotsindicator.compose.type.e.b(this));
                    composer1.O(state0);
                }
                composer1.g0();
                float f1 = ((Density)composer1.L(CompositionLocalsKt.i())).getDensity();
                composer1.V(0xE2A708A4);
                State state1 = composer1.W();
                if(state1 == composer$Companion0.a()) {
                    mutableState3 = mutableState2;
                    state1 = SnapshotStateKt.c(new com.tbuonomo.viewpagerdotsindicator.compose.type.e.c(v, f1, mutableState1, mutableState3));
                    composer1.O(state1);
                }
                else {
                    mutableState3 = mutableState2;
                }
                composer1.g0();
                Float float0 = e.i(mutableState1);
                Float float1 = e.b(mutableState3);
                composer1.V(0x1E7B2B64);
                boolean z3 = composer1.t(float0);
                boolean z4 = composer1.t(float1);
                State state2 = composer1.W();
                if(z3 || z4 || state2 == composer$Companion0.a()) {
                    state2 = SnapshotStateKt.c(new f(this, state1));
                    composer1.O(state2);
                }
                composer1.g0();
                Object object0 = a0.invoke();
                composer1.V(0x44FAF204);
                boolean z5 = composer1.t(object0);
                State state3 = composer1.W();
                if(z5 || state3 == composer$Companion0.a()) {
                    state3 = SnapshotStateKt.c(new com.tbuonomo.viewpagerdotsindicator.compose.type.e.e(a0, state1));
                    composer1.O(state3);
                }
                composer1.g0();
                composer1.V(0x44FAF204);
                boolean z6 = composer1.t(a0);
                State state4 = composer1.W();
                if(z6 || state4 == composer$Companion0.a()) {
                    state4 = SnapshotStateKt.c(new d(v, a0, f1, mutableState3, mutableState1, state0));
                    composer1.O(state4);
                }
                composer1.g0();
                float f2 = e.f(state4);
                float f3 = e.g(state0);
                Modifier modifier2 = PaddingKt.o(SizeKt.H(OffsetKt.e(Modifier.m0, f2, f3), e.d(state2)), ((Dp)e.e(state3).e()).w(), 0.0f, ((Dp)e.e(state3).f()).w(), 0.0f, 10, null);
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
            scopeUpdateScope0.a(new g(this, a0, modifier0, v, f, function10, v1));
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

    private static final V e(State state0) {
        return (V)state0.getValue();
    }

    private static final float f(State state0) {
        return ((Dp)state0.getValue()).w();
    }

    private static final float g(State state0) {
        return ((Dp)state0.getValue()).w();
    }

    private static final void h(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    private static final float i(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    private static final void j(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }
}

