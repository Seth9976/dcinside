package com.fasterxml.jackson.core.util;

import java.io.Serializable;

public class w implements Serializable {
    public static enum a {
        NONE("", ""),
        BEFORE(" ", ""),
        AFTER("", " "),
        BOTH(" ", " ");

        private final String a;
        private final String b;

        private a(String s1, String s2) {
            this.a = s1;
            this.b = s2;
        }

        public String a(char c) {
            return this.a + c + this.b;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }
    }

    private final char a;
    private final a b;
    private final char c;
    private final a d;
    private final char e;
    private final a f;
    private final String g;
    private static final long h = 1L;
    public static final String i = " ";

    public w() {
        this(':', ',', ',');
    }

    public w(char c, char c1, char c2) {
        this(" ", c, a.f, c1, a.c, c2, a.c);
    }

    public w(String s, char c, a w$a0, char c1, a w$a1, char c2, a w$a2) {
        this.g = s;
        this.a = c;
        this.b = w$a0;
        this.c = c1;
        this.d = w$a1;
        this.e = c2;
        this.f = w$a2;
    }

    public static w a() {
        return new w();
    }

    public char b() {
        return this.e;
    }

    public a c() {
        return this.f;
    }

    public char d() {
        return this.c;
    }

    public a e() {
        return this.d;
    }

    public char f() {
        return this.a;
    }

    public a g() {
        return this.b;
    }

    public String h() [...] // 潜在的解密器

    public w i(char c) {
        return this.e == c ? this : new w(this.g, this.a, this.b, this.c, this.d, c, this.f);
    }

    public w j(a w$a0) {
        return this.f == w$a0 ? this : new w(this.g, this.a, this.b, this.c, this.d, this.e, w$a0);
    }

    public w k(char c) {
        return this.c == c ? this : new w(this.g, this.a, this.b, c, this.d, this.e, this.f);
    }

    public w l(a w$a0) {
        return this.d == w$a0 ? this : new w(this.g, this.a, this.b, this.c, w$a0, this.e, this.f);
    }

    public w m(char c) {
        return this.a == c ? this : new w(this.g, c, this.b, this.c, this.d, this.e, this.f);
    }

    public w n(a w$a0) {
        return this.b == w$a0 ? this : new w(this.g, this.a, w$a0, this.c, this.d, this.e, this.f);
    }

    // 去混淆评级： 低(20)
    public w o(String s) {
        return this.g.equals(s) ? this : new w(s, this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

