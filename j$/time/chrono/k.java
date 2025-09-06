package j$.time.chrono;

import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalDateTime;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.m;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.t;
import j..time.zone.b;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

final class k implements ChronoZonedDateTime, Serializable {
    private final transient f a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;
    private static final long serialVersionUID = 0xB6FA480E92B4D959L;

    private k(ZoneId zoneId0, ZoneOffset zoneOffset0, f f0) {
        this.a = (f)Objects.requireNonNull(f0, "dateTime");
        this.b = (ZoneOffset)Objects.requireNonNull(zoneOffset0, "offset");
        this.c = (ZoneId)Objects.requireNonNull(zoneId0, "zone");
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime C() {
        return this.a;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final long P() {
        return h.o(this);
    }

    static ChronoZonedDateTime Q(ZoneId zoneId0, ZoneOffset zoneOffset0, f f0) {
        Objects.requireNonNull(f0, "localDateTime");
        Objects.requireNonNull(zoneId0, "zone");
        if(zoneId0 instanceof ZoneOffset) {
            return new k(zoneId0, ((ZoneOffset)zoneId0), f0);
        }
        j..time.zone.f f1 = zoneId0.Q();
        LocalDateTime localDateTime0 = LocalDateTime.R(f0);
        List list0 = f1.g(localDateTime0);
        if(list0.size() == 1) {
            zoneOffset0 = (ZoneOffset)list0.get(0);
        }
        else if(list0.size() == 0) {
            b b0 = f1.f(localDateTime0);
            f0 = f0.T(b0.p().getSeconds());
            zoneOffset0 = b0.q();
        }
        else if(zoneOffset0 == null || !list0.contains(zoneOffset0)) {
            zoneOffset0 = (ZoneOffset)list0.get(0);
        }
        Objects.requireNonNull(zoneOffset0, "offset");
        return new k(zoneId0, zoneOffset0, f0);
    }

    static k R(l l0, Instant instant0, ZoneId zoneId0) {
        ZoneOffset zoneOffset0 = zoneId0.Q().d(instant0);
        Objects.requireNonNull(zoneOffset0, "offset");
        return new k(zoneId0, zoneOffset0, ((f)l0.r(LocalDateTime.a0(instant0.getEpochSecond(), instant0.getNano(), zoneOffset0))));
    }

    public final ChronoZonedDateTime S(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            f f0 = this.a.S(v, r0);
            return k.z(this.a(), f0.z(this));
        }
        return k.z(this.a(), r0.l(this, v));
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final l a() {
        return this.b().a();
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final j..time.chrono.b b() {
        return ((f)this.C()).b();
    }

    @Override  // j$.time.temporal.l
    public final j..time.temporal.l c(long v, q q0) {
        if(q0 instanceof a) {
            int v1 = j.a[((a)q0).ordinal()];
            if(v1 != 1) {
                ZoneId zoneId0 = this.c;
                f f0 = this.a;
                if(v1 != 2) {
                    f f1 = f0.W(v, q0);
                    return k.Q(zoneId0, this.b, f1);
                }
                ZoneOffset zoneOffset0 = ZoneOffset.Z(((a)q0).Q(v));
                f0.getClass();
                Instant instant0 = Instant.ofEpochSecond(f0.V(zoneOffset0), f0.toLocalTime().V());
                return k.R(this.a(), instant0, zoneId0);
            }
            return this.S(v - h.o(this), ChronoUnit.SECONDS);
        }
        return k.z(this.a(), q0.u(this, v));
    }

    @Override
    public final int compareTo(Object object0) {
        return h.d(this, ((ChronoZonedDateTime)object0));
    }

    @Override  // j$.time.temporal.l
    public final j..time.temporal.l d(long v, r r0) {
        return this.S(v, r0);
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a || q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof ChronoZonedDateTime && h.d(this, ((ChronoZonedDateTime)object0)) == 0;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId0) {
        return k.Q(zoneId0, this.b, this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode() ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override  // j$.time.temporal.l
    public final j..time.temporal.l l(long v, ChronoUnit chronoUnit0) {
        return k.z(this.a(), m.b(this, v, chronoUnit0));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return h.e(this, q0);
    }

    @Override  // j$.time.temporal.l
    public final j..time.temporal.l p(LocalDate localDate0) {
        return k.z(this.a(), localDate0.z(this));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 instanceof a) {
            return q0 == a.INSTANT_SECONDS || q0 == a.OFFSET_SECONDS ? ((a)q0).l() : ((f)this.C()).q(q0);
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

    @Override  // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime toLocalTime() {
        return ((f)this.C()).toLocalTime();
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
                    return this.P();
                }
                case 2: {
                    return (long)this.g().W();
                }
                default: {
                    return ((f)this.C()).u(q0);
                }
            }
        }
        return q0.p(this);
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeObject(this.a);
        objectOutput0.writeObject(this.b);
        objectOutput0.writeObject(this.c);
    }

    private Object writeReplace() {
        return new E(3, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return h.l(this, temporalQuery0);
    }

    static k z(l l0, j..time.temporal.l l1) {
        if(!l0.equals(((k)l1).a())) {
            throw new ClassCastException("Chronology mismatch, required: " + l0.k() + ", actual: " + ((k)l1).a().k());
        }
        return (k)l1;
    }
}

