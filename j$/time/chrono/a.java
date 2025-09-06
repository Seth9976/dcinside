package j$.time.chrono;

import j..time.Clock;
import j..time.Instant;
import j..time.LocalDate;
import j..time.ZoneId;
import j..time.format.E;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class A extends a implements Serializable {
    public static final A d = null;
    private static final long serialVersionUID = 0xE6DFCF4568E9FBBL;

    static {
        A.d = new A();
    }

    @Override  // j$.time.chrono.l
    public final b D(int v, int v1, int v2) {
        return new C(LocalDate.c0(v + 0x777, v1, v2));
    }

    @Override  // j$.time.chrono.a
    public final b G(Map map0, E e0) {
        return (C)super.G(map0, e0);
    }

    @Override  // j$.time.chrono.l
    public final t H(j..time.temporal.a a0) {
        switch(a0) {
            case 1: {
                t t0 = j..time.temporal.a.PROLEPTIC_MONTH.l();
                return t.j(t0.e() - 0x5994L, t0.d() - 0x5994L);
            }
            case 2: {
                t t1 = j..time.temporal.a.YEAR.l();
                return t.k(1L, t1.d() - 0x777L, 0x778L - t1.e());
            }
            case 3: {
                t t2 = j..time.temporal.a.YEAR.l();
                return t.j(t2.e() - 0x777L, t2.d() - 0x777L);
            }
            default: {
                return a0.l();
            }
        }
    }

    @Override  // j$.time.chrono.l
    public final ChronoZonedDateTime I(Instant instant0, ZoneId zoneId0) {
        return k.R(this, instant0, zoneId0);
    }

    @Override  // j$.time.chrono.l
    public final List K() {
        return j..com.android.tools.r8.a.k(D.values());
    }

    @Override  // j$.time.chrono.l
    public final boolean N(long v) {
        return s.d.N(v + 0x777L);
    }

    @Override  // j$.time.chrono.l
    public final m O(int v) {
        switch(v) {
            case 0: {
                return D.BEFORE_ROC;
            }
            case 1: {
                return D.ROC;
            }
            default: {
                throw new j..time.b("Invalid era: " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
        }
    }

    @Override  // j$.time.chrono.l
    public final int f(m m0, int v) {
        if(!(m0 instanceof D)) {
            throw new ClassCastException("Era must be MinguoEra");
        }
        return m0 == D.ROC ? v : 1 - v;
    }

    @Override  // j$.time.chrono.l
    public final b j(long v) {
        return new C(LocalDate.ofEpochDay(v));
    }

    @Override  // j$.time.chrono.l
    public final String k() {
        return "Minguo";
    }

    @Override  // j$.time.chrono.a
    public final b n() {
        return new C(LocalDate.S(LocalDate.b0(Clock.b())));
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.chrono.l
    public final b o(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0 instanceof C ? ((C)temporalAccessor0) : new C(LocalDate.S(temporalAccessor0));
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.chrono.l
    public final String t() {
        return "roc";
    }

    @Override  // j$.time.chrono.l
    public final b w(int v, int v1) {
        return new C(LocalDate.e0(v + 0x777, v1));
    }

    Object writeReplace() {
        return new j..time.chrono.E(1, this);
    }
}

