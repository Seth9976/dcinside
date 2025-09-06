package androidx.compose.foundation.lazy.layout;

import A3.o;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,311:1\n76#2:312\n67#3,3:313\n66#3:316\n1114#4,6:317\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n*L\n41#1:312\n42#1:313,3\n42#1:316\n42#1:317,6\n*E\n"})
public final class LazyLayoutPrefetcher_androidKt {
    @ExperimentalFoundationApi
    @Composable
    public static final void a(@l LazyLayoutPrefetchState lazyLayoutPrefetchState0, @l LazyLayoutItemContentFactory lazyLayoutItemContentFactory0, @l SubcomposeLayoutState subcomposeLayoutState0, @m Composer composer0, int v) {
        L.p(lazyLayoutPrefetchState0, "prefetchState");
        L.p(lazyLayoutItemContentFactory0, "itemContentFactory");
        L.p(subcomposeLayoutState0, "subcomposeLayoutState");
        Composer composer1 = composer0.G(0x425DF27E);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x425DF27E, v, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:35)");
        }
        View view0 = (View)composer1.L(AndroidCompositionLocals_androidKt.k());
        composer1.V(0x607FB4C4);
        if((composer1.t(subcomposeLayoutState0) | composer1.t(lazyLayoutPrefetchState0) | composer1.t(view0)) != 0 || composer1.W() == Composer.a.a()) {
            composer1.O(new LazyLayoutPrefetcher(lazyLayoutPrefetchState0, subcomposeLayoutState0, lazyLayoutItemContentFactory0, view0));
        }
        composer1.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(lazyLayoutPrefetchState0, lazyLayoutItemContentFactory0, subcomposeLayoutState0, v) {
                final LazyLayoutPrefetchState e;
                final LazyLayoutItemContentFactory f;
                final SubcomposeLayoutState g;
                final int h;

                {
                    this.e = lazyLayoutPrefetchState0;
                    this.f = lazyLayoutItemContentFactory0;
                    this.g = subcomposeLayoutState0;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    LazyLayoutPrefetcher_androidKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
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

