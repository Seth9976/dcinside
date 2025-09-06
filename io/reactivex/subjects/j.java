package io.reactivex.subjects;

import d3.d;
import d3.f;
import d3.g;
import f3.o;
import io.reactivex.I;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.observers.b;
import io.reactivex.internal.queue.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends i {
    final class a extends b {
        final j b;
        private static final long c = 0x6E022E8B5B1C1E37L;

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return j.this.e;
        }

        @Override  // f3.o
        public void clear() {
            j.this.a.clear();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!j.this.e) {
                j.this.e = true;
                j.this.s8();
                j.this.b.lazySet(null);
                if(j.this.i.getAndIncrement() == 0) {
                    j.this.b.lazySet(null);
                    j j0 = j.this;
                    if(!j0.j) {
                        j0.a.clear();
                    }
                }
            }
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 2) != 0) {
                j.this.j = true;
                return 2;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return j.this.a.isEmpty();
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            return j.this.a.poll();
        }
    }

    final c a;
    final AtomicReference b;
    final AtomicReference c;
    final boolean d;
    volatile boolean e;
    volatile boolean f;
    Throwable g;
    final AtomicBoolean h;
    final b i;
    boolean j;

    j(int v, Runnable runnable0) {
        this(v, runnable0, true);
    }

    j(int v, Runnable runnable0, boolean z) {
        this.a = new c(io.reactivex.internal.functions.b.h(v, "capacityHint"));
        this.c = new AtomicReference(io.reactivex.internal.functions.b.g(runnable0, "onTerminate"));
        this.d = z;
        this.b = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new a(this);
    }

    j(int v, boolean z) {
        this.a = new c(io.reactivex.internal.functions.b.h(v, "capacityHint"));
        this.c = new AtomicReference();
        this.d = z;
        this.b = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new a(this);
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        if(!this.h.get() && this.h.compareAndSet(false, true)) {
            i0.b(this.i);
            this.b.lazySet(i0);
            if(this.e) {
                this.b.lazySet(null);
                return;
            }
            this.t8();
            return;
        }
        e.g(new IllegalStateException("Only a single observer allowed."), i0);
    }

    @Override  // io.reactivex.I
    public void b(io.reactivex.disposables.c c0) {
        if(this.f || this.e) {
            c0.dispose();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.subjects.i
    @g
    public Throwable i8() {
        return this.f ? this.g : null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean j8() {
        return this.f && this.g == null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean k8() {
        return this.b.get() != null;
    }

    @Override  // io.reactivex.subjects.i
    public boolean l8() {
        return this.f && this.g != null;
    }

    // 去混淆评级： 低(20)
    @d
    @f
    public static j n8() {
        return new j(0x80, true);
    }

    @d
    @f
    public static j o8(int v) {
        return new j(v, true);
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(!this.f && !this.e) {
            this.f = true;
            this.s8();
            this.t8();
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        io.reactivex.internal.functions.b.g(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.f && !this.e) {
            this.g = throwable0;
            this.f = true;
            this.s8();
            this.t8();
            return;
        }
        io.reactivex.plugins.a.Y(throwable0);
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        io.reactivex.internal.functions.b.g(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.f && !this.e) {
            this.a.offer(object0);
            this.t8();
        }
    }

    @d
    @f
    public static j p8(int v, Runnable runnable0) {
        return new j(v, runnable0, true);
    }

    @d
    @f
    public static j q8(int v, Runnable runnable0, boolean z) {
        return new j(v, runnable0, z);
    }

    // 去混淆评级： 低(20)
    @d
    @f
    public static j r8(boolean z) {
        return new j(0x80, z);
    }

    void s8() {
        Runnable runnable0 = (Runnable)this.c.get();
        if(runnable0 != null && androidx.compose.animation.core.d.a(this.c, runnable0, null)) {
            runnable0.run();
        }
    }

    void t8() {
        if(this.i.getAndIncrement() != 0) {
            return;
        }
        I i0 = (I)this.b.get();
        int v = 1;
        while(true) {
            if(i0 != null) {
                if(this.j) {
                    this.u8(i0);
                    return;
                }
                this.v8(i0);
                return;
            }
            v = this.i.addAndGet(-v);
            if(v == 0) {
                return;
            }
            i0 = (I)this.b.get();
        }
    }

    void u8(I i0) {
        c c0 = this.a;
        boolean z = this.d;
        int v = 1;
        do {
            if(this.e) {
                this.b.lazySet(null);
                return;
            }
            boolean z1 = this.f;
            if(!z && z1 && this.x8(c0, i0)) {
                return;
            }
            i0.onNext(null);
            if(z1) {
                this.w8(i0);
                return;
            }
            v = this.i.addAndGet(-v);
        }
        while(v != 0);
    }

    void v8(I i0) {
        c c0 = this.a;
        boolean z = this.d;
        boolean z1 = true;
        int v = 1;
        while(true) {
            if(this.e) {
                this.b.lazySet(null);
                c0.clear();
                return;
            }
            boolean z2 = this.f;
            Object object0 = this.a.poll();
            boolean z3 = object0 == null;
            if(z2) {
                if(!z && z1) {
                    if(this.x8(c0, i0)) {
                        return;
                    }
                    z1 = false;
                }
                if(z3) {
                    this.w8(i0);
                    return;
                }
            }
            if(z3) {
                v = this.i.addAndGet(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            i0.onNext(object0);
        }
    }

    void w8(I i0) {
        this.b.lazySet(null);
        Throwable throwable0 = this.g;
        if(throwable0 != null) {
            i0.onError(throwable0);
            return;
        }
        i0.onComplete();
    }

    boolean x8(o o0, I i0) {
        Throwable throwable0 = this.g;
        if(throwable0 != null) {
            this.b.lazySet(null);
            o0.clear();
            i0.onError(throwable0);
            return true;
        }
        return false;
    }
}

