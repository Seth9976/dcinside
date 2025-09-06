package com.dcinside.app.memo;

import h3.c;
import io.realm.H1;
import io.realm.d1;
import io.realm.internal.s;

public class m extends d1 implements H1 {
    @c
    @y4.m
    private String d;
    private long e;

    public m() {
        if(this instanceof s) {
            ((s)this).m2();
        }
    }

    @Override  // io.realm.H1
    public void O3(long v) {
        this.e = v;
    }

    public long Q5() {
        return this.d4();
    }

    @y4.m
    public String R5() {
        return this.f();
    }

    public void S5(long v) {
        this.O3(v);
    }

    public void T5(@y4.m String s) {
        this.e(s);
    }

    @Override  // io.realm.H1
    public long d4() {
        return this.e;
    }

    @Override  // io.realm.H1
    public void e(String s) {
        this.d = s;
    }

    @Override  // io.realm.H1
    public String f() {
        return this.d;
    }
}

