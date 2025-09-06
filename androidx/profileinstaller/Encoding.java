package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

class Encoding {
    static final int a = 8;
    static final int b = 1;
    static final int c = 2;
    static final int d = 4;

    static int a(int v) [...] // Inlined contents

    static byte[] b(@NonNull byte[] arr_b) throws IOException {
        Deflater deflater0 = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(DeflaterOutputStream deflaterOutputStream0 = new DeflaterOutputStream(byteArrayOutputStream0, deflater0)) {
            deflaterOutputStream0.write(arr_b);
        }
        finally {
            deflater0.end();
        }
        return byteArrayOutputStream0.toByteArray();
    }

    @NonNull
    static RuntimeException c(@Nullable String s) {
        return new IllegalStateException(s);
    }

    @NonNull
    static byte[] d(@NonNull InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 < 0) {
                throw Encoding.c(("Not enough bytes to read: " + v));
            }
        }
        return arr_b;
    }

    @NonNull
    static byte[] e(@NonNull InputStream inputStream0, int v, int v1) throws IOException {
        int v3;
        Inflater inflater0 = new Inflater();
        try {
            byte[] arr_b = new byte[v1];
            byte[] arr_b1 = new byte[0x800];
            v3 = 0;
            int v4 = 0;
            while(!inflater0.finished() && !inflater0.needsDictionary() && v3 < v) {
                int v5 = inputStream0.read(arr_b1);
                if(v5 < 0) {
                    throw Encoding.c(("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + v + " bytes"));
                }
                inflater0.setInput(arr_b1, 0, v5);
                try {
                    v4 += inflater0.inflate(arr_b, v4, v1 - v4);
                    v3 += v5;
                }
                catch(DataFormatException dataFormatException0) {
                    throw Encoding.c(dataFormatException0.getMessage());
                }
            }
            if(v3 == v) {
                if(!inflater0.finished()) {
                    throw Encoding.c("Inflater did not finish");
                }
                return arr_b;
            }
        }
        finally {
            inflater0.end();
        }
        throw Encoding.c(("Didn\'t read enough bytes during decompression. expected=" + v + " actual=" + v3));
    }

    @NonNull
    static String f(InputStream inputStream0, int v) throws IOException {
        return new String(Encoding.d(inputStream0, v), StandardCharsets.UTF_8);
    }

    static long g(@NonNull InputStream inputStream0, int v) throws IOException {
        byte[] arr_b = Encoding.d(inputStream0, v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((long)(arr_b[v2] & 0xFF)) << v2 * 8;
        }
        return v1;
    }

    static int h(@NonNull InputStream inputStream0) throws IOException {
        return (int)Encoding.g(inputStream0, 2);
    }

    static long i(@NonNull InputStream inputStream0) throws IOException {
        return Encoding.g(inputStream0, 4);
    }

    static int j(@NonNull InputStream inputStream0) throws IOException {
        return (int)Encoding.g(inputStream0, 1);
    }

    static int k(@NonNull String s) {
        return s.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(@NonNull InputStream inputStream0, @NonNull OutputStream outputStream0, @Nullable FileLock fileLock0) throws IOException {
        if(fileLock0 == null || !fileLock0.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] arr_b = new byte[0x200];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            outputStream0.write(arr_b, 0, v);
        }
    }

    static void m(@NonNull OutputStream outputStream0, byte[] arr_b) throws IOException {
        Encoding.q(outputStream0, ((long)arr_b.length));
        byte[] arr_b1 = Encoding.b(arr_b);
        Encoding.q(outputStream0, ((long)arr_b1.length));
        outputStream0.write(arr_b1);
    }

    static void n(@NonNull OutputStream outputStream0, @NonNull String s) throws IOException {
        outputStream0.write(s.getBytes(StandardCharsets.UTF_8));
    }

    static void o(@NonNull OutputStream outputStream0, long v, int v1) throws IOException {
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b[v2] = (byte)(((int)(v >> v2 * 8 & 0xFFL)));
        }
        outputStream0.write(arr_b);
    }

    static void p(@NonNull OutputStream outputStream0, int v) throws IOException {
        Encoding.o(outputStream0, ((long)v), 2);
    }

    static void q(@NonNull OutputStream outputStream0, long v) throws IOException {
        Encoding.o(outputStream0, v, 4);
    }

    static void r(@NonNull OutputStream outputStream0, int v) throws IOException {
        Encoding.o(outputStream0, ((long)v), 1);
    }
}

