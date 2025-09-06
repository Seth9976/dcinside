package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class f implements Closeable {
    private final Object a;
    private final List b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    private boolean e;
    private boolean f;

    public f() {
        this.a = new Object();
        this.b = new ArrayList();
        this.c = c.d();
    }

    public void c() {
        ArrayList arrayList0;
        synchronized(this.a) {
            this.q();
            if(this.e) {
                return;
            }
            this.i();
            this.e = true;
            arrayList0 = new ArrayList(this.b);
        }
        this.n(arrayList0);
    }

    @Override
    public void close() {
        synchronized(this.a) {
            if(this.f) {
                return;
            }
            this.i();
            for(Object object1: this.b) {
                ((e)object1).close();
            }
            this.b.clear();
            this.f = true;
        }
    }

    public void e(long v) {
        this.f(v, TimeUnit.MILLISECONDS);
    }

    private void f(long v, TimeUnit timeUnit0) {
        class a implements Runnable {
            final f a;

            @Override
            public void run() {
                synchronized(f.this.a) {
                    f.this.d = null;
                }
                f.this.c();
            }
        }

        int v1 = Long.compare(v, -1L);
        if(v1 < 0) {
            throw new IllegalArgumentException("Delay must be >= -1");
        }
        if(v == 0L) {
            this.c();
            return;
        }
        synchronized(this.a) {
            if(this.e) {
                return;
            }
            this.i();
            if(v1 != 0) {
                a f$a0 = new a(this);
                this.d = this.c.schedule(f$a0, v, timeUnit0);
            }
        }
    }

    private void i() {
        ScheduledFuture scheduledFuture0 = this.d;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
            this.d = null;
        }
    }

    public d j() {
        synchronized(this.a) {
            this.q();
        }
        return new d(this);
    }

    public boolean k() {
        synchronized(this.a) {
            this.q();
            return this.e;
        }
    }

    private void n(List list0) {
        for(Object object0: list0) {
            ((e)object0).a();
        }
    }

    e o(Runnable runnable0) {
        synchronized(this.a) {
            this.q();
            e e0 = new e(this, runnable0);
            if(this.e) {
                e0.a();
            }
            else {
                this.b.add(e0);
            }
            return e0;
        }
    }

    void p() throws CancellationException {
        synchronized(this.a) {
            this.q();
            if(!this.e) {
                return;
            }
        }
        throw new CancellationException();
    }

    private void q() {
        if(this.f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    void s(e e0) {
        synchronized(this.a) {
            this.q();
            this.b.remove(e0);
        }
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", this.getClass().getName(), Integer.toHexString(this.hashCode()), Boolean.toString(this.k()));
    }
}

