package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class g {
    private static final char[] a;

    static {
        g.a = "0123456789abcdef".toCharArray();
    }

    public static h a(o o0, r r0, int v) throws IOException, i {
        o o1;
        long v1;
        try {
            a d$a0 = d.a(o0, r0);
            v1 = d$a0.b();
            o1 = d$a0.a();
        }
        catch(b b0) {
            throw new i(b0.getMessage(), b0);
        }
        ByteBuffer byteBuffer0 = o1.a(0L, ((int)o1.a()));
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        return new h(g.a(byteBuffer0, v), v1, r0.a(), r0.e(), r0.d());
    }

    public static ByteBuffer a(ByteBuffer byteBuffer0, int v) throws i {
        g.a(byteBuffer0);
        ByteBuffer byteBuffer1 = g.a(byteBuffer0, 8, byteBuffer0.capacity() - 24);
        int v1 = 0;
        while(byteBuffer1.hasRemaining()) {
            ++v1;
            if(byteBuffer1.remaining() < 8) {
                throw new i("Insufficient data to read size of APK Signing Block entry #" + v1);
            }
            long v2 = byteBuffer1.getLong();
            if(v2 < 4L || v2 > 0x7FFFFFFFL) {
                throw new i("APK Signing Block entry #" + v1 + " size out of range: " + v2);
            }
            int v3 = byteBuffer1.position();
            if(((int)v2) > byteBuffer1.remaining()) {
                throw new i("APK Signing Block entry #" + v1 + " size out of range: " + ((int)v2) + ", available: " + byteBuffer1.remaining());
            }
            if(byteBuffer1.getInt() == v) {
                return g.b(byteBuffer1, ((int)v2) - 4);
            }
            byteBuffer1.position(v3 + ((int)v2));
        }
        throw new i("No APK Signature Scheme block in APK Signing Block with ID: " + v);
    }

    private static ByteBuffer a(ByteBuffer byteBuffer0, int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("start: " + v);
        }
        if(v1 < v) {
            throw new IllegalArgumentException("end < start: " + v1 + " < " + v);
        }
        int v2 = byteBuffer0.capacity();
        if(v1 <= byteBuffer0.capacity()) {
            try {
                byteBuffer0.position(0);
                byteBuffer0.limit(v1);
                byteBuffer0.position(v);
                ByteBuffer byteBuffer1 = byteBuffer0.slice();
                byteBuffer1.order(byteBuffer0.order());
                return byteBuffer1;
            }
            finally {
                byteBuffer0.position(0);
                byteBuffer0.limit(byteBuffer0.limit());
                byteBuffer0.position(byteBuffer0.position());
            }
        }
        throw new IllegalArgumentException("end > capacity: " + v1 + " > " + v2);
    }

    public static void a(ByteBuffer byteBuffer0) {
        if(byteBuffer0.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ByteBuffer b(ByteBuffer byteBuffer0) throws com.pgl.ssdk.a {
        if(byteBuffer0.remaining() < 4) {
            throw new com.pgl.ssdk.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer0.remaining());
        }
        int v = byteBuffer0.getInt();
        if(v < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if(v > byteBuffer0.remaining()) {
            throw new com.pgl.ssdk.a("Length-prefixed field longer than remaining buffer. Field length: " + v + ", remaining: " + byteBuffer0.remaining());
        }
        return g.b(byteBuffer0, v);
    }

    private static ByteBuffer b(ByteBuffer byteBuffer0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException("size: " + v);
        }
        int v1 = byteBuffer0.limit();
        int v2 = byteBuffer0.position();
        int v3 = v + v2;
        if(v3 >= v2 && v3 <= v1) {
            byteBuffer0.limit(v3);
            try {
                ByteBuffer byteBuffer1 = byteBuffer0.slice();
                byteBuffer1.order(byteBuffer0.order());
                byteBuffer0.position(v3);
                return byteBuffer1;
            }
            finally {
                byteBuffer0.limit(v1);
            }
        }
        throw new BufferUnderflowException();
    }

    public static byte[] c(ByteBuffer byteBuffer0) throws com.pgl.ssdk.a {
        int v = byteBuffer0.getInt();
        if(v < 0) {
            throw new com.pgl.ssdk.a("Negative length");
        }
        if(v > byteBuffer0.remaining()) {
            throw new com.pgl.ssdk.a("Underflow while reading length-prefixed value. Length: " + v + ", available: " + byteBuffer0.remaining());
        }
        byte[] arr_b = new byte[v];
        byteBuffer0.get(arr_b);
        return arr_b;
    }
}

