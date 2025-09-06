package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.format.d;
import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.io.k;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.y;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class m {
    public static class a extends com.fasterxml.jackson.core.format.c.a {
        public a(InputStream inputStream0, byte[] arr_b) {
            super(inputStream0, arr_b);
        }

        public a(byte[] arr_b) {
            super(arr_b);
        }

        public a(byte[] arr_b, int v, int v1) {
            super(arr_b, v, v1);
        }

        public b c(y y0, d d0) {
            return new b(this.a, this.b, this.c, this.d - this.c, y0, d0);
        }
    }

    public static class b {
        protected final InputStream a;
        protected final byte[] b;
        protected final int c;
        protected final int d;
        protected final y e;
        protected final d f;

        protected b(InputStream inputStream0, byte[] arr_b, int v, int v1, y y0, d d0) {
            this.a = inputStream0;
            this.b = arr_b;
            this.c = v;
            this.d = v1;
            this.e = y0;
            this.f = d0;
        }

        public n a() throws IOException {
            y y0 = this.e;
            if(y0 == null) {
                return null;
            }
            h h0 = y0.h();
            return this.a == null ? h0.B(this.b, this.c, this.d) : h0.w(this.b());
        }

        public InputStream b() {
            return this.a == null ? new ByteArrayInputStream(this.b, this.c, this.d) : new k(null, this.a, this.b, this.c, this.d);
        }

        public d c() {
            return this.f == null ? d.b : this.f;
        }

        // 去混淆评级： 低(20)
        public String d() {
            return "JSON";
        }

        public y e() {
            return this.e;
        }

        public boolean f() {
            return this.e != null;
        }
    }

    protected final y[] a;
    protected final d b;
    protected final d c;
    protected final int d;
    public static final int e = 0x40;

    public m(Collection collection0) {
        this(((y[])collection0.toArray(new y[collection0.size()])));
    }

    public m(y[] arr_y) {
        this(arr_y, d.d, d.c, 0x40);
    }

    private m(y[] arr_y, d d0, d d1, int v) {
        this.a = arr_y;
        this.b = d0;
        this.c = d1;
        this.d = v;
    }

    private b a(a m$a0) throws IOException {
        y[] arr_y = this.a;
        y y0 = null;
        d d0 = null;
        for(int v = 0; v < arr_y.length; ++v) {
            y y1 = arr_y[v];
            m$a0.reset();
            d d1 = y1.h().W0(m$a0);
            if(d1 != null && d1.ordinal() >= this.c.ordinal() && (y0 == null || d0.ordinal() < d1.ordinal())) {
                if(d1.ordinal() >= this.b.ordinal()) {
                    return m$a0.c(y1, d1);
                }
                y0 = y1;
                d0 = d1;
            }
        }
        return m$a0.c(y0, d0);
    }

    public b b(InputStream inputStream0) throws IOException {
        return this.a(new a(inputStream0, new byte[this.d]));
    }

    public b c(byte[] arr_b) throws IOException {
        return this.a(new a(arr_b));
    }

    public b d(byte[] arr_b, int v, int v1) throws IOException {
        return this.a(new a(arr_b, v, v1));
    }

    public m e(g g0) {
        y[] arr_y = new y[this.a.length];
        for(int v = 0; v < this.a.length; ++v) {
            arr_y[v] = this.a[v].x1(g0);
        }
        return new m(arr_y, this.b, this.c, this.d);
    }

    public m f(y[] arr_y) {
        return new m(arr_y, this.b, this.c, this.d);
    }

    public m g(int v) {
        return v == this.d ? this : new m(this.a, this.b, this.c, v);
    }

    public m h(d d0) {
        return d0 == this.c ? this : new m(this.a, this.b, d0, this.d);
    }

    public m i(d d0) {
        return d0 == this.b ? this : new m(this.a, d0, this.c, this.d);
    }

    public m j(com.fasterxml.jackson.databind.m m0) {
        y[] arr_y = new y[this.a.length];
        for(int v = 0; v < this.a.length; ++v) {
            arr_y[v] = this.a[v].q0(m0);
        }
        return new m(arr_y, this.b, this.c, this.d);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        y[] arr_y = this.a;
        if(arr_y.length > 0) {
            stringBuilder0.append("JSON");
            for(int v = 1; v < arr_y.length; ++v) {
                stringBuilder0.append(", ");
                stringBuilder0.append("JSON");
            }
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

