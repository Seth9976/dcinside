package androidx.compose.ui.platform;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class InspectableValueKt.NoInspectorInfo.1 extends N implements Function1 {
    public static final InspectableValueKt.NoInspectorInfo.1 e;

    static {
        InspectableValueKt.NoInspectorInfo.1.e = new InspectableValueKt.NoInspectorInfo.1();
    }

    InspectableValueKt.NoInspectorInfo.1() {
        super(1);
    }

    public final void a(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "$this$null");
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((InspectorInfo)object0));
        return S0.a;
    }
}

