package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.io.k;
import com.fasterxml.jackson.core.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class b {
    protected final InputStream a;
    protected final byte[] b;
    protected final int c;
    protected final int d;
    protected final h e;
    protected final d f;

    protected b(InputStream inputStream0, byte[] arr_b, int v, int v1, h h0, d d0) {
        this.a = inputStream0;
        this.b = arr_b;
        this.c = v;
        this.d = v1;
        this.e = h0;
        this.f = d0;
        if((v | v1) < 0 || v + v1 > arr_b.length) {
            throw new IllegalArgumentException(String.format("Illegal start/length (%d/%d) wrt input array of %d bytes", v, v1, ((int)arr_b.length)));
        }
    }

    public n a() throws IOException {
        h h0 = this.e;
        if(h0 == null) {
            return null;
        }
        return this.a == null ? h0.B(this.b, this.c, this.d) : h0.w(this.b());
    }

    public InputStream b() {
        return this.a == null ? new ByteArrayInputStream(this.b, this.c, this.d) : new k(null, this.a, this.b, this.c, this.d);
    }

    public h c() {
        return this.e;
    }

    public d d() {
        return this.f == null ? d.b : this.f;
    }

    // 去混淆评级： 低(40)
    public String e() {
        return this.f() ? "JSON" : null;
    }

    public boolean f() {
        return this.e != null;
    }
}

