package com.facebook.common.util;

import com.facebook.common.internal.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class f {
    public static byte[] a(InputStream inputStream0) throws IOException {
        return f.b(inputStream0, inputStream0.available());
    }

    public static byte[] b(InputStream inputStream0, int v) throws IOException {
        class com.facebook.common.util.f.a extends ByteArrayOutputStream {
            com.facebook.common.util.f.a(int v) {
            }

            @Override
            public byte[] toByteArray() {
                return this.count == this.buf.length ? this.buf : super.toByteArray();
            }
        }

        com.facebook.common.util.f.a f$a0 = new com.facebook.common.util.f.a(v);
        b.a(inputStream0, f$a0);
        return f$a0.toByteArray();
    }

    public static long c(InputStream inputStream0, long v) throws IOException {
        com.facebook.common.internal.n.i(inputStream0);
        com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0L));
        for(long v1 = v; v1 > 0L; v1 -= v2) {
            long v2 = inputStream0.skip(v1);
            if(v2 <= 0L) {
                if(inputStream0.read() != -1) {
                    v2 = 1L;
                    continue;
                }
                return v - v1;
            }
        }
        return v;
    }
}

