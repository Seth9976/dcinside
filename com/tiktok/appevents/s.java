package com.tiktok.appevents;

import com.tiktok.b.e;
import com.tiktok.b;
import com.tiktok.util.g;
import java.util.ArrayList;
import java.util.List;

class s {
    private static String a = "com.tiktok.appevents.s";
    private static List b;

    static {
        s.b = new ArrayList();
    }

    public static void a(a a0) {
        synchronized(s.class) {
            g.a("com.tiktok.appevents.s");
            s.b.add(a0);
            s.d();
        }
    }

    public static void b() {
        synchronized(s.class) {
            g.a("com.tiktok.appevents.s");
            s.b = new ArrayList();
            s.d();
        }
    }

    public static List c() {
        synchronized(s.class) {
            List list0 = s.b;
            s.b = new ArrayList();
            s.d();
            return list0;
        }
    }

    private static void d() {
        e b$e0 = b.u;
        if(b$e0 != null) {
            b$e0.a(s.b.size());
        }
        if(b.w != null) {
            int v = Math.max(100 - s.e(), 0);
            b.w.b(100, v);
        }
    }

    public static int e() {
        synchronized(s.class) {
            return s.b.size();
        }
    }
}

