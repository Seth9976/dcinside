package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class a {
    protected final h[] a;
    protected final d b;
    protected final d c;
    protected final int d;
    public static final int e = 0x40;

    public a(Collection collection0) {
        this(((h[])collection0.toArray(new h[0])));
    }

    public a(h[] arr_h) {
        this(arr_h, d.d, d.c, 0x40);
    }

    private a(h[] arr_h, d d0, d d1, int v) {
        this.a = arr_h;
        this.b = d0;
        this.c = d1;
        this.d = v;
    }

    private b a(com.fasterxml.jackson.core.format.c.a c$a0) throws IOException {
        h[] arr_h = this.a;
        h h0 = null;
        d d0 = null;
        for(int v = 0; v < arr_h.length; ++v) {
            h h1 = arr_h[v];
            c$a0.reset();
            d d1 = h1.W0(c$a0);
            if(d1 != null && d1.ordinal() >= this.c.ordinal() && (h0 == null || d0.ordinal() < d1.ordinal())) {
                if(d1.ordinal() >= this.b.ordinal()) {
                    return c$a0.b(h1, d1);
                }
                h0 = h1;
                d0 = d1;
            }
        }
        return c$a0.b(h0, d0);
    }

    public b b(InputStream inputStream0) throws IOException {
        return this.a(new com.fasterxml.jackson.core.format.c.a(inputStream0, new byte[this.d]));
    }

    public b c(byte[] arr_b) throws IOException {
        return this.a(new com.fasterxml.jackson.core.format.c.a(arr_b));
    }

    public b d(byte[] arr_b, int v, int v1) throws IOException {
        return this.a(new com.fasterxml.jackson.core.format.c.a(arr_b, v, v1));
    }

    public a e(int v) {
        return v == this.d ? this : new a(this.a, this.b, this.c, v);
    }

    public a f(d d0) {
        return d0 == this.c ? this : new a(this.a, this.b, d0, this.d);
    }

    public a g(d d0) {
        return d0 == this.b ? this : new a(this.a, d0, this.c, this.d);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        h[] arr_h = this.a;
        if(arr_h.length > 0) {
            stringBuilder0.append("JSON");
            for(int v = 1; v < arr_h.length; ++v) {
                stringBuilder0.append(", ");
                stringBuilder0.append("JSON");
            }
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

