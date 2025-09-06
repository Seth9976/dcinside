package j$.util;

import java.util.Comparator;
import java.util.SortedMap;

final class v extends s implements SortedMap {
    private final SortedMap e;
    private static final long serialVersionUID = 0x85C82928D3A5D70AL;

    v(SortedMap sortedMap0) {
        super(sortedMap0);
        this.e = sortedMap0;
    }

    @Override
    public final Comparator comparator() {
        return this.e.comparator();
    }

    @Override
    public final Object firstKey() {
        return this.e.firstKey();
    }

    @Override
    public final SortedMap headMap(Object object0) {
        return new v(this.e.headMap(object0));
    }

    @Override
    public final Object lastKey() {
        return this.e.lastKey();
    }

    @Override
    public final SortedMap subMap(Object object0, Object object1) {
        return new v(this.e.subMap(object0, object1));
    }

    @Override
    public final SortedMap tailMap(Object object0) {
        return new v(this.e.tailMap(object0));
    }
}

