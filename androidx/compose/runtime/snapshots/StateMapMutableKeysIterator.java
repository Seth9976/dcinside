package androidx.compose.runtime.snapshots;

import B3.d;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

final class StateMapMutableKeysIterator extends StateMapMutableIterator implements d, Iterator {
    public StateMapMutableKeysIterator(@l SnapshotStateMap snapshotStateMap0, @l Iterator iterator0) {
        L.p(snapshotStateMap0, "map");
        L.p(iterator0, "iterator");
        super(snapshotStateMap0, iterator0);
    }

    @Override
    public Object next() {
        Map.Entry map$Entry0 = this.i();
        if(map$Entry0 == null) {
            throw new IllegalStateException();
        }
        this.c();
        return map$Entry0.getKey();
    }
}

