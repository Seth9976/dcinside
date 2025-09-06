package com.google.common.collect;

import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.math.f;
import com.google.common.primitives.l;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

@c
@d
@C1
public final class s1 extends i implements Serializable {
    class com.google.common.collect.s1.d extends b {
        final s1 b;

        private com.google.common.collect.s1.d() {
        }

        com.google.common.collect.s1.d(a s1$a0) {
        }

        @Override  // com.google.common.collect.i$b
        S3 g() {
            return this.h();
        }

        s1 h() {
            return s1.this;
        }

        private List i() {
            List list0 = z3.v(this.size());
            q3.a(list0, this.iterator());
            return list0;
        }

        @Override
        public Object[] toArray() {
            return this.i().toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return this.i().toArray(arr_object);
        }
    }

    static class e {
        static final com.google.common.collect.A4.b a;

        static {
            e.a = A4.a(s1.class, "countMap");
        }
    }

    private final transient ConcurrentMap c;
    private static final long d = 1L;

    @J1.e
    s1(ConcurrentMap concurrentMap0) {
        H.u(concurrentMap0.isEmpty(), "the backing map (%s) must be empty", concurrentMap0);
        this.c = concurrentMap0;
    }

    @Override  // com.google.common.collect.i
    @O1.a
    public int T0(Object object0, int v) {
        H.E(object0);
        if(v == 0) {
            return this.y3(object0);
        }
        c1.d(v, "occurrences");
        do {
            AtomicInteger atomicInteger0 = (AtomicInteger)D3.p0(this.c, object0);
            if(atomicInteger0 == null) {
                AtomicInteger atomicInteger1 = new AtomicInteger(v);
                atomicInteger0 = (AtomicInteger)this.c.putIfAbsent(object0, atomicInteger1);
                if(atomicInteger0 == null) {
                    return 0;
                }
            }
            int v1;
            while((v1 = atomicInteger0.get()) != 0) {
                try {
                    if(atomicInteger0.compareAndSet(v1, f.c(v1, v))) {
                        return v1;
                    }
                    continue;
                }
                catch(ArithmeticException unused_ex) {
                    throw new IllegalArgumentException("Overflow adding " + v + " occurrences to a count of " + v1);
                }
            }
            AtomicInteger atomicInteger2 = new AtomicInteger(v);
        }
        while(this.c.putIfAbsent(object0, atomicInteger2) != null && !this.c.replace(object0, atomicInteger0, atomicInteger2));
        return 0;
    }

    @Override  // com.google.common.collect.i
    Set a() {
        class a extends r2 {
            final Set a;

            a(Set set0) {
                this.a = set0;
                super();
            }

            @Override  // com.google.common.collect.r2
            protected Object K() {
                return this.s0();
            }

            @Override  // com.google.common.collect.r2
            protected Collection M() {
                return this.s0();
            }

            @Override  // com.google.common.collect.Y1
            public boolean contains(@o3.a Object object0) {
                return object0 != null && d1.j(this.a, object0);
            }

            @Override  // com.google.common.collect.Y1
            public boolean containsAll(Collection collection0) {
                return this.S(collection0);
            }

            @Override  // com.google.common.collect.Y1
            public boolean remove(@o3.a Object object0) {
                return object0 != null && d1.k(this.a, object0);
            }

            @Override  // com.google.common.collect.Y1
            public boolean removeAll(Collection collection0) {
                return this.W(collection0);
            }

            @Override  // com.google.common.collect.r2
            protected Set s0() {
                return this.a;
            }
        }

        return new a(this, this.c.keySet());
    }

    @Override  // com.google.common.collect.i
    @Deprecated
    public Set b() {
        return new com.google.common.collect.s1.d(this, null);
    }

