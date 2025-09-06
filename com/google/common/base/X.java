package com.google.common.base;

import J1.c;
import J1.d;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@c
@d
@k
final class x extends h implements Serializable {
    static final class a extends g {
        final Matcher a;

        a(Matcher matcher0) {
            this.a = (Matcher)H.E(matcher0);
        }

        @Override  // com.google.common.base.g
        public int a() {
            return this.a.end();
        }

        @Override  // com.google.common.base.g
        public boolean b() {
            return this.a.find();
        }

        @Override  // com.google.common.base.g
        public boolean c(int v) {
            return this.a.find(v);
        }

        @Override  // com.google.common.base.g
        public boolean d() {
            return this.a.matches();
        }

        @Override  // com.google.common.base.g
        public String e(String s) {
            return this.a.replaceAll(s);
        }

        @Override  // com.google.common.base.g
        public int f() {
            return this.a.start();
        }
    }

    private final Pattern a;
    private static final long b;

    x(Pattern pattern0) {
        this.a = (Pattern)H.E(pattern0);
    }

    @Override  // com.google.common.base.h
    public int b() {
        return this.a.flags();
    }

    @Override  // com.google.common.base.h
    public g d(CharSequence charSequence0) {
        return new a(this.a.matcher(charSequence0));
    }

    @Override  // com.google.common.base.h
    public String e() {
        return this.a.pattern();
    }

    @Override  // com.google.common.base.h
    public String toString() {
        return this.a.toString();
    }
}

