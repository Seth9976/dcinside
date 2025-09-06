package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;
import java.util.Arrays;

public class d extends z {
    protected final byte[] c;
    private static final long d = 2L;
    static final d e;

    static {
        d.e = new d(new byte[0]);
    }

    public d(byte[] arr_b) {
        this.c = arr_b;
    }

    public d(byte[] arr_b, int v, int v1) {
        if(v == 0 && v1 == arr_b.length) {
            this.c = arr_b;
            return;
        }
        byte[] arr_b1 = new byte[v1];
        this.c = arr_b1;
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public n O0() {
        return n.b;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public final void P(k k0, I i0) throws IOException {
        k0.L2(i0.r0().p(), this.c, 0, this.c.length);
    }

    public static d c2(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        return arr_b.length == 0 ? d.e : new d(arr_b);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof d ? Arrays.equals(((d)object0).c, this.c) : false;
    }

    public static d f2(byte[] arr_b, int v, int v1) {
        if(arr_b == null) {
            return null;
        }
        return v1 == 0 ? d.e : new d(arr_b, v, v1);
    }

    @Override  // com.fasterxml.jackson.databind.node.z
    public r h() {
        return r.p;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public int hashCode() {
        return this.c == null ? -1 : this.c.length;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public String j0() {
        return b.a().k(this.c, false);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public byte[] p0() {
        return this.c;
    }
}

