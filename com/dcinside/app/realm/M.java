package com.dcinside.app.realm;

import io.realm.d1;
import io.realm.h2;
import io.realm.internal.s;

public class m extends d1 implements h2 {
    @y4.m
    private String d;
    @y4.m
    private String e;
    private int f;
    private int g;

    public m() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.j0(-1);
    }

    @Override  // io.realm.h2
    public int H() {
        return this.f;
    }

    @Override  // io.realm.h2
    public void N(int v) {
        this.f = v;
    }

    @Override  // io.realm.h2
    public int N0() {
        return this.g;
    }

    public int Q5() {
        return this.H();
    }

    @y4.m
    public String R5() {
        return this.m();
    }

    @y4.m
    public String S5() {
        return this.f();
    }

    public int T5() {
        return this.N0();
    }

    public void U5(int v) {
        this.N(v);
    }

    public void V5(@y4.m String s) {
        this.q(s);
    }

    public void W5(@y4.m String s) {
        this.e(s);
    }

    public void X5(int v) {
        this.j0(v);
    }

    @Override  // io.realm.h2
    public void e(String s) {
        this.e = s;
    }

    @Override  // io.realm.h2
    public String f() {
        return this.e;
    }

    @Override  // io.realm.h2
    public void j0(int v) {
        this.g = v;
    }

    @Override  // io.realm.h2
    public String m() {
        return this.d;
    }

    @Override  // io.realm.h2
    public void q(String s) {
        this.d = s;
    }
}

