package androidx.compose.runtime.snapshots;

import B3.h;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import y4.l;

abstract class SnapshotMapSet implements h, Set {
    @l
    private final SnapshotStateMap a;

    public SnapshotMapSet(@l SnapshotStateMap snapshotStateMap0) {
        L.p(snapshotStateMap0, "map");
        super();
        this.a = snapshotStateMap0;
    }

    @l
    public final SnapshotStateMap a() {
        return this.a;
    }

    public int b() {
        return this.a.size();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final int size() {
        return this.b();
    }

    @Override
    public Object[] toArray() {
        return v.a(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        L.p(arr_object, "array");
        return v.b(this, arr_object);
    }
}

