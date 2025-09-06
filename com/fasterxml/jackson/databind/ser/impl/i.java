package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.w;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.r;

public final class i {
    public final m a;
    public final w b;
    public final N c;
    public final r d;
    public final boolean e;

    protected i(m m0, w w0, N n0, r r0, boolean z) {
        this.a = m0;
        this.b = w0;
        this.c = n0;
        this.d = r0;
        this.e = z;
    }

    public static i a(m m0, B b0, N n0, boolean z) {
        String s = b0 == null ? null : b0.d();
        return s == null ? new i(m0, null, n0, null, z) : new i(m0, new q(s), n0, null, z);
    }

    public i b(boolean z) {
        return z == this.e ? this : new i(this.a, this.b, this.c, this.d, z);
    }

    public i c(r r0) {
        return new i(this.a, this.b, this.c, r0, this.e);
    }
}

