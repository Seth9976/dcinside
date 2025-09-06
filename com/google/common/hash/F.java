package com.google.common.hash;

import O1.a;
import com.google.common.base.H;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@k
abstract class f extends d {
    private final ByteBuffer a;
    private final int b;
    private final int c;

    protected f(int v) {
        this(v, v);
    }

    protected f(int v, int v1) {
        H.d(v1 % v == 0);
        this.a = ByteBuffer.allocate(v1 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.b = v1;
        this.c = v;
    }

    @Override  // com.google.common.hash.d
    @a
    public J b(int v) {
        return this.b(v);
    }

    @Override  // com.google.common.hash.d
    @a
    public final s b(int v) {
        this.a.putInt(v);
        this.r();
        return this;
    }

    @Override  // com.google.common.hash.d
    @a
    public J c(long v) {
        return this.c(v);
    }

    @Override  // com.google.common.hash.d
    @a
    public final s c(long v) {
        this.a.putLong(v);
        this.r();
        return this;
    }

    @Override  // com.google.common.hash.d
    @a
    public J e(short v) {
        return this.e(v);
    }

    @Override  // com.google.common.hash.d
    @a
    public final s e(short v) {
        this.a.putShort(v);
        this.r();
        return this;
    }

    @Override  // com.google.common.hash.d
    @a
    public J g(byte b) {
        return this.g(b);
    }

    @Override  // com.google.common.hash.s
    @a
    public final s g(byte b) {
        this.a.put(b);
        this.r();
        return this;
    }

    @Override  // com.google.common.hash.d
    @a
    public J i(char c) {
        return this.i(c);
    }

    @Override  // com.google.common.hash.d
    @a
    public final s i(char c) {
        this.a.putChar(c);
        this.r();
        return this;
    }

    @Override  // com.google.common.hash.d
    @a
    public J k(byte[] arr_b, int v, int v1) {
        return this.k(arr_b, v, v1);
    }

    @Override  // com.google.common.hash.d
    @a
    public final s k(byte[] arr_b, int v, int v1) {
        return this.u(ByteBuffer.wrap(arr_b, v, v1).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override  // com.google.common.hash.d
    @a
    public J l(ByteBuffer byteBuffer0) {
        return this.l(byteBuffer0);
    }

    @Override  // com.google.common.hash.d
    @a
    public final s l(ByteBuffer byteBuffer0) {
        ByteOrder byteOrder0 = byteBuffer0.order();
        try {
            byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
            return this.u(byteBuffer0);
        }
        finally {
            byteBuffer0.order(byteOrder0);
        }
    }

    @Override  // com.google.common.hash.s
    public final p n() {
        this.q();
        y.b(this.a);
        if(this.a.remaining() > 0) {
            this.t(this.a);
            y.d(this.a, this.a.limit());
        }
        return this.p();
    }

    protected abstract p p();

    private void q() {
        y.b(this.a);
        while(this.a.remaining() >= this.c) {
            this.s(this.a);
        }
        this.a.compact();
    }

    private void r() {
        if(this.a.remaining() < 8) {
            this.q();
        }
    }

    protected abstract void s(ByteBuffer arg1);

    protected void t(ByteBuffer byteBuffer0) {
        int v;
        y.d(byteBuffer0, byteBuffer0.limit());
        y.c(byteBuffer0, this.c + 7);
        while(true) {
            v = this.c;
            if(byteBuffer0.position() >= v) {
                break;
            }
            byteBuffer0.putLong(0L);
        }
        y.c(byteBuffer0, v);
        y.b(byteBuffer0);
        this.s(byteBuffer0);
    }

    @a
    private s u(ByteBuffer byteBuffer0) {
        if(byteBuffer0.remaining() <= this.a.remaining()) {
            this.a.put(byteBuffer0);
            this.r();
            return this;
        }
        int v = this.b - this.a.position();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = byteBuffer0.get();
            this.a.put(((byte)v2));
        }
        this.q();
        while(byteBuffer0.remaining() >= this.c) {
            this.s(byteBuffer0);
        }
        this.a.put(byteBuffer0);
        return this;
    }
}

