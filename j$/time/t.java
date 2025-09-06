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
import j..time.temporal.r;
import j..time.temporal.s;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class t implements l, n, Serializable, Comparable {
    private final int a;
    private final int b;
    private static final long serialVersionUID = 4183400860270640070L;

    static {
        v v0 = new v();
        v0.p(a.YEAR, 4, 10, F.EXCEEDS_PAD);
        v0.e('-');
        v0.o(a.MONTH_OF_YEAR, 2);
        v0.x();
    }

    private t(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    private long Q() {
        return ((long)this.a) * 12L + ((long)this.b) - 1L;
    }

    public final t R(long v, r r0) {
        if(r0 instanceof ChronoUnit) {
            switch(((ChronoUnit)r0)) {
                case 1: {
                    return this.S(v);
                }
                case 2: {
                    return this.T(v);
                }
                case 3: {
                    return this.T(j..com.android.tools.r8.a.o(v, 10L));
                }
                case 4: {
                    return this.T(j..com.android.tools.r8.a.o(v, 100L));
                }
                case 5: {
                    return this.T(j..com.android.tools.r8.a.o(v, 1000L));
                }
                case 6: {
                    return this.W(j..com.android.tools.r8.a.i(this.u(a.ERA), v), a.ERA);
                }
                default: {
                    throw new s("Unsupported unit: " + r0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (t)r0.l(this, v);
    }

    public final t S(long v) {
        if(v == 0L) {
            return this;
        }
        long v1 = ((long)this.a) * 12L + ((long)(this.b - 1)) + v;
        long v2 = j..com.android.tools.r8.a.n(v1, 12L);
        return this.V(a.YEAR.Q(v2), ((int)j..com.android.tools.r8.a.m(v1, 12L)) + 1);
    }

    public final t T(long v) {
        return v == 0L ? this : this.V(a.YEAR.Q(((long)this.a) + v), this.b);
    }

    static t U(ObjectInput objectInput0) {
        int v = objectInput0.readInt();
        int v1 = objectInput0.readByte();
        a.YEAR.R(((long)v));
        a.MONTH_OF_YEAR.R(((long)v1));
        return new t(v, v1);
    }

    private t V(int v, int v1) {
        return this.a != v || this.b != v1 ? new t(v, v1) : this;
    }

    public final t W(long v, q q0) {
        if(q0 instanceof a) {
            ((a)q0).R(v);
            int v1 = j..time.s.a[((a)q0).ordinal()];
            int v2 = this.a;
            switch(v1) {
                case 1: {
                    a.MONTH_OF_YEAR.R(((long)(((int)v))));
                    return this.V(v2, ((int)v));
                }
                case 2: {
                    return this.S(v - this.Q());
                }
                default: {
                    int v3 = this.b;
                    switch(v1) {
                        case 3: {
                            if(v2 < 1) {
                                v = 1L - v;
                            }
                            a.YEAR.R(((long)(((int)v))));
                            return this.V(((int)v), v3);
                        }
                        case 4: {
                            a.YEAR.R(((long)(((int)v))));
                            return this.V(((int)v), v3);
                        }
                        case 5: {
                            if(this.u(a.ERA) == v) {
                                return this;
                            }
                            a.YEAR.R(((long)(1 - v2)));
                            return this.V(1 - v2, v3);
                        }
                        default: {
                            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                    }
                }
            }
        }
        return (t)q0.u(this, v);
    }

    final void X(DataOutput dataOutput0) {
        dataOutput0.writeInt(this.a);
        dataOutput0.writeByte(this.b);
    }

    @Override  // j$.time.temporal.l
    public final l c(long v, q q0) {
        return this.W(v, q0);
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.a - ((t)object0).a;
        return v == 0 ? this.b - ((t)object0).b : v;
    }

    @Override  // j$.time.temporal.l
    public final l d(long v, r r0) {
        return this.R(v, r0);
    }

    // 去混淆评级： 低(40)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? q0 == a.YEAR || q0 == a.MONTH_OF_YEAR || q0 == a.PROLEPTIC_MONTH || q0 == a.YEAR_OF_ERA || q0 == a.ERA : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof t && (this.a == ((t)object0).a && this.b == ((t)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b << 27 ^ this.a;
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
        return (t)h.a(localDate0, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final j..time.temporal.t q(q q0) {
        if(q0 == a.YEAR_OF_ERA) {
            return this.a > 0 ? j..time.temporal.t.j(1L, 0x3B9AC9FFL) : j..time.temporal.t.j(1L, 1000000000L);
        }
        return m.d(this, q0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        int v = this.a;
        StringBuilder stringBuilder0 = new StringBuilder(9);
        if(Math.abs(v) >= 1000) {
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
        stringBuilder0.append((this.b >= 10 ? "-" : "-0"));
        stringBuilder0.append(this.b);
        return stringBuilder0.toString();
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            int v = j..time.s.a[((a)q0).ordinal()];
            int v1 = 1;
            switch(v) {
                case 1: {
                    return (long)this.b;
                }
                case 2: {
                    return this.Q();
                }
                default: {
                    int v2 = this.a;
                    switch(v) {
                        case 3: {
                            if(v2 < 1) {
                                v2 = 1 - v2;
                            }
                            return (long)v2;
                        }
                        case 4: {
                            return (long)v2;
                        }
                        case 5: {
                            if(v2 < 1) {
                                v1 = 0;
                            }
                            return (long)v1;
                        }
                        default: {
                            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                    }
                }
            }
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(12, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        if(temporalQuery0 == m.e()) {
            return j..time.chrono.s.d;
        }
        return temporalQuery0 == m.j() ? ChronoUnit.MONTHS : m.c(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        if(!h.p(l0).equals(j..time.chrono.s.d)) {
            throw new b("Adjustment only supported on ISO date-time");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return l0.c(this.Q(), a.PROLEPTIC_MONTH);
    }
}

