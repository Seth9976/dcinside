package org.mp4parser.tools;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RangeStartMap implements Map {
    TreeMap base;

    public RangeStartMap() {
        this.base = new TreeMap(new Comparator() {
            public int compare(Comparable comparable0, Comparable comparable1) {
                return -comparable0.compareTo(comparable1);
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.compare(((Comparable)object0), ((Comparable)object1));
            }
        });
    }

    public RangeStartMap(Comparable comparable0, Object object0) {
        this.base = new TreeMap(new Comparator() {
            public int compare(Comparable comparable0, Comparable comparable1) {
                return -comparable0.compareTo(comparable1);
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.compare(((Comparable)object0), ((Comparable)object1));
            }
        });
        this.put(comparable0, object0);
    }

    @Override
    public void clear() {
        this.base.clear();
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.base.get(object0) != null;
    }

    @Override
    public boolean containsValue(Object object0) {
        return false;
    }

    @Override
    public Set entrySet() {
        return this.base.entrySet();
    }

    @Override
    public Object get(Object object0) {
        if(!(object0 instanceof Comparable)) {
            return null;
        }
        if(this.isEmpty()) {
            return null;
        }
        Iterator iterator0 = this.base.keySet().iterator();
        Object object1 = iterator0.next();
        Comparable comparable0;
        for(comparable0 = (Comparable)object1; iterator0.hasNext() && ((Comparable)object0).compareTo(comparable0) < 0; comparable0 = (Comparable)object2) {
            Object object2 = iterator0.next();
        }
        return this.base.get(comparable0);
    }

    @Override
    public boolean isEmpty() {
        return this.base.isEmpty();
    }

    @Override
    public Set keySet() {
        return this.base.keySet();
    }

    public Object put(Comparable comparable0, Object object0) {
        return this.base.put(comparable0, object0);
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.put(((Comparable)object0), object1);
    }

    @Override
    public void putAll(Map map0) {
        this.base.putAll(map0);
    }

    @Override
    public Object remove(Object object0) {
        if(!(object0 instanceof Comparable)) {
            return null;
        }
        if(this.isEmpty()) {
            return null;
        }
        Iterator iterator0 = this.base.keySet().iterator();
        Object object1 = iterator0.next();
        Comparable comparable0;
        for(comparable0 = (Comparable)object1; iterator0.hasNext() && ((Comparable)object0).compareTo(comparable0) < 0; comparable0 = (Comparable)object2) {
            Object object2 = iterator0.next();
        }
        return this.base.remove(comparable0);
    }

    @Override
    public int size() {
        return this.base.size();
    }

    @Override
    public Collection values() {
        return this.base.values();
    }
}

