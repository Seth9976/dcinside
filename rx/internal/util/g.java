package rx.internal.util;

import androidx.compose.animation.core.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.functions.p;
import rx.o;

public final class g implements o {
    static final class a {
        final AtomicReferenceArray a;
        final AtomicReference b;

        a() {
            this.a = new AtomicReferenceArray(g.e);
            this.b = new AtomicReference();
        }

        a a() {
            if(this.b.get() != null) {
                return (a)this.b.get();
            }
            a g$a0 = new a();
            return d.a(this.b, null, g$a0) ? g$a0 : ((a)this.b.get());
        }
    }

    static class b {
        private final AtomicIntegerArray a;
        private final AtomicReference b;

        b() {
            this.a = new AtomicIntegerArray(g.e);
            this.b = new AtomicReference();
        }

        public int a(int v, int v1) {
            return this.a.getAndSet(v, v1);
        }

        b b() {
            if(this.b.get() != null) {
                return (b)this.b.get();
            }
            b g$b0 = new b();
            return d.a(this.b, null, g$b0) ? g$b0 : ((b)this.b.get());
        }

        public void c(int v, int v1) {
            this.a.set(v, v1);
        }
    }

    private final a a;
    private final b b;
    final AtomicInteger c;
    final AtomicInteger d;
    static final int e;

    static {
        int v = 8;
        String s = System.getProperty("rx.indexed-ring-buffer.size");
        if(s != null) {
            try {
                v = Integer.parseInt(s);
            }
            catch(NumberFormatException numberFormatException0) {
                System.err.println("Failed to set \'rx.indexed-ring-buffer.size\' with value " + s + " => " + numberFormatException0.getMessage());
            }
        }
        g.e = v;
    }

    g() {
        this.a = new a();
        this.b = new b();
        this.c = new AtomicInteger();
        this.d = new AtomicInteger();
    }

    public int a(Object object0) {
        int v = this.f();
        int v1 = g.e;
        if(v < v1) {
            this.a.a.set(v, object0);
            return v;
        }
        this.e(v).a.set(v % v1, object0);
        return v;
    }

    public int b(p p0) {
        return this.c(p0, 0);
    }

    public int c(p p0, int v) {
        int v1 = this.d(p0, v, this.c.get());
        if(v > 0 && v1 == this.c.get()) {
            return this.d(p0, 0, v);
        }
        return v1 == this.c.get() ? 0 : v1;
    }

    private int d(p p0, int v, int v1) {
        a g$a2;
        int v4;
        int v2 = this.c.get();
        a g$a0 = this.a;
        int v3 = g.e;
        if(v >= v3) {
            a g$a1 = this.e(v);
            v4 = v;
            v %= v3;
            g$a2 = g$a1;
        }
        else {
            g$a2 = g$a0;
            v4 = v;
        }
    alab1:
        while(g$a2 != null) {
            while(v < g.e) {
                if(v4 >= v2 || v4 >= v1) {
                    break alab1;
                }
                Object object0 = g$a2.a.get(v);
                if(object0 != null && !((Boolean)p0.b(object0)).booleanValue()) {
                    return v4;
                }
                ++v;
                ++v4;
            }
            g$a2 = (a)g$a2.b.get();
            v = 0;
        }
        return v4;
    }

    private a e(int v) {
        int v1 = g.e;
        if(v < v1) {
            return this.a;
        }
        a g$a0 = this.a;
        for(int v2 = 0; v2 < v / v1; ++v2) {
            g$a0 = g$a0.a();
        }
        return g$a0;
    }

    private int f() {
        int v2;
        synchronized(this) {
            int v1 = this.g();
            if(v1 >= 0) {
                v2 = v1 >= g.e ? this.h(v1).a(v1 % g.e, -1) : this.b.a(v1, -1);
                if(v2 == this.c.get()) {
                    this.c.getAndIncrement();
                }
            }
            else {
                v2 = this.c.getAndIncrement();
            }
            return v2;
        }
    }

    private int g() {
        synchronized(this) {
            int v1;
            while((v1 = this.d.get()) > 0) {
                if(this.d.compareAndSet(v1, v1 - 1)) {
                    return v1 - 1;
                }
            }
            return -1;
        }
    }

    private b h(int v) {
        int v1 = g.e;
        if(v < v1) {
            return this.b;
        }
        b g$b0 = this.b;
        for(int v2 = 0; v2 < v / v1; ++v2) {
            g$b0 = g$b0.b();
        }
        return g$b0;
    }

    public static g i() {
        return new g();
    }

    @Override  // rx.o
    public boolean j() {
        return false;
    }

    private void k(int v) {
        synchronized(this) {
            int v2 = this.d.getAndIncrement();
            int v3 = g.e;
            if(v2 < v3) {
                this.b.c(v2, v);
            }
            else {
                this.h(v2).c(v2 % v3, v);
            }
        }
    }

    @Override  // rx.o
    public void l() {
        this.m();
    }

    public void m() {
        int v = this.c.get();
        a g$a0 = this.a;
    alab1:
        while(g$a0 != null) {
            int v2 = 0;
            for(int v1 = 0; v2 < g.e; ++v1) {
                if(v1 >= v) {
                    break alab1;
                }
                g$a0.a.set(v2, null);
                ++v2;
            }
            g$a0 = (a)g$a0.b.get();
        }
        this.c.set(0);
        this.d.set(0);
    }

    public Object n(int v) {
        Object object0 = v >= g.e ? this.e(v).a.getAndSet(v % g.e, null) : this.a.a.getAndSet(v, null);
        this.k(v);
        return object0;
    }
}

