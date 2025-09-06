package androidx.compose.ui;

import A3.o;
import A3.p;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

class ComposedModifier extends InspectorValueInfo implements Element {
    @l
    private final p d;

    public ComposedModifier(@l Function1 function10, @l p p0) {
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        super(function10);
        this.d = p0;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @l
    public final p j() {
        return this.d;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

