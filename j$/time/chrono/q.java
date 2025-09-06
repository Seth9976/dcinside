package j$.time.chrono;

import j..com.android.tools.r8.a;
import j..time.LocalDate;
import j..time.LocalTime;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAmount;
import j..time.temporal.n;
import j..time.temporal.s;
import j..time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public final class q extends d {
    private final transient o a;
    private final transient int b;
    private final transient int c;
    private final transient int d;
    private static final long serialVersionUID = -5207853542612002020L;

    private q(o o0, int v, int v1, int v2) {
        o0.W(v, v1, v2);
        this.a = o0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    private q(o o0, long v) {
        int[] arr_v = o0.X(((int)v));
        this.a = o0;
        this.b = arr_v[0];
        this.c = arr_v[1];
        this.d = arr_v[2];
    }

    @Override  // j$.time.chrono.d
    public final m A() {
        return r.AH;
    }

    @Override  // j$.time.chrono.d
    public final b E(TemporalAmount temporalAmount0) {
        return (q)super.E(temporalAmount0);
    }

    @Override  // j$.time.chrono.d
    public final boolean F() {
        return this.a.N(((long)this.b));
    }

    @Override  // j$.time.chrono.d
    public final b J(long v, j..time.temporal.r r0) {
        return (q)super.J(v, r0);
    }

    @Override  // j$.time.chrono.d
    public final int L() {
        return this.a.Z(this.b);
    }

    @Override  // j$.time.chrono.d
    final b R(long v) {
        return this.X(v);
    }

    @Override  // j$.time.chrono.d
    final b S(long v) {
        return this.Y(v);
    }

    @Override  // j$.time.chrono.d
    final b T(long v) {
        if(v == 0L) {
            return this;
        }
        long v1 = ((long)this.b) + ((long)(((int)v)));
        if(v1 != ((long)(((int)v1)))) {
            throw new ArithmeticException();
        }
        return this.Z(((int)v1), this.c, this.d);
    }

    private int U() {
        return this.a.V(this.b, this.c) + this.d;
    }

    static q V(o o0, int v, int v1, int v2) {
        return new q(o0, v, v1, v2);
    }

    static q W(o o0, long v) {
        return new q(o0, v);
    }

    final q X(long v) {
        long v1 = this.v();
        return new q(this.a, v1 + v);
    }

    final q Y(long v) {
        if(v == 0L) {
            return this;
        }
        long v1 = ((long)this.b) * 12L + ((long)(this.c - 1)) + v;
        long v2 = a.n(v1, 12L);
        return this.Z(this.a.S(v2), ((int)a.m(v1, 12L)) + 1, this.d);
    }

    private q Z(int v, int v1, int v2) {
        o o0 = this.a;
        int v3 = o0.Y(v, v1);
        if(v2 > v3) {
            v2 = v3;
        }
        return new q(o0, v, v1, v2);
    }

    @Override  // j$.time.chrono.b
    public final l a() {
        return this.a;
    }

    public final q a0(long v, j..time.temporal.q q0) {
        if(q0 instanceof j..time.temporal.a) {
            o o0 = this.a;
            o0.H(((j..time.temporal.a)q0)).b(v, ((j..time.temporal.a)q0));
            int v1 = (int)v;
            int v2 = this.d;
            int v3 = this.c;
            int v4 = this.b;
            switch(((j..time.temporal.a)q0)) {
                case 1: {
                    return this.Z(v4, v3, v1);
                }
                case 2: {
                    return this.X(((long)(Math.min(v1, this.L()) - this.U())));
                }
                case 3: {
                    return this.X((v - this.u(j..time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7L);
                }
                case 4: {
                    return this.X(v - ((long)(((int)a.m(this.v() + 3L, 7L)) + 1)));
                }
                case 5: {
                    return this.X(v - this.u(j..time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                }
                case 6: {
                    return this.X(v - this.u(j..time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                }
                case 7: {
                    return new q(o0, v);
                }
                case 8: {
                    return this.X((v - this.u(j..time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7L);
                }
                case 9: {
                    return this.Z(v4, v1, v2);
                }
                case 10: {
                    return this.Y(v - (((long)v4) * 12L + ((long)v3) - 1L));
                }
                case 11: {
                    if(v4 < 1) {
                        v1 = 1 - v1;
                    }
                    return this.Z(v1, v3, v2);
                }
                case 12: {
                    return this.Z(v1, v3, v2);
                }
                case 13: {
                    return this.Z(1 - v4, v3, v2);
                }
                default: {
                    throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
        }
        return (q)super.c(v, q0);
    }

    @Override  // j$.time.chrono.d
    public final b c(long v, j..time.temporal.q q0) {
        return this.a0(v, q0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l c(long v, j..time.temporal.q q0) {
        return this.a0(v, q0);
    }

    @Override  // j$.time.chrono.d
    public final b d(long v, j..time.temporal.r r0) {
        return (q)super.d(v, r0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l d(long v, j..time.temporal.r r0) {
        return (q)super.d(v, r0);
    }

    // 去混淆评级： 低(40)
    @Override  // j$.time.chrono.d
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof q && (this.b == ((q)object0).b && this.c == ((q)object0).c && this.d == ((q)object0).d && this.a.equals(((q)object0).a));
    }

    @Override  // j$.time.chrono.d
    public final int hashCode() {
        return this.a.k().hashCode() ^ this.b & 0xFFFFF800 ^ (this.b << 11) + (this.c << 6) + this.d;
    }

    @Override  // j$.time.chrono.d
    public final b i(n n0) {
        return (q)super.i(n0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l l(long v, ChronoUnit chronoUnit0) {
        return (q)super.J(v, chronoUnit0);
    }

    @Override  // j$.time.chrono.d
    public final j..time.temporal.l p(LocalDate localDate0) {
        return (q)super.i(localDate0);
    }

    @Override  // j$.time.chrono.d
    public final t q(j..time.temporal.q q0) {
        if(q0 instanceof j..time.temporal.a) {
            if(h.h(this, q0)) {
                o o0 = this.a;
                switch(((j..time.temporal.a)q0)) {
                    case 1: {
                        return t.j(1L, o0.Y(this.b, this.c));
                    }
                    case 2: {
                        return t.j(1L, this.L());
                    }
                    case 3: {
                        return t.j(1L, 5L);
                    }
                    default: {
                        return o0.H(((j..time.temporal.a)q0));
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
    public final long u(j..time.temporal.q q0) {
        if(q0 instanceof j..time.temporal.a) {
            int v = this.c;
            int v1 = 1;
            int v2 = this.d;
            int v3 = this.b;
            switch(((j..time.temporal.a)q0)) {
                case 1: {
                    return (long)v2;
                }
                case 2: {
                    return (long)this.U();
                }
                case 3: {
                    return (long)((v2 - 1) / 7 + 1);
                }
                case 4: {
                    return (long)(((int)a.m(this.v() + 3L, 7L)) + 1);
                }
                case 5: {
                    return (long)((v2 - 1) % 7 + 1);
                }
                case 6: {
                    return (long)((this.U() - 1) % 7 + 1);
                }
                case 7: {
                    return this.v();
                }
                case 8: {
                    return (long)((this.U() - 1) / 7 + 1);
                }
                case 9: {
                    return (long)v;
                }
                case 10: {
                    return ((long)v3) * 12L + ((long)v) - 1L;
                }
                case 11: {
                    return (long)v3;
                }
                case 12: {
                    return (long)v3;
                }
                case 13: {
                    if(v3 <= 1) {
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

    @Override  // j$.time.chrono.d
    public final long v() {
        return this.a.W(this.b, this.c, this.d);
    }

    final void writeExternal(ObjectOutput objectOutput0) {
        objectOutput0.writeObject(this.a);
        objectOutput0.writeInt(j..time.temporal.m.a(this, j..time.temporal.a.YEAR));
        objectOutput0.writeByte(j..time.temporal.m.a(this, j..time.temporal.a.MONTH_OF_YEAR));
        objectOutput0.writeByte(j..time.temporal.m.a(this, j..time.temporal.a.DAY_OF_MONTH));
    }

    private Object writeReplace() {
        return new E(6, this);
    }

    @Override  // j$.time.chrono.d
    public final ChronoLocalDateTime x(LocalTime localTime0) {
        return f.R(this, localTime0);
    }
}

