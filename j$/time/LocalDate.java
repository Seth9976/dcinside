package j$.time;

import j..time.chrono.ChronoLocalDateTime;
import j..time.chrono.b;
import j..time.chrono.h;
import j..time.chrono.m;
import j..time.chrono.s;
import j..time.chrono.t;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalAmount;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.r;
import j..util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class LocalDate implements b, l, n, Serializable {
    private final int a;
    private final short b;
    private final short c;
    public static final LocalDate d = null;
    public static final LocalDate e = null;
    private static final long serialVersionUID = 0x28D617B1D8F33F1EL;

    static {
        LocalDate.d = LocalDate.c0(0xC4653601, 1, 1);
        LocalDate.e = LocalDate.c0(0x3B9AC9FF, 12, 0x1F);
        LocalDate.c0(1970, 1, 1);
    }

    private LocalDate(int v, int v1, int v2) {
        this.a = v;
        this.b = (short)v1;
        this.c = (short)v2;
    }

    @Override  // j$.time.chrono.b
    public final m A() {
        return this.a < 1 ? t.BCE : t.CE;
    }

    @Override  // j$.time.chrono.b
    public final b E(TemporalAmount temporalAmount0) {
        if(temporalAmount0 instanceof o) {
            return this.h0(((o)temporalAmount0).d()).g0(((long)((o)temporalAmount0).a()));
        }
        Objects.requireNonNull(temporalAmount0, "amountToAdd");
        return (LocalDate)temporalAmount0.l(this);
    }

    @Override  // j$.time.chrono.b
    public final boolean F() {
        return s.d.N(((long)this.a));
    }

    @Override  // j$.time.chrono.b
    public final b J(long v, r r0) {
        return this.a0(v, ((ChronoUnit)r0));
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.chrono.b
    public final int L() {
        return this.F() ? 366 : 365;
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.chrono.b
    public final int M(b b0) {
        return b0 instanceof LocalDate ? this.Q(((LocalDate)b0)) : h.b(this, b0);
    }

    final int Q(LocalDate localDate0) {
        int v = this.a - localDate0.a;
        if(v == 0) {
            v = this.b - localDate0.b;
            return v == 0 ? this.c - localDate0.c : v;
        }
        return v;
    }

    private static LocalDate R(int v, int v1, int v2) {
        int v3 = 28;
        if(v2 > 28) {
            switch(v1) {
                case 2: {
                    if(s.d.N(((long)v))) {
                        v3 = 29;
                    }
                    break;
                }
                case 4: 
                case 6: 
                case 9: 
                case 11: {
                    v3 = 30;
                    break;
                }
                default: {
                    v3 = 0x1F;
                }
            }
            if(v2 > v3) {
                throw v2 == 29 ? new j..time.b("Invalid date \'February 29\' as \'" + v + "\' is not a leap year") : new j..time.b("Invalid date \'" + j.T(v1).name() + " " + v2 + "\'");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V / 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
        return new LocalDate(v, v1, v2);
    }

    public static LocalDate S(TemporalAccessor temporalAccessor0) {
        Objects.requireNonNull(temporalAccessor0, "temporal");
        LocalDate localDate0 = (LocalDate)temporalAccessor0.y(j..time.temporal.m.f());
        if(localDate0 == null) {
            throw new j..time.b("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor0 + " of type " + temporalAccessor0.getClass().getName());  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return localDate0;
    }

    private int T(q q0) {
        int v = this.c;
        int v1 = this.a;
        switch(((a)q0)) {
            case 1: {
                return v;
            }
            case 2: {
                return this.V();
            }
            case 3: {
                return (v - 1) / 7 + 1;
            }
            case 4: {
                return v1 >= 1 ? v1 : 1 - v1;
            }
            case 5: {
                return this.U().getValue();
            }
            case 6: {
                return (v - 1) % 7 + 1;
            }
            case 7: {
                return (this.V() - 1) % 7 + 1;
            }
            case 8: {
                throw new j..time.temporal.s("Invalid field \'EpochDay\' for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            case 9: {
                return (this.V() - 1) / 7 + 1;
            }
            case 10: {
                return this.b;
            }
            case 11: {
                throw new j..time.temporal.s("Invalid field \'ProlepticMonth\' for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            case 12: {
                return v1;
            }
            case 13: {
                return v1 >= 1 ? 1 : 0;
            }
            default: {
                throw new j..time.temporal.s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    public final d U() {
        return d.Q(((int)j..com.android.tools.r8.a.m(this.v() + 3L, 7L)) + 1);
    }

    public final int V() {
        return j.T(this.b).Q(this.F()) + this.c - 1;
    }

    public final int W() {
        return this.b;
    }

    public final int X() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    public final boolean Y(LocalDate localDate0) {
        return localDate0 instanceof LocalDate ? this.Q(localDate0) < 0 : this.v() < localDate0.v();
    }

    public final int Z() {
        switch(this.b) {
            case 2: {
                return this.F() ? 29 : 28;
            }
            case 4: 
            case 6: 
            case 9: 
            case 11: {
                return 30;
            }
            default: {
                return 0x1F;
            }
        }
    }

    @Override  // j$.time.chrono.b
    public final j..time.chrono.l a() {
        return s.d;
    }

    public final LocalDate a0(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.f0(0x7FFFFFFFFFFFFFFFL, chronoUnit0).f0(1L, chronoUnit0) : this.f0(-v, chronoUnit0);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId0) {
        Objects.requireNonNull(zoneId0, "zone");
        LocalDateTime localDateTime0 = LocalDateTime.Z(this, LocalTime.g);
        if(!(zoneId0 instanceof ZoneOffset)) {
            j..time.zone.b b0 = zoneId0.Q().f(localDateTime0);
            if(b0 != null && b0.z()) {
                localDateTime0 = b0.l();
            }
        }
        return ZonedDateTime.Q(localDateTime0, zoneId0, null);
    }

    public static LocalDate b0(Clock clock0) {
        Objects.requireNonNull(clock0, "clock");
        Instant instant0 = clock0.instant();
        ZoneId zoneId0 = clock0.a();
        Objects.requireNonNull(instant0, "instant");
        Objects.requireNonNull(zoneId0, "zone");
        return LocalDate.ofEpochDay(j..com.android.tools.r8.a.n(instant0.getEpochSecond() + ((long)zoneId0.Q().d(instant0).W()), 86400L));
    }

    @Override  // j$.time.chrono.b
    public final b c(long v, q q0) {
        return this.l0(v, q0);
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        return this.l0(v, q0);
    }

    public static LocalDate c0(int v, int v1, int v2) {
        a.YEAR.R(((long)v));
        a.MONTH_OF_YEAR.R(((long)v1));
        a.DAY_OF_MONTH.R(((long)v2));
        return LocalDate.R(v, v1, v2);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.M(((b)object0));
    }

    @Override  // j$.time.chrono.b
    public final b d(long v, r r0) {
        return this.f0(v, r0);
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.f0(v, r0);
    }

    public static LocalDate d0(int v, j j0, int v1) {
        a.YEAR.R(((long)v));
        Objects.requireNonNull(j0, "month");
        a.DAY_OF_MONTH.R(((long)v1));
        return LocalDate.R(v, j0.getValue(), v1);
    }

    @Override  // j$.time.chrono.b, j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return h.h(this, q0);
    }

    public static LocalDate e0(int v, int v1) {
        a.YEAR.R(((long)v));
        a.DAY_OF_YEAR.R(((long)v1));
        boolean z = s.d.N(((long)v));
        if(v1 == 366 && !z) {
            throw new j..time.b("Invalid date \'DayOfYear 366\' as \'" + v + "\' is not a leap year");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        j j0 = j.T((v1 - 1) / 0x1F + 1);
        if(v1 > j0.R(z) + j0.Q(z) - 1) {
            j0 = j0.U();
        }
        return new LocalDate(v, j0.getValue(), v1 - j0.Q(z) + 1);
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.chrono.b
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof LocalDate && this.Q(((LocalDate)object0)) == 0;
    }

    public final LocalDate f0(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.g0(v);
                }
                case 2: {
                    return this.i0(v);
                }
                case 3: {
                    return this.h0(v);
                }
                case 4: {
                    return this.j0(v);
                }
                case 5: {
                    return this.j0(j..com.android.tools.r8.a.o(v, 10L));
                }
                case 6: {
                    return this.j0(j..com.android.tools.r8.a.o(v, 100L));
                }
                case 7: {
                    return this.j0(j..com.android.tools.r8.a.o(v, 1000L));
                }
                case 8: {
                    return this.l0(j..com.android.tools.r8.a.i(this.u(a.ERA), v), a.ERA);
                }
                default: {
                    throw new j..time.temporal.s("Unsupported unit: " + r0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (LocalDate)r0.l(this, v);
    }

    public final LocalDate g0(long v) {
        if(v == 0L) {
            return this;
        }
        long v1 = ((long)this.c) + v;
        if(v1 > 0L) {
            int v2 = this.b;
            int v3 = this.a;
            if(v1 <= 28L) {
                return new LocalDate(v3, v2, ((int)v1));
            }
            if(v1 <= 59L) {
                long v4 = (long)this.Z();
                if(v1 <= v4) {
                    return new LocalDate(v3, v2, ((int)v1));
                }
                if(v2 < 12) {
                    return new LocalDate(v3, v2 + 1, ((int)(v1 - v4)));
                }
                a.YEAR.R(((long)(v3 + 1)));
                return new LocalDate(v3 + 1, 1, ((int)(v1 - v4)));
            }
        }
        return LocalDate.ofEpochDay(j..com.android.tools.r8.a.i(this.v(), v));
    }

    public final LocalDate h0(long v) {
        if(v == 0L) {
            return this;
        }
        long v1 = ((long)this.a) * 12L + ((long)(this.b - 1)) + v;
        long v2 = j..com.android.tools.r8.a.n(v1, 12L);
        return LocalDate.k0(a.YEAR.Q(v2), ((int)j..com.android.tools.r8.a.m(v1, 12L)) + 1, this.c);
    }

    @Override  // j$.time.chrono.b
    public final int hashCode() {
        return (this.a << 11) + (this.b << 6) + this.c ^ this.a & 0xFFFFF800;
    }

    @Override  // j$.time.chrono.b
    public final b i(n n0) {
        return this.m0(n0);
    }

    public final LocalDate i0(long v) {
        return this.g0(j..com.android.tools.r8.a.o(v, 7L));
    }

    public final LocalDate j0(long v) {
        return v == 0L ? this : LocalDate.k0(a.YEAR.Q(((long)this.a) + v), this.b, this.c);
    }

    private static LocalDate k0(int v, int v1, int v2) {
        switch(v1) {
            case 2: {
                return s.d.N(((long)v)) ? new LocalDate(v, 2, Math.min(v2, 29)) : new LocalDate(v, 2, Math.min(v2, 28));
            }
            case 4: 
            case 6: 
            case 9: 
            case 11: {
                return new LocalDate(v, v1, Math.min(v2, 30));
            }
            default: {
                return new LocalDate(v, v1, v2);
            }
        }
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return this.a0(v, chronoUnit0);
    }

    public final LocalDate l0(long v, q q0) {
        if(q0 instanceof a) {
            ((a)q0).R(v);
            int v1 = this.c;
            int v2 = this.b;
            int v3 = this.a;
            switch(((a)q0)) {
                case 1: {
                    return v1 == ((int)v) ? this : LocalDate.c0(v3, v2, ((int)v));
                }
                case 2: {
                    return this.n0(((int)v));
                }
                case 3: {
                    return this.i0(v - this.u(a.ALIGNED_WEEK_OF_MONTH));
                }
                case 4: {
                    if(v3 < 1) {
                        v = 1L - v;
                    }
                    return this.o0(((int)v));
                }
                case 5: {
                    return this.g0(v - ((long)this.U().getValue()));
                }
                case 6: {
                    return this.g0(v - this.u(a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                }
                case 7: {
                    return this.g0(v - this.u(a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                }
                case 8: {
                    return LocalDate.ofEpochDay(v);
                }
                case 9: {
                    return this.i0(v - this.u(a.ALIGNED_WEEK_OF_YEAR));
                }
                case 10: {
                    if(v2 == ((int)v)) {
                        return this;
                    }
                    a.MONTH_OF_YEAR.R(((long)(((int)v))));
                    return LocalDate.k0(v3, ((int)v), v1);
                }
                case 11: {
                    return this.h0(v - (((long)v3) * 12L + ((long)v2) - 1L));
                }
                case 12: {
                    return this.o0(((int)v));
                }
                case 13: {
                    return this.u(a.ERA) == v ? this : this.o0(1 - v3);
                }
                default: {
                    throw new j..time.temporal.s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (LocalDate)q0.u(this, v);
    }

    // 去混淆评级： 低(20)
    public final LocalDate m0(n n0) {
        return n0 instanceof LocalDate ? ((LocalDate)n0) : ((LocalDate)n0.z(this));
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return q0 instanceof a ? this.T(q0) : j..time.temporal.m.a(this, q0);
    }

    public final LocalDate n0(int v) {
        return this.V() == v ? this : LocalDate.e0(this.a, v);
    }

    public final LocalDate o0(int v) {
        if(this.a == v) {
            return this;
        }
        a.YEAR.R(((long)v));
        return LocalDate.k0(v, this.b, this.c);
    }

    public static LocalDate ofEpochDay(long v) {
        long v3;
        a.EPOCH_DAY.R(v);
        long v1 = v + 0xAFA6CL;
        if(v1 < 0L) {
            long v2 = (v + 0xAFA6DL) / 146097L - 1L;
            v3 = v2 * 400L;
            v1 += -v2 * 146097L;
        }
        else {
            v3 = 0L;
        }
        long v4 = (v1 * 400L + 0x24FL) / 146097L;
        long v5 = v1 - (v4 / 400L + (v4 / 4L + v4 * 365L - v4 / 100L));
        if(v5 < 0L) {
            --v4;
            v5 = v1 - (v4 / 400L + (v4 / 4L + 365L * v4 - v4 / 100L));
        }
        int v6 = (((int)v5) * 5 + 2) / 0x99;
        return new LocalDate(a.YEAR.Q(v4 + v3 + ((long)(v6 / 10))), (v6 + 2) % 12 + 1, ((int)v5) - (v6 * 306 + 5) / 10 + 1);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        return this.m0(localDate0);
    }

    final void p0(DataOutput dataOutput0) {
        dataOutput0.writeInt(this.a);
        dataOutput0.writeByte(((int)this.b));
        dataOutput0.writeByte(((int)this.c));
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final j..time.temporal.t q(q q0) {
        if(q0 instanceof a) {
            if(((a)q0).z()) {
                switch(((a)q0)) {
                    case 1: {
                        return j..time.temporal.t.j(1L, this.Z());
                    }
                    case 2: {
                        return j..time.temporal.t.j(1L, this.L());
                    }
                    case 3: {
                        return j.T(this.b) != j.FEBRUARY || this.F() ? j..time.temporal.t.j(1L, 5L) : j..time.temporal.t.j(1L, 4L);
                    }
                    case 4: {
                        return this.a > 0 ? j..time.temporal.t.j(1L, 0x3B9AC9FFL) : j..time.temporal.t.j(1L, 1000000000L);
                    }
                    default: {
                        return ((a)q0).l();
                    }
                }
            }
            throw new j..time.temporal.s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return q0.y(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.chrono.b
    public final String toString() {
        int v = this.a;
        StringBuilder stringBuilder0 = new StringBuilder(10);
        if(Math.abs(v) >= 1000) {
            if(v > 0x270F) {
                stringBuilder0.append('+');
            }
            stringBuilder0.append(v);
        }
        else if(v < 0) {
            stringBuilder0.append(v - 10000);
            stringBuilder0.deleteCharAt(1);
        }
        else {
            stringBuilder0.append(v + 10000);
            stringBuilder0.deleteCharAt(0);
        }
        String s = "-";
        stringBuilder0.append((this.b >= 10 ? "-" : "-0"));
        stringBuilder0.append(this.b);
        int v1 = this.c;
        if(v1 < 10) {
            s = "-0";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(v1);
        return stringBuilder0.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            if(q0 == a.EPOCH_DAY) {
                return this.v();
            }
            return q0 == a.PROLEPTIC_MONTH ? ((long)this.a) * 12L + ((long)this.b) - 1L : ((long)this.T(q0));
        }
        return q0.p(this);
    }

    @Override  // j$.time.chrono.b
    public final long v() {
        long v = (long)this.a;
        long v1 = (0x16FL * ((long)this.b) - 362L) / 12L + (v < 0L ? 365L * v - (v / -400L + (v / -4L - v / -100L)) : (v + 0x18FL) / 400L + ((v + 3L) / 4L - (v + 99L) / 100L) + 365L * v) + ((long)(this.c - 1));
        if(((long)this.b) > 2L) {
            if(!this.F()) {
                return v1 - 0xAFAAAL;
            }
            --v1;
        }
        return v1 - 0xAFAA8L;
    }

    private Object writeReplace() {
        return new p(3, this);
    }

    @Override  // j$.time.chrono.b
    public final ChronoLocalDateTime x(LocalTime localTime0) {
        return LocalDateTime.Z(this, localTime0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return temporalQuery0 == j..time.temporal.m.f() ? this : h.j(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return h.a(this, l0);
    }
}

