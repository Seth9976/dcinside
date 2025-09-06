package j$.time;

import j..time.chrono.h;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.t;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class n implements l, j..time.temporal.n, Serializable, Comparable {
    private final LocalTime a;
    private final ZoneOffset b;
    private static final long serialVersionUID = 0x64D0AFFDFEC1386CL;

    static {
        LocalTime.e.getClass();
        n.Q(LocalTime.e, ZoneOffset.g);
        LocalTime.f.getClass();
        n.Q(LocalTime.f, ZoneOffset.f);
    }

    private n(LocalTime localTime0, ZoneOffset zoneOffset0) {
        this.a = (LocalTime)Objects.requireNonNull(localTime0, "time");
        this.b = (ZoneOffset)Objects.requireNonNull(zoneOffset0, "offset");
    }

    public static n Q(LocalTime localTime0, ZoneOffset zoneOffset0) {
        return new n(localTime0, zoneOffset0);
    }

    // 去混淆评级： 低(20)
    public final n R(long v, r r0) {
        return r0 instanceof ChronoUnit ? this.T(this.a.b0(v, r0), this.b) : ((n)r0.l(this, v));
    }

    static n S(ObjectInput objectInput0) {
        return new n(LocalTime.g0(objectInput0), ZoneOffset.b0(objectInput0));
    }

    private n T(LocalTime localTime0, ZoneOffset zoneOffset0) {
        return this.a != localTime0 || !this.b.equals(zoneOffset0) ? new n(localTime0, zoneOffset0) : this;
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        if(q0 instanceof a) {
            return q0 == a.OFFSET_SECONDS ? this.T(this.a, ZoneOffset.Z(((a)q0).Q(v))) : this.T(this.a.j0(v, q0), this.b);
        }
        return (n)q0.u(this, v);
    }

    @Override
    public final int compareTo(Object object0) {
        ZoneOffset zoneOffset0 = this.b;
        boolean z = zoneOffset0.equals(((n)object0).b);
        LocalTime localTime0 = ((n)object0).a;
        LocalTime localTime1 = this.a;
        if(z) {
            return localTime1.Q(localTime0);
        }
        int v = Long.compare(localTime1.h0() - ((long)zoneOffset0.W()) * 1000000000L, localTime0.h0() - ((long)((n)object0).b.W()) * 1000000000L);
        return v == 0 ? localTime1.Q(localTime0) : v;
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.R(v, r0);
    }

    // 去混淆评级： 中等(50)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? ((a)q0).S() || q0 == a.OFFSET_SECONDS : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof n && (this.a.equals(((n)object0).a) && this.b.equals(((n)object0).b));
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.R(0x7FFFFFFFFFFFFFFFL, chronoUnit0).R(1L, chronoUnit0) : this.R(-v, chronoUnit0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return m.a(this, q0);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        localDate0.getClass();
        return (n)h.a(localDate0, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 instanceof a) {
            if(q0 == a.OFFSET_SECONDS) {
                return ((a)q0).l();
            }
            this.a.getClass();
            return m.d(this.a, q0);
        }
        return q0.y(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            return q0 == a.OFFSET_SECONDS ? ((long)this.b.W()) : this.a.u(q0);
        }
        return q0.p(this);
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        this.a.l0(objectOutput0);
        this.b.c0(objectOutput0);
    }

    private Object writeReplace() {
        return new p(9, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        int v = 0;
        if(temporalQuery0 != m.i() && temporalQuery0 != m.k()) {
            int v1 = temporalQuery0 == m.l() ? 1 : 0;
            if(temporalQuery0 == m.e()) {
                v = 1;
            }
            if((v1 | v) == 0 && temporalQuery0 != m.f()) {
                if(temporalQuery0 == m.g()) {
                    return this.a;
                }
                return temporalQuery0 == m.j() ? ChronoUnit.NANOS : temporalQuery0.queryFrom(this);
            }
            return null;
        }
        return this.b;
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(this.a.h0(), a.NANO_OF_DAY).c(((long)this.b.W()), a.OFFSET_SECONDS);
    }
}

