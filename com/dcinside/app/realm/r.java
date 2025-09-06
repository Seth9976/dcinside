package com.dcinside.app.realm;

import io.realm.d1;
import io.realm.internal.s;
import io.realm.p2;
import y4.m;

public class r extends d1 implements p2 {
    private boolean d;
    private boolean e;
    @m
    private String f;
    @m
    private String g;
    @m
    private String h;
    @m
    private String i;
    @m
    private String j;

    public r() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.p2
    public void A0(String s) {
        this.j = s;
    }

    @Override  // io.realm.p2
    public void E3(String s) {
        this.f = s;
    }

    @Override  // io.realm.p2
    public void J3(String s) {
        this.i = s;
    }

    @Override  // io.realm.p2
    public void L3(boolean z) {
        this.d = z;
    }

    @Override  // io.realm.p2
    public String N2() {
        return this.f;
    }

    @Override  // io.realm.p2
    public String Q3() {
        return this.j;
    }

    public boolean Q5() {
        return this.Z0();
    }

    @m
    public String R5() {
        return this.z1();
    }

    public boolean S5() {
        return this.y0();
    }

    @m
    public String T5() {
        return this.N2();
    }

    @m
    public String U5() {
        return this.n2();
    }

    @m
    public String V5() {
        return this.k1();
    }

    @m
    public String W5() {
        return this.Q3();
    }

    public void X5(boolean z) {
        this.g4(z);
    }

    public void Y5(@m String s) {
        this.b5(s);
    }

    @Override  // io.realm.p2
    public boolean Z0() {
        return this.e;
    }

    public void Z5(boolean z) {
        this.L3(z);
    }

    public void a6(@m String s) {
        this.E3(s);
    }

    @Override  // io.realm.p2
    public void b5(String s) {
        this.h = s;
    }

    public void b6(@m String s) {
        this.J3(s);
    }

    public void c6(@m String s) {
        this.l5(s);
    }

    public void d6(@m String s) {
        this.A0(s);
    }

    @Override  // io.realm.p2
    public void g4(boolean z) {
        this.e = z;
    }

    @Override  // io.realm.p2
    public String k1() {
        return this.g;
    }

    @Override  // io.realm.p2
    public void l5(String s) {
        this.g = s;
    }

    @Override  // io.realm.p2
    public String n2() {
        return this.i;
    }

    @Override  // io.realm.p2
    public boolean y0() {
        return this.d;
    }

    @Override  // io.realm.p2
    public String z1() {
        return this.h;
    }
}

