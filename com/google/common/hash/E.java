package com.google.common.hash;

import O1.j;
import com.google.common.base.H;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

@j
@k
abstract class e extends c {
    final class a extends d {
        final b a;
        final e b;

        a(int v) {
            this.a = new b(v);
        }

        @Override  // com.google.common.hash.d
        public J g(byte b) {
            return this.g(b);
        }

        @Override  // com.google.common.hash.s
        public s g(byte b) {
            this.a.write(((int)b));
            return this;
        }

        @Override  // com.google.common.hash.d
        public J k(byte[] arr_b, int v, int v1) {
            return this.k(arr_b, v, v1);
        }

        @Override  // com.google.common.hash.d
        public s k(byte[] arr_b, int v, int v1) {
            this.a.write(arr_b, v, v1);
            return this;
        }

        @Override  // com.google.common.hash.d
        public J l(ByteBuffer byteBuffer0) {
            return this.l(byteBuffer0);
        }

        @Override  // com.google.common.hash.d
        public s l(ByteBuffer byteBuffer0) {
            this.a.c(byteBuffer0);
            return this;
        }

        @Override  // com.google.common.hash.s
        public p n() {
            byte[] arr_b = this.a.a();
            int v = this.a.b();
            return e.this.k(arr_b, 0, v);
        }
    }

    static final class b extends ByteArrayOutputStream {
        b(int v) {
            super(v);
        }

        byte[] a() {
            return this.buf;
        }

        int b() {
            return this.count;
        }

        void c(ByteBuffer byteBuffer0) {
            int v = byteBuffer0.remaining();
            int v1 = this.count;
            byte[] arr_b = this.buf;
            if(v1 + v > arr_b.length) {
                this.buf = Arrays.copyOf(arr_b, v1 + v);
            }
            byteBuffer0.get(this.buf, this.count, v);
            this.count += v;
        }
    }

    @Override  // com.google.common.hash.c
    public s a(int v) {
        H.d(v >= 0);
        return new a(this, v);
    }

    @Override  // com.google.common.hash.c
    public p c(int v) {
        return this.b(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(v).array());
    }

    @Override  // com.google.common.hash.c
    public p e(long v) {
        return this.b(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(v).array());
    }

    @Override  // com.google.common.hash.c
    public p f(CharSequence charSequence0, Charset charset0) {
        return this.b(charSequence0.toString().getBytes(charset0));
    }

    @Override  // com.google.common.hash.c
    public p g(CharSequence charSequence0) {
        int v = charSequence0.length();
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v * 2).order(ByteOrder.LITTLE_ENDIAN);
        for(int v1 = 0; v1 < v; ++v1) {
            byteBuffer0.putChar(charSequence0.charAt(v1));
        }
        return this.b(byteBuffer0.array());
    }

    @Override  // com.google.common.hash.q
    public s i() {
        return this.a(0x20);
    }

    @Override  // com.google.common.hash.c
    public p j(ByteBuffer byteBuffer0) {
        return this.a(byteBuffer0.remaining()).l(byteBuffer0).n();
    }

    @Override  // com.google.common.hash.c
    public abstract p k(byte[] arg1, int arg2, int arg3);
}

