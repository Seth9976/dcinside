package io.reactivex.internal.queue;

import d3.g;
import f3.n;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements n {
    static final class io.reactivex.internal.queue.a.a extends AtomicReference {
        private Object a;
        private static final long b = 2404266111789071508L;

        io.reactivex.internal.queue.a.a() {
        }

        io.reactivex.internal.queue.a.a(Object object0) {
            this.e(object0);
        }

        public Object a() {
            this.e(null);
            return this.b();
        }

        public Object b() {
            return this.a;
        }

        public io.reactivex.internal.queue.a.a c() {
            return (io.reactivex.internal.queue.a.a)this.get();
        }

        public void d(io.reactivex.internal.queue.a.a a$a0) {
            this.lazySet(a$a0);
        }

        public void e(Object object0) {
            this.a = object0;
        }
    }

    private final AtomicReference a;
    private final AtomicReference b;

    public a() {
        this.a = new AtomicReference();
        this.b = new AtomicReference();
        io.reactivex.internal.queue.a.a a$a0 = new io.reactivex.internal.queue.a.a();
        this.d(a$a0);
        this.e(a$a0);
    }

    io.reactivex.internal.queue.a.a a() {
        return (io.reactivex.internal.queue.a.a)this.b.get();
    }

    io.reactivex.internal.queue.a.a b() {
        return (io.reactivex.internal.queue.a.a)this.b.get();
    }

    io.reactivex.internal.queue.a.a c() {
        return (io.reactivex.internal.queue.a.a)this.a.get();
    }

    @Override  // f3.o
    public void clear() {
        while(this.poll() != null && !this.isEmpty()) {
        }
    }

    void d(io.reactivex.internal.queue.a.a a$a0) {
        this.b.lazySet(a$a0);
    }

    io.reactivex.internal.queue.a.a e(io.reactivex.internal.queue.a.a a$a0) {
        return (io.reactivex.internal.queue.a.a)this.a.getAndSet(a$a0);
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return this.b() == this.c();
    }

    @Override  // f3.o
    public boolean j(Object object0, Object object1) {
        this.offer(object0);
        this.offer(object1);
        return true;
    }

    @Override  // f3.o
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        io.reactivex.internal.queue.a.a a$a0 = new io.reactivex.internal.queue.a.a(object0);
        this.e(a$a0).d(a$a0);
        return true;
    }

    @Override  // f3.n
    @g
    public Object poll() {
        io.reactivex.internal.queue.a.a a$a2;
        io.reactivex.internal.queue.a.a a$a0 = this.a();
        io.reactivex.internal.queue.a.a a$a1 = a$a0.c();
        if(a$a1 != null) {
            Object object0 = a$a1.a();
            this.d(a$a1);
            return object0;
        }
        if(a$a0 != this.c()) {
            do {
                a$a2 = a$a0.c();
            }
            while(a$a2 == null);
            Object object1 = a$a2.a();
            this.d(a$a2);
            return object1;
        }
        return null;
    }
}

