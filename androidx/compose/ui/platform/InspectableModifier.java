package androidx.compose.ui.platform;

import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class InspectableModifier extends InspectorValueInfo implements Element {
    public final class End implements Element {
        final InspectableModifier a;

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

        @Override  // androidx.compose.ui.Modifier
        public Modifier r0(Modifier modifier0) {
            return a.a(this, modifier0);
        }

        @Override  // androidx.compose.ui.Modifier$Element
        public boolean u(Function1 function10) {
            return b.a(this, function10);
        }
    }

    @l
    private final End d;
    public static final int e;

    static {
    }

    public InspectableModifier(@l Function1 function10) {
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = new End(this);
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
    public final End j() {
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

