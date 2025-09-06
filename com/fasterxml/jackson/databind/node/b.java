package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.o;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class b extends p implements Serializable {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.databind.p.b.values().length];
            a.a = arr_v;
            try {
                arr_v[com.fasterxml.jackson.databind.p.b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.databind.p.b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.databind.p.b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.databind.p.b.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private static final long a = 1L;

    @Override  // com.fasterxml.jackson.databind.p
    public p A1(String s) {
        return (p)this.W("Node of type `%s` has no fields", new Object[]{this.getClass().getSimpleName()});
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final p E0(String s) {
        p p0 = this.F0(s);
        return p0 == null ? com.fasterxml.jackson.databind.node.p.c2() : p0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String F1() {
        return k.c(this);
    }

    @Override  // com.fasterxml.jackson.core.G
    public n G(u u0) {
        return new y(this, u0);
    }

    @Override  // com.fasterxml.jackson.databind.q
    public abstract void H(com.fasterxml.jackson.core.k arg1, I arg2, j arg3) throws IOException;

    @Override  // com.fasterxml.jackson.core.G
    public n J() {
        return new y(this);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public com.fasterxml.jackson.databind.node.a K1(o o0, com.fasterxml.jackson.databind.p.b p$b0, boolean z) {
        if(o0.y()) {
            if(this instanceof com.fasterxml.jackson.databind.node.a) {
                return (com.fasterxml.jackson.databind.node.a)this;
            }
            this.V1("Can only call `withArray()` with empty JSON Pointer on `ArrayNode`, not `%s`", new Object[]{this.getClass().getName()});
        }
        com.fasterxml.jackson.databind.node.a a0 = this.W1(o0, o0, p$b0, z);
        if(a0 == null) {
            this.V1("Cannot replace context node (of type `%s`) using `withArray()` with  JSON Pointer \'%s\'", new Object[]{this.getClass().getName(), o0});
        }
        return a0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public com.fasterxml.jackson.databind.node.u O1(o o0, com.fasterxml.jackson.databind.p.b p$b0, boolean z) {
        if(o0.y()) {
            if(this instanceof com.fasterxml.jackson.databind.node.u) {
                return (com.fasterxml.jackson.databind.node.u)this;
            }
            this.V1("Can only call `withObject()` with empty JSON Pointer on `ObjectNode`, not `%s`", new Object[]{this.getClass().getName()});
        }
        com.fasterxml.jackson.databind.node.u u0 = this.X1(o0, o0, p$b0, z);
        if(u0 == null) {
            this.V1("Cannot replace context node (of type `%s`) using `withObject()` with  JSON Pointer \'%s\'", new Object[]{this.getClass().getName(), o0});
        }
        return u0;
    }

    @Override  // com.fasterxml.jackson.databind.q
    public abstract void P(com.fasterxml.jackson.core.k arg1, I arg2) throws IOException;

    protected BigInteger S1(BigDecimal bigDecimal0) {
        try {
            com.fasterxml.jackson.core.y.d().m(bigDecimal0.scale());
            return bigDecimal0.toBigInteger();
        }
        catch(com.fasterxml.jackson.core.exc.b b0) {
            com.fasterxml.jackson.databind.util.n.d(b0);
            return bigDecimal0.toBigInteger();
        }
    }

    protected o T1(String s) {
        return s.isEmpty() || s.charAt(0) == 0x2F ? o.m(s) : null;
    }

    protected Object U1(String s, Object[] arr_object) {
        throw new UnsupportedOperationException(String.format(s, arr_object));
    }

    protected Object V1(String s, Object[] arr_object) {
        throw new UnsupportedOperationException(String.format(s, arr_object));
    }

    protected com.fasterxml.jackson.databind.node.a W1(o o0, o o1, com.fasterxml.jackson.databind.p.b p$b0, boolean z) {
        return null;
    }

    protected com.fasterxml.jackson.databind.node.u X1(o o0, o o1, com.fasterxml.jackson.databind.p.b p$b0, boolean z) {
        return null;
    }

    protected boolean Y1(p p0, com.fasterxml.jackson.databind.p.b p$b0) {
        switch(p$b0) {
            case 1: {
                return false;
            }
            case 2: {
                return p0.l1();
            }
            case 3: {
                return !p0.r();
            }
            default: {
                return true;
            }
        }
    }

    protected void Z1(o o0, o o1, com.fasterxml.jackson.databind.p.b p$b0, boolean z, p p0) {
        if(!this.Y1(p0, p$b0)) {
            this.V1("Cannot replace `JsonNode` of type `%s` for property \"%s\" in JSON Pointer \"%s\" (mode `OverwriteMode.%s`)", new Object[]{p0.getClass().getName(), o1.q(), o0, p$b0});
        }
    }

    Object a2() {
        return r.b(this);
    }

    @Override  // com.fasterxml.jackson.core.G
    public com.fasterxml.jackson.core.n.b g() {
        return null;
    }

    @Override  // com.fasterxml.jackson.core.G
    public abstract com.fasterxml.jackson.core.r h();

    @Override
    public abstract int hashCode();

    @Override  // com.fasterxml.jackson.databind.p
    public String toString() {
        return k.d(this);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p z1(int v) {
        return (p)this.W("Node of type `%s` has no indexed values", new Object[]{this.getClass().getSimpleName()});
    }
}

