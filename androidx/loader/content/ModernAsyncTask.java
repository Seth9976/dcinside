package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask {
    static class AsyncTaskResult {
        final ModernAsyncTask a;
        final Object[] b;

        AsyncTaskResult(ModernAsyncTask modernAsyncTask0, Object[] arr_object) {
            this.a = modernAsyncTask0;
            this.b = arr_object;
        }
    }

    static class InternalHandler extends Handler {
        InternalHandler() {
            super(Looper.getMainLooper());
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            AsyncTaskResult modernAsyncTask$AsyncTaskResult0 = (AsyncTaskResult)message0.obj;
            switch(message0.what) {
                case 1: {
                    modernAsyncTask$AsyncTaskResult0.a.f(modernAsyncTask$AsyncTaskResult0.b[0]);
                    return;
                }
                case 2: {
                    modernAsyncTask$AsyncTaskResult0.a.p(modernAsyncTask$AsyncTaskResult0.b);
                }
            }
        }
    }

    public static enum Status {
        PENDING,
        RUNNING,
        FINISHED;

    }

    static abstract class WorkerRunnable implements Callable {
        Object[] a;

    }

    private final WorkerRunnable a;
    private final FutureTask b;
    private volatile Status c;
    final AtomicBoolean d;
    final AtomicBoolean e;
    private static final String f = "AsyncTask";
    private static final int g = 5;
    private static final int h = 0x80;
    private static final int i = 1;
    private static final ThreadFactory j = null;
    private static final BlockingQueue k = null;
    public static final Executor l = null;
    private static final int m = 1;
    private static final int n = 2;
    private static InternalHandler o;
    private static volatile Executor p;

    static {
        androidx.loader.content.ModernAsyncTask.1 modernAsyncTask$10 = new ThreadFactory() {
            private final AtomicInteger a;

            {
                this.a = new AtomicInteger(1);
            }

            @Override
            public Thread newThread(Runnable runnable0) {
                return new Thread(runnable0, "ModernAsyncTask #" + this.a.getAndIncrement());
            }
        };
        ModernAsyncTask.j = modernAsyncTask$10;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue(10);
        ModernAsyncTask.k = linkedBlockingQueue0;
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(5, 0x80, 1L, TimeUnit.SECONDS, linkedBlockingQueue0, modernAsyncTask$10);
        ModernAsyncTask.l = threadPoolExecutor0;
        ModernAsyncTask.p = threadPoolExecutor0;
    }

    ModernAsyncTask() {
        this.c = Status.a;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
        androidx.loader.content.ModernAsyncTask.2 modernAsyncTask$20 = new WorkerRunnable() {
            final ModernAsyncTask b;

            @Override
            public Object call() throws Exception {
                ModernAsyncTask.this.e.set(true);
                Object object0 = null;
                try {
                    Process.setThreadPriority(10);
                    object0 = ModernAsyncTask.this.b(this.a);
                    Binder.flushPendingCommands();
                }
                catch(Throwable throwable0) {
                    try {
                        ModernAsyncTask.this.d.set(true);
                        throw throwable0;
                    }
                    catch(Throwable throwable1) {
                        ModernAsyncTask.this.q(object0);
                        throw throwable1;
                    }
                }
                ModernAsyncTask.this.q(object0);
                return object0;
            }
        };
        this.a = modernAsyncTask$20;
        this.b = new FutureTask(modernAsyncTask$20) {
            final ModernAsyncTask a;

            @Override
            protected void done() {
                try {
                    Object object0 = this.get();
                    ModernAsyncTask.this.r(object0);
                }
                catch(InterruptedException interruptedException0) {
                    Log.w("AsyncTask", interruptedException0);
                }
                catch(ExecutionException executionException0) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", executionException0.getCause());
                }
                catch(CancellationException unused_ex) {
                    ModernAsyncTask.this.r(null);
                }
                catch(Throwable throwable0) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", throwable0);
                }
            }
        };
    }

    public final boolean a(boolean z) {
        this.d.set(true);
        return this.b.cancel(z);
    }

    protected abstract Object b(Object[] arg1);

    public final ModernAsyncTask c(Object[] arr_object) {
        return this.e(ModernAsyncTask.p, arr_object);
    }

    public static void d(Runnable runnable0) {
        ModernAsyncTask.p.execute(runnable0);
    }

    public final ModernAsyncTask e(Executor executor0, Object[] arr_object) {
        if(this.c != Status.a) {
            switch(this.c) {
                case 1: {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                }
                case 2: {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                default: {
                    throw new IllegalStateException("We should never reach this state");
                }
            }
        }
        this.c = Status.b;
        this.a.a = arr_object;
        executor0.execute(this.b);
        return this;
    }

    void f(Object object0) {
        if(this.k()) {
            this.m(object0);
        }
        else {
            this.n(object0);
        }
        this.c = Status.c;
    }

    public final Object g() throws InterruptedException, ExecutionException {
        return this.b.get();
    }

    public final Object h(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.b.get(v, timeUnit0);
    }

    private static Handler i() {
        synchronized(ModernAsyncTask.class) {
            if(ModernAsyncTask.o == null) {
                ModernAsyncTask.o = new InternalHandler();
            }
            return ModernAsyncTask.o;
        }
    }

    public final Status j() {
        return this.c;
    }

    public final boolean k() {
        return this.d.get();
    }

    protected void l() {
    }

    protected void m(Object object0) {
    }

    protected void n(Object object0) {
    }

    protected void o() {
    }

    protected void p(Object[] arr_object) {
    }

    Object q(Object object0) {
        ModernAsyncTask.i().obtainMessage(1, new AsyncTaskResult(this, new Object[]{object0})).sendToTarget();
        return object0;
    }

    void r(Object object0) {
        if(!this.e.get()) {
            this.q(object0);
        }
    }

    protected final void s(Object[] arr_object) {
        if(!this.k()) {
            ModernAsyncTask.i().obtainMessage(2, new AsyncTaskResult(this, arr_object)).sendToTarget();
        }
    }

    @RestrictTo({Scope.b})
    public static void t(Executor executor0) {
        ModernAsyncTask.p = executor0;
    }
}

