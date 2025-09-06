package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

@b(emulated = true)
@C1
final class l4 extends u1 {
    @c
    @d
    static final class com.google.common.collect.l4.d implements Serializable {
        final h4 a;
        final B1 b;

        private com.google.common.collect.l4.d(h4 h40, B1 b10) {
            this.a = h40;
            this.b = b10;
        }

        com.google.common.collect.l4.d(h4 h40, B1 b10, a l4$a0) {
            this(h40, b10);
        }

        private Object a() {
            return new l4(this.a, this.b);
        }
    }

    private final h4 l;
    private static final long m;

    l4(h4 h40, B1 b10) {
        super(b10);
        this.l = h40;
    }

    @Override  // com.google.common.collect.u1
    k3 B0(Object object0, boolean z, Object object1, boolean z1) {
        return this.X0(((Comparable)object0), z, ((Comparable)object1), z1);
    }

    @Override  // com.google.common.collect.u1
    k3 E0(Object object0, boolean z) {
        return this.e1(((Comparable)object0), z);
    }

    @Override  // com.google.common.collect.u1
    u1 Q0(Comparable comparable0, boolean z) {
        return this.k1(h4.J(comparable0, y.b(z)));
    }

    @Override  // com.google.common.collect.u1
    public u1 R0(u1 u10) {
        H.E(u10);
        H.d(this.k.equals(u10.k));
        if(u10.isEmpty()) {
            return u10;
        }
        Comparable comparable0 = (Comparable)c4.K().D(this.h1(), ((Comparable)u10.first()));
        Comparable comparable1 = (Comparable)c4.K().H(this.l1(), ((Comparable)u10.last()));
        return comparable0.compareTo(comparable1) <= 0 ? u1.N0(h4.f(comparable0, comparable1), this.k) : new D1(this.k);
    }

    @Override  // com.google.common.collect.u1
    public h4 S0() {
        return this.U0(y.c, y.c);
    }

    @Override  // com.google.common.collect.u1
    public h4 U0(y y0, y y1) {
        return h4.k(this.l.a.p(y0, this.k), this.l.b.r(y1, this.k));
    }

    @Override  // com.google.common.collect.u1
    u1 X0(Comparable comparable0, boolean z, Comparable comparable1, boolean z1) {
        return comparable0.compareTo(comparable1) == 0 && !z && !z1 ? new D1(this.k) : this.k1(h4.D(comparable0, y.b(z), comparable1, y.b(z1)));
    }

    @Override  // com.google.common.collect.k3
    @c
    public u5 Y() {
        class com.google.common.collect.l4.b extends l {
            final Comparable b;
            final l4 c;

            com.google.common.collect.l4.b(Comparable comparable0) {
                super(comparable0);
                this.b = l40.h1();
            }

            @Override  // com.google.common.collect.l
            @o3.a
            protected Object a(Object object0) {
                return this.b(((Comparable)object0));
            }

            // 去混淆评级： 低(20)
            @o3.a
            protected Comparable b(Comparable comparable0) {
                return l4.g1(comparable0, this.b) ? null : l4.this.k.i(comparable0);
            }
        }

        return new com.google.common.collect.l4.b(this, this.l1());
    }

    @Override  // com.google.common.collect.K2
    public boolean contains(@o3.a Object object0) {
        if(object0 == null) {
            return false;
        }
        try {
            return this.l.i(((Comparable)object0));
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection collection0) {
        return d1.b(this, collection0);
    }

    @Override  // com.google.common.collect.k3
    @c
    public Iterator descendingIterator() {
        return this.Y();
    }

    @Override  // com.google.common.collect.u1
    u1 e1(Comparable comparable0, boolean z) {
        return this.k1(h4.l(comparable0, y.b(z)));
    }

    @Override  // com.google.common.collect.a3
    public boolean equals(@o3.a Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof l4) || !this.k.equals(((l4)object0).k) ? super.equals(object0) : this.h1().equals(((l4)object0).h1()) && this.l1().equals(((l4)object0).l1());
    }

    @Override  // com.google.common.collect.k3
    public Object first() {
        return this.h1();
    }

    @Override  // com.google.common.collect.u1
    k3 g0(Object object0, boolean z) {
        return this.Q0(((Comparable)object0), z);
    }

    private static boolean g1(Comparable comparable0, @o3.a Comparable comparable1) {
        return comparable1 != null && h4.h(comparable0, comparable1) == 0;
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return false;
    }

    public Comparable h1() {
        Comparable comparable0 = this.l.a.l(this.k);
        Objects.requireNonNull(comparable0);
        return comparable0;
    }

    @Override  // com.google.common.collect.a3
    public int hashCode() {
        return D4.k(this);
    }

    @Override  // com.google.common.collect.k3
    public u5 i() {
        class a extends l {
            final Comparable b;
            final l4 c;

            a(Comparable comparable0) {
                super(comparable0);
                this.b = l40.l1();
            }

            @Override  // com.google.common.collect.l
            @o3.a
            protected Object a(Object object0) {
                return this.b(((Comparable)object0));
            }

            // 去混淆评级： 低(20)
            @o3.a
            protected Comparable b(Comparable comparable0) {
                return l4.g1(comparable0, this.b) ? null : l4.this.k.g(comparable0);
            }
        }

        return new a(this, this.h1());
    }

    @Override  // com.google.common.collect.k3
    @c
    int indexOf(@o3.a Object object0) {
        if(this.contains(object0)) {
            Comparable comparable0 = this.h1();
            Objects.requireNonNull(object0);
            return (int)this.k.b(comparable0, ((Comparable)object0));
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override  // com.google.common.collect.k3
    public Iterator iterator() {
        return this.i();
    }

    @c
    @d
    private void j(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override  // com.google.common.collect.u1
    @c
    @d
    Object k() {
        return new com.google.common.collect.l4.d(this.l, this.k, null);
    }

    private u1 k1(h4 h40) {
        return this.l.u(h40) ? u1.N0(this.l.s(h40), this.k) : new D1(this.k);
    }

    public Comparable l1() {
        Comparable comparable0 = this.l.b.j(this.k);
        Objects.requireNonNull(comparable0);
        return comparable0;
    }

    @Override  // com.google.common.collect.k3
    public Object last() {
        return this.l1();
    }

    @Override
    public int size() {
        Comparable comparable0 = this.h1();
        Comparable comparable1 = this.l1();
        long v = this.k.b(comparable0, comparable1);
        return v < 0x7FFFFFFFL ? ((int)v) + 1 : 0x7FFFFFFF;
    }

    @Override  // com.google.common.collect.a3
    O2 z() {
        class com.google.common.collect.l4.c extends H2 {
            final l4 e;

            @Override  // com.google.common.collect.H2
            K2 U() {
                return this.V();
            }

            k3 V() {
                return l4.this;
            }

            public Comparable W(int v) {
                H.C(v, this.size());
                Comparable comparable0 = l4.this.h1();
                return l4.this.k.h(comparable0, ((long)v));
            }

            @Override
            public Object get(int v) {
                return this.W(v);
            }

            @Override  // com.google.common.collect.H2
            @c
            @d
            Object k() {
                return super.k();
            }
        }

        return this.k.a ? new com.google.common.collect.l4.c(this) : super.z();
    }
}

