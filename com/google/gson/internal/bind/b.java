package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.stream.d;
import j..util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class b extends d {
    class a extends Writer {
        a() {
            super();
        }

        @Override
        public void close() {
            throw new AssertionError();
        }

        @Override
        public void flush() {
            throw new AssertionError();
        }

        @Override
        public void write(char[] arr_c, int v, int v1) {
            throw new AssertionError();
        }
    }

    private final List m;
    private String n;
    private j o;
    private static final Writer p;
    private static final p q;

    static {
        b.p = new a();
        b.q = new p("closed");
    }

    public b() {
        super(b.p);
        this.m = new ArrayList();
        this.o = l.a;
    }

    @Override  // com.google.gson.stream.d
    public d E0(String s) throws IOException {
        if(s == null) {
            return this.v();
        }
        this.b1(new p(s));
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d L0(boolean z) throws IOException {
        this.b1(new p(Boolean.valueOf(z)));
        return this;
    }

    public j Y0() {
        if(!this.m.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + this.m);
        }
        return this.o;
    }

    private j a1() {
        return (j)this.m.get(this.m.size() - 1);
    }

    private void b1(j j0) {
        if(this.n != null) {
            ((m)this.a1()).z(this.n, j0);
            this.n = null;
            return;
        }
        if(this.m.isEmpty()) {
            this.o = j0;
            return;
        }
        j j1 = this.a1();
        if(!(j1 instanceof g)) {
            throw new IllegalStateException();
        }
        ((g)j1).z(j0);
    }

    @Override  // com.google.gson.stream.d
    public d c() throws IOException {
        g g0 = new g();
        this.b1(g0);
        this.m.add(g0);
        return this;
    }

    @Override  // com.google.gson.stream.d
    public void close() throws IOException {
        if(!this.m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.m.add(b.q);
    }

    @Override  // com.google.gson.stream.d
    public d e() throws IOException {
        m m0 = new m();
        this.b1(m0);
        this.m.add(m0);
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d f0(double f) throws IOException {
        if(!this.o() && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        this.b1(new p(f));
        return this;
    }

    @Override  // com.google.gson.stream.d
    public void flush() throws IOException {
    }

    @Override  // com.google.gson.stream.d
    public d h0(float f) throws IOException {
        if(!this.o() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        this.b1(new p(f));
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d i() throws IOException {
        if(this.m.isEmpty() || this.n != null || !(this.a1() instanceof g)) {
            throw new IllegalStateException();
        }
        this.m.remove(this.m.size() - 1);
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d j() throws IOException {
        if(this.m.isEmpty() || this.n != null || !(this.a1() instanceof m)) {
            throw new IllegalStateException();
        }
        this.m.remove(this.m.size() - 1);
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d l0(long v) throws IOException {
        this.b1(new p(v));
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d q(String s) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.gson.stream.d
    public d s(String s) throws IOException {
        Objects.requireNonNull(s, "name == null");
        if(this.m.isEmpty() || this.n != null || !(this.a1() instanceof m)) {
            throw new IllegalStateException();
        }
        this.n = s;
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d u0(Boolean boolean0) throws IOException {
        if(boolean0 == null) {
            return this.v();
        }
        this.b1(new p(boolean0));
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d v() throws IOException {
        this.b1(l.a);
        return this;
    }

    @Override  // com.google.gson.stream.d
    public d x0(Number number0) throws IOException {
        if(number0 == null) {
            return this.v();
        }
        if(!this.o()) {
            double f = number0.doubleValue();
            if(Double.isNaN(f) || Double.isInfinite(f)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number0);
            }
        }
        this.b1(new p(number0));
        return this;
    }
}

