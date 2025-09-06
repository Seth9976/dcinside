package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class n {
    public static int a(ByteBuffer byteBuffer0, int v) {
        return byteBuffer0.getShort(v) & 0xFFFF;
    }

    public static m a(o o0) throws IOException {
        if(o0.a() < 22L) {
            return null;
        }
        m m0 = n.a(o0, 0);
        return m0 == null ? n.a(o0, 0xFFFF) : m0;
    }

    private static m a(o o0, int v) throws IOException {
        if(v < 0 || v > 0xFFFF) {
            throw new IllegalArgumentException("maxCommentSize: " + v);
        }
        long v1 = o0.a();
        if(v1 < 22L) {
            return null;
        }
        int v2 = ((int)Math.min(v, v1 - 22L)) + 22;
        long v3 = v1 - ((long)v2);
        ByteBuffer byteBuffer0 = o0.a(v3, v2);
        ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
        byteBuffer0.order(byteOrder0);
        int v4 = n.b(byteBuffer0);
        if(v4 == -1) {
            return null;
        }
        byteBuffer0.position(v4);
        ByteBuffer byteBuffer1 = byteBuffer0.slice();
        byteBuffer1.order(byteOrder0);
        return m.a(byteBuffer1, ((long)(v3 + ((long)v4))));
    }

    static void a(ByteBuffer byteBuffer0) {
        if(byteBuffer0.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int b(ByteBuffer byteBuffer0) {
        n.a(byteBuffer0);
        int v = byteBuffer0.capacity();
        if(v < 22) {
            return -1;
        }
        int v1 = Math.min(v - 22, 0xFFFF);
        for(int v2 = 0; v2 <= v1; ++v2) {
            int v3 = v - 22 - v2;
            if(byteBuffer0.getInt(v3) == 101010256 && n.a(byteBuffer0, v3 + 20) == v2) {
                return v3;
            }
        }
        return -1;
    }

    static long b(ByteBuffer byteBuffer0, int v) {
        return ((long)byteBuffer0.getInt(v)) & 0xFFFFFFFFL;
    }

    public static long c(ByteBuffer byteBuffer0) {
        n.a(byteBuffer0);
        return n.b(byteBuffer0, byteBuffer0.position() + 16);
    }

    public static long d(ByteBuffer byteBuffer0) {
        n.a(byteBuffer0);
        return n.b(byteBuffer0, byteBuffer0.position() + 12);
    }

    public static int e(ByteBuffer byteBuffer0) {
        n.a(byteBuffer0);
        return n.a(byteBuffer0, byteBuffer0.position() + 10);
    }
}

