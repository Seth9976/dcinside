package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import y4.l;

final class FocusProperties.exit.1 extends N implements Function1 {
    public static final FocusProperties.exit.1 e;

    static {
        FocusProperties.exit.1.e = new FocusProperties.exit.1();
    }

    FocusProperties.exit.1() {
        super(1);
    }

    @l
    public final FocusRequester a(int v) {
        return FocusRequester.b.d();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((FocusDirection)object0).q());
    }
}