    @Override  // com.google.common.collect.i
    @O1.a
    public int b3(@o3.a Object object0, int v) {
        if(v == 0) {
            return this.y3(object0);
        }
        c1.d(v, "occurrences");
        AtomicInteger atomicInteger0 = (AtomicInteger)D3.p0(this.c, object0);
        if(atomicInteger0 == null) {
            return 0;
        }
        int v1;
        while((v1 = atomicInteger0.get()) != 0) {
            int v2 = Math.max(0, v1 - v);
            if(atomicInteger0.compareAndSet(v1, v2)) {
                if(v2 == 0) {
                    this.c.remove(object0, atomicInteger0);
                }
                return v1;
            }
        }
        return 0;
    }

    @Override  // com.google.common.collect.i
    int c() {
        return this.c.size();
    }

    @Override  // com.google.common.collect.i
    public void clear() {
        this.c.clear();
    }

    @Override  // com.google.common.collect.i
    public boolean contains(@o3.a Object object0) {
        return super.contains(object0);
    }

    @Override  // com.google.common.collect.i
    Iterator d() {
        throw new AssertionError("should never be called");
    }

    @Override  // com.google.common.collect.i
    public Set entrySet() {
        return super.entrySet();
    }

    @Override  // com.google.common.collect.i
    public Set f() {
        return super.f();
    }

    @Override  // com.google.common.collect.i
    Iterator g() {
        class com.google.common.collect.s1.b extends com.google.common.collect.c {
            private final Iterator c;
            final s1 d;

            com.google.common.collect.s1.b() {
                this.c = s10.c.entrySet().iterator();
            }

            @Override  // com.google.common.collect.c
            @o3.a
            protected Object a() {
                return this.d();
            }

            @o3.a
            protected com.google.common.collect.S3.a d() {
                int v;
                Map.Entry map$Entry0;
                do {
                    if(!this.c.hasNext()) {
                        return (com.google.common.collect.S3.a)this.b();
                    }
                    Object object0 = this.c.next();
                    map$Entry0 = (Map.Entry)object0;
                    v = ((AtomicInteger)map$Entry0.getValue()).get();
                }
                while(v == 0);
                return T3.k(map$Entry0.getKey(), v);
            }
        }


        class com.google.common.collect.s1.c extends f2 {
            @o3.a
            private com.google.common.collect.S3.a a;
            final Iterator b;
            final s1 c;

            com.google.common.collect.s1.c(Iterator iterator0) {
                this.b = iterator0;
                super();
            }

            @Override  // com.google.common.collect.f2
            protected Object K() {
                return this.M();
            }

            @Override  // com.google.common.collect.f2
            protected Iterator M() {
                return this.b;
            }

            public com.google.common.collect.S3.a N() {
                com.google.common.collect.S3.a s3$a0 = (com.google.common.collect.S3.a)super.next();
                this.a = s3$a0;
                return s3$a0;
            }

            @Override  // com.google.common.collect.f2
            public Object next() {
                return this.N();
            }

            @Override  // com.google.common.collect.f2
            public void remove() {
                H.h0(this.a != null, "no calls to next() since the last call to remove()");
                Object object0 = this.a.b0();
                s1.this.j2(object0, 0);
                this.a = null;
            }
        }

        return new com.google.common.collect.s1.c(this, new com.google.common.collect.s1.b(this));
    }

    public static s1 i() {
        return new s1(new ConcurrentHashMap());
    }

    @Override  // com.google.common.collect.i
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override  // com.google.common.collect.S3
    public Iterator iterator() {
        return T3.n(this);
    }

    public static s1 j(Iterable iterable0) {
        s1 s10 = s1.i();
        p3.a(s10, iterable0);
        return s10;
    }

