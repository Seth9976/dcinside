package com.google.common.hash;

import O1.j;
import com.google.common.base.H;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@j
@k
abstract class c implements q {
    @Override  // com.google.common.hash.q
    public s a(int v) {
        H.k(v >= 0, "expectedInputSize must be >= 0 but was %s", v);
        return this.i();
    }

    @Override  // com.google.common.hash.q
    public p b(byte[] arr_b) {
        return this.k(arr_b, 0, arr_b.length);
    }

    @Override  // com.google.common.hash.q
    public p c(int v) {
        return this.a(4).b(v).n();
    }

    @Override  // com.google.common.hash.q
    public p d(@I Object object0, n n0) {
        return this.i().o(object0, n0).n();
    }

    @Override  // com.google.common.hash.q
    public p e(long v) {
        return this.a(8).c(v).n();
    }

    @Override  // com.google.common.hash.q
    public p f(CharSequence charSequence0, Charset charset0) {
        return this.i().m(charSequence0, charset0).n();
    }

    @Override  // com.google.common.hash.q
    public p g(CharSequence charSequence0) {
        return this.a(charSequence0.length() * 2).j(charSequence0).n();
    }

    @Override  // com.google.common.hash.q
    public p j(ByteBuffer byteBuffer0) {
        return this.a(byteBuffer0.remaining()).l(byteBuffer0).n();
    }

    @Override  // com.google.common.hash.q
    public p k(byte[] arr_b, int v, int v1) {
        H.f0(v, v + v1, arr_b.length);
        return this.a(v1).k(arr_b, v, v1).n();
    }
}

