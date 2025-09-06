package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.t;
import com.google.firebase.remoteconfig.v;
import java.util.Date;

public class q {
    static class a {
        private int a;
        private Date b;

        a(int v, Date date0) {
            this.a = v;
            this.b = date0;
        }

        Date a() {
            return this.b;
        }

        int b() {
            return this.a;
        }
    }

    @VisibleForTesting
    public static class b {
        private int a;
        private Date b;

        @VisibleForTesting
        public b(int v, Date date0) {
            this.a = v;
            this.b = date0;
        }

        Date a() {
            return this.b;
        }

        int b() {
            return this.a;
        }
    }

    private final SharedPreferences a;
    private final Object b;
    private final Object c;
    private final Object d;
    @VisibleForTesting
    public static final long e = -1L;
    static final Date f = null;
    static final int g = 0;
    @VisibleForTesting
    static final int h = 0;
    private static final long i = -1L;
    @VisibleForTesting
    static final Date j = null;
    private static final String k = "fetch_timeout_in_seconds";
    private static final String l = "minimum_fetch_interval_in_seconds";
    private static final String m = "last_fetch_status";
    private static final String n = "last_fetch_time_in_millis";
    private static final String o = "last_fetch_etag";
    private static final String p = "backoff_end_time_in_millis";
    private static final String q = "num_failed_fetches";
    private static final String r = "last_template_version";
    private static final String s = "num_failed_realtime_streams";
    private static final String t = "realtime_backoff_end_time_in_millis";

    static {
        q.f = new Date(-1L);
        q.j = new Date(-1L);
    }

    public q(SharedPreferences sharedPreferences0) {
        this.a = sharedPreferences0;
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }

    @WorkerThread
    public void a() {
        synchronized(this.b) {
            this.a.edit().clear().commit();
        }
    }

    a b() {
        synchronized(this.c) {
        }
        return new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
    }

    public long c() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public t d() {
        v v3;
        int v2;
        long v1;
        synchronized(this.b) {
            v1 = this.a.getLong("last_fetch_time_in_millis", -1L);
            v2 = this.a.getInt("last_fetch_status", 0);
            v3 = new com.google.firebase.remoteconfig.v.b().f(this.a.getLong("fetch_timeout_in_seconds", 60L)).g(this.a.getLong("minimum_fetch_interval_in_seconds", n.j)).c();
        }
        return x.d().c(v2).d(v1).b(v3).a();
    }

    @Nullable
    String e() {
        return this.a.getString("last_fetch_etag", null);
    }

    int f() {
        return this.a.getInt("last_fetch_status", 0);
    }

    Date g() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    long h() {
        return this.a.getLong("last_template_version", 0L);
    }

    public long i() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", n.j);
    }

    @VisibleForTesting
    public b j() {
        synchronized(this.d) {
        }
        return new b(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)));
    }

    void k() {
        this.m(0, q.j);
    }

    void l() {
        this.r(0, q.j);
    }

    void m(int v, Date date0) {
        synchronized(this.c) {
            this.a.edit().putInt("num_failed_fetches", v).putLong("backoff_end_time_in_millis", date0.getTime()).apply();
        }
    }

    @WorkerThread
    public void n(v v0) {
        synchronized(this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", v0.a()).putLong("minimum_fetch_interval_in_seconds", v0.b()).commit();
        }
    }

    public void o(v v0) {
        synchronized(this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", v0.a()).putLong("minimum_fetch_interval_in_seconds", v0.b()).apply();
        }
    }

    void p(String s) {
        synchronized(this.b) {
            this.a.edit().putString("last_fetch_etag", s).apply();
        }
    }

    void q(long v) {
        synchronized(this.b) {
            this.a.edit().putLong("last_template_version", v).apply();
        }
    }

    void r(int v, Date date0) {
        synchronized(this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", v).putLong("realtime_backoff_end_time_in_millis", date0.getTime()).apply();
        }
    }

    void s() {
        synchronized(this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void t(Date date0) {
        synchronized(this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date0.getTime()).apply();
        }
    }

    void u() {
        synchronized(this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}

