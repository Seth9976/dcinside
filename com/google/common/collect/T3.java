package com.google.common.collect;

import J1.b;
import J1.e;
import com.google.common.base.B;
import com.google.common.base.H;
import j..util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o3.a;

@b(emulated = true, serializable = true)
@C1
public final class t3 extends u3 {
    @e
    static final class com.google.common.collect.t3.b extends L2 implements d {
        final int d;
        @a
        com.google.common.collect.t3.b e;
        @a
        private d f;
        @a
        private d g;
        @a
        private com.google.common.collect.t3.b h;
        @a
        private com.google.common.collect.t3.b i;

        com.google.common.collect.t3.b(@d4 Object object0, @d4 Object object1, int v, @a com.google.common.collect.t3.b t3$b0) {
            super(object0, object1);
            this.d = v;
            this.e = t3$b0;
        }

        @Override  // com.google.common.collect.t3$d
        public d a() {
            d t3$d0 = this.f;
            Objects.requireNonNull(t3$d0);
            return t3$d0;
        }

        @Override  // com.google.common.collect.t3$d
        public void b(d t3$d0) {
            this.g = t3$d0;
        }

        @Override  // com.google.common.collect.t3$d
        public void c(d t3$d0) {
            this.f = t3$d0;
        }

        @Override  // com.google.common.collect.t3$d
        public d d() {
            d t3$d0 = this.g;
            Objects.requireNonNull(t3$d0);
            return t3$d0;
        }

        public com.google.common.collect.t3.b e() {
            com.google.common.collect.t3.b t3$b0 = this.h;
            Objects.requireNonNull(t3$b0);
            return t3$b0;
        }

        public com.google.common.collect.t3.b f() {
            com.google.common.collect.t3.b t3$b0 = this.i;
            Objects.requireNonNull(t3$b0);
            return t3$b0;
        }

        boolean g(@a Object object0, int v) {
            return this.d == v && B.a(this.getValue(), object0);
        }

        static com.google.common.collect.t3.b h() {
            return new com.google.common.collect.t3.b(null, null, 0, null);
        }

        public void i(com.google.common.collect.t3.b t3$b0) {
            this.h = t3$b0;
        }

        public void j(com.google.common.collect.t3.b t3$b0) {
            this.i = t3$b0;
        }
    }

    @e
    final class c extends k implements d {
        @d4
        private final Object a;
        @e
        com.google.common.collect.t3.b[] b;
        private int c;
        private int d;
        private d e;
        private d f;
        final t3 g;

        c(@d4 Object object0, int v) {
            this.c = 0;
            this.d = 0;
            this.a = object0;
            this.e = this;
            this.f = this;
            this.b = new com.google.common.collect.t3.b[F2.a(v, 1.0)];
        }

        @Override  // com.google.common.collect.t3$d
        public d a() {
            return this.f;
        }

        @Override
        public boolean add(@d4 Object object0) {
            int v = F2.d(object0);
            int v1 = this.i() & v;
            com.google.common.collect.t3.b t3$b0 = this.b[v1];
            for(com.google.common.collect.t3.b t3$b1 = t3$b0; t3$b1 != null; t3$b1 = t3$b1.e) {
                if(t3$b1.g(object0, v)) {
                    return false;
                }
            }
            com.google.common.collect.t3.b t3$b2 = new com.google.common.collect.t3.b(this.a, object0, v, t3$b0);
            t3.c0(this.f, t3$b2);
            t3.c0(t3$b2, this);
            t3.b0(t3.this.k.e(), t3$b2);
            t3.b0(t3$b2, t3.this.k);
            this.b[v1] = t3$b2;
            ++this.c;
            ++this.d;
            this.j();
            return true;
        }

        @Override  // com.google.common.collect.t3$d
        public void b(d t3$d0) {
            this.e = t3$d0;
        }

        @Override  // com.google.common.collect.t3$d
        public void c(d t3$d0) {
            this.f = t3$d0;
        }

        @Override
        public void clear() {
            Arrays.fill(this.b, null);
            this.c = 0;
            for(d t3$d0 = this.e; t3$d0 != this; t3$d0 = t3$d0.d()) {
                t3.Y(((com.google.common.collect.t3.b)t3$d0));
            }
            t3.c0(this, this);
            ++this.d;
        }

        @Override
        public boolean contains(@a Object object0) {
            int v = F2.d(object0);
            for(com.google.common.collect.t3.b t3$b0 = this.b[this.i() & v]; t3$b0 != null; t3$b0 = t3$b0.e) {
                if(t3$b0.g(object0, v)) {
                    return true;
                }
            }
            return false;
        }

