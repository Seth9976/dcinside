package com.google.common.hash;

import O1.a;
import com.google.common.base.H;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@k
abstract class d implements s {
    @Override  // com.google.common.hash.s
    @a
    public J a(float f) {
        return this.a(f);
    }

    @Override  // com.google.common.hash.s
    @a
    public final s a(float f) {
        return this.b(Float.floatToRawIntBits(f));
    }

    @Override  // com.google.common.hash.s
    @a
    public J b(int v) {
        return this.b(v);
    }

    @Override  // com.google.common.hash.s
    @a
    public s b(int v) {
        this.g(((byte)v));
        this.g(((byte)(v >>> 8)));
        this.g(((byte)(v >>> 16)));
        this.g(((byte)(v >>> 24)));
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J c(long v) {
        return this.c(v);
    }

    @Override  // com.google.common.hash.s
    @a
    public s c(long v) {
        for(int v1 = 0; v1 < 0x40; v1 += 8) {
            this.g(((byte)(((int)(v >>> v1)))));
        }
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J d(double f) {
        return this.d(f);
    }

    @Override  // com.google.common.hash.s
    @a
    public final s d(double f) {
        return this.c(Double.doubleToRawLongBits(f));
    }

    @Override  // com.google.common.hash.s
    @a
    public J e(short v) {
        return this.e(v);
    }

    @Override  // com.google.common.hash.s
    @a
    public s e(short v) {
        this.g(((byte)v));
        this.g(((byte)(v >>> 8)));
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J f(boolean z) {
        return this.f(z);
    }

    @Override  // com.google.common.hash.s
    @a
    public final s f(boolean z) {
        return this.g(((byte)z));
    }

    @Override  // com.google.common.hash.s
    public J g(byte b) {
        return this.g(b);
    }

    @Override  // com.google.common.hash.s
    @a
    public J h(byte[] arr_b) {
        return this.h(arr_b);
    }

    @Override  // com.google.common.hash.s
    @a
    public s h(byte[] arr_b) {
        return this.k(arr_b, 0, arr_b.length);
    }

    @Override  // com.google.common.hash.s
    @a
    public J i(char c) {
        return this.i(c);
    }

    @Override  // com.google.common.hash.s
    @a
    public s i(char c) {
        this.g(((byte)c));
        this.g(((byte)(c >>> 8)));
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J j(CharSequence charSequence0) {
        return this.j(charSequence0);
    }

    @Override  // com.google.common.hash.s
    @a
    public s j(CharSequence charSequence0) {
        int v = charSequence0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            this.i(charSequence0.charAt(v1));
        }
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J k(byte[] arr_b, int v, int v1) {
        return this.k(arr_b, v, v1);
    }

    @Override  // com.google.common.hash.s
    @a
    public s k(byte[] arr_b, int v, int v1) {
        H.f0(v, v + v1, arr_b.length);
        for(int v2 = 0; v2 < v1; ++v2) {
            this.g(arr_b[v + v2]);
        }
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J l(ByteBuffer byteBuffer0) {
        return this.l(byteBuffer0);
    }

    @Override  // com.google.common.hash.s
    @a
    public s l(ByteBuffer byteBuffer0) {
        if(byteBuffer0.hasArray()) {
            this.k(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
            y.d(byteBuffer0, byteBuffer0.limit());
            return this;
        }
        for(int v = byteBuffer0.remaining(); v > 0; --v) {
            this.g(byteBuffer0.get());
        }
        return this;
    }

    @Override  // com.google.common.hash.s
    @a
    public J m(CharSequence charSequence0, Charset charset0) {
        return this.m(charSequence0, charset0);
    }

    @Override  // com.google.common.hash.s
    @a
    public s m(CharSequence charSequence0, Charset charset0) {
        return this.h(charSequence0.toString().getBytes(charset0));
    }

    @Override  // com.google.common.hash.s
    @a
    public s o(@I Object object0, n n0) {
        n0.v(object0, this);
        return this;
    }
}

