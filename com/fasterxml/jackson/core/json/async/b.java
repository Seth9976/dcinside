package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.async.a;
import com.fasterxml.jackson.core.async.c;
import com.fasterxml.jackson.core.io.g;
import java.io.IOException;
import java.io.OutputStream;

public class b extends d implements a {
    private byte[] bb;

    public b(g g0, int v, com.fasterxml.jackson.core.sym.a a0) {
        super(g0, v, a0);
        this.bb = com.fasterxml.jackson.core.base.d.H;
    }

    @Override  // com.fasterxml.jackson.core.json.async.d
    protected byte W7(int v) {
        return this.bb[v];
    }

    @Override  // com.fasterxml.jackson.core.json.async.d
    protected byte X7() {
        int v = this.a9;
        this.a9 = v + 1;
        return this.bb[v];
    }

    @Override  // com.fasterxml.jackson.core.json.async.d
    protected int Y7() {
        int v = this.a9;
        this.a9 = v + 1;
        return this.bb[v] & 0xFF;
    }

    public a Z7() [...] // Inlined contents

    @Override  // com.fasterxml.jackson.core.async.a
    public void c(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = this.a9;
        int v3 = this.b9;
        if(v2 < v3) {
            this.U4("Still have %d undecoded bytes, should not call \'feedInput\'", ((int)(v3 - v2)));
        }
        if(v1 < v) {
            this.V4("Input end (%d) may not be before start (%d)", v1, v);
        }
        if(this.O9) {
            this.T4("Already closed, can not feed more input");
        }
        this.c9 += (long)this.Ra;
        this.J4().n(this.c9);
        this.e9 = v - (this.b9 - this.e9);
        this.Q9 = v;
        this.bb = arr_b;
        this.a9 = v;
        this.b9 = v1;
        this.Ra = v1 - v;
    }

    @Override  // com.fasterxml.jackson.core.n
    public c g2() {
        return this;
    }

    @Override  // com.fasterxml.jackson.core.json.async.c
    public int y4(OutputStream outputStream0) throws IOException {
        int v = this.a9;
        int v1 = this.b9 - v;
        if(v1 > 0) {
            outputStream0.write(this.bb, v, v1);
        }
        return v1;
    }
}

