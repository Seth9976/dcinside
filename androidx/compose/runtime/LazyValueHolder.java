package androidx.compose.runtime;

import A3.a;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import y4.l;

public final class LazyValueHolder implements State {
    @l
    private final D a;

    public LazyValueHolder(@l a a0) {
        L.p(a0, "valueProducer");
        super();
        this.a = E.a(a0);
    }

    private final Object b() {
        return this.a.getValue();
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.b();
    }
}

