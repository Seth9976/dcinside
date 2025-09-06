package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public abstract class InspectorValueInfo implements InspectableValue {
    @l
    private final Function1 a;
    @m
    private InspectorInfo b;
    public static final int c = 8;

    static {
    }

    public InspectorValueInfo(@l Function1 function10) {
        L.p(function10, "info");
        super();
        this.a = function10;
    }

    private final InspectorInfo a() {
        InspectorInfo inspectorInfo0 = this.b;
        if(inspectorInfo0 == null) {
            inspectorInfo0 = new InspectorInfo();
            this.a.invoke(inspectorInfo0);
        }
        this.b = inspectorInfo0;
        return inspectorInfo0;
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @m
    public Object b() {
        return this.a().c();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @l
    public kotlin.sequences.m d() {
        return this.a().b();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @m
    public String i() {
        return this.a().a();
    }
}

