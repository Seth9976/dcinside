package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.util.g;
import java.io.IOException;
import java.nio.ByteBuffer;

public class h extends I {
    private static final long g = 1L;

    protected h() {
        super(ByteBuffer.class);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, com.fasterxml.jackson.databind.h h0) throws IOException, f {
        return this.r1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.I
    public Object h(n n0, com.fasterxml.jackson.databind.h h0, Object object0) throws IOException {
        return this.s1(n0, h0, ((ByteBuffer)object0));
    }

    public ByteBuffer r1(n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        return ByteBuffer.wrap(n0.E0());
    }

    public ByteBuffer s1(n n0, com.fasterxml.jackson.databind.h h0, ByteBuffer byteBuffer0) throws IOException {
        g g0 = new g(byteBuffer0);
        n0.r4(h0.f0(), g0);
        g0.close();
        return byteBuffer0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.I
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.k;
    }
}

