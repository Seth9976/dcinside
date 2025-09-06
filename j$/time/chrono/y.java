package j$.time.chrono;

import j..time.LocalDate;
import j..time.b;
import j..time.temporal.TemporalQuery;
import j..time.temporal.a;
import j..time.temporal.l;
import j..time.temporal.q;
import j..time.temporal.t;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class y implements m, Serializable {
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;
    public static final y d = null;
    private static final y[] e = null;
    private static final long serialVersionUID = 0x145A0D680453ED8AL;

    static {
        y y0 = new y(-1, LocalDate.c0(0x74C, 1, 1), "Meiji");
        y.d = y0;
        y y1 = new y(0, LocalDate.c0(0x778, 7, 30), "Taisho");
        y y2 = new y(1, LocalDate.c0(0x786, 12, 25), "Showa");
        y y3 = new y(2, LocalDate.c0(0x7C5, 1, 8), "Heisei");
        y y4 = new y(3, LocalDate.c0(2019, 5, 1), "Reiwa");
        y[] arr_y = new y[5];
        y.e = arr_y;
        arr_y[0] = y0;
        arr_y[1] = y1;
        arr_y[2] = y2;
        arr_y[3] = y3;
        arr_y[4] = y4;
    }

    private y(int v, LocalDate localDate0, String s) {
        this.a = v;
        this.b = localDate0;
        this.c = s;
    }

    public static y[] D() {
        return (y[])Arrays.copyOf(y.e, y.e.length);
    }

    final void G(DataOutput dataOutput0) {
        dataOutput0.writeByte(this.a);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return h.i(this, q0);
    }

    static y f(LocalDate localDate0) {
        if(localDate0.Y(x.d)) {
            throw new b("JapaneseDate before Meiji 6 are not supported");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        y[] arr_y = y.e;
        for(int v = arr_y.length - 1; v >= 0; --v) {
            y y0 = arr_y[v];
            if(localDate0.M(y0.b) >= 0) {
                return y0;
            }
        }
        return null;
    }

    @Override  // j$.time.chrono.m
    public final int getValue() {
        return this.a;
    }

    static y j() {
        return y.e[y.e.length - 1];
    }

    final LocalDate k() {
        return this.b;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return h.f(this, ((a)q0));
    }

    final y o() {
        return this == y.j() ? null : y.r(this.a + 1);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return q0 == a.ERA ? v.d.H(a.ERA) : j..time.temporal.m.d(this, q0);
    }

    public static y r(int v) {
        if(v + 1 >= 0) {
            y[] arr_y = y.e;
            if(v + 1 < arr_y.length) {
                return arr_y[v + 1];
            }
        }
        throw new b("Invalid era: " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static long t() {
        long v = a.DAY_OF_YEAR.l().f();
        y[] arr_y = y.e;
        for(int v1 = 0; v1 < arr_y.length; ++v1) {
            y y0 = arr_y[v1];
            v = Math.min(v, y0.b.L() - y0.b.V() + 1);
            if(y0.o() != null) {
                v = Math.min(v, y0.o().b.V() - 1);
            }
        }
        return v;
    }

    @Override
    public final String toString() {
        return this.c;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        return h.g(this, q0);
    }

    static long w() [...] // 潜在的解密器

    private Object writeReplace() {
        return new E(5, this);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final Object y(TemporalQuery temporalQuery0) {
        return h.m(this, temporalQuery0);
    }

    @Override  // j$.time.temporal.n
    public final l z(l l0) {
        return l0.c(((long)this.getValue()), a.ERA);
    }
}

