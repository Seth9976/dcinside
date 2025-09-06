package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusOrder;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusProperties;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class FocusOrderModifierToProperties implements Function1 {
    @l
    private final FocusOrderModifier a;

    public FocusOrderModifierToProperties(@l FocusOrderModifier focusOrderModifier0) {
        L.p(focusOrderModifier0, "modifier");
        super();
        this.a = focusOrderModifier0;
    }

    @l
    public final FocusOrderModifier a() {
        return this.a;
    }

    public void b(@l FocusProperties focusProperties0) {
        L.p(focusProperties0, "focusProperties");
        FocusOrder focusOrder0 = new FocusOrder(focusProperties0);
        this.a.G0(focusOrder0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.b(((FocusProperties)object0));
        return S0.a;
    }
}

