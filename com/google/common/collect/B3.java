package com.google.common.collect;

import J1.b;
import J1.d;
import O1.e;
import com.google.common.base.H;
import com.google.common.base.z;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import j..util.Objects;
import j..util.stream.Collector;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

@b(emulated = true, serializable = true)
@C1
public class b3 extends U2 implements C4 {
    public static final class a extends c {
        @Override  // com.google.common.collect.U2$c
        public U2 a() {
            return this.l();
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        c b(c u2$c0) {
            return this.m(u2$c0);
        }

        @Override  // com.google.common.collect.U2$c
        Collection c() {
            return f4.h();
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c d(Comparator comparator0) {
            return this.n(comparator0);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c e(Comparator comparator0) {
            return this.o(comparator0);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c f(Object object0, Object object1) {
            return this.p(object0, object1);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c g(Map.Entry map$Entry0) {
            return this.q(map$Entry0);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c h(M3 m30) {
            return this.r(m30);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c i(Iterable iterable0) {
            return this.s(iterable0);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c j(Object object0, Iterable iterable0) {
            return this.t(object0, iterable0);
        }

        @Override  // com.google.common.collect.U2$c
        @O1.a
        public c k(Object object0, Object[] arr_object) {
            return this.u(object0, arr_object);
        }

        public b3 l() {
            Set set0 = this.a.entrySet();
            Comparator comparator0 = this.b;
            if(comparator0 != null) {
                set0 = c4.q(comparator0).N().w(set0);
            }
            return b3.Z(set0, this.c);
        }

        @O1.a
        a m(c u2$c0) {
            super.b(u2$c0);
            return this;
        }

        @O1.a
        public a n(Comparator comparator0) {
            super.d(comparator0);
            return this;
        }

        @O1.a
        public a o(Comparator comparator0) {
            super.e(comparator0);
            return this;
        }

        @O1.a
        public a p(Object object0, Object object1) {
            super.f(object0, object1);
            return this;
        }

        @O1.a
        public a q(Map.Entry map$Entry0) {
            super.g(map$Entry0);
            return this;
        }

        @O1.a
        public a r(M3 m30) {
            for(Object object0: m30.c().entrySet()) {
                this.t(((Map.Entry)object0).getKey(), ((Iterable)((Map.Entry)object0).getValue()));
            }
            return this;
        }

        @O1.a
        public a s(Iterable iterable0) {
            super.i(iterable0);
            return this;
        }

        @O1.a
        public a t(Object object0, Iterable iterable0) {
            super.j(object0, iterable0);
            return this;
        }

        @O1.a
        public a u(Object object0, Object[] arr_object) {
            return this.t(object0, Arrays.asList(arr_object));
        }
    }

    static final class com.google.common.collect.b3.b extends a3 {
        @Weak
        private final transient b3 h;

        com.google.common.collect.b3.b(b3 b30) {
            this.h = b30;
        }

        @Override  // com.google.common.collect.K2
        public boolean contains(@o3.a Object object0) {
            if(object0 instanceof Map.Entry) {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                return this.h.J(object1, object2);
            }
            return false;
        }

        @Override  // com.google.common.collect.K2
        boolean h() {
            return false;
        }

        @Override  // com.google.common.collect.a3
        public u5 i() {
            return this.h.y();
        }

        @Override  // com.google.common.collect.a3
        public Iterator iterator() {
            return this.i();
        }

        @Override  // com.google.common.collect.a3
        @J1.c
        @d
        Object k() {
            return super.k();
        }

        @Override
        public int size() {
            return this.h.size();
        }
    }

    @J1.c
    @d
    static final class com.google.common.collect.b3.c {
        static final com.google.common.collect.A4.b a;

        static {
            com.google.common.collect.b3.c.a = A4.a(b3.class, "emptySet");
        }
    }

    private final transient a3 i;
    @P1.b
    @RetainedWith
    @o3.a
    private transient b3 j;
    @P1.b
    @RetainedWith
    @o3.a
    private transient a3 k;
    @J1.c
    @d
    private static final long l;

    b3(Q2 q20, int v, @o3.a Comparator comparator0) {
        super(q20, v);
        this.i = b3.W(comparator0);
    }

    @Override  // com.google.common.collect.U2
    public K2 A(Object object0) {
        return this.a0(object0);
    }

    @Override  // com.google.common.collect.U2
    public U2 B() {
        return this.b0();
    }

    @Override  // com.google.common.collect.U2
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public K2 O(@o3.a Object object0) {
        return this.m0(object0);
    }

    @Override  // com.google.common.collect.U2
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public K2 P(Object object0, Iterable iterable0) {
        return this.n0(object0, iterable0);
    }

    public static a S() {
        return new a();
    }

    public static b3 T(M3 m30) {
        return b3.U(m30, null);
    }

    private static b3 U(M3 m30, @o3.a Comparator comparator0) {
        H.E(m30);
        if(m30.isEmpty() && comparator0 == null) {
            return b3.e0();
        }
        return !(m30 instanceof b3) || ((b3)m30).C() ? b3.Z(m30.c().entrySet(), comparator0) : ((b3)m30);
    }

    public static b3 V(Iterable iterable0) {
        return new a().s(iterable0).l();
    }

    private static a3 W(@o3.a Comparator comparator0) {
        return comparator0 == null ? a3.B() : k3.a0(comparator0);
    }

    public a3 X() {
        a3 a30 = this.k;
        if(a30 == null) {
            a30 = new com.google.common.collect.b3.b(this);
            this.k = a30;
        }
        return a30;
    }

    @G2
    static Collector Y(Function function0, Function function1) {
        return a1.E(function0, function1);
    }

    static b3 Z(Collection collection0, @o3.a Comparator comparator0) {
        if(collection0.isEmpty()) {
            return b3.e0();
        }
        com.google.common.collect.Q2.b q2$b0 = new com.google.common.collect.Q2.b(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            Object object1 = ((Map.Entry)object0).getKey();
            a3 a30 = b3.p0(comparator0, ((Collection)((Map.Entry)object0).getValue()));
            if(!a30.isEmpty()) {
                q2$b0.i(object1, a30);
                v += a30.size();
            }
        }
        return new b3(q2$b0.d(), v, comparator0);
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.C4
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection a(@o3.a Object object0) {
        return this.m0(object0);
    }

    @Override  // com.google.common.collect.C4
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public Set a(@o3.a Object object0) {
        return this.m0(object0);
    }

    public a3 a0(Object object0) {
        return (a3)z.a(((a3)this.f.get(object0)), this.i);
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.C4
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection b(Object object0, Iterable iterable0) {
        return this.n0(object0, iterable0);
    }

    @Override  // com.google.common.collect.C4
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public Set b(Object object0, Iterable iterable0) {
        return this.n0(object0, iterable0);
    }

    public b3 b0() {
        b3 b30 = this.j;
        if(b30 == null) {
            b30 = this.c0();
            this.j = b30;
        }
        return b30;
    }

    private b3 c0() {
        a b3$a0 = b3.S();
        u5 u50 = this.X().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            b3$a0.p(((Map.Entry)object0).getValue(), ((Map.Entry)object0).getKey());
        }
        b3 b30 = b3$a0.l();
        b30.j = this;
        return b30;
    }

    public static b3 e0() {
        return F1.m;
    }

    public static b3 f0(Object object0, Object object1) {
        a b3$a0 = b3.S();
        b3$a0.p(object0, object1);
        return b3$a0.l();
    }

    public static b3 g0(Object object0, Object object1, Object object2, Object object3) {
        a b3$a0 = b3.S();
        b3$a0.p(object0, object1);
        b3$a0.p(object2, object3);
        return b3$a0.l();
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.C4
    public Collection get(Object object0) {
        return this.a0(object0);
    }

    @Override  // com.google.common.collect.C4
    public Set get(Object object0) {
        return this.a0(object0);
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.C4
    public Collection h() {
        return this.X();
    }

    @Override  // com.google.common.collect.C4
    public Set h() {
        return this.X();
    }

    public static b3 h0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        a b3$a0 = b3.S();
        b3$a0.p(object0, object1);
        b3$a0.p(object2, object3);
        b3$a0.p(object4, object5);
        return b3$a0.l();
    }

    public static b3 i0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        a b3$a0 = b3.S();
        b3$a0.p(object0, object1);
        b3$a0.p(object2, object3);
        b3$a0.p(object4, object5);
        b3$a0.p(object6, object7);
        return b3$a0.l();
    }

    public static b3 j0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        a b3$a0 = b3.S();
        b3$a0.p(object0, object1);
        b3$a0.p(object2, object3);
        b3$a0.p(object4, object5);
        b3$a0.p(object6, object7);
        b3$a0.p(object8, object9);
        return b3$a0.l();
    }

    @J1.c
    @d
    private void k0(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        Q2 q20;
        objectInputStream0.defaultReadObject();
        Comparator comparator0 = (Comparator)objectInputStream0.readObject();
        int v = objectInputStream0.readInt();
        if(v < 0) {
            throw new InvalidObjectException("Invalid key count " + v);
        }
        com.google.common.collect.Q2.b q2$b0 = Q2.b();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = objectInputStream0.readObject();
            Objects.requireNonNull(object0);
            int v3 = objectInputStream0.readInt();
            if(v3 <= 0) {
                throw new InvalidObjectException("Invalid value count " + v3);
            }
            com.google.common.collect.a3.a a3$a0 = b3.q0(comparator0);
            for(int v4 = 0; v4 < v3; ++v4) {
                Object object1 = objectInputStream0.readObject();
                Objects.requireNonNull(object1);
                a3$a0.j(object1);
            }
            a3 a30 = a3$a0.o();
            if(a30.size() != v3) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object0);
            }
            q2$b0.i(object0, a30);
            v2 += v3;
        }
        try {
            q20 = q2$b0.d();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw (InvalidObjectException)new InvalidObjectException(illegalArgumentException0.getMessage()).initCause(illegalArgumentException0);
        }
        com.google.common.collect.U2.e.a.b(this, q20);
        com.google.common.collect.U2.e.b.a(this, v2);
        a3 a31 = b3.W(comparator0);
        com.google.common.collect.b3.c.a.b(this, a31);
    }

    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public final a3 m0(@o3.a Object object0) {
        throw new UnsupportedOperationException();
    }

    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public final a3 n0(Object object0, Iterable iterable0) {
        throw new UnsupportedOperationException();
    }

    @G2
    static Collector o0(Function function0, Function function1) {
        return a1.v0(function0, function1);
    }

    private static a3 p0(@o3.a Comparator comparator0, Collection collection0) {
        return comparator0 == null ? a3.u(collection0) : k3.R(comparator0, collection0);
    }

    private static com.google.common.collect.a3.a q0(@o3.a Comparator comparator0) {
        return comparator0 == null ? new com.google.common.collect.a3.a() : new com.google.common.collect.k3.a(comparator0);
    }

    // 去混淆评级： 低(20)
    @o3.a
    Comparator r() {
        return this.i instanceof k3 ? ((k3)this.i).comparator() : null;
    }

    @J1.c
    @d
    private void r0(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.r());
        A4.j(this, objectOutputStream0);
    }

    @Override  // com.google.common.collect.U2
    public K2 x() {
        return this.X();
    }
}

