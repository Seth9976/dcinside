package io.reactivex.internal.queue;

import d3.g;
import f3.n;
import io.reactivex.internal.util.t;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class b extends AtomicReferenceArray implements n {
    final int a;
    final AtomicLong b;
    long c;
    final AtomicLong d;
    final int e;
    private static final long f = 0xEE018F45006504BFL;
    private static final Integer g;

    static {
        b.g = 0x1000;
    }

    public b(int v) {
        super(t.b(v));
        this.a = this.length() - 1;
        this.b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(v / 4, ((int)b.g));
    }

    int a(long v) {
        return this.a & ((int)v);
    }

    int b(long v, int v1) {
        return ((int)v) & v1;
    }

    Object c(int v) {
        return this.get(v);
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

    void d(long v) {
        this.d.lazySet(v);
    }

    void e(int v, Object object0) {
        this.lazySet(v, object0);
    }

    void f(long v) {
        this.b.lazySet(v);
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return this.b.get() == this.d.get();
    }

    // 去混淆评级： 低(20)
    @Override  // f3.o
    public boolean j(Object object0, Object object1) {
        return this.offer(object0) && this.offer(object1);
    }

    @Override  // f3.o
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int v = this.a;
        long v1 = this.b.get();
        int v2 = this.b(v1, v);
        if(v1 >= this.c) {
            long v3 = ((long)this.e) + v1;
            if(this.c(this.b(v3, v)) == null) {
                this.c = v3;
            }
            else if(this.c(v2) != null) {
                return false;
            }
        }
        this.e(v2, object0);
        this.f(v1 + 1L);
        return true;
    }

    @Override  // f3.n
    @g
    public Object poll() {
        long v = this.d.get();
        int v1 = this.a(v);
        Object object0 = this.c(v1);
        if(object0 == null) {
            return null;
        }
        this.d(v + 1L);
        this.e(v1, null);
        return object0;
    }
}

