package com.bytedance.adsdk.Zh;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class qla {
    final class PjT implements Iterator {
        final qla JQp;
        final int PjT;
        int ReZ;
        int Zh;
        boolean cr;

        PjT(int v) {
            this.cr = false;
            this.PjT = v;
            this.Zh = qla0.PjT();
        }

        @Override
        public boolean hasNext() {
            return this.ReZ < this.Zh;
        }

        @Override
        public Object next() {
            if(!this.hasNext()) {
                throw new NoSuchElementException();
            }
            Object object0 = qla.this.PjT(this.ReZ, this.PjT);
            ++this.ReZ;
            this.cr = true;
            return object0;
        }

        @Override
        public void remove() {
            if(!this.cr) {
                throw new IllegalStateException();
            }
            int v = this.ReZ - 1;
            this.ReZ = v;
            --this.Zh;
            this.cr = false;
            qla.this.PjT(v);
        }
    }

    final class Zh implements Set {
        final qla PjT;

        @Override
        public boolean add(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void clear() {
            qla.this.ReZ();
        }

        @Override
        public boolean contains(Object object0) {
            return qla.this.PjT(object0) >= 0;
        }

        @Override
        public boolean containsAll(Collection collection0) {
            return qla.PjT(qla.this.Zh(), collection0);
        }

        @Override
        public boolean equals(Object object0) {
            return qla.PjT(this, object0);
        }

        @Override
        public int hashCode() {
            int v = qla.this.PjT() - 1;
            int v1 = 0;
            while(v >= 0) {
                Object object0 = qla.this.PjT(v, 0);
                v1 += (object0 == null ? 0 : object0.hashCode());
                --v;
            }
            return v1;
        }

        @Override
        public boolean isEmpty() {
            return qla.this.PjT() == 0;
        }

        @Override
        public Iterator iterator() {
            return new PjT(qla.this, 0);
        }

        @Override
        public boolean remove(Object object0) {
            int v = qla.this.PjT(object0);
            if(v >= 0) {
                qla.this.PjT(v);
                return true;
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            return qla.Zh(qla.this.Zh(), collection0);
        }

        @Override
        public boolean retainAll(Collection collection0) {
            return qla.ReZ(qla.this.Zh(), collection0);
        }

        @Override
        public int size() {
            return qla.this.PjT();
        }

        @Override
        public Object[] toArray() {
            return qla.this.Zh(0);
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return qla.this.PjT(arr_object, 0);
        }
    }

    Zh Zh;

    public static boolean PjT(Map map0, Collection collection0) {
        for(Object object0: collection0) {
            if(!map0.containsKey(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public static boolean PjT(Set set0, Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                if(set0.size() == set1.size() && set0.containsAll(set1)) {
                    return true;
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    protected abstract int PjT();

    protected abstract int PjT(Object arg1);

    protected abstract Object PjT(int arg1, int arg2);

    protected abstract void PjT(int arg1);

    public Object[] PjT(Object[] arr_object, int v) {
        int v1 = this.PjT();
        if(arr_object.length < v1) {
            arr_object = (Object[])Array.newInstance(arr_object.getClass().getComponentType(), v1);
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.PjT(v2, v);
        }
        if(arr_object.length > v1) {
            arr_object[v1] = null;
        }
        return arr_object;
    }

    public static boolean ReZ(Map map0, Collection collection0) {
        int v = map0.size();
        Iterator iterator0 = map0.keySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(object0)) {
                iterator0.remove();
            }
        }
        return v != map0.size();
    }

    protected abstract void ReZ();

    public static boolean Zh(Map map0, Collection collection0) {
        int v = map0.size();
        for(Object object0: collection0) {
            map0.remove(object0);
        }
        return v != map0.size();
    }

    protected abstract Map Zh();

    public Object[] Zh(int v) {
        int v1 = this.PjT();
        Object[] arr_object = new Object[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_object[v2] = this.PjT(v2, v);
        }
        return arr_object;
    }

    public Set cr() {
        if(this.Zh == null) {
            this.Zh = new Zh(this);
        }
        return this.Zh;
    }
}

