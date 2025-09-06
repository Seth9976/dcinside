package androidx.compose.runtime.snapshots;

import B3.d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

final class StateMapMutableEntriesIterator extends StateMapMutableIterator implements d, Iterator {
    public StateMapMutableEntriesIterator(@l SnapshotStateMap snapshotStateMap0, @l Iterator iterator0) {
        L.p(snapshotStateMap0, "map");
        L.p(iterator0, "iterator");
        super(snapshotStateMap0, iterator0);
    }

    @Override
    public Object next() {
        return this.o();
    }

    @l
    public Map.Entry o() {
        this.c();
        if(this.d() == null) {
            throw new IllegalStateException();
        }
        return new Object() {
            private final Object a;
            private Object b;

            {
                Map.Entry map$Entry0 = stateMapMutableEntriesIterator0.d();
                L.m(map$Entry0);
                this.a = map$Entry0.getKey();
                Map.Entry map$Entry1 = stateMapMutableEntriesIterator0.d();
                L.m(map$Entry1);
                this.b = map$Entry1.getValue();
            }

            public void a(Object object0) {
                this.b = object0;
            }

            @Override
            public Object getKey() {
                return this.a;
            }

            @Override
            public Object getValue() {
                return this.b;
            }

            @Override
            public Object setValue(Object object0) {
                StateMapMutableEntriesIterator stateMapMutableEntriesIterator0 = this.c;
                if(stateMapMutableEntriesIterator0.g().l() != stateMapMutableEntriesIterator0.c) {
                    throw new ConcurrentModificationException();
                }
                stateMapMutableEntriesIterator0.g().put(this.getKey(), object0);
                this.a(object0);
                return this.getValue();
            }
        };
    }
}

