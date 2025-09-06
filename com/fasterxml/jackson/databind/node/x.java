package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.io.l;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;

public class x extends z {
    protected final String c;
    private static final long d = 2L;
    static final x e;

    static {
        x.e = new x("");
    }

    public x(String s) {
        this.c = s;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String E1() {
        return this.c;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.i;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        String s = this.c;
        if(s == null) {
            k0.y3();
            return;
        }
        k0.d(s);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Z(boolean z) {
        String s = this.c;
        if(s != null) {
            String s1 = s.trim();
            if("true".equals(s1)) {
                return true;
            }
            return "false".equals(s1) ? false : z;
        }
        return z;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public double b0(double f) {
        return l.c(this.c, f);
    }

    @Deprecated
    protected static void c2(StringBuilder stringBuilder0, String s) {
        stringBuilder0.append('\"');
        c.a(stringBuilder0, s);
        stringBuilder0.append('\"');
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0 instanceof x ? ((x)object0).c.equals(this.c) : false;
    }

    public byte[] f2(a a0) throws IOException {
        String s = this.c.trim();
        com.fasterxml.jackson.core.util.c c0 = new com.fasterxml.jackson.core.util.c(Math.max(16, Math.min(0x10000, (s.length() >> 2) * 3 + 4)));
        try {
            a0.e(s, c0);
            return new byte[0];
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw com.fasterxml.jackson.databind.exc.c.J(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", illegalArgumentException0.getMessage()), s, byte[].class);
        }
    }

    @Override  // com.fasterxml.jackson.databind.p
    public int g0(int v) {
        return l.e(this.c, v);
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.q;
    }

    public static x h2(String s) {
        if(s == null) {
            return null;
        }
        return s.isEmpty() ? x.e : new x(s);
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public long i0(long v) {
        return l.f(this.c, v);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return this.c;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String k0(String s) {
        return this.c == null ? s : this.c;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public byte[] p0() throws IOException {
        return this.f2(b.a());
    }
}

