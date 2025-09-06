package j$.time;

import j..time.chrono.ChronoLocalDateTime;
import j..time.chrono.ChronoZonedDateTime;
import j..time.chrono.h;
import j..time.format.DateTimeFormatter;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.t;
import j..util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class LocalDateTime implements ChronoLocalDateTime, l, n, Serializable {
    private final LocalDate a;
    private final LocalTime b;
    public static final LocalDateTime c = null;
    public static final LocalDateTime d = null;
    private static final long serialVersionUID = 0x56266AA6A95FFF2EL;

    static {
        LocalDateTime.c = LocalDateTime.Z(LocalDate.d, LocalTime.e);
        LocalDateTime.d = LocalDateTime.Z(LocalDate.e, LocalTime.f);
    }

    private LocalDateTime(LocalDate localDate0, LocalTime localTime0) {
        this.a = localDate0;
        this.b = localTime0;
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final int B(ChronoLocalDateTime chronoLocalDateTime0) {
        return chronoLocalDateTime0 instanceof LocalDateTime ? this.Q(((LocalDateTime)chronoLocalDateTime0)) : h.c(this, chronoLocalDateTime0);
    }

    private int Q(LocalDateTime localDateTime0) {
        int v = this.a.Q(localDateTime0.a);
        return v == 0 ? this.b.Q(localDateTime0.b) : v;
    }

    public static LocalDateTime R(TemporalAccessor temporalAccessor0) {
        if(temporalAccessor0 instanceof LocalDateTime) {
            return (LocalDateTime)temporalAccessor0;
        }
        if(temporalAccessor0 instanceof ZonedDateTime) {
            return ((ZonedDateTime)temporalAccessor0).toLocalDateTime();
        }
        if(temporalAccessor0 instanceof OffsetDateTime) {
            return ((OffsetDateTime)temporalAccessor0).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.S(temporalAccessor0), LocalTime.S(temporalAccessor0));
        }
        catch(b b0) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor0 + " of type " + temporalAccessor0.getClass().getName(), b0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    public final int S() {
        return this.b.V();
    }

    public final int T() {
        return this.b.W();
    }

    public final int U() {
        return this.a.X();
    }

    public final boolean V(LocalDateTime localDateTime0) {
        if(localDateTime0 instanceof LocalDateTime) {
            return this.Q(localDateTime0) > 0;
        }
        int v = Long.compare(this.a.v(), localDateTime0.a.v());
        return v > 0 || v == 0 && this.b.h0() > localDateTime0.b.h0();
    }

    public final boolean W(LocalDateTime localDateTime0) {
        if(localDateTime0 instanceof LocalDateTime) {
            return this.Q(localDateTime0) < 0;
        }
        int v = Long.compare(this.a.v(), localDateTime0.a.v());
        return v < 0 || v == 0 && this.b.h0() < localDateTime0.b.h0();
    }

    public static LocalDateTime X(int v) {
        return new LocalDateTime(LocalDate.c0(v, 12, 0x1F), LocalTime.X(0));
    }

    public static LocalDateTime Y(int v, int v1, int v2, int v3, int v4, int v5) {
        return new LocalDateTime(LocalDate.c0(v, v1, v2), LocalTime.Y(v3, v4, v5, 0));
    }

    public static LocalDateTime Z(LocalDate localDate0, LocalTime localTime0) {
        Objects.requireNonNull(localDate0, "date");
        Objects.requireNonNull(localTime0, "time");
        return new LocalDateTime(localDate0, localTime0);
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final j..time.chrono.l a() {
        return ((LocalDate)this.b()).a();
    }

    public static LocalDateTime a0(long v, int v1, ZoneOffset zoneOffset0) {
        Objects.requireNonNull(zoneOffset0, "offset");
        a.NANO_OF_SECOND.R(((long)v1));
        long v2 = v + ((long)zoneOffset0.W());
        long v3 = j..com.android.tools.r8.a.n(v2, 86400L);
        int v4 = (int)j..com.android.tools.r8.a.m(v2, 86400L);
        return new LocalDateTime(LocalDate.ofEpochDay(v3), LocalTime.Z(((long)v4) * 1000000000L + ((long)v1)));
    }

    public ZonedDateTime atZone(ZoneId zoneId0) {
        return ZonedDateTime.Q(this, zoneId0, null);
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final j..time.chrono.b b() {
        return this.a;
    }

    public final LocalDateTime b0(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.e0(this.a, 0L, 0L, 0L, v);
                }
                case 2: {
                    LocalDateTime localDateTime0 = this.c0(v / 86400000000L);
                    return localDateTime0.e0(localDateTime0.a, 0L, 0L, 0L, v % 86400000000L * 1000L);
                }
                case 3: {
                    LocalDateTime localDateTime1 = this.c0(v / 86400000L);
                    return localDateTime1.e0(localDateTime1.a, 0L, 0L, 0L, v % 86400000L * 1000000L);
                }
                case 4: {
                    return this.d0(v);
                }
                case 5: {
                    return this.e0(this.a, 0L, v, 0L, 0L);
                }
                case 6: {
                    return this.e0(this.a, v, 0L, 0L, 0L);
                }
                case 7: {
                    LocalDateTime localDateTime2 = this.c0(v / 0x100L);
                    return localDateTime2.e0(localDateTime2.a, v % 0x100L * 12L, 0L, 0L, 0L);
                }
                default: {
                    return this.i0(this.a.f0(v, r0), this.b);
                }
            }
        }
        return (LocalDateTime)r0.l(this, v);
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        return this.g0(v, q0);
    }

    public final LocalDateTime c0(long v) {
        return this.i0(this.a.g0(v), this.b);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.B(((ChronoLocalDateTime)object0));
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.b0(v, r0);
    }

    public final LocalDateTime d0(long v) {
        return this.e0(this.a, 0L, 0L, v, 0L);
    }

    // 去混淆评级： 中等(60)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? ((a)q0).z() || ((a)q0).S() : q0 != null && q0.q(this);
    }

    private LocalDateTime e0(LocalDate localDate0, long v, long v1, long v2, long v3) {
        LocalTime localTime0 = this.b;
        if((v | v1 | v2 | v3) == 0L) {
            return this.i0(localDate0, localTime0);
        }
        long v4 = localTime0.h0();
        long v5 = v % 24L * 3600000000000L + (v1 % 0x5A0L * 60000000000L + (v2 % 86400L * 1000000000L + v3 % 86400000000000L)) + v4;
        long v6 = j..com.android.tools.r8.a.n(v5, 86400000000000L);
        long v7 = j..com.android.tools.r8.a.m(v5, 86400000000000L);
        if(v7 != v4) {
            localTime0 = LocalTime.Z(v7);
        }
        return this.i0(localDate0.g0(v6 + (v / 24L + (v1 / 0x5A0L + (v2 / 86400L + v3 / 86400000000000L)))), localTime0);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof LocalDateTime && (this.a.equals(((LocalDateTime)object0).a) && this.b.equals(((LocalDateTime)object0).b));
    }

    public final LocalDate f0() {
        return this.a;
    }

    public String format(DateTimeFormatter dateTimeFormatter0) {
        Objects.requireNonNull(dateTimeFormatter0, "formatter");
        return dateTimeFormatter0.a(this);
    }

    public final LocalDateTime g0(long v, q q0) {
        if(q0 instanceof a) {
            return ((a)q0).S() ? this.i0(this.a, this.b.j0(v, q0)) : this.i0(this.a.l0(v, q0), this.b);
        }
        return (LocalDateTime)q0.u(this, v);
    }

    public final LocalDateTime h0(LocalDate localDate0) {
        if(localDate0 instanceof LocalDate) {
            return this.i0(localDate0, this.b);
        }
        localDate0.getClass();
        return (LocalDateTime)h.a(localDate0, this);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    private LocalDateTime i0(LocalDate localDate0, LocalTime localTime0) {
        return this.a != localDate0 || this.b != localTime0 ? new LocalDateTime(localDate0, localTime0) : this;
    }

    final void j0(DataOutput dataOutput0) {
        this.a.p0(dataOutput0);
        this.b.l0(dataOutput0);
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.b0(0x7FFFFFFFFFFFFFFFL, chronoUnit0).b0(1L, chronoUnit0) : this.b0(-v, chronoUnit0);
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime m(ZoneId zoneId0) {
        return this.atZone(zoneId0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        if(q0 instanceof a) {
            return ((a)q0).S() ? this.b.n(q0) : this.a.n(q0);
        }
        return m.a(this, q0);
    }

    public static LocalDateTime now() {
        Clock clock0 = Clock.b();
        Objects.requireNonNull(clock0, "clock");
        Instant instant0 = clock0.instant();
        return LocalDateTime.a0(instant0.getEpochSecond(), instant0.getNano(), clock0.a().Q().d(instant0));
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        return this.h0(localDate0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 instanceof a) {
            if(((a)q0).S()) {
                this.b.getClass();
                return m.d(this.b, q0);
            }
            return this.a.q(q0);
        }
        return q0.y(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final Instant toInstant(ZoneOffset zoneOffset0) {
        return Instant.ofEpochSecond(h.n(this, zoneOffset0), this.toLocalTime().V());
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime toLocalTime() {
        return this.b;
    }

    @Override
    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            return ((a)q0).S() ? this.b.u(q0) : this.a.u(q0);
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(5, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return temporalQuery0 == m.f() ? this.a : h.k(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(((LocalDate)this.b()).v(), a.EPOCH_DAY).c(this.toLocalTime().h0(), a.NANO_OF_DAY);
    }
}

