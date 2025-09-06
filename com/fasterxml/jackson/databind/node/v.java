package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.q;
import java.io.IOException;

public class v extends z {
    protected final Object c;
    private static final long d = 2L;

    public v(Object object0) {
        this.c = object0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.h;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        Object object0 = this.c;
        if(object0 == null) {
            i0.X(k0);
            return;
        }
        if(object0 instanceof q) {
            ((q)object0).P(k0, i0);
            return;
        }
        i0.Y(object0, k0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Z(boolean z) {
        return this.c == null || !(this.c instanceof Boolean) ? z : ((Boolean)this.c).booleanValue();
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public double b0(double f) {
        return this.c instanceof Number ? ((Number)this.c).doubleValue() : f;
    }

    protected boolean c2(v v0) {
        return this.c == null ? v0.c == null : this.c.equals(v0.c);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0 instanceof v ? this.c2(((v)object0)) : false;
    }

    public Object f2() {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public int g0(int v) {
        return this.c instanceof Number ? ((Number)this.c).intValue() : v;
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.p;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.c.hashCode();
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public long i0(long v) {
        return this.c instanceof Number ? ((Number)this.c).longValue() : v;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return this.c == null ? "null" : this.c.toString();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String k0(String s) {
        return this.c == null ? s : this.c.toString();
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public byte[] p0() throws IOException {
        return this.c instanceof byte[] ? ((byte[])this.c) : super.p0();
    }
}

