package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,287:1\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n243#1:288\n255#1:289\n*E\n"})
public final class BoxScopeInstance implements BoxScope {
    @l
    public static final BoxScopeInstance a;

    static {
        BoxScopeInstance.a = new BoxScopeInstance();
    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier b(@l Modifier modifier0, @l Alignment alignment0) {
        L.p(modifier0, "<this>");
        L.p(alignment0, "alignment");
        return modifier0.r0(new BoxChildData(alignment0, false, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n1#1,170:1\n244#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.BoxScopeInstance.align..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Alignment e;

            public androidx.compose.foundation.layout.BoxScopeInstance.align..inlined.debugInspectorInfo.1(Alignment alignment0) {
                this.e = alignment0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("align");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.foundation.layout.BoxScope
    @Stable
    @l
    public Modifier f(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return modifier0.r0(new BoxChildData(Alignment.a.i(), true, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n1#1,170:1\n255#2:171\n*E\n"})
        public final class androidx.compose.foundation.layout.BoxScopeInstance.matchParentSize..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.layout.BoxScopeInstance.matchParentSize..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("matchParentSize");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

