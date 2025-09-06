package org.jsoup.parser;

import org.jsoup.internal.g;
import org.jsoup.nodes.b;

public class f {
    private final boolean a;
    private final boolean b;
    public static final f c;
    public static final f d;

    static {
        f.c = new f(false, false);
        f.d = new f(true, true);
    }

    f(f f0) {
        this(f0.a, f0.b);
    }

    public f(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    static String a(String s) {
        return g.a(s.trim());
    }

    public String b(String s) {
        String s1 = s.trim();
        return this.b ? s1 : g.a(s1);
    }

    b c(b b0) {
        if(b0 != null && !this.b) {
            b0.G();
        }
        return b0;
    }

    public String d(String s) {
        String s1 = s.trim();
        return this.a ? s1 : g.a(s1);
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return this.a;
    }
}

