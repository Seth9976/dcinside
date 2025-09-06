package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Stable
final class ConsumedInsetsModifier extends InspectorValueInfo implements ModifierLocalConsumer {
    @l
    private final Function1 d;
    @m
    private WindowInsets e;

    public ConsumedInsetsModifier(@l Function1 function10, @l Function1 function11) {
        L.p(function10, "block");
        L.p(function11, "inspectorInfo");
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

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ConsumedInsetsModifier ? L.g(((ConsumedInsetsModifier)object0).d, this.d) : false;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        WindowInsets windowInsets0 = (WindowInsets)modifierLocalReadScope0.a(WindowInsetsPaddingKt.e());
        if(!L.g(windowInsets0, this.e)) {
            this.e = windowInsets0;
            this.d.invoke(windowInsets0);
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

