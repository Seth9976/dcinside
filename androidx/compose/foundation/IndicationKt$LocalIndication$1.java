package androidx.compose.foundation;

import A3.a;
import kotlin.jvm.internal.N;
import y4.l;

final class IndicationKt.LocalIndication.1 extends N implements a {
    public static final IndicationKt.LocalIndication.1 e;

    static {
        IndicationKt.LocalIndication.1.e = new IndicationKt.LocalIndication.1();
    }

    IndicationKt.LocalIndication.1() {
        super(0);
    }

    @l
    public final Indication b() {
        return DefaultDebugIndication.a;
    }

    @Override  // A3.a
    public Object invoke() {
        return this.b();
    }
}

