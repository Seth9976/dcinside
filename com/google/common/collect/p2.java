package com.google.common.collect;

import J1.b;
import J1.d;
import O1.e;
import com.google.j2objc.annotations.RetainedWith;
import j..util.Objects;
import j..util.stream.Collector;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;

@b(emulated = true, serializable = true)
@C1
public class P2 extends U2 implements y3 {
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

        public P2 l() {
            return (P2)super.a();
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
            super.h(m30);
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
            super.k(object0, arr_object);
            return this;
        }
    }

    @P1.b
    @RetainedWith
    @o3.a
    private transient P2 i;
    @J1.c
    @d
    private static final long j;

    P2(Q2 q20, int v) {
        super(q20, v);
    }

    @Override  // com.google.common.collect.U2
    public K2 A(Object object0) {
        return this.X(object0);
    }

    @Override  // com.google.common.collect.U2
    public U2 B() {
        return this.Y();
    }

    @Override  // com.google.common.collect.U2
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public K2 O(@o3.a Object object0) {
        return this.i0(object0);
    }

    @Override  // com.google.common.collect.U2
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public K2 P(Object object0, Iterable iterable0) {
        return this.j0(object0, iterable0);
    }

    public static a S() {
        return new a();
    }

    public static P2 T(M3 m30) {
        if(m30.isEmpty()) {
            return P2.a0();
        }
        return !(m30 instanceof P2) || ((P2)m30).C() ? P2.W(m30.c().entrySet(), null) : ((P2)m30);
    }

    public static P2 U(Iterable iterable0) {
        return new a().s(iterable0).l();
    }

    @G2
    static Collector V(Function function0, Function function1) {
        return a1.D(function0, function1);
    }

    static P2 W(Collection collection0, @o3.a Comparator comparator0) {
        if(collection0.isEmpty()) {
            return P2.a0();
        }
        com.google.common.collect.Q2.b q2$b0 = new com.google.common.collect.Q2.b(collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Collection collection1 = (Collection)((Map.Entry)object0).getValue();
            O2 o20 = comparator0 == null ? O2.r(collection1) : O2.Q(comparator0, collection1);
            if(!o20.isEmpty()) {
                q2$b0.i(object1, o20);
                v += o20.size();
            }
        }
        return new P2(q2$b0.d(), v);
    }

    public O2 X(Object object0) {
        O2 o20 = (O2)this.f.get(object0);
        return o20 == null ? O2.A() : o20;
    }

    public P2 Y() {
        P2 p20 = this.i;
        if(p20 == null) {
            p20 = this.Z();
            this.i = p20;
        }
        return p20;
    }

    private P2 Z() {
        a p2$a0 = P2.S();
        u5 u50 = this.x().i();
        while(u50.hasNext()) {
            Object object0 = u50.next();
            p2$a0.p(((Map.Entry)object0).getValue(), ((Map.Entry)object0).getKey());
        }
        P2 p20 = p2$a0.l();
        p20.i = this;
        return p20;
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.y3
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection a(@o3.a Object object0) {
        return this.i0(object0);
    }

    @Override  // com.google.common.collect.y3
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public List a(@o3.a Object object0) {
        return this.i0(object0);
    }

    public static P2 a0() {
        return E1.k;
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.y3
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection b(Object object0, Iterable iterable0) {
        return this.j0(object0, iterable0);
    }

    @Override  // com.google.common.collect.y3
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public List b(Object object0, Iterable iterable0) {
        return this.j0(object0, iterable0);
    }

    public static P2 b0(Object object0, Object object1) {
        a p2$a0 = P2.S();
        p2$a0.p(object0, object1);
        return p2$a0.l();
    }

    public static P2 c0(Object object0, Object object1, Object object2, Object object3) {
        a p2$a0 = P2.S();
        p2$a0.p(object0, object1);
        p2$a0.p(object2, object3);
        return p2$a0.l();
    }

    public static P2 e0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        a p2$a0 = P2.S();
        p2$a0.p(object0, object1);
        p2$a0.p(object2, object3);
        p2$a0.p(object4, object5);
        return p2$a0.l();
    }

    public static P2 f0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        a p2$a0 = P2.S();
        p2$a0.p(object0, object1);
        p2$a0.p(object2, object3);
        p2$a0.p(object4, object5);
        p2$a0.p(object6, object7);
        return p2$a0.l();
    }

    public static P2 g0(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        a p2$a0 = P2.S();
        p2$a0.p(object0, object1);
        p2$a0.p(object2, object3);
        p2$a0.p(object4, object5);
        p2$a0.p(object6, object7);
        p2$a0.p(object8, object9);
        return p2$a0.l();
    }

    @Override  // com.google.common.collect.U2, com.google.common.collect.y3
    public Collection get(Object object0) {
        return this.X(object0);
    }

    @Override  // com.google.common.collect.y3
    public List get(Object object0) {
        return this.X(object0);
    }

    @J1.c
    @d
    private void h0(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        Q2 q20;
        objectInputStream0.defaultReadObject();
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
            com.google.common.collect.O2.a o2$a0 = O2.n();
            for(int v4 = 0; v4 < v3; ++v4) {
                Object object1 = objectInputStream0.readObject();
                Objects.requireNonNull(object1);
                o2$a0.j(object1);
            }
            q2$b0.i(object0, o2$a0.n());
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
    }

    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public final O2 i0(@o3.a Object object0) {
        throw new UnsupportedOperationException();
    }

    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public final O2 j0(Object object0, Iterable iterable0) {
        throw new UnsupportedOperationException();
    }

    @G2
    static Collector k0(Function function0, Function function1) {
        return a1.o0(function0, function1);
    }

    @J1.c
    @d
    private void m0(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        A4.j(this, objectOutputStream0);
    }
}

