package androidx.compose.foundation.relocation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBringIntoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoView.kt\nandroidx/compose/foundation/relocation/BringIntoViewChildModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public abstract class BringIntoViewChildModifier implements OnPlacedModifier, ModifierLocalConsumer {
    @l
    private final BringIntoViewParent a;
    @m
    private BringIntoViewParent b;
    @m
    private LayoutCoordinates c;

    public BringIntoViewChildModifier(@l BringIntoViewParent bringIntoViewParent0) {
        L.p(bringIntoViewParent0, "defaultParent");
        super();
        this.a = bringIntoViewParent0;
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

    @m
    protected final LayoutCoordinates b() {
        LayoutCoordinates layoutCoordinates0 = this.c;
        return layoutCoordinates0 != null && layoutCoordinates0.o() ? layoutCoordinates0 : null;
    }

    @l
    protected final BringIntoViewParent d() {
        return this.b == null ? this.a : this.b;
    }

    @Override  // androidx.compose.ui.layout.OnPlacedModifier
    public void o(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        this.c = layoutCoordinates0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        this.b = (BringIntoViewParent)modifierLocalReadScope0.a(BringIntoViewKt.a());
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

