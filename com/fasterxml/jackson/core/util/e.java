package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.v;
import com.fasterxml.jackson.core.w;
import java.io.IOException;
import java.io.Serializable;

public class e implements f, v, Serializable {
    public static class a extends c {
        public static final a b;

        static {
            a.b = new a();
        }

        @Override  // com.fasterxml.jackson.core.util.e$c
        public void a(k k0, int v) throws IOException {
            k0.p4(' ');
        }

        @Override  // com.fasterxml.jackson.core.util.e$c
        public boolean isInline() {
            return true;
        }
    }

    public interface b {
        void a(k arg1, int arg2) throws IOException;

        boolean isInline();
    }

    public static class c implements b, Serializable {
        public static final c a;

        static {
            c.a = new c();
        }

        @Override  // com.fasterxml.jackson.core.util.e$b
        public void a(k k0, int v) throws IOException {
        }

        @Override  // com.fasterxml.jackson.core.util.e$b
        public boolean isInline() {
            return true;
        }
    }

    protected b a;
    protected b b;
    protected w c;
    @Deprecated
    protected boolean d;
    protected transient int e;
    protected com.fasterxml.jackson.core.util.w f;
    protected String g;
    protected String h;
    protected String i;
    private static final long j = 1L;
    @Deprecated
    public static final q k;

    static {
        e.k = new q(" ");
    }

    public e() {
        this(v.q2);
    }

    public e(e e0) {
        this.c = e0.c;
        this.a = e0.a;
        this.b = e0.b;
        this.d = e0.d;
        this.e = e0.e;
        this.f = e0.f;
        this.g = e0.g;
        this.h = e0.h;
        this.i = e0.i;
    }

    @Deprecated
    public e(e e0, w w0) {
        this.a = e0.a;
        this.b = e0.b;
        this.d = e0.d;
        this.e = e0.e;
        this.f = e0.f;
        this.g = e0.g;
        this.h = e0.h;
        this.i = e0.i;
        this.c = w0;
    }

    public e(com.fasterxml.jackson.core.util.w w0) {
        this.a = a.b;
        this.b = d.g;
        this.d = true;
        this.f = w0;
        this.c = new q(" ");
        this.g = w0.g().a(w0.f());
        this.h = w0.e().a(w0.d());
        this.i = w0.c().a(w0.b());
    }

    @Deprecated
    public e(w w0) {
        String s = w0.getValue();
        this(v.q2.o(s));
    }

    @Deprecated
    public e(String s) {
        this((s == null ? null : new q(s)));
    }

    @Override  // com.fasterxml.jackson.core.v
    public void a(k k0) throws IOException {
        w w0 = this.c;
        if(w0 != null) {
            k0.q4(w0);
        }
    }

    @Override  // com.fasterxml.jackson.core.v
    public void b(k k0) throws IOException {
        k0.r4(this.i);
        this.a.a(k0, this.e);
    }

    @Override  // com.fasterxml.jackson.core.v
    public void c(k k0) throws IOException {
        this.b.a(k0, this.e);
    }

    @Override  // com.fasterxml.jackson.core.v
    public void d(k k0, int v) throws IOException {
        if(!this.a.isInline()) {
            --this.e;
        }
        if(v > 0) {
            this.a.a(k0, this.e);
        }
        else {
            k0.p4(' ');
        }
        k0.p4(']');
    }

    @Override  // com.fasterxml.jackson.core.v
    public void e(k k0) throws IOException {
        k0.r4(this.g);
    }

    @Override  // com.fasterxml.jackson.core.v
    public void f(k k0) throws IOException {
        if(!this.a.isInline()) {
            ++this.e;
        }
        k0.p4('[');
    }

    @Override  // com.fasterxml.jackson.core.v
    public void g(k k0) throws IOException {
        k0.p4('{');
        if(!this.b.isInline()) {
            ++this.e;
        }
    }

    @Override  // com.fasterxml.jackson.core.v
    public void h(k k0) throws IOException {
        this.a.a(k0, this.e);
    }

    @Override  // com.fasterxml.jackson.core.v
    public void i(k k0) throws IOException {
        k0.r4(this.h);
        this.b.a(k0, this.e);
    }

    @Override  // com.fasterxml.jackson.core.util.f
    public Object j() {
        return this.m();
    }

    @Override  // com.fasterxml.jackson.core.v
    public void k(k k0, int v) throws IOException {
        if(!this.b.isInline()) {
            --this.e;
        }
        if(v > 0) {
            this.b.a(k0, this.e);
        }
        else {
            k0.p4(' ');
        }
        k0.p4('}');
    }

    protected e l(boolean z) {
        if(this.d == z) {
            return this;
        }
        e e0 = this.u(this.f.n((z ? com.fasterxml.jackson.core.util.w.a.f : com.fasterxml.jackson.core.util.w.a.c)));
        e0.d = z;
        return e0;
    }

    public e m() {
        if(this.getClass() != e.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + this.getClass().getName() + " does not override method; it has to");
        }
        return new e(this);
    }

    public void n(b e$b0) {
        if(e$b0 == null) {
            e$b0 = c.a;
        }
        this.a = e$b0;
    }

    public void o(b e$b0) {
        if(e$b0 == null) {
            e$b0 = c.a;
        }
        this.b = e$b0;
    }

    public e p(b e$b0) {
        if(e$b0 == null) {
            e$b0 = c.a;
        }
        if(this.a == e$b0) {
            return this;
        }
        e e0 = new e(this);
        e0.a = e$b0;
        return e0;
    }

    public e q(b e$b0) {
        if(e$b0 == null) {
            e$b0 = c.a;
        }
        if(this.b == e$b0) {
            return this;
        }
        e e0 = new e(this);
        e0.b = e$b0;
        return e0;
    }

    @Deprecated
    public e r(w w0) {
        if(this.c != w0 && (w0 == null || !w0.equals(this.c))) {
            com.fasterxml.jackson.core.util.w w1 = this.f.o((w0 == null ? null : w0.getValue()));
            return new e(this).u(w1);
        }
        return this;
    }

    @Deprecated
    public e s(String s) {
        return s == null ? this.r(null) : this.r(new q(s));
    }

    public e u(com.fasterxml.jackson.core.util.w w0) {
        e e0 = new e(this);
        e0.f = w0;
        e0.c = new q(" ");
        e0.g = w0.g().a(w0.f());
        e0.h = w0.e().a(w0.d());
        e0.i = w0.c().a(w0.b());
        return e0;
    }

    @Deprecated
    public e w() {
        return this.l(true);
    }

    @Deprecated
    public e x() {
        return this.l(false);
    }
}

