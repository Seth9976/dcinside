package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

final class PoolingContainerListenerHolder {
    @l
    private final ArrayList a;

    public PoolingContainerListenerHolder() {
        this.a = new ArrayList();
    }

    public final void a(@l PoolingContainerListener poolingContainerListener0) {
        L.p(poolingContainerListener0, "listener");
        this.a.add(poolingContainerListener0);
    }

    public final void b() {
        for(int v = u.J(this.a); -1 < v; --v) {
            ((PoolingContainerListener)this.a.get(v)).i();
        }
    }

    public final void c(@l PoolingContainerListener poolingContainerListener0) {
        L.p(poolingContainerListener0, "listener");
        this.a.remove(poolingContainerListener0);
    }
}

