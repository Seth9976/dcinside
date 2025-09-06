package com.tiktok.appevents;

import com.tiktok.b;
import com.tiktok.util.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class a implements Serializable {
    public static enum com.tiktok.appevents.a.a {
        track,
        identify;

    }

    private List a;
    private com.tiktok.appevents.a.a b;
    private String c;
    private Date d;
    private String e;
    private String f;
    private Long g;
    private C h;
    private static final long i = 2L;
    private static AtomicLong j;
    private static String k;
    private static f l;

    static {
        a.j = new AtomicLong(new Date().getTime());
        String s = s.class.getCanonicalName();
        a.k = s;
        a.l = new f(s, b.o());
    }

    a(com.tiktok.appevents.a.a a$a0, String s, String s1, String s2, String[] arr_s) {
        this(a$a0, s, new Date(), s1, s2, arr_s);
    }

    a(com.tiktok.appevents.a.a a$a0, String s, Date date0, String s1, String s2, String[] arr_s) {
        this.a = new ArrayList();
        this.b = a$a0;
        this.c = s;
        this.d = date0;
        this.e = s1;
        this.f = s2;
        this.g = a.j.getAndIncrement();
        this.h = C.h.a();
        if(arr_s != null && arr_s.length > 0) {
            for(int v = 0; v < arr_s.length; ++v) {
                this.a.add(arr_s[v]);
            }
        }
    }

    public String a() {
        return this.f;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public List d() {
        return this.a;
    }

    public Date e() {
        return this.d;
    }

    public String f() {
        return this.b.name();
    }

    public Long g() {
        return this.g;
    }

    public C h() {
        return this.h;
    }

    public void i(String s) {
        this.f = s;
    }

    public void j(String s) {
        this.c = s;
    }

    public void k(String s) {
        this.e = s;
    }

    public void l(List list0) {
        this.a = list0;
    }

    public void m(Date date0) {
        this.d = date0;
    }

    @Override
    public String toString() {
        return "TTAppEvent{eventName=\'" + this.c + '\'' + ", timeStamp=" + this.d + ", propertiesJson=\'" + this.e + '\'' + ", eventId=\'" + this.f + '\'' + ", uniqueId=" + this.g + ", tiktokAppIds=" + this.a + '}';
    }
}

