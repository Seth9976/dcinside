package com.dcinside.app.realm;

import h3.e;
import io.realm.P1;
import io.realm.d1;
import io.realm.internal.s;
import y4.m;

public class c extends d1 implements P1 {
    @e
    private long d;
    @m
    private String e;
    @h3.c
    private long f;

    public c() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.P1
    public void K0(long v) {
        this.d = v;
    }

    public long Q5() {
        return this.i();
    }

    @m
    public String R5() {
        return this.f();
    }

    public long S5() {
        return this.t0();
    }

    public void T5(long v) {
        this.K0(v);
    }

    @Override  // io.realm.P1
    public void U4(long v) {
        this.f = v;
    }

    public void U5(@m String s) {
        this.e(s);
    }

    public void V5(long v) {
        this.U4(v);
    }

    @Override  // io.realm.P1
    public void e(String s) {
        this.e = s;
    }

    @Override  // io.realm.P1
    public String f() {
        return this.e;
    }

    @Override  // io.realm.P1
    public long i() {
        return this.d;
    }

    @Override  // io.realm.P1
    public long t0() {
        return this.f;
    }
}

