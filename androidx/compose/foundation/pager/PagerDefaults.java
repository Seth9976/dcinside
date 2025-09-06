package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,781:1\n76#2:782\n83#3,3:783\n1114#4,6:786\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n473#1:782\n475#1:783,3\n475#1:786,6\n*E\n"})
public final class PagerDefaults {
    @l
    public static final PagerDefaults a;
    public static final int b;

    static {
        PagerDefaults.a = new PagerDefaults();
    }

    @Composable
    @l
    public final SnapFlingBehavior a(@l PagerState pagerState0, @m PagerSnapDistance pagerSnapDistance0, @m AnimationSpec animationSpec0, @m DecayAnimationSpec decayAnimationSpec0, @m AnimationSpec animationSpec1, @m Composer composer0, int v, int v1) {
        L.p(pagerState0, "state");
        composer0.V(0xEB71A340);
        PagerSnapDistance pagerSnapDistance1 = (v1 & 2) == 0 ? pagerSnapDistance0 : PagerSnapDistance.a.a(1);
        AnimationSpec animationSpec2 = (v1 & 4) == 0 ? animationSpec0 : AnimationSpecKt.q(500, 0, EasingKt.c(), 2, null);
        DecayAnimationSpec decayAnimationSpec1 = (v1 & 8) == 0 ? decayAnimationSpec0 : SplineBasedFloatDecayAnimationSpec_androidKt.b(composer0, 0);
        AnimationSpec animationSpec3 = (v1 & 16) == 0 ? animationSpec1 : AnimationSpecKt.o(0.0f, 400.0f, null, 5, null);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xEB71A340, v, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:462)");
        }
        Object object0 = composer0.L(CompositionLocalsKt.i());
        Object[] arr_object = {animationSpec2, decayAnimationSpec1, animationSpec3, pagerSnapDistance1, ((Density)object0)};
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v2 = 0; v2 < 5; ++v2) {
            z |= composer0.t(arr_object[v2]);
        }
        SnapFlingBehavior snapFlingBehavior0 = composer0.W();
        if(z || snapFlingBehavior0 == Composer.a.a()) {
            snapFlingBehavior0 = new SnapFlingBehavior(PagerKt.c(pagerState0, pagerSnapDistance1, decayAnimationSpec1), animationSpec2, decayAnimationSpec1, animationSpec3, ((Density)object0), 0.0f, 0x20, null);
            composer0.O(snapFlingBehavior0);
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return snapFlingBehavior0;
    }

    @l
    public final NestedScrollConnection b(@l Orientation orientation0) {
        L.p(orientation0, "orientation");
        return orientation0 == Orientation.b ? PagerKt.a : PagerKt.b;
    }
}

