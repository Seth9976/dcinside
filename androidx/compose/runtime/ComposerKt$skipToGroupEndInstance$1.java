package androidx.compose.runtime;

import A3.p;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposerKt.skipToGroupEndInstance.1 extends N implements p {
    public static final ComposerKt.skipToGroupEndInstance.1 e;

    static {
        ComposerKt.skipToGroupEndInstance.1.e = new ComposerKt.skipToGroupEndInstance.1();
    }

    ComposerKt.skipToGroupEndInstance.1() {
        super(3);
    }

    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
        L.p(applier0, "<anonymous parameter 0>");
        L.p(slotWriter0, "slots");
        L.p(rememberManager0, "<anonymous parameter 2>");
        slotWriter0.b1();
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
        return S0.a;
    }
}

