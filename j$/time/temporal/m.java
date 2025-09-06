package j$.time.temporal;

import j..time.b;
import j..util.Objects;

public abstract class m {
    static final TemporalQuery a;
    static final TemporalQuery b;
    static final TemporalQuery c;
    static final TemporalQuery d;
    static final TemporalQuery e;
    static final TemporalQuery f;
    static final TemporalQuery g;

    static {
        m.a = new p(1);
        m.b = new p(2);
        m.c = new p(3);
        m.d = new p(4);
        m.e = new p(5);
        m.f = new p(6);
        m.g = new p(7);
    }

    public static int a(TemporalAccessor temporalAccessor0, q q0) {
        t t0 = temporalAccessor0.q(q0);
        if(!t0.h()) {
            throw new s("Invalid field " + q0 + " for get() method, use getLong() instead");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        long v = temporalAccessor0.u(q0);
        if(!t0.i(v)) {
            throw new b("Invalid value for " + q0 + " (valid values " + t0 + "): " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return (int)v;
    }

    public static l b(l l0, long v, r r0) {
        return v == 0x8000000000000000L ? l0.d(0x7FFFFFFFFFFFFFFFL, r0).d(1L, r0) : l0.d(-v, r0);
    }

    public static Object c(TemporalAccessor temporalAccessor0, TemporalQuery temporalQuery0) {
        return temporalQuery0 == m.a || temporalQuery0 == m.b || temporalQuery0 == m.c ? null : temporalQuery0.queryFrom(temporalAccessor0);
    }

    public static t d(TemporalAccessor temporalAccessor0, q q0) {
        if(q0 instanceof a) {
            if(!temporalAccessor0.e(q0)) {
                throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            return ((a)q0).l();
        }
        Objects.requireNonNull(q0, "field");
        return q0.y(temporalAccessor0);
    }

    public static TemporalQuery e() {
        return m.b;
    }

    public static TemporalQuery f() {
        return m.f;
    }

    public static TemporalQuery g() {
        return m.g;
    }

    public static int h(int v) {
        if(v % 7 == 0) {
            return 0;
        }
        return ((v ^ 7) >> 0x1F | 1) > 0 ? v % 7 : v % 7 + 7;
    }

    public static TemporalQuery i() {
        return m.d;
    }

    public static TemporalQuery j() {
        return m.c;
    }

    public static TemporalQuery k() {
        return m.e;
    }

    public static TemporalQuery l() {
        return m.a;
    }
}

