package j$.time.chrono;

import j..time.LocalDate;
import j..time.LocalTime;
import j..time.b;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAmount;
import j..time.temporal.a;
import j..time.temporal.n;
import j..time.temporal.p;
import j..time.temporal.q;
import j..time.temporal.r;
import j..time.temporal.s;
import j..time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class x extends d {
    private final transient LocalDate a;
    private transient y b;
    private transient int c;
    static final LocalDate d = null;
    private static final long serialVersionUID = 0xFBC3422406CEF0FDL;

    static {
        x.d = LocalDate.c0(0x751, 1, 1);
    }

    x(LocalDate localDate0) {
        if(localDate0.Y(x.d)) {
            throw new b("JapaneseDate before Meiji 6 is not supported");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        y y0 = y.f(localDate0);
        this.b = y0;
        this.c = localDate0.X() - y0.k().X() + 1;
        this.a = localDate0;
    }

    x(y y0, int v, LocalDate localDate0) {
        if(localDate0.Y(x.d)) {
            throw new b("JapaneseDate before Meiji 6 is not supported");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.b = y0;
        this.c = v;
        this.a = localDate0;
    }

    @Override  // j$.time.chrono.d
    public final m A() {
        return this.b;
    }

    @Override  // j$.time.chrono.d
    public final j..time.chrono.b E(TemporalAmount temporalAmount0) {
        return (x)super.E(temporalAmount0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.chrono.b J(long v, r r0) {
        return (x)super.J(v, r0);
    }

    @Override  // j$.time.chrono.d
    public final int L() {
        y y0 = this.b;
        y y1 = y0.o();
        int v = y1 == null || y1.k().X() != this.a.X() ? this.a.L() : y1.k().V() - 1;
        return this.c == 1 ? v - (y0.k().V() - 1) : v;
    }

    @Override  // j$.time.chrono.d
    final j..time.chrono.b R(long v) {
        return this.X(this.a.g0(v));
    }

    @Override  // j$.time.chrono.d
    final j..time.chrono.b S(long v) {
        return this.X(this.a.h0(v));
    }

    @Override  // j$.time.chrono.d
    final j..time.chrono.b T(long v) {
        return this.X(this.a.j0(v));
    }

    public final y U() {
        return this.b;
    }

    public final x V(long v, ChronoUnit chronoUnit0) {
        return (x)super.d(v, chronoUnit0);
    }

    public final x W(long v, q q0) {
        if(q0 instanceof a) {
            if(this.u(((a)q0)) == v) {
                return this;
            }
            int[] arr_v = w.a;
            LocalDate localDate0 = this.a;
            switch(arr_v[((a)q0).ordinal()]) {
                case 3: 
                case 8: 
                case 9: {
                    v v1 = v.d;
                    int v2 = v1.H(((a)q0)).a(v, ((a)q0));
                    switch(arr_v[((a)q0).ordinal()]) {
                        case 3: {
                            return this.X(localDate0.o0(v1.f(this.b, v2)));
                        }
                        case 8: {
                            return this.X(localDate0.o0(v1.f(y.r(v2), this.c)));
                        }
                        case 9: {
                            return this.X(localDate0.o0(v2));
                        }
                        default: {
                            return this.X(localDate0.l0(v, q0));
                        }
                    }
                }
                default: {
                    return this.X(localDate0.l0(v, q0));
                }
            }
        }
        return (x)super.c(v, q0);
    }

    // 去混淆评级： 低(20)
    private x X(LocalDate localDate0) {
        return localDate0.equals(this.a) ? this : new x(localDate0);
    }

    public final x Y(p p0) {
        return (x)super.i(p0);
    }

    @Override  // j$.time.chrono.b
    public final l a() {
        return v.d;
    }

    @Override  // j$.time.chrono.d
    public final j..time.chrono.b c(long v, q q0) {
        return this.W(v, q0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l c(long v, q q0) {
        return this.W(v, q0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.chrono.b d(long v, r r0) {
        return (x)super.d(v, r0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l d(long v, r r0) {
        return (x)super.d(v, r0);
    }

    @Override  // j$.time.chrono.d
    public final boolean e(q q0) {
        if(q0 != a.ALIGNED_DAY_OF_WEEK_IN_MONTH && q0 != a.ALIGNED_DAY_OF_WEEK_IN_YEAR && q0 != a.ALIGNED_WEEK_OF_MONTH && q0 != a.ALIGNED_WEEK_OF_YEAR) {
            return q0 instanceof a ? ((a)q0).z() : q0 != null && q0.q(this);
        }
        return false;
    }

    @Override  // j$.time.chrono.d
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x ? this.a.equals(((x)object0).a) : false;
    }

    @Override  // j$.time.chrono.d
    public final int hashCode() {
        v.d.getClass();
        return this.a.hashCode() ^ 0xD6FCA3D1;
    }

    @Override  // j$.time.chrono.d
    public final j..time.chrono.b i(n n0) {
        return (x)super.i(n0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l l(long v, ChronoUnit chronoUnit0) {
        return (x)super.J(v, chronoUnit0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l p(LocalDate localDate0) {
        return (x)super.i(localDate0);
    }

    @Override  // j$.time.chrono.d
    public final t q(q q0) {
        if(q0 instanceof a) {
            if(this.e(q0)) {
                switch(((a)q0)) {
                    case 1: {
                        return t.j(1L, this.a.Z());
                    }
                    case 2: {
                        return t.j(1L, this.L());
                    }
                    case 3: {
                        y y0 = this.b;
                        int v = y0.k().X();
                        y y1 = y0.o();
                        return y1 == null ? t.j(1L, 0x3B9AC9FF - v) : t.j(1L, y1.k().X() - v + 1);
                    }
                    default: {
                        return v.d.H(((a)q0));
                    }
                }
            }
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return q0.y(this);
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 instanceof a) {
            int v = this.c;
            y y0 = this.b;
            LocalDate localDate0 = this.a;
            switch(((a)q0)) {
                case 2: {
                    return v == 1 ? ((long)(localDate0.V() - y0.k().V() + 1)) : ((long)localDate0.V());
                }
                case 3: {
                    return (long)v;
                }
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                case 8: {
                    return (long)y0.getValue();
                }
                default: {
                    return localDate0.u(q0);
                }
            }
        }
        return q0.p(this);
    }

    @Override  // j$.time.chrono.d
    public final long v() {
        return this.a.v();
    }

    private Object writeReplace() {
        return new E(4, this);
    }

    @Override  // j$.time.chrono.d
    public final ChronoLocalDateTime x(LocalTime localTime0) {
        return f.R(this, localTime0);
    }
}

