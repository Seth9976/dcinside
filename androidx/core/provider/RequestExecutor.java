package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.IntRange;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class RequestExecutor {
    static class DefaultThreadFactory implements ThreadFactory {
        static class ProcessPriorityThread extends Thread {
            private final int a;

            ProcessPriorityThread(Runnable runnable0, String s, int v) {
                super(runnable0, s);
                this.a = v;
            }

            @Override
            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }

        private String a;
        private int b;

        DefaultThreadFactory(String s, int v) {
            this.a = s;
            this.b = v;
        }

        @Override
        public Thread newThread(Runnable runnable0) {
            return new ProcessPriorityThread(runnable0, this.a, this.b);
        }
    }

    static class HandlerExecutor implements Executor {
        private final Handler a;

        HandlerExecutor(Handler handler0) {
            this.a = (Handler)Preconditions.l(handler0);
        }

        @Override
        public void execute(Runnable runnable0) {
            Runnable runnable1 = (Runnable)Preconditions.l(runnable0);
            if(!this.a.post(runnable1)) {
                throw new RejectedExecutionException(this.a + " is shutting down");
            }
        }
    }

    static class ReplyRunnable implements Runnable {
        private Callable a;
        private Consumer b;
        private Handler c;

        ReplyRunnable(Handler handler0, Callable callable0, Consumer consumer0) {
            this.a = callable0;
            this.b = consumer0;
            this.c = handler0;
        }

        @Override
        public void run() {
            Object object0 = null;
            try {
                object0 = this.a.call();
            }
            catch(Exception unused_ex) {
            }
            this.c.post(new Runnable() {
                final ReplyRunnable c;

                @Override
                public void run() {
                    this.b.accept(object0);
                }
            });
        }
    }

    static ThreadPoolExecutor a(String s, int v, @IntRange(from = 0L) int v1) {
        DefaultThreadFactory requestExecutor$DefaultThreadFactory0 = new DefaultThreadFactory(s, v);
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, ((long)v1), TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), requestExecutor$DefaultThreadFactory0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return threadPoolExecutor0;
    }

    static Executor b(Handler handler0) {
        return new HandlerExecutor(handler0);
    }

    static void c(Executor executor0, Callable callable0, Consumer consumer0) {
        executor0.execute(new ReplyRunnable(CalleeHandler.a(), callable0, consumer0));
    }

    static Object d(ExecutorService executorService0, Callable callable0, @IntRange(from = 0L) int v) throws InterruptedException {
        Future future0 = executorService0.submit(callable0);
        try {
            return future0.get(((long)v), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            throw new RuntimeException(executionException0);
        }
        catch(InterruptedException interruptedException0) {
            throw interruptedException0;
        }
        catch(TimeoutException unused_ex) {
            throw new InterruptedException("timeout");
        }
    }
}

