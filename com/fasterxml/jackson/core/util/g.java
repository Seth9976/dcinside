package com.fasterxml.jackson.core.util;

import j..util.concurrent.ConcurrentHashMap;

public final class g extends ConcurrentHashMap {
    private final Object a;
    private static final long b = 1L;
    private static final int c = 180;
    public static final g d;

    static {
        g.d = new g();
    }

    public g() {
        this(180, 0.8f, 4);
    }

    public g(int v, float f, int v1) {
        super(v, f, v1);
        this.a = new Object();
    }

    public String a(String s) {
        String s1 = (String)this.get(s);
        if(s1 != null) {
            return s1;
        }
        if(this.size() >= 180) {
            synchronized(this.a) {
                if(this.size() >= 180) {
                    this.clear();
                }
            }
        }
        String s2 = s.intern();
        this.put(s2, s2);
        return s2;
    }
}

