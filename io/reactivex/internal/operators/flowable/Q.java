package io.reactivex.internal.operators.flowable;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscribers.n;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.v;
import io.reactivex.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class q extends a {
    static final class io.reactivex.internal.operators.flowable.q.a extends n implements c, Runnable, e {
        final Callable S8;
        final long T8;
        final TimeUnit U8;
        final int V8;
        final boolean W8;
        final io.reactivex.J.c X8;
        Collection Y8;
        c Z8;
        e a9;
        long b9;
        long c9;

        io.reactivex.internal.operators.flowable.q.a(d d0, Callable callable0, long v, TimeUnit timeUnit0, int v1, boolean z, io.reactivex.J.c j$c0) {
            super(d0, new io.reactivex.internal.queue.a());
            this.S8 = callable0;
            this.T8 = v;
            this.U8 = timeUnit0;
            this.V8 = v1;
            this.W8 = z;
            this.X8 = j$c0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.X8.a();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.P8) {
                this.P8 = true;
                this.dispose();
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            synchronized(this) {
                this.Y8 = null;
            }
            this.a9.cancel();
            this.X8.dispose();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            Collection collection0;
            if(!j.k(this.a9, e0)) {
                return;
            }
            try {
                this.a9 = e0;
                collection0 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.X8.dispose();
                e0.cancel();
                g.b(throwable0, this.N8);
                return;
            }
            this.Y8 = collection0;
            this.N8.g(this);
            this.Z8 = this.X8.e(this, this.T8, this.T8, this.U8);
            e0.request(0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // io.reactivex.internal.subscribers.n
        public boolean j(d d0, Object object0) {
            return this.p(d0, ((Collection)object0));
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            Collection collection0;
            synchronized(this) {
                collection0 = this.Y8;
                this.Y8 = null;
            }
            if(collection0 != null) {
                this.O8.offer(collection0);
                this.Q8 = true;
                if(this.h()) {
                    v.e(this.O8, this.N8, false, this, this);
                }
                this.X8.dispose();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            synchronized(this) {
                this.Y8 = null;
            }
            this.N8.onError(throwable0);
            this.X8.dispose();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Collection collection0;
            Collection collection1;
            synchronized(this) {
                collection0 = this.Y8;
                if(collection0 == null) {
                    return;
                }
                collection0.add(object0);
                if(collection0.size() < this.V8) {
                    return;
                }
                this.Y8 = null;
                ++this.b9;
            }
            if(this.W8) {
                this.Z8.dispose();
            }
            this.n(collection0, false, this);
            try {
                collection1 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.N8.onError(throwable0);
                return;
            }
            synchronized(this) {
                this.Y8 = collection1;
                ++this.c9;
            }
            if(this.W8) {
                this.Z8 = this.X8.e(this, this.T8, this.T8, this.U8);
            }
        }

        public boolean p(d d0, Collection collection0) {
            d0.onNext(collection0);
            return true;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.o(v);
        }

        @Override
        public void run() {
            Collection collection0;
            try {
                collection0 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.N8.onError(throwable0);
                return;
            }
            synchronized(this) {
                Collection collection1 = this.Y8;
                if(collection1 != null && this.b9 == this.c9) {
                    this.Y8 = collection0;
                    this.n(collection1, false, this);
                }
            }
        }
    }

    static final class io.reactivex.internal.operators.flowable.q.b extends n implements c, Runnable, e {
        final Callable S8;
        final long T8;
        final TimeUnit U8;
        final J V8;
        e W8;
        Collection X8;
        final AtomicReference Y8;

        io.reactivex.internal.operators.flowable.q.b(d d0, Callable callable0, long v, TimeUnit timeUnit0, J j0) {
            super(d0, new io.reactivex.internal.queue.a());
            this.Y8 = new AtomicReference();
            this.S8 = callable0;
            this.T8 = v;
            this.U8 = timeUnit0;
            this.V8 = j0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.Y8.get() == io.reactivex.internal.disposables.d.a;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.P8 = true;
            this.W8.cancel();
            io.reactivex.internal.disposables.d.b(this.Y8);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            Collection collection0;
            if(j.k(this.W8, e0)) {
                try {
                    this.W8 = e0;
                    collection0 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    g.b(throwable0, this.N8);
                    return;
                }
                this.X8 = collection0;
                this.N8.g(this);
                if(!this.P8) {
                    e0.request(0x7FFFFFFFFFFFFFFFL);
                    c c0 = this.V8.h(this, this.T8, this.T8, this.U8);
                    if(!androidx.compose.animation.core.d.a(this.Y8, null, c0)) {
                        c0.dispose();
                    }
                }
            }
        }

        @Override  // io.reactivex.internal.subscribers.n
        public boolean j(d d0, Object object0) {
            return this.p(d0, ((Collection)object0));
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            Collection collection0;
            io.reactivex.internal.disposables.d.b(this.Y8);
            synchronized(this) {
                collection0 = this.X8;
                if(collection0 == null) {
                    return;
                }
                this.X8 = null;
            }
            this.O8.offer(collection0);
            this.Q8 = true;
            if(this.h()) {
                v.e(this.O8, this.N8, false, null, this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            io.reactivex.internal.disposables.d.b(this.Y8);
            synchronized(this) {
                this.X8 = null;
            }
            this.N8.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            synchronized(this) {
                Collection collection0 = this.X8;
                if(collection0 != null) {
                    collection0.add(object0);
                }
            }
        }

        public boolean p(d d0, Collection collection0) {
            this.N8.onNext(collection0);
            return true;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.o(v);
        }

        @Override
        public void run() {
            Collection collection1;
            Collection collection0;
            try {
                collection0 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.N8.onError(throwable0);
                return;
            }
            synchronized(this) {
                collection1 = this.X8;
                if(collection1 == null) {
                    return;
                }
                this.X8 = collection0;
            }
            this.l(collection1, false, this);
        }
    }

    static final class io.reactivex.internal.operators.flowable.q.c extends n implements Runnable, e {
        final class io.reactivex.internal.operators.flowable.q.c.a implements Runnable {
            private final Collection a;
            final io.reactivex.internal.operators.flowable.q.c b;

            io.reactivex.internal.operators.flowable.q.c.a(Collection collection0) {
                this.a = collection0;
            }

            @Override
            public void run() {
                synchronized(io.reactivex.internal.operators.flowable.q.c.this) {
                    io.reactivex.internal.operators.flowable.q.c.this.X8.remove(this.a);
                }
                io.reactivex.internal.operators.flowable.q.c.this.n(this.a, false, io.reactivex.internal.operators.flowable.q.c.this.W8);
            }
        }

        final Callable S8;
        final long T8;
        final long U8;
        final TimeUnit V8;
        final io.reactivex.J.c W8;
        final List X8;
        e Y8;

        io.reactivex.internal.operators.flowable.q.c(d d0, Callable callable0, long v, long v1, TimeUnit timeUnit0, io.reactivex.J.c j$c0) {
            super(d0, new io.reactivex.internal.queue.a());
            this.S8 = callable0;
            this.T8 = v;
            this.U8 = v1;
            this.V8 = timeUnit0;
            this.W8 = j$c0;
            this.X8 = new LinkedList();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.P8 = true;
            this.Y8.cancel();
            this.W8.dispose();
            this.r();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            Collection collection0;
            if(!j.k(this.Y8, e0)) {
                return;
            }
            try {
                this.Y8 = e0;
                collection0 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.W8.dispose();
                e0.cancel();
                g.b(throwable0, this.N8);
                return;
            }
            this.X8.add(collection0);
            this.N8.g(this);
            e0.request(0x7FFFFFFFFFFFFFFFL);
            this.W8.e(this, this.U8, this.U8, this.V8);
            io.reactivex.internal.operators.flowable.q.c.a q$c$a0 = new io.reactivex.internal.operators.flowable.q.c.a(this, collection0);
            this.W8.d(q$c$a0, this.T8, this.V8);
        }

        @Override  // io.reactivex.internal.subscribers.n
        public boolean j(d d0, Object object0) {
            return this.p(d0, ((Collection)object0));
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            synchronized(this) {
                ArrayList arrayList0 = new ArrayList(this.X8);
                this.X8.clear();
            }
            for(Object object0: arrayList0) {
                this.O8.offer(((Collection)object0));
            }
            this.Q8 = true;
            if(this.h()) {
                v.e(this.O8, this.N8, false, this.W8, this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.Q8 = true;
            this.W8.dispose();
            this.r();
            this.N8.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            synchronized(this) {
                for(Object object1: this.X8) {
                    ((Collection)object1).add(object0);
                }
            }
        }

        public boolean p(d d0, Collection collection0) {
            d0.onNext(collection0);
            return true;
        }

        void r() {
            synchronized(this) {
                this.X8.clear();
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.o(v);
        }

        @Override
        public void run() {
            Collection collection0;
            if(this.P8) {
                return;
            }
            try {
                collection0 = (Collection)b.g(this.S8.call(), "The supplied buffer is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.N8.onError(throwable0);
                return;
            }
            synchronized(this) {
                if(this.P8) {
                    return;
                }
                this.X8.add(collection0);
            }
            io.reactivex.internal.operators.flowable.q.c.a q$c$a0 = new io.reactivex.internal.operators.flowable.q.c.a(this, collection0);
            this.W8.d(q$c$a0, this.T8, this.V8);
        }
    }

    final long c;
    final long d;
    final TimeUnit e;
    final J f;
    final Callable g;
    final int h;
    final boolean i;

    public q(l l0, long v, long v1, TimeUnit timeUnit0, J j0, Callable callable0, int v2, boolean z) {
        super(l0);
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
        this.f = j0;
        this.g = callable0;
        this.h = v2;
        this.i = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        if(this.c == this.d && this.h == 0x7FFFFFFF) {
            io.reactivex.internal.operators.flowable.q.b q$b0 = new io.reactivex.internal.operators.flowable.q.b(new io.reactivex.subscribers.e(d0), this.g, this.c, this.e, this.f);
            this.b.l6(q$b0);
            return;
        }
        io.reactivex.J.c j$c0 = this.f.d();
        if(this.c == this.d) {
            io.reactivex.internal.operators.flowable.q.a q$a0 = new io.reactivex.internal.operators.flowable.q.a(new io.reactivex.subscribers.e(d0), this.g, this.c, this.e, this.h, this.i, j$c0);
            this.b.l6(q$a0);
            return;
        }
        io.reactivex.internal.operators.flowable.q.c q$c0 = new io.reactivex.internal.operators.flowable.q.c(new io.reactivex.subscribers.e(d0), this.g, this.c, this.d, this.e, j$c0);
        this.b.l6(q$c0);
    }
}

