package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.async.b;
import com.fasterxml.jackson.core.async.c;
import com.fasterxml.jackson.core.io.g;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class a extends d implements b {
    private ByteBuffer bb;

    public a(g g0, int v, com.fasterxml.jackson.core.sym.a a0) {
        super(g0, v, a0);
        this.bb = ByteBuffer.wrap(com.fasterxml.jackson.core.base.d.H);
    }

    @Override  // com.fasterxml.jackson.core.json.async.d
    protected byte W7(int v) {
        return this.bb.get(v);
    }

    @Override  // com.fasterxml.jackson.core.json.async.d
    protected byte X7() {
        int v = this.a9;
        this.a9 = v + 1;
        return this.bb.get(v);
    }

    @Override  // com.fasterxml.jackson.core.json.async.d
    protected int Y7() {
        int v = this.a9;
        this.a9 = v + 1;
        return this.bb.get(v) & 0xFF;
    }

    @Override  // com.fasterxml.jackson.core.async.b
    public void b(ByteBuffer byteBuffer0) throws IOException {
        int v = this.a9;
        int v1 = this.b9;
        if(v < v1) {
            this.U4("Still have %d undecoded bytes, should not call \'feedInput\'", ((int)(v1 - v)));
        }
        int v2 = byteBuffer0.position();
        int v3 = byteBuffer0.limit();
        if(v3 < v2) {
            this.V4("Input end (%d) may not be before start (%d)", v3, v2);
        }
        if(this.O9) {
            this.T4("Already closed, can not feed more input");
        }
        this.c9 += (long)this.Ra;
        this.J4().n(this.c9);
        this.e9 = v2 - (this.b9 - this.e9);
        this.Q9 = v2;
        this.bb = byteBuffer0;
        this.a9 = v2;
        this.b9 = v3;
        this.Ra = v3 - v2;
    }

    @Override  // com.fasterxml.jackson.core.n
    public c g2() {
        return this;
    }

    @Override  // com.fasterxml.jackson.core.json.async.c
    public int y4(OutputStream outputStream0) throws IOException {
        int v = this.b9 - this.a9;
        if(v > 0) {
            Channels.newChannel(outputStream0).write(this.bb);
        }
        return v;
    }
}

