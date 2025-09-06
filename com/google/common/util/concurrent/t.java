package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import O1.a;
import com.google.common.base.H;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@c
@d
@N
public final class T implements b1 {
    @Override  // com.google.common.util.concurrent.b1
    public void a(Runnable runnable0, long v, TimeUnit timeUnit0) {
        this.d(runnable0, v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.b1
    @a
    @F0
    public Object b(Callable callable0, long v, TimeUnit timeUnit0) throws ExecutionException {
        return this.c(callable0, v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.b1
    @a
    @F0
    public Object c(Callable callable0, long v, TimeUnit timeUnit0) throws ExecutionException {
        H.E(callable0);
        H.E(timeUnit0);
        try {
            return callable0.call();
        }
        catch(RuntimeException runtimeException0) {
            throw new f1(runtimeException0);
        }
        catch(Exception exception0) {
            H0.b(exception0);
            throw new ExecutionException(exception0);
        }
        catch(Error error0) {
            throw new O(error0);
        }
    }

    @Override  // com.google.common.util.concurrent.b1
    public void d(Runnable runnable0, long v, TimeUnit timeUnit0) {
        H.E(runnable0);
        H.E(timeUnit0);
        try {
            runnable0.run();
        }
        catch(Exception exception0) {
            throw new f1(exception0);
        }
        catch(Error error0) {
            throw new O(error0);
        }
    }

    @Override  // com.google.common.util.concurrent.b1
    @a
    public Object e(Object object0, Class class0, long v, TimeUnit timeUnit0) {
        H.E(object0);
        H.E(class0);
        H.E(timeUnit0);
        return object0;
    }
}

