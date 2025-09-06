package com.dcinside.app.memo;

import h3.e;
import io.realm.L1;
import io.realm.T0;
import io.realm.d1;
import io.realm.internal.s;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class n extends d1 implements L1 {
    @e
    @m
    private String d;
    @l
    private T0 e;

    public n() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.j5(new T0());
    }

    @m
    public String Q5() {
        return this.a();
    }

    @l
    public T0 R5() {
        return this.r2();
    }

    public void S5(@m String s) {
        this.b(s);
    }

    public void T5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.j5(t00);
    }

    @Override  // io.realm.L1
    public String a() {
        return this.d;
    }

    @Override  // io.realm.L1
    public void b(String s) {
        this.d = s;
    }

    @Override  // io.realm.L1
    public void j5(T0 t00) {
        this.e = t00;
    }

    @Override  // io.realm.L1
    public T0 r2() {
        return this.e;
    }
}

