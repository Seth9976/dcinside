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
import j..time.temporal.s;
import j..time.temporal.t;

public enum j implements TemporalAccessor, n {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    private static final j[] a;

    static {
        j.a = (j[])j.b.clone();
    }

    public final int Q(boolean z) {
        switch(i.a[this.ordinal()]) {
            case 1: {
                return 0x20;
            }
            case 2: {
                return ((int)z) + 91;
            }
            case 3: {
                return ((int)z) + 0x98;
            }
            case 4: {
                return ((int)z) + 0xF4;
            }
            case 5: {
                return ((int)z) + 305;
            }
            case 6: {
                return 1;
            }
            case 7: {
                return ((int)z) + 60;
            }
            case 8: {
                return ((int)z) + 0x79;
            }
            case 9: {
                return ((int)z) + 0xB6;
            }
            case 10: {
                return ((int)z) + 0xD5;
            }
            case 11: {
                return ((int)z) + 274;
            }
            default: {
                return ((int)z) + 0x14F;
            }
        }
    }

    public final int R(boolean z) {
        switch(i.a[this.ordinal()]) {
            case 1: {
                return z ? 29 : 28;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 30;
            }
            default: {
                return 0x1F;
            }
        }
    }

    public final int S() {
        switch(i.a[this.ordinal()]) {
            case 1: {
                return 29;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 30;
            }
            default: {
                return 0x1F;
            }
        }
    }

    public static j T(int v) {
        if(v < 1 || v > 12) {
            throw new b("Invalid value for MonthOfYear: " + v);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return j.a[v - 1];
    }

    public final j U() {
        return j.a[(this.ordinal() + 13) % 12];
    }

    // 去混淆评级： 低(30)
    @Override  // j$.time.temporal.TemporalAccessor
    public final boolean e(q q0) {
        return q0 instanceof a ? q0 == a.MONTH_OF_YEAR : q0 != null && q0.q(this);
    }

    public final int getValue() {
        return this.ordinal() + 1;
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final int n(q q0) {
        return q0 == a.MONTH_OF_YEAR ? this.getValue() : m.a(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final t q(q q0) {
        return q0 == a.MONTH_OF_YEAR ? q0.l() : m.d(this, q0);
    }

    @Override  // j$.time.temporal.TemporalAccessor
    public final long u(q q0) {
        if(q0 == a.MONTH_OF_YEAR) {
            return (long)this.getValue();
        }
        if(q0 instanceof a) {
            throw new s("Unsupported field: " + q0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return q0.p(this);
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
        return l0.c(((long)this.getValue()), a.MONTH_OF_YEAR);
    }
}

