package androidx.compose.ui.node;

import A3.o;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposeUiNode.Companion.SetMeasurePolicy.1 extends N implements o {
    public static final ComposeUiNode.Companion.SetMeasurePolicy.1 e;

    static {
        ComposeUiNode.Companion.SetMeasurePolicy.1.e = new ComposeUiNode.Companion.SetMeasurePolicy.1();
    }

    ComposeUiNode.Companion.SetMeasurePolicy.1() {
        super(2);
    }

    public final void a(@l ComposeUiNode composeUiNode0, @l MeasurePolicy measurePolicy0) {
        L.p(composeUiNode0, "$this$null");
        L.p(measurePolicy0, "it");
        composeUiNode0.l(measurePolicy0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((ComposeUiNode)object0), ((MeasurePolicy)object1));
        return S0.a;
    }
}

