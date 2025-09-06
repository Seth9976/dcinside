package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.foundation.c;
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

public final class LayoutWeightImpl extends InspectorValueInfo implements ParentDataModifier {
    private final float d;
    private final boolean e;

    public LayoutWeightImpl(float f, boolean z, @l Function1 function10) {
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = f;
        this.e = z;
    }

    @Override  // androidx.compose.ui.layout.ParentDataModifier
    public Object E(Density density0, Object object0) {
        return this.m(density0, object0);
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
        LayoutWeightImpl layoutWeightImpl0 = object0 instanceof LayoutWeightImpl ? ((LayoutWeightImpl)object0) : null;
        return layoutWeightImpl0 == null ? false : this.d == layoutWeightImpl0.d && this.e == layoutWeightImpl0.e;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.d) * 0x1F + c.a(this.e);
    }

    public final boolean j() {
        return this.e;
    }

    public final float l() {
        return this.d;
    }

    @l
    public RowColumnParentData m(@l Density density0, @m Object object0) {
        L.p(density0, "<this>");
        RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
        if(rowColumnParentData0 == null) {
            rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData0.k(this.d);
        rowColumnParentData0.j(this.e);
        return rowColumnParentData0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "LayoutWeightImpl(weight=" + this.d + ", fill=" + this.e + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

