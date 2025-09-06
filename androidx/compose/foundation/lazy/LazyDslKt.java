package androidx.compose.foundation.lazy;

import A3.o;
import A3.q;
import A3.r;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
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
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import y4.l;

@s0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n136#1,12:424\n171#1,12:436\n206#1,12:448\n241#1,12:460\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n154#1:424,12\n189#1:436,12\n224#1:448,12\n259#1:460,12\n293#1:472\n349#1:473\n377#1:474\n403#1:475\n*E\n"})
public final class LazyDslKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @k(level = m.c, message = "Use the non deprecated overload")
    public static final void a(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, Vertical arrangement$Vertical0, Horizontal alignment$Horizontal0, FlingBehavior flingBehavior0, Function1 function10, Composer composer0, int v, int v1) {
        Vertical arrangement$Vertical2;
        Horizontal alignment$Horizontal2;
        boolean z2;
        PaddingValues paddingValues2;
        LazyListState lazyListState1;
        FlingBehavior flingBehavior1;
        Modifier modifier1;
        LazyListState lazyListState2;
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        LazyListState lazyListState3;
        Horizontal alignment$Horizontal1;
        int v3;
        Vertical arrangement$Vertical1;
        boolean z1;
        PaddingValues paddingValues1;
        int v2;
        L.p(function10, "content");
        Composer composer1 = composer0.G(0xDE6BE73B);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.t(lazyListState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            paddingValues1 = paddingValues0;
        }
        else if((v & 0x380) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.t(paddingValues1) ? 0x100 : 0x80);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0x1C00) == 0) {
            z1 = z;
            v2 |= (composer1.v(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v & 0xE000) == 0) {
            if((v1 & 16) == 0) {
                arrangement$Vertical1 = arrangement$Vertical0;
                v3 = composer1.t(arrangement$Vertical1) ? 0x4000 : 0x2000;
            }
            else {
                arrangement$Vertical1 = arrangement$Vertical0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        if((v1 & 0x20) == 0) {
            alignment$Horizontal1 = alignment$Horizontal0;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(alignment$Horizontal1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            alignment$Horizontal1 = alignment$Horizontal0;
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.t(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.Y(function10) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.m0;
                if((v1 & 2) == 0) {
                    lazyListState3 = lazyListState0;
                }
                else {
                    lazyListState3 = LazyListStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    paddingValues1 = PaddingKt.a(0.0f);
                }
                if((v1 & 8) != 0) {
                    z1 = false;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    arrangement$Vertical1 = z1 ? Arrangement.a.d() : Arrangement.a.r();
                }
                if((v1 & 0x20) != 0) {
                    alignment$Horizontal1 = Alignment.a.u();
                }
                if((v1 & 0x40) == 0) {
                    modifier2 = modifier3;
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    modifier2 = modifier3;
                    flingBehavior2 = ScrollableDefaults.a.a(composer1, 6);
                }
                lazyListState2 = lazyListState3;
            }
            else {
                composer1.m();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                flingBehavior2 = flingBehavior0;
                lazyListState2 = lazyListState0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDE6BE73B, v2, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            LazyDslKt.b(modifier2, lazyListState2, paddingValues1, z1, arrangement$Vertical1, alignment$Horizontal1, flingBehavior2, true, function10, composer1, v2 & 14 | 0xC00000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | v2 & 0x70000 | v2 & 0x380000 | 0xE000000 & v2 << 3, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            lazyListState1 = lazyListState2;
            paddingValues2 = paddingValues1;
            z2 = z1;
            arrangement$Vertical2 = arrangement$Vertical1;
            alignment$Horizontal2 = alignment$Horizontal1;
            flingBehavior1 = flingBehavior2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            flingBehavior1 = flingBehavior0;
            lazyListState1 = lazyListState0;
            paddingValues2 = paddingValues1;
            z2 = z1;
            alignment$Horizontal2 = alignment$Horizontal1;
            arrangement$Vertical2 = arrangement$Vertical1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, lazyListState1, paddingValues2, z2, arrangement$Vertical2, alignment$Horizontal2, flingBehavior1, function10, v, v1) {
                final Modifier e;
                final LazyListState f;
                final PaddingValues g;
                final boolean h;
                final Vertical i;
                final Horizontal j;
                final FlingBehavior k;
                final Function1 l;
                final int m;
                final int n;

                {
                    this.e = modifier0;
                    this.f = lazyListState0;
                    this.g = paddingValues0;
                    this.h = z;
                    this.i = arrangement$Vertical0;
                    this.j = alignment$Horizontal0;
                    this.k = flingBehavior0;
                    this.l = function10;
                    this.m = v;
                    this.n = v1;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    LazyDslKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer0, (this.m | 1) & -920350135 | ((0x24924924 & (this.m | 1)) >> 1 | 306783378 & (this.m | 1)) | (306783378 & (this.m | 1)) << 1 & (0x24924924 & (this.m | 1)), this.n);
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
    public static final void b(@y4.m Modifier modifier0, @y4.m LazyListState lazyListState0, @y4.m PaddingValues paddingValues0, boolean z, @y4.m Vertical arrangement$Vertical0, @y4.m Horizontal alignment$Horizontal0, @y4.m FlingBehavior flingBehavior0, boolean z1, @l Function1 function10, @y4.m Composer composer0, int v, int v1) {
        boolean z3;
        Horizontal alignment$Horizontal1;
        Vertical arrangement$Vertical1;
        boolean z2;
        PaddingValues paddingValues1;
        FlingBehavior flingBehavior1;
        LazyListState lazyListState1;
        Modifier modifier1;
        Horizontal alignment$Horizontal2;
        Vertical arrangement$Vertical2;
        boolean z5;
        PaddingValues paddingValues2;
        boolean z4;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState2;
        Modifier modifier2;
        FlingBehavior flingBehavior3;
        Vertical arrangement$Vertical3;
        LazyListState lazyListState3;
        int v2;
        L.p(function10, "content");
        Composer composer1 = composer0.G(-740714857);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.t(lazyListState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(paddingValues0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.t(arrangement$Vertical0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.t(alignment$Horizontal0) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.t(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.v(z1) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.Y(function10) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v2) != 0x2492492 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.m0;
                boolean z6 = false;
                if((v1 & 2) == 0) {
                    lazyListState3 = lazyListState0;
                }
                else {
                    lazyListState3 = LazyListStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= 0xFFFFFF8F;
                }
                PaddingValues paddingValues3 = (v1 & 4) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v1 & 8) == 0) {
                    z6 = z;
                }
                if((v1 & 16) == 0) {
                    arrangement$Vertical3 = arrangement$Vertical0;
                }
                else {
                    arrangement$Vertical3 = z6 ? Arrangement.a.d() : Arrangement.a.r();
                    v2 &= 0xFFFF1FFF;
                }
                Horizontal alignment$Horizontal3 = (v1 & 0x20) == 0 ? alignment$Horizontal0 : Alignment.a.u();
                if((v1 & 0x40) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.a.a(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) == 0) {
                    z4 = z1;
                    modifier2 = modifier3;
                    lazyListState2 = lazyListState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    alignment$Horizontal2 = alignment$Horizontal3;
                    flingBehavior2 = flingBehavior3;
                }
                else {
                    modifier2 = modifier3;
                    lazyListState2 = lazyListState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    alignment$Horizontal2 = alignment$Horizontal3;
                    flingBehavior2 = flingBehavior3;
                    z4 = true;
                }
            }
            else {
                composer1.m();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                lazyListState2 = lazyListState0;
                flingBehavior2 = flingBehavior0;
                z4 = z1;
                paddingValues2 = paddingValues0;
                z5 = z;
                arrangement$Vertical2 = arrangement$Vertical0;
                alignment$Horizontal2 = alignment$Horizontal0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(-740714857, v2, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            LazyListKt.a(modifier2, lazyListState2, paddingValues2, z5, true, flingBehavior2, z4, 0, alignment$Horizontal2, arrangement$Vertical2, null, null, function10, composer1, v2 & 14 | 0x6000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0x70000 & v2 >> 3 | v2 >> 3 & 0x380000 | v2 << 9 & 0xE000000 | v2 << 15 & 0x70000000, v2 >> 18 & 0x380, 3200);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            lazyListState1 = lazyListState2;
            paddingValues1 = paddingValues2;
            z2 = z5;
            arrangement$Vertical1 = arrangement$Vertical2;
            alignment$Horizontal1 = alignment$Horizontal2;
            flingBehavior1 = flingBehavior2;
            z3 = z4;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            lazyListState1 = lazyListState0;
            flingBehavior1 = flingBehavior0;
            paddingValues1 = paddingValues0;
            z2 = z;
            arrangement$Vertical1 = arrangement$Vertical0;
            alignment$Horizontal1 = alignment$Horizontal0;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, lazyListState1, paddingValues1, z2, arrangement$Vertical1, alignment$Horizontal1, flingBehavior1, z3, function10, v, v1) {
                final Modifier e;
                final LazyListState f;
                final PaddingValues g;
                final boolean h;
                final Vertical i;
                final Horizontal j;
                final FlingBehavior k;
                final boolean l;
                final Function1 m;
                final int n;
                final int o;

                {
                    this.e = modifier0;
                    this.f = lazyListState0;
                    this.g = paddingValues0;
                    this.h = z;
                    this.i = arrangement$Vertical0;
                    this.j = alignment$Horizontal0;
                    this.k = flingBehavior0;
                    this.l = z1;
                    this.m = function10;
                    this.n = v;
                    this.o = v1;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    LazyDslKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer0, (this.n | 1) & -920350135 | ((0x24924924 & (this.n | 1)) >> 1 | 306783378 & (this.n | 1)) | (306783378 & (this.n | 1)) << 1 & (0x24924924 & (this.n | 1)), this.o);
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
    @k(level = m.c, message = "Use the non deprecated overload")
    public static final void c(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, FlingBehavior flingBehavior0, Function1 function10, Composer composer0, int v, int v1) {
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal2;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical2;
        boolean z2;
        PaddingValues paddingValues2;
        LazyListState lazyListState1;
        FlingBehavior flingBehavior1;
        Modifier modifier1;
        LazyListState lazyListState2;
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        LazyListState lazyListState3;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        int v3;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        boolean z1;
        PaddingValues paddingValues1;
        int v2;
        L.p(function10, "content");
        Composer composer1 = composer0.G(0x185083DF);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.t(lazyListState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            paddingValues1 = paddingValues0;
        }
        else if((v & 0x380) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.t(paddingValues1) ? 0x100 : 0x80);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0x1C00) == 0) {
            z1 = z;
            v2 |= (composer1.v(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v & 0xE000) == 0) {
            if((v1 & 16) == 0) {
                arrangement$Horizontal1 = arrangement$Horizontal0;
                v3 = composer1.t(arrangement$Horizontal1) ? 0x4000 : 0x2000;
            }
            else {
                arrangement$Horizontal1 = arrangement$Horizontal0;
                v3 = 0x2000;
            }
            v2 |= v3;
        }
        else {
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        if((v1 & 0x20) == 0) {
            alignment$Vertical1 = alignment$Vertical0;
            if((v & 0x70000) == 0) {
                v2 |= (composer1.t(alignment$Vertical1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v2 |= 0x30000;
            alignment$Vertical1 = alignment$Vertical0;
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.t(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.Y(function10) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v2) != 4793490 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.m0;
                if((v1 & 2) == 0) {
                    lazyListState3 = lazyListState0;
                }
                else {
                    lazyListState3 = LazyListStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 4) != 0) {
                    paddingValues1 = PaddingKt.a(0.0f);
                }
                if((v1 & 8) != 0) {
                    z1 = false;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                    arrangement$Horizontal1 = z1 ? Arrangement.a.h() : Arrangement.a.p();
                }
                if((v1 & 0x20) != 0) {
                    alignment$Vertical1 = Alignment.a.w();
                }
                if((v1 & 0x40) == 0) {
                    modifier2 = modifier3;
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    modifier2 = modifier3;
                    flingBehavior2 = ScrollableDefaults.a.a(composer1, 6);
                }
                lazyListState2 = lazyListState3;
            }
            else {
                composer1.m();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                flingBehavior2 = flingBehavior0;
                lazyListState2 = lazyListState0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x185083DF, v2, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            LazyDslKt.d(modifier2, lazyListState2, paddingValues1, z1, arrangement$Horizontal1, alignment$Vertical1, flingBehavior2, true, function10, composer1, v2 & 14 | 0xC00000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | v2 & 0x70000 | v2 & 0x380000 | 0xE000000 & v2 << 3, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            lazyListState1 = lazyListState2;
            paddingValues2 = paddingValues1;
            z2 = z1;
            arrangement$Horizontal2 = arrangement$Horizontal1;
            alignment$Vertical2 = alignment$Vertical1;
            flingBehavior1 = flingBehavior2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            flingBehavior1 = flingBehavior0;
            lazyListState1 = lazyListState0;
            paddingValues2 = paddingValues1;
            z2 = z1;
            alignment$Vertical2 = alignment$Vertical1;
            arrangement$Horizontal2 = arrangement$Horizontal1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, lazyListState1, paddingValues2, z2, arrangement$Horizontal2, alignment$Vertical2, flingBehavior1, function10, v, v1) {
                final Modifier e;
                final LazyListState f;
                final PaddingValues g;
                final boolean h;
                final androidx.compose.foundation.layout.Arrangement.Horizontal i;
                final androidx.compose.ui.Alignment.Vertical j;
                final FlingBehavior k;
                final Function1 l;
                final int m;
                final int n;

                {
                    this.e = modifier0;
                    this.f = lazyListState0;
                    this.g = paddingValues0;
                    this.h = z;
                    this.i = arrangement$Horizontal0;
                    this.j = alignment$Vertical0;
                    this.k = flingBehavior0;
                    this.l = function10;
                    this.m = v;
                    this.n = v1;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    LazyDslKt.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer0, (this.m | 1) & -920350135 | ((0x24924924 & (this.m | 1)) >> 1 | 306783378 & (this.m | 1)) | (306783378 & (this.m | 1)) << 1 & (0x24924924 & (this.m | 1)), this.n);
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
    public static final void d(@y4.m Modifier modifier0, @y4.m LazyListState lazyListState0, @y4.m PaddingValues paddingValues0, boolean z, @y4.m androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, @y4.m androidx.compose.ui.Alignment.Vertical alignment$Vertical0, @y4.m FlingBehavior flingBehavior0, boolean z1, @l Function1 function10, @y4.m Composer composer0, int v, int v1) {
        boolean z3;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        boolean z2;
        PaddingValues paddingValues1;
        FlingBehavior flingBehavior1;
        LazyListState lazyListState1;
        Modifier modifier1;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical2;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal2;
        boolean z5;
        PaddingValues paddingValues2;
        boolean z4;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState2;
        Modifier modifier2;
        FlingBehavior flingBehavior3;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal3;
        LazyListState lazyListState3;
        int v2;
        L.p(function10, "content");
        Composer composer1 = composer0.G(0x99394F3B);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.t(lazyListState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(paddingValues0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.t(arrangement$Horizontal0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.t(alignment$Vertical0) ? 0x20000 : 0x10000);
        }
        if((v & 0x380000) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.t(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.v(z1) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0xE000000 & v) == 0) {
            v2 |= (composer1.Y(function10) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v2) != 0x2492492 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v1 & 1) == 0 ? modifier0 : Modifier.m0;
                boolean z6 = false;
                if((v1 & 2) == 0) {
                    lazyListState3 = lazyListState0;
                }
                else {
                    lazyListState3 = LazyListStateKt.a(0, 0, composer1, 0, 3);
                    v2 &= 0xFFFFFF8F;
                }
                PaddingValues paddingValues3 = (v1 & 4) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                if((v1 & 8) == 0) {
                    z6 = z;
                }
                if((v1 & 16) == 0) {
                    arrangement$Horizontal3 = arrangement$Horizontal0;
                }
                else {
                    arrangement$Horizontal3 = z6 ? Arrangement.a.h() : Arrangement.a.p();
                    v2 &= 0xFFFF1FFF;
                }
                androidx.compose.ui.Alignment.Vertical alignment$Vertical3 = (v1 & 0x20) == 0 ? alignment$Vertical0 : Alignment.a.w();
                if((v1 & 0x40) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.a.a(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                if((v1 & 0x80) == 0) {
                    z4 = z1;
                    modifier2 = modifier3;
                    lazyListState2 = lazyListState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    alignment$Vertical2 = alignment$Vertical3;
                    flingBehavior2 = flingBehavior3;
                }
                else {
                    modifier2 = modifier3;
                    lazyListState2 = lazyListState3;
                    z5 = z6;
                    paddingValues2 = paddingValues3;
                    arrangement$Horizontal2 = arrangement$Horizontal3;
                    alignment$Vertical2 = alignment$Vertical3;
                    flingBehavior2 = flingBehavior3;
                    z4 = true;
                }
            }
            else {
                composer1.m();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                lazyListState2 = lazyListState0;
                flingBehavior2 = flingBehavior0;
                z4 = z1;
                paddingValues2 = paddingValues0;
                z5 = z;
                arrangement$Horizontal2 = arrangement$Horizontal0;
                alignment$Vertical2 = alignment$Vertical0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x99394F3B, v2, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            LazyListKt.a(modifier2, lazyListState2, paddingValues2, z5, false, flingBehavior2, z4, 0, null, null, alignment$Vertical2, arrangement$Horizontal2, function10, composer1, v2 & 14 | 0x6000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0x70000 & v2 >> 3 | v2 >> 3 & 0x380000, v2 >> 15 & 14 | v2 >> 9 & 0x70 | v2 >> 18 & 0x380, 0x380);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            lazyListState1 = lazyListState2;
            paddingValues1 = paddingValues2;
            z2 = z5;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            alignment$Vertical1 = alignment$Vertical2;
            flingBehavior1 = flingBehavior2;
            z3 = z4;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            lazyListState1 = lazyListState0;
            flingBehavior1 = flingBehavior0;
            paddingValues1 = paddingValues0;
            z2 = z;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            alignment$Vertical1 = alignment$Vertical0;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier1, lazyListState1, paddingValues1, z2, arrangement$Horizontal1, alignment$Vertical1, flingBehavior1, z3, function10, v, v1) {
                final Modifier e;
                final LazyListState f;
                final PaddingValues g;
                final boolean h;
                final androidx.compose.foundation.layout.Arrangement.Horizontal i;
                final androidx.compose.ui.Alignment.Vertical j;
                final FlingBehavior k;
                final boolean l;
                final Function1 m;
                final int n;
                final int o;

                {
                    this.e = modifier0;
                    this.f = lazyListState0;
                    this.g = paddingValues0;
                    this.h = z;
                    this.i = arrangement$Horizontal0;
                    this.j = alignment$Vertical0;
                    this.k = flingBehavior0;
                    this.l = z1;
                    this.m = function10;
                    this.n = v;
                    this.o = v1;
                    super(2);
                }

                public final void a(@y4.m Composer composer0, int v) {
                    LazyDslKt.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer0, (this.n | 1) & -920350135 | ((0x24924924 & (this.n | 1)) >> 1 | 306783378 & (this.n | 1)) | (306783378 & (this.n | 1)) << 1 & (0x24924924 & (this.n | 1)), this.o);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @k(level = m.c, message = "Use the non deprecated overload")
    public static final void e(LazyListScope lazyListScope0, List list0, Function1 function10, q q0) {
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(q0, "itemContent");
        lazyListScope0.a(list0.size(), (function10 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.items.2(function10, list0)), new androidx.compose.foundation.lazy.LazyDslKt.items.3(androidx.compose.foundation.lazy.LazyDslKt.items.1.e, list0), ComposableLambdaKt.c(0xDA480CDF, true, new androidx.compose.foundation.lazy.LazyDslKt.items.4(q0, list0)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void f(@l LazyListScope lazyListScope0, @l List list0, @y4.m Function1 function10, @l Function1 function11, @l q q0) {
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        lazyListScope0.a(list0.size(), (function10 == null ? null : new Function1(function10, list0) {
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

            @y4.m
            public final Object a(int v) {
                Object object0 = this.f.get(v);
                return this.e.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.c(0xDA480CDF, true, new q(q0, list0) {
            final q e;
            final List f;

            {
                this.e = q0;
                this.f = list0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyItemScope lazyItemScope0, int v, @y4.m Composer composer0, int v1) {
                L.p(lazyItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xDA480CDF, v2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                }
                Object object0 = this.f.get(v);
                this.e.T0(lazyItemScope0, object0, composer0, ((int)(v2 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @k(level = m.c, message = "Use the non deprecated overload")
    public static final void g(LazyListScope lazyListScope0, Object[] arr_object, Function1 function10, q q0) {
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = function10 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.items.6(function10, arr_object);
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new androidx.compose.foundation.lazy.LazyDslKt.items.7(androidx.compose.foundation.lazy.LazyDslKt.items.5.e, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt.items.8(q0, arr_object));
        lazyListScope0.a(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void h(@l LazyListScope lazyListScope0, @l Object[] arr_object, @y4.m Function1 function10, @l Function1 function11, @l q q0) {
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = function10 == null ? null : new Function1(function10, arr_object) {
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
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new Function1(function11, arr_object) {
            final Function1 e;
            final Object[] f;

            {
                this.e = function10;
                this.f = arr_object;
                super(1);
            }

            @y4.m
            public final Object a(int v) {
                return this.e.invoke(this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(-1043393750, true, new q(q0, arr_object) {
            final q e;
            final Object[] f;

            {
                this.e = q0;
                this.f = arr_object;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyItemScope lazyItemScope0, int v, @y4.m Composer composer0, int v1) {
                L.p(lazyItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-1043393750, v2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:214)");
                }
                this.e.T0(lazyItemScope0, this.f[v], composer0, ((int)(v2 & 14)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
        lazyListScope0.a(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);
    }

    public static void i(LazyListScope lazyListScope0, List list0, Function1 function10, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.2 lazyDslKt$items$20 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.LazyDslKt.items.1 lazyDslKt$items$10 = androidx.compose.foundation.lazy.LazyDslKt.items.1.e;
        int v1 = list0.size();
        if(function10 != null) {
            lazyDslKt$items$20 = new androidx.compose.foundation.lazy.LazyDslKt.items.2(function10, list0);
        }
        lazyListScope0.a(v1, lazyDslKt$items$20, new androidx.compose.foundation.lazy.LazyDslKt.items.3(lazyDslKt$items$10, list0), ComposableLambdaKt.c(0xDA480CDF, true, new androidx.compose.foundation.lazy.LazyDslKt.items.4(q0, list0)));
    }

    public static void j(LazyListScope lazyListScope0, List list0, Function1 function10, Function1 function11, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.2 lazyDslKt$items$20 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.LazyDslKt.items.1.e;
        }
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        int v1 = list0.size();
        if(function10 != null) {
            lazyDslKt$items$20 = new androidx.compose.foundation.lazy.LazyDslKt.items.2(function10, list0);
        }
        lazyListScope0.a(v1, lazyDslKt$items$20, new androidx.compose.foundation.lazy.LazyDslKt.items.3(function11, list0), ComposableLambdaKt.c(0xDA480CDF, true, new androidx.compose.foundation.lazy.LazyDslKt.items.4(q0, list0)));

        @s0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,423:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.items.1 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.LazyDslKt.items.1 e;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.items.1.e = new androidx.compose.foundation.lazy.LazyDslKt.items.1();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.items.1() {
                super(1);
            }

            @y4.m
            public final Void a(Object object0) [...] // Inlined contents

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }
        }

    }

    public static void k(LazyListScope lazyListScope0, Object[] arr_object, Function1 function10, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(q0, "itemContent");
        androidx.compose.foundation.lazy.LazyDslKt.items.5 lazyDslKt$items$50 = androidx.compose.foundation.lazy.LazyDslKt.items.5.e;
        if(function10 != null) {
            lazyDslKt$items$60 = new androidx.compose.foundation.lazy.LazyDslKt.items.6(function10, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new androidx.compose.foundation.lazy.LazyDslKt.items.7(lazyDslKt$items$50, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt.items.8(q0, arr_object));
        lazyListScope0.a(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);
    }

    public static void l(LazyListScope lazyListScope0, Object[] arr_object, Function1 function10, Function1 function11, q q0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.LazyDslKt.items.5.e;
        }
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        if(function10 != null) {
            lazyDslKt$items$60 = new androidx.compose.foundation.lazy.LazyDslKt.items.6(function10, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new androidx.compose.foundation.lazy.LazyDslKt.items.7(function11, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt.items.8(q0, arr_object));
        lazyListScope0.a(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);

        @s0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,423:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.items.5 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.LazyDslKt.items.5 e;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.items.5.e = new androidx.compose.foundation.lazy.LazyDslKt.items.5();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.items.5() {
                super(1);
            }

            @y4.m
            public final Void a(Object object0) [...] // Inlined contents

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }
        }

    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void m(@l LazyListScope lazyListScope0, @l List list0, @y4.m o o0, @l o o1, @l r r0) {
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        lazyListScope0.a(list0.size(), (o0 == null ? null : new Function1(o0, list0) {
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

            @y4.m
            public final Object a(int v) {
                Object object0 = this.f.get(v);
                return this.e.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.c(0xBEF78951, true, new q(r0, list0) {
            final r e;
            final List f;

            {
                this.e = r0;
                this.f = list0;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyItemScope lazyItemScope0, int v, @y4.m Composer composer0, int v1) {
                L.p(lazyItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xBEF78951, v2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                }
                Object object0 = this.f.get(v);
                this.e.K0(lazyItemScope0, v, object0, composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @k(level = m.c, message = "Use the non deprecated overload")
    public static final void n(LazyListScope lazyListScope0, List list0, o o0, r r0) {
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(r0, "itemContent");
        lazyListScope0.a(list0.size(), (o0 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2(o0, list0)), new Function1(list0) {
            final List e;

            {
                this.e = list0;
                super(1);
            }

            @y4.m
            public final Object a(int v) {
                this.e.get(v);
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.c(0xBEF78951, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.4(r0, list0)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void o(@l LazyListScope lazyListScope0, @l Object[] arr_object, @y4.m o o0, @l o o1, @l r r0) {
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = o0 == null ? null : new Function1(o0, arr_object) {
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
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.7 lazyDslKt$itemsIndexed$70 = new Function1(o1, arr_object) {
            final o e;
            final Object[] f;

            {
                this.e = o0;
                this.f = arr_object;
                super(1);
            }

            @y4.m
            public final Object a(int v) {
                return this.e.invoke(v, this.f[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(1600639390, true, new q(r0, arr_object) {
            final r e;
            final Object[] f;

            {
                this.e = r0;
                this.f = arr_object;
                super(4);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                this.a(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return S0.a;
            }

            @Composable
            public final void a(@l LazyItemScope lazyItemScope0, int v, @y4.m Composer composer0, int v1) {
                L.p(lazyItemScope0, "$this$items");
                int v2 = (v1 & 14) == 0 ? (composer0.t(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x70) == 0) {
                    v2 |= (composer0.z(v) ? 0x20 : 16);
                }
                if((v2 & 731) == 0x92 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1600639390, v2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:249)");
                }
                this.e.K0(lazyItemScope0, v, this.f[v], composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }
        });
        lazyListScope0.a(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$70, composableLambda0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @k(level = m.c, message = "Use the non deprecated overload")
    public static final void p(LazyListScope lazyListScope0, Object[] arr_object, o o0, r r0) {
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(r0, "itemContent");
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = o0 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6(o0, arr_object);
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.2 lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20 = new Function1(arr_object) {
            final Object[] e;

            {
                this.e = arr_object;
                super(1);
            }

            @y4.m
            public final Object a(int v) {
                Object object0 = this.e[v];
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.8(r0, arr_object));
        lazyListScope0.a(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20, composableLambda0);
    }

    public static void q(LazyListScope lazyListScope0, List list0, o o0, o o1, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2 lazyDslKt$itemsIndexed$20 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            o1 = androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1.e;
        }
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        int v1 = list0.size();
        if(o0 != null) {
            lazyDslKt$itemsIndexed$20 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2(o0, list0);
        }
        lazyListScope0.a(v1, lazyDslKt$itemsIndexed$20, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.3(o1, list0), ComposableLambdaKt.c(0xBEF78951, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.4(r0, list0)));

        @s0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,423:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1 extends N implements o {
            public static final androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1 e;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1.e = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1() {
                super(2);
            }

            @y4.m
            public final Void a(int v, Object object0) {
                return null;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), object1);
            }
        }

    }

    public static void r(LazyListScope lazyListScope0, List list0, o o0, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2 lazyDslKt$itemsIndexed$20 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        L.p(lazyListScope0, "<this>");
        L.p(list0, "items");
        L.p(r0, "itemContent");
        int v1 = list0.size();
        if(o0 != null) {
            lazyDslKt$itemsIndexed$20 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2(o0, list0);
        }
        lazyListScope0.a(v1, lazyDslKt$itemsIndexed$20, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.1(list0), ComposableLambdaKt.c(0xBEF78951, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.4(r0, list0)));
    }

    public static void s(LazyListScope lazyListScope0, Object[] arr_object, o o0, o o1, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        if((v & 4) != 0) {
            o1 = androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5.e;
        }
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(o1, "contentType");
        L.p(r0, "itemContent");
        if(o0 != null) {
            lazyDslKt$itemsIndexed$60 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6(o0, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.7 lazyDslKt$itemsIndexed$70 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.7(o1, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.8(r0, arr_object));
        lazyListScope0.a(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$70, composableLambda0);

        @s0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,423:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5 extends N implements o {
            public static final androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5 e;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5.e = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5() {
                super(2);
            }

            @y4.m
            public final Void a(int v, Object object0) {
                return null;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).intValue(), object1);
            }
        }

    }

    public static void t(LazyListScope lazyListScope0, Object[] arr_object, o o0, r r0, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = null;
        if((v & 2) != 0) {
            o0 = null;
        }
        L.p(lazyListScope0, "<this>");
        L.p(arr_object, "items");
        L.p(r0, "itemContent");
        if(o0 != null) {
            lazyDslKt$itemsIndexed$60 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6(o0, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.2 lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.2(arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.c(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.8(r0, arr_object));
        lazyListScope0.a(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20, composableLambda0);
    }
}

