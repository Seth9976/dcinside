package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscrollKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n36#2:580\n1114#3,6:581\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n190#1:580\n190#1:581,6\n*E\n"})
public final class ScrollableDefaults {
    @l
    public static final ScrollableDefaults a;
    public static final int b;

    static {
        ScrollableDefaults.a = new ScrollableDefaults();
    }

    @Composable
    @l
    public final FlingBehavior a(@m Composer composer0, int v) {
        composer0.V(0x4206C4AA);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x4206C4AA, v, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:187)");
        }
        DecayAnimationSpec decayAnimationSpec0 = SplineBasedFloatDecayAnimationSpec_androidKt.b(composer0, 0);
        composer0.V(0x44FAF204);
        boolean z = composer0.t(decayAnimationSpec0);
        DefaultFlingBehavior defaultFlingBehavior0 = composer0.W();
        if(z || defaultFlingBehavior0 == Composer.a.a()) {
            defaultFlingBehavior0 = new DefaultFlingBehavior(decayAnimationSpec0, null, 2, null);
            composer0.O(defaultFlingBehavior0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return defaultFlingBehavior0;
    }

    @ExperimentalFoundationApi
    @Composable
    @l
    public final OverscrollEffect b(@m Composer composer0, int v) {
        composer0.V(1809802212);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1809802212, v, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:200)");
        }
        OverscrollEffect overscrollEffect0 = AndroidOverscrollKt.b(composer0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return overscrollEffect0;
    }

    public final boolean c(@l LayoutDirection layoutDirection0, @l Orientation orientation0, boolean z) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(orientation0, "orientation");
        return layoutDirection0 == LayoutDirection.b && orientation0 != Orientation.a ? z : !z;
    }
}

