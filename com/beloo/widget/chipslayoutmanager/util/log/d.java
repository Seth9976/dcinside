package com.beloo.widget.chipslayoutmanager.util.log;

import java.util.HashSet;
import java.util.Set;

public class d {
    public static class a {
        private Set a;

        public a() {
            this.a = new HashSet();
        }

        boolean a(int v) {
            return this.a.contains(v);
        }

        public a b(int v) {
            this.a.add(v);
            return this;
        }

        public a c(int v) {
            this.a.remove(v);
            return this;
        }
    }

    private static a a;
    private static f b;

    static {
        d.a = new a();
        d.b = new h();
    }

    public static int a(String s, String s1) {
        return d.b.b(s, s1);
    }

    // 去混淆评级： 低(20)
    public static int b(String s, String s1, int v) {
        return d.a.a(v) ? d.a(s, s1) : 0;
    }

    public static int c(String s, String s1) {
        return d.b.a(s, s1);
    }

    public static int d(String s, String s1) {
        return d.b.c(s, s1);
    }

    // 去混淆评级： 低(20)
    public static int e(String s, String s1, int v) {
        return d.a.a(v) ? d.d(s, s1) : 0;
    }

    public static int f(String s, String s1) {
        return d.b.d(s, s1);
    }

    // 去混淆评级： 低(20)
    public static int g(String s, String s1, int v) {
        return d.a.a(v) ? d.f(s, s1) : 0;
    }

    public static int h(String s, String s1) {
        return d.b.w(s, s1);
    }

    // 去混淆评级： 低(20)
    public static int i(String s, String s1, int v) {
        return d.a.a(v) ? d.h(s, s1) : 0;
    }

    public static void j(a d$a0) {
        d.a = d$a0;
    }
}

