package j$.time;

import j..time.chrono.h;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.s;
import j..time.temporal.t;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class OffsetDateTime implements l, n, Serializable, Comparable {
    private final LocalDateTime a;
    private final ZoneOffset b;
    private static final long serialVersionUID = 0x1FBFBC5D57D80062L;

    static {
        LocalDateTime.c.getClass();
        OffsetDateTime.Q(LocalDateTime.c, ZoneOffset.g);
        LocalDateTime.d.getClass();
        OffsetDateTime.Q(LocalDateTime.d, ZoneOffset.f);
    }

    private OffsetDateTime(LocalDateTime localDateTime0, ZoneOffset zoneOffset0) {
        this.a = (LocalDateTime)Objects.requireNonNull(localDateTime0, "dateTime");
        this.b = (ZoneOffset)Objects.requireNonNull(zoneOffset0, "offset");
    }

    public static OffsetDateTime Q(LocalDateTime localDateTime0, ZoneOffset zoneOffset0) {
        return new OffsetDateTime(localDateTime0, zoneOffset0);
    }

    public static OffsetDateTime R(Instant instant0, ZoneId zoneId0) {
        Objects.requireNonNull(instant0, "instant");
        Objects.requireNonNull(zoneId0, "zone");
        ZoneOffset zoneOffset0 = zoneId0.Q().d(instant0);
        return new OffsetDateTime(LocalDateTime.a0(instant0.getEpochSecond(), instant0.getNano(), zoneOffset0), zoneOffset0);
    }

    // 去混淆评级： 低(20)
    public final OffsetDateTime S(long v, r r0) {
        return r0 instanceof ChronoUnit ? this.U(this.a.b0(v, r0), this.b) : ((OffsetDateTime)r0.l(this, v));
    }

    static OffsetDateTime T(ObjectInput objectInput0) {
        return new OffsetDateTime(LocalDateTime.Z(LocalDate.c0(objectInput0.readInt(), objectInput0.readByte(), objectInput0.readByte()), LocalTime.g0(objectInput0)), ZoneOffset.b0(objectInput0));
    }

    private OffsetDateTime U(LocalDateTime localDateTime0, ZoneOffset zoneOffset0) {
        return this.a != localDateTime0 || !this.b.equals(zoneOffset0) ? new OffsetDateTime(localDateTime0, zoneOffset0) : this;
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        if(q0 instanceof a) {
            ZoneOffset zoneOffset0 = this.b;
            LocalDateTime localDateTime0 = this.a;
            switch(((a)q0)) {
                case 1: {
                    return OffsetDateTime.R(Instant.ofEpochSecond(v, localDateTime0.S()), zoneOffset0);
                }
                case 2: {
                    return this.U(localDateTime0, ZoneOffset.Z(((a)q0).Q(v)));
                }
                default: {
                    return this.U(localDateTime0.g0(v, q0), zoneOffset0);
                }
            }
        }
        return (OffsetDateTime)q0.u(this, v);
    }

    @Override
    public final int compareTo(Object object0) {
        int v;
        ZoneOffset zoneOffset0 = this.b;
        if(zoneOffset0.equals(((OffsetDateTime)object0).b)) {
            v = this.toLocalDateTime().B(((OffsetDateTime)object0).toLocalDateTime());
            return v == 0 ? this.toLocalDateTime().B(((OffsetDateTime)object0).toLocalDateTime()) : v;
        }
        this.a.getClass();
        long v1 = h.n(this.a, zoneOffset0);
        ((OffsetDateTime)object0).a.getClass();
        v = Long.compare(v1, h.n(((OffsetDateTime)object0).a, ((OffsetDateTime)object0).b));
        if(v == 0) {
            v = this.toLocalTime().V() - ((OffsetDateTime)object0).toLocalTime().V();
        }
        return v == 0 ? this.toLocalDateTime().B(((OffsetDateTime)object0).toLocalDateTime()) : v;
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.S(v, r0);
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a || q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof OffsetDateTime && (this.a.equals(((OffsetDateTime)object0).a) && this.b.equals(((OffsetDateTime)object0).b));
    }

    public final ZoneOffset g() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.S(0x7FFFFFFFFFFFFFFFL, chronoUnit0).S(1L, chronoUnit0) : this.S(-v, chronoUnit0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        if(q0 instanceof a) {
            switch(m.a[((a)q0).ordinal()]) {
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
        return j..time.temporal.m.a(this, q0);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        LocalDateTime localDateTime0 = this.a;
        ZoneOffset zoneOffset0 = this.b;
        if(!(localDate0 instanceof LocalDate)) {
            localDate0.getClass();
            return (OffsetDateTime)h.a(localDate0, this);
        }
        return this.U(localDateTime0.h0(localDate0), zoneOffset0);
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

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public LocalTime toLocalTime() {
        return this.a.toLocalTime();
    }

    @Override
    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            ZoneOffset zoneOffset0 = this.b;
            LocalDateTime localDateTime0 = this.a;
            switch(m.a[((a)q0).ordinal()]) {
                case 1: {
                    localDateTime0.getClass();
                    return h.n(localDateTime0, zoneOffset0);
                }
                case 2: {
                    return (long)zoneOffset0.W();
                }
                default: {
                    return localDateTime0.u(q0);
                }
            }
        }
        return q0.p(this);
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        this.a.j0(objectOutput0);
        this.b.c0(objectOutput0);
    }

    private Object writeReplace() {
        return new p(10, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        if(temporalQuery0 != j..time.temporal.m.i() && temporalQuery0 != j..time.temporal.m.k()) {
            if(temporalQuery0 == j..time.temporal.m.l()) {
                return null;
            }
            if(temporalQuery0 == j..time.temporal.m.f()) {
                return this.a.f0();
            }
            if(temporalQuery0 == j..time.temporal.m.g()) {
                return this.toLocalTime();
            }
            if(temporalQuery0 == j..time.temporal.m.e()) {
                return j..time.chrono.s.d;
            }
            return temporalQuery0 == j..time.temporal.m.j() ? ChronoUnit.NANOS : temporalQuery0.queryFrom(this);
        }
        return this.b;
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(this.a.f0().v(), a.EPOCH_DAY).c(this.toLocalTime().h0(), a.NANO_OF_DAY).c(((long)this.b.W()), a.OFFSET_SECONDS);
    }
}

