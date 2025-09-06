package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.y;
import y4.l;
import y4.m;

public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    @m
    private final MutableSnapshot o;
    @m
    private final Function1 p;
    @m
    private final Function1 q;
    private final boolean r;
    private final boolean s;

    public TransparentObserverMutableSnapshot(@m MutableSnapshot mutableSnapshot0, @m Function1 function10, @m Function1 function11, boolean z, boolean z1) {
        Function1 function14;
        Function1 function12;
        SnapshotIdSet snapshotIdSet0 = SnapshotIdSet.e.a();
        if(mutableSnapshot0 == null) {
            function12 = ((GlobalSnapshot)SnapshotKt.j.get()).j();
        }
        else {
            function12 = mutableSnapshot0.j();
            if(function12 == null) {
                function12 = ((GlobalSnapshot)SnapshotKt.j.get()).j();
            }
        }
        Function1 function13 = SnapshotKt.I(function10, function12, z);
        if(mutableSnapshot0 == null) {
            function14 = ((GlobalSnapshot)SnapshotKt.j.get()).m();
        }
        else {
            function14 = mutableSnapshot0.m();
            if(function14 == null) {
                function14 = ((GlobalSnapshot)SnapshotKt.j.get()).m();
            }
        }
        super(0, snapshotIdSet0, function13, SnapshotKt.K(function11, function14));
        this.o = mutableSnapshot0;
        this.p = function10;
        this.q = function11;
        this.r = z;
        this.s = z1;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public Snapshot A(@m Function1 function10) {
        Function1 function11 = SnapshotKt.J(function10, this.j(), false, 4, null);
        return this.r ? this.b0().A(function11) : SnapshotKt.z(this.b0().A(null), function11, true);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public SnapshotApplyResult J() {
        return this.b0().J();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void U(@m Set set0) {
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @l
    public MutableSnapshot X(@m Function1 function10, @m Function1 function11) {
        Function1 function12 = SnapshotKt.J(function10, this.j(), false, 4, null);
        Function1 function13 = SnapshotKt.K(function11, this.m());
        return !this.r ? new TransparentObserverMutableSnapshot(this.b0().X(null, function13), function12, function13, false, true) : this.b0().X(function12, function13);
    }

    private final MutableSnapshot b0() {
        MutableSnapshot mutableSnapshot0 = this.o;
        if(mutableSnapshot0 == null) {
            Object object0 = SnapshotKt.j.get();
            L.o(object0, "currentGlobalSnapshot.get()");
            return (MutableSnapshot)object0;
        }
        return mutableSnapshot0;
    }

    @m
    public final Function1 c0() {
        return this.p;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void d() {
        this.x(true);
        if(this.s) {
            MutableSnapshot mutableSnapshot0 = this.o;
            if(mutableSnapshot0 != null) {
                mutableSnapshot0.d();
            }
        }
    }

    @m
    public final Function1 d0() {
        return this.q;
    }

    @l
    public Void e0(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @l
    public Void f0(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public int g() {
        return this.b0().g();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public SnapshotIdSet h() {
        return this.b0().h();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @m
    public Set i() {
        return this.b0().i();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public boolean k() {
        return this.b0().k();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public boolean n() {
        return this.b0().n();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void q(Snapshot snapshot0) {
        this.e0(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void r(Snapshot snapshot0) {
        this.f0(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void s() {
        this.b0().s();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void t(@l StateObject stateObject0) {
        L.p(stateObject0, "state");
        this.b0().t(stateObject0);
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

