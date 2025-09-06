package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;

@y
abstract class d {
    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    @x
    public abstract d h(int arg1);

    public abstract int i();

    public static d j(ByteBuffer byteBuffer0) {
        class a extends d {
            final ByteBuffer a;

            a(ByteBuffer byteBuffer0) {
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public byte[] a() {
                return this.a.array();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int b() {
                return this.a.arrayOffset();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public boolean c() {
                return this.a.hasArray();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public boolean d() {
                return true;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int e() {
                return this.a.limit();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public ByteBuffer f() {
                return this.a;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int g() {
                return this.a.position();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public d h(int v) {
                this.a.position(v);
                return this;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int i() {
                return this.a.remaining();
            }
        }

        t0.e(byteBuffer0, "buffer");
        return new a(byteBuffer0);
    }

    public static d k(byte[] arr_b) {
        return d.m(arr_b, 0, arr_b.length);
    }

    public static d l(byte[] arr_b, int v, int v1) {
        if(v < 0 || v1 < 0 || v + v1 > arr_b.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
        }
        return d.m(arr_b, v, v1);
    }

    private static d m(byte[] arr_b, int v, int v1) {
        class b extends d {
            private int a;
            final byte[] b;
            final int c;
            final int d;

            b(byte[] arr_b, int v, int v1) {
                this.c = v;
                this.d = v1;
                super();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public byte[] a() {
                return this.b;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int b() {
                return this.c;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public boolean c() {
                return true;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public boolean d() {
                return false;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int e() {
                return this.d;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public ByteBuffer f() {
                throw new UnsupportedOperationException();
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int g() {
                return this.a;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public d h(int v) {
                if(v < 0 || v > this.d) {
                    throw new IllegalArgumentException("Invalid position: " + v);
                }
                this.a = v;
                return this;
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.d
            public int i() {
                return this.d - this.a;
            }
        }

        return new b(arr_b, v, v1);
    }
}

