package com.google.common.collect;

import J1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.j2objc.annotations.RetainedWith;
import j..util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@b(emulated = true)
@C1
abstract class a extends j2 implements x, Serializable {
    class com.google.common.collect.a.b extends k2 {
        private final Map.Entry a;
        final a b;

        com.google.common.collect.a.b(Map.Entry map$Entry0) {
            this.a = map$Entry0;
        }

        @Override  // com.google.common.collect.k2
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.collect.k2
        protected Map.Entry M() {
            return this.a;
        }

        @Override  // com.google.common.collect.k2
        public Object setValue(Object object0) {
            a.this.w0(object0);
            H.h0(a.this.entrySet().contains(this), "entry no longer in map");
            if(B.a(object0, this.getValue())) {
                return object0;
            }
            H.u(!a.this.containsValue(object0), "value already present: %s", object0);
            Object object1 = this.a.setValue(object0);
            Object object2 = this.getKey();
            H.h0(B.a(object0, a.this.get(object2)), "entry no longer in map");
            Object object3 = this.getKey();
            a.this.G0(object3, true, object1, object0);
            return object1;
        }
    }

    class c extends r2 {
        final Set a;
        final a b;

        private c() {
            this.a = a0.a.entrySet();
        }

        c(com.google.common.collect.a.a a$a0) {
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
        public void clear() {
            a.this.clear();
        }

        @Override  // com.google.common.collect.Y1
        public boolean contains(@o3.a Object object0) {
            return D3.p(this.s0(), object0);
        }

        @Override  // com.google.common.collect.Y1
        public boolean containsAll(Collection collection0) {
            return this.S(collection0);
        }

        @Override  // com.google.common.collect.Y1
        public Iterator iterator() {
            return a.this.y0();
        }

        @Override  // com.google.common.collect.Y1
        public boolean remove(@o3.a Object object0) {
            if(this.a.contains(object0) && object0 instanceof Map.Entry) {
                a.this.b.a.remove(((Map.Entry)object0).getValue());
                this.a.remove(((Map.Entry)object0));
                return true;
            }
            return false;
        }

        @Override  // com.google.common.collect.Y1
        public boolean removeAll(Collection collection0) {
            return this.W(collection0);
        }

        @Override  // com.google.common.collect.Y1
        public boolean retainAll(Collection collection0) {
            return this.X(collection0);
        }

        @Override  // com.google.common.collect.r2
        protected Set s0() {
            return this.a;
        }

        @Override  // com.google.common.collect.Y1
        public Object[] toArray() {
            return this.p0();
        }

        @Override  // com.google.common.collect.Y1
        public Object[] toArray(Object[] arr_object) {
            return this.q0(arr_object);
        }
    }

    static class d extends a {
        @J1.c
        @J1.d
        private static final long g;

        d(Map map0, a a0) {
            super(map0, a0, null);
        }

        @J1.c
        @J1.d
        private void H0(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
            objectInputStream0.defaultReadObject();
            Object object0 = objectInputStream0.readObject();
            Objects.requireNonNull(object0);
            this.F0(((a)object0));
        }

        @J1.c
        @J1.d
        Object I0() {
            return this.Q1().Q1();
        }

        @J1.c
        @J1.d
        private void J0(ObjectOutputStream objectOutputStream0) throws IOException {
            objectOutputStream0.defaultWriteObject();
            objectOutputStream0.writeObject(this.Q1());
        }

        @Override  // com.google.common.collect.a
        protected Object K() {
            return super.M();
        }

        @Override  // com.google.common.collect.a
        @d4
        Object v0(@d4 Object object0) {
            return this.b.w0(object0);
        }

        @Override  // com.google.common.collect.a
        public Collection values() {
            return super.values();
        }

        @Override  // com.google.common.collect.a
        @d4
        Object w0(@d4 Object object0) {
            return this.b.v0(object0);
        }
    }

    class e extends r2 {
        final a a;

        private e() {
        }

        e(com.google.common.collect.a.a a$a0) {
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
        public void clear() {
            a.this.clear();
        }

        @Override  // com.google.common.collect.Y1
        public Iterator iterator() {
            return D3.S(a.this.entrySet().iterator());
        }

        @Override  // com.google.common.collect.Y1
        public boolean remove(@o3.a Object object0) {
            if(!this.contains(object0)) {
                return false;
            }
            a.this.B0(object0);
            return true;
        }

        @Override  // com.google.common.collect.Y1
        public boolean removeAll(Collection collection0) {
            return this.W(collection0);
        }

        @Override  // com.google.common.collect.Y1
        public boolean retainAll(Collection collection0) {
            return this.X(collection0);
        }

        @Override  // com.google.common.collect.r2
        protected Set s0() {
            return a.this.a.keySet();
        }
    }

    class f extends r2 {
        final Set a;
        final a b;

        private f() {
            this.a = a0.b.keySet();
        }

        f(com.google.common.collect.a.a a$a0) {
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
        public Iterator iterator() {
            return D3.R0(a.this.entrySet().iterator());
        }

        @Override  // com.google.common.collect.r2
        protected Set s0() {
            return this.a;
        }

        @Override  // com.google.common.collect.Y1
        public Object[] toArray() {
            return this.p0();
        }

        @Override  // com.google.common.collect.Y1
        public Object[] toArray(Object[] arr_object) {
            return this.q0(arr_object);
        }

        @Override  // com.google.common.collect.p2
        public String toString() {
            return this.r0();
        }
    }

