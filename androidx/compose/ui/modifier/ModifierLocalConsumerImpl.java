package androidx.compose.ui.modifier;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    @l
    private final Function1 d;

    public ModifierLocalConsumerImpl(@l Function1 function10, @l Function1 function11) {
        L.p(function10, "consumer");
        L.p(function11, "debugInspectorInfo");
        super(function11);
        this.d = function10;
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

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof ModifierLocalConsumerImpl && L.g(((ModifierLocalConsumerImpl)object0).d, this.d);
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

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        this.d.invoke(modifierLocalReadScope0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

