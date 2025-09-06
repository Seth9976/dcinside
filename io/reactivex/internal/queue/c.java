package io.reactivex.internal.queue;

import d3.g;
import f3.n;
import io.reactivex.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class c implements n {
    final AtomicLong a;
    int b;
    long c;
    final int d;
    AtomicReferenceArray e;
    final int f;
    AtomicReferenceArray g;
    final AtomicLong h;
    static final int i;
    private static final Object j;

    static {
        c.i = 0x1000;
        c.j = new Object();
    }

    public c(int v) {
        this.a = new AtomicLong();
        this.h = new AtomicLong();
        int v1 = t.b(Math.max(8, v));
        AtomicReferenceArray atomicReferenceArray0 = new AtomicReferenceArray(v1 + 1);
        this.e = atomicReferenceArray0;
        this.d = v1 - 1;
        this.a(v1);
        this.g = atomicReferenceArray0;
        this.f = v1 - 1;
        this.c = (long)(v1 - 2);
        this.v(0L);
    }

    private void a(int v) {
        this.b = Math.min(v / 4, c.i);
    }

    private static int b(int v) [...] // Inlined contents

    private static int c(long v, int v1) {
        return ((int)v) & v1;
    }

    @Override  // f3.o
    public void clear() {
        while(true) {
            if(this.poll() != null) {
            }
            else if(this.isEmpty()) {
                break;
            }
        }
    }

    private long d() {
        return this.h.get();
    }

    private long e() {
        return this.a.get();
    }

    private long f() {
        return this.h.get();
    }

    private static Object g(AtomicReferenceArray atomicReferenceArray0, int v) {
        return atomicReferenceArray0.get(v);
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return this.n() == this.f();
    }

    @Override  // f3.o
    public boolean j(Object object0, Object object1) {
        AtomicReferenceArray atomicReferenceArray0 = this.e;
        long v = this.n();
        int v1 = this.d;
        if(c.g(atomicReferenceArray0, c.c(v + 2L, v1)) == null) {
            int v2 = c.c(v, v1);
            c.t(atomicReferenceArray0, v2 + 1, object1);
            c.t(atomicReferenceArray0, v2, object0);
            this.v(v + 2L);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray1 = new AtomicReferenceArray(atomicReferenceArray0.length());
        this.e = atomicReferenceArray1;
        int v3 = c.c(v, v1);
        c.t(atomicReferenceArray1, v3 + 1, object1);
        c.t(atomicReferenceArray1, v3, object0);
        this.u(atomicReferenceArray0, atomicReferenceArray1);
        c.t(atomicReferenceArray0, v3, c.j);
        this.v(v + 2L);
        return true;
    }

    private AtomicReferenceArray m(AtomicReferenceArray atomicReferenceArray0, int v) {
        AtomicReferenceArray atomicReferenceArray1 = (AtomicReferenceArray)c.g(atomicReferenceArray0, v);
        c.t(atomicReferenceArray0, v, null);
        return atomicReferenceArray1;
    }

    private long n() {
        return this.a.get();
    }

    private Object o(AtomicReferenceArray atomicReferenceArray0, long v, int v1) {
        this.g = atomicReferenceArray0;
        return c.g(atomicReferenceArray0, c.c(v, v1));
    }

    @Override  // f3.o
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray0 = this.e;
        long v = this.e();
        int v1 = this.d;
        int v2 = c.c(v, v1);
        if(v < this.c) {
            return this.w(atomicReferenceArray0, object0, v, v2);
        }
        long v3 = ((long)this.b) + v;
        if(c.g(atomicReferenceArray0, c.c(v3, v1)) == null) {
            this.c = v3 - 1L;
            return this.w(atomicReferenceArray0, object0, v, v2);
        }
        if(c.g(atomicReferenceArray0, c.c(v + 1L, v1)) == null) {
            return this.w(atomicReferenceArray0, object0, v, v2);
        }
        this.q(atomicReferenceArray0, v, v2, object0, ((long)v1));
        return true;
    }

    private Object p(AtomicReferenceArray atomicReferenceArray0, long v, int v1) {
        this.g = atomicReferenceArray0;
        int v2 = c.c(v, v1);
        Object object0 = c.g(atomicReferenceArray0, v2);
        if(object0 != null) {
            c.t(atomicReferenceArray0, v2, null);
            this.s(v + 1L);
        }
        return object0;
    }

    public Object peek() {
        AtomicReferenceArray atomicReferenceArray0 = this.g;
        long v = this.d();
        Object object0 = c.g(atomicReferenceArray0, c.c(v, this.f));
        return object0 == c.j ? this.o(this.m(atomicReferenceArray0, this.f + 1), v, this.f) : object0;
    }

    @Override  // f3.n
    @g
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray0 = this.g;
        long v = this.d();
        int v1 = this.f;
        int v2 = c.c(v, v1);
        Object object0 = c.g(atomicReferenceArray0, v2);
        boolean z = object0 == c.j;
        if(object0 != null && !z) {
            c.t(atomicReferenceArray0, v2, null);
            this.s(v + 1L);
            return object0;
        }
        return z ? this.p(this.m(atomicReferenceArray0, v1 + 1), v, v1) : null;
    }

    private void q(AtomicReferenceArray atomicReferenceArray0, long v, int v1, Object object0, long v2) {
        AtomicReferenceArray atomicReferenceArray1 = new AtomicReferenceArray(atomicReferenceArray0.length());
        this.e = atomicReferenceArray1;
        this.c = v2 + v - 1L;
        c.t(atomicReferenceArray1, v1, object0);
        this.u(atomicReferenceArray0, atomicReferenceArray1);
        c.t(atomicReferenceArray0, v1, c.j);
        this.v(v + 1L);
    }

    public int r() {
        long v2;
        long v1;
        for(long v = this.f(); true; v = v2) {
            v1 = this.n();
            v2 = this.f();
            if(v == v2) {
                break;
            }
        }
        return (int)(v1 - v2);
    }

    private void s(long v) {
        this.h.lazySet(v);
    }

    private static void t(AtomicReferenceArray atomicReferenceArray0, int v, Object object0) {
        atomicReferenceArray0.lazySet(v, object0);
    }

    private void u(AtomicReferenceArray atomicReferenceArray0, AtomicReferenceArray atomicReferenceArray1) {
        c.t(atomicReferenceArray0, c.b(atomicReferenceArray0.length() - 1), atomicReferenceArray1);
    }

    private void v(long v) {
        this.a.lazySet(v);
    }

    private boolean w(AtomicReferenceArray atomicReferenceArray0, Object object0, long v, int v1) {
        c.t(atomicReferenceArray0, v1, object0);
        this.v(v + 1L);
        return true;
    }
}

