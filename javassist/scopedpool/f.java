package javassist.scopedpool;

import j..util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class f implements Map {
    static class a extends SoftReference {
        public Object a;

        private a(Object object0, Object object1, ReferenceQueue referenceQueue0) {
            super(object1, referenceQueue0);
            this.a = object0;
        }

        private static a b(Object object0, Object object1, ReferenceQueue referenceQueue0) {
            return object1 == null ? null : new a(object0, object1, referenceQueue0);
        }
    }

    private Map a;
    private ReferenceQueue b;

    public f() {
        this.b = new ReferenceQueue();
        this.a = new ConcurrentHashMap();
    }

    public f(int v) {
        this.b = new ReferenceQueue();
        this.a = new ConcurrentHashMap(v);
    }

    public f(int v, float f) {
        this.b = new ReferenceQueue();
        this.a = new ConcurrentHashMap(v, f);
    }

    public f(Map map0) {
        this(Math.max(map0.size() * 2, 11), 0.75f);
        this.putAll(map0);
    }

    private void a() {
        if(!this.a.isEmpty()) {
            Reference reference0;
            while((reference0 = this.b.poll()) != null) {
                if(reference0 instanceof a && reference0 == this.a.get(((a)reference0).a)) {
                    this.a.remove(((a)reference0).a);
                }
            }
        }
    }

    private Object b(a f$a0) {
        return f$a0 == null ? null : f$a0.get();
    }

    @Override
    public void clear() {
        this.a();
        this.a.clear();
    }

    @Override
    public boolean containsKey(Object object0) {
        this.a();
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        this.a();
        if(object0 == null) {
            return false;
        }
        for(Object object1: this.a.values()) {
            if(((a)object1) != null && object0.equals(((a)object1).get())) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public Set entrySet() {
        this.a();
        Set set0 = new HashSet();
        for(Object object0: this.a.entrySet()) {
            set0.add(new AbstractMap.SimpleImmutableEntry(((Map.Entry)object0).getKey(), ((a)((Map.Entry)object0).getValue()).get()));
        }
        return set0;
    }

    @Override
    public Object get(Object object0) {
        this.a();
        return this.b(((a)this.a.get(object0)));
    }

    @Override
    public boolean isEmpty() {
        this.a();
        return this.a.isEmpty();
    }

    @Override
    public Set keySet() {
        this.a();
        return this.a.keySet();
    }

    @Override
    public Object put(Object object0, Object object1) {
        this.a();
        return this.b(((a)this.a.put(object0, a.b(object0, object1, this.b))));
    }

    @Override
    public void putAll(Map map0) {
        this.a();
        for(Object object0: map0.keySet()) {
            this.put(object0, map0.get(object0));
        }
    }

    @Override
    public Object remove(Object object0) {
        this.a();
        return this.b(((a)this.a.remove(object0)));
    }

    @Override
    public int size() {
        this.a();
        return this.a.size();
    }

    @Override
    public Collection values() {
        this.a();
        Collection collection0 = new ArrayList();
        for(Object object0: this.a.values()) {
            ((List)collection0).add(((a)object0).get());
        }
        return collection0;
    }
}

