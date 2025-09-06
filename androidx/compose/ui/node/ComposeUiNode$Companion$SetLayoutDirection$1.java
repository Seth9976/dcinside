package androidx.compose.ui.node;

import A3.o;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposeUiNode.Companion.SetLayoutDirection.1 extends N implements o {
    public static final ComposeUiNode.Companion.SetLayoutDirection.1 e;

    static {
        ComposeUiNode.Companion.SetLayoutDirection.1.e = new ComposeUiNode.Companion.SetLayoutDirection.1();
    }

    ComposeUiNode.Companion.SetLayoutDirection.1() {
        super(2);
    }

    public final void a(@l ComposeUiNode composeUiNode0, @l LayoutDirection layoutDirection0) {
        L.p(composeUiNode0, "$this$null");
        L.p(layoutDirection0, "it");
        composeUiNode0.a(layoutDirection0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((ComposeUiNode)object0), ((LayoutDirection)object1));
        return S0.a;
    }
}

