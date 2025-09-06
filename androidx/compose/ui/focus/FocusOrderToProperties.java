package androidx.compose.ui.focus;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class FocusOrderToProperties implements Function1 {
    @l
    private final Function1 a;

    public FocusOrderToProperties(@l Function1 function10) {
        L.p(function10, "focusOrderReceiver");
        super();
        this.a = function10;
    }

    @l
    public final Function1 a() {
        return this.a;
    }

    public void b(@l FocusProperties focusProperties0) {
        L.p(focusProperties0, "focusProperties");
        FocusOrder focusOrder0 = new FocusOrder(focusProperties0);
        this.a.invoke(focusOrder0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.b(((FocusProperties)object0));
        return S0.a;
    }
}

