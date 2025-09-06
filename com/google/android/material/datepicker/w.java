package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

class w {
    @Nullable
    private final Long a;
    @Nullable
    private final TimeZone b;
    private static final w c;

    static {
        w.c = new w(null, null);
    }

    private w(@Nullable Long long0, @Nullable TimeZone timeZone0) {
        this.a = long0;
        this.b = timeZone0;
    }

    static w a(long v) {
        return new w(v, null);
    }

    static w b(long v, @Nullable TimeZone timeZone0) {
        return new w(v, timeZone0);
    }

    Calendar c() {
        return this.d(this.b);
    }

    Calendar d(@Nullable TimeZone timeZone0) {
        Calendar calendar0 = timeZone0 == null ? Calendar.getInstance() : Calendar.getInstance(timeZone0);
        Long long0 = this.a;
        if(long0 != null) {
            calendar0.setTimeInMillis(((long)long0));
        }
        return calendar0;
    }

    static w e() {
        return w.c;
    }
}

