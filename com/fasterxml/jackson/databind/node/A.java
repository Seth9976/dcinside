package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.o;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.util.C;
import j..util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class a extends f implements Serializable {
    private final List d;
    private static final long e = 1L;

    public a(m m0) {
        super(m0);
        this.d = new ArrayList();
    }

    public a(m m0, int v) {
        super(m0);
        this.d = new ArrayList(v);
    }

    public a(m m0, List list0) {
        super(m0);
        Objects.requireNonNull(list0, "Must not pass `null` for \'children\' argument");
        this.d = list0;
    }

    public a A3(int v, String s) {
        return s == null ? this.y2(v, this.k2()) : this.y2(v, this.v2(s));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p B0(String s) {
        return this.j3(s);
    }

    protected a B2(o o0, boolean z) {
        int v = o0.p();
        if(v < 0) {
            return null;
        }
        o o1 = o0.D();
        if(o1.y()) {
            a a0 = this.R();
            this.E2(v, a0);
            return a0;
        }
        if(z && o1.B()) {
            a a1 = this.R();
            this.E2(v, a1);
            return a1.B2(o1, true);
        }
        u u0 = this.y();
        this.E2(v, u0);
        return u0.z2(o1, z);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G D(int v) {
        return this.s1(v);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public List D0(String s, List list0) {
        for(Object object0: this.d) {
            list0 = ((p)object0).D0(s, list0);
        }
        return list0;
    }

    protected u D2(o o0, boolean z) {
        int v = o0.p();
        if(v < 0) {
            return null;
        }
        o o1 = o0.D();
        if(o1.y()) {
            u u0 = this.y();
            this.E2(v, u0);
            return u0;
        }
        if(z && o1.B()) {
            a a0 = this.R();
            this.E2(v, a0);
            return a0.D2(o1, true);
        }
        u u1 = this.y();
        this.E2(v, u1);
        return u1.B2(o1, z);
    }

    public a D3(int v, BigDecimal bigDecimal0) {
        return bigDecimal0 == null ? this.y2(v, this.k2()) : this.y2(v, this.b(bigDecimal0));
    }

    protected void E2(int v, p p0) {
        if(v >= this.size()) {
            if(v > 0x270F) {
                this.U1("Too big Array index (%d; max %d) to use for insert with `JsonPointer`", new Object[]{v, 0x270F});
            }
            while(v >= this.size()) {
                this.e3();
            }
        }
        this.P3(v, p0);
    }

    public a E3(int v, BigInteger bigInteger0) {
        return bigInteger0 == null ? this.y2(v, this.k2()) : this.y2(v, this.O(bigInteger0));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p F0(String s) {
        for(Object object0: this.d) {
            p p0 = ((p)object0).F0(s);
            if(p0 != null) {
                return p0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public a F2(double f) {
        return this.w2(this.m2(f));
    }

    public a F3(int v, short v1) {
        return this.y2(v, this.s2(v1));
    }

    @Override  // com.fasterxml.jackson.databind.p
    @Deprecated
    public p G1(String s) {
        return this.m4(s);
    }

    public a G2(float f) {
        return this.w2(this.n2(f));
    }

    public a G3(int v, boolean z) {
        return this.y2(v, this.f2(z));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public void H(k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(this, r.m));
        for(Object object0: this.d) {
            ((b)(((p)object0))).P(k0, i0);
        }
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public List H0(String s, List list0) {
        for(Object object0: this.d) {
            list0 = ((p)object0).H0(s, list0);
        }
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p H1(String s) {
        return this.n4(s);
    }

    public a H2(int v) {
        return this.w2(this.q2(v));
    }

    public a H3(int v, byte[] arr_b) {
        return arr_b == null ? this.J3(v) : this.y2(v, this.b2(arr_b));
    }

    public a I3(int v) {
        a a0 = this.R();
        this.y2(v, a0);
        return a0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public List J0(String s, List list0) {
        for(Object object0: this.d) {
            list0 = ((p)object0).J0(s, list0);
        }
        return list0;
    }

    public a J2(long v) {
        return this.w2(this.r2(v));
    }

    public a J3(int v) {
        return this.y2(v, this.k2());
    }

    public a K2(p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        this.w2(p0);
        return this;
    }

    public u K3(int v) {
        u u0 = this.y();
        this.y2(v, u0);
        return u0;
    }

    public a L3(int v, Object object0) {
        return object0 == null ? this.y2(v, this.k2()) : this.y2(v, this.d(object0));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public p M0(int v) {
        return v < 0 || v >= this.d.size() ? null : ((p)this.d.get(v));
    }

    public a M2(Boolean boolean0) {
        return boolean0 == null ? this.w2(this.k2()) : this.w2(this.f2(boolean0.booleanValue()));
    }

    public a M3(int v, C c0) {
        return c0 == null ? this.y2(v, this.k2()) : this.y2(v, this.I(c0));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public p N0(String s) [...] // Inlined contents

    public a N2(Double double0) {
        return double0 == null ? this.w2(this.k2()) : this.w2(this.m2(((double)double0)));
    }

    public p N3(int v) {
        return v < 0 || v >= this.d.size() ? null : ((p)this.d.remove(v));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.a;
    }

    public a O2(Float float0) {
        return float0 == null ? this.w2(this.k2()) : this.w2(this.n2(((float)float0)));
    }

    public a O3() {
        this.d.clear();
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public void P(k k0, I i0) throws IOException {
        List list0 = this.d;
        int v = list0.size();
        k0.C4(this, v);
        for(int v1 = 0; v1 < v; ++v1) {
            ((p)list0.get(v1)).P(k0, i0);
        }
        k0.n3();
    }

    public a P2(Integer integer0) {
        return integer0 == null ? this.w2(this.k2()) : this.w2(this.q2(((int)integer0)));
    }

    public p P3(int v, p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        if(v < 0 || v >= this.d.size()) {
            throw new IndexOutOfBoundsException("Illegal index " + v + ", array size " + this.size());
        }
        return (p)this.d.set(v, p0);
    }

    public a Q2(Long long0) {
        return long0 == null ? this.w2(this.k2()) : this.w2(this.r2(((long)long0)));
    }

    public a Q3(int v, double f) {
        return this.z2(v, this.m2(f));
    }

    public a R3(int v, float f) {
        return this.z2(v, this.n2(f));
    }

    public a S2(Short short0) {
        return short0 == null ? this.w2(this.k2()) : this.w2(this.s2(((short)short0)));
    }

    public a T2(String s) {
        return s == null ? this.w2(this.k2()) : this.w2(this.v2(s));
    }

    @Override  // com.fasterxml.jackson.databind.q$a
    public boolean U(I i0) {
        return this.d.isEmpty();
    }

    public a U2(BigDecimal bigDecimal0) {
        return bigDecimal0 == null ? this.w2(this.k2()) : this.w2(this.b(bigDecimal0));
    }

    public a U3(int v, int v1) {
        return this.z2(v, this.q2(v1));
    }

    @Override  // com.fasterxml.jackson.databind.p
    protected p V(o o0) {
        return this.M0(o0.p());
    }

    public a V2(BigInteger bigInteger0) {
        return bigInteger0 == null ? this.w2(this.k2()) : this.w2(this.O(bigInteger0));
    }

    public a V3(int v, long v1) {
        return this.z2(v, this.r2(v1));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    protected a W1(o o0, o o1, com.fasterxml.jackson.databind.p.b p$b0, boolean z) {
        if(o1.y()) {
            return this;
        }
        p p0 = this.V(o1);
        if(p0 != null && p0 instanceof b) {
            a a0 = ((b)p0).W1(o0, o1.D(), p$b0, z);
            if(a0 != null) {
                return a0;
            }
            this.Z1(o0, o1, p$b0, z, p0);
        }
        return this.B2(o1, z);
    }

    public a W2(short v) {
        return this.w2(this.s2(v));
    }

    public a W3(int v, Boolean boolean0) {
        return boolean0 == null ? this.z2(v, this.k2()) : this.z2(v, this.f2(boolean0.booleanValue()));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    protected u X1(o o0, o o1, com.fasterxml.jackson.databind.p.b p$b0, boolean z) {
        if(o1.y()) {
            return null;
        }
        p p0 = this.V(o1);
        if(p0 != null && p0 instanceof b) {
            u u0 = ((b)p0).X1(o0, o1.D(), p$b0, z);
            if(u0 != null) {
                return u0;
            }
            this.Z1(o0, o1, p$b0, z, p0);
        }
        return this.D2(o1, z);
    }

    public a X2(boolean z) {
        return this.w2(this.f2(z));
    }

    public a X3(int v, Double double0) {
        return double0 == null ? this.z2(v, this.k2()) : this.z2(v, this.m2(((double)double0)));
    }

    public a Y3(int v, Float float0) {
        return float0 == null ? this.z2(v, this.k2()) : this.z2(v, this.n2(((float)float0)));
    }

    public a Z2(byte[] arr_b) {
        return arr_b == null ? this.w2(this.k2()) : this.w2(this.b2(arr_b));
    }

    public a Z3(int v, Integer integer0) {
        return integer0 == null ? this.z2(v, this.k2()) : this.z2(v, this.q2(((int)integer0)));
    }

    public a a3(a a0) {
        this.d.addAll(a0.d);
        return this;
    }

    public a a4(int v, Long long0) {
        return long0 == null ? this.z2(v, this.k2()) : this.z2(v, this.r2(((long)long0)));
    }

    public a b4(int v, Short short0) {
        return short0 == null ? this.z2(v, this.k2()) : this.z2(v, this.s2(((short)short0)));
    }

    public a c3(Collection collection0) {
        for(Object object0: collection0) {
            this.K2(((p)object0));
        }
        return this;
    }

    public a c4(int v, String s) {
        return s == null ? this.z2(v, this.k2()) : this.z2(v, this.v2(s));
    }

    public a d3() {
        a a0 = this.R();
        this.w2(a0);
        return a0;
    }

    public a d4(int v, BigDecimal bigDecimal0) {
        return bigDecimal0 == null ? this.z2(v, this.k2()) : this.z2(v, this.b(bigDecimal0));
    }

    public a e3() {
        return this.w2(this.k2());
    }

    public a e4(int v, BigInteger bigInteger0) {
        return bigInteger0 == null ? this.z2(v, this.k2()) : this.z2(v, this.O(bigInteger0));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0 instanceof a ? this.d.equals(((a)object0).d) : false;
    }

    public u f3() {
        u u0 = this.y();
        this.w2(u0);
        return u0;
    }

    public a f4(int v, short v1) {
        return this.z2(v, this.s2(v1));
    }

    public a g3(Object object0) {
        return object0 == null ? this.w2(this.k2()) : this.w2(this.d(object0));
    }

    public a g4(int v, boolean z) {
        return this.z2(v, this.f2(z));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public G get(int v) {
        return this.M0(v);
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public G get(String s) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public r h() {
        return r.m;
    }

    public a h3(C c0) {
        return c0 == null ? this.w2(this.k2()) : this.w2(this.I(c0));
    }

    public a h4(int v, byte[] arr_b) {
        return arr_b == null ? this.z2(v, this.k2()) : this.z2(v, this.b2(arr_b));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.d.hashCode();
    }

    public a i3() {
        a a0 = new a(this.b);
        for(Object object0: this.d) {
            p p0 = ((p)object0).v0();
            a0.d.add(p0);
        }
        return a0;
    }

    public a i4(int v) {
        return this.z2(v, this.k2());
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean isArray() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    public u j3(String s) {
        for(Object object0: this.d) {
            p p0 = ((p)object0).B0(s);
            if(p0 != null) {
                return (u)p0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public a j4(int v, Object object0) {
        return object0 == null ? this.z2(v, this.k2()) : this.z2(v, this.d(object0));
    }

    public a k3(int v, double f) {
        return this.y2(v, this.m2(f));
    }

    public a l3(int v, float f) {
        return this.y2(v, this.n2(f));
    }

    public a l4(int v, C c0) {
        return c0 == null ? this.z2(v, this.k2()) : this.z2(v, this.I(c0));
    }

    public a m3(int v, int v1) {
        return this.y2(v, this.q2(v1));
    }

    @Deprecated
    public u m4(String s) {
        o o0 = this.T1(s);
        return o0 == null ? ((u)super.G1(s)) : this.N1(o0);
    }

    public a n4(String s) {
        o o0 = this.T1(s);
        return o0 == null ? ((a)super.H1(s)) : this.I1(o0);
    }

    public a o3(int v, long v1) {
        return this.y2(v, this.r2(v1));
    }

    public a q3(int v, p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        this.y2(v, p0);
        return this;
    }

    public a r3(int v, Boolean boolean0) {
        return boolean0 == null ? this.J3(v) : this.y2(v, this.f2(boolean0.booleanValue()));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p s1(int v) {
        return v >= 0 && v < this.d.size() ? ((p)this.d.get(v)) : com.fasterxml.jackson.databind.node.p.c2();
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public int size() {
        return this.d.size();
    }

    public a t3(int v, Double double0) {
        return double0 == null ? this.y2(v, this.k2()) : this.y2(v, this.m2(((double)double0)));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public f u2() {
        return this.O3();
    }

    public a u3(int v, Float float0) {
        return float0 == null ? this.y2(v, this.k2()) : this.y2(v, this.n2(((float)float0)));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p v0() {
        return this.i3();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p v1(String s) {
        return com.fasterxml.jackson.databind.node.p.c2();
    }

    protected a w2(p p0) {
        this.d.add(p0);
        return this;
    }

    public a w3(int v, Integer integer0) {
        return integer0 == null ? this.y2(v, this.k2()) : this.y2(v, this.q2(((int)integer0)));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G x(String s) {
        return this.v1(s);
    }

    protected boolean x2(a a0) {
        return this.d.equals(a0.d);
    }

    public a x3(int v, Long long0) {
        return long0 == null ? this.y2(v, this.k2()) : this.y2(v, this.r2(((long)long0)));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public Iterator y0() {
        return this.d.iterator();
    }

    protected a y2(int v, p p0) {
        if(v < 0) {
            this.d.add(0, p0);
            return this;
        }
        if(v >= this.d.size()) {
            this.d.add(p0);
            return this;
        }
        this.d.add(v, p0);
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean z0(Comparator comparator0, p p0) {
        if(!(p0 instanceof a)) {
            return false;
        }
        int v = this.d.size();
        if(((a)p0).size() != v) {
            return false;
        }
        List list0 = this.d;
        List list1 = ((a)p0).d;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((p)list0.get(v1)).z0(comparator0, ((p)list1.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public p z1(int v) {
        return v < 0 || v >= this.d.size() ? ((p)this.W("No value at index #%d [0, %d) of `ArrayNode`", new Object[]{v, this.d.size()})) : ((p)this.d.get(v));
    }

    protected a z2(int v, p p0) {
        if(v < 0 || v >= this.d.size()) {
            throw new IndexOutOfBoundsException("Illegal index " + v + ", array size " + this.size());
        }
        this.d.set(v, p0);
        return this;
    }

    public a z3(int v, Short short0) {
        return short0 == null ? this.y2(v, this.k2()) : this.y2(v, this.s2(((short)short0)));
    }
}

