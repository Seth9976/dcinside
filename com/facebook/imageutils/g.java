package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class g {
    @l
    public static final g a;

    static {
        g.a = new g();
    }

    @n
    public static final int a(@l InputStream inputStream0, int v, boolean z) throws IOException {
        int v4;
        L.p(inputStream0, "stream");
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw new IOException("no more bytes");
            }
            if(z) {
                v4 = (v3 & 0xFF) << v1 * 8;
            }
            else {
                v2 <<= 8;
                v4 = v3 & 0xFF;
            }
            v2 |= v4;
        }
        return v2;
    }
}

