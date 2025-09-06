package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract class b implements j1 {
    private static final V a;

    static {
        b.a = V.d();
    }

    public R0 A(InputStream inputStream0, V v0) throws y0 {
        return this.r(this.N(inputStream0, v0));
    }

    public R0 B(ByteBuffer byteBuffer0) throws y0 {
        return this.C(byteBuffer0, b.a);
    }

    public R0 C(ByteBuffer byteBuffer0, V v0) throws y0 {
        z z0 = z.o(byteBuffer0);
        R0 r00 = (R0)this.l(z0, v0);
        try {
            z0.a(0);
            return this.r(r00);
        }
        catch(y0 y00) {
            throw y00.l(r00);
        }
    }

    public R0 D(byte[] arr_b) throws y0 {
        return this.G(arr_b, b.a);
    }

    public R0 E(byte[] arr_b, int v, int v1) throws y0 {
        return this.F(arr_b, v, v1, b.a);
    }

    public R0 F(byte[] arr_b, int v, int v1, V v2) throws y0 {
        return this.r(this.Q(arr_b, v, v1, v2));
    }

    public R0 G(byte[] arr_b, V v0) throws y0 {
        return this.F(arr_b, 0, arr_b.length, v0);
    }

    public R0 H(InputStream inputStream0) throws y0 {
        return this.I(inputStream0, b.a);
    }

    public R0 I(InputStream inputStream0, V v0) throws y0 {
        try {
            int v1 = inputStream0.read();
            return v1 == -1 ? null : this.N(new a(inputStream0, z.P(v1, inputStream0)), v0);
        }
        catch(IOException iOException0) {
            throw new y0(iOException0);
        }
    }

    public R0 J(u u0) throws y0 {
        return this.K(u0, b.a);
    }

    public R0 K(u u0, V v0) throws y0 {
        z z0 = u0.M();
        R0 r00 = (R0)this.l(z0, v0);
        try {
            z0.a(0);
            return r00;
        }
        catch(y0 y00) {
            throw y00.l(r00);
        }
    }

    public R0 L(z z0) throws y0 {
        return (R0)this.l(z0, b.a);
    }

    public R0 M(InputStream inputStream0) throws y0 {
        return this.N(inputStream0, b.a);
    }

    public R0 N(InputStream inputStream0, V v0) throws y0 {
        z z0 = z.k(inputStream0);
        R0 r00 = (R0)this.l(z0, v0);
        try {
            z0.a(0);
            return r00;
        }
        catch(y0 y00) {
            throw y00.l(r00);
        }
    }

    public R0 O(byte[] arr_b) throws y0 {
        return this.Q(arr_b, 0, arr_b.length, b.a);
    }

    public R0 P(byte[] arr_b, int v, int v1) throws y0 {
        return this.Q(arr_b, v, v1, b.a);
    }

    public R0 Q(byte[] arr_b, int v, int v1, V v2) throws y0 {
        z z0 = z.r(arr_b, v, v1);
        R0 r00 = (R0)this.l(z0, v2);
        try {
            z0.a(0);
            return r00;
        }
        catch(y0 y00) {
            throw y00.l(r00);
        }
    }

    public R0 R(byte[] arr_b, V v0) throws y0 {
        return this.Q(arr_b, 0, arr_b.length, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object a(byte[] arr_b, V v0) throws y0 {
        return this.R(arr_b, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object b(InputStream inputStream0, V v0) throws y0 {
        return this.N(inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object c(ByteBuffer byteBuffer0, V v0) throws y0 {
        return this.C(byteBuffer0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object d(z z0) throws y0 {
        return this.L(z0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object e(u u0, V v0) throws y0 {
        return this.w(u0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object f(u u0) throws y0 {
        return this.v(u0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object g(u u0) throws y0 {
        return this.J(u0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object h(InputStream inputStream0, V v0) throws y0 {
        return this.A(inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object i(z z0, V v0) throws y0 {
        return this.y(z0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object j(InputStream inputStream0, V v0) throws y0 {
        return this.u(inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object k(byte[] arr_b, int v, int v1, V v2) throws y0 {
        return this.Q(arr_b, v, v1, v2);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object m(InputStream inputStream0, V v0) throws y0 {
        return this.I(inputStream0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object n(u u0, V v0) throws y0 {
        return this.K(u0, v0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object o(byte[] arr_b, int v, int v1, V v2) throws y0 {
        return this.F(arr_b, v, v1, v2);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object p(z z0) throws y0 {
        return this.x(z0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parseDelimitedFrom(InputStream inputStream0) throws y0 {
        return this.t(inputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parseFrom(InputStream inputStream0) throws y0 {
        return this.z(inputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parseFrom(ByteBuffer byteBuffer0) throws y0 {
        return this.B(byteBuffer0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parseFrom(byte[] arr_b) throws y0 {
        return this.D(arr_b);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parseFrom(byte[] arr_b, int v, int v1) throws y0 {
        return this.E(arr_b, v, v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parsePartialDelimitedFrom(InputStream inputStream0) throws y0 {
        return this.H(inputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parsePartialFrom(InputStream inputStream0) throws y0 {
        return this.M(inputStream0);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parsePartialFrom(byte[] arr_b) throws y0 {
        return this.O(arr_b);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object parsePartialFrom(byte[] arr_b, int v, int v1) throws y0 {
        return this.P(arr_b, v, v1);
    }

    @Override  // com.google.crypto.tink.shaded.protobuf.j1
    public Object q(byte[] arr_b, V v0) throws y0 {
        return this.G(arr_b, v0);
    }

    private R0 r(R0 r00) throws y0 {
        if(r00 != null && !r00.isInitialized()) {
            throw this.s(r00).a().l(r00);
        }
        return r00;
    }

    // 去混淆评级： 低(20)
    private S1 s(R0 r00) {
        return r00 instanceof com.google.crypto.tink.shaded.protobuf.a ? ((com.google.crypto.tink.shaded.protobuf.a)r00).n1() : new S1(r00);
    }

    public R0 t(InputStream inputStream0) throws y0 {
        return this.u(inputStream0, b.a);
    }

    public R0 u(InputStream inputStream0, V v0) throws y0 {
        return this.r(this.I(inputStream0, v0));
    }

    public R0 v(u u0) throws y0 {
        return this.w(u0, b.a);
    }

    public R0 w(u u0, V v0) throws y0 {
        return this.r(this.K(u0, v0));
    }

    public R0 x(z z0) throws y0 {
        return this.y(z0, b.a);
    }

    public R0 y(z z0, V v0) throws y0 {
        return this.r(((R0)this.l(z0, v0)));
    }

    public R0 z(InputStream inputStream0) throws y0 {
        return this.A(inputStream0, b.a);
    }
}

