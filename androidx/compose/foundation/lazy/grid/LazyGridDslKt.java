package androidx.compose.foundation.lazy.grid;

import A3.o;
import A3.p;
import A3.q;
import A3.r;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,493:1\n154#2:494\n154#2:495\n67#3,3:496\n66#3:499\n67#3,3:506\n66#3:509\n1114#4,6:500\n1114#4,6:510\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n67#1:494\n121#1:495\n153#1:496,3\n153#1:499\n185#1:506,3\n185#1:509\n153#1:500,6\n185#1:510,6\n*E\n"})
public final class LazyGridDslKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l GridCells gridCells0, @m Modifier modifier0, @m LazyGridState lazyGridState0, @m PaddingValues paddingValues0, boolean z, @m Horizontal arrangement$Horizontal0, @m Vertical arrangement$Vertical0, @m FlingBehavior flingBehavior0, boolean z1, @l Function1 function10, @m Composer composer0, int v, int v1) {
        FlingBehavior flingBehavior1;
        Horizontal arrangement$Horizontal1;
        boolean z3;
        Vertical arrangement$Vertical1;
        PaddingValues paddingValues1;
        LazyGridState lazyGridState1;
        boolean z2;
        Modifier modifier1;
        Vertical arrangement$Vertical2;
        PaddingValues paddingValues2;
        Horizontal arrangement$Horizontal2;
        boolean z5;
        LazyGridState lazyGridState2;
        boolean z4;
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        FlingBehavior flingBehavior3;
        Horizontal arrangement$Horizontal3;
        LazyGridState lazyGridState3;
        int v2;
        L.p(gridCells0, "rows");
        L.p(function10, "content");
        Composer composer1 = composer0.G(2123608858);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(gridCells0) ? 4 : 2) | v : v;
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
        if((v & 0x380) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.t(lazyGridState0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.v(z) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.t(arrangement$Horizontal0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.t(arrangement$Vertical0) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.t(flingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.v(z1) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v2 |= (composer1.Y(function10) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v2) != 306783378 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
                boolean z6 = false;
                if((v1 & 4) == 0) {
                    lazyGridState3 = lazyGridState0;
                }
                else {
                    lazyGridState3 = LazyGridStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                PaddingValues paddingValues3 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v1 & 16) == 0) {
                    z6 = z;
                }
                if((v1 & 0x20) == 0) {
                    arrangement$Horizontal3 = arrangement$Horizontal0;
                }
                else {
                    arrangement$Horizontal3 = z6 ? Arrangement.a.h() : Arrangement.a.p();
                    v2 &= 0xFFF8FFFF;
                }
                Vertical arrangement$Vertical3 = (v1 & 0x40) == 0 ? arrangement$Vertical0 : Arrangement.a.r();
                if((v1 & 0x80) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.a.a(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    z4 = z1;
                    lazyGridState2 = lazyGridState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    flingBehavior2 = flingBehavior3;
                }
                else {
                    lazyGridState2 = lazyGridState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    flingBehavior2 = flingBehavior3;
                    z4 = true;
                }
            }
            else {
                composer1.m();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                flingBehavior2 = flingBehavior0;
                z4 = z1;
                lazyGridState2 = lazyGridState0;
                z5 = z;
                arrangement$Horizontal2 = arrangement$Horizontal0;
                paddingValues2 = paddingValues0;
                arrangement$Vertical2 = arrangement$Vertical0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(2123608858, v2, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:116)");
            }
            LazyGridKt.a(modifier2, lazyGridState2, LazyGridDslKt.n(gridCells0, arrangement$Vertical2, paddingValues2, composer1, v2 & 14 | v2 >> 15 & 0x70 | v2 >> 3 & 0x380), paddingValues2, z5, false, flingBehavior2, z4, arrangement$Vertical2, arrangement$Horizontal2, function10, composer1, v2 >> 3 & 14 | 0x30000 | v2 >> 3 & 0x70 | v2 & 0x1C00 | 0xE000 & v2 | v2 >> 3 & 0x380000 | v2 >> 3 & 0x1C00000 | v2 << 6 & 0xE000000 | v2 << 12 & 0x70000000, v2 >> 27 & 14, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            arrangement$Vertical1 = arrangement$Vertical2;
            paddingValues1 = paddingValues2;
            lazyGridState1 = lazyGridState2;
            z3 = z5;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            flingBehavior1 = flingBehavior2;
            z2 = z4;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            z2 = z1;
            lazyGridState1 = lazyGridState0;
            paddingValues1 = paddingValues0;
            arrangement$Vertical1 = arrangement$Vertical0;
            z3 = z;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(gridCells0, modifier1, lazyGridState1, paddingValues1, z3, arrangement$Horizontal1, arrangement$Vertical1, flingBehavior1, z2, function10, v, v1) {
                final GridCells e;
                final Modifier f;
                final LazyGridState g;
                final PaddingValues h;
                final boolean i;
                final Horizontal j;
                final Vertical k;
                final FlingBehavior l;
                final boolean m;
                final Function1 n;
                final int o;
                final int p;

                {
                    this.e = gridCells0;
                    this.f = modifier0;
                    this.g = lazyGridState0;
                    this.h = paddingValues0;
                    this.i = z;
                    this.j = arrangement$Horizontal0;
                    this.k = arrangement$Vertical0;
                    this.l = flingBehavior0;
                    this.m = z1;
                    this.n = function10;
                    this.o = v;
                    this.p = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyGridDslKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer0, (this.o | 1) & -920350135 | ((0x24924924 & (this.o | 1)) >> 1 | 306783378 & (this.o | 1)) | (306783378 & (this.o | 1)) << 1 & (0x24924924 & (this.o | 1)), this.p);
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
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@l GridCells gridCells0, @m Modifier modifier0, @m LazyGridState lazyGridState0, @m PaddingValues paddingValues0, boolean z, @m Vertical arrangement$Vertical0, @m Horizontal arrangement$Horizontal0, @m FlingBehavior flingBehavior0, boolean z1, @l Function1 function10, @m Composer composer0, int v, int v1) {
        FlingBehavior flingBehavior1;
        Vertical arrangement$Vertical1;
        boolean z3;
        Horizontal arrangement$Horizontal1;
        PaddingValues paddingValues1;
        LazyGridState lazyGridState1;
        boolean z2;
        Modifier modifier1;
        Horizontal arrangement$Horizontal2;
        PaddingValues paddingValues2;
        Vertical arrangement$Vertical2;
        boolean z5;
        LazyGridState lazyGridState2;
        boolean z4;
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        FlingBehavior flingBehavior3;
        Vertical arrangement$Vertical3;
        LazyGridState lazyGridState3;
        int v2;
        L.p(gridCells0, "columns");
        L.p(function10, "content");
        Composer composer1 = composer0.G(0x588990D0);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(gridCells0) ? 4 : 2) | v : v;
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
        if((v & 0x380) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.t(lazyGridState0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.v(z) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.t(arrangement$Vertical0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.t(arrangement$Horizontal0) ? 0x100000 : 0x80000);
        }
        if((v & 0x1C00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.t(flingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.v(z1) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x70000000) == 0) {
            v2 |= (composer1.Y(function10) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v2) != 306783378 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                modifier2 = (v1 & 2) == 0 ? modifier0 : Modifier.m0;
                boolean z6 = false;
                if((v1 & 4) == 0) {
                    lazyGridState3 = lazyGridState0;
                }
                else {
                    lazyGridState3 = LazyGridStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                PaddingValues paddingValues3 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v1 & 16) == 0) {
                    z6 = z;
                }
                if((v1 & 0x20) == 0) {
                    arrangement$Vertical3 = arrangement$Vertical0;
                }
                else {
                    arrangement$Vertical3 = z6 ? Arrangement.a.d() : Arrangement.a.r();
                    v2 &= 0xFFF8FFFF;
                }
                Horizontal arrangement$Horizontal3 = (v1 & 0x40) == 0 ? arrangement$Horizontal0 : Arrangement.a.p();
                if((v1 & 0x80) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.a.a(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    z4 = z1;
                    lazyGridState2 = lazyGridState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    flingBehavior2 = flingBehavior3;
                }
                else {
                    lazyGridState2 = lazyGridState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    flingBehavior2 = flingBehavior3;
                    z4 = true;
                }
            }
            else {
                composer1.m();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                modifier2 = modifier0;
                flingBehavior2 = flingBehavior0;
                z4 = z1;
                lazyGridState2 = lazyGridState0;
                z5 = z;
                arrangement$Vertical2 = arrangement$Vertical0;
                paddingValues2 = paddingValues0;
                arrangement$Horizontal2 = arrangement$Horizontal0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x588990D0, v2, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:62)");
            }
            LazyGridKt.a(modifier2, lazyGridState2, LazyGridDslKt.m(gridCells0, arrangement$Horizontal2, paddingValues2, composer1, v2 & 14 | v2 >> 15 & 0x70 | v2 >> 3 & 0x380), paddingValues2, z5, true, flingBehavior2, z4, arrangement$Vertical2, arrangement$Horizontal2, function10, composer1, v2 >> 3 & 14 | 0x30000 | v2 >> 3 & 0x70 | v2 & 0x1C00 | 0xE000 & v2 | v2 >> 3 & 0x380000 | v2 >> 3 & 0x1C00000 | v2 << 9 & 0xE000000 | v2 << 9 & 0x70000000, v2 >> 27 & 14, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            paddingValues1 = paddingValues2;
            lazyGridState1 = lazyGridState2;
            z3 = z5;
            arrangement$Vertical1 = arrangement$Vertical2;
            flingBehavior1 = flingBehavior2;
            z2 = z4;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            z2 = z1;
            lazyGridState1 = lazyGridState0;
            paddingValues1 = paddingValues0;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            z3 = z;
            arrangement$Vertical1 = arrangement$Vertical0;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(gridCells0, modifier1, lazyGridState1, paddingValues1, z3, arrangement$Vertical1, arrangement$Horizontal1, flingBehavior1, z2, function10, v, v1) {
                final GridCells e;
                final Modifier f;
                final LazyGridState g;
                final PaddingValues h;
                final boolean i;
                final Vertical j;
                final Horizontal k;
                final FlingBehavior l;
                final boolean m;
                final Function1 n;
                final int o;
                final int p;

                {
                    this.e = gridCells0;
                    this.f = modifier0;
                    this.g = lazyGridState0;
                    this.h = paddingValues0;
                    this.i = z;
                    this.j = arrangement$Vertical0;
                    this.k = arrangement$Horizontal0;
                    this.l = flingBehavior0;
                    this.m = z1;
                    this.n = function10;
                    this.o = v;
                    this.p = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyGridDslKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer0, (this.o | 1) & -920350135 | ((0x24924924 & (this.o | 1)) >> 1 | 306783378 & (this.o | 1)) | (306783378 & (this.o | 1)) << 1 & (0x24924924 & (this.o | 1)), this.p);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private static final List d(int v, int v1, int v2) {
        int v3 = v - v2 * (v1 - 1);
        List list0 = new ArrayList(v1);
        for(int v4 = 0; v4 < v1; ++v4) {
            ((ArrayList)list0).add(((int)((v4 >= v3 % v1 ? 0 : 1) + v3 / v1)));
        }
        return list0;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void e(@l LazyGridScope lazyGridScope0, @l List list0, @m Function1 function10, @m o o0, @l Function1 function11, @l q q0) {
        L.p(lazyGridScope0, "<this>");
        L.p(list0, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        int v = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.3 lazyGridDslKt$items$30 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.2 lazyGridDslKt$items$20 = function10 == null ? null : new Function1(function10, list0) {
            final Function1 e;
            final List f;

            {
                this.e = function10;
                this.f = list0;
                super(1);
            }

            @l
            public final Object a(int v) {
                Object object0 = this.f.get(v);
                return this.e.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        if(o0 != null) {
            lazyGridDslKt$items$30 = new o(o0, list0) {
                final o e;
                final List f;

                {
                    this.e = o0;
                    this.f = list0;
                    super(2);
                }

                public final long a(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    L.p(lazyGridItemSpanScope0, "$this$null");
                    Object object0 = this.f.get(v);
                    return ((GridItemSpan)this.e.invoke(lazyGridItemSpanScope0, object0)).i();
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.a(this.a(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }
            };
        }
        lazyGridScope0.a(v, lazyGridDslKt$items$20, lazyGridDslKt$items$30, new Function1(function11, list0) {
            final Function1 e;
            final List f;

            {
                this.e = function10;
                this.f = list0;
                super(1);
            }

            @m
            public final Object a(int v) {
                Object object0 = this.f.get(v);
                return this.e.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.c(0x29B3C0FE, true, new q(q0, list0) {
            final q e;
            final List f;

            {
                this.e = q0;
                this.f = list0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyGridItemScope lazyGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x29B3C0FE, v2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:390)");
                }
                Object object0 = this.f.get(v);
                this.e.T0(lazyGridItemScope0, object0, composer0, ((int)(v2 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void f(@l LazyGridScope lazyGridScope0, @l Object[] arr_object, @m Function1 function10, @m o o0, @l Function1 function11, @l q q0) {
        L.p(lazyGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.8 lazyGridDslKt$items$80 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.7 lazyGridDslKt$items$70 = function10 == null ? null : new Function1(function10, arr_object) {
            final Function1 e;
            final Object[] f;

            {
                this.e = function10;
                this.f = arr_object;
                super(1);
            }

            @l
            public final Object a(int v) {
                return this.e.invoke(this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        if(o0 != null) {
            lazyGridDslKt$items$80 = new o(o0, arr_object) {
                final o e;
                final Object[] f;

                {
                    this.e = o0;
                    this.f = arr_object;
                    super(2);
                }

                public final long a(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    L.p(lazyGridItemSpanScope0, "$this$null");
                    return ((GridItemSpan)this.e.invoke(lazyGridItemSpanScope0, this.f[v])).i();
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.a(this.a(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }
            };
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.9 lazyGridDslKt$items$90 = new Function1(function11, arr_object) {
            final Function1 e;
            final Object[] f;

            {
                this.e = function10;
                this.f = arr_object;
                super(1);
            }

            @m
            public final Object a(int v) {
                return this.e.invoke(this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(407562193, true, new q(q0, arr_object) {
            final q e;
            final Object[] f;

            {
                this.e = q0;
                this.f = arr_object;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyGridItemScope lazyGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(407562193, v2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:456)");
                }
                this.e.T0(lazyGridItemScope0, this.f[v], composer0, ((int)(v2 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
        lazyGridScope0.a(arr_object.length, lazyGridDslKt$items$70, lazyGridDslKt$items$80, lazyGridDslKt$items$90, composableLambda0);
    }

    public static void g(LazyGridScope lazyGridScope0, List list0, Function1 function10, o o0, Function1 function11, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.3 lazyGridDslKt$items$30 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            o0 = null;
        }
        if((v & 8) != 0) {
            function11 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1.e;
        }
        L.p(lazyGridScope0, "<this>");
        L.p(list0, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        int v1 = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.2 lazyGridDslKt$items$20 = function10 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.2(function10, list0);
        if(o0 != null) {
            lazyGridDslKt$items$30 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.3(o0, list0);
        }
        lazyGridScope0.a(v1, lazyGridDslKt$items$20, lazyGridDslKt$items$30, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.4(function11, list0), ComposableLambdaKt.c(0x29B3C0FE, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.5(q0, list0)));

        @s0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1\n*L\n1#1,493:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1.e = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1() {
                super(1);
            }

            @m
            public final Void a(Object object0) [...] // Inlined contents

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }
        }

    }

    public static void h(LazyGridScope lazyGridScope0, Object[] arr_object, Function1 function10, o o0, Function1 function11, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.8 lazyGridDslKt$items$80 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            o0 = null;
        }
        if((v & 8) != 0) {
            function11 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6.e;
        }
        L.p(lazyGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.7 lazyGridDslKt$items$70 = function10 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.7(function10, arr_object);
        if(o0 != null) {
            lazyGridDslKt$items$80 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.8(o0, arr_object);
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.9 lazyGridDslKt$items$90 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.9(function11, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(407562193, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.10(q0, arr_object));
        lazyGridScope0.a(arr_object.length, lazyGridDslKt$items$70, lazyGridDslKt$items$80, lazyGridDslKt$items$90, composableLambda0);

        @s0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$6\n*L\n1#1,493:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6.e = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6() {
                super(1);
            }

            @m
            public final Void a(Object object0) [...] // Inlined contents

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }
        }

    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void i(@l LazyGridScope lazyGridScope0, @l List list0, @m o o0, @m p p0, @l o o1, @l r r0) {
        L.p(lazyGridScope0, "<this>");
        L.p(list0, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        int v = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.3 lazyGridDslKt$itemsIndexed$30 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.2 lazyGridDslKt$itemsIndexed$20 = o0 == null ? null : new Function1(o0, list0) {
            final o e;
            final List f;

            {
                this.e = o0;
                this.f = list0;
                super(1);
            }

            @l
            public final Object a(int v) {
                Object object0 = this.f.get(v);
                return this.e.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        if(p0 != null) {
            lazyGridDslKt$itemsIndexed$30 = new o(p0, list0) {
                final p e;
                final List f;

                {
                    this.e = p0;
                    this.f = list0;
                    super(2);
                }

                public final long a(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    L.p(lazyGridItemSpanScope0, "$this$null");
                    Object object0 = this.f.get(v);
                    return ((GridItemSpan)this.e.invoke(lazyGridItemSpanScope0, v, object0)).i();
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.a(this.a(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }
            };
        }
        lazyGridScope0.a(v, lazyGridDslKt$itemsIndexed$20, lazyGridDslKt$itemsIndexed$30, new Function1(o1, list0) {
            final o e;
            final List f;

            {
                this.e = o0;
                this.f = list0;
                super(1);
            }

            @m
            public final Object a(int v) {
                Object object0 = this.f.get(v);
                return this.e.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.c(0x49456F69, true, new q(r0, list0) {
            final r e;
            final List f;

            {
                this.e = r0;
                this.f = list0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyGridItemScope lazyGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x49456F69, v2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:423)");
                }
                Object object0 = this.f.get(v);
                this.e.K0(lazyGridItemScope0, v, object0, composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void j(@l LazyGridScope lazyGridScope0, @l Object[] arr_object, @m o o0, @m p p0, @l o o1, @l r r0) {
        L.p(lazyGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.8 lazyGridDslKt$itemsIndexed$80 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.7 lazyGridDslKt$itemsIndexed$70 = o0 == null ? null : new Function1(o0, arr_object) {
            final o e;
            final Object[] f;

            {
                this.e = o0;
                this.f = arr_object;
                super(1);
            }

            @l
            public final Object a(int v) {
                return this.e.invoke(v, this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        if(p0 != null) {
            lazyGridDslKt$itemsIndexed$80 = new o(p0, arr_object) {
                final p e;
                final Object[] f;

                {
                    this.e = p0;
                    this.f = arr_object;
                    super(2);
                }

                public final long a(@l LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    L.p(lazyGridItemSpanScope0, "$this$null");
                    return ((GridItemSpan)this.e.invoke(lazyGridItemSpanScope0, v, this.f[v])).i();
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.a(this.a(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }
            };
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.9 lazyGridDslKt$itemsIndexed$90 = new Function1(o1, arr_object) {
            final o e;
            final Object[] f;

            {
                this.e = o0;
                this.f = arr_object;
                super(1);
            }

            @m
            public final Object a(int v) {
                return this.e.invoke(v, this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(0xC9AC493E, true, new q(r0, arr_object) {
            final r e;
            final Object[] f;

            {
                this.e = r0;
                this.f = arr_object;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyGridItemScope lazyGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xC9AC493E, v2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:489)");
                }
                this.e.K0(lazyGridItemScope0, v, this.f[v], composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
        lazyGridScope0.a(arr_object.length, lazyGridDslKt$itemsIndexed$70, lazyGridDslKt$itemsIndexed$80, lazyGridDslKt$itemsIndexed$90, composableLambda0);
    }

    public static void k(LazyGridScope lazyGridScope0, List list0, o o0, p p0, o o1, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.3 lazyGridDslKt$itemsIndexed$30 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            p0 = null;
        }
        if((v & 8) != 0) {
            o1 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1.e;
        }
        L.p(lazyGridScope0, "<this>");
        L.p(list0, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        int v1 = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.2 lazyGridDslKt$itemsIndexed$20 = o0 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.2(o0, list0);
        if(p0 != null) {
            lazyGridDslKt$itemsIndexed$30 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.3(p0, list0);
        }
        lazyGridScope0.a(v1, lazyGridDslKt$itemsIndexed$20, lazyGridDslKt$itemsIndexed$30, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.4(o1, list0), ComposableLambdaKt.c(0x49456F69, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.5(r0, list0)));

        @s0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$1\n*L\n1#1,493:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1 extends N implements o {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1.e = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1() {
                super(2);
            }

            @m
            public final Void a(int v, Object object0) {
                return null;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), object1);
            }
        }

    }

    public static void l(LazyGridScope lazyGridScope0, Object[] arr_object, o o0, p p0, o o1, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.8 lazyGridDslKt$itemsIndexed$80 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            p0 = null;
        }
        if((v & 8) != 0) {
            o1 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6.e;
        }
        L.p(lazyGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.7 lazyGridDslKt$itemsIndexed$70 = o0 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.7(o0, arr_object);
        if(p0 != null) {
            lazyGridDslKt$itemsIndexed$80 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.8(p0, arr_object);
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.9 lazyGridDslKt$itemsIndexed$90 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.9(o1, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(0xC9AC493E, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.10(r0, arr_object));
        lazyGridScope0.a(arr_object.length, lazyGridDslKt$itemsIndexed$70, lazyGridDslKt$itemsIndexed$80, lazyGridDslKt$itemsIndexed$90, composableLambda0);

        @s0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$6\n*L\n1#1,493:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6 extends N implements o {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6.e = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6() {
                super(2);
            }

            @m
            public final Void a(int v, Object object0) {
                return null;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), object1);
            }
        }

    }

    @Composable
    private static final o m(GridCells gridCells0, Horizontal arrangement$Horizontal0, PaddingValues paddingValues0, Composer composer0, int v) {
        composer0.V(-1355301804);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1355301804, v, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(gridCells0);
        boolean z1 = composer0.t(arrangement$Horizontal0);
        boolean z2 = composer0.t(paddingValues0);
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.rememberColumnWidthSums.1.1 lazyGridDslKt$rememberColumnWidthSums$1$10 = composer0.W();
        if((z | z1 | z2) != 0 || lazyGridDslKt$rememberColumnWidthSums$1$10 == Composer.a.a()) {
            lazyGridDslKt$rememberColumnWidthSums$1$10 = new o(paddingValues0, gridCells0, arrangement$Horizontal0) {
                final PaddingValues e;
                final GridCells f;
                final Horizontal g;

                {
                    this.e = paddingValues0;
                    this.f = gridCells0;
                    this.g = arrangement$Horizontal0;
                    super(2);
                }

                @l
                public final List a(@l Density density0, long v) {
                    L.p(density0, "$this$null");
                    if(Constraints.p(v) == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("LazyVerticalGrid\'s width should be bound by parent.");
                    }
                    float f = Dp.g(PaddingKt.i(this.e, LayoutDirection.a) + PaddingKt.h(this.e, LayoutDirection.a));
                    int v1 = Constraints.p(v);
                    int v2 = density0.b1(f);
                    int v3 = density0.b1(this.g.a());
                    List list0 = u.Y5(this.f.a(density0, v1 - v2, v3));
                    int v4 = list0.size();
                    for(int v5 = 1; v5 < v4; ++v5) {
                        list0.set(v5, ((int)(((Number)list0.get(v5)).intValue() + ((Number)list0.get(v5 - 1)).intValue())));
                    }
                    return list0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Density)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyGridDslKt$rememberColumnWidthSums$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyGridDslKt$rememberColumnWidthSums$1$10;
    }

    @Composable
    private static final o n(GridCells gridCells0, Vertical arrangement$Vertical0, PaddingValues paddingValues0, Composer composer0, int v) {
        composer0.V(0xE4947F5);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE4947F5, v, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:180)");
        }
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(gridCells0);
        boolean z1 = composer0.t(arrangement$Vertical0);
        boolean z2 = composer0.t(paddingValues0);
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.rememberRowHeightSums.1.1 lazyGridDslKt$rememberRowHeightSums$1$10 = composer0.W();
        if((z | z1 | z2) != 0 || lazyGridDslKt$rememberRowHeightSums$1$10 == Composer.a.a()) {
            lazyGridDslKt$rememberRowHeightSums$1$10 = new o(paddingValues0, gridCells0, arrangement$Vertical0) {
                final PaddingValues e;
                final GridCells f;
                final Vertical g;

                {
                    this.e = paddingValues0;
                    this.f = gridCells0;
                    this.g = arrangement$Vertical0;
                    super(2);
                }

                @l
                public final List a(@l Density density0, long v) {
                    L.p(density0, "$this$null");
                    if(Constraints.o(v) == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("LazyHorizontalGrid\'s height should be bound by parent.");
                    }
                    float f = Dp.g(this.e.d() + this.e.a());
                    int v1 = Constraints.o(v);
                    int v2 = density0.b1(f);
                    int v3 = density0.b1(this.g.a());
                    List list0 = u.Y5(this.f.a(density0, v1 - v2, v3));
                    int v4 = list0.size();
                    for(int v5 = 1; v5 < v4; ++v5) {
                        list0.set(v5, ((int)(((Number)list0.get(v5)).intValue() + ((Number)list0.get(v5 - 1)).intValue())));
                    }
                    return list0;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Density)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyGridDslKt$rememberRowHeightSums$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyGridDslKt$rememberRowHeightSums$1$10;
    }
}

