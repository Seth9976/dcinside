package androidx.compose.runtime.snapshots;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.y;
import y4.l;
import y4.m;

public final class ReadonlySnapshot extends Snapshot {
    @m
    private final Function1 g;
    private int h;

    public ReadonlySnapshot(int v, @l SnapshotIdSet snapshotIdSet0, @m Function1 function10) {
        L.p(snapshotIdSet0, "invalid");
        super(v, snapshotIdSet0, null);
        this.g = function10;
        this.h = 1;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot A(@m Function1 function10) {
        SnapshotKt.g0(this);
        return new NestedReadonlySnapshot(this.g(), this.h(), function10, this);
    }

    @m
    public HashSet G() [...] // Inlined contents

    public void H(@m HashSet hashSet0) {
        SnapshotStateMapKt.b();
        throw new y();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void d() {
        if(!this.f()) {
            this.r(this);
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
        return this.g;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean k() {
        return true;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @l
    public Snapshot l() {
        return this;
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
    public void q(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        ++this.h;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void r(@l Snapshot snapshot0) {
        L.p(snapshot0, "snapshot");
        int v = this.h - 1;
        this.h = v;
        if(v == 0) {
            this.b();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void s() {
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void t(@l StateObject stateObject0) {
        L.p(stateObject0, "state");
        SnapshotKt.Y();
        throw new y();
    }
}

