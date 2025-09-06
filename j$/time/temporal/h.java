package j$.time.temporal;

import j..com.android.tools.r8.a;

enum h implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    private final String a;

    private h(String s1) {
        this.a = s1;
    }

    @Override  // j$.time.temporal.r
    public final l l(l l0, long v) {
        switch(b.a[this.ordinal()]) {
            case 1: {
                return l0.c(a.i(l0.n(i.c), v), i.c);
            }
            case 2: {
                return l0.d(v / 4L, ChronoUnit.YEARS).d(v % 4L * 3L, ChronoUnit.MONTHS);
            }
            default: {
                throw new IllegalStateException("Unreachable");
            }
        }
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

