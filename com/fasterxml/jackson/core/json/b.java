package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.n;
import java.util.HashSet;

public class b {
    protected final Object a;
    protected String b;
    protected String c;
    protected HashSet d;

    private b(Object object0) {
        this.a = object0;
    }

    public b a() {
        return new b(this.a);
    }

    // 去混淆评级： 低(20)
    public l b() {
        return this.a instanceof n ? ((n)this.a).b1() : null;
    }

    public Object c() {
        return this.a;
    }

    public boolean d(String s) throws m {
        String s1 = this.b;
        if(s1 == null) {
            this.b = s;
            return false;
        }
        if(s.equals(s1)) {
            return true;
        }
        String s2 = this.c;
        if(s2 == null) {
            this.c = s;
            return false;
        }
        if(s.equals(s2)) {
            return true;
        }
        if(this.d == null) {
            HashSet hashSet0 = new HashSet(16);
            this.d = hashSet0;
            hashSet0.add(this.b);
            this.d.add(this.c);
        }
        return !this.d.add(s);
    }

    public void e() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public static b f(k k0) {
        return new b(k0);
    }

    public static b g(n n0) {
        return new b(n0);
    }
}

