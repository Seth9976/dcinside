package j$.util;

import j..util.stream.Stream;
import j..util.stream.StreamSupport;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

final class r extends u {
    private static final long serialVersionUID = 0x6D0066A59F08EAB5L;

    @Override  // j$.util.l
    public final boolean contains(Object object0) {
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        p p0 = new p(((Map.Entry)object0));
        return this.a.contains(p0);
    }

    @Override  // j$.util.l
    public final boolean containsAll(Collection collection0) {
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // j$.util.u
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Set)) {
            return false;
        }
        return ((Set)object0).size() == this.a.size() ? this.containsAll(((Set)object0)) : false;
    }

    @Override  // j$.util.l, j$.util.Collection
    public final void forEach(Consumer consumer0) {
        Objects.requireNonNull(consumer0);
        o o0 = new o(consumer0);
        Collection.-EL.a(this.a, o0);
    }

    @Override  // j$.util.l
    public final Iterator iterator() {
        return new k(this);
    }

    @Override  // j$.util.l, j$.util.Collection
    public final Stream parallelStream() {
        return StreamSupport.stream(this.spliterator(), true);
    }

    @Override  // j$.util.l, j$.util.Set
    public final Spliterator spliterator() {
        return new q(Collection.-EL.b(this.a));
    }

    @Override  // j$.util.l, j$.util.Collection
    public final Stream stream() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    @Override  // j$.util.l
    public final Object[] toArray() {
        Object[] arr_object = this.a.toArray();
        for(int v = 0; v < arr_object.length; ++v) {
            arr_object[v] = new p(((Map.Entry)arr_object[v]));
        }
        return arr_object;
    }

    @Override  // j$.util.l
    public final Object[] toArray(Object[] arr_object) {
        Object[] arr_object1 = arr_object.length == 0 ? arr_object : Arrays.copyOf(arr_object, 0);
        Object[] arr_object2 = this.a.toArray(arr_object1);
        for(int v = 0; v < arr_object2.length; ++v) {
            arr_object2[v] = new p(((Map.Entry)arr_object2[v]));
        }
        if(arr_object2.length > arr_object.length) {
            return arr_object2;
        }
        System.arraycopy(arr_object2, 0, arr_object, 0, arr_object2.length);
        if(arr_object.length > arr_object2.length) {
            arr_object[arr_object2.length] = null;
        }
        return arr_object;
    }
}

