package j$.time;

import j..time.chrono.ChronoLocalDateTime;
import j..time.chrono.ChronoZonedDateTime;
import j..time.chrono.h;
import j..time.format.DateTimeFormatter;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.s;
import j..time.temporal.t;
import j..time.zone.b;
import j..time.zone.f;
import j..util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

public final class ZonedDateTime implements ChronoZonedDateTime, l, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;
    private static final long serialVersionUID = -6260982410461394882L;

    private ZonedDateTime(LocalDateTime localDateTime0, ZoneId zoneId0, ZoneOffset zoneOffset0) {
        this.a = localDateTime0;
        this.b = zoneOffset0;
        this.c = zoneId0;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime C() {
        return this.toLocalDateTime();
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final long P() {
        return h.o(this);
    }

    public static ZonedDateTime Q(LocalDateTime localDateTime0, ZoneId zoneId0, ZoneOffset zoneOffset0) {
        Objects.requireNonNull(localDateTime0, "localDateTime");
        Objects.requireNonNull(zoneId0, "zone");
        if(zoneId0 instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime0, zoneId0, ((ZoneOffset)zoneId0));
        }
        f f0 = zoneId0.Q();
        List list0 = f0.g(localDateTime0);
        if(list0.size() == 1) {
            return new ZonedDateTime(localDateTime0, zoneId0, ((ZoneOffset)list0.get(0)));
        }
        if(list0.size() == 0) {
            b b0 = f0.f(localDateTime0);
            return new ZonedDateTime(localDateTime0.d0(b0.p().getSeconds()), zoneId0, b0.q());
        }
        if(zoneOffset0 == null || !list0.contains(zoneOffset0)) {
            zoneOffset0 = (ZoneOffset)Objects.requireNonNull(((ZoneOffset)list0.get(0)), "offset");
        }
        return new ZonedDateTime(localDateTime0, zoneId0, zoneOffset0);
    }

    public final ZonedDateTime R(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            ZoneOffset zoneOffset0 = this.b;
            ZoneId zoneId0 = this.c;
            LocalDateTime localDateTime0 = this.a;
            if(((ChronoUnit)r0).compareTo(ChronoUnit.DAYS) >= 0 && ((ChronoUnit)r0) != ChronoUnit.FOREVER) {
                return ZonedDateTime.Q(localDateTime0.b0(v, r0), zoneId0, zoneOffset0);
            }
            LocalDateTime localDateTime1 = localDateTime0.b0(v, r0);
            Objects.requireNonNull(localDateTime1, "localDateTime");
            Objects.requireNonNull(zoneOffset0, "offset");
            Objects.requireNonNull(zoneId0, "zone");
            if(zoneId0.Q().g(localDateTime1).contains(zoneOffset0)) {
                return new ZonedDateTime(localDateTime1, zoneId0, zoneOffset0);
            }
            localDateTime1.getClass();
            return ZonedDateTime.z(h.n(localDateTime1, zoneOffset0), localDateTime1.S(), zoneId0);
        }
        return (ZonedDateTime)r0.l(this, v);
    }

    static ZonedDateTime S(ObjectInput objectInput0) {
        LocalDateTime localDateTime0 = LocalDateTime.Z(LocalDate.c0(objectInput0.readInt(), objectInput0.readByte(), objectInput0.readByte()), LocalTime.g0(objectInput0));
        ZoneOffset zoneOffset0 = ZoneOffset.b0(objectInput0);
        ZoneId zoneId0 = (ZoneId)p.a(objectInput0);
        Objects.requireNonNull(localDateTime0, "localDateTime");
        Objects.requireNonNull(zoneOffset0, "offset");
        Objects.requireNonNull(zoneId0, "zone");
        if(zoneId0 instanceof ZoneOffset && !zoneOffset0.equals(zoneId0)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(localDateTime0, zoneId0, zoneOffset0);
    }

    final void T(DataOutput dataOutput0) {
        this.a.j0(dataOutput0);
        this.b.c0(dataOutput0);
        this.c.U(((ObjectOutput)dataOutput0));
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final j..time.chrono.l a() {
        return ((LocalDate)this.b()).a();
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final j..time.chrono.b b() {
        return this.toLocalDate();
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        if(q0 instanceof a) {
            int v1 = v.a[((a)q0).ordinal()];
            LocalDateTime localDateTime0 = this.a;
            ZoneId zoneId0 = this.c;
            if(v1 != 1) {
                ZoneOffset zoneOffset0 = this.b;
                if(v1 != 2) {
                    return ZonedDateTime.Q(localDateTime0.g0(v, q0), zoneId0, zoneOffset0);
                }
                ZoneOffset zoneOffset1 = ZoneOffset.Z(((a)q0).Q(v));
                return zoneOffset1.equals(zoneOffset0) || !zoneId0.Q().g(localDateTime0).contains(zoneOffset1) ? this : new ZonedDateTime(localDateTime0, zoneId0, zoneOffset1);
            }
            return ZonedDateTime.z(v, localDateTime0.S(), zoneId0);
        }
        return (ZonedDateTime)q0.u(this, v);
    }

    @Override
    public final int compareTo(Object object0) {
        return h.d(this, ((ChronoZonedDateTime)object0));
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.R(v, r0);
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a || q0 != null && q0.q(this);
    }

    // 去混淆评级： 中等(50)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof ZonedDateTime && (this.a.equals(((ZonedDateTime)object0).a) && this.b.equals(((ZonedDateTime)object0).b) && this.c.equals(((ZonedDateTime)object0).c));
    }

    public String format(DateTimeFormatter dateTimeFormatter0) {
        Objects.requireNonNull(dateTimeFormatter0, "formatter");
        return dateTimeFormatter0.a(this);
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId0) {
        Objects.requireNonNull(zoneId0, "zone");
        return this.c.equals(zoneId0) ? this : ZonedDateTime.Q(this.a, zoneId0, this.b);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode() ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.R(0x7FFFFFFFFFFFFFFFL, chronoUnit0).R(1L, chronoUnit0) : this.R(-v, chronoUnit0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        if(q0 instanceof a) {
            switch(((a)q0)) {
                case 1: {
                    throw new s("Invalid field \'InstantSeconds\' for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                case 2: {
                    return this.b.W();
                }
                default: {
                    return this.a.n(q0);
                }
            }
        }
        return h.e(this, q0);
    }

    public static ZonedDateTime ofInstant(Instant instant0, ZoneId zoneId0) {
        Objects.requireNonNull(instant0, "instant");
        Objects.requireNonNull(zoneId0, "zone");
        return ZonedDateTime.z(instant0.getEpochSecond(), instant0.getNano(), zoneId0);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        ZoneOffset zoneOffset0 = this.b;
        ZoneId zoneId0 = this.c;
        LocalDateTime localDateTime0 = this.a;
        if(localDate0 instanceof LocalDate) {
            return ZonedDateTime.Q(LocalDateTime.Z(localDate0, localDateTime0.toLocalTime()), zoneId0, zoneOffset0);
        }
        localDate0.getClass();
        return (ZonedDateTime)h.a(localDate0, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 instanceof a) {
            return q0 == a.INSTANT_SECONDS || q0 == a.OFFSET_SECONDS ? ((a)q0).l() : this.a.q(q0);
        }
        return q0.y(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId s() {
        return this.c;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.ofEpochSecond(this.P(), this.toLocalTime().V());
    }

    public LocalDate toLocalDate() {
        return this.a.f0();
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    @Override
    public final String toString() {
        String s = this.a.toString() + this.b.toString();
        return this.b == this.c ? s : s + "[" + this.c.toString() + "]";
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            switch(((a)q0)) {
                case 1: {
                    return h.o(this);
                }
                case 2: {
                    return (long)this.b.W();
                }
                default: {
                    return this.a.u(q0);
                }
            }
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(6, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return temporalQuery0 == m.f() ? this.toLocalDate() : h.l(this, temporalQuery0);
    }

    private static ZonedDateTime z(long v, int v1, ZoneId zoneId0) {
        ZoneOffset zoneOffset0 = zoneId0.Q().d(Instant.ofEpochSecond(v, v1));
        return new ZonedDateTime(LocalDateTime.a0(v, v1, zoneOffset0), zoneId0, zoneOffset0);
    }
}

