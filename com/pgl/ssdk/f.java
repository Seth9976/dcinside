package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

public class f {
    public static class a extends Exception {
        public a(String s) {
            super(s);
        }
    }

    public static h a(o o0, com.pgl.ssdk.c.a c$a0, int v) throws IOException, a {
        try {
            return g.a(o0, c$a0, v);
        }
        catch(i i0) {
            throw new a(i0.getMessage());
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer0) throws com.pgl.ssdk.a {
        return g.b(byteBuffer0);
    }

    public static byte[] b(ByteBuffer byteBuffer0) throws com.pgl.ssdk.a {
        return g.c(byteBuffer0);
    }
}

