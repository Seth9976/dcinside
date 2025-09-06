package com.fasterxml.jackson.core.io.doubleparser;

final class x extends f {
    @Override  // com.fasterxml.jackson.core.io.doubleparser.f
    long h() {
        return 0x7FF8000000000000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.f
    long i() {
        return 0xFFF0000000000000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.f
    long n() {
        return 0x7FF0000000000000L;
    }

    @Override  // com.fasterxml.jackson.core.io.doubleparser.f
    long p(CharSequence charSequence0, int v, int v1, boolean z, long v2, int v3, boolean z1, int v4) {
        double f = i.b(z, v2, v3, z1, v4);
        if(Double.isNaN(f)) {
            f = Double.parseDouble(charSequence0.subSequence(v, v1).toString());
        }
        return Double.doubleToRawLongBits(f);
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.core.io.doubleparser.f
    long q(CharSequence charSequence0, int v, int v1, boolean z, long v2, int v3, boolean z1, int v4) {
        return Double.doubleToRawLongBits((Double.isNaN(i.d(z, v2, ((long)v3), z1, ((long)v4))) ? Double.parseDouble(charSequence0.subSequence(v, v1).toString()) : i.d(z, v2, ((long)v3), z1, ((long)v4))));
    }
}

