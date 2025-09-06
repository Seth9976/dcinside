package j$.util;

import java.util.Map.Entry;

final class p implements Map.Entry {
    private Map.Entry a;

    p(Map.Entry map$Entry0) {
        this.a = (Map.Entry)Objects.requireNonNull(map$Entry0);
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry map$Entry0 = this.a;
        Object object1 = map$Entry0.getKey();
        Object object2 = ((Map.Entry)object0).getKey();
        if(object1 != null) {
            z = object1.equals(object2);
        }
        else if(object2 == null) {
            z = true;
        }
        else {
            z = false;
        }
        if(z) {
            Object object3 = map$Entry0.getValue();
            Object object4 = ((Map.Entry)object0).getValue();
            return object3 == null ? object4 == null : object3.equals(object4);
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final Object setValue(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

