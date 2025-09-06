package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class CallbackToFutureAdapter {
    public static final class Completer {
        Object a;
        SafeFuture b;
        private ResolvableFuture c;
        private boolean d;

        Completer() {
            this.c = ResolvableFuture.w();
        }

        public void a(@NonNull Runnable runnable0, @NonNull Executor executor0) {
            ResolvableFuture resolvableFuture0 = this.c;
            if(resolvableFuture0 != null) {
                resolvableFuture0.addListener(runnable0, executor0);
            }
        }

        void b() {
            this.a = null;
            this.b = null;
            this.c.r(null);
        }

        public boolean c(Object object0) {
            this.d = true;
            if(this.b == null || !this.b.b(object0)) {
                return false;
            }
            this.e();
            return true;
        }

        public boolean d() {
            this.d = true;
            if(this.b == null || !this.b.a(true)) {
                return false;
            }
            this.e();
            return true;
        }

        private void e() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public boolean f(@NonNull Throwable throwable0) {
            this.d = true;
            if(this.b == null || !this.b.c(throwable0)) {
                return false;
            }
            this.e();
            return true;
        }

        @Override
        protected void finalize() {
            SafeFuture callbackToFutureAdapter$SafeFuture0 = this.b;
            if(callbackToFutureAdapter$SafeFuture0 != null && !callbackToFutureAdapter$SafeFuture0.isDone()) {
                callbackToFutureAdapter$SafeFuture0.c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if(!this.d) {
                ResolvableFuture resolvableFuture0 = this.c;
                if(resolvableFuture0 != null) {
                    resolvableFuture0.r(null);
                }
            }
        }
    }

    static final class FutureGarbageCollectedException extends Throwable {
        FutureGarbageCollectedException(String s) {
            super(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            synchronized(this) {
            }
            return this;
        }
    }

    public interface Resolver {
        @Nullable
        Object a(@NonNull Completer arg1) throws Exception;
    }

    static final class SafeFuture implements t0 {
        final WeakReference a;
        private final AbstractResolvableFuture b;

        SafeFuture(Completer callbackToFutureAdapter$Completer0) {
            this.b = new AbstractResolvableFuture() {
                final SafeFuture i;

                @Override  // androidx.concurrent.futures.AbstractResolvableFuture
                protected String m() {
                    Completer callbackToFutureAdapter$Completer0 = (Completer)SafeFuture.this.a.get();
                    return callbackToFutureAdapter$Completer0 == null ? "Completer object has been garbage collected, future will fail soon" : "tag=[" + callbackToFutureAdapter$Completer0.a + "]";
                }
            };
            this.a = new WeakReference(callbackToFutureAdapter$Completer0);
        }

        boolean a(boolean z) {
            return this.b.cancel(z);
        }

        @Override  // com.google.common.util.concurrent.t0
        public void addListener(@NonNull Runnable runnable0, @NonNull Executor executor0) {
            this.b.addListener(runnable0, executor0);
        }

        boolean b(Object object0) {
            return this.b.r(object0);
        }

        boolean c(Throwable throwable0) {
            return this.b.s(throwable0);
        }

        @Override
        public boolean cancel(boolean z) {
            Completer callbackToFutureAdapter$Completer0 = (Completer)this.a.get();
            boolean z1 = this.b.cancel(z);
            if(z1 && callbackToFutureAdapter$Completer0 != null) {
                callbackToFutureAdapter$Completer0.b();
            }
            return z1;
        }

        @Override
        public Object get() throws InterruptedException, ExecutionException {
            return this.b.get();
        }

        @Override
        public Object get(long v, @NonNull TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
            return this.b.get(v, timeUnit0);
        }

        @Override
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.b.isDone();
        }

        @Override
        public String toString() {
            return this.b.toString();
        }
    }

    @NonNull
    public static t0 a(@NonNull Resolver callbackToFutureAdapter$Resolver0) {
        Completer callbackToFutureAdapter$Completer0 = new Completer();
        SafeFuture callbackToFutureAdapter$SafeFuture0 = new SafeFuture(callbackToFutureAdapter$Completer0);
        callbackToFutureAdapter$Completer0.b = callbackToFutureAdapter$SafeFuture0;
        callbackToFutureAdapter$Completer0.a = callbackToFutureAdapter$Resolver0.getClass();
        try {
            Object object0 = callbackToFutureAdapter$Resolver0.a(callbackToFutureAdapter$Completer0);
            if(object0 != null) {
                callbackToFutureAdapter$Completer0.a = object0;
                return callbackToFutureAdapter$SafeFuture0;
            }
        }
        catch(Exception exception0) {
            callbackToFutureAdapter$SafeFuture0.c(exception0);
        }
        return callbackToFutureAdapter$SafeFuture0;
    }
}

