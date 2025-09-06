package com.facebook.drawee.components;

import k1.n.a;
import k1.n;

@n(a.a)
public class d {
    private boolean a;
    private int b;
    private int c;
    private static final int d = 4;

    public d() {
        this.a();
    }

    public void a() {
        this.a = false;
        this.b = 4;
        this.e();
    }

    public boolean b() {
        return this.a;
    }

    public static d c() {
        return new d();
    }

    public void d() {
        ++this.c;
    }

    public void e() {
        this.c = 0;
    }

    public void f(int v) {
        this.b = v;
    }

    public void g(boolean z) {
        this.a = z;
    }

    public boolean h() {
        return this.a && this.c < this.b;
    }
}

