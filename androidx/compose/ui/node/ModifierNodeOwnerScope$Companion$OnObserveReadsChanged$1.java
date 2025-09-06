package androidx.compose.ui.node;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ModifierNodeOwnerScope.Companion.OnObserveReadsChanged.1 extends N implements Function1 {
    public static final ModifierNodeOwnerScope.Companion.OnObserveReadsChanged.1 e;

    static {
        ModifierNodeOwnerScope.Companion.OnObserveReadsChanged.1.e = new ModifierNodeOwnerScope.Companion.OnObserveReadsChanged.1();
    }

    ModifierNodeOwnerScope.Companion.OnObserveReadsChanged.1() {
        super(1);
    }

    public final void a(@l ModifierNodeOwnerScope modifierNodeOwnerScope0) {
        L.p(modifierNodeOwnerScope0, "it");
        if(modifierNodeOwnerScope0.H()) {
            modifierNodeOwnerScope0.b().t();
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((ModifierNodeOwnerScope)object0));
        return S0.a;
    }
}

