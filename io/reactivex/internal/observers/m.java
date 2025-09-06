package io.reactivex.internal.observers;

import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;

public abstract class m extends l implements I {
    protected c j;
    private static final long k = 0xFC4E48E5F8D30E15L;

    public m(I i0) {
        super(i0);
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        if(d.i(this.j, c0)) {
            this.j = c0;
            this.b.b(this);
        }
    }

    @Override  // io.reactivex.internal.observers.l
    public void dispose() {
        super.dispose();
        this.j.dispose();
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        Object object0 = this.c;
        if(object0 != null) {
            this.c = null;
            this.d(object0);
            return;
        }
        this.c();
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        this.c = null;
        this.e(throwable0);
    }
}

