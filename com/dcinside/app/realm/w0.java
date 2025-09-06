package com.dcinside.app.realm;

import h3.e;
import io.realm.T0;
import io.realm.d1;
import io.realm.d3;
import io.realm.internal.s;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class w0 extends d1 implements d3 {
    @e
    private long d;
    private long e;
    @m
    private String f;
    @l
    private T0 g;

    public w0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.d2(new T0());
    }

    @Override  // io.realm.d3
    public long P() {
        return this.e;
    }

    @l
    public T0 Q5() {
        return this.T1();
    }

    public long R5() {
        return this.m();
    }

    @Override  // io.realm.d3
    public void S(long v) {
        this.d = v;
    }

    public long S5() {
        return this.P();
    }

    @Override  // io.realm.d3
    public T0 T1() {
        return this.g;
    }

    @m
    public String T5() {
        return this.f();
    }

    public void U5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.d2(t00);
    }

    public void V5(long v) {
        this.S(v);
    }

    public void W5(long v) {
        this.Z(v);
    }

    public void X5(@m String s) {
        this.e(s);
    }

    @Override  // io.realm.d3
    public void Z(long v) {
        this.e = v;
    }

    @Override  // io.realm.d3
    public void d2(T0 t00) {
        this.g = t00;
    }

    @Override  // io.realm.d3
    public void e(String s) {
        this.f = s;
    }

    @Override  // io.realm.d3
    public String f() {
        return this.f;
    }

    @Override  // io.realm.d3
    public long m() {
        return this.d;
    }
}

