package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n225#2:171\n*E\n"})
public final class FocusableKt.special..inlined.debugInspectorInfo.1 extends N implements Function1 {
    public FocusableKt.special..inlined.debugInspectorInfo.1() {
        super(1);
    }

    public final void a(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "$this$null");
        inspectorInfo0.d("focusGroup");
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((InspectorInfo)object0));
        return S0.a;
    }
}

