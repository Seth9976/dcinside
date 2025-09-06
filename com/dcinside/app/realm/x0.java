package com.dcinside.app.realm;

import h3.e;
import io.realm.d1;
import io.realm.f3;
import io.realm.internal.s;
import y4.m;

public class x0 extends d1 implements f3 {
    @e
    @m
    private String d;
    @m
    private String e;
    private boolean f;
    private boolean g;
    @m
    private String h;

    public x0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.f3
    public boolean D1() {
        return this.g;
    }

    @Override  // io.realm.f3
    public void P3(boolean z) {
        this.f = z;
    }

    @m
    public String Q5() {
        return this.m();
    }

    @m
    public String R5() {
        return this.Z3();
    }

    @m
    public String S5() {
        return this.f();
    }

    public boolean T5() {
        return this.f2();
    }

    public boolean U5() {
        return this.D1();
    }

    public void V5(@m String s) {
        this.q(s);
    }

    public void W5(@m String s) {
        this.y3(s);
    }

    public void X5(boolean z) {
        this.P3(z);
    }

    public void Y5(@m String s) {
        this.e(s);
    }

    @Override  // io.realm.f3
    public String Z3() {
        return this.h;
    }

    public void Z5(boolean z) {
        this.k3(z);
    }

    @Override  // io.realm.f3
    public void e(String s) {
        this.e = s;
    }

    @Override  // io.realm.f3
    public String f() {
        return this.e;
    }

    @Override  // io.realm.f3
    public boolean f2() {
        return this.f;
    }

    @Override  // io.realm.f3
    public void k3(boolean z) {
        this.g = z;
    }

    @Override  // io.realm.f3
    public String m() {
        return this.d;
    }

    @Override  // io.realm.f3
    public void q(String s) {
        this.d = s;
    }

    @Override  // io.realm.f3
    public void y3(String s) {
        this.h = s;
    }
}

