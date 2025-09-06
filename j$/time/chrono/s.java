package j$.time.chrono;

import j..time.Clock;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.ZoneId;
import j..time.ZonedDateTime;
import j..time.format.E;
import j..time.j;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.t;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class s extends a implements Serializable {
    public static final s d = null;
    private static final long serialVersionUID = 0xEC02A84FB92610D9L;

    static {
        s.d = new s();
    }

    @Override  // j$.time.chrono.l
    public final b D(int v, int v1, int v2) {
        return LocalDate.c0(v, v1, v2);
    }

    @Override  // j$.time.chrono.a
    public final b G(Map map0, E e0) {
        return (LocalDate)super.G(map0, e0);
    }

    @Override  // j$.time.chrono.l
    public final t H(j..time.temporal.a a0) {
        return a0.l();
    }

    @Override  // j$.time.chrono.l
    public final ChronoZonedDateTime I(Instant instant0, ZoneId zoneId0) {
        return ZonedDateTime.ofInstant(instant0, zoneId0);
    }

    @Override  // j$.time.chrono.l
    public final List K() {
        return j..com.android.tools.r8.a.k(j..time.chrono.t.values());
    }

    @Override  // j$.time.chrono.l
    public final boolean N(long v) {
        return (3L & v) == 0L && (v % 100L != 0L || v % 400L == 0L);
    }

    @Override  // j$.time.chrono.l
    public final m O(int v) {
        switch(v) {
            case 0: {
                return j..time.chrono.t.BCE;
            }
            case 1: {
                return j..time.chrono.t.CE;
            }
            default: {
                throw new j..time.b("Invalid era: " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    @Override  // j$.time.chrono.a
    final b Q(Map map0, E e0) {
        j..time.temporal.a a0 = j..time.temporal.a.YEAR_OF_ERA;
        Long long0 = (Long)map0.remove(a0);
        if(long0 != null) {
            if(e0 != E.LENIENT) {
                a0.R(((long)long0));
            }
            Long long1 = (Long)map0.remove(j..time.temporal.a.ERA);
            if(long1 == null) {
                j..time.temporal.a a1 = j..time.temporal.a.YEAR;
                Long long2 = (Long)map0.get(a1);
                if(e0 == E.STRICT) {
                    if(long2 != null) {
                        long v = (long)long0;
                        if(Long.compare(((long)long2), 0L) <= 0) {
                            v = j..com.android.tools.r8.a.p(1L, v);
                        }
                        a.l(map0, a1, v);
                        return null;
                    }
                    map0.put(a0, long0);
                    return null;
                }
                a.l(map0, a1, (long2 == null || ((long)long2) > 0L ? ((long)long0) : j..com.android.tools.r8.a.p(1L, ((long)long0))));
                return null;
            }
            if(((long)long1) == 1L) {
                a.l(map0, j..time.temporal.a.YEAR, ((long)long0));
                return null;
            }
            if(((long)long1) != 0L) {
                throw new j..time.b("Invalid value for era: " + long1);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            long v1 = j..com.android.tools.r8.a.p(1L, ((long)long0));
            a.l(map0, j..time.temporal.a.YEAR, v1);
            return null;
        }
        j..time.temporal.a a2 = j..time.temporal.a.ERA;
        if(map0.containsKey(a2)) {
            a2.R(((long)(((Long)map0.get(a2)))));
        }
        return null;
    }

    @Override  // j$.time.chrono.l
    public final int f(m m0, int v) {
        if(!(m0 instanceof j..time.chrono.t)) {
            throw new ClassCastException("Era must be IsoEra");
        }
        return m0 == j..time.chrono.t.CE ? v : 1 - v;
    }

    @Override  // j$.time.chrono.l
    public final b j(long v) {
        return LocalDate.ofEpochDay(v);
    }

    @Override  // j$.time.chrono.l
    public final String k() {
        return "ISO";
    }

    @Override  // j$.time.chrono.a
    public final b n() {
        Clock clock0 = Clock.b();
        Objects.requireNonNull(clock0, "clock");
        return LocalDate.S(LocalDate.b0(clock0));
    }

    @Override  // j$.time.chrono.l
    public final b o(TemporalAccessor temporalAccessor0) {
        return LocalDate.S(temporalAccessor0);
    }

    @Override  // j$.time.chrono.a
    public final ChronoLocalDateTime r(LocalDateTime localDateTime0) {
        return LocalDateTime.R(localDateTime0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.chrono.l
    public final String t() {
        return "iso8601";
    }

    @Override  // j$.time.chrono.l
    public final b w(int v, int v1) {
        return LocalDate.e0(v, v1);
    }

    Object writeReplace() {
        return new j..time.chrono.E(1, this);
    }

    @Override  // j$.time.chrono.a
    final void y(Map map0, E e0) {
        j..time.temporal.a a0 = j..time.temporal.a.PROLEPTIC_MONTH;
        Long long0 = (Long)map0.remove(a0);
        if(long0 != null) {
            if(e0 != E.LENIENT) {
                a0.R(((long)long0));
            }
            long v = (long)(((int)j..com.android.tools.r8.a.m(((long)long0), 12L)) + 1);
            a.l(map0, j..time.temporal.a.MONTH_OF_YEAR, v);
            long v1 = j..com.android.tools.r8.a.n(((long)long0), 12L);
            a.l(map0, j..time.temporal.a.YEAR, v1);
        }
    }

    @Override  // j$.time.chrono.a
    final b z(Map map0, E e0) {
        long v = (long)(((Long)map0.remove(j..time.temporal.a.YEAR)));
        int v1 = j..time.temporal.a.YEAR.Q(v);
        boolean z = true;
        if(e0 == E.LENIENT) {
            long v2 = j..com.android.tools.r8.a.p(((long)(((Long)map0.remove(j..time.temporal.a.MONTH_OF_YEAR)))), 1L);
            long v3 = j..com.android.tools.r8.a.p(((long)(((Long)map0.remove(j..time.temporal.a.DAY_OF_MONTH)))), 1L);
            return LocalDate.c0(v1, 1, 1).h0(v2).g0(v3);
        }
        long v4 = (long)(((Long)map0.remove(j..time.temporal.a.MONTH_OF_YEAR)));
        int v5 = j..time.temporal.a.MONTH_OF_YEAR.Q(v4);
        long v6 = (long)(((Long)map0.remove(j..time.temporal.a.DAY_OF_MONTH)));
        int v7 = j..time.temporal.a.DAY_OF_MONTH.Q(v6);
        if(e0 == E.SMART) {
            switch(v5) {
                case 2: {
                    j j0 = j.FEBRUARY;
                    if((3L & ((long)v1)) != 0L || ((long)v1) % 100L == 0L && ((long)v1) % 400L != 0L) {
                        z = false;
                    }
                    return LocalDate.c0(v1, 2, Math.min(v7, j0.R(z)));
                }
                case 4: 
                case 6: 
                case 9: 
                case 11: {
                    v7 = Math.min(v7, 30);
                    break;
                }
                default: {
                    return LocalDate.c0(v1, v5, v7);
                }
            }
        }
        return LocalDate.c0(v1, v5, v7);
    }
}

