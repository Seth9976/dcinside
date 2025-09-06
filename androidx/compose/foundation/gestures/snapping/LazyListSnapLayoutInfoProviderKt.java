package androidx.compose.foundation.gestures.snapping;

import A3.p;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.f;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListSnapLayoutInfoProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n36#2:131\n1114#3,6:132\n1#4:138\n*S KotlinDebug\n*F\n+ 1 LazyListSnapLayoutInfoProvider.kt\nandroidx/compose/foundation/gestures/snapping/LazyListSnapLayoutInfoProviderKt\n*L\n110#1:131\n110#1:132,6\n*E\n"})
public final class LazyListSnapLayoutInfoProviderKt {
    @ExperimentalFoundationApi
    @l
    public static final SnapLayoutInfoProvider a(@l LazyListState lazyListState0, @l p p0) {
        L.p(lazyListState0, "lazyListState");
        L.p(p0, "positionInLayout");
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
                p p0 = p0;
                int v = list0.size();
                float f = -Infinityf;
                float f1 = Infinityf;
                for(int v1 = 0; v1 < v; ++v1) {
                    LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)list0.get(v1);
                    float f2 = LazyListSnapLayoutInfoProviderKt.c(density0, this.d(), lazyListItemInfo0, p0);
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
                L.p(density0, "<this>");
                float f1 = s.t(Math.abs(DecayAnimationSpecKt.a(SplineBasedDecayKt.c(density0), 0.0f, f)) - this.a(density0), 0.0f);
                return f1 == 0.0f ? f1 : f1 * Math.signum(f);
            }

            private final LazyListLayoutInfo d() {
                return lazyListState0.r();
            }
        };
    }

    public static SnapLayoutInfoProvider b(LazyListState lazyListState0, p p0, int v, Object object0) {
        if((v & 2) != 0) {
            p0 = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1.e;
        }
        return LazyListSnapLayoutInfoProviderKt.a(lazyListState0, p0);

        final class androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1 extends N implements p {
            public static final androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1 e;

            static {
                androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1.e = new androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1();
            }

            androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1() {
                super(3);
            }

            @l
            public final Float a(@l Density density0, float f, float f1) {
                L.p(density0, "$this$null");
                return (float)(f / 2.0f - f1 / 2.0f);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Density)object0), ((Number)object1).floatValue(), ((Number)object2).floatValue());
            }
        }

    }

    public static final float c(@l Density density0, @l LazyListLayoutInfo lazyListLayoutInfo0, @l LazyListItemInfo lazyListItemInfo0, @l p p0) {
        L.p(density0, "<this>");
        L.p(lazyListLayoutInfo0, "layoutInfo");
        L.p(lazyListItemInfo0, "item");
        L.p(p0, "positionInLayout");
        float f = ((Number)p0.invoke(density0, ((float)(LazyListSnapLayoutInfoProviderKt.d(lazyListLayoutInfo0) - lazyListLayoutInfo0.h() - lazyListLayoutInfo0.b())), ((float)lazyListItemInfo0.getSize()))).floatValue();
        return ((float)lazyListItemInfo0.getOffset()) - f;
    }

    private static final int d(LazyListLayoutInfo lazyListLayoutInfo0) {
        return lazyListLayoutInfo0.getOrientation() == Orientation.a ? IntSize.j(lazyListLayoutInfo0.a()) : IntSize.m(lazyListLayoutInfo0.a());
    }

    @ExperimentalFoundationApi
    @Composable
    @l
    public static final FlingBehavior e(@l LazyListState lazyListState0, @m Composer composer0, int v) {
        L.p(lazyListState0, "lazyListState");
        composer0.V(0x44740D55);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x44740D55, v, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:108)");
        }
        composer0.V(0x44FAF204);
        boolean z = composer0.t(lazyListState0);
        SnapLayoutInfoProvider snapLayoutInfoProvider0 = composer0.W();
        if(z || snapLayoutInfoProvider0 == Composer.a.a()) {
            snapLayoutInfoProvider0 = LazyListSnapLayoutInfoProviderKt.b(lazyListState0, null, 2, null);
            composer0.O(snapLayoutInfoProvider0);
        }
        composer0.g0();
        FlingBehavior flingBehavior0 = SnapFlingBehaviorKt.q(snapLayoutInfoProvider0, composer0, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return flingBehavior0;
    }
}

