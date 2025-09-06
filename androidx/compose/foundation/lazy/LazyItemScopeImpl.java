package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLazyItemScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,155:1\n135#2:156\n135#2:157\n135#2:158\n135#2:159\n*S KotlinDebug\n*F\n+ 1 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n53#1:156\n64#1:157\n75#1:158\n84#1:159\n*E\n"})
public final class LazyItemScopeImpl implements LazyItemScope {
    @l
    private MutableState a;
    @l
    private MutableState b;

    public LazyItemScopeImpl() {
        this.a = SnapshotStateKt__SnapshotStateKt.g(0x7FFFFFFF, null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.g(0x7FFFFFFF, null, 2, null);
    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @ExperimentalFoundationApi
    @l
    public Modifier a(@l Modifier modifier0, @l FiniteAnimationSpec finiteAnimationSpec0) {
        L.p(modifier0, "<this>");
        L.p(finiteAnimationSpec0, "animationSpec");
        return modifier0.r0(new AnimateItemPlacementModifier(finiteAnimationSpec0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n1#1,170:1\n85#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyItemScopeImpl.animateItemPlacement..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final FiniteAnimationSpec e;

            public androidx.compose.foundation.lazy.LazyItemScopeImpl.animateItemPlacement..inlined.debugInspectorInfo.1(FiniteAnimationSpec finiteAnimationSpec0) {
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

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @l
    public Modifier b(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return modifier0.r0(new ParentSizeModifier(f, InspectableValueKt.b(), null, this.b, 4, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n1#1,170:1\n76#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyItemScopeImpl.fillParentMaxHeight..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.lazy.LazyItemScopeImpl.fillParentMaxHeight..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("fillParentMaxHeight");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @l
    public Modifier c(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return modifier0.r0(new ParentSizeModifier(f, InspectableValueKt.b(), this.a, null, 8, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n1#1,170:1\n65#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyItemScopeImpl.fillParentMaxWidth..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.lazy.LazyItemScopeImpl.fillParentMaxWidth..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("fillParentMaxWidth");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.foundation.lazy.LazyItemScope
    @l
    public Modifier d(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return modifier0.r0(new ParentSizeModifier(f, InspectableValueKt.b(), this.a, this.b));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n1#1,170:1\n54#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyItemScopeImpl.fillParentMaxSize..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.lazy.LazyItemScopeImpl.fillParentMaxSize..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("fillParentMaxSize");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public final void e(int v, int v1) {
        this.a.setValue(v);
        this.b.setValue(v1);
    }
}

