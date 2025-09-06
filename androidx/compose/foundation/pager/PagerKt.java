package androidx.compose.foundation.pager;

import A3.a;
import A3.o;
import A3.p;
import A3.q;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListScope.-CC;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.f;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,781:1\n154#2:782\n154#2:783\n154#2:784\n154#2:785\n76#3:786\n76#3:787\n67#4,3:788\n66#4:791\n50#4:798\n49#4:799\n67#4,3:806\n66#4:809\n36#4:816\n25#4:828\n1114#5,6:792\n1114#5,6:800\n1114#5,6:810\n1114#5,6:817\n1114#5,3:829\n1117#5,3:835\n51#6:823\n474#7,4:824\n478#7,2:832\n482#7:838\n474#8:834\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n126#1:782\n129#1:783\n206#1:784\n209#1:785\n265#1:786\n266#1:787\n267#1:788,3\n267#1:791\n275#1:798\n275#1:799\n279#1:806,3\n279#1:809\n283#1:816\n740#1:828\n267#1:792,6\n275#1:800,6\n279#1:810,6\n283#1:817,6\n740#1:829,3\n740#1:835,3\n388#1:823\n740#1:824,4\n740#1:832,2\n740#1:838\n740#1:834\n*E\n"})
public final class PagerKt {
    @l
    private static final ConsumeAllFlingOnDirection a = null;
    @l
    private static final ConsumeAllFlingOnDirection b = null;
    private static final boolean c = false;
    private static final int d = 500;

    static {
        PagerKt.a = new ConsumeAllFlingOnDirection(Orientation.b);
        PagerKt.b = new ConsumeAllFlingOnDirection(Orientation.a);
    }

