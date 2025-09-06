package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.g;
import rx.internal.util.q;
import rx.o;

public final class j extends AtomicReference implements Runnable, o {
    final class a implements o {
        private final Future a;
        final j b;

        a(Future future0) {
            this.a = future0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.isCancelled();
        }

        @Override  // rx.o
        public void l() {
            if(j.this.get() != Thread.currentThread()) {
                this.a.cancel(true);
                return;
            }
            this.a.cancel(false);
        }
    }

    static final class b extends AtomicBoolean implements o {
        final j a;
        final q b;
        private static final long c = 0x36E5888D681586EL;

        public b(j j0, q q0) {
            this.a = j0;
            this.b = q0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.j();
        }

        @Override  // rx.o
        public void l() {
            if(this.compareAndSet(false, true)) {
                this.b.d(this.a);
            }
        }
    }

    static final class c extends AtomicBoolean implements o {
        final j a;
        final rx.subscriptions.b b;
        private static final long c = 0x36E5888D681586EL;

        public c(j j0, rx.subscriptions.b b0) {
            this.a = j0;
            this.b = b0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.j();
        }

        @Override  // rx.o
        public void l() {
            if(this.compareAndSet(false, true)) {
                this.b.e(this.a);
            }
        }
    }

    final q a;
    final rx.functions.a b;
    private static final long c = 0xC902BAA90878364FL;

    public j(rx.functions.a a0) {
        this.b = a0;
        this.a = new q();
    }

    public j(rx.functions.a a0, q q0) {
        this.b = a0;
        this.a = new q(new b(this, q0));
    }

    public j(rx.functions.a a0, rx.subscriptions.b b0) {
        this.b = a0;
        this.a = new q(new c(this, b0));
    }

    public void a(Future future0) {
        a j$a0 = new a(this, future0);
        this.a.a(j$a0);
    }

    public void b(o o0) {
        this.a.a(o0);
    }

    public void c(q q0) {
        b j$b0 = new b(this, q0);
        this.a.a(j$b0);
    }

    public void d(rx.subscriptions.b b0) {
        c j$c0 = new c(this, b0);
        this.a.a(j$c0);
    }

    void e(Throwable throwable0) {
        rx.plugins.c.I(throwable0);
        Thread thread0 = Thread.currentThread();
        thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
    }

    @Override  // rx.o
    public boolean j() {
        return this.a.j();
    }

    @Override  // rx.o
    public void l() {
        if(!this.a.j()) {
            this.a.l();
        }
    }

    @Override
    public void run() {
        try {
            this.lazySet(Thread.currentThread());
            this.b.call();
            goto label_12;
        }
        catch(g g0) {
        }
        catch(Throwable throwable0) {
            goto label_7;
        }
        try {
            this.e(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", g0));
            goto label_12;
        label_7:
            this.e(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", throwable0));
        }
        catch(Throwable throwable1) {
            this.l();
            throw throwable1;
        }
    label_12:
        this.l();
    }
}

