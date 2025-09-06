package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.core.util.z;
import com.fasterxml.jackson.databind.d;
import java.io.IOException;

public abstract class j {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.annotation.H.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.fasterxml.jackson.annotation.H.a.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.H.a.b.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final void a(k k0, c c0) throws IOException {
        c0.g = !k0.x();
        this.v(k0, c0);
    }

    public abstract j b(d arg1);

    public abstract String c();

    public abstract g d();

    public abstract com.fasterxml.jackson.annotation.H.a e();

    public c f(Object object0, r r0) {
        c c0 = new c(object0, r0);
        switch(this.e()) {
            case 1: {
                c0.e = com.fasterxml.jackson.core.type.c.a.d;
                c0.d = this.c();
                return c0;
            }
            case 2: {
                c0.e = com.fasterxml.jackson.core.type.c.a.e;
                c0.d = this.c();
                return c0;
            }
            case 3: {
                c0.e = com.fasterxml.jackson.core.type.c.a.c;
                c0.d = this.c();
                return c0;
            }
            case 4: {
                c0.e = com.fasterxml.jackson.core.type.c.a.a;
                return c0;
            }
            case 5: {
                c0.e = com.fasterxml.jackson.core.type.c.a.b;
                return c0;
            }
            default: {
                z.f();
                return c0;
            }
        }
    }

    public c g(Object object0, r r0, Object object1) {
        c c0 = this.f(object0, r0);
        c0.c = object1;
        return c0;
    }

    public c h(Object object0, Class class0, r r0) {
        c c0 = this.f(object0, r0);
        c0.b = class0;
        return c0;
    }

    @Deprecated
    public void i(Object object0, k k0, String s) throws IOException {
        this.o(k0, this.g(object0, r.m, s));
    }

    @Deprecated
    public void j(Object object0, k k0, String s) throws IOException {
        this.o(k0, this.g(object0, r.k, s));
    }

    @Deprecated
    public void k(Object object0, k k0, String s) throws IOException {
        this.o(k0, this.g(object0, r.q, s));
    }

    @Deprecated
    public void l(Object object0, k k0, String s) throws IOException {
        this.a(k0, this.g(object0, r.m, s));
    }

    @Deprecated
    public void m(Object object0, k k0, String s) throws IOException {
        this.a(k0, this.g(object0, r.k, s));
    }

    @Deprecated
    public void n(Object object0, k k0, String s) throws IOException {
        this.a(k0, this.g(object0, r.q, s));
    }

    public abstract c o(k arg1, c arg2) throws IOException;

    @Deprecated
    public void p(Object object0, k k0) throws IOException {
        this.o(k0, this.f(object0, r.m));
    }

    @Deprecated
    public void q(Object object0, k k0, Class class0) throws IOException {
        this.o(k0, this.h(object0, class0, r.m));
    }

    @Deprecated
    public void r(Object object0, k k0) throws IOException {
        this.o(k0, this.f(object0, r.k));
    }

    @Deprecated
    public void s(Object object0, k k0, Class class0) throws IOException {
        this.o(k0, this.h(object0, class0, r.k));
    }

    @Deprecated
    public void t(Object object0, k k0) throws IOException {
        this.o(k0, this.f(object0, r.q));
    }

    @Deprecated
    public void u(Object object0, k k0, Class class0) throws IOException {
        this.o(k0, this.h(object0, class0, r.q));
    }

    public abstract c v(k arg1, c arg2) throws IOException;

    @Deprecated
    public void w(Object object0, k k0) throws IOException {
        this.a(k0, this.f(object0, r.m));
    }

    @Deprecated
    public void x(Object object0, k k0) throws IOException {
        this.a(k0, this.f(object0, r.k));
    }

    @Deprecated
    public void y(Object object0, k k0) throws IOException {
        this.a(k0, this.f(object0, r.q));
    }
}

