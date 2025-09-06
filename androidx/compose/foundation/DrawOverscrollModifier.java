package androidx.compose.foundation;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class DrawOverscrollModifier extends InspectorValueInfo implements DrawModifier {
    @l
    private final AndroidEdgeEffectOverscrollEffect d;

    public DrawOverscrollModifier(@l AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect0, @l Function1 function10) {
        L.p(androidEdgeEffectOverscrollEffect0, "overscrollEffect");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = androidEdgeEffectOverscrollEffect0;
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
        return object0 instanceof DrawOverscrollModifier ? L.g(this.d, ((DrawOverscrollModifier)object0).d) : false;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void v(@l ContentDrawScope contentDrawScope0) {
        L.p(contentDrawScope0, "<this>");
        contentDrawScope0.Q0();
        this.d.w(contentDrawScope0);
    }
}

