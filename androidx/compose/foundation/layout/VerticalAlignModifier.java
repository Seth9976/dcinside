package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class VerticalAlignModifier extends InspectorValueInfo implements ParentDataModifier {
    @l
    private final Vertical d;

    public VerticalAlignModifier(@l Vertical alignment$Vertical0, @l Function1 function10) {
        L.p(alignment$Vertical0, "vertical");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = alignment$Vertical0;
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    public Object E(Density density0, Object object0) {
        return this.l(density0, object0);
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
        VerticalAlignModifier verticalAlignModifier0 = object0 instanceof VerticalAlignModifier ? ((VerticalAlignModifier)object0) : null;
        return verticalAlignModifier0 == null ? false : L.g(this.d, verticalAlignModifier0.d);
    }

    @Override
    public int hashCode() {
        return this.d.hashCode();
    }

    @l
    public final Vertical j() {
        return this.d;
    }

    @l
    public RowColumnParentData l(@l Density density0, @m Object object0) {
        L.p(density0, "<this>");
        RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
        if(rowColumnParentData0 == null) {
            rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData0.i(CrossAxisAlignment.a.j(this.d));
        return rowColumnParentData0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "VerticalAlignModifier(vertical=" + this.d + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

