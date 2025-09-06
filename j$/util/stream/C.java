package j$.util.stream;

import j..util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

abstract class c extends e {
    protected final AtomicReference h;
    protected volatile boolean i;

    protected c(b b0, Spliterator spliterator0) {
        super(b0, spliterator0);
        this.h = new AtomicReference(null);
    }

    protected c(c c0, Spliterator spliterator0) {
        super(c0, spliterator0);
        this.h = c0.h;
    }

    @Override  // j$.util.stream.e
    public final Object c() {
        if(this.d()) {
            Object object0 = this.h.get();
            return object0 == null ? this.j() : object0;
        }
        return super.c();
    }

    @Override  // j$.util.stream.e
    public final void compute() {
        Spliterator spliterator0 = this.b;
        long v = spliterator0.estimateSize();
        long v1 = this.c;
        if(v1 == 0L) {
            v1 = e.g(v);
            this.c = v1;
        }
        AtomicReference atomicReference0 = this.h;
        int v2 = 0;
        c c0 = this;
        Object object0;
        while((object0 = atomicReference0.get()) == null) {
            boolean z = c0.i;
            if(!z) {
                for(CountedCompleter countedCompleter0 = c0.getCompleter(); !z && ((c)(((e)countedCompleter0))) != null; countedCompleter0 = ((c)(((e)countedCompleter0))).getCompleter()) {
                    z = ((c)(((e)countedCompleter0))).i;
                }
            }
            if(z) {
                object0 = c0.j();
                break;
            }
            if(v > v1) {
                Spliterator spliterator1 = spliterator0.trySplit();
                if(spliterator1 != null) {
                    c c1 = (c)c0.e(spliterator1);
                    c0.d = c1;
                    c c2 = (c)c0.e(spliterator0);
                    c0.e = c2;
                    c0.setPendingCount(1);
                    if(v2 == 0) {
                        c0 = c2;
                    }
                    else {
                        spliterator0 = spliterator1;
                        c0 = c1;
                        c1 = c2;
                    }
                    v2 ^= 1;
                    c1.fork();
                    v = spliterator0.estimateSize();
                    continue;
                }
            }
            object0 = c0.a();
            break;
        }
        c0.f(object0);
        c0.tryComplete();
    }

    @Override  // j$.util.stream.e
    protected final void f(Object object0) {
        if(!this.d()) {
            super.f(object0);
        }
        else if(object0 != null) {
            AtomicReference atomicReference0 = this.h;
            while(!atomicReference0.compareAndSet(null, object0) && atomicReference0.get() == null) {
            }
        }
    }

    @Override  // j$.util.stream.e
    public final Object getRawResult() {
        return this.c();
    }

    protected void h() {
        this.i = true;
    }

    protected final void i() {
        c c0 = (c)(((e)this.getCompleter()));
        c c1 = this;
        while(c0 != null) {
            if(c0.d == c1) {
                c c2 = (c)c0.e;
                if(!c2.i) {
                    c2.h();
                }
            }
            c1 = c0;
            c0 = (c)(((e)c0.getCompleter()));
        }
    }

    protected abstract Object j();
}

