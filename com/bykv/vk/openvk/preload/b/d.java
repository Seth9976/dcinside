package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.b.a;
import java.util.concurrent.atomic.AtomicLong;

public abstract class d {
    d a;
    Object b;
    Object c;
    private static AtomicLong d;
    private a e;
    private b f;
    private long g;

    static {
        d.d = new AtomicLong();
    }

    public abstract Object a(b arg1, Object arg2) throws Throwable;

    final void a(b b0, d d0, Object object0, a a0, Object[] arr_object) {
        this.f = new m(b0);
        this.a = d0;
        this.b = object0;
        this.e = a0;
        if(d0 == null) {
            long v = d.d.getAndIncrement();
            this.g = v;
            if(v < 0L) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        else {
            this.g = d0.g;
        }
        this.a(arr_object);
    }

    protected void a(Object[] arr_object) {
    }

    public final long b() {
        return this.g;
    }

    final void b(Throwable throwable0) {
        a a0 = this.e;
        if(a0 == null) {
            return;
        }
        a0.a(this.f, this, throwable0);
    }

    final void c() {
        a a0 = this.e;
        if(a0 == null) {
            return;
        }
        a0.a(this.f, this);
    }

    final void c(Throwable throwable0) {
        a a0 = this.e;
        if(a0 == null) {
            return;
        }
        a0.b(this.f, this, throwable0);
    }

    final void d() {
        a a0 = this.e;
        if(a0 == null) {
            return;
        }
        a0.c(this.f, this);
    }

    protected final void d(Throwable throwable0) {
        a a0 = this.e;
        if(a0 == null) {
            return;
        }
        a0.c(this.f, this, throwable0);
    }

    final void e() {
        a a0 = this.e;
        if(a0 == null) {
            return;
        }
        a0.b(this.f, this);
    }

    public final Object f() {
        return this.c;
    }
}

