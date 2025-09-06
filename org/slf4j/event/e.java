package org.slf4j.event;

import org.slf4j.helpers.k;

public class e implements d {
    c a;
    org.slf4j.d b;
    String c;
    k d;
    String e;
    String f;
    Object[] g;
    long h;
    Throwable i;

    @Override  // org.slf4j.event.d
    public Object[] a() {
        return this.g;
    }

    @Override  // org.slf4j.event.d
    public org.slf4j.d b() {
        return this.b;
    }

    @Override  // org.slf4j.event.d
    public String c() {
        return this.e;
    }

    @Override  // org.slf4j.event.d
    public long d() {
        return this.h;
    }

    @Override  // org.slf4j.event.d
    public String e() {
        return this.c;
    }

    @Override  // org.slf4j.event.d
    public c f() {
        return this.a;
    }

    @Override  // org.slf4j.event.d
    public Throwable g() {
        return this.i;
    }

    @Override  // org.slf4j.event.d
    public String getMessage() {
        return this.f;
    }

    public k h() {
        return this.d;
    }

    public void i(Object[] arr_object) {
        this.g = arr_object;
    }

    public void j(c c0) {
        this.a = c0;
    }

    public void k(k k0) {
        this.d = k0;
    }

    public void l(String s) {
        this.c = s;
    }

    public void m(org.slf4j.d d0) {
        this.b = d0;
    }

    public void n(String s) {
        this.f = s;
    }

    public void o(String s) {
        this.e = s;
    }

    public void p(Throwable throwable0) {
        this.i = throwable0;
    }

    public void q(long v) {
        this.h = v;
    }
}

