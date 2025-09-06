package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b extends s {
    static final class a implements v {
        final v a;
        final AtomicBoolean b;
        final io.reactivex.disposables.b c;
        c d;

        a(v v0, io.reactivex.disposables.b b0, AtomicBoolean atomicBoolean0) {
            this.a = v0;
            this.c = b0;
            this.b = atomicBoolean0;
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            this.d = c0;
            this.c.d(c0);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            if(this.b.compareAndSet(false, true)) {
                this.c.c(this.d);
                this.c.dispose();
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            if(this.b.compareAndSet(false, true)) {
                this.c.c(this.d);
                this.c.dispose();
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            if(this.b.compareAndSet(false, true)) {
                this.c.c(this.d);
                this.c.dispose();
                this.a.onSuccess(object0);
            }
        }
    }

    private final y[] a;
    private final Iterable b;

    public b(y[] arr_y, Iterable iterable0) {
        this.a = arr_y;
        this.b = iterable0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        int v1;
        y[] arr_y = this.a;
        if(arr_y == null) {
            try {
                arr_y = new y[8];
                v1 = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((y)object0) == null) {
                        e.f(new NullPointerException("One of the sources is null"), v0);
                        return;
                    }
                    if(v1 == arr_y.length) {
                        y[] arr_y1 = new y[(v1 >> 2) + v1];
                        System.arraycopy(arr_y, 0, arr_y1, 0, v1);
                        arr_y = arr_y1;
                    }
                    arr_y[v1] = (y)object0;
                    ++v1;
                }
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            e.f(throwable0, v0);
            return;
        }
        else {
            v1 = arr_y.length;
        }
    label_22:
        io.reactivex.disposables.b b0 = new io.reactivex.disposables.b();
        v0.b(b0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        for(int v2 = 0; v2 < v1; ++v2) {
            y y0 = arr_y[v2];
            if(b0.a()) {
                return;
            }
            if(y0 == null) {
                b0.dispose();
                NullPointerException nullPointerException0 = new NullPointerException("One of the MaybeSources is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    v0.onError(nullPointerException0);
                    return;
                }
                io.reactivex.plugins.a.Y(nullPointerException0);
                return;
            }
            y0.a(new a(v0, b0, atomicBoolean0));
        }
        if(v1 == 0) {
            v0.onComplete();
        }
    }
}