    @Override  // com.google.common.collect.i
    @O1.a
    public boolean j1(Object object0, int v, int v1) {
        H.E(object0);
        c1.b(v, "oldCount");
        c1.b(v1, "newCount");
        AtomicInteger atomicInteger0 = (AtomicInteger)D3.p0(this.c, object0);
        if(atomicInteger0 == null) {
            if(v != 0) {
                return false;
            }
            if(v1 == 0) {
                return true;
            }
            AtomicInteger atomicInteger1 = new AtomicInteger(v1);
            return this.c.putIfAbsent(object0, atomicInteger1) == null;
        }
        int v2 = atomicInteger0.get();
        if(v2 == v) {
            if(v2 == 0) {
                if(v1 == 0) {
                    this.c.remove(object0, atomicInteger0);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(v1);
                return this.c.putIfAbsent(object0, atomicInteger2) == null || this.c.replace(object0, atomicInteger0, atomicInteger2);
            }
            if(atomicInteger0.compareAndSet(v2, v1)) {
                if(v1 == 0) {
                    this.c.remove(object0, atomicInteger0);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // com.google.common.collect.i
    @O1.a
    public int j2(Object object0, int v) {
        int v1;
        AtomicInteger atomicInteger0;
        H.E(object0);
        c1.b(v, "count");
        while(true) {
            atomicInteger0 = (AtomicInteger)D3.p0(this.c, object0);
            if(atomicInteger0 == null) {
                if(v == 0) {
                    return 0;
                }
                AtomicInteger atomicInteger1 = new AtomicInteger(v);
                atomicInteger0 = (AtomicInteger)this.c.putIfAbsent(object0, atomicInteger1);
                if(atomicInteger0 == null) {
                    return 0;
                }
            }
        label_10:
            v1 = atomicInteger0.get();
            if(v1 != 0) {
                break;
            }
            if(v == 0) {
                return 0;
            }
            AtomicInteger atomicInteger2 = new AtomicInteger(v);
            if(this.c.putIfAbsent(object0, atomicInteger2) != null && !this.c.replace(object0, atomicInteger0, atomicInteger2)) {
                continue;
            }
            return 0;
        }
        if(!atomicInteger0.compareAndSet(v1, v)) {
            goto label_10;
        }
        if(v == 0) {
            this.c.remove(object0, atomicInteger0);
        }
        return v1;
    }

    public static s1 k(ConcurrentMap concurrentMap0) {
        return new s1(concurrentMap0);
    }

    @d
    private void l(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        Object object0 = objectInputStream0.readObject();
        Objects.requireNonNull(object0);
        e.a.b(this, ((ConcurrentMap)object0));
    }

    @O1.a
    public boolean m(@o3.a Object object0, int v) {
        if(v == 0) {
            return true;
        }
        c1.d(v, "occurrences");
        AtomicInteger atomicInteger0 = (AtomicInteger)D3.p0(this.c, object0);
        if(atomicInteger0 == null) {
            return false;
        }
        do {
            int v1 = atomicInteger0.get();
            if(v1 < v) {
                return false;
            }
            int v2 = v1 - v;
        }
        while(!atomicInteger0.compareAndSet(v1, v2));
        if(v2 == 0) {
            this.c.remove(object0, atomicInteger0);
        }
        return true;
    }

    private List n() {
        List list0 = z3.v(this.size());
        for(Object object0: this.entrySet()) {
            Object object1 = ((com.google.common.collect.S3.a)object0).b0();
            for(int v = ((com.google.common.collect.S3.a)object0).getCount(); v > 0; --v) {
                list0.add(object1);
            }
        }
        return list0;
    }

    private void o(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.c);
    }

    @Override  // com.google.common.collect.S3
    public int size() {
        long v = 0L;
        for(Object object0: this.c.values()) {
            v += (long)((AtomicInteger)object0).get();
        }
        return l.z(v);
    }

    @Override
    public Object[] toArray() {
        return this.n().toArray();
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        return this.n().toArray(arr_object);
    }

    @Override  // com.google.common.collect.S3
    public int y3(@o3.a Object object0) {
        AtomicInteger atomicInteger0 = (AtomicInteger)D3.p0(this.c, object0);
        return atomicInteger0 == null ? 0 : atomicInteger0.get();
    }
}

