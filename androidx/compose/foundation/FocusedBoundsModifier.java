package androidx.compose.foundation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
public final class FocusedBoundsModifier implements OnGloballyPositionedModifier, ModifierLocalConsumer {
    @m
    private Function1 a;
    @m
    private LayoutCoordinates b;

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

    @Override  // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void X(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "coordinates");
        this.b = layoutCoordinates0;
        if(layoutCoordinates0.o()) {
            this.a();
            return;
        }
        Function1 function10 = this.a;
        if(function10 != null) {
            function10.invoke(null);
        }
    }

    private final void a() {
        LayoutCoordinates layoutCoordinates0 = this.b;
        if(layoutCoordinates0 != null) {
            L.m(layoutCoordinates0);
            if(layoutCoordinates0.o()) {
                Function1 function10 = this.a;
                if(function10 != null) {
                    function10.invoke(this.b);
                }
            }
        }
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
        L.p(modifierLocalReadScope0, "scope");
        Function1 function10 = (Function1)modifierLocalReadScope0.a(FocusedBoundsKt.a());
        if(function10 == null) {
            Function1 function11 = this.a;
            if(function11 != null) {
                function11.invoke(null);
            }
        }
        this.a = function10;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

