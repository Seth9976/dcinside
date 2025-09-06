package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.jsonFormatVisitors.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.ser.std.L;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

@b
public class t extends L {
    public t() {
        super(Blob.class);
    }

    protected void P(Blob blob0, k k0, I i0) throws IOException {
        InputStream inputStream0;
        try {
            inputStream0 = blob0.getBinaryStream();
        }
        catch(SQLException sQLException0) {
            i0.M0(sQLException0, "Failed to access `java.sql.Blob` value to write as binary value", new Object[0]);
            inputStream0 = null;
        }
        k0.C2(i0.r0().p(), inputStream0, -1);
    }

    public boolean Q(I i0, Blob blob0) {
        return blob0 == null;
    }

    public void R(Blob blob0, k k0, I i0) throws IOException {
        this.P(blob0, k0, i0);
    }

    public void S(Blob blob0, k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(blob0, r.p));
        this.P(blob0, k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void e(g g0, m m0) throws o {
        com.fasterxml.jackson.databind.jsonFormatVisitors.b b0 = g0.r(m0);
        if(b0 != null) {
            b0.d(d.c);
        }
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.Q(i0, ((Blob)object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, k k0, I i0) throws IOException {
        this.R(((Blob)object0), k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void n(Object object0, k k0, I i0, j j0) throws IOException {
        this.S(((Blob)object0), k0, i0, j0);
    }
}

