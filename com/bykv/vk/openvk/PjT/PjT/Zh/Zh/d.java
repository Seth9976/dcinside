package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import C.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

abstract class d implements k {
    protected volatile d.b a;
    protected final h.d b;
    protected final AtomicInteger c;
    protected final AtomicLong d;
    protected a e;
    protected volatile List f;
    protected volatile String g;
    protected volatile String h;
    protected volatile f i;
    protected volatile l j;
    protected volatile boolean k;
    public final long l;
    private final AtomicInteger m;
    private int n;
    private static final AtomicLong o;

    static {
        d.o = new AtomicLong();
    }

    public d(d.b d$b0, h.d h$d0) {
        this.c = new AtomicInteger();
        this.d = new AtomicLong();
        this.k = false;
        this.l = d.o.incrementAndGet();
        this.m = new AtomicInteger(0);
        this.n = -1;
        this.a = d$b0;
        this.b = h$d0;
    }

    protected void a() throws B.a {
        if(this.h()) {
            throw new B.a();
        }
    }

    static int b(d d0) {
        return d0.n;
    }

    protected c.c c(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.l.a l$a0, int v, int v1, String s) throws IOException {
        c.e c$e0 = c.d.a().b();
        c.b c$b0 = new c.b();
        HashMap hashMap0 = new HashMap();
        c$b0.b = l$a0.a;
        c$b0.a = 0;
        if("HEAD".equalsIgnoreCase(s)) {
            c$b0.a = 4;
        }
        List list0 = this.f;
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                c f$c0 = (c)object0;
                if(!"Range".equalsIgnoreCase(f$c0.a) && !"Connection".equalsIgnoreCase(f$c0.a) && !"Proxy-Connection".equalsIgnoreCase(f$c0.a) && !"Host".equalsIgnoreCase(f$c0.a)) {
                    hashMap0.put(f$c0.a, f$c0.b);
                }
            }
        }
        String s1 = com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.e(v, v1);
        if(s1 != null) {
            hashMap0.put("Range", s1);
        }
        if(com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.h) {
            hashMap0.put("Cache-Control", "no-cache");
        }
        i i0 = i.l();
        j j0 = j.g();
        boolean z = this.i == null;
        if((z ? i0.b() : j0.t()) != null || (z ? i0.m() : j0.n()) != null) {
            throw null;
        }
        c$b0.e = hashMap0;
        if(this.k) {
            this.k = false;
            return null;
        }
        return c$e0.a(c$b0);
    }

    public void d() {
        this.m.compareAndSet(0, 1);
    }

    protected void e(int v, int v1) {
        class com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.a implements Runnable {
            final d a;

            @Override
            public void run() {
            }
        }

        if(v > 0 && v1 >= 0 && (com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.i == 1 || com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c.i == 2 && this.j() == 1)) {
            int v2 = (int)(((float)v1) / ((float)v) * 100.0f);
            if(v2 > 100) {
                v2 = 100;
            }
            synchronized(this) {
                if(v2 <= this.n) {
                    return;
                }
                this.n = v2;
            }
            com.bykv.vk.openvk.PjT.PjT.Zh.ReZ.a.o(new com.bykv.vk.openvk.PjT.PjT.Zh.Zh.d.a(this));
        }
    }

    protected void f() {
        this.m.compareAndSet(0, 2);
    }

    protected boolean g() {
        return this.j() == 1;
    }

    public boolean h() {
        return this.m.get() == 1;
    }

    public boolean i() {
        return this.m.get() == 2;
    }

    protected int j() {
        if(this.i != null) {
            return this.i.c.a;
        }
        return this.a instanceof d.d ? 1 : 0;
    }
}

