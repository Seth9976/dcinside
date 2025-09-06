package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class c {
    public static class a extends r {
        public a(long v, long v1, int v2, long v3, ByteBuffer byteBuffer0) {
            super(v, v1, v2, v3, byteBuffer0);
        }
    }

    public static a a(o o0) throws IOException, q {
        r r0 = d.a(o0);
        return new a(r0.a(), r0.c(), r0.b(), r0.e(), r0.d());
    }
}

