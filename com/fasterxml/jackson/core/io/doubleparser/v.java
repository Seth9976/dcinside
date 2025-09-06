package com.fasterxml.jackson.core.io.doubleparser;

import java.nio.charset.StandardCharsets;

final class v extends d {
    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long h() {
        return 0x7FF8000000000000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long i() {
        return 0xFFF0000000000000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long n() {
        return 0x7FF0000000000000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long p(byte[] arr_b, int v, int v1, boolean z, long v2, int v3, boolean z1, int v4) {
        double f = i.b(z, v2, v3, z1, v4);
        if(Double.isNaN(f)) {
            f = Double.parseDouble(new String(arr_b, v, v1 - v, StandardCharsets.ISO_8859_1));
        }
        return Double.doubleToRawLongBits(f);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.core.io.doubleparser.d
    long q(byte[] arr_b, int v, int v1, boolean z, long v2, int v3, boolean z1, int v4) {
        return Double.doubleToRawLongBits((Double.isNaN(i.d(z, v2, ((long)v3), z1, ((long)v4))) ? Double.parseDouble(new String(arr_b, v, v1 - v, StandardCharsets.ISO_8859_1)) : i.d(z, v2, ((long)v3), z1, ((long)v4))));
    }
}

