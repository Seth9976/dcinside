package androidx.compose.runtime;

import A3.p;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ComposerKt.removeCurrentGroupInstance.1 extends N implements p {
    public static final ComposerKt.removeCurrentGroupInstance.1 e;

    static {
        ComposerKt.removeCurrentGroupInstance.1.e = new ComposerKt.removeCurrentGroupInstance.1();
    }

    ComposerKt.removeCurrentGroupInstance.1() {
        super(3);
    }

    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
        L.p(applier0, "<anonymous parameter 0>");
        L.p(slotWriter0, "slots");
        L.p(rememberManager0, "rememberManager");
        ComposerKt.n0(slotWriter0, rememberManager0);
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
        return S0.a;
    }
}

