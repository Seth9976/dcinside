package j$.time;

import j..time.chrono.h;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
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
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class LocalTime implements l, n, Serializable, Comparable {
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;
    public static final LocalTime e = null;
    public static final LocalTime f = null;
    public static final LocalTime g = null;
    private static final LocalTime[] h = null;
    private static final long serialVersionUID = 0x5904A8B626E1A4F1L;

    static {
        LocalTime[] arr_localTime;
        LocalTime.h = new LocalTime[24];
        for(int v = 0; true; ++v) {
            arr_localTime = LocalTime.h;
            if(v >= arr_localTime.length) {
                break;
            }
            arr_localTime[v] = new LocalTime(v, 0, 0, 0);
        }
        LocalTime localTime0 = arr_localTime[0];
        LocalTime.g = localTime0;
        LocalTime localTime1 = arr_localTime[12];
        LocalTime.e = localTime0;
        LocalTime.f = new LocalTime(23, 59, 59, 0x3B9AC9FF);
    }

    private LocalTime(int v, int v1, int v2, int v3) {
        this.a = (byte)v;
        this.b = (byte)v1;
        this.c = (byte)v2;
        this.d = v3;
    }

    public final int Q(LocalTime localTime0) {
        int v = Integer.compare(this.a, localTime0.a);
        if(v == 0) {
            v = Integer.compare(this.b, localTime0.b);
            if(v == 0) {
                v = Integer.compare(this.c, localTime0.c);
                return v == 0 ? Integer.compare(this.d, localTime0.d) : v;
            }
        }
        return v;
    }

    private static LocalTime R(int v, int v1, int v2, int v3) {
        return (v1 | v2 | v3) == 0 ? LocalTime.h[v] : new LocalTime(v, v1, v2, v3);
    }

    public static LocalTime S(TemporalAccessor temporalAccessor0) {
        Objects.requireNonNull(temporalAccessor0, "temporal");
        LocalTime localTime0 = (LocalTime)temporalAccessor0.y(m.g());
        if(localTime0 == null) {
            throw new b("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor0 + " of type " + temporalAccessor0.getClass().getName());  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return localTime0;
    }

    private int T(q q0) {
        int v = this.b;
        int v1 = this.d;
        int v2 = this.a;
        switch(((a)q0)) {
            case 1: {
                return v1;
            }
            case 2: {
                throw new s("Invalid field \'NanoOfDay\' for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            case 3: {
                return v1 / 1000;
            }
            case 4: {
                throw new s("Invalid field \'MicroOfDay\' for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            case 5: {
                return v1 / 1000000;
            }
            case 6: {
                return (int)(this.h0() / 1000000L);
            }
            case 7: {
                return this.c;
            }
            case 8: {
                return this.i0();
            }
            case 9: {
                return v;
            }
            case 10: {
                return v2 * 60 + v;
            }
            case 11: {
                return v2 % 12;
            }
            case 12: {
                return v2 % 12 % 12 == 0 ? 12 : v2 % 12;
            }
            case 13: {
                return v2;
            }
            case 14: {
                return v2 == 0 ? 24 : v2;
            }
            case 15: {
                return v2 / 12;
            }
            default: {
                throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    public final int U() {
        return this.a;
    }

    public final int V() {
        return this.d;
    }

    public final int W() {
        return this.c;
    }

    public static LocalTime X(int v) {
        a.HOUR_OF_DAY.R(((long)v));
        return LocalTime.h[v];
    }

    public static LocalTime Y(int v, int v1, int v2, int v3) {
        a.HOUR_OF_DAY.R(((long)v));
        a.MINUTE_OF_HOUR.R(((long)v1));
        a.SECOND_OF_MINUTE.R(((long)v2));
        a.NANO_OF_SECOND.R(((long)v3));
        return LocalTime.R(v, v1, v2, v3);
    }

    public static LocalTime Z(long v) {
        a.NANO_OF_DAY.R(v);
        long v1 = v - ((long)(((int)(v / 3600000000000L)))) * 3600000000000L;
        long v2 = v1 - ((long)(((int)(v1 / 60000000000L)))) * 60000000000L;
        return LocalTime.R(((int)(v / 3600000000000L)), ((int)(v1 / 60000000000L)), ((int)(v2 / 1000000000L)), ((int)(v2 - ((long)(((int)(v2 / 1000000000L)))) * 1000000000L)));
    }

    public static LocalTime a0(long v) {
        a.SECOND_OF_DAY.R(v);
        long v1 = v - ((long)(((int)(v / 3600L)) * 3600));
        return LocalTime.R(((int)(v / 3600L)), ((int)(v1 / 60L)), ((int)(v1 - ((long)(((int)(v1 / 60L)) * 60)))), 0);
    }

    public LocalDateTime atDate(LocalDate localDate0) {
        return LocalDateTime.Z(localDate0, this);
    }

    public final LocalTime b0(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.e0(v);
                }
                case 2: {
                    return this.e0(v % 86400000000L * 1000L);
                }
                case 3: {
                    return this.e0(v % 86400000L * 1000000L);
                }
                case 4: {
                    return this.f0(v);
                }
                case 5: {
                    return this.d0(v);
                }
                case 6: {
                    return this.c0(v);
                }
                case 7: {
                    return this.c0(v % 2L * 12L);
                }
                default: {
                    throw new s("Unsupported unit: " + r0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (LocalTime)r0.l(this, v);
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        return this.j0(v, q0);
    }

    public final LocalTime c0(long v) {
        return v == 0L ? this : LocalTime.R((((int)(v % 24L)) + this.a + 24) % 24, this.b, this.c, this.d);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.Q(((LocalTime)object0));
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.b0(v, r0);
    }

    public final LocalTime d0(long v) {
        if(v == 0L) {
            return this;
        }
        int v1 = this.a * 60 + this.b;
        int v2 = (((int)(v % 0x5A0L)) + v1 + 0x5A0) % 0x5A0;
        return v1 == v2 ? this : LocalTime.R(v2 / 60, v2 % 60, this.c, this.d);
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? ((a)q0).S() : q0 != null && q0.q(this);
    }

    public final LocalTime e0(long v) {
        if(v == 0L) {
            return this;
        }
        long v1 = this.h0();
        long v2 = (v % 86400000000000L + v1 + 86400000000000L) % 86400000000000L;
        return v1 == v2 ? this : LocalTime.R(((int)(v2 / 3600000000000L)), ((int)(v2 / 60000000000L % 60L)), ((int)(v2 / 1000000000L % 60L)), ((int)(v2 % 1000000000L)));
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof LocalTime && (this.a == ((LocalTime)object0).a && this.b == ((LocalTime)object0).b && this.c == ((LocalTime)object0).c && this.d == ((LocalTime)object0).d);
    }

    public final LocalTime f0(long v) {
        if(v == 0L) {
            return this;
        }
        int v1 = this.b * 60 + this.a * 3600 + this.c;
        int v2 = (((int)(v % 86400L)) + v1 + 86400) % 86400;
        return v1 == v2 ? this : LocalTime.R(v2 / 3600, v2 / 60 % 60, v2 % 60, this.d);
    }

    static LocalTime g0(ObjectInput objectInput0) {
        int v = objectInput0.readByte();
        if(v < 0) {
            return LocalTime.Y(~v, 0, 0, 0);
        }
        int v1 = objectInput0.readByte();
        if(v1 < 0) {
            return LocalTime.Y(v, ~v1, 0, 0);
        }
        int v2 = objectInput0.readByte();
        return v2 >= 0 ? LocalTime.Y(v, v1, v2, objectInput0.readInt()) : LocalTime.Y(v, v1, ~v2, 0);
    }

    public final long h0() {
        return ((long)this.c) * 1000000000L + (((long)this.b) * 60000000000L + ((long)this.a) * 3600000000000L) + ((long)this.d);
    }

    @Override
    public final int hashCode() {
        long v = this.h0();
        return (int)(v ^ v >>> 0x20);
    }

    public final int i0() {
        return this.b * 60 + this.a * 3600 + this.c;
    }

    public final LocalTime j0(long v, q q0) {
        if(q0 instanceof a) {
            ((a)q0).R(v);
            int v1 = this.b;
            int v2 = this.c;
            int v3 = this.d;
            int v4 = this.a;
            switch(((a)q0)) {
                case 1: {
                    return this.k0(((int)v));
                }
                case 2: {
                    return LocalTime.Z(v);
                }
                case 3: {
                    return this.k0(((int)v) * 1000);
                }
                case 4: {
                    return LocalTime.Z(v * 1000L);
                }
                case 5: {
                    return this.k0(((int)v) * 1000000);
                }
                case 6: {
                    return LocalTime.Z(v * 1000000L);
                }
                case 7: {
                    if(v2 == ((int)v)) {
                        return this;
                    }
                    a.SECOND_OF_MINUTE.R(((long)(((int)v))));
                    return LocalTime.R(v4, v1, ((int)v), v3);
                }
                case 8: {
                    return this.f0(v - ((long)this.i0()));
                }
                case 9: {
                    if(v1 == ((int)v)) {
                        return this;
                    }
                    a.MINUTE_OF_HOUR.R(((long)(((int)v))));
                    return LocalTime.R(v4, ((int)v), v2, v3);
                }
                case 10: {
                    return this.d0(v - ((long)(v4 * 60 + v1)));
                }
                case 11: {
                    return this.c0(v - ((long)(v4 % 12)));
                }
                case 12: {
                    if(v == 12L) {
                        v = 0L;
                    }
                    return this.c0(v - ((long)(v4 % 12)));
                }
                case 13: {
                    if(v4 == ((int)v)) {
                        return this;
                    }
                    a.HOUR_OF_DAY.R(((long)(((int)v))));
                    return LocalTime.R(((int)v), v1, v2, v3);
                }
                case 14: {
                    if(v == 24L) {
                        v = 0L;
                    }
                    if(v4 == ((int)v)) {
                        return this;
                    }
                    a.HOUR_OF_DAY.R(((long)(((int)v))));
                    return LocalTime.R(((int)v), v1, v2, v3);
                }
                case 15: {
                    return this.c0((v - ((long)(v4 / 12))) * 12L);
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (LocalTime)q0.u(this, v);
    }

    public final LocalTime k0(int v) {
        if(this.d == v) {
            return this;
        }
        a.NANO_OF_SECOND.R(((long)v));
        return LocalTime.R(this.a, this.b, this.c, v);
    }

    @Override  // j$.time.temporal.l
    public final l l(long v, ChronoUnit chronoUnit0) {
        return v == 0x8000000000000000L ? this.b0(0x7FFFFFFFFFFFFFFFL, chronoUnit0).b0(1L, chronoUnit0) : this.b0(-v, chronoUnit0);
    }

    final void l0(DataOutput dataOutput0) {
        int v = this.c;
        int v1 = this.a;
        int v2 = this.b;
        int v3 = this.d;
        if(v3 == 0) {
            if(v == 0) {
                if(v2 == 0) {
                    dataOutput0.writeByte(~v1);
                    return;
                }
                dataOutput0.writeByte(v1);
                dataOutput0.writeByte(~v2);
                return;
            }
            dataOutput0.writeByte(v1);
            dataOutput0.writeByte(v2);
            dataOutput0.writeByte(~v);
            return;
        }
        dataOutput0.writeByte(v1);
        dataOutput0.writeByte(v2);
        dataOutput0.writeByte(v);
        dataOutput0.writeInt(v3);
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return q0 instanceof a ? this.T(q0) : m.a(this, q0);
    }

    @Override  // j$.time.temporal.l
    public final l p(LocalDate localDate0) {
        localDate0.getClass();
        return (LocalTime)h.a(localDate0, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return m.d(this, q0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(18);
        stringBuilder0.append((this.a >= 10 ? "" : "0"));
        stringBuilder0.append(this.a);
        String s = ":";
        stringBuilder0.append((this.b >= 10 ? ":" : ":0"));
        stringBuilder0.append(this.b);
        int v = this.c;
        int v1 = this.d;
        if(v > 0 || v1 > 0) {
            if(v < 10) {
                s = ":0";
            }
            stringBuilder0.append(s);
            stringBuilder0.append(v);
            if(v1 > 0) {
                stringBuilder0.append('.');
                if(v1 % 1000000 == 0) {
                    stringBuilder0.append(Integer.toString(v1 / 1000000 + 1000).substring(1));
                    return stringBuilder0.toString();
                }
                if(v1 % 1000 == 0) {
                    stringBuilder0.append(Integer.toString(v1 / 1000 + 1000000).substring(1));
                    return stringBuilder0.toString();
                }
                stringBuilder0.append(Integer.toString(v1 + 1000000000).substring(1));
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            if(q0 == a.NANO_OF_DAY) {
                return this.h0();
            }
            return q0 == a.MICRO_OF_DAY ? this.h0() / 1000L : ((long)this.T(q0));
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(4, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        if(temporalQuery0 != m.e() && temporalQuery0 != m.l() && temporalQuery0 != m.k() && temporalQuery0 != m.i()) {
            if(temporalQuery0 == m.g()) {
                return this;
            }
            if(temporalQuery0 == m.f()) {
                return null;
            }
            return temporalQuery0 == m.j() ? ChronoUnit.NANOS : temporalQuery0.queryFrom(this);
        }
        return null;
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(this.h0(), a.NANO_OF_DAY);
    }
}

