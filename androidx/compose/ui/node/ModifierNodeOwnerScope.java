package androidx.compose.ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class ModifierNodeOwnerScope implements OwnerScope {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final Function1 a() {
            return ModifierNodeOwnerScope.c;
        }
    }

    @l
    private final ObserverNode a;
    @l
    public static final Companion b;
    @l
    private static final Function1 c;

    static {
        ModifierNodeOwnerScope.b = new Companion(null);
        ModifierNodeOwnerScope.c = ModifierNodeOwnerScope.Companion.OnObserveReadsChanged.1.e;
    }

    public ModifierNodeOwnerScope(@l ObserverNode observerNode0) {
        L.p(observerNode0, "observerNode");
        super();
        this.a = observerNode0;
    }

    @Override  // androidx.compose.ui.node.OwnerScope
    public boolean H() {
        return this.a.getNode().Q();
    }

    @l
    public final ObserverNode b() {
        return this.a;
    }
}

