package org.jsoup.internal;

import java.util.Locale;

public final class g {
    public static String a(String s) {
        return s == null ? "" : s.toLowerCase(Locale.ENGLISH);
    }

    public static String b(String s) {
        return g.a(s).trim();
    }

    // 去混淆评级： 低(20)
    public static String c(String s, boolean z) {
        return z ? g.a(s) : g.b(s);
    }
}

