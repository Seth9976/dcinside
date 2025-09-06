package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class q extends L {
    public q() {
        super(InetSocketAddress.class);
    }

    public void P(InetSocketAddress inetSocketAddress0, k k0, I i0) throws IOException {
        InetAddress inetAddress0 = inetSocketAddress0.getAddress();
        String s = inetAddress0 == null ? inetSocketAddress0.getHostName() : inetAddress0.toString().trim();
        int v = s.indexOf(0x2F);
        if(v >= 0) {
            if(v == 0) {
                s = inetAddress0 instanceof Inet6Address ? "[" + s.substring(1) + "]" : s.substring(1);
            }
            else {
                s = s.substring(0, v);
            }
        }
        k0.d(s + ":" + inetSocketAddress0.getPort());
    }

    public void Q(InetSocketAddress inetSocketAddress0, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.h(inetSocketAddress0, InetSocketAddress.class, r.q));
        this.P(inetSocketAddress0, k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.P(((InetSocketAddress)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.Q(((InetSocketAddress)object0), k0, i0, j0);
    }
}

