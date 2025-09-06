package androidx.collection;

import B3.a;
import java.util.Map.Entry;

final class MapEntry implements a, Map.Entry {
    private final Object a;
    private final Object b;

    public MapEntry(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

