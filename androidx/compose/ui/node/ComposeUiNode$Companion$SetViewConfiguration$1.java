package androidx.compose.ui.node;

import A3.o;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposeUiNode.Companion.SetViewConfiguration.1 extends N implements o {
    public static final ComposeUiNode.Companion.SetViewConfiguration.1 e;

    static {
        ComposeUiNode.Companion.SetViewConfiguration.1.e = new ComposeUiNode.Companion.SetViewConfiguration.1();
    }

    ComposeUiNode.Companion.SetViewConfiguration.1() {
        super(2);
    }

    public final void a(@l ComposeUiNode composeUiNode0, @l ViewConfiguration viewConfiguration0) {
        L.p(composeUiNode0, "$this$null");
        L.p(viewConfiguration0, "it");
        composeUiNode0.q(viewConfiguration0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((ComposeUiNode)object0), ((ViewConfiguration)object1));
        return S0.a;
    }
}

