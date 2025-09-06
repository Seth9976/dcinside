package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.foundation.c;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class BoxChildData extends InspectorValueInfo implements ParentDataModifier {
    @l
    private Alignment d;
    private boolean e;

    public BoxChildData(@l Alignment alignment0, boolean z, @l Function1 function10) {
        L.p(alignment0, "alignment");
        L.p(function10, "inspectorInfo");
        super(function10);
        this.d = alignment0;
        this.e = z;
    }

    public BoxChildData(Alignment alignment0, boolean z, Function1 function10, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            function10 = InspectableValueKt.b();
        }
        this(alignment0, z, function10);
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
        BoxChildData boxChildData0 = object0 instanceof BoxChildData ? ((BoxChildData)object0) : null;
        return boxChildData0 == null ? false : L.g(this.d, boxChildData0.d) && this.e == boxChildData0.e;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() * 0x1F + c.a(this.e);
    }

    @l
    public final Alignment j() {
        return this.d;
    }

    public final boolean l() {
        return this.e;
    }

    @l
    public BoxChildData m(@l Density density0, @m Object object0) {
        L.p(density0, "<this>");
        return this;
    }

    public final void n(@l Alignment alignment0) {
        L.p(alignment0, "<set-?>");
        this.d = alignment0;
    }

    public final void p(boolean z) {
        this.e = z;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override
    @l
    public String toString() {
        return "BoxChildData(alignment=" + this.d + ", matchParentSize=" + this.e + ')';
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

