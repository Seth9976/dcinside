package j$.time.temporal;

import j..com.android.tools.r8.a;
import j..time.b;
import j..time.chrono.h;
import j..time.chrono.l;
import j..time.format.E;
import java.util.HashMap;

enum j implements q {
    JULIAN_DAY("JulianDay", 2440588L),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587L),
    RATA_DIE("RataDie", 0xAF93BL);

    private final transient String a;
    private final transient t b;
    private final transient long c;
    private static final long serialVersionUID = 0x97E4E0CA1057C02CL;

    private j(String s1, long v1) {
        this.a = s1;
        this.b = t.j(v1 - 0x550A313CDAL, v1 + 0x550A1B48F7L);
        this.c = v1;
    }

    @Override  // j$.time.temporal.q
    public final t l() {
        return this.b;
    }

    @Override  // j$.time.temporal.q
    public final TemporalAccessor n(HashMap hashMap0, TemporalAccessor temporalAccessor0, E e0) {
        long v = (long)(((Long)hashMap0.remove(this)));
        l l0 = h.p(temporalAccessor0);
        long v1 = this.c;
        if(e0 == E.LENIENT) {
            return l0.j(a.p(v, v1));
        }
        this.b.b(v, this);
        return l0.j(v - v1);
    }

    @Override  // j$.time.temporal.q
    public final long p(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0.u(j..time.temporal.a.EPOCH_DAY) + this.c;
    }

    @Override  // j$.time.temporal.q
    public final boolean q(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0.e(j..time.temporal.a.EPOCH_DAY);
    }

    @Override
    public final String toString() {
        return this.a;
    }

    @Override  // j$.time.temporal.q
    public final j..time.temporal.l u(j..time.temporal.l l0, long v) {
        if(!this.b.i(v)) {
            throw new b("Invalid value: " + this.a + " " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return l0.c(a.p(v, this.c), j..time.temporal.a.EPOCH_DAY);
    }

    @Override  // j$.time.temporal.q
    public final t y(TemporalAccessor temporalAccessor0) {
        if(!temporalAccessor0.e(j..time.temporal.a.EPOCH_DAY)) {
            throw new b("Unsupported field: " + this);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return this.b;
    }

    @Override  // j$.time.temporal.q
    public final boolean z() {
        return true;
    }
}

