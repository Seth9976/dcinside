package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.android.material.R.string;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class j {
    static Pair a(@Nullable Long long0, @Nullable Long long1) {
        return j.b(long0, long1, null);
    }

    static Pair b(@Nullable Long long0, @Nullable Long long1, @Nullable SimpleDateFormat simpleDateFormat0) {
        if(long0 == null && long1 == null) {
            return Pair.a(null, null);
        }
        if(long0 == null) {
            return Pair.a(null, j.d(((long)long1), simpleDateFormat0));
        }
        if(long1 == null) {
            return Pair.a(j.d(((long)long0), simpleDateFormat0), null);
        }
        Calendar calendar0 = C.v();
        Calendar calendar1 = C.x();
        calendar1.setTimeInMillis(((long)long0));
        Calendar calendar2 = C.x();
        calendar2.setTimeInMillis(((long)long1));
        if(simpleDateFormat0 != null) {
            Date date0 = new Date(((long)long0));
            Date date1 = new Date(((long)long1));
            return Pair.a(simpleDateFormat0.format(date0), simpleDateFormat0.format(date1));
        }
        if(calendar1.get(1) == calendar2.get(1)) {
            return calendar1.get(1) == calendar0.get(1) ? Pair.a(j.g(((long)long0), Locale.getDefault()), j.g(((long)long1), Locale.getDefault())) : Pair.a(j.g(((long)long0), Locale.getDefault()), j.n(((long)long1), Locale.getDefault()));
        }
        return Pair.a(j.n(((long)long0), Locale.getDefault()), j.n(((long)long1), Locale.getDefault()));
    }

    static String c(long v) {
        return j.d(v, null);
    }

    static String d(long v, @Nullable SimpleDateFormat simpleDateFormat0) {
        if(simpleDateFormat0 != null) {
            return simpleDateFormat0.format(new Date(v));
        }
        return j.q(v) ? j.f(v) : j.m(v);
    }

    static String e(Context context0, long v, boolean z, boolean z1, boolean z2) {
        String s = j.j(v);
        if(z) {
            s = String.format(context0.getString(string.mtrl_picker_today_description), s);
        }
        if(z1) {
            return String.format(context0.getString(string.mtrl_picker_start_date_description), s);
        }
        return z2 ? String.format(context0.getString(string.mtrl_picker_end_date_description), s) : s;
    }

    static String f(long v) {
        return j.g(v, Locale.getDefault());
    }

    static String g(long v, Locale locale0) {
        return Build.VERSION.SDK_INT < 24 ? C.o(locale0).format(new Date(v)) : C.c(locale0).format(new Date(v));
    }

    static String h(long v) {
        return j.i(v, Locale.getDefault());
    }

    static String i(long v, Locale locale0) {
        return Build.VERSION.SDK_INT < 24 ? C.k(locale0).format(new Date(v)) : C.p(locale0).format(new Date(v));
    }

    // 去混淆评级： 低(20)
    static String j(long v) {
        return j.q(v) ? j.h(v) : j.o(v);
    }

    static String k(Context context0, int v) {
        return C.v().get(1) == v ? String.format(context0.getString(string.mtrl_picker_navigate_to_current_year_description), v) : String.format(context0.getString(string.mtrl_picker_navigate_to_year_description), v);
    }

    static String l(long v) {
        return Build.VERSION.SDK_INT < 24 ? DateUtils.formatDateTime(null, v, 0x2024) : C.A(Locale.getDefault()).format(new Date(v));
    }

    static String m(long v) {
        return j.n(v, Locale.getDefault());
    }

    static String n(long v, Locale locale0) {
        return Build.VERSION.SDK_INT < 24 ? C.m(locale0).format(new Date(v)) : C.z(locale0).format(new Date(v));
    }

    static String o(long v) {
        return j.p(v, Locale.getDefault());
    }

    static String p(long v, Locale locale0) {
        return Build.VERSION.SDK_INT < 24 ? C.k(locale0).format(new Date(v)) : C.B(locale0).format(new Date(v));
    }

    private static boolean q(long v) {
        Calendar calendar0 = C.v();
        Calendar calendar1 = C.x();
        calendar1.setTimeInMillis(v);
        return calendar0.get(1) == calendar1.get(1);
    }
}

