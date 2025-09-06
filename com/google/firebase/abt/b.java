package com.google.firebase.abt;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.connector.a.c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class b {
    private final String a;
    private final String b;
    private final String c;
    private final Date d;
    private final long e;
    private final long f;
    @VisibleForTesting
    static final String g = "experimentId";
    @VisibleForTesting
    static final String h = "variantId";
    @VisibleForTesting
    static final String i = "triggerEvent";
    @VisibleForTesting
    static final String j = "experimentStartTime";
    @VisibleForTesting
    static final String k = "triggerTimeoutMillis";
    @VisibleForTesting
    static final String l = "timeToLiveMillis";
    private static final String[] m;
    @VisibleForTesting
    static final DateFormat n;

    static {
        b.m = new String[]{"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
        b.n = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss", Locale.US);
    }

    public b(String s, String s1, String s2, Date date0, long v, long v1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = date0;
        this.e = v;
        this.f = v1;
    }

    static b a(c a$c0) {
        String s = a$c0.d;
        return s == null ? new b(a$c0.b, String.valueOf(a$c0.c), "", new Date(a$c0.m), a$c0.e, a$c0.j) : new b(a$c0.b, String.valueOf(a$c0.c), s, new Date(a$c0.m), a$c0.e, a$c0.j);
    }

    static b b(Map map0) throws a {
        b.l(map0);
        try {
            String s = (String)map0.get("experimentStartTime");
            Date date0 = b.n.parse(s);
            long v = Long.parseLong(((String)map0.get("triggerTimeoutMillis")));
            long v1 = Long.parseLong(((String)map0.get("timeToLiveMillis")));
            return new b(((String)map0.get("experimentId")), ((String)map0.get("variantId")), (map0.containsKey("triggerEvent") ? ((String)map0.get("triggerEvent")) : ""), date0, v, v1);
        }
        catch(ParseException parseException0) {
        }
        catch(NumberFormatException numberFormatException0) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", numberFormatException0);
        }
        throw new a("Could not process experiment: parsing experiment start time failed.", parseException0);
    }

    String c() {
        return this.a;
    }

    long d() {
        return this.d.getTime();
    }

    long e() {
        return this.f;
    }

    String f() {
        return this.c;
    }

    long g() {
        return this.e;
    }

    String h() {
        return this.b;
    }

    c i(String s) {
        c a$c0 = new c();
        a$c0.a = s;
        a$c0.m = this.d();
        a$c0.b = this.a;
        a$c0.c = this.b;
        a$c0.d = TextUtils.isEmpty(this.c) ? null : this.c;
        a$c0.e = this.e;
        a$c0.j = this.f;
        return a$c0;
    }

    @VisibleForTesting
    Map j() {
        Map map0 = new HashMap();
        map0.put("experimentId", this.a);
        map0.put("variantId", this.b);
        map0.put("triggerEvent", this.c);
        map0.put("experimentStartTime", b.n.format(this.d));
        map0.put("triggerTimeoutMillis", Long.toString(this.e));
        map0.put("timeToLiveMillis", Long.toString(this.f));
        return map0;
    }

    static void k(b b0) throws a {
        b.l(b0.j());
    }

    private static void l(Map map0) throws a {
        ArrayList arrayList0 = new ArrayList();
        String[] arr_s = b.m;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(!map0.containsKey(s)) {
                arrayList0.add(s);
            }
        }
        if(!arrayList0.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList0));
        }
    }
}

