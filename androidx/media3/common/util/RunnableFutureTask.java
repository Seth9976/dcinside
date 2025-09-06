package androidx.media3.common.util;

import androidx.annotation.Nullable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@UnstableApi
public abstract class RunnableFutureTask implements RunnableFuture {
    private final ConditionVariable a;
    private final ConditionVariable b;
    private final Object c;
    @Nullable
    private Exception d;
    @Nullable
    private Object e;
    @Nullable
    private Thread f;
    private boolean g;

    protected RunnableFutureTask() {
        this.a = new ConditionVariable();
        this.b = new ConditionVariable();
        this.c = new Object();
    }

    public final void a() {
        this.b.c();
    }

    public final void b() {
        this.a.c();
    }

    protected void c() {
    }

    @Override
    public final boolean cancel(boolean z) {
        synchronized(this.c) {
            if(!this.g && !this.b.e()) {
                this.g = true;
                this.c();
                Thread thread0 = this.f;
                if(thread0 == null) {
                    this.a.f();
                    this.b.f();
                }
                else if(z) {
                    thread0.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @UnknownNull
    protected abstract Object d() throws Exception;

    @UnknownNull
    private Object e() throws ExecutionException {
        if(this.g) {
            throw new CancellationException();
        }
        if(this.d != null) {
            throw new ExecutionException(this.d);
        }
        return this.e;
    }

    @Override
    @UnknownNull
    public final Object get() throws ExecutionException, InterruptedException {
        this.b.a();
        return this.e();
    }

    @Override
    @UnknownNull
    public final Object get(long v, TimeUnit timeUnit0) throws ExecutionException, InterruptedException, TimeoutException {
        long v1 = TimeUnit.MILLISECONDS.convert(v, timeUnit0);
        if(!this.b.b(v1)) {
            throw new TimeoutException();
        }
        return this.e();
    }

    @Override
    public final boolean isCancelled() {
        return this.g;
    }

    @Override
    public final boolean isDone() {
        return this.b.e();
    }

    @Override
    public final void run() {
        synchronized(this.c) {
            if(this.g) {
                return;
            }
            this.f = Thread.currentThread();
        }
        this.a.f();
        try {
            this.e = this.d();
        }
        catch(Exception exception0) {
            this.d = exception0;
        }
        finally {
            synchronized(this.c) {
                this.b.f();
                this.f = null;
                Thread.interrupted();
            }
        }
    }
}

