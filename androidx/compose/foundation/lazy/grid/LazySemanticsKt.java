package androidx.compose.foundation.lazy.grid;

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

@s0({"SMAP\nLazySemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,52:1\n50#2:53\n49#2:54\n1114#3,6:55\n*S KotlinDebug\n*F\n+ 1 LazySemantics.kt\nandroidx/compose/foundation/lazy/grid/LazySemanticsKt\n*L\n32#1:53\n32#1:54\n32#1:55,6\n*E\n"})
public final class LazySemanticsKt {
    @Composable
    @l
    public static final LazyLayoutSemanticState a(@l LazyGridState lazyGridState0, boolean z, @m Composer composer0, int v) {
        L.p(lazyGridState0, "state");
        composer0.V(-1247008005);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1247008005, v, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:27)");
        }
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(lazyGridState0);
        boolean z2 = composer0.t(Boolean.valueOf(z));
        androidx.compose.foundation.lazy.grid.LazySemanticsKt.rememberLazyGridSemanticState.1.1 lazySemanticsKt$rememberLazyGridSemanticState$1$10 = composer0.W();
        if(z2 || z1 || lazySemanticsKt$rememberLazyGridSemanticState$1$10 == Composer.a.a()) {
            lazySemanticsKt$rememberLazyGridSemanticState$1$10 = new LazyLayoutSemanticState() {
                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public boolean a() {
                    return lazyGridState0.a();
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @m
                public Object b(int v, @l d d0) {
                    Object object0 = LazyGridState.G(lazyGridState0, v, 0, d0, 2, null);
                    return object0 == b.l() ? object0 : S0.a;
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @m
                public Object c(float f, @l d d0) {
                    Object object0 = ScrollExtensionsKt.b(lazyGridState0, f, null, d0, 2, null);
                    return object0 == b.l() ? object0 : S0.a;
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                @l
                public CollectionInfo d() {
                    return new CollectionInfo(-1, -1);
                }

                @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
                public float getCurrentPosition() {
                    return ((float)lazyGridState0.n()) + ((float)lazyGridState0.o()) / 100000.0f;
                }
            };
            composer0.O(lazySemanticsKt$rememberLazyGridSemanticState$1$10);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazySemanticsKt$rememberLazyGridSemanticState$1$10;
    }
}

