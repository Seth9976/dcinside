package androidx.compose.foundation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class IndicationModifier implements DrawModifier {
    @l
    private final IndicationInstance a;

    public IndicationModifier(@l IndicationInstance indicationInstance0) {
        L.p(indicationInstance0, "indicationInstance");
        super();
        this.a = indicationInstance0;
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
    public final IndicationInstance a() {
        return this.a;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        this.a.a(contentDrawScope0);
    }
}

