package j$.time.chrono;

import j..com.android.tools.r8.a;
import j..time.Instant;
import j..time.LocalDate;
import j..time.LocalTime;
import j..time.ZoneId;
import j..time.ZoneOffset;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalQuery;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.t;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

final class f implements ChronoLocalDateTime, l, n, Serializable {
    private final transient b a;
    private final transient LocalTime b;
    private static final long serialVersionUID = 4556003607393004514L;

    private f(b b0, LocalTime localTime0) {
        Objects.requireNonNull(b0, "date");
        Objects.requireNonNull(localTime0, "time");
        this.a = b0;
        this.b = localTime0;
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final int B(ChronoLocalDateTime chronoLocalDateTime0) {
        return h.c(this, chronoLocalDateTime0);
    }

    static f Q(j..time.chrono.l l0, l l1) {
        if(!l0.equals(((f)l1).a.a())) {
            throw new ClassCastException("Chronology mismatch, required: " + l0.k() + ", actual: " + ((f)l1).a.a().k());
        }
        return (f)l1;
    }

    static f R(b b0, LocalTime localTime0) {
        return new f(b0, localTime0);
    }

    public final f S(long v, r r0) {
        b b0 = this.a;
        if(r0 instanceof ChronoUnit) {
            LocalTime localTime0 = this.b;
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.U(this.a, 0L, 0L, 0L, v);
                }
                case 2: {
                    f f0 = this.X(b0.d(v / 86400000000L, ChronoUnit.DAYS), localTime0);
                    return f0.U(f0.a, 0L, 0L, 0L, v % 86400000000L * 1000L);
                }
                case 3: {
                    f f1 = this.X(b0.d(v / 86400000L, ChronoUnit.DAYS), localTime0);
                    return f1.U(f1.a, 0L, 0L, 0L, v % 86400000L * 1000000L);
                }
                case 4: {
                    return this.T(v);
                }
                case 5: {
                    return this.U(this.a, 0L, v, 0L, 0L);
                }
                case 6: {
                    return this.U(this.a, v, 0L, 0L, 0L);
                }
                case 7: {
                    f f2 = this.X(b0.d(v / 0x100L, ChronoUnit.DAYS), localTime0);
                    return f2.U(f2.a, v % 0x100L * 12L, 0L, 0L, 0L);
                }
                default: {
                    return this.X(b0.d(v, r0), localTime0);
                }
            }
        }
        return f.Q(b0.a(), r0.l(this, v));
    }

    final f T(long v) {
        return this.U(this.a, 0L, 0L, v, 0L);
    }

    private f U(b b0, long v, long v1, long v2, long v3) {
        LocalTime localTime0 = this.b;
        if((v | v1 | v2 | v3) == 0L) {
            return this.X(b0, localTime0);
        }
        long v4 = localTime0.h0();
        long v5 = v % 24L * 3600000000000L + (v1 % 0x5A0L * 60000000000L + (v2 % 86400L * 1000000000L + v3 % 86400000000000L)) + v4;
        long v6 = a.n(v5, 86400000000000L);
        long v7 = a.m(v5, 86400000000000L);
        if(v7 != v4) {
            localTime0 = LocalTime.Z(v7);
        }
        return this.X(b0.d(v6 + (v / 24L + (v1 / 0x5A0L + (v2 / 86400L + v3 / 86400000000000L))), ChronoUnit.DAYS), localTime0);
    }

    public final long V(ZoneOffset zoneOffset0) {
        return h.n(this, zoneOffset0);
    }

    public final f W(long v, q q0) {
        b b0 = this.a;
        if(q0 instanceof j..time.temporal.a) {
            return ((j..time.temporal.a)q0).S() ? this.X(b0, this.b.j0(v, q0)) : this.X(b0.c(v, q0), this.b);
        }
        return f.Q(b0.a(), q0.u(this, v));
    }

    private f X(l l0, LocalTime localTime0) {
        return this.a != l0 || this.b != localTime0 ? new f(d.Q(this.a.a(), l0), localTime0) : this;
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final j..time.chrono.l a() {
        return this.a.a();
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final b b() {
        return this.a;
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        return this.W(v, q0);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.B(((ChronoLocalDateTime)object0));
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.S(v, r0);
    }

    // 去混淆评级： 中等(60)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof j..time.temporal.a ? ((j..time.temporal.a)q0).z() || ((j..time.temporal.a)q0).S() : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof ChronoLocalDateTime && h.c(this, ((ChronoLocalDateTime)object0)) == 0;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return f.Q(this.a.a(), m.b(this, v, chronoUnit0));
    }

    @Override  // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime m(ZoneId zoneId0) {
        return k.Q(zoneId0, null, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        if(q0 instanceof j..time.temporal.a) {
            return ((j..time.temporal.a)q0).S() ? this.b.n(q0) : this.a.n(q0);
        }
        return this.q(q0).a(this.u(q0), q0);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        if(localDate0 instanceof b) {
            return this.X(localDate0, this.b);
        }
        j..time.chrono.l l0 = this.a.a();
        localDate0.getClass();
        return f.Q(l0, ((f)h.a(localDate0, this)));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 instanceof j..time.temporal.a) {
            if(((j..time.temporal.a)q0).S()) {
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
        return Instant.ofEpochSecond(this.V(zoneOffset0), this.toLocalTime().V());
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
        if(q0 instanceof j..time.temporal.a) {
            return ((j..time.temporal.a)q0).S() ? this.b.u(q0) : this.a.u(q0);
        }
        return q0.p(this);
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeObject(this.a);
        objectOutput0.writeObject(this.b);
    }

    private Object writeReplace() {
        return new E(2, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return h.k(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(this.b().v(), j..time.temporal.a.EPOCH_DAY).c(this.toLocalTime().h0(), j..time.temporal.a.NANO_OF_DAY);
    }
}

