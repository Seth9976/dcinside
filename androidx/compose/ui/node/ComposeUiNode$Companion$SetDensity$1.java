package androidx.compose.ui.node;

import A3.o;
import androidx.compose.ui.unit.Density;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposeUiNode.Companion.SetDensity.1 extends N implements o {
    public static final ComposeUiNode.Companion.SetDensity.1 e;

    static {
        ComposeUiNode.Companion.SetDensity.1.e = new ComposeUiNode.Companion.SetDensity.1();
    }

    ComposeUiNode.Companion.SetDensity.1() {
        super(2);
    }

    public final void a(@l ComposeUiNode composeUiNode0, @l Density density0) {
        L.p(composeUiNode0, "$this$null");
        L.p(density0, "it");
        composeUiNode0.n(density0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((ComposeUiNode)object0), ((Density)object1));
        return S0.a;
    }
}

