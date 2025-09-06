package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

final class ByteBufferWriter {
    private static final int a = 0x400;
    private static final int b = 0x4000;
    private static final float c = 0.5f;
    private static final ThreadLocal d;
    private static final Class e;
    private static final long f;

    static {
        ByteBufferWriter.d = new ThreadLocal();
        Class class0 = ByteBufferWriter.f("java.io.FileOutputStream");
        ByteBufferWriter.e = class0;
        ByteBufferWriter.f = ByteBufferWriter.c(class0);
    }

    static void a() {
        ByteBufferWriter.d.set(null);
    }

    private static byte[] b() {
        SoftReference softReference0 = (SoftReference)ByteBufferWriter.d.get();
        return softReference0 == null ? null : ((byte[])softReference0.get());
    }

    private static long c(Class class0) {
        if(class0 != null) {
            try {
                return UnsafeUtil.W(class0.getDeclaredField("channel"));
            }
            catch(Throwable unused_ex) {
            }
        }
        return -1L;
    }

    private static byte[] d(int v) {
        int v1 = Math.max(v, 0x400);
        byte[] arr_b = ByteBufferWriter.b();
        if(arr_b == null || ByteBufferWriter.e(v1, arr_b.length)) {
            arr_b = new byte[v1];
            if(v1 <= 0x4000) {
                ByteBufferWriter.g(arr_b);
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
        ByteBufferWriter.d.set(softReference0);
    }

    static void h(ByteBuffer byteBuffer0, OutputStream outputStream0) throws IOException {
        int v = byteBuffer0.position();
        try {
            if(byteBuffer0.hasArray()) {
                outputStream0.write(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining());
            }
            else if(!ByteBufferWriter.i(byteBuffer0, outputStream0)) {
                byte[] arr_b = ByteBufferWriter.d(byteBuffer0.remaining());
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
        long v = ByteBufferWriter.f;
        if(v >= 0L && ByteBufferWriter.e.isInstance(outputStream0)) {
            try {
                writableByteChannel0 = null;
                writableByteChannel0 = (WritableByteChannel)UnsafeUtil.O(outputStream0, v);
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

