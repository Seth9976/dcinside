package j$.time.temporal;

import j..time.format.E;
import java.util.HashMap;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public final class a extends Enum implements q {
    public static final enum a ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final enum a ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final enum a ALIGNED_WEEK_OF_MONTH;
    public static final enum a ALIGNED_WEEK_OF_YEAR;
    public static final enum a AMPM_OF_DAY;
    public static final enum a CLOCK_HOUR_OF_AMPM;
    public static final enum a CLOCK_HOUR_OF_DAY;
    public static final enum a DAY_OF_MONTH;
    public static final enum a DAY_OF_WEEK;
    public static final enum a DAY_OF_YEAR;
    public static final enum a EPOCH_DAY;
    public static final enum a ERA;
    public static final enum a HOUR_OF_AMPM;
    public static final enum a HOUR_OF_DAY;
    public static final enum a INSTANT_SECONDS;
    public static final enum a MICRO_OF_DAY;
    public static final enum a MICRO_OF_SECOND;
    public static final enum a MILLI_OF_DAY;
    public static final enum a MILLI_OF_SECOND;
    public static final enum a MINUTE_OF_DAY;
    public static final enum a MINUTE_OF_HOUR;
    public static final enum a MONTH_OF_YEAR;
    public static final enum a NANO_OF_DAY;
    public static final enum a NANO_OF_SECOND;
    public static final enum a OFFSET_SECONDS;
    public static final enum a PROLEPTIC_MONTH;
    public static final enum a SECOND_OF_DAY;
    public static final enum a SECOND_OF_MINUTE;
    public static final enum a YEAR;
    public static final enum a YEAR_OF_ERA;
    private final String a;
    private final t b;
    private static final a[] c;

    static {
        if(v > 0x3B9AC9FFL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.NANO_OF_SECOND = new a("NANO_OF_SECOND", 0, "NanoOfSecond", new t(v, v, 0x3B9AC9FFL, 0x3B9AC9FFL));
        if(v1 > 0x4E94914EFFFFL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.NANO_OF_DAY = new a("NANO_OF_DAY", 1, "NanoOfDay", new t(v1, v1, 0x4E94914EFFFFL, 0x4E94914EFFFFL));
        if(v2 > 0xF423FL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.MICRO_OF_SECOND = new a("MICRO_OF_SECOND", 2, "MicroOfSecond", new t(v2, v2, 0xF423FL, 0xF423FL));
        if(v3 > 0x141DD75FFFL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.MICRO_OF_DAY = new a("MICRO_OF_DAY", 3, "MicroOfDay", new t(v3, v3, 0x141DD75FFFL, 0x141DD75FFFL));
        if(v4 > 999L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.MILLI_OF_SECOND = new a("MILLI_OF_SECOND", 4, "MilliOfSecond", new t(v4, v4, 999L, 999L));
        if(v5 > 0x5265BFFL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.MILLI_OF_DAY = new a("MILLI_OF_DAY", 5, "MilliOfDay", new t(v5, v5, 0x5265BFFL, 0x5265BFFL));
        if(v6 > 59L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.SECOND_OF_MINUTE = new a("SECOND_OF_MINUTE", 6, "SecondOfMinute", new t(v6, v6, 59L, 59L), 0);
        if(v7 > 0x1517FL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.SECOND_OF_DAY = new a("SECOND_OF_DAY", 7, "SecondOfDay", new t(v7, v7, 0x1517FL, 0x1517FL));
        if(v8 > 59L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.MINUTE_OF_HOUR = new a("MINUTE_OF_HOUR", 8, "MinuteOfHour", new t(v8, v8, 59L, 59L), 0);
        if(v9 > 0x59FL) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.MINUTE_OF_DAY = new a("MINUTE_OF_DAY", 9, "MinuteOfDay", new t(v9, v9, 0x59FL, 0x59FL));
        if(v10 > 11L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.HOUR_OF_AMPM = new a("HOUR_OF_AMPM", 10, "HourOfAmPm", new t(v10, v10, 11L, 11L));
        if(v11 > 12L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.CLOCK_HOUR_OF_AMPM = new a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", new t(v11, v11, 12L, 12L));
        if(v12 > 23L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.HOUR_OF_DAY = new a("HOUR_OF_DAY", 12, "HourOfDay", new t(v12, v12, 23L, 23L), 0);
        if(v13 > 24L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.CLOCK_HOUR_OF_DAY = new a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", new t(v13, v13, 24L, 24L));
        if(v14 > 1L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.AMPM_OF_DAY = new a("AMPM_OF_DAY", 14, "AmPmOfDay", new t(v14, v14, 1L, 1L), 0);
        if(v15 > 7L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.DAY_OF_WEEK = new a("DAY_OF_WEEK", 15, "DayOfWeek", new t(v15, v15, 7L, 7L), 0);
        if(v16 > 7L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.ALIGNED_DAY_OF_WEEK_IN_MONTH = new a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", new t(v16, v16, 7L, 7L));
        if(v17 > 7L) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        a.ALIGNED_DAY_OF_WEEK_IN_YEAR = new a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", new t(v17, v17, 7L, 7L));
        if(v18 > 1L) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        a.DAY_OF_MONTH = new a("DAY_OF_MONTH", 18, "DayOfMonth", new t(v18, 1L, 28L, 0x1FL), 0);
        if(v19 > 1L) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        a.DAY_OF_YEAR = new a("DAY_OF_YEAR", 19, "DayOfYear", new t(v19, 1L, 365L, 366L));
        a.EPOCH_DAY = new a("EPOCH_DAY", 20, "EpochDay", t.j(0xFFFFFFAAF5CEC326L, 0x550A1B48F7L));
        a.ALIGNED_WEEK_OF_MONTH = new a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", t.k(1L, 4L, 5L));
        a.ALIGNED_WEEK_OF_YEAR = new a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", t.j(1L, 53L));
        a.MONTH_OF_YEAR = new a("MONTH_OF_YEAR", 23, "MonthOfYear", t.j(1L, 12L), 0);
        a.PROLEPTIC_MONTH = new a("PROLEPTIC_MONTH", 24, "ProlepticMonth", t.j(0xFFFFFFFD34BE880CL, 0x2CB4177FFL));
        a.YEAR_OF_ERA = new a("YEAR_OF_ERA", 25, "YearOfEra", t.k(1L, 0x3B9AC9FFL, 1000000000L));
        a.YEAR = new a("YEAR", 26, "Year", t.j(0xFFFFFFFFC4653601L, 0x3B9AC9FFL), 0);
        a.ERA = new a("ERA", 27, "Era", t.j(0L, 1L), 0);
        a.INSTANT_SECONDS = new a("INSTANT_SECONDS", 28, "InstantSeconds", t.j(0x8000000000000000L, 0x7FFFFFFFFFFFFFFFL));
        a.OFFSET_SECONDS = new a("OFFSET_SECONDS", 29, "OffsetSeconds", t.j(0xFFFFFFFFFFFF02E0L, 0xFD20L));
        a.c = new a[]{a.NANO_OF_SECOND, a.NANO_OF_DAY, a.MICRO_OF_SECOND, a.MICRO_OF_DAY, a.MILLI_OF_SECOND, a.MILLI_OF_DAY, a.SECOND_OF_MINUTE, a.SECOND_OF_DAY, a.MINUTE_OF_HOUR, a.MINUTE_OF_DAY, a.HOUR_OF_AMPM, a.CLOCK_HOUR_OF_AMPM, a.HOUR_OF_DAY, a.CLOCK_HOUR_OF_DAY, a.AMPM_OF_DAY, a.DAY_OF_WEEK, a.ALIGNED_DAY_OF_WEEK_IN_MONTH, a.ALIGNED_DAY_OF_WEEK_IN_YEAR, a.DAY_OF_MONTH, a.DAY_OF_YEAR, a.EPOCH_DAY, a.ALIGNED_WEEK_OF_MONTH, a.ALIGNED_WEEK_OF_YEAR, a.MONTH_OF_YEAR, a.PROLEPTIC_MONTH, a.YEAR_OF_ERA, a.YEAR, a.ERA, a.INSTANT_SECONDS, a.OFFSET_SECONDS};
    }

    private a(String s, int v, String s1, t t0) {
        super(s, v);
        this.a = s1;
        this.b = t0;
    }

    private a(String s, int v, String s1, t t0, int v1) {
        super(s, v);
        this.a = s1;
        this.b = t0;
    }

    public final int Q(long v) {
        return this.b.a(v, this);
    }

    public final void R(long v) {
        this.b.b(v, this);
    }

    public final boolean S() {
        return this.ordinal() < a.DAY_OF_WEEK.ordinal();
    }

    @Override  // j$.time.temporal.q
    public final t l() {
        return this.b;
    }

    @Override  // j$.time.temporal.q
    public final TemporalAccessor n(HashMap hashMap0, TemporalAccessor temporalAccessor0, E e0) {
        return null;
    }

    @Override  // j$.time.temporal.q
    public final long p(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0.u(this);
    }

    @Override  // j$.time.temporal.q
    public final boolean q(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0.e(this);
    }

    @Override
    public final String toString() {
        return this.a;
    }

    @Override  // j$.time.temporal.q
    public final l u(l l0, long v) {
        return l0.c(v, this);
    }

    public static a valueOf(String s) {
        return (a)Enum.valueOf(a.class, s);
    }

    public static a[] values() {
        return (a[])a.c.clone();
    }

    @Override  // j$.time.temporal.q
    public final t y(TemporalAccessor temporalAccessor0) {
        return temporalAccessor0.q(this);
    }

    @Override  // j$.time.temporal.q
    public final boolean z() {
        return this.ordinal() >= a.DAY_OF_WEEK.ordinal() && this.ordinal() <= a.ERA.ordinal();
    }
}

