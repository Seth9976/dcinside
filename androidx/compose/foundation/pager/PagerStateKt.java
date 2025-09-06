package androidx.compose.foundation.pager;

import A3.a;
import A3.p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,455:1\n50#2:456\n49#2:457\n1114#3,6:458\n154#4:464\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n71#1:456\n71#1:457\n71#1:458,6\n408#1:464\n*E\n"})
public final class PagerStateKt {
    private static final float a = -0.5f;
    private static final float b = 0.5f;
    @l
    private static final p c = null;
    private static final float d = 0.0f;
    private static final int e = 3;
    @l
    private static final PagerStateKt.EmptyLayoutInfo.1 f = null;
    @l
    private static final PagerStateKt.UnitDensity.1 g = null;
    @l
    private static final PagerStateKt.EmptyInteractionSources.1 h = null;
    private static final boolean i = false;

    static {
        PagerStateKt.c = PagerStateKt.SnapAlignmentStartToStart.1.e;
        PagerStateKt.d = 56.0f;
        PagerStateKt.f = new PagerStateKt.EmptyLayoutInfo.1();
        PagerStateKt.g = new PagerStateKt.UnitDensity.1();
        PagerStateKt.h = new PagerStateKt.EmptyInteractionSources.1();
    }

    @m
    public static final Object d(@l PagerState pagerState0, @l d d0) {
        if(pagerState0.t() + 1 < pagerState0.E()) {
            Object object0 = PagerState.o(pagerState0, pagerState0.t() + 1, 0.0f, null, d0, 6, null);
            return object0 == b.l() ? object0 : S0.a;
        }
        return S0.a;
    }

    @m
    public static final Object e(@l PagerState pagerState0, @l d d0) {
        if(pagerState0.t() - 1 >= 0) {
            Object object0 = PagerState.o(pagerState0, pagerState0.t() - 1, 0.0f, null, d0, 6, null);
            return object0 == b.l() ? object0 : S0.a;
        }
        return S0.a;
    }

    private static final void f(a a0) {
    }

    public static final float g() [...] // 潜在的解密器

    @l
    public static final p h() {
        return PagerStateKt.c;
    }

    @ExperimentalFoundationApi
    @Composable
    @l
    public static final PagerState i(int v, float f, @m Composer composer0, int v1, int v2) {
        composer0.V(0x89FC077);
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            f = 0.0f;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x89FC077, v1, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:66)");
        }
        Saver saver0 = PagerState.m.a();
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(v);
        boolean z1 = composer0.t(f);
        androidx.compose.foundation.pager.PagerStateKt.rememberPagerState.1.1 pagerStateKt$rememberPagerState$1$10 = composer0.W();
        if(z || z1 || pagerStateKt$rememberPagerState$1$10 == Composer.a.a()) {
            pagerStateKt$rememberPagerState$1$10 = new a(v, f) {
                final int e;
                final float f;

                {
                    this.e = v;
                    this.f = f;
                    super(0);
                }

                @l
                public final PagerState b() {
                    return new PagerState(this.e, this.f);
                }

                @Override  // A3.a
                public Object invoke() {
                    return this.b();
                }
            };
            composer0.O(pagerStateKt$rememberPagerState$1$10);
        }
        composer0.g0();
        PagerState pagerState0 = (PagerState)RememberSaveableKt.d(new Object[0], saver0, null, pagerStateKt$rememberPagerState$1$10, composer0, 72, 4);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return pagerState0;
    }
}

