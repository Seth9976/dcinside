package F4;

import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.c;
import rx.functions.n;
import rx.o;

public final class a extends AtomicReference implements o {
    private static final long a = 0x4F5C453163A88DC2L;

    public a(n n0) {
        super(n0);
    }

    @Override  // rx.o
    public boolean j() {
        return this.get() == null;
    }

    @Override  // rx.o
    public void l() {
        if(this.get() != null) {
            n n0 = (n)this.getAndSet(null);
            if(n0 != null) {
                try {
                    n0.cancel();
                }
                catch(Exception exception0) {
                    c.e(exception0);
                    rx.plugins.c.I(exception0);
                }
            }
        }
    }
}

