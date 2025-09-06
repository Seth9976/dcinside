package org.bson;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.bson.io.f;

public class m0 extends n implements Serializable {
    static class a extends AbstractList {
        class org.bson.m0.a.a implements Iterator {
            private int a;
            private p b;
            private int c;
            final a d;

            org.bson.m0.a.a() {
                this(0);
            }

            org.bson.m0.a.a(int v) {
                this.a = 0;
                this.c = 0;
                this.d(v);
            }

            public int a() {
                return this.a;
            }

            public Z b() {
                while(this.a > this.c && this.b.T2() != X.b) {
                    this.b.g1();
                    this.b.Y1();
                    ++this.c;
                }
                if(this.b.T2() != X.b) {
                    this.b.g1();
                    int v = this.a + 1;
                    this.a = v;
                    this.c = v;
                    return o0.a(a.this.b, this.b);
                }
                this.b.close();
                throw new NoSuchElementException();
            }

            public void c(int v) {
                this.a = v;
            }

            void d(int v) {
                this.a = v;
                this.c = 0;
                p p0 = this.b;
                if(p0 != null) {
                    p0.close();
                }
                p p1 = a.this.g();
                this.b = p1;
                p1.g0();
            }

            @Override
            public boolean hasNext() {
                boolean z = this.a != a.this.size();
                if(!z) {
                    this.b.close();
                }
                return z;
            }

            @Override
            public Object next() {
                return this.b();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }
        }

        class b extends org.bson.m0.a.a implements ListIterator {
            final a e;

            b(int v) {
                super(v);
            }

            @Override
            public void add(Object object0) {
                this.e(((Z)object0));
            }

            public void e(Z z0) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            public Z f() {
                try {
                    int v = this.previousIndex();
                    Z z0 = a.this.h(v);
                    this.d(this.previousIndex());
                    return z0;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    throw new NoSuchElementException();
                }
            }

            public void g(Z z0) {
                throw new UnsupportedOperationException("RawBsonArray instances are immutable");
            }

            @Override
            public boolean hasPrevious() {
                return this.a() != 0;
            }

            @Override
            public int nextIndex() {
                return this.a();
            }

            @Override
            public Object previous() {
                return this.f();
            }

            @Override
            public int previousIndex() {
                return this.a() - 1;
            }

            @Override
            public void set(Object object0) {
                this.g(((Z)object0));
            }
        }

        private Integer a;
        private final byte[] b;
        private final int c;
        private final int d;
        private static final int e = 5;

        a(byte[] arr_b, int v, int v1) {
            R3.a.e("bytes", arr_b);
            boolean z = false;
            R3.a.d("offset >= 0", v >= 0);
            R3.a.d("offset < bytes.length", v < arr_b.length);
            R3.a.d("length <= bytes.length - offset", v1 <= arr_b.length - v);
            if(v1 >= 5) {
                z = true;
            }
            R3.a.d("length >= 5", z);
            this.b = arr_b;
            this.c = v;
            this.d = v1;
        }

        private p g() {
            return new p(new f(this.i()));
        }

        @Override
        public Object get(int v) {
            return this.h(v);
        }

        public Z h(int v) {
            if(v < 0) {
                throw new IndexOutOfBoundsException();
            }
            try(p p0 = this.g()) {
                p0.g0();
                for(int v1 = 0; true; ++v1) {
                    if(p0.T2() == X.b) {
                        break;
                    }
                    p0.g1();
                    if(v1 == v) {
                        return o0.a(this.b, p0);
                    }
                    p0.Y1();
                }
                p0.E1();
            }
            throw new IndexOutOfBoundsException();
        }

        c0 i() {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(this.b, this.c, this.d);
            byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
            return new d0(byteBuffer0);
        }

        @Override
        public Iterator iterator() {
            return new org.bson.m0.a.a(this);
        }

        @Override
        public ListIterator listIterator() {
            return new b(this, 0);
        }

        @Override
        public ListIterator listIterator(int v) {
            return new b(this, v);
        }

        @Override
        public int size() {
            int v;
            Integer integer0 = this.a;
            if(integer0 != null) {
                return (int)integer0;
            }
            try(p p0 = this.g()) {
                p0.g0();
                v = 0;
                while(true) {
                    if(p0.T2() == X.b) {
                        break;
                    }
                    ++v;
                    p0.n0();
                    p0.Y1();
                }
                p0.E1();
            }
            Integer integer1 = v;
            this.a = integer1;
            return (int)integer1;
        }
    }

    static class org.bson.m0.b implements Serializable {
        private final byte[] a;
        private static final long b = 1L;

        org.bson.m0.b(byte[] arr_b, int v, int v1) {
            if(arr_b.length == v1) {
                this.a = arr_b;
                return;
            }
            byte[] arr_b1 = new byte[v1];
            this.a = arr_b1;
            System.arraycopy(arr_b, v, arr_b1, 0, v1);
        }

        private Object a() {
            return new m0(this.a);
        }
    }

    private final transient a b;
    private static final long c = 2L;
    private static final String d = "RawBsonArray instances are immutable";

    private m0(a m0$a0) {
        super(m0$a0, false);
        this.b = m0$a0;
    }

    public m0(byte[] arr_b) {
        this(((byte[])R3.a.e("bytes", arr_b)), 0, arr_b.length);
    }

    public m0(byte[] arr_b, int v, int v1) {
        this(new a(arr_b, v, v1));
    }

    @Override  // org.bson.n
    public void add(int v, Object object0) {
        this.j0(v, ((Z)object0));
    }

    @Override  // org.bson.n
    public boolean add(Object object0) {
        return this.k0(((Z)object0));
    }

    @Override  // org.bson.n
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public void clear() {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public Object clone() throws CloneNotSupportedException {
        return this.m0();
    }

    @Override  // org.bson.n
    public boolean equals(Object object0) {
        return super.equals(object0);
    }

    @Override  // org.bson.n
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // org.bson.n
    public void j0(int v, Z z0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public boolean k0(Z z0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public n m0() {
        return new m0(((byte[])this.b.b.clone()), this.b.c, this.b.d);
    }

    @Override  // org.bson.n
    public Z q0(int v) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public Z r0(int v, Z z0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public Object remove(int v) {
        return this.q0(v);
    }

    @Override  // org.bson.n
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    @Override  // org.bson.n
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("RawBsonArray instances are immutable");
    }

    c0 s0() {
        return this.b.i();
    }

    @Override  // org.bson.n
    public Object set(int v, Object object0) {
        return this.r0(v, ((Z)object0));
    }

    private void t0(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    private Object v0() {
        return new org.bson.m0.b(this.b.b, this.b.c, this.b.d);
    }
}

