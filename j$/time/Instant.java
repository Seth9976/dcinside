package j$.time;

import j..com.android.tools.r8.a;
import j..time.chrono.h;
import j..time.format.DateTimeFormatter;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalAmount;
import j..time.temporal.TemporalQuery;
import j..time.temporal.l;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.s;
import j..time.temporal.t;
import j..util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class Instant implements l, n, Serializable, Comparable {
    public static final Instant MAX = null;
    public static final Instant MIN = null;
    private final long a;
    private final int b;
    public static final Instant c = null;
    private static final long serialVersionUID = 0xF6C2E8F0233A231CL;

    static {
        Instant.c = new Instant(0L, 0);
        Instant.MIN = Instant.ofEpochSecond(0xFF8FE31014641400L, 0L);
        Instant.MAX = Instant.ofEpochSecond(0x701CD2FA9578FFL, 0x3B9AC9FFL);
    }

    private Instant(long v, int v1) {
        this.a = v;
        this.b = v1;
    }

    private static Instant Q(long v, int v1) {
        if((((long)v1) | v) == 0L) {
            return Instant.c;
        }
        if(v < 0xFF8FE31014641400L || v > 0x701CD2FA9578FFL) {
            throw new b("Instant exceeds minimum or maximum instant");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return new Instant(v, v1);
    }

    public static Instant R(long v) {
        return Instant.Q(v, 0);
    }

    private Instant S(long v, long v1) {
        return (v | v1) == 0L ? this : Instant.ofEpochSecond(a.i(a.i(this.a, v), v1 / 1000000000L), ((long)this.b) + v1 % 1000000000L);
    }

    public final Instant T(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.S(0L, v);
                }
                case 2: {
                    return this.S(v / 1000000L, v % 1000000L * 1000L);
                }
                case 3: {
                    return this.S(v / 1000L, v % 1000L * 1000000L);
                }
                case 4: {
                    return this.S(v, 0L);
                }
                case 5: {
                    return this.S(a.o(v, 60L), 0L);
                }
                case 6: {
                    return this.S(a.o(v, 3600L), 0L);
                }
                case 7: {
                    return this.S(a.o(v, 43200L), 0L);
                }
                case 8: {
                    return this.S(a.o(v, 86400L), 0L);
                }
                default: {
                    throw new s("Unsupported unit: " + r0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (Instant)r0.l(this, v);
    }

    final void U(DataOutput dataOutput0) {
        dataOutput0.writeLong(this.a);
        dataOutput0.writeInt(this.b);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset0) {
        return OffsetDateTime.R(this, zoneOffset0);
    }

    public ZonedDateTime atZone(ZoneId zoneId0) {
        return ZonedDateTime.ofInstant(this, zoneId0);
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        if(q0 instanceof j..time.temporal.a) {
            ((j..time.temporal.a)q0).R(v);
            int v1 = this.b;
            long v2 = this.a;
            switch(e.a[((j..time.temporal.a)q0).ordinal()]) {
                case 1: {
                    return v == ((long)v1) ? this : Instant.Q(v2, ((int)v));
                }
                case 2: {
                    return ((int)v) * 1000 == v1 ? this : Instant.Q(v2, ((int)v) * 1000);
                }
                case 3: {
                    return ((int)v) * 1000000 == v1 ? this : Instant.Q(v2, ((int)v) * 1000000);
                }
                case 4: {
                    return v == v2 ? this : Instant.Q(v, v1);
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (Instant)q0.u(this, v);
    }

    @Override
    public final int compareTo(Object object0) {
        int v = Long.compare(this.a, ((Instant)object0).a);
        return v == 0 ? this.b - ((Instant)object0).b : v;
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.T(v, r0);
    }

    // 去混淆评级： 低(40)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof j..time.temporal.a ? q0 == j..time.temporal.a.INSTANT_SECONDS || q0 == j..time.temporal.a.NANO_OF_SECOND || q0 == j..time.temporal.a.MICRO_OF_SECOND || q0 == j..time.temporal.a.MILLI_OF_SECOND : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof Instant && (this.a == ((Instant)object0).a && this.b == ((Instant)object0).b);
    }

    public static Instant from(TemporalAccessor temporalAccessor0) {
        if(temporalAccessor0 instanceof Instant) {
            return (Instant)temporalAccessor0;
        }
        Objects.requireNonNull(temporalAccessor0, "temporal");
        try {
            return Instant.ofEpochSecond(temporalAccessor0.u(j..time.temporal.a.INSTANT_SECONDS), temporalAccessor0.n(j..time.temporal.a.NANO_OF_SECOND));
        }
        catch(b b0) {
            throw new b("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor0 + " of type " + temporalAccessor0.getClass().getName(), b0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b * 51 + ((int)(this.a ^ this.a >>> 0x20));
    }

    public boolean isAfter(Instant instant0) {
        return (Long.compare(this.a, instant0.a) == 0 ? this.b - instant0.b : Long.compare(this.a, instant0.a)) > 0;
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.T(0x7FFFFFFFFFFFFFFFL, chronoUnit0).T(1L, chronoUnit0) : this.T(-v, chronoUnit0);
    }

    public Instant minus(TemporalAmount temporalAmount0) {
        return (Instant)temporalAmount0.n(this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        if(q0 instanceof j..time.temporal.a) {
            int v = this.b;
            switch(e.a[((j..time.temporal.a)q0).ordinal()]) {
                case 1: {
                    return v;
                }
                case 2: {
                    return v / 1000;
                }
                case 3: {
                    return v / 1000000;
                }
                case 4: {
                    j..time.temporal.a.INSTANT_SECONDS.Q(this.a);
                }
            }
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return m.d(this, q0).a(q0.p(this), q0);
    }

    public static Instant ofEpochMilli(long v) {
        return Instant.Q(a.n(v, 1000L), ((int)a.m(v, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long v, long v1) {
        return Instant.Q(a.i(v, a.n(v1, 1000000000L)), ((int)a.m(v1, 1000000000L)));
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        localDate0.getClass();
        return (Instant)h.a(localDate0, this);
    }

    public Instant plus(TemporalAmount temporalAmount0) {
        return (Instant)temporalAmount0.l(this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return m.d(this, q0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public long toEpochMilli() {
        return this.a >= 0L || this.b <= 0 ? a.i(a.o(this.a, 1000L), this.b / 1000000) : a.i(a.o(this.a + 1L, 1000L), this.b / 1000000 - 1000);
    }

    @Override
    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof j..time.temporal.a) {
            int v = this.b;
            switch(e.a[((j..time.temporal.a)q0).ordinal()]) {
                case 1: {
                    return (long)v;
                }
                case 2: {
                    return (long)(v / 1000);
                }
                case 3: {
                    return (long)(v / 1000000);
                }
                case 4: {
                    return this.a;
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(2, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == m.j()) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery0 == m.e() || temporalQuery0 == m.l() || temporalQuery0 == m.k() || temporalQuery0 == m.i() || temporalQuery0 == m.f() || temporalQuery0 == m.g() ? null : temporalQuery0.queryFrom(this);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(this.a, j..time.temporal.a.INSTANT_SECONDS).c(((long)this.b), j..time.temporal.a.NANO_OF_SECOND);
    }
}

