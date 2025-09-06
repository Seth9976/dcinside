package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.y;
import y4.l;
import y4.m;

public final class TransparentObserverSnapshot extends Snapshot {
    @m
    private final Snapshot g;
    private final boolean h;
    private final boolean i;
    @m
    private final Function1 j;
    @m
    private final Function1 k;
    @l
    private final Snapshot l;

    public TransparentObserverSnapshot(@m Snapshot snapshot0, @m Function1 function10, boolean z, boolean z1) {
        super(0, SnapshotIdSet.e.a(), null);
        Function1 function11;
        this.g = snapshot0;
        this.h = z;
        this.i = z1;
        if(snapshot0 == null) {
            function11 = ((GlobalSnapshot)SnapshotKt.j.get()).j();
        }
        else {
            function11 = snapshot0.j();
            if(function11 == null) {
                function11 = ((GlobalSnapshot)SnapshotKt.j.get()).j();
            }
        }
        this.j = SnapshotKt.I(function10, function11, z);
        this.l = this;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot A(@m Function1 function10) {
        Function1 function11 = SnapshotKt.J(function10, this.j(), false, 4, null);
        return this.h ? this.G().A(function11) : SnapshotKt.z(this.G().A(null), function11, true);
    }

    private final Snapshot G() {
        Snapshot snapshot0 = this.g;
        if(snapshot0 == null) {
            Object object0 = SnapshotKt.j.get();
            L.o(object0, "currentGlobalSnapshot.get()");
            return (Snapshot)object0;
        }
        return snapshot0;
    }

    @l
    public Void H(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @l
    public Void I(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    public void J(@m Set set0) {
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void d() {
        this.x(true);
        if(this.i) {
            Snapshot snapshot0 = this.g;
            if(snapshot0 != null) {
                snapshot0.d();
            }
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public int g() {
        return this.G().g();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public SnapshotIdSet h() {
        return this.G().h();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Set i() {
        return this.G().i();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Function1 j() {
        return this.j;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean k() {
        return this.G().k();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot l() {
        return this.l;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @m
    public Function1 m() {
        return this.k;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean n() {
        return this.G().n();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void q(Snapshot snapshot0) {
        this.H(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void r(Snapshot snapshot0) {
        this.I(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void s() {
        this.G().s();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void t(@l StateObject stateObject0) {
        L.p(stateObject0, "state");
        this.G().t(stateObject0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void y(int v) {
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void z(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "value");
        SnapshotStateMapKt.b();
        throw new y();
    }
}

