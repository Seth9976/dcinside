package j$.time.temporal;

import j..time.Duration;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class ChronoUnit extends Enum implements r {
    public static final enum ChronoUnit CENTURIES;
    public static final enum ChronoUnit DAYS;
    public static final enum ChronoUnit DECADES;
    public static final enum ChronoUnit ERAS;
    public static final enum ChronoUnit FOREVER;
    public static final enum ChronoUnit HALF_DAYS;
    public static final enum ChronoUnit HOURS;
    public static final enum ChronoUnit MICROS;
    public static final enum ChronoUnit MILLENNIA;
    public static final enum ChronoUnit MILLIS;
    public static final enum ChronoUnit MINUTES;
    public static final enum ChronoUnit MONTHS;
    public static final enum ChronoUnit NANOS;
    public static final enum ChronoUnit SECONDS;
    public static final enum ChronoUnit WEEKS;
    public static final enum ChronoUnit YEARS;
    private final String a;
    private final Duration b;
    private static final ChronoUnit[] c;

    static {
        long v = v1 / 1000000000L;
        int v2 = (int)(v1 % 1000000000L);
        if(v2 < 0) {
            v2 = (int)(((long)v2) + 1000000000L);
            --v;
        }
        ChronoUnit.NANOS = new ChronoUnit("NANOS", 0, "Nanos", Duration.p(v, v2));
        long v3 = v4 / 1000000000L;
        int v5 = (int)(v4 % 1000000000L);
        if(v5 < 0) {
            v5 = (int)(((long)v5) + 1000000000L);
            --v3;
        }
        ChronoUnit.MICROS = new ChronoUnit("MICROS", 1, "Micros", Duration.p(v3, v5));
        long v6 = v7 / 1000000000L;
        int v8 = (int)(v7 % 1000000000L);
        if(v8 < 0) {
            v8 = (int)(((long)v8) + 1000000000L);
            --v6;
        }
        ChronoUnit.MILLIS = new ChronoUnit("MILLIS", 2, "Millis", Duration.p(v6, v8));
        ChronoUnit.SECONDS = new ChronoUnit("SECONDS", 3, "Seconds", Duration.p(v9, 0));
        ChronoUnit.MINUTES = new ChronoUnit("MINUTES", 4, "Minutes", Duration.p(v10, 0));
        ChronoUnit.HOURS = new ChronoUnit("HOURS", 5, "Hours", Duration.p(v11, 0));
        ChronoUnit.HALF_DAYS = new ChronoUnit("HALF_DAYS", 6, "HalfDays", Duration.p(v12, 0));
        ChronoUnit.DAYS = new ChronoUnit("DAYS", 7, "Days", Duration.p(v13, 0));
        ChronoUnit.WEEKS = new ChronoUnit("WEEKS", 8, "Weeks", Duration.p(v14, 0));
        ChronoUnit.MONTHS = new ChronoUnit("MONTHS", 9, "Months", Duration.p(v15, 0));
        ChronoUnit.YEARS = new ChronoUnit("YEARS", 10, "Years", Duration.u(0x1E18558L));
        ChronoUnit.DECADES = new ChronoUnit("DECADES", 11, "Decades", Duration.u(0x12CF3570L));
        ChronoUnit.CENTURIES = new ChronoUnit("CENTURIES", 12, "Centuries", Duration.u(3155695200L));
        ChronoUnit.MILLENNIA = new ChronoUnit("MILLENNIA", 13, "Millennia", Duration.u(0x758F0DFC0L));
        ChronoUnit.ERAS = new ChronoUnit("ERAS", 14, "Eras", Duration.u(31556952000000000L));
        ChronoUnit.FOREVER = new ChronoUnit("FOREVER", 15, "Forever", Duration.ofSeconds(0x7FFFFFFFFFFFFFFFL, 0x3B9AC9FFL));
        ChronoUnit.c = new ChronoUnit[]{ChronoUnit.NANOS, ChronoUnit.MICROS, ChronoUnit.MILLIS, ChronoUnit.SECONDS, ChronoUnit.MINUTES, ChronoUnit.HOURS, ChronoUnit.HALF_DAYS, ChronoUnit.DAYS, ChronoUnit.WEEKS, ChronoUnit.MONTHS, ChronoUnit.YEARS, ChronoUnit.DECADES, ChronoUnit.CENTURIES, ChronoUnit.MILLENNIA, ChronoUnit.ERAS, ChronoUnit.FOREVER};
    }

    private ChronoUnit(String s, int v, String s1, Duration duration0) {
        super(s, v);
        this.a = s1;
        this.b = duration0;
    }

    public Duration getDuration() {
        return this.b;
    }

    @Override  // j$.time.temporal.r
    public final l l(l l0, long v) {
        return l0.d(v, this);
    }

    @Override
    public final String toString() {
        return this.a;
    }

    public static ChronoUnit valueOf(String s) {
        return (ChronoUnit)Enum.valueOf(ChronoUnit.class, s);
    }

    public static ChronoUnit[] values() {
        return (ChronoUnit[])ChronoUnit.c.clone();
    }
}

