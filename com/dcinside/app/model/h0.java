package com.dcinside.app.model;

import com.google.gson.annotations.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class h0 extends f0 {
    @c("trans_info")
    @m
    private final g0 e;

    public h0() {
        this(null, 1, null);
    }

    public h0(@m g0 g00) {
        this.e = g00;
    }

    public h0(g0 g00, int v, w w0) {
        if((v & 1) != 0) {
            g00 = null;
        }
        this(g00);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h0 ? L.g(this.e, ((h0)object0).e) : false;
    }

    @m
    public final g0 g() {
        return this.e;
    }

    @l
    public final h0 h(@m g0 g00) {
        return new h0(g00);
    }

    @Override
    public int hashCode() {
        return this.e == null ? 0 : this.e.hashCode();
    }

    public static h0 i(h0 h00, g0 g00, int v, Object object0) {
        if((v & 1) != 0) {
            g00 = h00.e;
        }
        return h00.h(g00);
    }

    @m
    public final g0 l() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        return "TransferResult(transferInfo=" + this.e + ")";
    }
}

