package j$.time;

import j..time.chrono.h;
import j..time.format.F;
import j..time.format.v;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.s;
import j..time.temporal.t;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class r implements l, n, Serializable, Comparable {
    private final int a;
    public static final int b = 0;
    private static final long serialVersionUID = 0xFFAE26B64BB10611L;

    static {
        v v0 = new v();
        v0.p(a.YEAR, 4, 10, F.EXCEEDS_PAD);
        v0.x();
    }

    private r(int v) {
        this.a = v;
    }

    public static r Q(int v) {
        a.YEAR.R(((long)v));
        return new r(v);
    }

    public final r R(long v, j..time.temporal.r r0) {
        if(r0 instanceof ChronoUnit) {
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.S(v);
                }
                case 2: {
                    return this.S(j..com.android.tools.r8.a.o(v, 10L));
                }
                case 3: {
                    return this.S(j..com.android.tools.r8.a.o(v, 100L));
                }
                case 4: {
                    return this.S(j..com.android.tools.r8.a.o(v, 1000L));
                }
                case 5: {
                    return this.T(j..com.android.tools.r8.a.i(this.u(a.ERA), v), a.ERA);
                }
                default: {
                    throw new s("Unsupported unit: " + r0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (r)r0.l(this, v);
    }

    public final r S(long v) {
        return v == 0L ? this : r.Q(a.YEAR.Q(((long)this.a) + v));
    }

    public final r T(long v, q q0) {
        if(q0 instanceof a) {
            ((a)q0).R(v);
            int v1 = this.a;
            switch(((a)q0)) {
                case 1: {
                    if(v1 < 1) {
                        v = 1L - v;
                    }
                    return r.Q(((int)v));
                }
                case 2: {
                    return r.Q(((int)v));
                }
                case 3: {
                    return this.u(a.ERA) == v ? this : r.Q(1 - v1);
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (r)q0.u(this, v);
    }

    final void U(DataOutput dataOutput0) {
        dataOutput0.writeInt(this.a);
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        return this.T(v, q0);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a - ((r)object0).a;
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, j..time.temporal.r r0) {
        return this.R(v, r0);
    }

    // 去混淆评级： 低(40)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? q0 == a.YEAR || q0 == a.YEAR_OF_ERA || q0 == a.ERA : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof r && this.a == ((r)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.R(0x7FFFFFFFFFFFFFFFL, chronoUnit0).R(1L, chronoUnit0) : this.R(-v, chronoUnit0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return this.q(q0).a(this.u(q0), q0);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        localDate0.getClass();
        return (r)h.a(localDate0, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 == a.YEAR_OF_ERA) {
            return this.a > 0 ? t.j(1L, 0x3B9AC9FFL) : t.j(1L, 1000000000L);
        }
        return m.d(this, q0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            int v = this.a;
            int v1 = 1;
            switch(((a)q0)) {
                case 1: {
                    if(v < 1) {
                        v = 1 - v;
                    }
                    return (long)v;
                }
                case 2: {
                    return (long)v;
                }
                case 3: {
                    if(v < 1) {
                        v1 = 0;
                    }
                    return (long)v1;
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(11, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == m.e()) {
            return j..time.chrono.s.d;
        }
        return temporalQuery0 == m.j() ? ChronoUnit.YEARS : m.c(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        if(!h.p(l0).equals(j..time.chrono.s.d)) {
            throw new b("Adjustment only supported on ISO date-time");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return l0.c(((long)this.a), a.YEAR);
    }
}

