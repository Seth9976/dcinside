package io.reactivex.internal.operators.flowable;

import d3.g;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import java.util.Iterator;

public final class k0 extends l {
    static abstract class a extends d {
        Iterator b;
        volatile boolean c;
        boolean d;
        private static final long e = -2252972430506210021L;

        a(Iterator iterator0) {
            this.b = iterator0;
        }

        abstract void a();

        abstract void b(long arg1);

        @Override  // org.reactivestreams.e
        public final void cancel() {
            this.c = true;
        }

        @Override  // f3.o
        public final void clear() {
            this.b = null;
        }

        @Override  // f3.k
        public final int i(int v) {
            return v & 1;
        }

        @Override  // f3.o
        public final boolean isEmpty() {
            return this.b == null || !this.b.hasNext();
        }

        @Override  // f3.o
        @g
        public final Object poll() {
            Iterator iterator0 = this.b;
            if(iterator0 == null) {
                return null;
            }
            if(!this.d) {
                this.d = true;
            }
            else if(!iterator0.hasNext()) {
                return null;
            }
            Object object0 = this.b.next();
            return b.g(object0, "Iterator.next() returned a null value");
        }

        @Override  // org.reactivestreams.e
        public final void request(long v) {
            if(j.j(v) && io.reactivex.internal.util.d.a(this, v) == 0L) {
                if(v == 0x7FFFFFFFFFFFFFFFL) {
                    this.a();
                    return;
                }
                this.b(v);
            }
        }
    }

    static final class io.reactivex.internal.operators.flowable.k0.b extends a {
        final f3.a f;
        private static final long g = 0xAC6AB341E79ABF01L;

        io.reactivex.internal.operators.flowable.k0.b(f3.a a0, Iterator iterator0) {
            super(iterator0);
            this.f = a0;
        }

        @Override  // io.reactivex.internal.operators.flowable.k0$a
        void a() {
            Object object0;
            Iterator iterator0 = this.b;
            f3.a a0 = this.f;
            while(true) {
                if(this.c) {
                    return;
                }
                try {
                    object0 = iterator0.next();
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    a0.onError(throwable0);
                    return;
                }
                if(this.c) {
                    return;
                }
                if(object0 == null) {
                    a0.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                a0.m(object0);
                if(this.c) {
                    return;
                }
                try {
                    if(iterator0.hasNext()) {
                        continue;
                    }
                    goto label_24;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            io.reactivex.exceptions.b.b(throwable1);
            a0.onError(throwable1);
            return;
        label_24:
            if(!this.c) {
                a0.onComplete();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.k0$a
        void b(long v) {
            Object object0;
            Iterator iterator0 = this.b;
            f3.a a0 = this.f;
            do {
                long v1 = 0L;
                while(true) {
                    if(v1 == v) {
                        long v2 = this.get();
                        if(v1 == v2) {
                            break;
                        }
                        v = v2;
                    }
                    else {
                        if(this.c) {
                            return;
                        }
                        try {
                            object0 = iterator0.next();
                        }
                        catch(Throwable throwable0) {
                            io.reactivex.exceptions.b.b(throwable0);
                            a0.onError(throwable0);
                            return;
                        }
                        if(this.c) {
                            return;
                        }
                        if(object0 == null) {
                            a0.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        boolean z = a0.m(object0);
                        if(this.c) {
                            return;
                        }
                        try {
                            if(!iterator0.hasNext()) {
                                goto label_26;
                            }
                            goto label_29;
                        }
                        catch(Throwable throwable1) {
                            io.reactivex.exceptions.b.b(throwable1);
                            a0.onError(throwable1);
                            return;
                        }
                    label_26:
                        if(!this.c) {
                            a0.onComplete();
                        }
                        return;
                    label_29:
                        if(!z) {
                            continue;
                        }
                        ++v1;
                    }
                }
                v = this.addAndGet(-v1);
            }
            while(v != 0L);
        }
    }

    static final class c extends a {
        final org.reactivestreams.d f;
        private static final long g = 0xAC6AB341E79ABF01L;

        c(org.reactivestreams.d d0, Iterator iterator0) {
            super(iterator0);
            this.f = d0;
        }

        @Override  // io.reactivex.internal.operators.flowable.k0$a
        void a() {
            Object object0;
            Iterator iterator0 = this.b;
            org.reactivestreams.d d0 = this.f;
            while(true) {
                if(this.c) {
                    return;
                }
                try {
                    object0 = iterator0.next();
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    d0.onError(throwable0);
                    return;
                }
                if(this.c) {
                    return;
                }
                if(object0 == null) {
                    d0.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                d0.onNext(object0);
                if(this.c) {
                    return;
                }
                try {
                    if(iterator0.hasNext()) {
                        continue;
                    }
                    goto label_24;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            io.reactivex.exceptions.b.b(throwable1);
            d0.onError(throwable1);
            return;
        label_24:
            if(!this.c) {
                d0.onComplete();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.k0$a
        void b(long v) {
            Object object0;
            Iterator iterator0 = this.b;
            org.reactivestreams.d d0 = this.f;
            do {
                long v1 = 0L;
                while(true) {
                    if(v1 == v) {
                        long v2 = this.get();
                        if(v1 == v2) {
                            break;
                        }
                        v = v2;
                    }
                    else {
                        if(this.c) {
                            return;
                        }
                        try {
                            object0 = iterator0.next();
                        }
                        catch(Throwable throwable0) {
                            io.reactivex.exceptions.b.b(throwable0);
                            d0.onError(throwable0);
                            return;
                        }
                        if(this.c) {
                            return;
                        }
                        if(object0 == null) {
                            d0.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        d0.onNext(object0);
                        if(this.c) {
                            return;
                        }
                        try {
                            if(!iterator0.hasNext()) {
                                goto label_26;
                            }
                            goto label_29;
                        }
                        catch(Throwable throwable1) {
                            io.reactivex.exceptions.b.b(throwable1);
                            d0.onError(throwable1);
                            return;
                        }
                    label_26:
                        if(!this.c) {
                            d0.onComplete();
                        }
                        return;
                    label_29:
                        ++v1;
                    }
                }
                v = this.addAndGet(-v1);
            }
            while(v != 0L);
        }
    }

    final Iterable b;

    public k0(Iterable iterable0) {
        this.b = iterable0;
    }

    public static void O8(org.reactivestreams.d d0, Iterator iterator0) {
        try {
            if(!iterator0.hasNext()) {
                goto label_6;
            }
            goto label_8;
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            io.reactivex.internal.subscriptions.g.b(throwable0, d0);
            return;
        }
    label_6:
        io.reactivex.internal.subscriptions.g.a(d0);
        return;
    label_8:
        if(d0 instanceof f3.a) {
            d0.g(new io.reactivex.internal.operators.flowable.k0.b(((f3.a)d0), iterator0));
            return;
        }
        d0.g(new c(d0, iterator0));
    }

    @Override  // io.reactivex.l
    public void m6(org.reactivestreams.d d0) {
        Iterator iterator0;
        try {
            iterator0 = this.b.iterator();
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            io.reactivex.internal.subscriptions.g.b(throwable0, d0);
            return;
        }
        k0.O8(d0, iterator0);
    }
}

