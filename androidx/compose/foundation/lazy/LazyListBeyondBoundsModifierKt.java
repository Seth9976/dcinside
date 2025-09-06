package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListBeyondBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,71:1\n76#2:72\n36#3:73\n83#3,3:80\n1114#4,6:74\n1114#4,6:83\n*S KotlinDebug\n*F\n+ 1 LazyListBeyondBoundsModifier.kt\nandroidx/compose/foundation/lazy/LazyListBeyondBoundsModifierKt\n*L\n39#1:72\n40#1:73\n41#1:80,3\n40#1:74,6\n41#1:83,6\n*E\n"})
public final class LazyListBeyondBoundsModifierKt {
    @Composable
    @l
    public static final Modifier a(@l Modifier modifier0, @l LazyListState lazyListState0, @l LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, boolean z, @l Orientation orientation0, @m Composer composer0, int v) {
        L.p(modifier0, "<this>");
        L.p(lazyListState0, "state");
        L.p(lazyListBeyondBoundsInfo0, "beyondBoundsInfo");
        L.p(orientation0, "orientation");
        composer0.V(-62057177);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-62057177, v, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyListBeyondBoundsModifier.kt:32)");
        }
        Object object0 = composer0.L(CompositionLocalsKt.p());
        composer0.V(0x44FAF204);
        boolean z1 = composer0.t(lazyListState0);
        LazyListBeyondBoundsState lazyListBeyondBoundsState0 = composer0.W();
        if(z1 || lazyListBeyondBoundsState0 == Composer.a.a()) {
            lazyListBeyondBoundsState0 = new LazyListBeyondBoundsState(lazyListState0);
            composer0.O(lazyListBeyondBoundsState0);
        }
        composer0.g0();
        Object[] arr_object = {lazyListBeyondBoundsState0, lazyListBeyondBoundsInfo0, Boolean.valueOf(z), ((LayoutDirection)object0), orientation0};
        composer0.V(0xDE219177);
        boolean z2 = false;
        for(int v1 = 0; v1 < 5; ++v1) {
            z2 |= composer0.t(arr_object[v1]);
        }
        LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal0 = composer0.W();
        if(z2 || lazyLayoutBeyondBoundsModifierLocal0 == Composer.a.a()) {
            lazyLayoutBeyondBoundsModifierLocal0 = new LazyLayoutBeyondBoundsModifierLocal(lazyListBeyondBoundsState0, lazyListBeyondBoundsInfo0, z, ((LayoutDirection)object0), orientation0);
            composer0.O(lazyLayoutBeyondBoundsModifierLocal0);
        }
        composer0.g0();
        Modifier modifier1 = modifier0.r0(lazyLayoutBeyondBoundsModifierLocal0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return modifier1;
    }
}

