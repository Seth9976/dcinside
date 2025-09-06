package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.v1.m;

final class b extends e {
    private final m a;

    b(m m0) {
        this.a = m0;
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        return this.a.hasSessionId() && (this.a.j5() > 0 || this.a.j1() > 0 || this.a.Y9() && this.a.F5().F1());
    }
}

