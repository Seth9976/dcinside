package com.google.common.hash;

import com.google.common.base.H;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@k
abstract class a extends d {
    private final ByteBuffer a;

    a() {
        this.a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J b(int v) {
        return this.b(v);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s b(int v) {
        this.a.putInt(v);
        return this.p(4);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J c(long v) {
        return this.c(v);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s c(long v) {
        this.a.putLong(v);
        return this.p(8);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J e(short v) {
        return this.e(v);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s e(short v) {
        this.a.putShort(v);
        return this.p(2);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J g(byte b) {
        return this.g(b);
    }

    @Override  // com.google.common.hash.s
    @O1.a
    public s g(byte b) {
        this.q(b);
        return this;
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J h(byte[] arr_b) {
        return this.h(arr_b);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s h(byte[] arr_b) {
        H.E(arr_b);
        this.s(arr_b);
        return this;
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J i(char c) {
        return this.i(c);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s i(char c) {
        this.a.putChar(c);
        return this.p(2);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J k(byte[] arr_b, int v, int v1) {
        return this.k(arr_b, v, v1);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s k(byte[] arr_b, int v, int v1) {
        H.f0(v, v + v1, arr_b.length);
        this.t(arr_b, v, v1);
        return this;
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public J l(ByteBuffer byteBuffer0) {
        return this.l(byteBuffer0);
    }

    @Override  // com.google.common.hash.d
    @O1.a
    public s l(ByteBuffer byteBuffer0) {
        this.r(byteBuffer0);
        return this;
    }

    @O1.a
    private s p(int v) {
        try {
            this.t(this.a.array(), 0, v);
            return this;
        }
        finally {
            y.a(this.a);
        }
    }

    protected abstract void q(byte arg1);

    protected void r(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            this.t(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
            y.d(byteBuffer0, byteBuffer0.limit());
            return;
        }
        for(int v = byteBuffer0.remaining(); v > 0; --v) {
            this.q(byteBuffer0.get());
        }
    }

    protected void s(byte[] arr_b) {
        this.t(arr_b, 0, arr_b.length);
    }

    protected void t(byte[] arr_b, int v, int v1) {
        for(int v2 = v; v2 < v + v1; ++v2) {
            this.q(arr_b[v2]);
        }
    }
}