    @ExperimentalFoundationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(int v, @m Modifier modifier0, @m PagerState pagerState0, @m PaddingValues paddingValues0, @m PageSize pageSize0, int v1, float f, @m Vertical alignment$Vertical0, @m SnapFlingBehavior snapFlingBehavior0, boolean z, boolean z1, @m Function1 function10, @m NestedScrollConnection nestedScrollConnection0, @l p p0, @m Composer composer0, int v2, int v3, int v4) {
        boolean z3;
        Vertical alignment$Vertical1;
        float f1;
        PagerState pagerState1;
        Modifier modifier1;
        NestedScrollConnection nestedScrollConnection1;
        Function1 function11;
        boolean z2;
        SnapFlingBehavior snapFlingBehavior1;
        int v13;
        PageSize pageSize1;
        PaddingValues paddingValues1;
        PagerState pagerState2;
        Modifier modifier2;
        NestedScrollConnection nestedScrollConnection2;
        Function1 function12;
        boolean z5;
        boolean z4;
        SnapFlingBehavior snapFlingBehavior2;
        Vertical alignment$Vertical2;
        float f2;
        int v14;
        PageSize pageSize2;
        PaddingValues paddingValues2;
        int v22;
        int v21;
        SnapFlingBehavior snapFlingBehavior3;
        boolean z6;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        PagerState pagerState3;
        int v15;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v5;
        L.p(p0, "pageContent");
        Composer composer1 = composer0.G(0xDF651FB1);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v5 |= ((v4 & 4) != 0 || !composer1.t(pagerState0) ? 0x80 : 0x100);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.t(pageSize0) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.z(v1) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.x(f) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.t(alignment$Vertical0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0xE000000) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.t(snapFlingBehavior0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
            v7 = v4 & 0x200;
        }
        else if((v2 & 0x70000000) == 0) {
            v7 = v4 & 0x200;
            v5 |= (composer1.v(z) ? 0x20000000 : 0x10000000);
        }
        else {
            v7 = v4 & 0x200;
        }
        if((v4 & 0x400) != 0) {
            v8 = v3 | 6;
            v9 = v4 & 0x400;
        }
        else if((v3 & 14) == 0) {
            v9 = v4 & 0x400;
            v8 = v3 | (composer1.v(z1) ? 4 : 2);
        }
        else {
            v9 = v4 & 0x400;
            v8 = v3;
        }
        if((v4 & 0x800) == 0) {
            if((v3 & 0x70) == 0) {
                v10 = v4 & 0x800;
                v8 |= (composer1.Y(function10) ? 0x20 : 16);
            }
            else {
                v10 = v4 & 0x800;
            }
            v11 = v8;
        }
        else {
            v10 = v4 & 0x800;
            v11 = v8 | 0x30;
        }
        if((v4 & 0x1000) != 0) {
            v11 |= 0x80;
        }
        if((v4 & 0x2000) != 0) {
            v11 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            if(composer1.Y(p0)) {
                v6 = 0x800;
            }
            v11 |= v6;
        }
        int v12 = v11;
        if((v4 & 0x1000) != 0x1000 || (0x5B6DB6DB & v5) != 306783378 || (v12 & 5851) != 1170 || !composer1.c()) {
            composer1.Z();
            if((v2 & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.m0;
                if((v4 & 4) == 0) {
                    v15 = v5;
                    pagerState3 = pagerState0;
                }
                else {
                    v15 = v5 & -897;
                    pagerState3 = PagerStateKt.i(0, 0.0f, composer1, 0, 3);
                }
                paddingValues2 = (v4 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                PageSize pageSize3 = (v4 & 16) == 0 ? pageSize0 : Fill.a;
                Vertical alignment$Vertical3 = (v4 & 0x80) == 0 ? alignment$Vertical0 : Alignment.a.q();
                if((v4 & 0x100) == 0) {
                    v16 = v12;
                    v17 = v7;
                    v18 = v9;
                    v19 = v10;
                    z6 = false;
                    v20 = v4 & 0x1000;
                    snapFlingBehavior3 = snapFlingBehavior0;
                    v21 = v15;
                }
                else {
                    v16 = v12;
                    v17 = v7;
                    v18 = v9;
                    v19 = v10;
                    v20 = v4 & 0x1000;
                    z6 = false;
                    snapFlingBehavior3 = PagerDefaults.a.a(pagerState3, null, null, null, null, composer1, v15 >> 6 & 14 | 0x30000, 30);
                    v21 = v15 & 0xF1FFFFFF;
                }
                if(v18 == 0) {
                    z6 = z1;
                }
                Function1 function13 = v19 == 0 ? function10 : null;
                if(v20 == 0) {
                    v22 = v16;
                    nestedScrollConnection2 = nestedScrollConnection0;
                    alignment$Vertical2 = alignment$Vertical3;
                    snapFlingBehavior2 = snapFlingBehavior3;
                    v5 = v21;
                    function12 = function13;
                }
                else {
                    v22 = v16 & -897;
                    alignment$Vertical2 = alignment$Vertical3;
                    snapFlingBehavior2 = snapFlingBehavior3;
                    v5 = v21;
                    function12 = function13;
                    nestedScrollConnection2 = PagerDefaults.a.b(Orientation.b);
                }
                modifier2 = modifier3;
                v14 = (v4 & 0x20) == 0 ? v1 : 0;
                f2 = (v4 & 0x40) == 0 ? f : 0.0f;
                z5 = z6;
                z4 = v17 == 0 ? z : true;
                v12 = v22;
                pagerState2 = pagerState3;
                pageSize2 = pageSize3;
            }
            else {
                composer1.m();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 0x100) != 0) {
                    v5 &= 0xF1FFFFFF;
                }
                if((v4 & 0x1000) != 0) {
                    v12 &= -897;
                }
                paddingValues2 = paddingValues0;
                pageSize2 = pageSize0;
                v14 = v1;
                f2 = f;
                alignment$Vertical2 = alignment$Vertical0;
                snapFlingBehavior2 = snapFlingBehavior0;
                z4 = z;
                z5 = z1;
                function12 = function10;
                nestedScrollConnection2 = nestedScrollConnection0;
                modifier2 = modifier0;
                pagerState2 = pagerState0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xDF651FB1, v5, v12, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:121)");
            }
            PagerKt.b(modifier2, pagerState2, v, pageSize2, f2, Orientation.b, v14, alignment$Vertical2, null, paddingValues2, snapFlingBehavior2, z4, z5, function12, nestedScrollConnection2, p0, composer1, v5 >> 3 & 0x1C00 | (v5 >> 3 & 14 | 0x30000 | v5 >> 3 & 0x70 | v5 << 6 & 0x380) | v5 >> 6 & 0xE000 | v5 << 3 & 0x380000 | 0x1C00000 & v5 | v5 << 18 & 0x70000000, v5 >> 24 & 0x70 | (v5 >> 24 & 14 | 0x8000) | v12 << 6 & 0x380 | v12 << 6 & 0x1C00 | v12 << 6 & 0x70000, 0x100);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            pagerState1 = pagerState2;
            paddingValues1 = paddingValues2;
            pageSize1 = pageSize2;
            v13 = v14;
            f1 = f2;
            alignment$Vertical1 = alignment$Vertical2;
            snapFlingBehavior1 = snapFlingBehavior2;
            z2 = z4;
            z3 = z5;
            function11 = function12;
            nestedScrollConnection1 = nestedScrollConnection2;
        }
        else {
            composer1.m();
            paddingValues1 = paddingValues0;
            pageSize1 = pageSize0;
            v13 = v1;
            snapFlingBehavior1 = snapFlingBehavior0;
            z2 = z;
            function11 = function10;
            nestedScrollConnection1 = nestedScrollConnection0;
            modifier1 = modifier0;
            pagerState1 = pagerState0;
            f1 = f;
            alignment$Vertical1 = alignment$Vertical0;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, modifier1, pagerState1, paddingValues1, pageSize1, v13, f1, alignment$Vertical1, snapFlingBehavior1, z2, z3, function11, nestedScrollConnection1, p0, v2, v3, v4) {
                final int e;
                final Modifier f;
                final PagerState g;
                final PaddingValues h;
                final PageSize i;
                final int j;
                final float k;
                final Vertical l;
                final SnapFlingBehavior m;
                final boolean n;
                final boolean o;
                final Function1 p;
                final NestedScrollConnection q;
                final p r;
                final int s;
                final int t;
                final int u;

                {
                    this.e = v;
                    this.f = modifier0;
                    this.g = pagerState0;
                    this.h = paddingValues0;
                    this.i = pageSize0;
                    this.j = v1;
                    this.k = f;
                    this.l = alignment$Vertical0;
                    this.m = snapFlingBehavior0;
                    this.n = z;
                    this.o = z1;
                    this.p = function10;
                    this.q = nestedScrollConnection0;
                    this.r = p0;
                    this.s = v2;
                    this.t = v3;
                    this.u = v4;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    PagerKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, composer0, (this.s | 1) & -920350135 | ((0x24924924 & (this.s | 1)) >> 1 | 306783378 & (this.s | 1)) | (306783378 & (this.s | 1)) << 1 & (0x24924924 & (this.s | 1)), this.t & -920350135 | ((0x24924924 & this.t) >> 1 | 306783378 & this.t) | (306783378 & this.t) << 1 & (0x24924924 & this.t), this.u);
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
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(@l Modifier modifier0, @l PagerState pagerState0, int v, @l PageSize pageSize0, float f, @l Orientation orientation0, int v1, @m Vertical alignment$Vertical0, @m Horizontal alignment$Horizontal0, @l PaddingValues paddingValues0, @l SnapFlingBehavior snapFlingBehavior0, boolean z, boolean z1, @m Function1 function10, @l NestedScrollConnection nestedScrollConnection0, @l p p0, @m Composer composer0, int v2, int v3, int v4) {
        boolean z6;
        L.p(modifier0, "modifier");
        L.p(pagerState0, "state");
        L.p(pageSize0, "pageSize");
        L.p(orientation0, "orientation");
        L.p(paddingValues0, "contentPadding");
        L.p(snapFlingBehavior0, "flingBehavior");
        L.p(nestedScrollConnection0, "pageNestedScrollConnection");
        L.p(p0, "pageContent");
        Composer composer1 = composer0.G(0xD25B2889);
        Vertical alignment$Vertical1 = (v4 & 0x80) == 0 ? alignment$Vertical0 : Alignment.a.q();
        Horizontal alignment$Horizontal1 = (v4 & 0x100) == 0 ? alignment$Horizontal0 : Alignment.a.m();
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xD25B2889, v2, v3, "androidx.compose.foundation.pager.Pager (Pager.kt:240)");
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("beyondBoundsPageCount should be greater than or equal to 0, you selected " + v1).toString());
        }
        boolean z2 = orientation0 == Orientation.a;
        Object object0 = composer1.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
        composer1.V(0x607FB4C4);
        boolean z3 = composer1.t(paddingValues0);
        boolean z4 = composer1.t(orientation0);
        boolean z5 = composer1.t(layoutDirection0);
        Dp dp0 = composer1.W();
        if((z3 | z4 | z5) == 0) {
            z6 = z2;
            if(dp0 == Composer.a.a()) {
                dp0 = Dp.d(PagerKt.k(paddingValues0, orientation0, layoutDirection0));
                composer1.O(dp0);
            }
        }
        else {
            z6 = z2;
            dp0 = Dp.d(PagerKt.k(paddingValues0, orientation0, layoutDirection0));
            composer1.O(dp0);
        }
        composer1.g0();
        float f1 = dp0.w();
        composer1.V(0x1E7B2B64);
        boolean z7 = composer1.t(snapFlingBehavior0);
        boolean z8 = composer1.t(pagerState0);
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior0 = composer1.W();
        if(z7 || z8 || pagerWrapperFlingBehavior0 == Composer.a.a()) {
            pagerWrapperFlingBehavior0 = new PagerWrapperFlingBehavior(snapFlingBehavior0, pagerState0);
            composer1.O(pagerWrapperFlingBehavior0);
        }
        composer1.g0();
        Dp dp1 = Dp.d(f);
        Dp dp2 = Dp.d(f);
        composer1.V(0x607FB4C4);
        boolean z9 = composer1.t(((Density)object0));
        boolean z10 = composer1.t(pagerState0);
        boolean z11 = composer1.t(dp2);
        androidx.compose.foundation.pager.PagerKt.Pager.2.1 pagerKt$Pager$2$10 = composer1.W();
        if((z11 | (z9 | z10)) != 0 || pagerKt$Pager$2$10 == Composer.a.a()) {
            pagerKt$Pager$2$10 = new o(((Density)object0), pagerState0, f, null) {
                int k;
                final Density l;
                final PagerState m;
                final float n;

                {
                    this.l = density0;
                    this.m = pagerState0;
                    this.n = f;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.pager.PagerKt.Pager.2.1(this.l, this.m, this.n, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.pager.PagerKt.Pager.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    int v = this.l.b1(this.n);
                    this.m.S(v);
                    return S0.a;
                }
            };
            composer1.O(pagerKt$Pager$2$10);
        }
        composer1.g0();
        EffectsKt.i(((Density)object0), pagerState0, dp1, pagerKt$Pager$2$10, composer1, v2 & 0x70 | 0x1000 | v2 >> 6 & 0x380);
        composer1.V(0x44FAF204);
        boolean z12 = composer1.t(pagerState0);
        androidx.compose.foundation.pager.PagerKt.Pager.3.1 pagerKt$Pager$3$10 = composer1.W();
        if(z12 || pagerKt$Pager$3$10 == Composer.a.a()) {
            pagerKt$Pager$3$10 = new o(pagerState0, null) {
                int k;
                final PagerState l;

                {
                    this.l = pagerState0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.pager.PagerKt.Pager.3.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.pager.PagerKt.Pager.3.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            i i0 = k.j0(new i() {
                                @Override  // kotlinx.coroutines.flow.i
                                @m
                                public Object collect(@l j j0, @l d d0) {
                                    androidx.compose.foundation.pager.PagerKt.Pager.3.1.invokeSuspend..inlined.filter.1.2 pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$20 = new j() {
                                        @Override  // kotlinx.coroutines.flow.j
                                        @m
                                        public final Object emit(Object object0, @l d d0) {
                                            androidx.compose.foundation.pager.PagerKt.Pager.3.1.invokeSuspend..inlined.filter.1.2.1 pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10;
                                            if(d0 instanceof androidx.compose.foundation.pager.PagerKt.Pager.3.1.invokeSuspend..inlined.filter.1.2.1) {
                                                pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10 = (androidx.compose.foundation.pager.PagerKt.Pager.3.1.invokeSuspend..inlined.filter.1.2.1)d0;
                                                int v = pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10.l;
                                                if((v & 0x80000000) == 0) {
                                                    pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                        Object k;
                                                        int l;
                                                        Object m;
                                                        Object n;

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            this.k = object0;
                                                            this.l |= 0x80000000;
                                                            return d0.emit(null, this);
                                                        }
                                                    };
                                                }
                                                else {
                                                    pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10.l = v ^ 0x80000000;
                                                }
                                            }
                                            else {
                                                pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                                                    Object k;
                                                    int l;
                                                    Object m;
                                                    Object n;

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        this.k = object0;
                                                        this.l |= 0x80000000;
                                                        return d0.emit(null, this);
                                                    }
                                                };
                                            }
                                            Object object1 = pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10.k;
                                            Object object2 = b.l();
                                            switch(pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10.l) {
                                                case 0: {
                                                    f0.n(object1);
                                                    j j0 = this.a;
                                                    if(!((Boolean)object0).booleanValue()) {
                                                        pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10.l = 1;
                                                        if(j0.emit(object0, pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$2$10) == object2) {
                                                            return object2;
                                                        }
                                                    }
                                                    return S0.a;
                                                }
                                                case 1: {
                                                    f0.n(object1);
                                                    return S0.a;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                        }
                                    };
                                    Object object0 = this.a.collect(pagerKt$Pager$3$1$invokeSuspend$$inlined$filter$1$20, d0);
                                    return object0 == b.l() ? object0 : S0.a;
                                }
                            }, 1);
                            androidx.compose.foundation.pager.PagerKt.Pager.3.1.3 pagerKt$Pager$3$1$30 = new j() {
                                @m
                                public final Object a(boolean z, @l d d0) {
                                    this.a.V();
                                    return S0.a;
                                }

                                @Override  // kotlinx.coroutines.flow.j
                                public Object emit(Object object0, d d0) {
                                    return this.a(((Boolean)object0).booleanValue(), d0);
                                }
                            };
                            this.k = 1;
                            return i0.collect(pagerKt$Pager$3$1$30, this) == object1 ? object1 : S0.a;
                        }
                        case 1: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }

                    final class androidx.compose.foundation.pager.PagerKt.Pager.3.1.1 extends N implements a {
                        final PagerState e;

                        androidx.compose.foundation.pager.PagerKt.Pager.3.1.1(PagerState pagerState0) {
                            this.e = pagerState0;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            return Boolean.valueOf(this.e.c());
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    }

                }
            };
            composer1.O(pagerKt$Pager$3$10);
        }
        composer1.g0();
        EffectsKt.g(pagerState0, pagerKt$Pager$3$10, composer1, v2 >> 3 & 14 | 0x40);
        composer1.V(0x562A05E0);
        Modifier modifier1 = z ? PagerKt.m(Modifier.m0, pagerState0, z6, composer1, v2 & 0x70 | 6) : Modifier.m0;
        composer1.g0();
        BoxWithConstraintsKt.a(modifier0.r0(modifier1), null, false, ComposableLambdaKt.b(composer1, 0x9BFFC6DF, true, new p(z6, ((Density)object0), f, f1, z1, pagerState0, v2, paddingValues0, pagerWrapperFlingBehavior0, z, v1, alignment$Horizontal1, alignment$Vertical1, v3, pageSize0, v, function10, nestedScrollConnection0, p0) {
            final boolean e;
            final Density f;
            final float g;
            final float h;
            final boolean i;
            final PagerState j;
            final int k;
            final PaddingValues l;
            final PagerWrapperFlingBehavior m;
            final boolean n;
            final int o;
            final Horizontal p;
            final Vertical q;
            final int r;
            final PageSize s;
            final int t;
            final Function1 u;
            final NestedScrollConnection v;
            final p w;

            {
                this.e = z;
                this.f = density0;
                this.g = f;
                this.h = f1;
                this.i = z1;
                this.j = pagerState0;
                this.k = v;
                this.l = paddingValues0;
                this.m = pagerWrapperFlingBehavior0;
                this.n = z2;
                this.o = v1;
                this.p = alignment$Horizontal0;
                this.q = alignment$Vertical0;
                this.r = v2;
                this.s = pageSize0;
                this.t = v3;
                this.u = function10;
                this.v = nestedScrollConnection0;
                this.w = p0;
                super(3);
            }

            @Composable
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            public final void a(@l BoxWithConstraintsScope boxWithConstraintsScope0, @m Composer composer0, int v) {
                L.p(boxWithConstraintsScope0, "$this$BoxWithConstraints");
                if((((v & 14) == 0 ? (composer0.t(boxWithConstraintsScope0) ? 4 : 2) | v : v) & 91) == 18 && composer0.c()) {
                    composer0.m();
                    return;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x9BFFC6DF, v, -1, "androidx.compose.foundation.pager.Pager.<anonymous> (Pager.kt:295)");
                }
                int v2 = this.e ? Constraints.o(boxWithConstraintsScope0.e()) : Constraints.p(boxWithConstraintsScope0.e());
                Dp dp0 = Dp.d(this.g);
                Dp dp1 = Dp.d(this.h);
                Object[] arr_object = {this.f, v2, dp0, dp1};
                Density density0 = this.f;
                float f = this.g;
                float f1 = this.h;
                PageSize pageSize0 = this.s;
                composer0.V(0xDE219177);
                boolean z = false;
                for(int v1 = 0; v1 < 4; ++v1) {
                    z |= composer0.t(arr_object[v1]);
                }
                Dp dp2 = composer0.W();
                if(z || dp2 == Composer.a.a()) {
                    int v3 = density0.b1(f);
                    dp2 = Dp.d(density0.C(pageSize0.a(density0, v2 - density0.b1(f1), v3)));
                    composer0.O(dp2);
                }
                composer0.g0();
                float f2 = dp2.w();
                Horizontal alignment$Horizontal0 = this.i ? Alignment.a.s() : Alignment.a.u();
                Vertical alignment$Vertical0 = this.i ? Alignment.a.a() : Alignment.a.w();
                PagerState pagerState0 = this.j;
                Density density1 = this.f;
                composer0.V(0x44FAF204);
                boolean z1 = composer0.t(pagerState0);
                LazyListState lazyListState0 = composer0.W();
                if(z1 || lazyListState0 == Composer.a.a()) {
                    lazyListState0 = new LazyListState(pagerState0.y(), kotlin.math.b.L0(((float)density1.b1(f2)) * pagerState0.z()));
                    pagerState0.N(lazyListState0);
                    composer0.O(lazyListState0);
                }
                composer0.g0();
                androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0 = Arrangement.a.A(this.g, alignment$Horizontal0);
                androidx.compose.foundation.layout.Arrangement.Vertical arrangement$Vertical0 = Arrangement.a.B(this.g, alignment$Vertical0);
                androidx.compose.foundation.pager.PagerKt.Pager.4.1 pagerKt$Pager$4$10 = new Function1(this.u, this.e, f2, this.v, this.w, this.r) {
                    final int e;
                    final Function1 f;
                    final boolean g;
                    final float h;
                    final NestedScrollConnection i;
                    final p j;
                    final int k;

                    {
                        this.e = v;
                        this.f = function10;
                        this.g = z;
                        this.h = f;
                        this.i = nestedScrollConnection0;
                        this.j = p0;
                        this.k = v1;
                        super(1);
                    }

                    public final void a(@l LazyListScope lazyListScope0) {
                        L.p(lazyListScope0, "$this$LazyList");
                        ComposableLambda composableLambda0 = ComposableLambdaKt.c(-901676327, true, new q(this.h, this.i, this.j, this.k) {
                            final boolean e;
                            final float f;
                            final NestedScrollConnection g;
                            final p h;
                            final int i;

                            {
                                this.e = z;
                                this.f = f;
                                this.g = nestedScrollConnection0;
                                this.h = p0;
                                this.i = v;
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
                                L.p(lazyItemScope0, "$this$items");
                                if((v1 & 0x70) == 0) {
                                    v1 |= (composer0.z(v) ? 0x20 : 16);
                                }
                                if((v1 & 721) == 0x90 && composer0.c()) {
                                    composer0.m();
                                    return;
                                }
                                if(ComposerKt.g0()) {
                                    ComposerKt.w0(-901676327, v1, -1, "androidx.compose.foundation.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:350)");
                                }
                                Modifier modifier0 = this.e ? SizeKt.o(Modifier.m0, this.f) : SizeKt.H(Modifier.m0, this.f);
                                Modifier modifier1 = NestedScrollModifierKt.b(Modifier.m0.r0(modifier0), this.g, null, 2, null);
                                p p0 = this.h;
                                int v2 = this.i;
                                composer0.V(0x2BB5B5D7);
                                MeasurePolicy measurePolicy0 = BoxKt.k(Alignment.a.i(), false, composer0, 6);
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
                                Updater.j(composer1, measurePolicy0, composeUiNode$Companion0.d());
                                Updater.j(composer1, density0, composeUiNode$Companion0.b());
                                Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
                                Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
                                composer0.y();
                                p1.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
                                composer0.V(2058660585);
                                p0.invoke(v, composer0, ((int)(v1 >> 3 & 14 | v2 >> 12 & 0x70)));
                                composer0.g0();
                                composer0.g();
                                composer0.g0();
                                composer0.g0();
                                if(ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }
                        });
                        LazyListScope.-CC.l(lazyListScope0, this.e, this.f, null, composableLambda0, 4, null);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((LazyListScope)object0));
                        return S0.a;
                    }
                };
                LazyListKt.a(Modifier.m0, lazyListState0, this.l, this.i, this.e, this.m, this.n, this.o, this.p, arrangement$Vertical0, this.q, arrangement$Horizontal0, pagerKt$Pager$4$10, composer0, this.k >> 21 & 0x380 | 6 | this.r << 3 & 0x1C00 | this.r << 15 & 0x380000 | 0x1C00000 & this.k << 3 | 0xE000000 & this.k, this.k >> 21 & 14, 0);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((BoxWithConstraintsScope)object0), ((Composer)object1), ((Number)object2).intValue());
                return S0.a;
            }
        }), composer1, 0xC00, 6);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, pagerState0, v, pageSize0, f, orientation0, v1, alignment$Vertical1, alignment$Horizontal1, paddingValues0, snapFlingBehavior0, z, z1, function10, nestedScrollConnection0, p0, v2, v3, v4) {
                final Modifier e;
                final PagerState f;
                final int g;
                final PageSize h;
                final float i;
                final Orientation j;
                final int k;
                final Vertical l;
                final Horizontal m;
                final PaddingValues n;
                final SnapFlingBehavior o;
                final boolean p;
                final boolean q;
                final Function1 r;
                final NestedScrollConnection s;
                final p t;
                final int u;
                final int v;
                final int w;

                {
                    this.e = modifier0;
                    this.f = pagerState0;
                    this.g = v;
                    this.h = pageSize0;
                    this.i = f;
                    this.j = orientation0;
                    this.k = v1;
                    this.l = alignment$Vertical0;
                    this.m = alignment$Horizontal0;
                    this.n = paddingValues0;
                    this.o = snapFlingBehavior0;
                    this.p = z;
                    this.q = z1;
                    this.r = function10;
                    this.s = nestedScrollConnection0;
                    this.t = p0;
                    this.u = v2;
                    this.v = v3;
                    this.w = v4;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    PagerKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, composer0, (this.u | 1) & -920350135 | ((0x24924924 & (this.u | 1)) >> 1 | 306783378 & (this.u | 1)) | (306783378 & (this.u | 1)) << 1 & (0x24924924 & (this.u | 1)), this.v & -920350135 | ((0x24924924 & this.v) >> 1 | 306783378 & this.v) | (306783378 & this.v) << 1 & (0x24924924 & this.v), this.w);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private static final SnapLayoutInfoProvider c(PagerState pagerState0, PagerSnapDistance pagerSnapDistance0, DecayAnimationSpec decayAnimationSpec0) {
        return new SnapLayoutInfoProvider() {
            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float a(@l Density density0) {
                L.p(density0, "<this>");
                LazyListLayoutInfo lazyListLayoutInfo0 = this.d();
                if(!lazyListLayoutInfo0.f().isEmpty()) {
                    List list0 = lazyListLayoutInfo0.f();
                    int v = list0.size();
                    int v2 = 0;
                    for(int v1 = 0; v1 < v; ++v1) {
                        v2 += ((LazyListItemInfo)list0.get(v1)).getSize();
                    }
                    return ((float)v2) / ((float)lazyListLayoutInfo0.f().size());
                }
                return 0.0f;
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            @l
            public f b(@l Density density0) {
                L.p(density0, "<this>");
                List list0 = this.d().f();
                int v = list0.size();
                float f = -Infinityf;
                float f1 = Infinityf;
                for(int v1 = 0; v1 < v; ++v1) {
                    LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)list0.get(v1);
                    float f2 = LazyListSnapLayoutInfoProviderKt.c(density0, this.d(), lazyListItemInfo0, PagerStateKt.h());
                    if(f2 <= 0.0f && f2 > f) {
                        f = f2;
                    }
                    if(f2 >= 0.0f && f2 < f1) {
                        f1 = f2;
                    }
                }
                return s.e(f, f1);
            }

            @Override  // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float c(@l Density density0, float f) {
                Object object0;
                int v1;
                L.p(density0, "<this>");
                int v = pagerState0.F() + pagerState0.G();
                float f1 = DecayAnimationSpecKt.a(decayAnimationSpec0, 0.0f, f);
                LazyListItemInfo lazyListItemInfo0 = pagerState0.x();
                if(lazyListItemInfo0 == null) {
                    v1 = pagerState0.t();
                }
                else {
                    v1 = lazyListItemInfo0.getIndex();
                    if(Float.compare(f, 0.0f) < 0) {
                        ++v1;
                    }
                }
                List list0 = this.d().f();
                int v2 = list0.size();
                for(int v3 = 0; true; ++v3) {
                    object0 = null;
                    if(v3 >= v2) {
                        break;
                    }
                    Object object1 = list0.get(v3);
                    if(((LazyListItemInfo)object1).getIndex() == v1) {
                        object0 = object1;
                        break;
                    }
                }
                int v4 = ((LazyListItemInfo)object0) == null ? 0 : ((LazyListItemInfo)object0).getOffset();
                float f2 = (((float)(v1 * v)) + f1) / ((float)v);
                int v5 = s.I(((int)(((float)(f > 0.0f ? Math.ceil(f2) : Math.floor(f2))))), 0, pagerState0.E());
                int v6 = pagerState0.F();
                int v7 = pagerState0.G();
                int v8 = s.u(Math.abs((s.I(pagerSnapDistance0.a(v1, v5, f, v6, v7), 0, pagerState0.E()) - v1) * v) - Math.abs(v4), 0);
                return v8 == 0 ? 0.0f : ((float)v8) * Math.signum(f);
            }

            @l
            public final LazyListLayoutInfo d() {
                return pagerState0.B();
            }
        };
    }

    @ExperimentalFoundationApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void d(int v, @m Modifier modifier0, @m PagerState pagerState0, @m PaddingValues paddingValues0, @m PageSize pageSize0, int v1, float f, @m Horizontal alignment$Horizontal0, @m SnapFlingBehavior snapFlingBehavior0, boolean z, boolean z1, @m Function1 function10, @m NestedScrollConnection nestedScrollConnection0, @l p p0, @m Composer composer0, int v2, int v3, int v4) {
        boolean z3;
        Horizontal alignment$Horizontal1;
        float f1;
        PagerState pagerState1;
        Modifier modifier1;
        NestedScrollConnection nestedScrollConnection1;
        Function1 function11;
        boolean z2;
        SnapFlingBehavior snapFlingBehavior1;
        int v13;
        PageSize pageSize1;
        PaddingValues paddingValues1;
        PagerState pagerState2;
        Modifier modifier2;
        NestedScrollConnection nestedScrollConnection2;
        Function1 function12;
        boolean z5;
        boolean z4;
        SnapFlingBehavior snapFlingBehavior2;
        Horizontal alignment$Horizontal2;
        float f2;
        int v14;
        PageSize pageSize2;
        PaddingValues paddingValues2;
        int v22;
        int v21;
        SnapFlingBehavior snapFlingBehavior3;
        boolean z6;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        PagerState pagerState3;
        int v15;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v5;
        L.p(p0, "pageContent");
        Composer composer1 = composer0.G(26030705);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v5 |= ((v4 & 4) != 0 || !composer1.t(pagerState0) ? 0x80 : 0x100);
        }
        int v6 = 0x400;
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.t(paddingValues0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v5 |= (composer1.t(pageSize0) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.z(v1) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.x(f) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.t(alignment$Horizontal0) ? 0x800000 : 0x400000);
        }
        if((v2 & 0xE000000) == 0) {
            v5 |= ((v4 & 0x100) != 0 || !composer1.t(snapFlingBehavior0) ? 0x2000000 : 0x4000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
            v7 = v4 & 0x200;
        }
        else if((v2 & 0x70000000) == 0) {
            v7 = v4 & 0x200;
            v5 |= (composer1.v(z) ? 0x20000000 : 0x10000000);
        }
        else {
            v7 = v4 & 0x200;
        }
        if((v4 & 0x400) != 0) {
            v8 = v3 | 6;
            v9 = v4 & 0x400;
        }
        else if((v3 & 14) == 0) {
            v9 = v4 & 0x400;
            v8 = v3 | (composer1.v(z1) ? 4 : 2);
        }
        else {
            v9 = v4 & 0x400;
            v8 = v3;
        }
        if((v4 & 0x800) == 0) {
            if((v3 & 0x70) == 0) {
                v10 = v4 & 0x800;
                v8 |= (composer1.Y(function10) ? 0x20 : 16);
            }
            else {
                v10 = v4 & 0x800;
            }
            v11 = v8;
        }
        else {
            v10 = v4 & 0x800;
            v11 = v8 | 0x30;
        }
        if((v4 & 0x1000) != 0) {
            v11 |= 0x80;
        }
        if((v4 & 0x2000) != 0) {
            v11 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            if(composer1.Y(p0)) {
                v6 = 0x800;
            }
            v11 |= v6;
        }
        int v12 = v11;
        if((v4 & 0x1000) != 0x1000 || (0x5B6DB6DB & v5) != 306783378 || (v12 & 5851) != 1170 || !composer1.c()) {
            composer1.Z();
            if((v2 & 1) == 0 || composer1.p()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.m0;
                if((v4 & 4) == 0) {
                    v15 = v5;
                    pagerState3 = pagerState0;
                }
                else {
                    v15 = v5 & -897;
                    pagerState3 = PagerStateKt.i(0, 0.0f, composer1, 0, 3);
                }
                paddingValues2 = (v4 & 8) == 0 ? paddingValues0 : PaddingKt.a(0.0f);
                PageSize pageSize3 = (v4 & 16) == 0 ? pageSize0 : Fill.a;
                Horizontal alignment$Horizontal3 = (v4 & 0x80) == 0 ? alignment$Horizontal0 : Alignment.a.m();
                if((v4 & 0x100) == 0) {
                    v16 = v12;
                    v17 = v7;
                    v18 = v9;
                    v19 = v10;
                    z6 = false;
                    v20 = v4 & 0x1000;
                    snapFlingBehavior3 = snapFlingBehavior0;
                    v21 = v15;
                }
                else {
                    v16 = v12;
                    v17 = v7;
                    v18 = v9;
                    v19 = v10;
                    v20 = v4 & 0x1000;
                    z6 = false;
                    snapFlingBehavior3 = PagerDefaults.a.a(pagerState3, null, null, null, null, composer1, v15 >> 6 & 14 | 0x30000, 30);
                    v21 = v15 & 0xF1FFFFFF;
                }
                if(v18 == 0) {
                    z6 = z1;
                }
                Function1 function13 = v19 == 0 ? function10 : null;
                if(v20 == 0) {
                    v22 = v16;
                    nestedScrollConnection2 = nestedScrollConnection0;
                    alignment$Horizontal2 = alignment$Horizontal3;
                    snapFlingBehavior2 = snapFlingBehavior3;
                    v5 = v21;
                    function12 = function13;
                }
                else {
                    v22 = v16 & -897;
                    alignment$Horizontal2 = alignment$Horizontal3;
                    snapFlingBehavior2 = snapFlingBehavior3;
                    v5 = v21;
                    function12 = function13;
                    nestedScrollConnection2 = PagerDefaults.a.b(Orientation.a);
                }
                modifier2 = modifier3;
                v14 = (v4 & 0x20) == 0 ? v1 : 0;
                f2 = (v4 & 0x40) == 0 ? f : 0.0f;
                z5 = z6;
                z4 = v17 == 0 ? z : true;
                v12 = v22;
                pagerState2 = pagerState3;
                pageSize2 = pageSize3;
            }
            else {
                composer1.m();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 0x100) != 0) {
                    v5 &= 0xF1FFFFFF;
                }
                if((v4 & 0x1000) != 0) {
                    v12 &= -897;
                }
                paddingValues2 = paddingValues0;
                pageSize2 = pageSize0;
                v14 = v1;
                f2 = f;
                alignment$Horizontal2 = alignment$Horizontal0;
                snapFlingBehavior2 = snapFlingBehavior0;
                z4 = z;
                z5 = z1;
                function12 = function10;
                nestedScrollConnection2 = nestedScrollConnection0;
                modifier2 = modifier0;
                pagerState2 = pagerState0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(26030705, v5, v12, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:201)");
            }
            PagerKt.b(modifier2, pagerState2, v, pageSize2, f2, Orientation.a, v14, null, alignment$Horizontal2, paddingValues2, snapFlingBehavior2, z4, z5, function12, nestedScrollConnection2, p0, composer1, v5 >> 3 & 0x1C00 | (v5 >> 3 & 14 | 0x30000 | v5 >> 3 & 0x70 | v5 << 6 & 0x380) | v5 >> 6 & 0xE000 | 0x380000 & v5 << 3 | v5 << 3 & 0xE000000 | v5 << 18 & 0x70000000, v5 >> 24 & 0x70 | (v5 >> 24 & 14 | 0x8000) | v12 << 6 & 0x380 | v12 << 6 & 0x1C00 | v12 << 6 & 0x70000, 0x80);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            pagerState1 = pagerState2;
            paddingValues1 = paddingValues2;
            pageSize1 = pageSize2;
            v13 = v14;
            f1 = f2;
            alignment$Horizontal1 = alignment$Horizontal2;
            snapFlingBehavior1 = snapFlingBehavior2;
            z2 = z4;
            z3 = z5;
            function11 = function12;
            nestedScrollConnection1 = nestedScrollConnection2;
        }
        else {
            composer1.m();
            paddingValues1 = paddingValues0;
            pageSize1 = pageSize0;
            v13 = v1;
            snapFlingBehavior1 = snapFlingBehavior0;
            z2 = z;
            function11 = function10;
            nestedScrollConnection1 = nestedScrollConnection0;
            modifier1 = modifier0;
            pagerState1 = pagerState0;
            f1 = f;
            alignment$Horizontal1 = alignment$Horizontal0;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(v, modifier1, pagerState1, paddingValues1, pageSize1, v13, f1, alignment$Horizontal1, snapFlingBehavior1, z2, z3, function11, nestedScrollConnection1, p0, v2, v3, v4) {
                final int e;
                final Modifier f;
                final PagerState g;
                final PaddingValues h;
                final PageSize i;
                final int j;
                final float k;
                final Horizontal l;
                final SnapFlingBehavior m;
                final boolean n;
                final boolean o;
                final Function1 p;
                final NestedScrollConnection q;
                final p r;
                final int s;
                final int t;
                final int u;

                {
                    this.e = v;
                    this.f = modifier0;
                    this.g = pagerState0;
                    this.h = paddingValues0;
                    this.i = pageSize0;
                    this.j = v1;
                    this.k = f;
                    this.l = alignment$Horizontal0;
                    this.m = snapFlingBehavior0;
                    this.n = z;
                    this.o = z1;
                    this.p = function10;
                    this.q = nestedScrollConnection0;
                    this.r = p0;
                    this.s = v2;
                    this.t = v3;
                    this.u = v4;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    PagerKt.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, composer0, (this.s | 1) & -920350135 | ((0x24924924 & (this.s | 1)) >> 1 | 306783378 & (this.s | 1)) | (306783378 & (this.s | 1)) << 1 & (0x24924924 & (this.s | 1)), this.t & -920350135 | ((0x24924924 & this.t) >> 1 | 306783378 & this.t) | (306783378 & this.t) << 1 & (0x24924924 & this.t), this.u);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    private static final float k(PaddingValues paddingValues0, Orientation orientation0, LayoutDirection layoutDirection0) {
        float f = orientation0 == Orientation.a ? paddingValues0.d() : paddingValues0.b(layoutDirection0);
        return orientation0 == Orientation.a ? f + paddingValues0.a() : f + paddingValues0.c(layoutDirection0);
    }

    private static final void l(a a0) {
    }

    @Composable
    private static final Modifier m(Modifier modifier0, PagerState pagerState0, boolean z, Composer composer0, int v) {
        composer0.V(0x59FE4150);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x59FE4150, v, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:738)");
        }
        composer0.V(0x2E20B340);
        composer0.V(0xE2A708A4);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.a.a()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(kotlin.coroutines.i.a, composer0));
            composer0.O(compositionScopedCoroutineScopeCanceller1);
            compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
        }
        composer0.g0();
        composer0.g0();
        androidx.compose.foundation.pager.PagerKt.pagerSemantics.1 pagerKt$pagerSemantics$10 = new Function1(z, pagerState0, compositionScopedCoroutineScopeCanceller0.b()) {
            final boolean e;
            final PagerState f;
            final O g;

            {
                this.e = z;
                this.f = pagerState0;
                this.g = o0;
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                if(this.e) {
                    SemanticsPropertiesKt.r0(semanticsPropertyReceiver0, null, new a(this.g) {
                        final PagerState e;
                        final O f;

                        {
                            this.e = pagerState0;
                            this.f = o0;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            return Boolean.valueOf(PagerKt.n(this.e, this.f));
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.l0(semanticsPropertyReceiver0, null, new a(this.g) {
                        final PagerState e;
                        final O f;

                        {
                            this.e = pagerState0;
                            this.f = o0;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            return Boolean.valueOf(PagerKt.o(this.e, this.f));
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    }, 1, null);
                    return;
                }
                SemanticsPropertiesKt.n0(semanticsPropertyReceiver0, null, new a(this.g) {
                    final PagerState e;
                    final O f;

                    {
                        this.e = pagerState0;
                        this.f = o0;
                        super(0);
                    }

                    @l
                    public final Boolean b() {
                        return Boolean.valueOf(PagerKt.n(this.e, this.f));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                }, 1, null);
                SemanticsPropertiesKt.p0(semanticsPropertyReceiver0, null, new a(this.g) {
                    final PagerState e;
                    final O f;

                    {
                        this.e = pagerState0;
                        this.f = o0;
                        super(0);
                    }

                    @l
                    public final Boolean b() {
                        return Boolean.valueOf(PagerKt.o(this.e, this.f));
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                }, 1, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        };
        Modifier modifier1 = modifier0.r0(SemanticsModifierKt.c(Modifier.m0, false, pagerKt$pagerSemantics$10, 1, null));
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier1;
    }

    private static final boolean n(PagerState pagerState0, O o0) {
        if(pagerState0.e()) {
            kotlinx.coroutines.k.f(o0, null, null, new o(pagerState0, null) {
                int k;
                final PagerState l;

                {
                    this.l = pagerState0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.pager.PagerKt.pagerSemantics.performBackwardPaging.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.pager.PagerKt.pagerSemantics.performBackwardPaging.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return PagerStateKt.e(this.l, this) == object1 ? object1 : S0.a;
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
            }, 3, null);
            return true;
        }
        return false;
    }

    private static final boolean o(PagerState pagerState0, O o0) {
        if(pagerState0.a()) {
            kotlinx.coroutines.k.f(o0, null, null, new o(pagerState0, null) {
                int k;
                final PagerState l;

                {
                    this.l = pagerState0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.pager.PagerKt.pagerSemantics.performForwardPaging.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.pager.PagerKt.pagerSemantics.performForwardPaging.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            this.k = 1;
                            return PagerStateKt.d(this.l, this) == object1 ? object1 : S0.a;
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
            }, 3, null);
            return true;
        }
        return false;
    }
}

