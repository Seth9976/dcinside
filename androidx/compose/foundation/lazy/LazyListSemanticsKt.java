package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,31:1\n50#2:32\n49#2:33\n1114#3,6:34\n*S KotlinDebug\n*F\n+ 1 LazyListSemantics.kt\nandroidx/compose/foundation/lazy/LazyListSemanticsKt\n*L\n28#1:32\n28#1:33\n28#1:34,6\n*E\n"})
public final class LazyListSemanticsKt {
    @Composable
    @l
    public static final LazyLayoutSemanticState a(@l LazyListState lazyListState0, boolean z, @m Composer composer0, int v) {
        L.p(lazyListState0, "state");
        composer0.V(0x2388E847);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x2388E847, v, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:23)");
        }
        composer0.V(0x1E7B2B64);
        boolean z1 = composer0.t(lazyListState0);
        boolean z2 = composer0.t(Boolean.valueOf(z));
        LazyLayoutSemanticState lazyLayoutSemanticState0 = composer0.W();
        if(z2 || z1 || lazyLayoutSemanticState0 == Composer.a.a()) {
            lazyLayoutSemanticState0 = LazyLayoutSemanticStateKt.a(lazyListState0, z);
            composer0.O(lazyLayoutSemanticState0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return lazyLayoutSemanticState0;
    }
}

