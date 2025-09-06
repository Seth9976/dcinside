package com.apm.insight.l;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class b {
    private static DateFormat a;

    static {
    }

    public static DateFormat a() {
        if(b.a == null) {
            b.a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return b.a;
    }
}

