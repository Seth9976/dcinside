package j$.time.chrono;

import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.q;
import j..time.temporal.t;

public enum D implements m {
    BEFORE_ROC,
    ROC;

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return h.i(this, q0);
    }

    @Override  // j$.time.chrono.m
    public final int getValue() {
        return this.ordinal();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return h.f(this, ((a)q0));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return j..time.temporal.m.d(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        return h.g(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return h.m(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(((long)this.getValue()), a.ERA);
    }
}

