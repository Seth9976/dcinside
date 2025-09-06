package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

final class s {
    private static final int a = 0x400;
    private static final int b = 0x4000;
    private static final float c = 0.5f;
    private static final ThreadLocal d;
    private static final Class e;
    private static final long f;

    static {
        s.d = new ThreadLocal();
        Class class0 = s.f("java.io.FileOutputStream");
        s.e = class0;
        s.f = s.c(class0);
    }

    static void a() {
        s.d.set(null);
    }

    private static byte[] b() {
        SoftReference softReference0 = (SoftReference)s.d.get();
        return softReference0 == null ? null : ((byte[])softReference0.get());
    }

    private static long c(Class class0) {
        if(class0 != null) {
            try {
                return Y1.Z(class0.getDeclaredField("channel"));
            }
            catch(Throwable unused_ex) {
            }
        }
        return -1L;
    }

    private static byte[] d(int v) {
        int v1 = Math.max(v, 0x400);
        byte[] arr_b = s.b();
        if(arr_b == null || s.e(v1, arr_b.length)) {
            arr_b = new byte[v1];
            if(v1 <= 0x4000) {
                s.g(arr_b);
            }
        }
        return arr_b;
    }

    private static boolean e(int v, int v1) {
        return v1 < v && ((float)v1) < ((float)v) * 0.5f;
    }

    private static Class f(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    private static void g(byte[] arr_b) {
        SoftReference softReference0 = new SoftReference(arr_b);
        s.d.set(softReference0);
    }

    static void h(ByteBuffer byteBuffer0, OutputStream outputStream0) throws IOException {
        int v = byteBuffer0.position();
        try {
            if(byteBuffer0.hasArray()) {
                outputStream0.write(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
            }
            else if(!s.i(byteBuffer0, outputStream0)) {
                byte[] arr_b = s.d(byteBuffer0.remaining());
                while(byteBuffer0.hasRemaining()) {
                    int v2 = Math.min(byteBuffer0.remaining(), arr_b.length);
                    byteBuffer0.get(arr_b, 0, v2);
                    outputStream0.write(arr_b, 0, v2);
                }
            }
        }
        finally {
            byteBuffer0.position(v);
        }
    }

    private static boolean i(ByteBuffer byteBuffer0, OutputStream outputStream0) throws IOException {
        WritableByteChannel writableByteChannel0;
        long v = s.f;
        if(v >= 0L && s.e.isInstance(outputStream0)) {
            try {
                writableByteChannel0 = null;
                writableByteChannel0 = (WritableByteChannel)Y1.Q(outputStream0, v);
            }
            catch(ClassCastException unused_ex) {
            }
            if(writableByteChannel0 != null) {
                writableByteChannel0.write(byteBuffer0);
                return true;
            }
        }
        return false;
    }
}

