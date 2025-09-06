package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyStaggeredGridSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,50:1\n50#2:51\n49#2:52\n1114#3,6:53\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridSemantics.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSemanticsKt\n*L\n32#1:51\n32#1:52\n32#1:53,6\n*E\n"})
public final class LazyStaggeredGridSemanticsKt {
    @Composable
    @l
    public static final LazyLayoutSemanticState a(@l LazyStaggeredGridState lazyStaggeredGridState0, boolean z, @m Composer composer0, int v) {
        L.p(lazyStaggeredGridState0, "state");
        composer0.V(0x611DFB97);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x611DFB97, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:27)");
        }
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(lazyStaggeredGridState0);
        boolean z2 = composer0.t(Boolean.valueOf(z));
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState.1.1 lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10 = composer0.W();
        if(z2 || z1 || lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10 == Composer.a.a()) {
            lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10 = new LazyLayoutSemanticState() {
                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public boolean a() {
                    return lazyStaggeredGridState0.a();
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @m
                public Object b(int v, @l d d0) {
                    Object object0 = LazyStaggeredGridState.K(lazyStaggeredGridState0, v, 0, d0, 2, null);
                    return object0 == b.l() ? object0 : S0.a;
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @m
                public Object c(float f, @l d d0) {
                    Object object0 = ScrollExtensionsKt.b(lazyStaggeredGridState0, f, null, d0, 2, null);
                    return object0 == b.l() ? object0 : S0.a;
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @l
                public CollectionInfo d() {
                    return new CollectionInfo(-1, -1);
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getCurrentPosition() {
                    return ((float)lazyStaggeredGridState0.q()) + ((float)lazyStaggeredGridState0.r()) / 100000.0f;
                }
            };
            composer0.O(lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyStaggeredGridSemanticsKt$rememberLazyStaggeredGridSemanticState$1$10;
    }
}

