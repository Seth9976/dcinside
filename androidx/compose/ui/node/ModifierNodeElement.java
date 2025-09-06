package androidx.compose.ui.node;

import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ActualKt;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@s0({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public abstract class ModifierNodeElement implements Element, InspectableValue {
    @m
    private InspectorInfo a;
    public static final int b;

    static {
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
    public abstract Node a();

    @Override  // androidx.compose.ui.platform.InspectableValue
    @m
    public final Object b() {
        return this.l().c();
    }

    @Override  // androidx.compose.ui.platform.InspectableValue
    @l
    public final kotlin.sequences.m d() {
        return this.l().b();
    }

    @Override
    public abstract boolean equals(@m Object arg1);

    @Override
    public abstract int hashCode();

    @Override  // androidx.compose.ui.platform.InspectableValue
    @m
    public final String i() {
        return this.l().a();
    }

    public boolean j() {
        return true;
    }

    private final InspectorInfo l() {
        InspectorInfo inspectorInfo0 = this.a;
        if(inspectorInfo0 == null) {
            inspectorInfo0 = new InspectorInfo();
            inspectorInfo0.d(m0.d(this.getClass()).u());
            this.m(inspectorInfo0);
            this.a = inspectorInfo0;
        }
        return inspectorInfo0;
    }

    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        ActualKt.b(inspectorInfo0, this);
    }

    @l
    public abstract Node n(@l Node arg1);

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

