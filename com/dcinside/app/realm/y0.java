package com.dcinside.app.realm;

import com.dcinside.app.util.jl;
import h3.e;
import io.realm.T0;
import io.realm.d1;
import io.realm.h3;
import io.realm.internal.s;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class y0 extends d1 implements h3 {
    @e
    @m
    private String d;
    private long e;
    @l
    private T0 f;

    public y0() {
        if(this instanceof s) {
            ((s)this).m2();
        }
        this.x1(new T0());
    }

    @Override  // io.realm.h3
    public String C() {
        return this.d;
    }

    @Override  // io.realm.h3
    public long E2() {
        return this.e;
    }

    @Override  // io.realm.h3
    public T0 Q0() {
        return this.f;
    }

    @l
    public T0 Q5() {
        return this.Q0();
    }

    public long R5() {
        return this.E2();
    }

    @m
    public String S5() {
        return this.C();
    }

    public final boolean T5() {
        return System.currentTimeMillis() - this.R5() < TimeUnit.SECONDS.toMillis(jl.a.S());
    }

    @Override  // io.realm.h3
    public void U(String s) {
        this.d = s;
    }

    public void U5(@l T0 t00) {
        L.p(t00, "<set-?>");
        this.x1(t00);
    }

    public void V5(long v) {
        this.b2(v);
    }

    public void W5(@m String s) {
        this.U(s);
    }

    @Override  // io.realm.h3
    public void b2(long v) {
        this.e = v;
    }

    @Override  // io.realm.h3
    public void x1(T0 t00) {
        this.f = t00;
    }
}

