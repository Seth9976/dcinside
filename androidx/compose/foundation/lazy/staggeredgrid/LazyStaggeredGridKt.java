package androidx.compose.foundation.lazy.staggeredgrid;

import A3.o;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,122:1\n154#2:123\n154#2:124\n154#2:125\n76#3:126\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n50#1:123\n58#1:124\n60#1:125\n89#1:126\n*E\n"})
public final class LazyStaggeredGridKt {
    @ExperimentalFoundationApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l LazyStaggeredGridState lazyStaggeredGridState0, @l Orientation orientation0, @l o o0, @m Modifier modifier0, @m PaddingValues paddingValues0, boolean z, @m FlingBehavior flingBehavior0, boolean z1, float f, float f1, @l Function1 function10, @m Composer composer0, int v, int v1, int v2) {
        int v3;
        FlingBehavior flingBehavior1;
        L.p(lazyStaggeredGridState0, "state");
        L.p(orientation0, "orientation");
        L.p(o0, "slotSizesSums");
        L.p(function10, "content");
        Composer composer1 = composer0.G(1320541636);
        Modifier modifier1 = (v2 & 8) == 0 ? modifier0 : Modifier.m0;
        PaddingValues paddingValues1 = (v2 & 16) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
        boolean z2 = (v2 & 0x20) == 0 ? z : false;
        if((v2 & 0x40) == 0) {
            flingBehavior1 = flingBehavior0;
            v3 = v;
        }
        else {
            flingBehavior1 = ScrollableDefaults.a.a(composer1, 6);
            v3 = v & 0xFFC7FFFF;
        }
        boolean z3 = (v2 & 0x80) == 0 ? z1 : true;
        float f2 = (v2 & 0x100) == 0 ? f : 0.0f;
        float f3 = (v2 & 0x200) == 0 ? f1 : 0.0f;
        if(ComposerKt.g0()) {
            ComposerKt.w0(1320541636, v3, v1, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        OverscrollEffect overscrollEffect0 = ScrollableDefaults.a.b(composer1, 6);
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0 = LazyStaggeredGridItemProviderKt.a(lazyStaggeredGridState0, function10, composer1, v1 << 3 & 0x70 | 8);
        o o1 = LazyStaggeredGridMeasurePolicyKt.f(lazyStaggeredGridState0, lazyStaggeredGridItemProvider0, paddingValues1, z2, orientation0, f2, f3, o0, composer1, v3 >> 6 & 0x1C00 | (v3 >> 6 & 0x380 | 8) | v3 << 9 & 0xE000 | v3 >> 9 & 0x70000 | v3 >> 9 & 0x380000 | v3 << 15 & 0x1C00000);
        LazyLayoutSemanticState lazyLayoutSemanticState0 = LazyStaggeredGridSemanticsKt.a(lazyStaggeredGridState0, z2, composer1, v3 >> 12 & 0x70 | 8);
        LazyStaggeredGridKt.b(lazyStaggeredGridItemProvider0, lazyStaggeredGridState0, composer1, 0x40);
        Modifier modifier2 = OverscrollKt.a(ClipScrollableContainerKt.a(modifier1.r0(lazyStaggeredGridState0.C()), orientation0), overscrollEffect0);
        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
        LazyLayoutKt.a(lazyStaggeredGridItemProvider0, LazyLayoutSemanticsKt.a(ScrollableKt.j(modifier2, lazyStaggeredGridState0, orientation0, overscrollEffect0, z3, ScrollableDefaults.a.c(layoutDirection0, orientation0, z2), flingBehavior1, lazyStaggeredGridState0.y()), lazyStaggeredGridItemProvider0, lazyLayoutSemanticState0, orientation0, z3, z2, composer1, v3 << 6 & 0x1C00 | v3 >> 9 & 0xE000 | v3 & 0x70000), lazyStaggeredGridState0.A(), o1, composer1, 0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(lazyStaggeredGridState0, orientation0, o0, modifier1, paddingValues1, z2, flingBehavior1, z3, f2, f3, function10, v, v1, v2) {
                final LazyStaggeredGridState e;
                final Orientation f;
                final o g;
                final Modifier h;
                final PaddingValues i;
                final boolean j;
                final FlingBehavior k;
                final boolean l;
                final float m;
                final float n;
                final Function1 o;
                final int p;
                final int q;
                final int r;

                {
                    this.e = lazyStaggeredGridState0;
                    this.f = orientation0;
                    this.g = o0;
                    this.h = modifier0;
                    this.i = paddingValues0;
                    this.j = z;
                    this.k = flingBehavior0;
                    this.l = z1;
                    this.m = f;
                    this.n = f1;
                    this.o = function10;
                    this.p = v;
                    this.q = v1;
                    this.r = v2;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyStaggeredGridKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer0, (this.p | 1) & -920350135 | ((0x24924924 & (this.p | 1)) >> 1 | 306783378 & (this.p | 1)) | (306783378 & (this.p | 1)) << 1 & (0x24924924 & (this.p | 1)), this.q & -920350135 | ((0x24924924 & this.q) >> 1 | 306783378 & this.q) | (306783378 & this.q) << 1 & (0x24924924 & this.q), this.r);
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
    private static final void b(LazyLayoutItemProvider lazyLayoutItemProvider0, LazyStaggeredGridState lazyStaggeredGridState0, Composer composer0, int v) {
        Composer composer1 = composer0.G(231106410);
        if(ComposerKt.g0()) {
            ComposerKt.w0(231106410, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if(lazyLayoutItemProvider0.getItemCount() > 0) {
            lazyStaggeredGridState0.U(lazyLayoutItemProvider0);
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(lazyLayoutItemProvider0, lazyStaggeredGridState0, v) {
                final LazyLayoutItemProvider e;
                final LazyStaggeredGridState f;
                final int g;

                {
                    this.e = lazyLayoutItemProvider0;
                    this.f = lazyStaggeredGridState0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyStaggeredGridKt.b(this.e, this.f, composer0, RecomposeScopeImplKt.a(this.g | 1));
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

