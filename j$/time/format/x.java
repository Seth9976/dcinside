package j$.time.format;

import j..time.ZoneId;
import j..time.chrono.b;
import j..time.chrono.l;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.m;
import j..time.temporal.q;
import j..time.temporal.t;

final class x implements TemporalAccessor {
    final b a;
    final Object b;
    final l c;
    final ZoneId d;

    x(b b0, TemporalAccessor temporalAccessor0, l l0, ZoneId zoneId0) {
        this.a = b0;
        this.b = temporalAccessor0;
        this.c = l0;
        this.d = zoneId0;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return this.a == null || !q0.z() ? ((TemporalAccessor)this.b).e(q0) : this.a.e(q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return m.a(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return this.a == null || !q0.z() ? ((TemporalAccessor)this.b).q(q0) : this.a.q(q0);
    }

    @Override
    public final String toString() {
        String s = "";
        String s1 = this.c == null ? "" : " with chronology " + this.c;
        ZoneId zoneId0 = this.d;
        if(zoneId0 != null) {
            s = " with zone " + zoneId0;
        }
        return this.b + s1 + s;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        return this.a == null || !q0.z() ? ((TemporalAccessor)this.b).u(q0) : this.a.u(q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == m.e()) {
            return this.c;
        }
        if(temporalQuery0 == m.l()) {
            return this.d;
        }
        return temporalQuery0 == m.j() ? ((TemporalAccessor)this.b).y(temporalQuery0) : temporalQuery0.queryFrom(this);
    }
}

