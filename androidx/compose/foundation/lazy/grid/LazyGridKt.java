package androidx.compose.foundation.lazy.grid;

import A3.o;
import A3.p;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,364:1\n154#2:365\n474#3,4:366\n478#3,2:374\n482#3:380\n25#4:370\n50#4:381\n49#4:382\n83#4,3:390\n1114#5,3:371\n1117#5,3:377\n1114#5,6:383\n1114#5,6:393\n474#6:376\n76#7:389\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n60#1:365\n82#1:366,4\n82#1:374,2\n82#1:380\n82#1:370\n83#1:381\n83#1:382\n170#1:390,3\n82#1:371,3\n82#1:377,3\n83#1:383,6\n170#1:393,6\n82#1:376\n121#1:389\n*E\n"})
public final class LazyGridKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@m Modifier modifier0, @l LazyGridState lazyGridState0, @l o o0, @m PaddingValues paddingValues0, boolean z, boolean z1, @m FlingBehavior flingBehavior0, boolean z2, @l Vertical arrangement$Vertical0, @l Horizontal arrangement$Horizontal0, @l Function1 function10, @m Composer composer0, int v, int v1, int v2) {
        FlingBehavior flingBehavior1;
        PaddingValues paddingValues1;
        Modifier modifier1;
        boolean z3;
        boolean z4;
        int v5;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        PaddingValues paddingValues2;
        int v4;
        int v3;
        L.p(lazyGridState0, "state");
        L.p(o0, "slotSizesSums");
        L.p(arrangement$Vertical0, "verticalArrangement");
        L.p(arrangement$Horizontal0, "horizontalArrangement");
        L.p(function10, "content");
        Composer composer1 = composer0.G(0x9193020);
        if((v2 & 1) == 0) {
            v3 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v3 |= (composer1.t(lazyGridState0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.Y(o0) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v3 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v3 |= (composer1.v(z) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v3 |= (composer1.v(z1) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.t(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v3 |= (composer1.v(z2) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((0xE000000 & v) == 0) {
            v3 |= (composer1.t(arrangement$Vertical0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v3 |= (composer1.t(arrangement$Horizontal0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v4 = (v1 & 14) == 0 ? v1 | (composer1.Y(function10) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 0x5B6DB6DB) != 306783378 || (v4 & 11) != 2 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v2 & 1) == 0 ? modifier0 : Modifier.m0;
                boolean z5 = false;
                PaddingValues paddingValues3 = (v2 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v2 & 16) == 0) {
                    z5 = z;
                }
                if((v2 & 0x40) == 0) {
                    flingBehavior2 = flingBehavior0;
                    modifier2 = modifier3;
                    paddingValues2 = paddingValues3;
                    v5 = v3;
                }
                else {
                    paddingValues2 = paddingValues3;
                    v5 = v3 & 0xFFC7FFFF;
                    flingBehavior2 = ScrollableDefaults.a.a(composer1, 6);
                    modifier2 = modifier3;
                }
                z4 = z5;
            }
            else {
                composer1.m();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                paddingValues2 = paddingValues0;
                flingBehavior2 = flingBehavior0;
                modifier2 = modifier0;
                v5 = v3;
                z4 = z;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x9193020, v5, v4, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:51)");
            }
            OverscrollEffect overscrollEffect0 = ScrollableDefaults.a.b(composer1, 6);
            int v6 = v5 >> 3 & 14;
            LazyGridItemProvider lazyGridItemProvider0 = LazyGridItemProviderKt.a(lazyGridState0, function10, composer1, v6 | v4 << 3 & 0x70);
            LazyLayoutSemanticState lazyLayoutSemanticState0 = LazySemanticsKt.a(lazyGridState0, z4, composer1, v6 | v5 >> 9 & 0x70);
            composer1.V(0x2E20B340);
            composer1.V(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            ScrollableDefaults scrollableDefaults0 = ScrollableDefaults.a;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer1));
                composer1.O(compositionScopedCoroutineScopeCanceller1);
                compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
            }
            composer1.g0();
            O o1 = compositionScopedCoroutineScopeCanceller0.b();
            composer1.g0();
            composer1.V(0x1E7B2B64);
            boolean z6 = composer1.t(lazyGridState0);
            boolean z7 = composer1.t(Boolean.valueOf(z1));
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0 = composer1.W();
            if(z7 || z6 || lazyGridItemPlacementAnimator0 == composer$Companion0.a()) {
                lazyGridItemPlacementAnimator0 = new LazyGridItemPlacementAnimator(o1, z1);
                composer1.O(lazyGridItemPlacementAnimator0);
            }
            composer1.g0();
            lazyGridState0.K(lazyGridItemPlacementAnimator0);
            o o2 = LazyGridKt.d(lazyGridItemProvider0, lazyGridState0, o0, paddingValues2, z4, z1, arrangement$Horizontal0, arrangement$Vertical0, lazyGridItemPlacementAnimator0, composer1, 0x8000000 | v5 & 0x70 | v5 & 0x380 | v5 & 0x1C00 | v5 & 0xE000 | v5 & 0x70000 | v5 >> 9 & 0x380000 | v5 >> 3 & 0x1C00000, 0);
            lazyGridState0.P(z1);
            LazyGridKt.b(lazyGridItemProvider0, lazyGridState0, composer1, v5 & 0x70);
            Orientation orientation0 = z1 ? Orientation.a : Orientation.b;
            LazyLayoutKt.a(lazyGridItemProvider0, ScrollableKt.j(OverscrollKt.a(ClipScrollableContainerKt.a(LazyLayoutSemanticsKt.a(modifier2.r0(lazyGridState0.z()).r0(lazyGridState0.l()), lazyGridItemProvider0, lazyLayoutSemanticState0, orientation0, z2, z4, composer1, v5 >> 9 & 0xE000 | v5 << 3 & 0x70000), orientation0), overscrollEffect0), lazyGridState0, orientation0, overscrollEffect0, z2, scrollableDefaults0.c(((LayoutDirection)composer1.L(CompositionLocalsKt.p())), orientation0, z4), flingBehavior2, lazyGridState0.q()), lazyGridState0.w(), o2, composer1, 0, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z3 = z4;
            paddingValues1 = paddingValues2;
            modifier1 = modifier2;
            flingBehavior1 = flingBehavior2;
        }
        else {
            composer1.m();
            z3 = z;
            modifier1 = modifier0;
            paddingValues1 = paddingValues0;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, lazyGridState0, o0, paddingValues1, z3, z1, flingBehavior1, z2, arrangement$Vertical0, arrangement$Horizontal0, function10, v, v1, v2) {
                final Modifier e;
                final LazyGridState f;
                final o g;
                final PaddingValues h;
                final boolean i;
                final boolean j;
                final FlingBehavior k;
                final boolean l;
                final Vertical m;
                final Horizontal n;
                final Function1 o;
                final int p;
                final int q;
                final int r;

                {
                    this.e = modifier0;
                    this.f = lazyGridState0;
                    this.g = o0;
                    this.h = paddingValues0;
                    this.i = z;
                    this.j = z1;
                    this.k = flingBehavior0;
                    this.l = z2;
                    this.m = arrangement$Vertical0;
                    this.n = arrangement$Horizontal0;
                    this.o = function10;
                    this.p = v;
                    this.q = v1;
                    this.r = v2;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyGridKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer0, (this.p | 1) & -920350135 | ((0x24924924 & (this.p | 1)) >> 1 | 306783378 & (this.p | 1)) | (306783378 & (this.p | 1)) << 1 & (0x24924924 & (this.p | 1)), this.q & -920350135 | ((0x24924924 & this.q) >> 1 | 306783378 & this.q) | (306783378 & this.q) << 1 & (0x24924924 & this.q), this.r);
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
    private static final void b(LazyGridItemProvider lazyGridItemProvider0, LazyGridState lazyGridState0, Composer composer0, int v) {
        Composer composer1 = composer0.G(950944068);
        int v1 = (v & 14) == 0 ? (composer1.t(lazyGridItemProvider0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(lazyGridState0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(950944068, v, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:139)");
            }
            if(lazyGridItemProvider0.getItemCount() > 0) {
                lazyGridState0.R(lazyGridItemProvider0);
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
            scopeUpdateScope0.a(new o(lazyGridItemProvider0, lazyGridState0, v) {
                final LazyGridItemProvider e;
                final LazyGridState f;
                final int g;

                {
                    this.e = lazyGridItemProvider0;
                    this.f = lazyGridState0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyGridKt.b(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
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
    private static final o d(LazyGridItemProvider lazyGridItemProvider0, LazyGridState lazyGridState0, o o0, PaddingValues paddingValues0, boolean z, boolean z1, Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, Composer composer0, int v, int v1) {
        composer0.V(237903564);
        Horizontal arrangement$Horizontal1 = (v1 & 0x40) == 0 ? arrangement$Horizontal0 : null;
        Vertical arrangement$Vertical1 = (v1 & 0x80) == 0 ? arrangement$Vertical0 : null;
        if(ComposerKt.g0()) {
            ComposerKt.w0(237903564, v, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:150)");
        }
        Object[] arr_object = {lazyGridState0, o0, paddingValues0, Boolean.valueOf(z), Boolean.valueOf(z1), arrangement$Horizontal1, arrangement$Vertical1, lazyGridItemPlacementAnimator0};
        composer0.V(0xDE219177);
        boolean z2 = false;
        for(int v2 = 0; v2 < 8; ++v2) {
            z2 |= composer0.t(arr_object[v2]);
        }
        androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$10 = composer0.W();
        if(z2 || lazyGridKt$rememberLazyGridMeasurePolicy$1$10 == Composer.a.a()) {
            lazyGridKt$rememberLazyGridMeasurePolicy$1$10 = new o(z1, paddingValues0, z, lazyGridState0, lazyGridItemProvider0, o0, arrangement$Vertical1, arrangement$Horizontal1, lazyGridItemPlacementAnimator0) {
                final boolean e;
                final PaddingValues f;
                final boolean g;
                final LazyGridState h;
                final LazyGridItemProvider i;
                final o j;
                final Vertical k;
                final Horizontal l;
                final LazyGridItemPlacementAnimator m;

                {
                    this.e = z;
                    this.f = paddingValues0;
                    this.g = z1;
                    this.h = lazyGridState0;
                    this.i = lazyGridItemProvider0;
                    this.j = o0;
                    this.k = arrangement$Vertical0;
                    this.l = arrangement$Horizontal0;
                    this.m = lazyGridItemPlacementAnimator0;
                    super(2);
                }

                @l
                public final LazyGridMeasureResult a(@l LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v) {
                    int v18;
                    int v17;
                    long v14;
                    float f1;
                    float f;
                    int v7;
                    int v2;
                    int v1;
                    L.p(lazyLayoutMeasureScope0, "$this$null");
                    CheckScrollableContainerConstraintsKt.a(v, (this.e ? Orientation.a : Orientation.b));
                    if(this.e) {
                        LayoutDirection layoutDirection0 = lazyLayoutMeasureScope0.getLayoutDirection();
                        v1 = lazyLayoutMeasureScope0.b1(this.f.b(layoutDirection0));
                    }
                    else {
                        LayoutDirection layoutDirection1 = lazyLayoutMeasureScope0.getLayoutDirection();
                        v1 = lazyLayoutMeasureScope0.b1(PaddingKt.i(this.f, layoutDirection1));
                    }
                    if(this.e) {
                        LayoutDirection layoutDirection2 = lazyLayoutMeasureScope0.getLayoutDirection();
                        v2 = lazyLayoutMeasureScope0.b1(this.f.c(layoutDirection2));
                    }
                    else {
                        LayoutDirection layoutDirection3 = lazyLayoutMeasureScope0.getLayoutDirection();
                        v2 = lazyLayoutMeasureScope0.b1(PaddingKt.h(this.f, layoutDirection3));
                    }
                    int v3 = lazyLayoutMeasureScope0.b1(this.f.d());
                    int v4 = lazyLayoutMeasureScope0.b1(this.f.a());
                    int v5 = v3 + v4;
                    int v6 = v1 + v2;
                    boolean z = this.e;
                    if(z && !this.g) {
                        v7 = v3;
                    }
                    else if(!z || !this.g) {
                        v7 = z || this.g ? v2 : v1;
                    }
                    else {
                        v7 = v4;
                    }
                    int v8 = (z ? v5 : v6) - v7;
                    long v9 = ConstraintsKt.i(v, -v6, -v5);
                    this.h.R(this.i);
                    LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0 = this.i.f();
                    Constraints constraints0 = Constraints.b(v);
                    Object object0 = this.j.invoke(lazyLayoutMeasureScope0, constraints0);
                    lazyGridSpanLayoutProvider0.h(((List)object0).size());
                    this.h.J(lazyLayoutMeasureScope0);
                    this.h.O(((List)object0).size());
                    if(this.e) {
                        Vertical arrangement$Vertical0 = this.k;
                        if(arrangement$Vertical0 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        f = arrangement$Vertical0.a();
                    }
                    else {
                        Horizontal arrangement$Horizontal0 = this.l;
                        if(arrangement$Horizontal0 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        f = arrangement$Horizontal0.a();
                    }
                    int v10 = lazyLayoutMeasureScope0.b1(f);
                    if(this.e) {
                        Horizontal arrangement$Horizontal1 = this.l;
                        f1 = arrangement$Horizontal1 == null ? 0.0f : arrangement$Horizontal1.a();
                    }
                    else {
                        f1 = this.k == null ? 0.0f : this.k.a();
                    }
                    int v11 = lazyLayoutMeasureScope0.b1(f1);
                    int v12 = this.i.getItemCount();
                    int v13 = this.e ? Constraints.o(v) - v5 : Constraints.p(v) - v6;
                    if(this.g && v13 <= 0) {
                        boolean z1 = this.e;
                        if(!z1) {
                            v1 += v13;
                        }
                        if(z1) {
                            v3 += v13;
                        }
                    }
                    v14 = IntOffsetKt.a(v1, v3);
                    androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10 = new MeasuredItemFactory() {
                        @Override  // androidx.compose.foundation.lazy.grid.MeasuredItemFactory
                        @l
                        public final LazyGridMeasuredItem a(int v, @l Object object0, int v1, int v2, @l List list0) {
                            L.p(object0, "key");
                            L.p(list0, "placeables");
                            LayoutDirection layoutDirection0 = this.e.getLayoutDirection();
                            return new LazyGridMeasuredItem(v, object0, this.g, v1, v2, v7, layoutDirection0, v8, this.m, list0, v14, this.g, null);
                        }
                    };
                    LazyMeasuredItemProvider lazyMeasuredItemProvider0 = new LazyMeasuredItemProvider(this.i, lazyLayoutMeasureScope0, v10, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10);
                    androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10 = new MeasuredLineFactory() {
                        @Override  // androidx.compose.foundation.lazy.grid.MeasuredLineFactory
                        @l
                        public final LazyGridMeasuredLine a(int v, @l LazyGridMeasuredItem[] arr_lazyGridMeasuredItem, @l List list0, int v1) {
                            L.p(arr_lazyGridMeasuredItem, "items");
                            L.p(list0, "spans");
                            LayoutDirection layoutDirection0 = v11.getLayoutDirection();
                            return new LazyGridMeasuredLine(v, arr_lazyGridMeasuredItem, list0, ((List)object0), lazyLayoutMeasureScope0.size(), layoutDirection0, v1, this.d, null);
                        }
                    };
                    LazyMeasuredLineProvider lazyMeasuredLineProvider0 = new LazyMeasuredLineProvider(this.e, ((List)object0), v11, v12, v10, lazyMeasuredItemProvider0, lazyGridSpanLayoutProvider0, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10);
                    androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$10 = new Function1(lazyMeasuredLineProvider0) {
                        final LazyGridSpanLayoutProvider e;
                        final LazyMeasuredLineProvider f;

                        {
                            this.e = lazyGridSpanLayoutProvider0;
                            this.f = lazyMeasuredLineProvider0;
                            super(1);
                        }

                        @l
                        public final ArrayList a(int v) {
                            LineConfiguration lazyGridSpanLayoutProvider$LineConfiguration0 = this.e.c(v);
                            int v1 = ItemIndex.c(lazyGridSpanLayoutProvider$LineConfiguration0.a());
                            ArrayList arrayList0 = new ArrayList(lazyGridSpanLayoutProvider$LineConfiguration0.b().size());
                            List list0 = lazyGridSpanLayoutProvider$LineConfiguration0.b();
                            LazyMeasuredLineProvider lazyMeasuredLineProvider0 = this.f;
                            int v2 = list0.size();
                            int v4 = 0;
                            for(int v3 = 0; v3 < v2; ++v3) {
                                int v5 = GridItemSpan.f(((GridItemSpan)list0.get(v3)).i());
                                arrayList0.add(r0.a(v1, Constraints.b(lazyMeasuredLineProvider0.a(v4, v5))));
                                ++v1;
                                v4 += v5;
                            }
                            return arrayList0;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((LineIndex)object0).n());
                        }
                    };
                    this.h.L(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$10);
                    LazyGridState lazyGridState0 = this.h;
                    Snapshot snapshot0 = Snapshot.e.a();
                    try {
                        Snapshot snapshot1 = snapshot0.p();
                        try {
                            if(lazyGridState0.n() < v12 || v12 <= 0) {
                                int v19 = lazyGridSpanLayoutProvider0.d(lazyGridState0.n());
                                v18 = lazyGridState0.o();
                                v17 = v19;
                            }
                            else {
                                v17 = lazyGridSpanLayoutProvider0.d(v12 - 1);
                                v18 = 0;
                            }
                        }
                        finally {
                            snapshot0.w(snapshot1);
                        }
                    }
                    finally {
                        snapshot0.d();
                    }
                    androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1.3 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$30 = new p(v, v6, v5) {
                        final LazyLayoutMeasureScope e;
                        final long f;
                        final int g;
                        final int h;

                        {
                            this.e = lazyLayoutMeasureScope0;
                            this.f = v;
                            this.g = v1;
                            this.h = v2;
                            super(3);
                        }

                        @l
                        public final MeasureResult a(int v, int v1, @l Function1 function10) {
                            L.p(function10, "placement");
                            int v2 = ConstraintsKt.g(this.f, v + this.g);
                            int v3 = ConstraintsKt.f(this.f, v1 + this.h);
                            Map map0 = Y.z();
                            return this.e.o1(v2, v3, map0, function10);
                        }

                        @Override  // A3.p
                        public Object invoke(Object object0, Object object1, Object object2) {
                            return this.a(((Number)object0).intValue(), ((Number)object1).intValue(), ((Function1)object2));
                        }
                    };
                    LazyGridMeasureResult lazyGridMeasureResult0 = LazyGridMeasureKt.d(v12, this.i, lazyMeasuredLineProvider0, lazyMeasuredItemProvider0, v13, v7, v8, v10, v17, v18, this.h.A(), v9, this.e, this.k, this.l, this.g, lazyLayoutMeasureScope0, this.m, lazyGridSpanLayoutProvider0, this.h.t(), lazyGridKt$rememberLazyGridMeasurePolicy$1$1$30);
                    this.h.j(lazyGridMeasureResult0);
                    return lazyGridMeasureResult0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((LazyLayoutMeasureScope)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyGridKt$rememberLazyGridMeasurePolicy$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyGridKt$rememberLazyGridMeasurePolicy$1$10;
    }
}

