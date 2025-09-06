package rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.o;
import rx.plugins.c;

public abstract class b implements d, o {
    static final class a implements o {
        @Override  // rx.o
        public boolean j() {
            return true;
        }

        @Override  // rx.o
        public void l() {
        }
    }

    private final AtomicReference a;
    static final a b;

    static {
        b.b = new a();
    }

    public b() {
        this.a = new AtomicReference();
    }

    @Override  // rx.d
    public final void a(o o0) {
        if(!androidx.compose.animation.core.d.a(this.a, null, o0)) {
            o0.l();
            if(this.a.get() != b.b) {
                c.I(new IllegalStateException("Subscription already set!"));
            }
        }
    }

    protected final void b() {
        this.a.set(b.b);
    }

    @Override  // rx.o
    public final boolean j() {
        return this.a.get() == b.b;
    }

    @Override  // rx.o
    public final void l() {
        o o0 = (o)this.a.get();
        a b$a0 = b.b;
        if(o0 != b$a0) {
            o o1 = (o)this.a.getAndSet(b$a0);
            if(o1 != null && o1 != b$a0) {
                o1.l();
            }
        }
    }

    protected void onStart() {
    }
}

