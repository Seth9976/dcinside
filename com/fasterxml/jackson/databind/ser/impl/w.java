package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import java.io.IOException;

public final class w {
    public final N a;
    public Object b;
    protected boolean c;

    public w(N n0) {
        this.c = false;
        this.a = n0;
    }

    public Object a(Object object0) {
        if(this.b == null) {
            this.b = this.a.c(object0);
        }
        return this.b;
    }

    public void b(k k0, I i0, i i1) throws IOException {
        this.c = true;
        if(k0.w()) {
            k0.k4((this.b == null ? null : String.valueOf(this.b)));
            return;
        }
        com.fasterxml.jackson.core.w w0 = i1.b;
        if(w0 != null) {
            k0.s3(w0);
            i1.d.m(this.b, k0, i0);
        }
    }

    public boolean c(k k0, I i0, i i1) throws IOException {
        if(this.b != null && (this.c || i1.e)) {
            if(k0.w()) {
                k0.l4(String.valueOf(this.b));
                return true;
            }
            i1.d.m(this.b, k0, i0);
            return true;
        }
        return false;
    }
}

