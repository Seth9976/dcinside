package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.o;
import com.fasterxml.jackson.databind.node.n;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class p extends a implements G, Iterable {
    static class com.fasterxml.jackson.databind.p.a {
        static final int[] a;

        static {
            int[] arr_v = new int[n.values().length];
            com.fasterxml.jackson.databind.p.a.a = arr_v;
            try {
                arr_v[n.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.databind.p.a.a[n.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.databind.p.a.a[n.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum b {
        NONE,
        NULLS,
        SCALARS,
        ALL;

    }

    public Iterator A0() {
        return h.p();
    }

    public p A1(String s) throws IllegalArgumentException {
        return (p)this.W("Node of type `%s` has no fields", new Object[]{this.getClass().getName()});
    }

    public abstract p B0(String arg1);

    public final p B1(o o0) throws IllegalArgumentException {
        p p0 = this;
        for(o o1 = o0; !o1.y(); o1 = o1.D()) {
            p0 = p0.V(o1);
            if(p0 == null) {
                this.W("No node at \'%s\' (unmatched part: \'%s\')", new Object[]{o0, o1});
            }
        }
        return p0;
    }

    @Override  // com.fasterxml.jackson.core.G
    public boolean C() {
        return false;
    }

    public final List C0(String s) {
        List list0 = this.D0(s, null);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public p C1(String s) throws IllegalArgumentException {
        return this.B1(o.m(s));
    }

    @Override  // com.fasterxml.jackson.core.G
    public G D(int v) {
        return this.s1(v);
    }

    public abstract List D0(String arg1, List arg2);

    public short D1() {
        return 0;
    }

    public abstract p E0(String arg1);

    public String E1() {
        return null;
    }

    public abstract p F0(String arg1);

    public String F1() {
        return this.toString();
    }

    public final List G0(String s) {
        List list0 = this.H0(s, null);
        return list0 == null ? Collections.emptyList() : list0;
    }

    @Deprecated
    public p G1(String s) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but " + this.getClass().getName() + "), cannot call `with(String)` on it");
    }

    public abstract List H0(String arg1, List arg2);

    public p H1(String s) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + this.getClass().getName() + ")`, cannot call `withArray()` on it");
    }

    public final List I0(String s) {
        List list0 = this.J0(s, null);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final com.fasterxml.jackson.databind.node.a I1(o o0) {
        return this.K1(o0, b.b, true);
    }

    public abstract List J0(String arg1, List arg2);

    public float K0() {
        return 0.0f;
    }

    public com.fasterxml.jackson.databind.node.a K1(o o0, b p$b0, boolean z) {
        throw new UnsupportedOperationException("`withArray(JsonPointer)` not implemented by " + this.getClass().getName());
    }

    public com.fasterxml.jackson.databind.node.a L1(String s, b p$b0, boolean z) {
        return this.K1(o.m(s), p$b0, z);
    }

    @Override  // com.fasterxml.jackson.core.G
    public boolean M() {
        return false;
    }

    public abstract p M0(int arg1);

    public com.fasterxml.jackson.databind.node.a M1(String s) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + this.getClass().getName() + ")`, cannot call `withArrayProperty(String)` on it");
    }

    public p N0(String s) {
        return null;
    }

    public final u N1(o o0) {
        return this.O1(o0, b.b, true);
    }

    public abstract n O0();

    public u O1(o o0, b p$b0, boolean z) {
        throw new UnsupportedOperationException("`withObject(JsonPointer)` not implemented by `" + this.getClass().getName() + "`");
    }

    public boolean P0(int v) {
        return this.M0(v) != null;
    }

    public u P1(String s) {
        throw new UnsupportedOperationException("`withObject(String)` not implemented by `" + this.getClass().getName() + "`");
    }

    @Override  // com.fasterxml.jackson.core.G
    public G Q(String s) throws IllegalArgumentException {
        return this.n0(s);
    }

    public boolean Q0(String s) {
        return this.N0(s) != null;
    }

    public final u Q1(String s, b p$b0, boolean z) {
        return this.O1(o.m(s), p$b0, z);
    }

    public boolean R0(int v) {
        p p0 = this.M0(v);
        return p0 != null && !p0.l1();
    }

    public u R1(String s) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + this.getClass().getName() + ")`, cannot call `withObjectProperty(String)` on it");
    }

    public boolean S0(String s) {
        p p0 = this.N0(s);
        return p0 != null && !p0.l1();
    }

    public int U0() {
        return 0;
    }

    protected abstract p V(o arg1);

    public boolean V0() {
        return false;
    }

    protected Object W(String s, Object[] arr_object) {
        throw new IllegalArgumentException(String.format(s, arr_object));
    }

    public boolean W0() {
        return false;
    }

    protected p X() [...] // Inlined contents

    public final boolean X0() {
        return this.O0() == n.b;
    }

    public boolean Y() {
        return this.Z(false);
    }

    public boolean Z(boolean z) {
        return z;
    }

    public final boolean Z0() {
        return this.O0() == n.c;
    }

    public double a0() {
        return this.b0(0.0);
    }

    public boolean a1() {
        return false;
    }

    public double b0(double f) {
        return f;
    }

    public int c0() {
        return this.g0(0);
    }

    public boolean e1() {
        return false;
    }

    @Override
    public abstract boolean equals(Object arg1);

    public boolean f1() {
        return false;
    }

    public int g0(int v) {
        return v;
    }

    public boolean g1() {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.G
    public G get(int v) {
        return this.M0(v);
    }

    @Override  // com.fasterxml.jackson.core.G
    public G get(String s) {
        return this.N0(s);
    }

    public long h0() {
        return this.i0(0L);
    }

    public boolean h1() {
        return false;
    }

    public long i0(long v) {
        return v;
    }

    @Override  // com.fasterxml.jackson.core.G
    public boolean isArray() {
        return false;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public final Iterator iterator() {
        return this.y0();
    }

    public abstract String j0();

    public String k0(String s) {
        String s1 = this.j0();
        return s1 == null ? s : s1;
    }

    public boolean k1() {
        return false;
    }

    public final boolean l1() {
        return this.O0() == n.e;
    }

    public final p m0(o o0) {
        if(o0.y()) {
            return this;
        }
        p p0 = this.V(o0);
        return p0 == null ? com.fasterxml.jackson.databind.node.p.c2() : p0.m0(o0.D());
    }

    public final boolean m1() {
        return this.O0() == n.f;
    }

    public final p n0(String s) {
        return this.m0(o.m(s));
    }

    public final boolean n1() {
        return this.O0() == n.h;
    }

    public BigInteger o0() {
        return BigInteger.ZERO;
    }

    public boolean o1() {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.G
    public Iterator p() {
        return h.p();
    }

    public byte[] p0() throws IOException {
        return null;
    }

    public final boolean p1() {
        return this.O0() == n.i;
    }

    @Override  // com.fasterxml.jackson.core.G
    public G q(o o0) {
        return this.m0(o0);
    }

    public boolean q0() {
        return false;
    }

    public long q1() {
        return 0L;
    }

    @Override  // com.fasterxml.jackson.core.G
    public final boolean r() {
        n n0 = this.O0();
        return n0 == n.g || n0 == n.a;
    }

    public boolean r0() {
        return this.h1();
    }

    public Number r1() {
        return null;
    }

    public boolean s0() {
        return false;
    }

    public abstract p s1(int arg1);

    @Override  // com.fasterxml.jackson.core.G
    public int size() {
        return 0;
    }

    public boolean t0() {
        return false;
    }

    @Override
    public abstract String toString();

    public BigDecimal u0() {
        return BigDecimal.ZERO;
    }

    public abstract p v0();

    public abstract p v1(String arg1);

    public double w0() {
        return 0.0;
    }

    public Set w1() {
        return Collections.emptySet();
    }

    @Override  // com.fasterxml.jackson.core.G
    public G x(String s) {
        return this.v1(s);
    }

    public p x1() throws IllegalArgumentException {
        return this;
    }

    public Iterator y0() {
        return h.p();
    }

    public p y1() throws IllegalArgumentException {
        return this;
    }

    @Override  // com.fasterxml.jackson.core.G
    public final boolean z() {
        switch(this.O0()) {
            case 1: 
            case 2: 
            case 3: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public boolean z0(Comparator comparator0, p p0) {
        return comparator0.compare(this, p0) == 0;
    }

    public p z1(int v) throws IllegalArgumentException {
        return (p)this.W("Node of type `%s` has no indexed values", new Object[]{this.getClass().getName()});
    }
}