        @Override  // com.google.common.collect.t3$d
        public d d() {
            return this.e;
        }

        private int i() {
            return this.b.length - 1;
        }

        @Override
        public Iterator iterator() {
            class com.google.common.collect.t3.c.a implements Iterator {
                d a;
                @a
                com.google.common.collect.t3.b b;
                int c;
                final c d;

                com.google.common.collect.t3.c.a() {
                    this.a = t3$c0.e;
                    this.c = t3$c0.d;
                }

                private void a() {
                    if(c.this.d != this.c) {
                        throw new ConcurrentModificationException();
                    }
                }

                @Override
                public boolean hasNext() {
                    this.a();
                    return this.a != c.this;
                }

                @Override
                @d4
                public Object next() {
                    if(!this.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    com.google.common.collect.t3.b t3$b0 = (com.google.common.collect.t3.b)this.a;
                    this.b = t3$b0;
                    this.a = t3$b0.d();
                    return t3$b0.getValue();
                }

                @Override
                public void remove() {
                    this.a();
                    H.h0(this.b != null, "no calls to next() since the last call to remove()");
                    c.this.remove(this.b.getValue());
                    this.c = c.this.d;
                    this.b = null;
                }
            }

            return new com.google.common.collect.t3.c.a(this);
        }

        private void j() {
            if(F2.b(this.c, this.b.length, 1.0)) {
                int v = this.b.length * 2;
                com.google.common.collect.t3.b[] arr_t3$b = new com.google.common.collect.t3.b[v];
                this.b = arr_t3$b;
                for(d t3$d0 = this.e; t3$d0 != this; t3$d0 = t3$d0.d()) {
                    int v1 = ((com.google.common.collect.t3.b)t3$d0).d & v - 1;
                    ((com.google.common.collect.t3.b)t3$d0).e = arr_t3$b[v1];
                    arr_t3$b[v1] = (com.google.common.collect.t3.b)t3$d0;
                }
            }
        }

        @Override
        @O1.a
        public boolean remove(@a Object object0) {
            int v = F2.d(object0);
            int v1 = this.i() & v;
            com.google.common.collect.t3.b t3$b0 = this.b[v1];
            com.google.common.collect.t3.b t3$b1 = null;
            while(t3$b0 != null) {
                if(t3$b0.g(object0, v)) {
                    if(t3$b1 == null) {
                        this.b[v1] = t3$b0.e;
                    }
                    else {
                        t3$b1.e = t3$b0.e;
                    }
                    t3.Z(t3$b0);
                    t3.Y(t3$b0);
                    --this.c;
                    ++this.d;
                    return true;
                }
                t3$b1 = t3$b0;
                t3$b0 = t3$b0.e;
            }
            return false;
        }

        @Override
        public int size() {
            return this.c;
        }
    }

    interface d {
        d a();

        void b(d arg1);

        void c(d arg1);

        d d();
    }

    @e
    transient int j;
    private transient com.google.common.collect.t3.b k;
    private static final int l = 16;
    private static final int m = 2;
    @e
    static final double n = 1.0;
    @J1.c
    @J1.d
    private static final long o = 1L;

    private t3(int v, int v1) {
        super(f4.f(v));
        this.j = 2;
        c1.b(v1, "expectedValuesPerKey");
        this.j = v1;
        com.google.common.collect.t3.b t3$b0 = com.google.common.collect.t3.b.h();
        this.k = t3$b0;
        t3.b0(t3$b0, t3$b0);
    }

