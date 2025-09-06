package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

final class w0 extends c {
    private final v0 j;

    w0(v0 v00, b b0, Spliterator spliterator0) {
        super(b0, spliterator0);
        this.j = v00;
    }

    w0(w0 w00, Spliterator spliterator0) {
        super(w00, spliterator0);
        this.j = w00.j;
    }

    @Override  // j$.util.stream.e
    protected final Object a() {
        t0 t00 = (t0)this.j.b.get();
        this.a.W(this.b, t00);
        boolean z = t00.b;
        if(z == this.j.a.b) {
            Boolean boolean0 = Boolean.valueOf(z);
            AtomicReference atomicReference0 = this.h;
            while(!atomicReference0.compareAndSet(null, boolean0) && atomicReference0.get() == null) {
            }
        }
        return null;
    }

    @Override  // j$.util.stream.e
    protected final e e(Spliterator spliterator0) {
        return new w0(this, spliterator0);
    }

    @Override  // j$.util.stream.c
    protected final Object j() {
        return Boolean.valueOf(!this.j.a.b);
    }
}

