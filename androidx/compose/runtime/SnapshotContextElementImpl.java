package androidx.compose.runtime;

import A3.o;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotContextElement.DefaultImpls;
import androidx.compose.runtime.snapshots.SnapshotContextElement;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.k1;
import y4.l;
import y4.m;

@ExperimentalComposeApi
public final class SnapshotContextElementImpl implements SnapshotContextElement, k1 {
    @l
    private final Snapshot a;

    public SnapshotContextElementImpl(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        super();
        this.a = snapshot0;
    }

    @Override  // kotlinx.coroutines.k1
    public void L(g g0, Object object0) {
        this.b(g0, ((Snapshot)object0));
    }

    public void b(@l g g0, @m Snapshot snapshot0) {
        L.p(g0, "context");
        this.a.E(snapshot0);
    }

    @m
    public Snapshot d(@l g g0) {
        L.p(g0, "context");
        return this.a.D();
    }

    @Override  // kotlinx.coroutines.k1
    public Object d1(g g0) {
        return this.d(g0);
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return DefaultImpls.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return DefaultImpls.b(this, g$c0);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public c getKey() {
        return SnapshotContextElement.l0;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return DefaultImpls.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return DefaultImpls.d(this, g0);
    }
}

