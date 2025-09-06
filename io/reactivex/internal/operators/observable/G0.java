package io.reactivex.internal.operators.observable;

import d3.g;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.c;
import java.util.Iterator;

public final class g0 extends B {
    static final class a extends c {
        final I a;
        final Iterator b;
        volatile boolean c;
        boolean d;
        boolean e;
        boolean f;

        a(I i0, Iterator iterator0) {
            this.a = i0;
            this.b = iterator0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c;
        }

        void c() {
            Object object1;
            while(true) {
                if(this.a()) {
                    return;
                }
                try {
                    Object object0 = this.b.next();
                    object1 = b.g(object0, "The iterator returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.a.onError(throwable0);
                    return;
                }
                this.a.onNext(object1);
                if(this.a()) {
                    return;
                }
                try {
                    if(this.b.hasNext()) {
                        continue;
                    }
                    goto label_18;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            io.reactivex.exceptions.b.b(throwable1);
            this.a.onError(throwable1);
            return;
        label_18:
            if(!this.a()) {
                this.a.onComplete();
            }
        }

        @Override  // f3.o
        public void clear() {
            this.e = true;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c = true;
        }

        @Override  // f3.k
        public int i(int v) {
            if((v & 1) != 0) {
                this.d = true;
                return 1;
            }
            return 0;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return this.e;
        }

        @Override  // f3.o
        @g
        public Object poll() {
            if(this.e) {
                return null;
            }
            if(!this.f) {
                this.f = true;
            }
            else if(!this.b.hasNext()) {
                this.e = true;
                return null;
            }
            Object object0 = this.b.next();
            return b.g(object0, "The iterator returned a null value");
        }
    }

    final Iterable a;

    public g0(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        Iterator iterator0;
        try {
            iterator0 = this.a.iterator();
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            e.g(throwable0, i0);
            return;
        }
        try {
            if(!iterator0.hasNext()) {
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable1) {
            io.reactivex.exceptions.b.b(throwable1);
            e.g(throwable1, i0);
            return;
        }
    label_12:
        e.d(i0);
        return;
    label_14:
        a g0$a0 = new a(i0, iterator0);
        i0.b(g0$a0);
        if(!g0$a0.d) {
            g0$a0.c();
        }
    }
}

