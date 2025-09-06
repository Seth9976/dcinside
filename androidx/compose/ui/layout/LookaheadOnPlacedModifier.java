package androidx.compose.ui.layout;

import A3.a;
import A3.o;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class LookaheadOnPlacedModifier implements Element {
    @l
    private final o a;
    @l
    private final a b;

    public LookaheadOnPlacedModifier(@l o o0, @l a a0) {
        L.p(o0, "callback");
        L.p(a0, "rootCoordinates");
        super();
        this.a = o0;
        this.b = a0;
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
    public final o a() {
        return this.a;
    }

    @l
    public final a b() {
        return this.b;
    }

    public final void d(@l LookaheadLayoutCoordinates lookaheadLayoutCoordinates0) {
        L.p(lookaheadLayoutCoordinates0, "coordinates");
        Object object0 = this.b.invoke();
        this.a.invoke(object0, lookaheadLayoutCoordinates0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return androidx.compose.ui.a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