    @Override  // com.google.common.collect.e
    Collection A(@d4 Object object0) {
        return new c(this, object0, this.j);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public S3 E() {
        return super.E();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean G(@d4 Object object0, Iterable iterable0) {
        return super.G(object0, iterable0);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean J(@a Object object0, @a Object object1) {
        return super.J(object0, object1);
    }

    @Override  // com.google.common.collect.m
    Set O() {
        return f4.g(this.j);
    }

    public static t3 V() {
        return new t3(16, 2);
    }

    public static t3 W(int v, int v1) {
        return new t3(D3.o(v), D3.o(v1));
    }

    public static t3 X(M3 m30) {
        t3 t30 = t3.W(m30.keySet().size(), 2);
        t30.m(m30);
        return t30;
    }

    private static void Y(com.google.common.collect.t3.b t3$b0) {
        t3.b0(t3$b0.e(), t3$b0.f());
    }

    private static void Z(d t3$d0) {
        t3.c0(t3$d0.a(), t3$d0.d());
    }

    @Override  // com.google.common.collect.m
    @O1.a
    public Set a(@a Object object0) {
        return super.a(object0);
    }

    @J1.c
    @J1.d
    private void a0(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        com.google.common.collect.t3.b t3$b0 = com.google.common.collect.t3.b.h();
        this.k = t3$b0;
        t3.b0(t3$b0, t3$b0);
        this.j = 2;
        int v = objectInputStream0.readInt();
        Map map0 = f4.f(12);
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = objectInputStream0.readObject();
            map0.put(object0, this.A(object0));
        }
        int v3 = objectInputStream0.readInt();
        for(int v1 = 0; v1 < v3; ++v1) {
            Object object1 = objectInputStream0.readObject();
            Object object2 = objectInputStream0.readObject();
            Collection collection0 = (Collection)map0.get(object1);
            Objects.requireNonNull(collection0);
            collection0.add(object2);
        }
        this.K(map0);
    }

    @Override  // com.google.common.collect.m
    @O1.a
    public Collection b(@d4 Object object0, Iterable iterable0) {
        return this.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.m
    @O1.a
    public Set b(@d4 Object object0, Iterable iterable0) {
        return super.b(object0, iterable0);
    }

    private static void b0(com.google.common.collect.t3.b t3$b0, com.google.common.collect.t3.b t3$b1) {
        t3$b0.j(t3$b1);
        t3$b1.i(t3$b0);
    }

    @Override  // com.google.common.collect.m
    public Map c() {
        return super.c();
    }

    private static void c0(d t3$d0, d t3$d1) {
        t3$d0.b(t3$d1);
        t3$d1.c(t3$d0);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public void clear() {
        super.clear();
        t3.b0(this.k, this.k);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public boolean containsKey(@a Object object0) {
        return super.containsKey(object0);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean containsValue(@a Object object0) {
        return super.containsValue(object0);
    }

    @J1.c
    @J1.d
    private void e0(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeInt(this.keySet().size());
        for(Object object0: this.keySet()) {
            objectOutputStream0.writeObject(object0);
        }
        objectOutputStream0.writeInt(this.size());
        for(Object object1: this.h()) {
            objectOutputStream0.writeObject(((Map.Entry)object1).getKey());
            objectOutputStream0.writeObject(((Map.Entry)object1).getValue());
        }
    }

    @Override  // com.google.common.collect.m
    public boolean equals(@a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.m
    public Set get(@d4 Object object0) {
        return super.get(object0);
    }

    @Override  // com.google.common.collect.m
    public Collection h() {
        return this.h();
    }

    @Override  // com.google.common.collect.m
    public Set h() {
        return super.h();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override  // com.google.common.collect.e
    Iterator k() {
        class com.google.common.collect.t3.a implements Iterator {
            com.google.common.collect.t3.b a;
            @a
            com.google.common.collect.t3.b b;
            final t3 c;

            com.google.common.collect.t3.a() {
                this.a = t30.k.f();
            }

            public Map.Entry a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                com.google.common.collect.t3.b t3$b0 = this.a;
                this.b = t3$b0;
                this.a = t3$b0.f();
                return t3$b0;
            }

            @Override
            public boolean hasNext() {
                return this.a != t3.this.k;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                H.h0(this.b != null, "no calls to next() since the last call to remove()");
                t3.this.remove(this.b.getKey(), this.b.getValue());
                this.b = null;
            }
        }

        return new com.google.common.collect.t3.a(this);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public Set keySet() {
        return super.keySet();
    }

    @Override  // com.google.common.collect.e
    Iterator l() {
        return D3.R0(this.k());
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean m(M3 m30) {
        return super.m(m30);
    }

    @Override  // com.google.common.collect.m
    @O1.a
    public boolean put(@d4 Object object0, @d4 Object object1) {
        return super.put(object0, object1);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean remove(@a Object object0, @a Object object1) {
        return super.remove(object0, object1);
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public int size() {
        return super.size();
    }

    @Override  // com.google.common.collect.h
    public String toString() {
        return super.toString();
    }

    @Override  // com.google.common.collect.e, com.google.common.collect.M3
    public Collection values() {
        return super.values();
    }

    @Override  // com.google.common.collect.m
    Collection y() {
        return this.O();
    }
}

