package j$.time.chrono;

import j..time.ZoneOffset;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.q;
import j..time.temporal.s;
import j..util.Objects;

public abstract class h {
    public static l a(b b0, l l0) {
        return l0.c(b0.v(), a.EPOCH_DAY);
    }

    public static int b(b b0, b b1) {
        int v = Long.compare(b0.v(), b1.v());
        if(v == 0) {
            j..time.chrono.l l0 = b0.a();
            j..time.chrono.l l1 = b1.a();
            return ((j..time.chrono.a)l0).k().compareTo(l1.k());
        }
        return v;
    }

    public static int c(ChronoLocalDateTime chronoLocalDateTime0, ChronoLocalDateTime chronoLocalDateTime1) {
        int v = chronoLocalDateTime0.b().M(chronoLocalDateTime1.b());
        if(v == 0) {
            v = chronoLocalDateTime0.toLocalTime().Q(chronoLocalDateTime1.toLocalTime());
            if(v == 0) {
                j..time.chrono.l l0 = chronoLocalDateTime0.a();
                j..time.chrono.l l1 = chronoLocalDateTime1.a();
                return ((j..time.chrono.a)l0).k().compareTo(l1.k());
            }
        }
        return v;
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime0, ChronoZonedDateTime chronoZonedDateTime1) {
        int v = Long.compare(chronoZonedDateTime0.P(), chronoZonedDateTime1.P());
        if(v == 0) {
            v = chronoZonedDateTime0.toLocalTime().V() - chronoZonedDateTime1.toLocalTime().V();
            if(v == 0) {
                v = chronoZonedDateTime0.C().B(chronoZonedDateTime1.C());
                if(v == 0) {
                    v = chronoZonedDateTime0.s().k().compareTo(chronoZonedDateTime1.s().k());
                    if(v == 0) {
                        j..time.chrono.l l0 = chronoZonedDateTime0.a();
                        j..time.chrono.l l1 = chronoZonedDateTime1.a();
                        return ((j..time.chrono.a)l0).k().compareTo(l1.k());
                    }
                }
            }
        }
        return v;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime0, q q0) {
        if(q0 instanceof a) {
            switch(((a)q0)) {
                case 1: {
                    throw new s("Invalid field \'InstantSeconds\' for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                case 2: {
                    return chronoZonedDateTime0.g().W();
                }
                default: {
                    return chronoZonedDateTime0.C().n(q0);
                }
            }
        }
        return m.a(chronoZonedDateTime0, q0);
    }

    public static int f(j..time.chrono.m m0, a a0) {
        return a0 == a.ERA ? m0.getValue() : m.a(m0, a0);
    }

    public static long g(j..time.chrono.m m0, q q0) {
        if(q0 == a.ERA) {
            return (long)m0.getValue();
        }
        if(q0 instanceof a) {
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return q0.p(m0);
    }

    // 去混淆评级： 低(30)
    public static boolean h(b b0, q q0) {
        return q0 instanceof a ? ((a)q0).z() : q0 != null && q0.q(b0);
    }

    // 去混淆评级： 低(30)
    public static boolean i(j..time.chrono.m m0, q q0) {
        return q0 instanceof a ? q0 == a.ERA : q0 != null && q0.q(m0);
    }

    public static Object j(b b0, TemporalQuery temporalQuery0) {
        if(temporalQuery0 == m.l() || temporalQuery0 == m.k() || temporalQuery0 == m.i() || temporalQuery0 == m.g()) {
            return null;
        }
        if(temporalQuery0 == m.e()) {
            return b0.a();
        }
        return temporalQuery0 == m.j() ? ChronoUnit.DAYS : temporalQuery0.queryFrom(b0);
    }

    public static Object k(ChronoLocalDateTime chronoLocalDateTime0, TemporalQuery temporalQuery0) {
        if(temporalQuery0 != m.l() && temporalQuery0 != m.k() && temporalQuery0 != m.i()) {
            if(temporalQuery0 == m.g()) {
                return chronoLocalDateTime0.toLocalTime();
            }
            if(temporalQuery0 == m.e()) {
                return chronoLocalDateTime0.a();
            }
            return temporalQuery0 == m.j() ? ChronoUnit.NANOS : temporalQuery0.queryFrom(chronoLocalDateTime0);
        }
        return null;
    }

    public static Object l(ChronoZonedDateTime chronoZonedDateTime0, TemporalQuery temporalQuery0) {
        if(temporalQuery0 != m.k() && temporalQuery0 != m.l()) {
            if(temporalQuery0 == m.i()) {
                return chronoZonedDateTime0.g();
            }
            if(temporalQuery0 == m.g()) {
                return chronoZonedDateTime0.toLocalTime();
            }
            if(temporalQuery0 == m.e()) {
                return chronoZonedDateTime0.a();
            }
            return temporalQuery0 == m.j() ? ChronoUnit.NANOS : temporalQuery0.queryFrom(chronoZonedDateTime0);
        }
        return chronoZonedDateTime0.s();
    }

    public static Object m(j..time.chrono.m m0, TemporalQuery temporalQuery0) {
        return temporalQuery0 == m.j() ? ChronoUnit.ERAS : m.c(m0, temporalQuery0);
    }

    public static long n(ChronoLocalDateTime chronoLocalDateTime0, ZoneOffset zoneOffset0) {
        Objects.requireNonNull(zoneOffset0, "offset");
        return chronoLocalDateTime0.b().v() * 86400L + ((long)chronoLocalDateTime0.toLocalTime().i0()) - ((long)zoneOffset0.W());
    }

    public static long o(ChronoZonedDateTime chronoZonedDateTime0) {
        return chronoZonedDateTime0.b().v() * 86400L + ((long)chronoZonedDateTime0.toLocalTime().i0()) - ((long)chronoZonedDateTime0.g().W());
    }

    public static j..time.chrono.l p(TemporalAccessor temporalAccessor0) {
        Objects.requireNonNull(temporalAccessor0, "temporal");
        j..time.chrono.l l0 = (j..time.chrono.l)temporalAccessor0.y(m.e());
        j..time.chrono.s s0 = j..time.chrono.s.d;
        return l0 == null ? Objects.requireNonNull(s0, "defaultObj") : l0;
    }
}

