package com.facebook.cache.disk;

import com.facebook.cache.common.c;
import com.facebook.cache.common.e;
import java.io.IOException;
import k1.n.a;
import k1.n;
import k1.v;
import o3.h;

@n(a.a)
public class m implements c {
    @h
    private e a;
    @h
    private String b;
    private long c;
    private long d;
    private long e;
    @h
    private IOException f;
    @h
    private com.facebook.cache.common.d.a g;
    @h
    private m h;
    private static final Object i = null;
    private static final int j = 5;
    @h
    private static m k;
    private static int l;

    static {
        m.i = new Object();
    }

    @Override  // com.facebook.cache.common.c
    @h
    public e a() {
        return this.a;
    }

    @Override  // com.facebook.cache.common.c
    @h
    public IOException b() {
        return this.f;
    }

    @Override  // com.facebook.cache.common.c
    @h
    public String c() {
        return this.b;
    }

    @Override  // com.facebook.cache.common.c
    @h
    public com.facebook.cache.common.d.a d() {
        return this.g;
    }

    @Override  // com.facebook.cache.common.c
    public long e() {
        return this.c;
    }

    @Override  // com.facebook.cache.common.c
    public long f() {
        return this.e;
    }

    @Override  // com.facebook.cache.common.c
    public long g() {
        return this.d;
    }

    @v
    public static m h() {
        synchronized(m.i) {
            m m0 = m.k;
            if(m0 != null) {
                m.k = m0.h;
                m0.h = null;
                --m.l;
                return m0;
            }
        }
        return new m();
    }

    public void i() {
        synchronized(m.i) {
            if(m.l < 5) {
                this.j();
                ++m.l;
                m m0 = m.k;
                if(m0 != null) {
                    this.h = m0;
                }
                m.k = this;
            }
        }
    }

    private void j() {
        this.a = null;
        this.b = null;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = null;
        this.g = null;
    }

    public m k(e e0) {
        this.a = e0;
        return this;
    }

    public m l(long v) {
        this.d = v;
        return this;
    }

    public m m(long v) {
        this.e = v;
        return this;
    }

    public m n(com.facebook.cache.common.d.a d$a0) {
        this.g = d$a0;
        return this;
    }

    public m o(IOException iOException0) {
        this.f = iOException0;
        return this;
    }

    public m p(long v) {
        this.c = v;
        return this;
    }

    public m q(String s) {
        this.b = s;
        return this;
    }
}

