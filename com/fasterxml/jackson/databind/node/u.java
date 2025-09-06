package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.o;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.cfg.r;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.p.b;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.util.C;
import j..util.Map.-EL;
import j..util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class u extends f implements Serializable {
    protected final Map d;
    private static final long e = 1L;

    public u(m m0) {
        super(m0);
        this.d = new LinkedHashMap();
    }

    public u(m m0, Map map0) {
        super(m0);
        Objects.requireNonNull(map0, "Must not pass `null` for \'children\' argument");
        this.d = map0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public Iterator A0() {
        return this.d.entrySet().iterator();
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public p A1(String s) {
        p p0 = (p)this.d.get(s);
        return p0 == null ? ((p)this.W("No value for property \'%s\' of `ObjectNode`", new Object[]{s})) : p0;
    }

    public p A3(String s) {
        this.d.remove(s);
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p B0(String s) {
        return this.E2(s);
    }

    protected u B2(o o0, boolean z) {
        String s = o0.q();
        o o1 = o0.D();
        if(o1.y()) {
            return this.g3(s);
        }
        return !z || !o1.B() ? this.g3(s).B2(o1, z) : this.d3(s).D2(o1, true);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G D(int v) {
        return this.s1(v);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public List D0(String s, List list0) {
        for(Object object0: this.d.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(s.equals(map$Entry0.getKey())) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(this);
            }
            else {
                list0 = ((p)map$Entry0.getValue()).D0(s, list0);
            }
        }
        return list0;
    }

    public u D2() {
        u u0 = new u(this.b);
        for(Object object0: this.d.entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            p p0 = ((p)((Map.Entry)object0).getValue()).v0();
            u0.d.put(object1, p0);
        }
        return u0;
    }

    public p D3(Collection collection0) {
        this.d.keySet().removeAll(collection0);
        return this;
    }

    public u E2(String s) {
        if(((p)this.d.get(s)) != null) {
            return this;
        }
        for(Object object0: this.d.values()) {
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

    @Override  // com.fasterxml.jackson.databind.p
    public p F0(String s) {
        p p0 = (p)this.d.get(s);
        if(p0 != null) {
            return p0;
        }
        for(Object object0: this.d.values()) {
            p p1 = ((p)object0).F0(s);
            if(p1 != null) {
                return p1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Deprecated
    public p F2(String s, p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        return (p)this.d.put(s, p0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    @Deprecated
    public p G1(String s) {
        return this.x3(s);
    }

    public u G2(String s, double f) {
        return this.y2(s, this.m2(f));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public void H(k k0, I i0, j j0) throws IOException {
        int v1;
        int v;
        if(i0 == null) {
            v = 0;
            v1 = 0;
        }
        else {
            v = !i0.D0(H.v);
            v1 = !i0.A(r.d);
        }
        c c0 = j0.o(k0, j0.f(this, com.fasterxml.jackson.core.r.k));
        if(v != 0 || v1 != 0) {
            this.r3(k0, i0, ((boolean)v), ((boolean)v1));
        }
        else {
            for(Object object0: this.x2(i0).entrySet()) {
                p p0 = (p)((Map.Entry)object0).getValue();
                k0.v3(((String)((Map.Entry)object0).getKey()));
                p0.P(k0, i0);
            }
        }
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public List H0(String s, List list0) {
        for(Object object0: this.d.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(s.equals(map$Entry0.getKey())) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(map$Entry0.getValue());
            }
            else {
                list0 = ((p)map$Entry0.getValue()).H0(s, list0);
            }
        }
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p H1(String s) {
        return this.z3(s);
    }

    public u H2(String s, float f) {
        return this.y2(s, this.n2(f));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public List J0(String s, List list0) {
        for(Object object0: this.d.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(s.equals(map$Entry0.getKey())) {
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(((p)map$Entry0.getValue()).j0());
            }
            else {
                list0 = ((p)map$Entry0.getValue()).J0(s, list0);
            }
        }
        return list0;
    }

    public u J2(String s, int v) {
        return this.y2(s, this.q2(v));
    }

    public u K2(String s, long v) {
        return this.y2(s, this.r2(v));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final boolean M() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public p M0(int v) [...] // Inlined contents

    @Override  // com.fasterxml.jackson.databind.p
    public a M1(String s) {
        p p0 = (p)this.d.get(s);
        if(p0 != null && !p0.l1()) {
            return p0.isArray() ? ((a)p0) : ((a)this.V1("Cannot replace `JsonNode` of type `%s` with `ArrayNode` for property \"%s\" with (default mode `OverwriteMode.%s`)", new Object[]{p0.getClass().getName(), s, b.b}));
        }
        return this.d3(s);
    }

    public u M2(String s, Boolean boolean0) {
        return boolean0 == null ? this.y2(s, this.k2()) : this.y2(s, this.f2(boolean0.booleanValue()));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public p N0(String s) {
        return (p)this.d.get(s);
    }

    public u N2(String s, Double double0) {
        return double0 == null ? this.y2(s, this.k2()) : this.y2(s, this.m2(((double)double0)));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.g;
    }

    public u O2(String s, Float float0) {
        return float0 == null ? this.y2(s, this.k2()) : this.y2(s, this.n2(((float)float0)));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public void P(k k0, I i0) throws IOException {
        if(i0 != null) {
            boolean z = i0.D0(H.v);
            boolean z1 = i0.A(r.d);
            if(!z || !z1) {
                k0.E4(this);
                this.r3(k0, i0, !z, !z1);
                k0.p3();
                return;
            }
        }
        k0.E4(this);
        for(Object object0: this.x2(i0).entrySet()) {
            p p0 = (p)((Map.Entry)object0).getValue();
            k0.v3(((String)((Map.Entry)object0).getKey()));
            p0.P(k0, i0);
        }
        k0.p3();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public u P1(String s) {
        o o0 = this.T1(s);
        return o0 == null ? this.R1(s) : this.N1(o0);
    }

    public u P2(String s, Integer integer0) {
        return integer0 == null ? this.y2(s, this.k2()) : this.y2(s, this.q2(((int)integer0)));
    }

    public u Q2(String s, Long long0) {
        return long0 == null ? this.y2(s, this.k2()) : this.y2(s, this.r2(((long)long0)));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public u R1(String s) {
        p p0 = (p)this.d.get(s);
        if(p0 != null && !p0.l1()) {
            return p0.M() ? ((u)p0) : ((u)this.V1("Cannot replace `JsonNode` of type `%s` with `ObjectNode` for property \"%s\" (default mode `OverwriteMode.%s`)", new Object[]{p0.getClass().getName(), s, b.b}));
        }
        return this.g3(s);
    }

    public u S2(String s, Short short0) {
        return short0 == null ? this.y2(s, this.k2()) : this.y2(s, this.s2(((short)short0)));
    }

    public u T2(String s, String s1) {
        return s1 == null ? this.y2(s, this.k2()) : this.y2(s, this.v2(s1));
    }

    @Override  // com.fasterxml.jackson.databind.q$a
    public boolean U(I i0) {
        return this.d.isEmpty();
    }

    public u U2(String s, BigDecimal bigDecimal0) {
        return bigDecimal0 == null ? this.y2(s, this.k2()) : this.y2(s, this.b(bigDecimal0));
    }

    @Override  // com.fasterxml.jackson.databind.p
    protected p V(o o0) {
        return this.N0(o0.q());
    }

    public u V2(String s, BigInteger bigInteger0) {
        return bigInteger0 == null ? this.y2(s, this.k2()) : this.y2(s, this.O(bigInteger0));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    protected a W1(o o0, o o1, b p$b0, boolean z) {
        if(o1.y()) {
            return null;
        }
        p p0 = this.V(o1);
        if(p0 != null && p0 instanceof com.fasterxml.jackson.databind.node.b) {
            a a0 = ((com.fasterxml.jackson.databind.node.b)p0).W1(o0, o1.D(), p$b0, z);
            if(a0 != null) {
                return a0;
            }
            this.Z1(o0, o1, p$b0, z, p0);
        }
        return this.z2(o1, z);
    }

    public u W2(String s, short v) {
        return this.y2(s, this.s2(v));
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    protected u X1(o o0, o o1, b p$b0, boolean z) {
        if(o1.y()) {
            return this;
        }
        p p0 = this.V(o1);
        if(p0 != null && p0 instanceof com.fasterxml.jackson.databind.node.b) {
            u u0 = ((com.fasterxml.jackson.databind.node.b)p0).X1(o0, o1.D(), p$b0, z);
            if(u0 != null) {
                return u0;
            }
            this.Z1(o0, o1, p$b0, z, p0);
        }
        return this.B2(o1, z);
    }

    public u X2(String s, boolean z) {
        return this.y2(s, this.f2(z));
    }

    public u Z2(String s, byte[] arr_b) {
        return arr_b == null ? this.y2(s, this.k2()) : this.y2(s, this.b2(arr_b));
    }

    @Deprecated
    public p a3(u u0) {
        return this.u3(u0);
    }

    @Deprecated
    public p c3(Map map0) {
        return this.w3(map0);
    }

    public a d3(String s) {
        a a0 = this.R();
        this.y2(s, a0);
        return a0;
    }

    public p e3(String s, p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        return (p)Map.-EL.putIfAbsent(this.d, s, p0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0 instanceof u ? this.w2(((u)object0)) : false;
    }

    public u f3(String s) {
        s s1 = this.k2();
        this.d.put(s, s1);
        return this;
    }

    public u g3(String s) {
        u u0 = this.y();
        this.y2(s, u0);
        return u0;
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public G get(int v) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public G get(String s) {
        return this.N0(s);
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public com.fasterxml.jackson.core.r h() {
        return com.fasterxml.jackson.core.r.k;
    }

    public u h3(String s, Object object0) {
        return this.y2(s, this.d(object0));
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.d.hashCode();
    }

    public u i3(String s, C c0) {
        return this.y2(s, this.I(c0));
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    public p j3(String s) {
        return (p)this.d.remove(s);
    }

    public u k3(Collection collection0) {
        this.d.keySet().removeAll(collection0);
        return this;
    }

    public u l3() {
        this.d.clear();
        return this;
    }

    public p m3(String s, p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        return (p)this.d.put(s, p0);
    }

    public u o3(Collection collection0) {
        this.d.keySet().retainAll(collection0);
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public Iterator p() {
        return this.d.keySet().iterator();
    }

    public u q3(String[] arr_s) {
        return this.o3(Arrays.asList(arr_s));
    }

    protected void r3(k k0, I i0, boolean z, boolean z1) throws IOException {
        for(Object object0: this.x2(i0).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            p p0 = (p)map$Entry0.getValue();
            if((!z || !p0.isArray() || !p0.U(i0)) && (!z1 || !p0.l1())) {
                k0.v3(((String)map$Entry0.getKey()));
                p0.P(k0, i0);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p s1(int v) {
        return com.fasterxml.jackson.databind.node.p.c2();
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public int size() {
        return this.d.size();
    }

    public p t3(String s, p p0) {
        if(p0 == null) {
            p0 = this.k2();
        }
        this.d.put(s, p0);
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.node.f
    public f u2() {
        return this.l3();
    }

    public p u3(u u0) {
        this.d.putAll(u0.d);
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p v0() {
        return this.D2();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p v1(String s) {
        p p0 = (p)this.d.get(s);
        return p0 != null ? p0 : com.fasterxml.jackson.databind.node.p.c2();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public Set w1() {
        return this.d.entrySet();
    }

    protected boolean w2(u u0) {
        return this.d.equals(u0.d);
    }

    public p w3(Map map0) {
        for(Object object0: map0.entrySet()) {
            p p0 = (p)((Map.Entry)object0).getValue();
            if(p0 == null) {
                p0 = this.k2();
            }
            Object object1 = ((Map.Entry)object0).getKey();
            this.d.put(object1, p0);
        }
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G x(String s) {
        return this.v1(s);
    }

    protected Map x2(I i0) {
        return i0.A(r.e) && !this.d.isEmpty() ? new TreeMap(this.d) : this.d;
    }

    @Deprecated
    public u x3(String s) {
        o o0 = this.T1(s);
        if(o0 != null) {
            return this.N1(o0);
        }
        p p0 = (p)this.d.get(s);
        if(p0 != null) {
            if(!(p0 instanceof u)) {
                throw new UnsupportedOperationException("Property \'" + s + "\' has value that is not of type `ObjectNode` (but `" + p0.getClass().getName() + "`)");
            }
            return (u)p0;
        }
        u u0 = this.y();
        this.d.put(s, u0);
        return u0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public Iterator y0() {
        return this.d.values().iterator();
    }

    protected u y2(String s, p p0) {
        this.d.put(s, p0);
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean z0(Comparator comparator0, p p0) {
        if(!(p0 instanceof u)) {
            return false;
        }
        Map map0 = this.d;
        Map map1 = ((u)p0).d;
        if(map1.size() != map0.size()) {
            return false;
        }
        for(Object object0: map0.entrySet()) {
            p p1 = (p)map1.get(((Map.Entry)object0).getKey());
            if(p1 == null || !((p)((Map.Entry)object0).getValue()).z0(comparator0, p1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    protected a z2(o o0, boolean z) {
        String s = o0.q();
        o o1 = o0.D();
        if(o1.y()) {
            return this.d3(s);
        }
        return !z || !o1.B() ? this.g3(s).z2(o1, z) : this.d3(s).B2(o1, true);
    }

    public a z3(String s) {
        o o0 = this.T1(s);
        if(o0 != null) {
            return this.I1(o0);
        }
        p p0 = (p)this.d.get(s);
        if(p0 != null) {
            if(!(p0 instanceof a)) {
                throw new UnsupportedOperationException("Property \'" + s + "\' has value that is not of type `ArrayNode` (but `" + p0.getClass().getName() + "`)");
            }
            return (a)p0;
        }
        a a0 = this.R();
        this.d.put(s, a0);
        return a0;
    }
}

