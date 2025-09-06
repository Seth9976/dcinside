package com.facebook.common.memory;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import k1.n.a;
import k1.n;

@n(a.a)
public class m {
    private final int a;
    private final com.facebook.common.memory.a b;
    private static final int c = 0x4000;

    public m(com.facebook.common.memory.a a0) {
        this(a0, 0x4000);
    }

    @VisibleForTesting
    public m(com.facebook.common.memory.a a0, int v) {
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
        this.a = v;
        this.b = a0;
    }

    public long a(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        byte[] arr_b = (byte[])this.b.get(this.a);
        long v = 0L;
        try {
            int v2;
            while((v2 = inputStream0.read(arr_b, 0, this.a)) != -1) {
                outputStream0.write(arr_b, 0, v2);
                v += (long)v2;
            }
            return v;
        }
        finally {
            this.b.a(arr_b);
        }
    }

    public long b(InputStream inputStream0, OutputStream outputStream0, long v) throws IOException {
        long v1 = 0L;
        com.facebook.common.internal.n.o(v > 0L);
        byte[] arr_b = (byte[])this.b.get(this.a);
        try {
            while(v1 < v) {
                int v3 = inputStream0.read(arr_b, 0, ((int)Math.min(this.a, v - v1)));
                if(v3 == -1) {
                    break;
                }
                outputStream0.write(arr_b, 0, v3);
                v1 += (long)v3;
            }
            return v1;
        }
        finally {
            this.b.a(arr_b);
        }
    }
}

