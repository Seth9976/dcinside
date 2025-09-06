package j$.time;

import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.s;
import j..time.temporal.t;

public enum d implements TemporalAccessor, n {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private static final d[] a;

    static {
        d.a = (d[])d.b.clone();
    }

    public static d Q(int v) {
        if(v < 1 || v > 7) {
            throw new b("Invalid value for DayOfWeek: " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return d.a[v - 1];
    }

    public final d R(long v) {
        return d.a[(((int)(v % 7L)) + 7 + this.ordinal()) % 7];
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? q0 == a.DAY_OF_WEEK : q0 != null && q0.q(this);
    }

    public final int getValue() {
        return this.ordinal() + 1;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return q0 == a.DAY_OF_WEEK ? this.getValue() : m.a(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return q0 == a.DAY_OF_WEEK ? q0.l() : m.d(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 == a.DAY_OF_WEEK) {
            return (long)this.getValue();
        }
        if(q0 instanceof a) {
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return q0.p(this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return temporalQuery0 == m.j() ? ChronoUnit.DAYS : m.c(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(((long)this.getValue()), a.DAY_OF_WEEK);
    }
}