    private transient Map a;
    @RetainedWith
    transient a b;
    @P1.b
    @o3.a
    private transient Set c;
    @P1.b
    @o3.a
    private transient Set d;
    @P1.b
    @o3.a
    private transient Set e;
    @J1.c
    @J1.d
    private static final long f;

    private a(Map map0, a a0) {
        this.a = map0;
        this.b = a0;
    }

    a(Map map0, a a0, com.google.common.collect.a.a a$a0) {
        this(map0, a0);
    }

    a(Map map0, Map map1) {
        this.D0(map0, map1);
    }

    @o3.a
    private Object A0(@d4 Object object0, @d4 Object object1, boolean z) {
        this.v0(object0);
        this.w0(object1);
        boolean z1 = this.containsKey(object0);
        if(z1 && B.a(object1, this.get(object0))) {
            return object1;
        }
        if(z) {
            this.Q1().remove(object1);
        }
        else {
            H.u(!this.containsValue(object1), "value already present: %s", object1);
        }
        Object object2 = this.a.put(object0, object1);
        this.G0(object0, z1, object2, object1);
        return object2;
    }

    @O1.a
    @d4
    private Object B0(@o3.a Object object0) {
        Object object1 = W3.a(this.a.remove(object0));
        this.C0(object1);
        return object1;
    }

    private void C0(@d4 Object object0) {
        this.b.a.remove(object0);
    }

    void D0(Map map0, Map map1) {
        boolean z = false;
        H.g0(this.a == null);
        H.g0(this.b == null);
        H.d(map0.isEmpty());
        H.d(map1.isEmpty());
        if(map0 != map1) {
            z = true;
        }
        H.d(z);
        this.a = map0;
        this.b = this.z0(map1);
    }

    void F0(a a0) {
        this.b = a0;
    }

    private void G0(@d4 Object object0, boolean z, @o3.a Object object1, @d4 Object object2) {
        if(z) {
            this.C0(object1);
        }
        this.b.a.put(object2, object0);
    }

    @Override  // com.google.common.collect.j2
    protected Object K() {
        return this.M();
    }

    @Override  // com.google.common.collect.j2
    protected Map M() {
        return this.a;
    }

    @Override  // com.google.common.collect.x
    public x Q1() {
        return this.b;
    }

    @Override  // com.google.common.collect.x
    @O1.a
    @o3.a
    public Object a1(@d4 Object object0, @d4 Object object1) {
        return this.A0(object0, object1, true);
    }

    @Override  // com.google.common.collect.j2
    public void clear() {
        this.a.clear();
        this.b.a.clear();
    }

    @Override  // com.google.common.collect.j2
    public boolean containsValue(@o3.a Object object0) {
        return this.b.containsKey(object0);
    }

    @Override  // com.google.common.collect.j2
    public Set entrySet() {
        Set set0 = this.e;
        if(set0 == null) {
            set0 = new c(this, null);
            this.e = set0;
        }
        return set0;
    }

    @Override  // com.google.common.collect.j2
    public Set keySet() {
        Set set0 = this.c;
        if(set0 == null) {
            set0 = new e(this, null);
            this.c = set0;
        }
        return set0;
    }

    @Override  // com.google.common.collect.j2, com.google.common.collect.x
    @O1.a
    @o3.a
    public Object put(@d4 Object object0, @d4 Object object1) {
        return this.A0(object0, object1, false);
    }

    @Override  // com.google.common.collect.j2, com.google.common.collect.x
    public void putAll(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.j2
    @O1.a
    @o3.a
    public Object remove(@o3.a Object object0) {
        return this.containsKey(object0) ? this.B0(object0) : null;
    }

    @O1.a
    @d4
    Object v0(@d4 Object object0) {
        return object0;
    }

    @Override  // com.google.common.collect.j2, com.google.common.collect.x
    public Collection values() {
        return this.values();
    }

    @Override  // com.google.common.collect.x
    public Set values() {
        Set set0 = this.d;
        if(set0 == null) {
            set0 = new f(this, null);
            this.d = set0;
        }
        return set0;
    }

    @O1.a
    @d4
    Object w0(@d4 Object object0) {
        return object0;
    }

    Iterator y0() {
        class com.google.common.collect.a.a implements Iterator {
            @o3.a
            Map.Entry a;
            final Iterator b;
            final a c;

            com.google.common.collect.a.a(Iterator iterator0) {
                this.b = iterator0;
                super();
            }

            public Map.Entry a() {
                Object object0 = this.b.next();
                this.a = (Map.Entry)object0;
                return new com.google.common.collect.a.b(a.this, ((Map.Entry)object0));
            }

            @Override
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                Map.Entry map$Entry0 = this.a;
                if(map$Entry0 == null) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Object object0 = map$Entry0.getValue();
                this.b.remove();
                a.this.C0(object0);
                this.a = null;
            }
        }

        return new com.google.common.collect.a.a(this, this.a.entrySet().iterator());
    }

    a z0(Map map0) {
        return new d(map0, this);
    }
}

