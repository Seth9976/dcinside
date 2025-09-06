package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class b implements Serializable, Collection {
    final ConcurrentHashMap a;
    private static final long serialVersionUID = 0x6499DE129D87293DL;

    b(ConcurrentHashMap concurrentHashMap0) {
        this.a = concurrentHashMap0;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public abstract boolean contains(Object arg1);

    @Override
    public final boolean containsAll(Collection collection0) {
        if(collection0 != this) {
            for(Object object0: collection0) {
                if(object0 == null || !this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public abstract Iterator iterator();

    @Override
    public abstract boolean remove(Object arg1);

    @Override
    public boolean removeAll(Collection collection0) {
        collection0.getClass();
        l[] arr_l = this.a.a;
        boolean z = false;
        if(arr_l == null) {
            return false;
        }
        if(collection0 instanceof Set && collection0.size() > arr_l.length) {
            Iterator iterator0 = this.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(collection0.contains(object0)) {
                    iterator0.remove();
                    z = true;
                }
            }
            return z;
        }
        for(Object object1: collection0) {
            z |= this.remove(object1);
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        collection0.getClass();
        boolean z = false;
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final Object[] toArray() {
        long v = this.a.j();
        if(v < 0L) {
            v = 0L;
        }
        if(v > 0x7FFFFFF7L) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int v1 = (int)v;
        Object[] arr_object = new Object[v1];
        int v2 = 0;
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            int v3 = 0x7FFFFFF7;
            Object object0 = iterator0.next();
            if(v2 == v1) {
                if(v1 >= 0x7FFFFFF7) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                if(v1 < 0x3FFFFFFB) {
                    v3 = (v1 >>> 1) + 1 + v1;
                }
                arr_object = Arrays.copyOf(arr_object, v3);
                v1 = v3;
            }
            arr_object[v2] = object0;
            ++v2;
        }
        return v2 == v1 ? arr_object : Arrays.copyOf(arr_object, v2);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        long v = this.a.j();
        if(v < 0L) {
            v = 0L;
        }
        if(v > 0x7FFFFFF7L) {
            throw new OutOfMemoryError("Required array size too large");
        }
        Object[] arr_object1 = arr_object.length < ((int)v) ? ((Object[])Array.newInstance(arr_object.getClass().getComponentType(), ((int)v))) : arr_object;
        int v1 = arr_object1.length;
        int v2 = 0;
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            int v3 = 0x7FFFFFF7;
            Object object0 = iterator0.next();
            if(v2 == v1) {
                if(v1 >= 0x7FFFFFF7) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                if(v1 < 0x3FFFFFFB) {
                    v3 = (v1 >>> 1) + 1 + v1;
                }
                arr_object1 = Arrays.copyOf(arr_object1, v3);
                v1 = v3;
            }
            arr_object1[v2] = object0;
            ++v2;
        }
        if(arr_object == arr_object1 && v2 < v1) {
            arr_object1[v2] = null;
            return arr_object1;
        }
        return v2 == v1 ? arr_object1 : Arrays.copyOf(arr_object1, v2);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        Iterator iterator0 = this.iterator();
        if(iterator0.hasNext()) {
            while(true) {
                String s = iterator0.next();
                if(s == this) {
                    s = "(this Collection)";
                }
                stringBuilder0.append(s);
                if(!iterator0.hasNext()) {
                    break;
                }
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

