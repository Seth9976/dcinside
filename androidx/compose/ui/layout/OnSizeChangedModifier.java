package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class OnSizeChangedModifier extends InspectorValueInfo implements OnRemeasuredModifier {
    @l
    private final Function1 d;
    private long e;

    public OnSizeChangedModifier(@l Function1 function10, @l Function1 function11) {
        L.p(function10, "onSizeChanged");
        L.p(function11, "inspectorInfo");
        super(function11);
        this.d = function10;
        this.e = 0x8000000080000000L;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.layout.OnRemeasuredModifier
    public void L(long v) {
        if(!IntSize.h(this.e, v)) {
            IntSize intSize0 = IntSize.b(v);
            this.d.invoke(intSize0);
            this.e = v;
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof OnSizeChangedModifier ? L.g(this.d, ((OnSizeChangedModifier)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @l
    public final Function1 j() {
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

