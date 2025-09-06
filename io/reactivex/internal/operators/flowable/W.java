package io.reactivex.internal.operators.flowable;

import e3.o;
import f3.l;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.internal.util.c;
import io.reactivex.internal.util.j;
import io.reactivex.q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class w extends a {
    static class io.reactivex.internal.operators.flowable.w.a {
        static final int[] a;

        static {
            int[] arr_v = new int[j.values().length];
            io.reactivex.internal.operators.flowable.w.a.a = arr_v;
            try {
                arr_v[j.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                io.reactivex.internal.operators.flowable.w.a.a[j.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static abstract class b extends AtomicInteger implements f, q, e {
        final io.reactivex.internal.operators.flowable.w.e a;
        final o b;
        final int c;
        final int d;
        e e;
        int f;
        f3.o g;
        volatile boolean h;
        volatile boolean i;
        final c j;
        volatile boolean k;
        int l;
        private static final long m = 0xCF4539C033FBCE45L;

        b(o o0, int v) {
            this.b = o0;
            this.c = v;
            this.d = v - (v >> 2);
            this.a = new io.reactivex.internal.operators.flowable.w.e(this);
            this.j = new c();
        }

        abstract void a();

        abstract void b();

        @Override  // io.reactivex.internal.operators.flowable.w$f
        public final void d() {
            this.k = false;
            this.a();
        }

        @Override  // io.reactivex.q
        public final void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.e, e0)) {
                this.e = e0;
                if(e0 instanceof l) {
                    int v = ((l)e0).i(7);
                    if(v == 1) {
                        this.l = 1;
                        this.g = (l)e0;
                        this.h = true;
                        this.b();
                        this.a();
                        return;
                    }
                    if(v == 2) {
                        this.l = 2;
                        this.g = (l)e0;
                        this.b();
                        e0.request(((long)this.c));
                        return;
                    }
                }
                this.g = new io.reactivex.internal.queue.b(this.c);
                this.b();
                e0.request(((long)this.c));
            }
        }

        @Override  // org.reactivestreams.d
        public final void onComplete() {
            this.h = true;
            this.a();
        }

        @Override  // org.reactivestreams.d
        public final void onNext(Object object0) {
            if(this.l != 2 && !this.g.offer(object0)) {
                this.e.cancel();
                this.onError(new IllegalStateException("Queue full?!"));
                return;
            }
            this.a();
        }
    }

    static final class io.reactivex.internal.operators.flowable.w.c extends b {
        final d n;
        final boolean o;
        private static final long p = -2945777694260521066L;

        io.reactivex.internal.operators.flowable.w.c(d d0, o o0, int v, boolean z) {
            super(o0, v);
            this.n = d0;
            this.o = z;
        }

        @Override  // io.reactivex.internal.operators.flowable.w$b
        void a() {
            Object object1;
            org.reactivestreams.c c0;
            Object object0;
            if(this.getAndIncrement() == 0) {
                while(true) {
                    if(this.i) {
                        return;
                    }
                    if(!this.k) {
                        boolean z = this.h;
                        if(z && !this.o && ((Throwable)this.j.get()) != null) {
                            Throwable throwable0 = this.j.c();
                            this.n.onError(throwable0);
                            return;
                        }
                        try {
                            object0 = this.g.poll();
                        }
                        catch(Throwable throwable1) {
                            io.reactivex.exceptions.b.b(throwable1);
                            this.e.cancel();
                            this.j.a(throwable1);
                            Throwable throwable2 = this.j.c();
                            this.n.onError(throwable2);
                            return;
                        }
                        if(z && object0 == null) {
                            Throwable throwable3 = this.j.c();
                            if(throwable3 != null) {
                                this.n.onError(throwable3);
                                return;
                            }
                            this.n.onComplete();
                            return;
                        }
                        if(object0 != null) {
                            try {
                                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null Publisher");
                            }
                            catch(Throwable throwable4) {
                                io.reactivex.exceptions.b.b(throwable4);
                                this.e.cancel();
                                this.j.a(throwable4);
                                Throwable throwable5 = this.j.c();
                                this.n.onError(throwable5);
                                return;
                            }
                            if(this.l != 1) {
                                int v = this.f + 1;
                                if(v == this.d) {
                                    this.f = 0;
                                    this.e.request(((long)v));
                                }
                                else {
                                    this.f = v;
                                }
                            }
                            if(c0 instanceof Callable) {
                                Callable callable0 = (Callable)c0;
                                try {
                                    object1 = callable0.call();
                                }
                                catch(Throwable throwable6) {
                                    io.reactivex.exceptions.b.b(throwable6);
                                    this.j.a(throwable6);
                                    if(!this.o) {
                                        this.e.cancel();
                                        Throwable throwable7 = this.j.c();
                                        this.n.onError(throwable7);
                                        return;
                                    }
                                    object1 = null;
                                }
                                if(object1 == null) {
                                    continue;
                                }
                                if(this.a.f()) {
                                    this.n.onNext(object1);
                                    continue;
                                }
                                else {
                                    this.k = true;
                                    g w$g0 = new g(object1, this.a);
                                    this.a.i(w$g0);
                                    goto label_65;
                                }
                                goto label_63;
                            }
                            else {
                            label_63:
                                this.k = true;
                                c0.e(this.a);
                            }
                        }
                    }
                label_65:
                    if(this.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.w$b
        void b() {
            this.n.g(this);
        }

        @Override  // io.reactivex.internal.operators.flowable.w$f
        public void c(Throwable throwable0) {
            if(this.j.a(throwable0)) {
                if(!this.o) {
                    this.e.cancel();
                    this.h = true;
                }
                this.k = false;
                this.a();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.i) {
                this.i = true;
                this.a.cancel();
                this.e.cancel();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.w$f
        public void e(Object object0) {
            this.n.onNext(object0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.j.a(throwable0)) {
                this.h = true;
                this.a();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.a.request(v);
        }
    }

    static final class io.reactivex.internal.operators.flowable.w.d extends b {
        final d n;
        final AtomicInteger o;
        private static final long p = 0x6D9EDE3055D54052L;

        io.reactivex.internal.operators.flowable.w.d(d d0, o o0, int v) {
            super(o0, v);
            this.n = d0;
            this.o = new AtomicInteger();
        }

        @Override  // io.reactivex.internal.operators.flowable.w$b
        void a() {
            Object object1;
            org.reactivestreams.c c0;
            Object object0;
            if(this.o.getAndIncrement() == 0) {
                while(true) {
                    if(this.i) {
                        return;
                    }
                    if(!this.k) {
                        try {
                            boolean z = this.h;
                            object0 = this.g.poll();
                        }
                        catch(Throwable throwable0) {
                            io.reactivex.exceptions.b.b(throwable0);
                            this.e.cancel();
                            this.j.a(throwable0);
                            Throwable throwable1 = this.j.c();
                            this.n.onError(throwable1);
                            return;
                        }
                        if(z && object0 == null) {
                            this.n.onComplete();
                            return;
                        }
                        if(object0 != null) {
                            try {
                                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null Publisher");
                            }
                            catch(Throwable throwable2) {
                                io.reactivex.exceptions.b.b(throwable2);
                                this.e.cancel();
                                this.j.a(throwable2);
                                Throwable throwable3 = this.j.c();
                                this.n.onError(throwable3);
                                return;
                            }
                            if(this.l != 1) {
                                int v = this.f + 1;
                                if(v == this.d) {
                                    this.f = 0;
                                    this.e.request(((long)v));
                                }
                                else {
                                    this.f = v;
                                }
                            }
                            if(c0 instanceof Callable) {
                                Callable callable0 = (Callable)c0;
                                try {
                                    object1 = callable0.call();
                                    if(object1 == null) {
                                        continue;
                                    }
                                }
                                catch(Throwable throwable4) {
                                    io.reactivex.exceptions.b.b(throwable4);
                                    this.e.cancel();
                                    this.j.a(throwable4);
                                    Throwable throwable5 = this.j.c();
                                    this.n.onError(throwable5);
                                    return;
                                }
                                if(this.a.f()) {
                                    if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                                        continue;
                                    }
                                    this.n.onNext(object1);
                                    if(this.compareAndSet(1, 0)) {
                                        continue;
                                    }
                                    Throwable throwable6 = this.j.c();
                                    this.n.onError(throwable6);
                                    return;
                                }
                                else {
                                    this.k = true;
                                    g w$g0 = new g(object1, this.a);
                                    this.a.i(w$g0);
                                    goto label_59;
                                }
                                goto label_57;
                            }
                            else {
                            label_57:
                                this.k = true;
                                c0.e(this.a);
                            }
                        }
                    }
                label_59:
                    if(this.o.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.w$b
        void b() {
            this.n.g(this);
        }

        @Override  // io.reactivex.internal.operators.flowable.w$f
        public void c(Throwable throwable0) {
            if(this.j.a(throwable0)) {
                this.e.cancel();
                if(this.getAndIncrement() == 0) {
                    Throwable throwable1 = this.j.c();
                    this.n.onError(throwable1);
                }
            }
            else {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.i) {
                this.i = true;
                this.a.cancel();
                this.e.cancel();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.w$f
        public void e(Object object0) {
            if(this.get() == 0 && this.compareAndSet(0, 1)) {
                this.n.onNext(object0);
                if(this.compareAndSet(1, 0)) {
                    return;
                }
                Throwable throwable0 = this.j.c();
                this.n.onError(throwable0);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.j.a(throwable0)) {
                this.a.cancel();
                if(this.getAndIncrement() == 0) {
                    Throwable throwable1 = this.j.c();
                    this.n.onError(throwable1);
                }
            }
            else {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.a.request(v);
        }
    }

    static final class io.reactivex.internal.operators.flowable.w.e extends i implements q {
        final f j;
        long k;
        private static final long l = 0xC75368D015D6D3DL;

        io.reactivex.internal.operators.flowable.w.e(f w$f0) {
            super(false);
            this.j = w$f0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            this.i(e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            long v = this.k;
            if(v != 0L) {
                this.k = 0L;
                this.h(v);
            }
            this.j.d();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            long v = this.k;
            if(v != 0L) {
                this.k = 0L;
                this.h(v);
            }
            this.j.c(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            ++this.k;
            this.j.e(object0);
        }
    }

    interface f {
        void c(Throwable arg1);

        void d();

        void e(Object arg1);
    }

    static final class g implements e {
        final d a;
        final Object b;
        boolean c;

        g(Object object0, d d0) {
            this.b = object0;
            this.a = d0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(v > 0L && !this.c) {
                this.c = true;
                this.a.onNext(this.b);
                this.a.onComplete();
            }
        }
    }

    final o c;
    final int d;
    final j e;

    public w(io.reactivex.l l0, o o0, int v, j j0) {
        super(l0);
        this.c = o0;
        this.d = v;
        this.e = j0;
    }

    public static d O8(d d0, o o0, int v, j j0) {
        switch(j0) {
            case 1: {
                return new io.reactivex.internal.operators.flowable.w.c(d0, o0, v, false);
            }
            case 2: {
                return new io.reactivex.internal.operators.flowable.w.c(d0, o0, v, true);
            }
            default: {
                return new io.reactivex.internal.operators.flowable.w.d(d0, o0, v);
            }
        }
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        if(m1.b(this.b, d0, this.c)) {
            return;
        }
        d d1 = w.O8(d0, this.c, this.d, this.e);
        this.b.e(d1);
    }
}

