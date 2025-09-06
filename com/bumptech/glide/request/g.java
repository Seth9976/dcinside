package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.transition.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class g implements d, h {
    @VisibleForTesting
    static class a {
        void a(Object object0) {
            object0.notifyAll();
        }

        void b(Object object0, long v) throws InterruptedException {
            object0.wait(v);
        }
    }

    private final int a;
    private final int b;
    private final boolean c;
    private final a d;
    @GuardedBy("this")
    @Nullable
    private Object e;
    @GuardedBy("this")
    @Nullable
    private e f;
    @GuardedBy("this")
    private boolean g;
    @GuardedBy("this")
    private boolean h;
    @GuardedBy("this")
    private boolean i;
    @GuardedBy("this")
    @Nullable
    private q j;
    private static final a k;

    static {
        g.k = new a();
    }

    public g(int v, int v1) {
        this(v, v1, true, g.k);
    }

    g(int v, int v1, boolean z, a g$a0) {
        this.a = v;
        this.b = v1;
        this.c = z;
        this.d = g$a0;
    }

    @Override  // com.bumptech.glide.request.target.p
    public void A(@NonNull o o0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void B(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void C(@NonNull Object object0, @Nullable f f0) {
        synchronized(this) {
        }
    }

    @Override  // com.bumptech.glide.request.target.p
    public void D(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.p
    public void E(@Nullable e e0) {
        synchronized(this) {
            this.f = e0;
        }
    }

    @Override  // com.bumptech.glide.request.target.p
    public void F(@Nullable Drawable drawable0) {
        synchronized(this) {
        }
    }

    @Override  // com.bumptech.glide.request.target.p
    public void G(@NonNull o o0) {
        o0.d(this.a, this.b);
    }

    private Object a(Long long0) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized(this) {
            if(this.c && !this.isDone()) {
                com.bumptech.glide.util.o.a();
            }
            if(!this.g) {
                if(this.i) {
                    throw new ExecutionException(this.j);
                }
                if(this.h) {
                    return this.e;
                }
                if(long0 == null) {
                    this.d.b(this, 0L);
                }
                else if(((long)long0) > 0L) {
                    long v1 = System.currentTimeMillis();
                    long v2 = ((long)long0) + v1;
                    while(!this.isDone() && v1 < v2) {
                        this.d.b(this, v2 - v1);
                        v1 = System.currentTimeMillis();
                    }
                }
                if(Thread.interrupted()) {
                    throw new InterruptedException();
                }
                if(this.i) {
                    throw new ExecutionException(this.j);
                }
                if(this.g) {
                    throw new CancellationException();
                }
                if(!this.h) {
                    throw new TimeoutException();
                }
                return this.e;
            }
        }
        throw new CancellationException();
    }

    @Override
    public boolean cancel(boolean z) {
        e e0;
        synchronized(this) {
            if(this.isDone()) {
                return false;
            }
            this.g = true;
            this.d.a(this);
            e0 = null;
            if(z) {
                e e1 = this.f;
                this.f = null;
                e0 = e1;
            }
        }
        if(e0 != null) {
            e0.clear();
        }
        return true;
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        try {
            return this.a(null);
        }
        catch(TimeoutException timeoutException0) {
            throw new AssertionError(timeoutException0);
        }
    }

    @Override
    public Object get(long v, @NonNull TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a(timeUnit0.toMillis(v));
    }

    @Override
    public boolean isCancelled() {
        synchronized(this) {
        }
        return this.g;
    }

    @Override
    public boolean isDone() {
        synchronized(this) {
        }
        return this.g || this.h || this.i;
    }

    @Override  // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onLoadFailed(@Nullable q q0, Object object0, @NonNull p p0, boolean z) {
        synchronized(this) {
            this.i = true;
            this.j = q0;
            this.d.a(this);
            return false;
        }
    }

    @Override  // com.bumptech.glide.request.h
    public boolean onResourceReady(@NonNull Object object0, @NonNull Object object1, p p0, @NonNull com.bumptech.glide.load.a a0, boolean z) {
        synchronized(this) {
            this.h = true;
            this.e = object0;
            this.d.a(this);
            return false;
        }
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override  // com.bumptech.glide.manager.k
    public void onStop() {
    }

    @Override
    public String toString() {
        String s1;
        e e0 = null;
        String s = super.toString() + "[status=";
        synchronized(this) {
            if(this.g) {
                s1 = "CANCELLED";
            }
            else if(this.i) {
                s1 = "FAILURE";
            }
            else if(this.h) {
                s1 = "SUCCESS";
            }
            else {
                s1 = "PENDING";
                e0 = this.f;
            }
        }
        return e0 == null ? s + s1 + "]" : s + s1 + ", request=[" + e0 + "]]";
    }

    @Override  // com.bumptech.glide.request.target.p
    @Nullable
    public e z() {
        synchronized(this) {
        }
        return this.f;
    }
}

