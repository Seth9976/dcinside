package androidx.compose.foundation.lazy.staggeredgrid;

import A3.o;
import A3.q;
import A3.r;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,434:1\n154#2:435\n154#2:436\n154#2:437\n154#2:448\n154#2:449\n154#2:450\n67#3,3:438\n66#3:441\n67#3,3:451\n66#3:454\n1114#4,6:442\n1114#4,6:455\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n63#1:435\n65#1:436\n66#1:437\n148#1:448\n150#1:449\n151#1:450\n93#1:438,3\n93#1:441\n178#1:451,3\n178#1:454\n93#1:442,6\n178#1:455,6\n*E\n"})
public final class LazyStaggeredGridDslKt {
    @ExperimentalFoundationApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l StaggeredGridCells staggeredGridCells0, @m Modifier modifier0, @m LazyStaggeredGridState lazyStaggeredGridState0, @m PaddingValues paddingValues0, boolean z, @m Vertical arrangement$Vertical0, float f, @m FlingBehavior flingBehavior0, boolean z1, @l Function1 function10, @m Composer composer0, int v, int v1) {
        boolean z4;
        boolean z3;
        Vertical arrangement$Vertical2;
        PaddingValues paddingValues1;
        Modifier modifier2;
        FlingBehavior flingBehavior1;
        float f1;
        LazyStaggeredGridState lazyStaggeredGridState1;
        PaddingValues paddingValues2;
        boolean z6;
        Modifier modifier3;
        boolean z5;
        FlingBehavior flingBehavior2;
        float f2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        FlingBehavior flingBehavior3;
        LazyStaggeredGridState lazyStaggeredGridState3;
        Vertical arrangement$Vertical1;
        boolean z2;
        Modifier modifier1;
        int v2;
        L.p(staggeredGridCells0, "rows");
        L.p(function10, "content");
        Composer composer1 = composer0.G(-8666074);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(staggeredGridCells0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.t(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z;
        }
        else if((v & 0xE000) == 0) {
            z2 = z;
            v2 |= (composer1.v(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z;
        }
        if((v1 & 0x20) == 0) {
            arrangement$Vertical1 = arrangement$Vertical0;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(arrangement$Vertical1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.x(f) ? 0x100000 : 0x80000);
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
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.Y(function10) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 4) != 4 || (0x5B6DB6DB & v2) != 306783378 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.m0;
                }
                if((v1 & 4) == 0) {
                    lazyStaggeredGridState3 = lazyStaggeredGridState0;
                }
                else {
                    lazyStaggeredGridState3 = LazyStaggeredGridStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                PaddingValues paddingValues3 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v1 & 16) != 0) {
                    z2 = false;
                }
                Vertical arrangement$Vertical3 = (v1 & 0x20) == 0 ? arrangement$Vertical1 : Arrangement.a.z(0.0f);
                float f3 = (v1 & 0x40) == 0 ? f : 0.0f;
                if((v1 & 0x80) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.a.a(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    z5 = z1;
                    f2 = f3;
                    lazyStaggeredGridState2 = lazyStaggeredGridState3;
                    modifier3 = modifier1;
                    arrangement$Vertical1 = arrangement$Vertical3;
                    flingBehavior2 = flingBehavior3;
                    z6 = z2;
                }
                else {
                    f2 = f3;
                    lazyStaggeredGridState2 = lazyStaggeredGridState3;
                    modifier3 = modifier1;
                    arrangement$Vertical1 = arrangement$Vertical3;
                    flingBehavior2 = flingBehavior3;
                    z6 = z2;
                    z5 = true;
                }
                paddingValues2 = paddingValues3;
            }
            else {
                composer1.m();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridState0;
                f2 = f;
                flingBehavior2 = flingBehavior0;
                z5 = z1;
                modifier3 = modifier1;
                z6 = z2;
                paddingValues2 = paddingValues0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(-8666074, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:143)");
            }
            float f4 = arrangement$Vertical1.a();
            o o0 = LazyStaggeredGridDslKt.l(staggeredGridCells0, arrangement$Vertical1, paddingValues2, composer1, v2 & 14 | v2 >> 12 & 0x70 | v2 >> 3 & 0x380);
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.b, o0, modifier3, paddingValues2, z6, flingBehavior2, z5, f2, f4, function10, composer1, v2 >> 3 & 0x1C00000 | (v2 << 6 & 0x1C00 | 56 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000 | v2 >> 3 & 0x380000) | v2 << 6 & 0xE000000, v2 >> 27 & 14, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier2 = modifier3;
            lazyStaggeredGridState1 = lazyStaggeredGridState2;
            arrangement$Vertical2 = arrangement$Vertical1;
            z3 = z6;
            paddingValues1 = paddingValues2;
            f1 = f2;
            flingBehavior1 = flingBehavior2;
            z4 = z5;
        }
        else {
            composer1.m();
            lazyStaggeredGridState1 = lazyStaggeredGridState0;
            f1 = f;
            flingBehavior1 = flingBehavior0;
            modifier2 = modifier1;
            paddingValues1 = paddingValues0;
            arrangement$Vertical2 = arrangement$Vertical1;
            z3 = z2;
            z4 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(staggeredGridCells0, modifier2, lazyStaggeredGridState1, paddingValues1, z3, arrangement$Vertical2, f1, flingBehavior1, z4, function10, v, v1) {
                final StaggeredGridCells e;
                final Modifier f;
                final LazyStaggeredGridState g;
                final PaddingValues h;
                final boolean i;
                final Vertical j;
                final float k;
                final FlingBehavior l;
                final boolean m;
                final Function1 n;
                final int o;
                final int p;

                {
                    this.e = staggeredGridCells0;
                    this.f = modifier0;
                    this.g = lazyStaggeredGridState0;
                    this.h = paddingValues0;
                    this.i = z;
                    this.j = arrangement$Vertical0;
                    this.k = f;
                    this.l = flingBehavior0;
                    this.m = z1;
                    this.n = function10;
                    this.o = v;
                    this.p = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyStaggeredGridDslKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer0, (this.o | 1) & -920350135 | ((0x24924924 & (this.o | 1)) >> 1 | 306783378 & (this.o | 1)) | (306783378 & (this.o | 1)) << 1 & (0x24924924 & (this.o | 1)), this.p);
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
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@l StaggeredGridCells staggeredGridCells0, @m Modifier modifier0, @m LazyStaggeredGridState lazyStaggeredGridState0, @m PaddingValues paddingValues0, boolean z, float f, @m Horizontal arrangement$Horizontal0, @m FlingBehavior flingBehavior0, boolean z1, @l Function1 function10, @m Composer composer0, int v, int v1) {
        boolean z4;
        boolean z3;
        float f1;
        PaddingValues paddingValues1;
        Modifier modifier2;
        FlingBehavior flingBehavior1;
        Horizontal arrangement$Horizontal1;
        LazyStaggeredGridState lazyStaggeredGridState1;
        PaddingValues paddingValues2;
        Horizontal arrangement$Horizontal2;
        boolean z6;
        float f2;
        Modifier modifier3;
        boolean z5;
        FlingBehavior flingBehavior2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        FlingBehavior flingBehavior3;
        LazyStaggeredGridState lazyStaggeredGridState3;
        boolean z2;
        Modifier modifier1;
        int v2;
        L.p(staggeredGridCells0, "columns");
        L.p(function10, "content");
        Composer composer1 = composer0.G(0x650C9692);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(staggeredGridCells0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x70) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.t(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x80;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z;
        }
        else if((v & 0xE000) == 0) {
            z2 = z;
            v2 |= (composer1.v(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.x(f) ? 0x20000 : 0x10000);
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
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.Y(function10) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 4) != 4 || (0x5B6DB6DB & v2) != 306783378 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                if((v1 & 2) != 0) {
                    modifier1 = Modifier.m0;
                }
                if((v1 & 4) == 0) {
                    lazyStaggeredGridState3 = lazyStaggeredGridState0;
                }
                else {
                    lazyStaggeredGridState3 = LazyStaggeredGridStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                PaddingValues paddingValues3 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v1 & 16) != 0) {
                    z2 = false;
                }
                float f3 = (v1 & 0x20) == 0 ? f : 0.0f;
                Horizontal arrangement$Horizontal3 = (v1 & 0x40) == 0 ? arrangement$Horizontal0 : Arrangement.a.z(0.0f);
                if((v1 & 0x80) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.a.a(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    z5 = z1;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    lazyStaggeredGridState2 = lazyStaggeredGridState3;
                    modifier3 = modifier1;
                    f2 = f3;
                    flingBehavior2 = flingBehavior3;
                    z6 = z2;
                }
                else {
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    lazyStaggeredGridState2 = lazyStaggeredGridState3;
                    modifier3 = modifier1;
                    f2 = f3;
                    flingBehavior2 = flingBehavior3;
                    z6 = z2;
                    z5 = true;
                }
                paddingValues2 = paddingValues3;
            }
            else {
                composer1.m();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridState0;
                flingBehavior2 = flingBehavior0;
                z5 = z1;
                modifier3 = modifier1;
                f2 = f;
                z6 = z2;
                arrangement$Horizontal2 = arrangement$Horizontal0;
                paddingValues2 = paddingValues0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x650C9692, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:58)");
            }
            float f4 = arrangement$Horizontal2.a();
            o o0 = LazyStaggeredGridDslKt.k(staggeredGridCells0, arrangement$Horizontal2, paddingValues2, composer1, v2 & 14 | v2 >> 15 & 0x70 | v2 >> 3 & 0x380);
            LazyStaggeredGridKt.a(lazyStaggeredGridState2, Orientation.a, o0, modifier3, paddingValues2, z6, flingBehavior2, z5, f2, f4, function10, composer1, v2 << 6 & 0x1C00 | 56 | 0xE000 & v2 << 3 | v2 << 3 & 0x70000 | v2 >> 3 & 0x380000 | v2 >> 3 & 0x1C00000 | v2 << 9 & 0xE000000, v2 >> 27 & 14, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier2 = modifier3;
            lazyStaggeredGridState1 = lazyStaggeredGridState2;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            z3 = z6;
            paddingValues1 = paddingValues2;
            f1 = f2;
            flingBehavior1 = flingBehavior2;
            z4 = z5;
        }
        else {
            composer1.m();
            lazyStaggeredGridState1 = lazyStaggeredGridState0;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            flingBehavior1 = flingBehavior0;
            modifier2 = modifier1;
            paddingValues1 = paddingValues0;
            f1 = f;
            z3 = z2;
            z4 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(staggeredGridCells0, modifier2, lazyStaggeredGridState1, paddingValues1, z3, f1, arrangement$Horizontal1, flingBehavior1, z4, function10, v, v1) {
                final StaggeredGridCells e;
                final Modifier f;
                final LazyStaggeredGridState g;
                final PaddingValues h;
                final boolean i;
                final float j;
                final Horizontal k;
                final FlingBehavior l;
                final boolean m;
                final Function1 n;
                final int o;
                final int p;

                {
                    this.e = staggeredGridCells0;
                    this.f = modifier0;
                    this.g = lazyStaggeredGridState0;
                    this.h = paddingValues0;
                    this.i = z;
                    this.j = f;
                    this.k = arrangement$Horizontal0;
                    this.l = flingBehavior0;
                    this.m = z1;
                    this.n = function10;
                    this.o = v;
                    this.p = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyStaggeredGridDslKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer0, (this.o | 1) & -920350135 | ((0x24924924 & (this.o | 1)) >> 1 | 306783378 & (this.o | 1)) | (306783378 & (this.o | 1)) << 1 & (0x24924924 & (this.o | 1)), this.p);
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
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void c(@l LazyStaggeredGridScope lazyStaggeredGridScope0, @l List list0, @m Function1 function10, @l Function1 function11, @m Function1 function12, @l q q0) {
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(list0, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        lazyStaggeredGridScope0.b(list0.size(), (function10 == null ? null : new Function1(function10, list0) {
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
        }), new Function1(function11, list0) {
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
        }, (function12 == null ? null : new Function1(function12, list0) {
            final Function1 e;
            final List f;

            {
                this.e = function10;
                this.f = list0;
                super(1);
            }

            @l
            public final StaggeredGridItemSpan a(int v) {
                Object object0 = this.f.get(v);
                return (StaggeredGridItemSpan)this.e.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }), ComposableLambdaKt.c(0xCB29BF61, true, new q(q0, list0) {
            final q e;
            final List f;

            {
                this.e = q0;
                this.f = list0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyStaggeredGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyStaggeredGridItemScope lazyStaggeredGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyStaggeredGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyStaggeredGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xCB29BF61, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:311)");
                }
                Object object0 = this.f.get(v);
                this.e.T0(lazyStaggeredGridItemScope0, object0, composer0, ((int)(v2 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void d(@l LazyStaggeredGridScope lazyStaggeredGridScope0, @l Object[] arr_object, @m Function1 function10, @l Function1 function11, @m Function1 function12, @l q q0) {
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.7.1 lazyStaggeredGridDslKt$items$7$10 = function10 == null ? null : new Function1(function10, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.8 lazyStaggeredGridDslKt$items$80 = new Function1(function11, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.9.1 lazyStaggeredGridDslKt$items$9$10 = function12 == null ? null : new Function1(function12, arr_object) {
            final Function1 e;
            final Object[] f;

            {
                this.e = function10;
                this.f = arr_object;
                super(1);
            }

            @l
            public final StaggeredGridItemSpan a(int v) {
                return (StaggeredGridItemSpan)this.e.invoke(this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(2101296000, true, new q(q0, arr_object) {
            final q e;
            final Object[] f;

            {
                this.e = q0;
                this.f = arr_object;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyStaggeredGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyStaggeredGridItemScope lazyStaggeredGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyStaggeredGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyStaggeredGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(2101296000, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:391)");
                }
                this.e.T0(lazyStaggeredGridItemScope0, this.f[v], composer0, ((int)(v2 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
        lazyStaggeredGridScope0.b(arr_object.length, lazyStaggeredGridDslKt$items$7$10, lazyStaggeredGridDslKt$items$80, lazyStaggeredGridDslKt$items$9$10, composableLambda0);
    }

    public static void e(LazyStaggeredGridScope lazyStaggeredGridScope0, List list0, Function1 function10, Function1 function11, Function1 function12, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.4.1 lazyStaggeredGridDslKt$items$4$10 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1.e;
        }
        if((v & 8) != 0) {
            function12 = null;
        }
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(list0, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        int v1 = list0.size();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.2.1 lazyStaggeredGridDslKt$items$2$10 = function10 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.2.1(function10, list0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.3 lazyStaggeredGridDslKt$items$30 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.3(function11, list0);
        if(function12 != null) {
            lazyStaggeredGridDslKt$items$4$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.4.1(function12, list0);
        }
        lazyStaggeredGridScope0.b(v1, lazyStaggeredGridDslKt$items$2$10, lazyStaggeredGridDslKt$items$30, lazyStaggeredGridDslKt$items$4$10, ComposableLambdaKt.c(0xCB29BF61, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.5(q0, list0)));

        @s0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1\n*L\n1#1,434:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1() {
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

    public static void f(LazyStaggeredGridScope lazyStaggeredGridScope0, Object[] arr_object, Function1 function10, Function1 function11, Function1 function12, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.9.1 lazyStaggeredGridDslKt$items$9$10 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6.e;
        }
        if((v & 8) != 0) {
            function12 = null;
        }
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.7.1 lazyStaggeredGridDslKt$items$7$10 = function10 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.7.1(function10, arr_object);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.8 lazyStaggeredGridDslKt$items$80 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.8(function11, arr_object);
        if(function12 != null) {
            lazyStaggeredGridDslKt$items$9$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.9.1(function12, arr_object);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(2101296000, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.10(q0, arr_object));
        lazyStaggeredGridScope0.b(arr_object.length, lazyStaggeredGridDslKt$items$7$10, lazyStaggeredGridDslKt$items$80, lazyStaggeredGridDslKt$items$9$10, composableLambda0);

        @s0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6\n*L\n1#1,434:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6() {
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

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void g(@l LazyStaggeredGridScope lazyStaggeredGridScope0, @l List list0, @m o o0, @l o o1, @m o o2, @l r r0) {
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(list0, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        lazyStaggeredGridScope0.b(list0.size(), (o0 == null ? null : new Function1(o0, list0) {
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
        }), new Function1(o1, list0) {
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
        }, (o2 == null ? null : new Function1(o2, list0) {
            final o e;
            final List f;

            {
                this.e = o0;
                this.f = list0;
                super(1);
            }

            @l
            public final StaggeredGridItemSpan a(int v) {
                Object object0 = this.f.get(v);
                return (StaggeredGridItemSpan)this.e.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }), ComposableLambdaKt.c(0x10FA3898, true, new q(r0, list0) {
            final r e;
            final List f;

            {
                this.e = r0;
                this.f = list0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyStaggeredGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyStaggeredGridItemScope lazyStaggeredGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyStaggeredGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyStaggeredGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x10FA3898, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:351)");
                }
                Object object0 = this.f.get(v);
                this.e.K0(lazyStaggeredGridItemScope0, v, object0, composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void h(@l LazyStaggeredGridScope lazyStaggeredGridScope0, @l Object[] arr_object, @m o o0, @l o o1, @m o o2, @l r r0) {
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.7.1 lazyStaggeredGridDslKt$itemsIndexed$7$10 = o0 == null ? null : new Function1(o0, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.8 lazyStaggeredGridDslKt$itemsIndexed$80 = new Function1(o1, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.9.1 lazyStaggeredGridDslKt$itemsIndexed$9$10 = o2 == null ? null : new Function1(o2, arr_object) {
            final o e;
            final Object[] f;

            {
                this.e = o0;
                this.f = arr_object;
                super(1);
            }

            @l
            public final StaggeredGridItemSpan a(int v) {
                return (StaggeredGridItemSpan)this.e.invoke(v, this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(0xD00C7DA1, true, new q(r0, arr_object) {
            final r e;
            final Object[] f;

            {
                this.e = r0;
                this.f = arr_object;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyStaggeredGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyStaggeredGridItemScope lazyStaggeredGridItemScope0, int v, @m Composer composer0, int v1) {
                L.p(lazyStaggeredGridItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyStaggeredGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xD00C7DA1, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:431)");
                }
                this.e.K0(lazyStaggeredGridItemScope0, v, this.f[v], composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
        lazyStaggeredGridScope0.b(arr_object.length, lazyStaggeredGridDslKt$itemsIndexed$7$10, lazyStaggeredGridDslKt$itemsIndexed$80, lazyStaggeredGridDslKt$itemsIndexed$9$10, composableLambda0);
    }

    public static void i(LazyStaggeredGridScope lazyStaggeredGridScope0, List list0, o o0, o o1, o o2, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.4.1 lazyStaggeredGridDslKt$itemsIndexed$4$10 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            o1 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1.e;
        }
        if((v & 8) != 0) {
            o2 = null;
        }
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(list0, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        int v1 = list0.size();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.2.1 lazyStaggeredGridDslKt$itemsIndexed$2$10 = o0 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.2.1(o0, list0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.3 lazyStaggeredGridDslKt$itemsIndexed$30 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.3(o1, list0);
        if(o2 != null) {
            lazyStaggeredGridDslKt$itemsIndexed$4$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.4.1(o2, list0);
        }
        lazyStaggeredGridScope0.b(v1, lazyStaggeredGridDslKt$itemsIndexed$2$10, lazyStaggeredGridDslKt$itemsIndexed$30, lazyStaggeredGridDslKt$itemsIndexed$4$10, ComposableLambdaKt.c(0x10FA3898, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.5(r0, list0)));

        @s0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1\n*L\n1#1,434:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1 extends N implements o {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1() {
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

    public static void j(LazyStaggeredGridScope lazyStaggeredGridScope0, Object[] arr_object, o o0, o o1, o o2, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.9.1 lazyStaggeredGridDslKt$itemsIndexed$9$10 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            o1 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6.e;
        }
        if((v & 8) != 0) {
            o2 = null;
        }
        L.p(lazyStaggeredGridScope0, "<this>");
        L.p(arr_object, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.7.1 lazyStaggeredGridDslKt$itemsIndexed$7$10 = o0 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.7.1(o0, arr_object);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.8 lazyStaggeredGridDslKt$itemsIndexed$80 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.8(o1, arr_object);
        if(o2 != null) {
            lazyStaggeredGridDslKt$itemsIndexed$9$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.9.1(o2, arr_object);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(0xD00C7DA1, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.10(r0, arr_object));
        lazyStaggeredGridScope0.b(arr_object.length, lazyStaggeredGridDslKt$itemsIndexed$7$10, lazyStaggeredGridDslKt$itemsIndexed$80, lazyStaggeredGridDslKt$itemsIndexed$9$10, composableLambda0);

        @s0({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6\n*L\n1#1,434:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6 extends N implements o {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6 e;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6.e = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6() {
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
    private static final o k(StaggeredGridCells staggeredGridCells0, Horizontal arrangement$Horizontal0, PaddingValues paddingValues0, Composer composer0, int v) {
        composer0.V(0x550CE5B2);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x550CE5B2, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnWidthSums (LazyStaggeredGridDsl.kt:88)");
        }
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(staggeredGridCells0);
        boolean z1 = composer0.t(arrangement$Horizontal0);
        boolean z2 = composer0.t(paddingValues0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.rememberColumnWidthSums.1.1 lazyStaggeredGridDslKt$rememberColumnWidthSums$1$10 = composer0.W();
        if((z | z1 | z2) != 0 || lazyStaggeredGridDslKt$rememberColumnWidthSums$1$10 == Composer.a.a()) {
            lazyStaggeredGridDslKt$rememberColumnWidthSums$1$10 = new o(paddingValues0, staggeredGridCells0, arrangement$Horizontal0) {
                final PaddingValues e;
                final StaggeredGridCells f;
                final Horizontal g;

                {
                    this.e = paddingValues0;
                    this.f = staggeredGridCells0;
                    this.g = arrangement$Horizontal0;
                    super(2);
                }

                @l
                public final int[] a(@l Density density0, long v) {
                    L.p(density0, "$this$null");
                    if(Constraints.p(v) == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid\'s width should be bound by parent.");
                    }
                    float f = Dp.g(PaddingKt.i(this.e, LayoutDirection.a) + PaddingKt.h(this.e, LayoutDirection.a));
                    int v1 = Constraints.p(v);
                    int v2 = density0.b1(f);
                    int v3 = density0.b1(this.g.a());
                    List list0 = this.f.a(density0, v1 - v2, v3);
                    int v4 = list0.size();
                    int[] arr_v = new int[v4];
                    for(int v5 = 0; v5 < v4; ++v5) {
                        arr_v[v5] = ((Number)list0.get(v5)).intValue();
                    }
                    int v6 = list0.size();
                    for(int v7 = 1; v7 < v6; ++v7) {
                        arr_v[v7] += arr_v[v7 - 1];
                    }
                    return arr_v;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Density)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyStaggeredGridDslKt$rememberColumnWidthSums$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyStaggeredGridDslKt$rememberColumnWidthSums$1$10;
    }

    @Composable
    private static final o l(StaggeredGridCells staggeredGridCells0, Vertical arrangement$Vertical0, PaddingValues paddingValues0, Composer composer0, int v) {
        composer0.V(0x9CBEEF55);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x9CBEEF55, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowHeightSums (LazyStaggeredGridDsl.kt:173)");
        }
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(staggeredGridCells0);
        boolean z1 = composer0.t(arrangement$Vertical0);
        boolean z2 = composer0.t(paddingValues0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.rememberRowHeightSums.1.1 lazyStaggeredGridDslKt$rememberRowHeightSums$1$10 = composer0.W();
        if((z | z1 | z2) != 0 || lazyStaggeredGridDslKt$rememberRowHeightSums$1$10 == Composer.a.a()) {
            lazyStaggeredGridDslKt$rememberRowHeightSums$1$10 = new o(paddingValues0, staggeredGridCells0, arrangement$Vertical0) {
                final PaddingValues e;
                final StaggeredGridCells f;
                final Vertical g;

                {
                    this.e = paddingValues0;
                    this.f = staggeredGridCells0;
                    this.g = arrangement$Vertical0;
                    super(2);
                }

                @l
                public final int[] a(@l Density density0, long v) {
                    L.p(density0, "$this$null");
                    if(Constraints.o(v) == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid\'s height should be bound by parent.");
                    }
                    float f = Dp.g(this.e.d() + this.e.a());
                    int v1 = Constraints.o(v);
                    int v2 = density0.b1(f);
                    int v3 = density0.b1(this.g.a());
                    List list0 = this.f.a(density0, v1 - v2, v3);
                    int v4 = list0.size();
                    int[] arr_v = new int[v4];
                    for(int v5 = 0; v5 < v4; ++v5) {
                        arr_v[v5] = ((Number)list0.get(v5)).intValue();
                    }
                    int v6 = list0.size();
                    for(int v7 = 1; v7 < v6; ++v7) {
                        arr_v[v7] += arr_v[v7 - 1];
                    }
                    return arr_v;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((Density)object0), ((Constraints)object1).x());
                }
            };
            composer0.O(lazyStaggeredGridDslKt$rememberRowHeightSums$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyStaggeredGridDslKt$rememberRowHeightSums$1$10;
    }
}

