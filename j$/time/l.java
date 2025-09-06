package j$.time;

import j..time.chrono.h;
import j..time.format.v;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.m;
import j..time.temporal.n;
import j..time.temporal.q;
import j..time.temporal.s;
import j..time.temporal.t;
import j..util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class l implements TemporalAccessor, n, Serializable, Comparable {
    private final int a;
    private final int b;
    private static final long serialVersionUID = 0xF2F77766E4C53F88L;

    static {
        v v0 = new v();
        v0.f("--");
        v0.o(a.MONTH_OF_YEAR, 2);
        v0.e('-');
        v0.o(a.DAY_OF_MONTH, 2);
        v0.x();
    }

    private l(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    static l Q(ObjectInput objectInput0) {
        int v = objectInput0.readByte();
        int v1 = objectInput0.readByte();
        j j0 = j.T(v);
        Objects.requireNonNull(j0, "month");
        a.DAY_OF_MONTH.R(((long)v1));
        if(v1 > j0.S()) {
            throw new b("Illegal value for DayOfMonth field, value " + v1 + " is not valid for month " + j0.name());  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return new l(j0.getValue(), v1);
    }

    final void R(DataOutput dataOutput0) {
        dataOutput0.writeByte(this.a);
        dataOutput0.writeByte(this.b);
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.a - ((l)object0).a;
        return v == 0 ? this.b - ((l)object0).b : v;
    }

    // 去混淆评级： 低(40)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? q0 == a.MONTH_OF_YEAR || q0 == a.DAY_OF_MONTH : q0 != null && q0.q(this);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof l && (this.a == ((l)object0).a && this.b == ((l)object0).b);
    }

    @Override
    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return this.q(q0).a(this.u(q0), q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        if(q0 == a.MONTH_OF_YEAR) {
            return q0.l();
        }
        if(q0 == a.DAY_OF_MONTH) {
            int v = this.a;
            j j0 = j.T(v);
            j0.getClass();
            switch(j0) {
                case 1: {
                    return t.k(1L, 28L, j.T(v).S());
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    return t.k(1L, 30L, j.T(v).S());
                }
                default: {
                    return t.k(1L, 0x1FL, j.T(v).S());
                }
            }
        }
        return m.d(this, q0);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final String toString() {
        return "--" + (this.a >= 10 ? "" : "0") + this.a + (this.b >= 10 ? "-" : "-0") + this.b;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            switch(((a)q0)) {
                case 1: {
                    return (long)this.b;
                }
                case 2: {
                    return (long)this.a;
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return q0.p(this);
    }

    private Object writeReplace() {
        return new p(13, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return temporalQuery0 == m.e() ? j..time.chrono.s.d : m.c(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final j..time.temporal.l z(j..time.temporal.l l0) {
        if(!h.p(l0).equals(j..time.chrono.s.d)) {
            throw new b("Adjustment only supported on ISO date-time");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        j..time.temporal.l l1 = l0.c(((long)this.a), a.MONTH_OF_YEAR);
        return l1.c(Math.min(l1.q(a.DAY_OF_MONTH).d(), this.b), a.DAY_OF_MONTH);
    }
}

