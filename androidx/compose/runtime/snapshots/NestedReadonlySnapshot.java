package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Set;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.y;
import y4.l;
import y4.m;

public final class NestedReadonlySnapshot extends Snapshot {
    @l
    private final Snapshot g;
    @m
    private final Function1 h;

    public NestedReadonlySnapshot(int v, @l SnapshotIdSet snapshotIdSet0, @m Function1 function10, @l Snapshot snapshot0) {
        L.p(snapshotIdSet0, "invalid");
        L.p(snapshot0, "parent");
        super(v, snapshotIdSet0, null);
        this.g = snapshot0;
        snapshot0.q(this);
        if(function10 == null) {
            function10 = snapshot0.j();
        }
        else {
            Function1 function11 = snapshot0.j();
            if(function11 != null) {
                function10 = new Function1(function11) {
                    final Function1 e;
                    final Function1 f;

                    {
                        this.e = function10;
                        this.f = function11;
                        super(1);
                    }

                    public final void a(@l Object object0) {
                        L.p(object0, "state");
                        this.e.invoke(object0);
                        this.f.invoke(object0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(object0);
                        return S0.a;
                    }
                };
            }
        }
        this.h = function10;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot A(Function1 function10) {
        return this.L(function10);
    }

    @m
    public HashSet G() [...] // Inlined contents

    @l
    public final Snapshot H() {
        return this.g;
    }

    @l
    public Void I(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @l
    public Void J(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @l
    public Void K(@l StateObject stateObject0) {
        L.p(stateObject0, "state");
        SnapshotKt.Y();
        throw new y();
    }

    @l
    public NestedReadonlySnapshot L(@m Function1 function10) {
        return new NestedReadonlySnapshot(this.g(), this.h(), function10, this.g);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void d() {
        if(!this.f()) {
            if(this.g() != this.g.g()) {
                this.b();
            }
            this.g.r(this);
            super.d();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Set i() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Function1 j() {
        return this.h;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean k() {
        return true;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot l() {
        return this.g.l();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Function1 m() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean n() {
        return false;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void q(Snapshot snapshot0) {
        this.I(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void r(Snapshot snapshot0) {
        this.J(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void s() {
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void t(StateObject stateObject0) {
        this.K(stateObject0);
    }
}

