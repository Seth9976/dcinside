package com.dcinside.app.util;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import j..time.Instant;
import j..time.LocalDateTime;
import j..time.ZoneId;
import java.util.Date;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class el {
    protected final boolean a(@l String s) {
        L.p(s, "<this>");
        return ll.a.contains(s);
    }

    protected final boolean b(@l String s, boolean z) {
        L.p(s, "<this>");
        return ll.a.getBoolean(s, z);
    }

    @m
    protected final Date c(@l String s, @m Date date0) {
        L.p(s, "<this>");
        long v = ll.a.getLong(s, 0L);
        return v > 0L ? new Date(v) : date0;
    }

    protected final float d(@l String s, float f) {
        L.p(s, "<this>");
        return ll.a.getFloat(s, f);
    }

    protected final int e(@l String s, int v) {
        L.p(s, "<this>");
        return ll.a.getInt(s, v);
    }

    @m
    protected final LocalDateTime f(@l String s, @m LocalDateTime localDateTime0) {
        L.p(s, "<this>");
        long v = ll.a.getLong(s, 0L);
        return v <= 0L ? localDateTime0 : Instant.ofEpochMilli(v).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    protected final long g(@l String s, long v) {
        L.p(s, "<this>");
        return ll.a.getLong(s, v);
    }

    @m
    protected final String h(@l String s, @m String s1) {
        L.p(s, "<this>");
        return ll.a.getString(s, s1);
    }

    public final void i(@l SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        L.p(sharedPreferences$OnSharedPreferenceChangeListener0, "l");
        ll.Q(sharedPreferences$OnSharedPreferenceChangeListener0);
    }

    protected final void j(@l String s, boolean z) {
        L.p(s, "<this>");
        ll.a.edit().putBoolean(s, z).apply();
    }

    protected final void k(@l String s, @m Date date0) {
        L.p(s, "<this>");
        if(date0 == null) {
            ll.a.edit().putLong(s, 0L).apply();
            return;
        }
        ll.a.edit().putLong(s, date0.getTime()).apply();
    }

    protected final void l(@l String s, float f) {
        L.p(s, "<this>");
        ll.a.edit().putFloat(s, f).apply();
    }

    protected final void m(@l String s, int v) {
        L.p(s, "<this>");
        ll.a.edit().putInt(s, v).apply();
    }

    protected final void n(@l String s, @m LocalDateTime localDateTime0) {
        L.p(s, "<this>");
        if(localDateTime0 == null) {
            ll.a.edit().putLong(s, 0L).apply();
            return;
        }
        long v = localDateTime0.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        ll.a.edit().putLong(s, v).apply();
    }

    protected final void o(@l String s, long v) {
        L.p(s, "<this>");
        ll.a.edit().putLong(s, v).apply();
    }

    protected final void p(@l String s, @m String s1) {
        L.p(s, "<this>");
        ll.a.edit().putString(s, s1).apply();
    }

    protected final Object q(String s) {
        L.p(s, "<this>");
        if(s.length() == 0) {
            return null;
        }
        L.y(4, "T");
        return uk.a.r(s, Object.class);
    }

    protected final String r(Object object0) {
        return uk.a.D(object0);
    }

    public final void s(@l SharedPreferences.OnSharedPreferenceChangeListener sharedPreferences$OnSharedPreferenceChangeListener0) {
        L.p(sharedPreferences$OnSharedPreferenceChangeListener0, "l");
        ll.B0(sharedPreferences$OnSharedPreferenceChangeListener0);
    }
}

