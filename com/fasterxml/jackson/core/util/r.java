package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.v;
import java.io.IOException;
import java.io.Serializable;

public class r implements v, Serializable {
    protected String a;
    protected w b;
    private static final long c = 1L;

    public r() {
        this(" ");
    }

    public r(String s) {
        this.a = s;
        this.b = v.q2.n(a.c);
    }

    @Override  // com.fasterxml.jackson.core.v
    public void a(k k0) throws IOException {
        String s = this.a;
        if(s != null) {
            k0.r4(s);
        }
    }

    @Override  // com.fasterxml.jackson.core.v
    public void b(k k0) throws IOException {
        k0.p4(this.b.b());
    }

    @Override  // com.fasterxml.jackson.core.v
    public void c(k k0) throws IOException {
    }

    @Override  // com.fasterxml.jackson.core.v
    public void d(k k0, int v) throws IOException {
        k0.p4(']');
    }

    @Override  // com.fasterxml.jackson.core.v
    public void e(k k0) throws IOException {
        k0.p4(this.b.f());
    }

    @Override  // com.fasterxml.jackson.core.v
    public void f(k k0) throws IOException {
        k0.p4('[');
    }

    @Override  // com.fasterxml.jackson.core.v
    public void g(k k0) throws IOException {
        k0.p4('{');
    }

    @Override  // com.fasterxml.jackson.core.v
    public void h(k k0) throws IOException {
    }

    @Override  // com.fasterxml.jackson.core.v
    public void i(k k0) throws IOException {
        k0.p4(this.b.d());
    }

    public void j(String s) {
        this.a = s;
    }

    @Override  // com.fasterxml.jackson.core.v
    public void k(k k0, int v) throws IOException {
        k0.p4('}');
    }

    public r l(w w0) {
        this.b = w0;
        return this;
    }
}

