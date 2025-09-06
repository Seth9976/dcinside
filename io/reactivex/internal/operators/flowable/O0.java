package io.reactivex.internal.operators.flowable;

import e3.g;
import e3.o;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.h;
import io.reactivex.l;
import io.reactivex.q;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class o0 extends a {
    static final class io.reactivex.internal.operators.flowable.o0.a implements g {
        final Queue a;

        io.reactivex.internal.operators.flowable.o0.a(Queue queue0) {
            this.a = queue0;
        }

        public void a(c o0$c0) {
            this.a.offer(o0$c0);
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((c)object0));
        }
    }

    public static final class b extends io.reactivex.internal.subscriptions.c implements q {
        final d b;
        final o c;
        final o d;
        final int e;
        final boolean f;
        final Map g;
        final io.reactivex.internal.queue.c h;
        final Queue i;
        e j;
        final AtomicBoolean k;
        final AtomicLong l;
        final AtomicInteger m;
        Throwable n;
        volatile boolean o;
        boolean p;
        boolean q;
        private static final long r = 0xCCD08E47B9F8DD32L;
        static final Object s;

        static {
            b.s = new Object();
        }

        public b(d d0, o o0, o o1, int v, boolean z, Map map0, Queue queue0) {
            this.k = new AtomicBoolean();
            this.l = new AtomicLong();
            this.m = new AtomicInteger(1);
            this.b = d0;
            this.c = o0;
            this.d = o1;
            this.e = v;
            this.f = z;
            this.g = map0;
            this.i = queue0;
            this.h = new io.reactivex.internal.queue.c(v);
        }

        public void a(Object object0) {
            if(object0 == null) {
                object0 = b.s;
            }
            this.g.remove(object0);
            if(this.m.decrementAndGet() == 0) {
                this.j.cancel();
                if(!this.q && this.getAndIncrement() == 0) {
                    this.h.clear();
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.k.compareAndSet(false, true)) {
                this.n();
                if(this.m.decrementAndGet() == 0) {
                    this.j.cancel();
                }
            }
        }

        @Override  // f3.o
        public void clear() {
            this.h.clear();
        }

        void d() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            if(this.q) {
                this.o();
                return;
            }
            this.p();
        }

        boolean f(boolean z, boolean z1, d d0, io.reactivex.internal.queue.c c0) {
            if(this.k.get()) {
                c0.clear();
                return true;
            }
            if(this.f) {
                if(z && z1) {
                    Throwable throwable0 = this.n;
                    if(throwable0 != null) {
                        d0.onError(throwable0);
                        return true;
                    }
                    d0.onComplete();
                    return true;
                }
            }
            else if(z) {
                Throwable throwable1 = this.n;
                if(throwable1 != null) {
                    c0.clear();
                    d0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    d0.onComplete();
                    return true;
                }
            }
            return false;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.j, e0)) {
                this.j = e0;
                this.b.g(this);
                e0.request(((long)this.e));
            }
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 2) != 0) {
                this.q = true;
                return 2;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.h.isEmpty();
        }

        private void n() {
            if(this.i != null) {
                int v = 0;
                c o0$c0;
                while((o0$c0 = (c)this.i.poll()) != null) {
                    o0$c0.onComplete();
                    ++v;
                }
                if(v != 0) {
                    this.m.addAndGet(-v);
                }
            }
        }

        void o() {
            io.reactivex.internal.queue.c c0 = this.h;
            d d0 = this.b;
            int v = 1;
            do {
                if(this.k.get()) {
                    return;
                }
                boolean z = this.o;
                if(z && !this.f) {
                    Throwable throwable0 = this.n;
                    if(throwable0 != null) {
                        c0.clear();
                        d0.onError(throwable0);
                        return;
                    }
                }
                d0.onNext(null);
                if(z) {
                    Throwable throwable1 = this.n;
                    if(throwable1 != null) {
                        d0.onError(throwable1);
                        return;
                    }
                    d0.onComplete();
                    return;
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.p) {
                for(Object object0: this.g.values()) {
                    ((c)object0).onComplete();
                }
                this.g.clear();
                Queue queue0 = this.i;
                if(queue0 != null) {
                    queue0.clear();
                }
                this.p = true;
                this.o = true;
                this.d();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.p) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.p = true;
            for(Object object0: this.g.values()) {
                ((c)object0).onError(throwable0);
            }
            this.g.clear();
            Queue queue0 = this.i;
            if(queue0 != null) {
                queue0.clear();
            }
            this.n = throwable0;
            this.o = true;
            this.d();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object3;
            boolean z;
            Object object1;
            io.reactivex.internal.queue.c c0;
            if(this.p) {
                return;
            }
            try {
                c0 = this.h;
                object1 = this.c.apply(object0);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.j.cancel();
                this.onError(throwable0);
                return;
            }
            Object object2 = object1 == null ? b.s : object1;
            c o0$c0 = (c)this.g.get(object2);
            if(o0$c0 == null) {
                if(this.k.get()) {
                    return;
                }
                o0$c0 = c.P8(object1, this.e, this, this.f);
                this.g.put(object2, o0$c0);
                this.m.getAndIncrement();
                z = true;
            }
            else {
                z = false;
            }
            try {
                object3 = io.reactivex.internal.functions.b.g(this.d.apply(object0), "The valueSelector returned null");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                this.j.cancel();
                this.onError(throwable1);
                return;
            }
            o0$c0.onNext(object3);
            this.n();
            if(z) {
                c0.offer(o0$c0);
                this.d();
            }
        }

        void p() {
            io.reactivex.internal.queue.c c0 = this.h;
            d d0 = this.b;
            int v = 1;
            do {
                long v1 = this.l.get();
                long v2 = 0L;
                int v3;
                while((v3 = Long.compare(v2, v1)) != 0) {
                    boolean z = this.o;
                    io.reactivex.flowables.b b0 = (io.reactivex.flowables.b)c0.poll();
                    if(this.f(z, b0 == null, d0, c0)) {
                        return;
                    }
                    if(b0 == null) {
                        break;
                    }
                    d0.onNext(b0);
                    ++v2;
                }
                if(v3 == 0 && this.f(this.o, c0.isEmpty(), d0, c0)) {
                    return;
                }
                if(v2 != 0L) {
                    if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                        this.l.addAndGet(-v2);
                    }
                    this.j.request(v2);
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        @Override  // f3.o
        @d3.g
        public Object poll() throws Exception {
            return this.q();
        }

        @d3.g
        public io.reactivex.flowables.b q() {
            return (io.reactivex.flowables.b)this.h.poll();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.l, v);
                this.d();
            }
        }
    }

    static final class c extends io.reactivex.flowables.b {
        final io.reactivex.internal.operators.flowable.o0.d c;

        protected c(Object object0, io.reactivex.internal.operators.flowable.o0.d o0$d0) {
            super(object0);
            this.c = o0$d0;
        }

        public static c P8(Object object0, int v, b o0$b0, boolean z) {
            return new c(object0, new io.reactivex.internal.operators.flowable.o0.d(v, o0$b0, object0, z));
        }

        @Override  // io.reactivex.l
        protected void m6(d d0) {
            this.c.e(d0);
        }

        public void onComplete() {
            this.c.onComplete();
        }

        public void onError(Throwable throwable0) {
            this.c.onError(throwable0);
        }

        public void onNext(Object object0) {
            this.c.onNext(object0);
        }
    }

    static final class io.reactivex.internal.operators.flowable.o0.d extends io.reactivex.internal.subscriptions.c implements org.reactivestreams.c {
        final Object b;
        final io.reactivex.internal.queue.c c;
        final b d;
        final boolean e;
        final AtomicLong f;
        volatile boolean g;
        Throwable h;
        final AtomicBoolean i;
        final AtomicReference j;
        final AtomicBoolean k;
        boolean l;
        int m;
        private static final long n = -3852313036005250360L;

        io.reactivex.internal.operators.flowable.o0.d(int v, b o0$b0, Object object0, boolean z) {
            this.f = new AtomicLong();
            this.i = new AtomicBoolean();
            this.j = new AtomicReference();
            this.k = new AtomicBoolean();
            this.c = new io.reactivex.internal.queue.c(v);
            this.d = o0$b0;
            this.b = object0;
            this.e = z;
        }

        boolean a(boolean z, boolean z1, d d0, boolean z2) {
            if(this.i.get()) {
                this.c.clear();
                return true;
            }
            if(z) {
                if(!z2) {
                    Throwable throwable1 = this.h;
                    if(throwable1 != null) {
                        this.c.clear();
                        d0.onError(throwable1);
                        return true;
                    }
                    if(z1) {
                        d0.onComplete();
                        return true;
                    }
                }
                else if(z1) {
                    Throwable throwable0 = this.h;
                    if(throwable0 != null) {
                        d0.onError(throwable0);
                        return true;
                    }
                    d0.onComplete();
                    return true;
                }
            }
            return false;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.i.compareAndSet(false, true)) {
                this.d.a(this.b);
            }
        }

        @Override  // f3.o
        public void clear() {
            this.c.clear();
        }

        void d() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            if(this.l) {
                this.f();
                return;
            }
            this.n();
        }

        @Override  // org.reactivestreams.c
        public void e(d d0) {
            if(this.k.compareAndSet(false, true)) {
                d0.g(this);
                this.j.lazySet(d0);
                this.d();
                return;
            }
            io.reactivex.internal.subscriptions.g.b(new IllegalStateException("Only one Subscriber allowed!"), d0);
        }

        void f() {
            io.reactivex.internal.queue.c c0 = this.c;
            d d0 = (d)this.j.get();
            int v = 1;
            while(true) {
                if(d0 != null) {
                    if(this.i.get()) {
                        c0.clear();
                        return;
                    }
                    boolean z = this.g;
                    if(z && !this.e) {
                        Throwable throwable0 = this.h;
                        if(throwable0 != null) {
                            c0.clear();
                            d0.onError(throwable0);
                            return;
                        }
                    }
                    d0.onNext(null);
                    if(z) {
                        Throwable throwable1 = this.h;
                        if(throwable1 != null) {
                            d0.onError(throwable1);
                            return;
                        }
                        d0.onComplete();
                        return;
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    return;
                }
                if(d0 == null) {
                    d0 = (d)this.j.get();
                }
            }
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 2) != 0) {
                this.l = true;
                return 2;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.c.isEmpty();
        }

        void n() {
            io.reactivex.internal.queue.c c0 = this.c;
            boolean z = this.e;
            d d0 = (d)this.j.get();
            int v = 1;
            while(true) {
                if(d0 != null) {
                    long v1 = this.f.get();
                    long v2 = 0L;
                    int v3;
                    while((v3 = Long.compare(v2, v1)) != 0) {
                        boolean z1 = this.g;
                        Object object0 = c0.poll();
                        if(this.a(z1, object0 == null, d0, z)) {
                            return;
                        }
                        if(object0 == null) {
                            break;
                        }
                        d0.onNext(object0);
                        ++v2;
                    }
                    if(v3 == 0 && this.a(this.g, c0.isEmpty(), d0, z)) {
                        return;
                    }
                    if(v2 != 0L) {
                        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                            this.f.addAndGet(-v2);
                        }
                        this.d.j.request(v2);
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    return;
                }
                if(d0 == null) {
                    d0 = (d)this.j.get();
                }
            }
        }

        public void onComplete() {
            this.g = true;
            this.d();
        }

        public void onError(Throwable throwable0) {
            this.h = throwable0;
            this.g = true;
            this.d();
        }

        public void onNext(Object object0) {
            this.c.offer(object0);
            this.d();
        }

        @Override  // f3.o
        @d3.g
        public Object poll() {
            Object object0 = this.c.poll();
            if(object0 != null) {
                ++this.m;
                return object0;
            }
            int v = this.m;
            if(v != 0) {
                this.m = 0;
                this.d.j.request(((long)v));
            }
            return null;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.f, v);
                this.d();
            }
        }
    }

    final o c;
    final o d;
    final int e;
    final boolean f;
    final o g;

    public o0(l l0, o o0, o o1, int v, boolean z, o o2) {
        super(l0);
        this.c = o0;
        this.d = o1;
        this.e = v;
        this.f = z;
        this.g = o2;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        ConcurrentLinkedQueue concurrentLinkedQueue0;
        Map map0;
        try {
            if(this.g == null) {
                map0 = new ConcurrentHashMap();
                concurrentLinkedQueue0 = null;
            }
            else {
                concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
                io.reactivex.internal.operators.flowable.o0.a o0$a0 = new io.reactivex.internal.operators.flowable.o0.a(concurrentLinkedQueue0);
                map0 = (Map)this.g.apply(o0$a0);
            }
        }
        catch(Exception exception0) {
            io.reactivex.exceptions.b.b(exception0);
            d0.g(h.a);
            d0.onError(exception0);
            return;
        }
        b o0$b0 = new b(d0, this.c, this.d, this.e, this.f, map0, concurrentLinkedQueue0);
        this.b.l6(o0$b0);
    }
}

