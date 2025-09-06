package F4;

import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import rx.subscriptions.f;

public final class b extends AtomicReference implements o {
    private static final long a = 0xDCFADB4B3205D9DL;

    public b() {
    }

    public b(o o0) {
        this.lazySet(o0);
    }

    public o a() {
        o o0 = (o)super.get();
        return o0 == c.a ? f.e() : o0;
    }

    public boolean b(o o0) {
        do {
            o o1 = (o)this.get();
            if(o1 == c.a) {
                if(o0 != null) {
                    o0.l();
                }
                return false;
            }
        }
        while(!this.compareAndSet(o1, o0));
        return true;
    }

    public boolean c(o o0) {
        o o1 = (o)this.get();
        c c0 = c.a;
        if(o1 == c0) {
            if(o0 != null) {
                o0.l();
            }
            return false;
        }
        if(this.compareAndSet(o1, o0)) {
            return true;
        }
        if(((o)this.get()) == c0) {
            if(o0 != null) {
                o0.l();
            }
            return false;
        }
        return true;
    }

    public boolean d(o o0) {
        o o1;
        do {
            o1 = (o)this.get();
            if(o1 == c.a) {
                if(o0 != null) {
                    o0.l();
                }
                return false;
            }
        }
        while(!this.compareAndSet(o1, o0));
        if(o1 != null) {
            o1.l();
        }
        return true;
    }

    public boolean e(o o0) {
        o o1 = (o)this.get();
        c c0 = c.a;
        if(o1 == c0) {
            if(o0 != null) {
                o0.l();
            }
            return false;
        }
        if(this.compareAndSet(o1, o0)) {
            return true;
        }
        o o2 = (o)this.get();
        if(o0 != null) {
            o0.l();
        }
        return o2 == c0;
    }

    @Override  // rx.o
    public boolean j() {
        return this.get() == c.a;
    }

    @Override  // rx.o
    public void l() {
        o o0 = (o)this.get();
        c c0 = c.a;
        if(o0 != c0) {
            o o1 = (o)this.getAndSet(c0);
            if(o1 != null && o1 != c0) {
                o1.l();
            }
        }
    }
}

