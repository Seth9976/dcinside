package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class s implements Serializable {
    static final class a extends StringTokenizer {
        protected final String a;
        protected int b;
        protected String c;

        public a(String s) {
            super(s, "<,>", true);
            this.a = s;
        }

        public String a() {
            return this.a;
        }

        public String b() {
            return this.a.substring(this.b);
        }

        public void c(String s) {
            this.c = s;
        }

        @Override
        public boolean hasMoreTokens() {
            return this.c != null || super.hasMoreTokens();
        }

        @Override
        public String nextToken() {
            String s = this.c;
            if(s != null) {
                this.c = null;
                return s;
            }
            String s1 = super.nextToken();
            this.b += s1.length();
            return s1.trim();
        }
    }

    protected final q a;
    private static final long b = 1L;
    protected static final int c = 0xFA00;
    protected static final int d = 1000;

    public s(q q0) {
        this.a = q0;
    }

    protected IllegalArgumentException a(a s$a0, String s) {
        return new IllegalArgumentException(String.format("Failed to parse type %s (remaining: %s): %s", s.b(s$a0.a()), s.b(s$a0.b()), s));
    }

    private static String b(String s) {
        return s.length() > 1000 ? String.format("\'%s...\'[truncated %d charaters]", s.substring(0, 1000), ((int)(s.length() - 1000))) : "\'" + s + "\'";
    }

    protected Class c(String s, a s$a0) {
        try {
            return this.a.k0(s);
        }
        catch(Exception exception0) {
            h.x0(exception0);
            throw this.a(s$a0, "Cannot locate class \'" + s + "\', problem: " + exception0.getMessage());
        }
    }

    public m d(String s) throws IllegalArgumentException {
        if(s.length() > 0xFA00) {
            throw new IllegalArgumentException(String.format("Failed to parse type %s: too long (%d characters), maximum length allowed: %d", s.b(s), s.length(), 0xFA00));
        }
        a s$a0 = new a(s.trim());
        m m0 = this.e(s$a0, 1000);
        if(s$a0.hasMoreTokens()) {
            throw this.a(s$a0, "Unexpected tokens after complete type");
        }
        return m0;
    }

    protected m e(a s$a0, int v) throws IllegalArgumentException {
        if(!s$a0.hasMoreTokens()) {
            throw this.a(s$a0, "Unexpected end-of-string");
        }
        Class class0 = this.c(s$a0.nextToken(), s$a0);
        if(s$a0.hasMoreTokens()) {
            String s = s$a0.nextToken();
            if("<".equals(s)) {
                p p0 = p.d(class0, this.f(s$a0, v - 1));
                return this.a.i(null, class0, p0);
            }
            s$a0.c(s);
        }
        return this.a.i(null, class0, p.i());
    }

    protected List f(a s$a0, int v) throws IllegalArgumentException {
        if(v < 0) {
            throw this.a(s$a0, "too deeply nested; exceeds maximum of 1000 nesting levels");
        }
        List list0 = new ArrayList();
        while(s$a0.hasMoreTokens()) {
            ((ArrayList)list0).add(this.e(s$a0, v));
            if(!s$a0.hasMoreTokens()) {
                break;
            }
            String s = s$a0.nextToken();
            if(">".equals(s)) {
                return list0;
            }
            if(!",".equals(s)) {
                throw this.a(s$a0, "Unexpected token \'" + s + "\', expected \',\' or \'>\')");
            }
            if(false) {
                break;
            }
        }
        throw this.a(s$a0, "Unexpected end-of-string");
    }

    public s g(q q0) {
        return q0 == this.a ? this : new s(q0);
    }
}

