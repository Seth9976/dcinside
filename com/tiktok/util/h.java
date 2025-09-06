package com.tiktok.util;

import j..util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class h {
    private static DateFormat a;
    private static final SimpleDateFormat b;

    static {
        h.a = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss\'Z\'", Locale.getDefault());
        h.b = new SimpleDateFormat("yyyy-MM-dd");
    }

    public static String a(int v) {
        Calendar calendar0 = Calendar.getInstance();
        if(v != 0) {
            calendar0.add(5, v);
        }
        Date date0 = calendar0.getTime();
        return h.b.format(date0);
    }

    public static String b(Date date0) {
        TimeZone timeZone0 = DesugarTimeZone.getTimeZone("UTC");
        h.a.setTimeZone(timeZone0);
        return h.a.format(date0);
    }

    public static boolean c(String s, int v) {
        return h.a(-v).equals(s);
    }
}

