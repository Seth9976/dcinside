package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.disposables.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a extends c {
    static final class io.reactivex.internal.operators.completable.a.a implements f {
        final AtomicBoolean a;
        final b b;
        final f c;
        io.reactivex.disposables.c d;

        io.reactivex.internal.operators.completable.a.a(AtomicBoolean atomicBoolean0, b b0, f f0) {
            this.a = atomicBoolean0;
            this.b = b0;
            this.c = f0;
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            this.d = c0;
            this.b.d(c0);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            if(this.a.compareAndSet(false, true)) {
                this.b.c(this.d);
                this.b.dispose();
                this.c.onComplete();
            }
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            if(this.a.compareAndSet(false, true)) {
                this.b.c(this.d);
                this.b.dispose();
                this.c.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }
    }

    private final i[] a;
    private final Iterable b;

    public a(i[] arr_i, Iterable iterable0) {
        this.a = arr_i;
        this.b = iterable0;
    }

    @Override  // io.reactivex.c
    public void J0(f f0) {
        int v;
        i[] arr_i = this.a;
        if(arr_i == null) {
            try {
                arr_i = new i[8];
                v = 0;
                Iterator iterator0 = this.b.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((i)object0) == null) {
                        e.e(new NullPointerException("One of the sources is null"), f0);
                        return;
                    }
                    if(v == arr_i.length) {
                        i[] arr_i1 = new i[(v >> 2) + v];
                        System.arraycopy(arr_i, 0, arr_i1, 0, v);
                        arr_i = arr_i1;
                    }
                    arr_i[v] = (i)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            e.e(throwable0, f0);
            return;
        }
        else {
            v = arr_i.length;
        }
    label_22:
        b b0 = new b();
        f0.b(b0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        for(int v1 = 0; v1 < v; ++v1) {
            i i0 = arr_i[v1];
            if(b0.a()) {
                return;
            }
            if(i0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("One of the sources is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    b0.dispose();
                    f0.onError(nullPointerException0);
                    return;
                }
                io.reactivex.plugins.a.Y(nullPointerException0);
                return;
            }
            i0.e(new io.reactivex.internal.operators.completable.a.a(atomicBoolean0, b0, f0));
        }
        if(v == 0) {
            f0.onComplete();
        }
    }
}

