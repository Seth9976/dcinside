package com.fasterxml.jackson.core.io.doubleparser;

import java.nio.charset.StandardCharsets;

final class z extends d {
    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long h() {
        return 0x7FC00000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long i() {
        return 0xFFFFFFFFFF800000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long n() {
        return 0x7F800000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long p(byte[] arr_b, int v, int v1, boolean z, long v2, int v3, boolean z1, int v4) {
        float f = k.b(z, v2, v3, z1, v4);
        if(Float.isNaN(f)) {
            f = Float.parseFloat(new String(arr_b, v, v1 - v, StandardCharsets.ISO_8859_1));
        }
        return (long)Float.floatToRawIntBits(f);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long q(byte[] arr_b, int v, int v1, boolean z, long v2, int v3, boolean z1, int v4) {
        return (long)Float.floatToRawIntBits((Float.isNaN(k.d(z, v2, v3, z1, v4)) ? Float.parseFloat(new String(arr_b, v, v1 - v, StandardCharsets.ISO_8859_1)) : k.d(z, v2, v3, z1, v4)));
    }
}

