package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.ser.k;
import java.io.IOException;
import java.net.InetAddress;

public class p extends L implements k {
    protected final boolean d;

    public p() {
        this(false);
    }

    public p(boolean z) {
        super(InetAddress.class);
        this.d = z;
    }

    public void P(InetAddress inetAddress0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        String s;
        if(this.d) {
            s = inetAddress0.getHostAddress();
        }
        else {
            s = inetAddress0.toString().trim();
            int v = s.indexOf(0x2F);
            if(v >= 0) {
                s = v == 0 ? s.substring(1) : s.substring(0, v);
            }
        }
        k0.d(s);
    }

    public void Q(InetAddress inetAddress0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.h(inetAddress0, InetAddress.class, r.q));
        this.P(inetAddress0, k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public com.fasterxml.jackson.databind.r c(I i0, d d0) throws o {
        com.fasterxml.jackson.annotation.n.d n$d0 = this.C(i0, d0, this.g());
        boolean z = n$d0 != null && n$d0.m() == com.fasterxml.jackson.annotation.n.c.d;
        return z == this.d ? this : new p(z);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.P(((InetAddress)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
        this.Q(((InetAddress)object0), k0, i0, j0);
    }
}

