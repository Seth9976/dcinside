package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;

public class e extends z {
    private final boolean c;
    private static final long d = 2L;
    public static final e e;
    public static final e f;

    static {
        e.e = new e(true);
        e.f = new e(false);
    }

    protected e(boolean z) {
        this.c = z;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.c;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.b3(this.c);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Y() {
        return this.c;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean Z(boolean z) {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public double b0(double f) {
        return this.c ? 1.0 : 0.0;
    }

    public static e c2() {
        return e.f;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof e ? this.c == ((e)object0).c : false;
    }

    public static e f2() {
        return e.e;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public int g0(int v) {
        return this.c;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return this.c ? r.t : r.u;
    }

    // 去混淆评级： 低(20)
    protected Object h2() {
        return this.c ? e.e : e.f;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.c ? 3 : 1;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public long i0(long v) {
        return this.c ? 1L : 0L;
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return this.c ? "true" : "false";
    }

    // 去混淆评级： 低(20)
    public static e k2(boolean z) {
        return z ? e.e : e.f;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean q0() {
        return this.c;
    }
}

