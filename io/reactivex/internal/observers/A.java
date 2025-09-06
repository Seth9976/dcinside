package io.reactivex.internal.observers;

import f3.j;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;

public abstract class a implements j, I {
    protected final I a;
    protected c b;
    protected j c;
    protected boolean d;
    protected int e;

    public a(I i0) {
        this.a = i0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b.a();
    }

    @Override  // io.reactivex.I
    public final void b(c c0) {
        if(d.i(this.b, c0)) {
            this.b = c0;
            if(c0 instanceof j) {
                this.c = (j)c0;
            }
            this.a.b(this);
        }
    }

    protected void c() {
    }

    @Override  // f3.o
    public void clear() {
        this.c.clear();
    }

    protected boolean d() [...] // Inlined contents

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.b.dispose();
    }

    protected final void e(Throwable throwable0) {
        b.b(throwable0);
        this.b.dispose();
        this.onError(throwable0);
    }

    protected final int f(int v) {
        j j0 = this.c;
        if(j0 != null && (v & 4) == 0) {
            int v1 = j0.i(v);
            if(v1 != 0) {
                this.e = v1;
            }
            return v1;
        }
        return 0;
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override  // f3.o
    public final boolean j(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // f3.o
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        if(this.d) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        this.d = true;
        this.a.onError(throwable0);
    }
}

