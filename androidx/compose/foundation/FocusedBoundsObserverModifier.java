package androidx.compose.foundation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsObserverModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
final class FocusedBoundsObserverModifier implements ModifierLocalConsumer, ModifierLocalProvider, Function1 {
    @l
    private final Function1 a;
    @m
    private Function1 b;
    @m
    private LayoutCoordinates c;

    public FocusedBoundsObserverModifier(@l Function1 function10) {
        L.p(function10, "handler");
        super();
        this.a = function10;
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
    public Function1 a() [...] // Inlined contents

    public void b(@m LayoutCoordinates layoutCoordinates0) {
        this.c = layoutCoordinates0;
        this.a.invoke(layoutCoordinates0);
        Function1 function10 = this.b;
        if(function10 != null) {
            function10.invoke(layoutCoordinates0);
        }
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return FocusedBoundsKt.a();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.b(((LayoutCoordinates)object0));
        return S0.a;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        Function1 function10 = (Function1)modifierLocalReadScope0.a(FocusedBoundsKt.a());
        if(!L.g(function10, this.b)) {
            this.b = function10;
        }
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

