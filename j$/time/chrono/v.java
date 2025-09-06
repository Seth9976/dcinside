package j$.time.chrono;

import j..time.Clock;
import j..time.Instant;
import j..time.LocalDate;
import j..time.ZoneId;
import j..time.format.E;
import j..time.temporal.ChronoUnit;
import j..time.temporal.TemporalAccessor;
import j..time.temporal.p;
import j..time.temporal.s;
import j..time.temporal.t;
import j..util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public final class v extends a implements Serializable {
    public static final v d = null;
    private static final long serialVersionUID = 0x6623C4799CB0DDCL;

    static {
        v.d = new v();
    }

    @Override  // j$.time.chrono.l
    public final b D(int v, int v1, int v2) {
        return new x(LocalDate.c0(v, v1, v2));
    }

    @Override  // j$.time.chrono.a
    public final b G(Map map0, E e0) {
        return (x)super.G(map0, e0);
    }

    @Override  // j$.time.chrono.l
    public final t H(j..time.temporal.a a0) {
        switch(a0) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                throw new s("Unsupported field: " + a0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            case 5: {
                return t.k(1L, 15L, 0x3B9AC9FF - y.j().k().X());
            }
            case 6: {
                return t.k(1L, y.t(), j..time.temporal.a.DAY_OF_YEAR.l().d());
            }
            case 7: {
                return t.j(x.d.X(), 0x3B9AC9FFL);
            }
            case 8: {
                return t.j(y.d.getValue(), y.j().getValue());
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
        return j..com.android.tools.r8.a.k(y.D());
    }

    @Override  // j$.time.chrono.l
    public final boolean N(long v) {
        return j..time.chrono.s.d.N(v);
    }

    @Override  // j$.time.chrono.l
    public final m O(int v) {
        return y.r(v);
    }

    @Override  // j$.time.chrono.a
    final b Q(Map map0, E e0) {
        b b0;
        j..time.temporal.a a0 = j..time.temporal.a.ERA;
        Long long0 = (Long)map0.get(a0);
        y y0 = long0 == null ? null : y.r(this.H(a0).a(((long)long0), a0));
        j..time.temporal.a a1 = j..time.temporal.a.YEAR_OF_ERA;
        Long long1 = (Long)map0.get(a1);
        int v = long1 == null ? 0 : this.H(a1).a(((long)long1), a1);
        if(y0 == null && long1 != null && !map0.containsKey(j..time.temporal.a.YEAR) && e0 != E.STRICT) {
            y[] arr_y = y.D();
            y0 = arr_y[y.D().length - 1];
        }
        if(long1 != null && y0 != null) {
            j..time.temporal.a a2 = j..time.temporal.a.MONTH_OF_YEAR;
            if(map0.containsKey(a2)) {
                j..time.temporal.a a3 = j..time.temporal.a.DAY_OF_MONTH;
                if(map0.containsKey(a3)) {
                    map0.remove(a0);
                    map0.remove(a1);
                    if(e0 == E.LENIENT) {
                        long v1 = j..com.android.tools.r8.a.p(((long)(((Long)map0.remove(a2)))), 1L);
                        long v2 = j..com.android.tools.r8.a.p(((long)(((Long)map0.remove(a3)))), 1L);
                        return new x(LocalDate.c0(y0.k().X() + v - 1, 1, 1)).V(v1, ChronoUnit.MONTHS).V(v2, ChronoUnit.DAYS);
                    }
                    int v3 = this.H(a2).a(((long)(((Long)map0.remove(a2)))), a2);
                    int v4 = this.H(a3).a(((long)(((Long)map0.remove(a3)))), a3);
                    if(e0 == E.SMART) {
                        if(v < 1) {
                            throw new j..time.b("Invalid YearOfEra: " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        int v5 = y0.k().X() + v - 1;
                        try {
                            b0 = new x(LocalDate.c0(v5, v3, v4));
                        }
                        catch(j..time.b unused_ex) {
                            b0 = new x(LocalDate.c0(v5, v3, 1)).Y(new p(0));
                        }
                        if(((x)b0).U() != y0 && j..time.temporal.m.a(b0, j..time.temporal.a.YEAR_OF_ERA) > 1 && v > 1) {
                            throw new j..time.b("Invalid YearOfEra for Era: " + y0 + " " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                        }
                        return b0;
                    }
                    Objects.requireNonNull(y0, "era");
                    LocalDate localDate0 = LocalDate.c0(y0.k().X() + v - 1, v3, v4);
                    if(localDate0.Y(y0.k()) || y0 != y.f(localDate0)) {
                        throw new j..time.b("year, month, and day not valid for Era");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    return new x(y0, v, localDate0);
                }
            }
            j..time.temporal.a a4 = j..time.temporal.a.DAY_OF_YEAR;
            if(map0.containsKey(a4)) {
                map0.remove(a0);
                map0.remove(a1);
                if(e0 == E.LENIENT) {
                    long v6 = j..com.android.tools.r8.a.p(((long)(((Long)map0.remove(a4)))), 1L);
                    return new x(LocalDate.e0(y0.k().X() + v - 1, 1)).V(v6, ChronoUnit.DAYS);
                }
                int v7 = this.H(a4).a(((long)(((Long)map0.remove(a4)))), a4);
                Objects.requireNonNull(y0, "era");
                LocalDate localDate1 = v == 1 ? LocalDate.e0(y0.k().X(), y0.k().V() + v7 - 1) : LocalDate.e0(y0.k().X() + v - 1, v7);
                if(localDate1.Y(y0.k()) || y0 != y.f(localDate1)) {
                    throw new j..time.b("Invalid parameters");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                return new x(y0, v, localDate1);
            }
        }
        return null;
    }

    @Override  // j$.time.chrono.l
    public final int f(m m0, int v) {
        if(!(m0 instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int v1 = ((y)m0).k().X() + v - 1;
        if(v == 1) {
            return v1;
        }
        if(v1 < 0xC4653601 || v1 > 0x3B9AC9FF || v1 < ((y)m0).k().X() || m0 != y.f(LocalDate.c0(v1, 1, 1))) {
            throw new j..time.b("Invalid yearOfEra value");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return v1;
    }

    @Override  // j$.time.chrono.l
    public final b j(long v) {
        return new x(LocalDate.ofEpochDay(v));
    }

    @Override  // j$.time.chrono.l
    public final String k() {
        return "Japanese";
    }

    @Override  // j$.time.chrono.a
    public final b n() {
        return new x(LocalDate.S(LocalDate.b0(Clock.b())));
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.chrono.l
    public final b o(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0 instanceof x ? ((x)temporalAccessor0) : new x(LocalDate.S(temporalAccessor0));
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override  // j$.time.chrono.l
    public final String t() {
        return "japanese";
    }

    @Override  // j$.time.chrono.l
    public final b w(int v, int v1) {
        return new x(LocalDate.e0(v, v1));
    }

    Object writeReplace() {
        return new j..time.chrono.E(1, this);
    }
}

