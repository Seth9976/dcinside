package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m extends a {
    static final class io.reactivex.internal.operators.observable.m.a implements I, c {
        final I a;
        final int b;
        final Callable c;
        Collection d;
        int e;
        c f;

        io.reactivex.internal.operators.observable.m.a(I i0, int v, Callable callable0) {
            this.a = i0;
            this.b = v;
            this.c = callable0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.f.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.f, c0)) {
                this.f = c0;
                this.a.b(this);
            }
        }

        boolean c() {
            try {
                this.d = (Collection)b.g(this.c.call(), "Empty buffer supplied");
                return true;
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.d = null;
                c c0 = this.f;
                if(c0 == null) {
                    e.g(throwable0, this.a);
                    return false;
                }
                c0.dispose();
                this.a.onError(throwable0);
                return false;
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.f.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            Collection collection0 = this.d;
            if(collection0 != null) {
                this.d = null;
                if(!collection0.isEmpty()) {
                    this.a.onNext(collection0);
                }
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.d = null;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Collection collection0 = this.d;
            if(collection0 != null) {
                collection0.add(object0);
                int v = this.e + 1;
                this.e = v;
                if(v >= this.b) {
                    this.a.onNext(collection0);
                    this.e = 0;
                    this.c();
                }
            }
        }
    }

    static final class io.reactivex.internal.operators.observable.m.b extends AtomicBoolean implements I, c {
        final I a;
        final int b;
        final int c;
        final Callable d;
        c e;
        final ArrayDeque f;
        long g;
        private static final long h = 0x8DE0A1C32DAD5DEEL;

        io.reactivex.internal.operators.observable.m.b(I i0, int v, int v1, Callable callable0) {
            this.a = i0;
            this.b = v;
            this.c = v1;
            this.d = callable0;
            this.f = new ArrayDeque();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.e, c0)) {
                this.e = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.e.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            while(!this.f.isEmpty()) {
                Object object0 = this.f.poll();
                this.a.onNext(object0);
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.f.clear();
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Collection collection0;
            long v = this.g;
            this.g = v + 1L;
            if(v % ((long)this.c) == 0L) {
                try {
                    collection0 = (Collection)b.g(this.d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                }
                catch(Throwable throwable0) {
                    this.f.clear();
                    this.e.dispose();
                    this.a.onError(throwable0);
                    return;
                }
                this.f.offer(collection0);
            }
            Iterator iterator0 = this.f.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                Collection collection1 = (Collection)object1;
                collection1.add(object0);
                if(this.b <= collection1.size()) {
                    iterator0.remove();
                    this.a.onNext(collection1);
                }
            }
        }
    }

    final int b;
    final int c;
    final Callable d;

    public m(G g0, int v, int v1, Callable callable0) {
        super(g0);
        this.b = v;
        this.c = v1;
        this.d = callable0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        int v = this.b;
        if(this.c == v) {
            io.reactivex.internal.operators.observable.m.a m$a0 = new io.reactivex.internal.operators.observable.m.a(i0, v, this.d);
            if(m$a0.c()) {
                this.a.d(m$a0);
            }
        }
        else {
            io.reactivex.internal.operators.observable.m.b m$b0 = new io.reactivex.internal.operators.observable.m.b(i0, this.b, this.c, this.d);
            this.a.d(m$b0);
        }
    }
}

