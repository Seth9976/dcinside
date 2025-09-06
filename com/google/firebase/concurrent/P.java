package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import androidx.concurrent.futures.AbstractResolvableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
class p extends AbstractResolvableFuture implements ScheduledFuture {
    interface b {
        void a(Throwable arg1);

        void set(Object arg1);
    }

    interface c {
        ScheduledFuture a(b arg1);
    }

    private final ScheduledFuture i;

    p(c p$c0) {
        class a implements b {
            final p a;

            @Override  // com.google.firebase.concurrent.p$b
            public void a(Throwable throwable0) {
                p.this.s(throwable0);
            }

            @Override  // com.google.firebase.concurrent.p$b
            public void set(Object object0) {
                p.this.r(object0);
            }
        }

        this.i = p$c0.a(new a(this));
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    protected void b() {
        boolean z = this.v();
        this.i.cancel(z);
    }

    @Override
    public int compareTo(Object object0) {
        return this.z(((Delayed)object0));
    }

    @Override
    public long getDelay(TimeUnit timeUnit0) {
        return this.i.getDelay(timeUnit0);
    }

    public int z(Delayed delayed0) {
        return this.i.compareTo(delayed0);
    }
}

