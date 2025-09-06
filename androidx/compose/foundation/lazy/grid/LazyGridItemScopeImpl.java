package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLazyGridItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,55:1\n135#2:56\n*S KotlinDebug\n*F\n+ 1 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n*L\n33#1:56\n*E\n"})
public final class LazyGridItemScopeImpl implements LazyGridItemScope {
    @l
    public static final LazyGridItemScopeImpl a;

    static {
        LazyGridItemScopeImpl.a = new LazyGridItemScopeImpl();
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemScope
    @ExperimentalFoundationApi
    @l
    public Modifier a(@l Modifier modifier0, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(modifier0, "<this>");
        L.p(finiteAnimationSpec0, "animationSpec");
        return modifier0.r0(new AnimateItemPlacementModifier(finiteAnimationSpec0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LazyGridItemScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl\n*L\n1#1,170:1\n34#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl.animateItemPlacement..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final FiniteAnimationSpec e;

            public androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl.animateItemPlacement..inlined.debugInspectorInfo.1(FiniteAnimationSpec finiteAnimationSpec0) {
                this.e = finiteAnimationSpec0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("animateItemPlacement");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

