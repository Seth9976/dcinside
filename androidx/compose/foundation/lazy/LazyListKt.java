package androidx.compose.foundation.lazy;

import A3.o;
import A3.p;
import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
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
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,334:1\n25#2:335\n25#2:346\n50#2:357\n49#2:358\n83#2,3:366\n1114#3,6:336\n1114#3,3:347\n1117#3,3:353\n1114#3,6:359\n1114#3,6:369\n474#4,4:342\n478#4,2:350\n482#4:356\n474#5:352\n76#6:365\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n81#1:335\n82#1:346\n83#1:357\n83#1:358\n178#1:366,3\n81#1:336,6\n82#1:347,3\n82#1:353,3\n83#1:359,6\n178#1:369,6\n82#1:342,4\n82#1:350,2\n82#1:356\n82#1:352\n123#1:365\n*E\n"})
public final class LazyListKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l Modifier modifier0, @l LazyListState lazyListState0, @l PaddingValues paddingValues0, boolean z, boolean z1, @l FlingBehavior flingBehavior0, boolean z2, int v, @m Horizontal alignment$Horizontal0, @m Vertical arrangement$Vertical0, @m androidx.compose.ui.Alignment.Vertical alignment$Vertical0, @m androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, @l Function1 function10, @m Composer composer0, int v1, int v2, int v3) {
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        Vertical arrangement$Vertical1;
        Horizontal alignment$Horizontal1;
        int v9;
        int v7;
        int v4;
        L.p(modifier0, "modifier");
        L.p(lazyListState0, "state");
        L.p(paddingValues0, "contentPadding");
        L.p(flingBehavior0, "flingBehavior");
        L.p(function10, "content");
        Composer composer1 = composer0.G(0x25001C13);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        int v5 = 16;
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.t(lazyListState0) ? 0x20 : 16);
        }
        int v6 = 0x80;
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.t(paddingValues0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.v(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.t(flingBehavior0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.v(z2) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0x1C00000) == 0) {
            v4 |= (composer1.z(v) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0xE000000) == 0) {
            v4 |= (composer1.t(alignment$Horizontal0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.t(arrangement$Vertical0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v7 = (v2 & 14) == 0 ? v2 | (composer1.t(alignment$Vertical0) ? 4 : 2) : v2;
        }
        else {
            v7 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v7 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            if(composer1.t(arrangement$Horizontal0)) {
                v5 = 0x20;
            }
            v7 |= v5;
        }
        int v8 = v7;
        if((v3 & 0x1000) != 0) {
            v8 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            if(composer1.Y(function10)) {
                v6 = 0x100;
            }
            v8 |= v6;
        }
        if((0x5B6DB6DB & v4) != 306783378 || (v8 & 731) != 0x92 || !composer1.c()) {
            int v10 = (v3 & 0x80) == 0 ? v : 0;
            Horizontal alignment$Horizontal2 = (v3 & 0x100) == 0 ? alignment$Horizontal0 : null;
            Vertical arrangement$Vertical2 = (v3 & 0x200) == 0 ? arrangement$Vertical0 : null;
            alignment$Vertical1 = (v3 & 0x400) == 0 ? alignment$Vertical0 : null;
            arrangement$Horizontal1 = (v3 & 0x800) == 0 ? arrangement$Horizontal0 : null;
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x25001C13, v4, v8, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:49)");
            }
            ScrollableDefaults scrollableDefaults0 = ScrollableDefaults.a;
            OverscrollEffect overscrollEffect0 = scrollableDefaults0.b(composer1, 6);
            int v11 = v4 >> 3 & 14;
            LazyListItemProvider lazyListItemProvider0 = LazyListItemProviderKt.a(lazyListState0, function10, composer1, v8 >> 3 & 0x70 | v11);
            LazyLayoutSemanticState lazyLayoutSemanticState0 = LazyListSemanticsKt.a(lazyListState0, z1, composer1, v11 | v4 >> 9 & 0x70);
            composer1.V(0xE2A708A4);
            LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(lazyListBeyondBoundsInfo0 == composer$Companion0.a()) {
                lazyListBeyondBoundsInfo0 = new LazyListBeyondBoundsInfo();
                composer1.O(lazyListBeyondBoundsInfo0);
            }
            composer1.g0();
            composer1.V(0x2E20B340);
            composer1.V(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.W();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer1));
                composer1.O(compositionScopedCoroutineScopeCanceller1);
                compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
            }
            composer1.g0();
            O o0 = compositionScopedCoroutineScopeCanceller0.b();
            composer1.g0();
            composer1.V(0x1E7B2B64);
            boolean z3 = composer1.t(lazyListState0);
            boolean z4 = composer1.t(Boolean.valueOf(z1));
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator0 = composer1.W();
            if(z3 || z4 || lazyListItemPlacementAnimator0 == composer$Companion0.a()) {
                lazyListItemPlacementAnimator0 = new LazyListItemPlacementAnimator(o0, z1);
                composer1.O(lazyListItemPlacementAnimator0);
            }
            composer1.g0();
            lazyListState0.I(lazyListItemPlacementAnimator0);
            o o1 = LazyListKt.d(lazyListItemProvider0, lazyListState0, lazyListBeyondBoundsInfo0, paddingValues0, z, z1, v10, alignment$Horizontal2, alignment$Vertical1, arrangement$Horizontal1, arrangement$Vertical2, lazyListItemPlacementAnimator0, composer1, v4 >> 3 & 0x1C00000 | (MutableVector.d << 6 | v4 & 0x70 | v4 << 3 & 0x1C00 | v4 << 3 & 0xE000 | v4 << 3 & 0x70000 | v4 >> 3 & 0x380000) | 0xE000000 & v8 << 24 | v8 << 24 & 0x70000000, v4 >> 27 & 14 | 0x40, 0);
            LazyListKt.b(lazyListItemProvider0, lazyListState0, composer1, v4 & 0x70);
            Orientation orientation0 = z1 ? Orientation.a : Orientation.b;
            LazyLayoutKt.a(lazyListItemProvider0, ScrollableKt.j(OverscrollKt.a(LazyListBeyondBoundsModifierKt.a(ClipScrollableContainerKt.a(LazyLayoutSemanticsKt.a(modifier0.r0(lazyListState0.z()).r0(lazyListState0.l()), lazyListItemProvider0, lazyLayoutSemanticState0, orientation0, z2, z, composer1, v4 >> 6 & 0xE000 | v4 << 6 & 0x70000), orientation0), lazyListState0, lazyListBeyondBoundsInfo0, z, orientation0, composer1, 0x200 | v4 & 0x70 | v4 & 0x1C00), overscrollEffect0), lazyListState0, orientation0, overscrollEffect0, z2, scrollableDefaults0.c(((LayoutDirection)composer1.L(CompositionLocalsKt.p())), orientation0, z), flingBehavior0, lazyListState0.q()), lazyListState0.v(), o1, composer1, 0, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            v9 = v10;
            alignment$Horizontal1 = alignment$Horizontal2;
            arrangement$Vertical1 = arrangement$Vertical2;
        }
        else {
            composer1.m();
            v9 = v;
            alignment$Horizontal1 = alignment$Horizontal0;
            arrangement$Vertical1 = arrangement$Vertical0;
            alignment$Vertical1 = alignment$Vertical0;
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, lazyListState0, paddingValues0, z, z1, flingBehavior0, z2, v9, alignment$Horizontal1, arrangement$Vertical1, alignment$Vertical1, arrangement$Horizontal1, function10, v1, v2, v3) {
                final Modifier e;
                final LazyListState f;
                final PaddingValues g;
                final boolean h;
                final boolean i;
                final FlingBehavior j;
                final boolean k;
                final int l;
                final Horizontal m;
                final Vertical n;
                final androidx.compose.ui.Alignment.Vertical o;
                final androidx.compose.foundation.layout.Arrangement.Horizontal p;
                final Function1 q;
                final int r;
                final int s;
                final int t;

                {
                    this.e = modifier0;
                    this.f = lazyListState0;
                    this.g = paddingValues0;
                    this.h = z;
                    this.i = z1;
                    this.j = flingBehavior0;
                    this.k = z2;
                    this.l = v;
                    this.m = alignment$Horizontal0;
                    this.n = arrangement$Vertical0;
                    this.o = alignment$Vertical0;
                    this.p = arrangement$Horizontal0;
                    this.q = function10;
                    this.r = v1;
                    this.s = v2;
                    this.t = v3;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyListKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, composer0, (this.r | 1) & -920350135 | ((0x24924924 & (this.r | 1)) >> 1 | 306783378 & (this.r | 1)) | (306783378 & (this.r | 1)) << 1 & (0x24924924 & (this.r | 1)), this.s & -920350135 | ((0x24924924 & this.s) >> 1 | 306783378 & this.s) | (306783378 & this.s) << 1 & (0x24924924 & this.s), this.t);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @ExperimentalFoundationApi
    @Composable
    private static final void b(LazyListItemProvider lazyListItemProvider0, LazyListState lazyListState0, Composer composer0, int v) {
        Composer composer1 = composer0.G(0x306DC6);
        int v1 = (v & 14) == 0 ? (composer1.t(lazyListItemProvider0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(lazyListState0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x306DC6, v, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if(lazyListItemProvider0.getItemCount() > 0) {
                lazyListState0.N(lazyListItemProvider0);
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
            scopeUpdateScope0.a(new o(lazyListItemProvider0, lazyListState0, v) {
                final LazyListItemProvider e;
                final LazyListState f;
                final int g;

                {
                    this.e = lazyListItemProvider0;
                    this.f = lazyListState0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyListKt.b(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @ExperimentalFoundationApi
    @Composable
    private static final o d(LazyListItemProvider lazyListItemProvider0, LazyListState lazyListState0, LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, PaddingValues paddingValues0, boolean z, boolean z1, int v, Horizontal alignment$Horizontal0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, Vertical arrangement$Vertical0, LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, Composer composer0, int v1, int v2, int v3) {
        composer0.V(0xC6694419);
        Horizontal alignment$Horizontal1 = (v3 & 0x80) == 0 ? alignment$Horizontal0 : null;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1 = (v3 & 0x100) == 0 ? alignment$Vertical0 : null;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1 = (v3 & 0x200) == 0 ? arrangement$Horizontal0 : null;
        Vertical arrangement$Vertical1 = (v3 & 0x400) == 0 ? arrangement$Vertical0 : null;
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xC6694419, v1, v2, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] arr_object = {lazyListState0, lazyListBeyondBoundsInfo0, paddingValues0, Boolean.valueOf(z), Boolean.valueOf(z1), alignment$Horizontal1, alignment$Vertical1, arrangement$Horizontal1, arrangement$Vertical1, lazyListItemPlacementAnimator0};
        composer0.V(0xDE219177);
        boolean z2 = false;
        for(int v4 = 0; v4 < 10; ++v4) {
            z2 |= composer0.t(arr_object[v4]);
        }
        androidx.compose.foundation.lazy.LazyListKt.rememberLazyListMeasurePolicy.1.1 lazyListKt$rememberLazyListMeasurePolicy$1$10 = composer0.W();
        if(z2 || lazyListKt$rememberLazyListMeasurePolicy$1$10 == Composer.a.a()) {
            lazyListKt$rememberLazyListMeasurePolicy$1$10 = new o(z1, paddingValues0, z, lazyListState0, lazyListItemProvider0, arrangement$Vertical1, arrangement$Horizontal1, lazyListItemPlacementAnimator0, lazyListBeyondBoundsInfo0, v, alignment$Horizontal1, alignment$Vertical1) {
                final boolean e;
                final PaddingValues f;
                final boolean g;
                final LazyListState h;
                final LazyListItemProvider i;
                final Vertical j;
                final androidx.compose.foundation.layout.Arrangement.Horizontal k;
                final LazyListItemPlacementAnimator l;
                final LazyListBeyondBoundsInfo m;
                final int n;
                final Horizontal o;
                final androidx.compose.ui.Alignment.Vertical p;

                {
                    this.e = z;
                    this.f = paddingValues0;
                    this.g = z1;
                    this.h = lazyListState0;
                    this.i = lazyListItemProvider0;
                    this.j = arrangement$Vertical0;
                    this.k = arrangement$Horizontal0;
                    this.l = lazyListItemPlacementAnimator0;
                    this.m = lazyListBeyondBoundsInfo0;
                    this.n = v;
                    this.o = alignment$Horizontal0;
                    this.p = alignment$Vertical0;
                    super(2);
                }

                @l
                public final LazyListMeasureResult a(@l LazyLayoutMeasureScope lazyLayoutMeasureScope0, long v) {
                    int v16;
                    int v15;
                    long v13;
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
                    this.h.N(this.i);
                    this.h.H(lazyLayoutMeasureScope0);
                    this.i.d().e(Constraints.p(v9), Constraints.o(v9));
                    if(this.e) {
                        Vertical arrangement$Vertical0 = this.j;
                        if(arrangement$Vertical0 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        f = arrangement$Vertical0.a();
                    }
                    else {
                        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0 = this.k;
                        if(arrangement$Horizontal0 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        f = arrangement$Horizontal0.a();
                    }
                    int v10 = lazyLayoutMeasureScope0.b1(f);
                    int v11 = this.i.getItemCount();
                    int v12 = this.e ? Constraints.o(v) - v5 : Constraints.p(v) - v6;
                    if(this.g && v12 <= 0) {
                        boolean z1 = this.e;
                        if(!z1) {
                            v1 += v12;
                        }
                        if(z1) {
                            v3 += v12;
                        }
                    }
                    v13 = IntOffsetKt.a(v1, v3);
                    androidx.compose.foundation.lazy.LazyListKt.rememberLazyListMeasurePolicy.1.1.measuredItemProvider.1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$10 = new MeasuredItemFactory() {
                        @Override  // androidx.compose.foundation.lazy.MeasuredItemFactory
                        @l
                        public final LazyMeasuredItem a(int v, @l Object object0, @l List list0) {
                            L.p(object0, "key");
                            L.p(list0, "placeables");
                            LayoutDirection layoutDirection0 = this.e.getLayoutDirection();
                            return new LazyMeasuredItem(v, list0, this.o, this.p, this.g, layoutDirection0, v7, v8, this.l, v13, (v == v10 - 1 ? 0 : lazyLayoutMeasureScope0), this.k, object0, null);
                        }
                    };
                    LazyMeasuredItemProvider lazyMeasuredItemProvider0 = new LazyMeasuredItemProvider(v9, this.e, this.i, lazyLayoutMeasureScope0, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$10, null);
                    this.h.K(lazyMeasuredItemProvider0.b());
                    Snapshot snapshot0 = Snapshot.e.a();
                    try {
                        Snapshot snapshot1 = snapshot0.p();
                        try {
                            v15 = DataIndex.c(this.h.n());
                            v16 = this.h.o();
                        }
                        catch(Throwable throwable0) {
                            snapshot0.w(snapshot1);
                            throw throwable0;
                        }
                        snapshot0.w(snapshot1);
                    }
                    finally {
                        snapshot0.d();
                    }
                    List list0 = this.i.e();
                    androidx.compose.foundation.lazy.LazyListKt.rememberLazyListMeasurePolicy.1.1.2 lazyListKt$rememberLazyListMeasurePolicy$1$1$20 = new p(v, v6, v5) {
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
                    LazyListMeasureResult lazyListMeasureResult0 = LazyListMeasureKt.j(v11, this.i, lazyMeasuredItemProvider0, v12, v7, v8, v10, v15, v16, this.h.A(), v9, this.e, list0, this.j, this.k, this.g, lazyLayoutMeasureScope0, this.l, this.m, this.n, this.h.t(), lazyListKt$rememberLazyListMeasurePolicy$1$1$20);
                    this.h.j(lazyListMeasureResult0);
                    return lazyListMeasureResult0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((LazyLayoutMeasureScope)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyListKt$rememberLazyListMeasurePolicy$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyListKt$rememberLazyListMeasurePolicy$1$10;
    }
}

