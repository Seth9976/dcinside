package com.google.firebase.messaging.threads;

import O1.d;
import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {
    static class a {
    }

    static class com.google.firebase.messaging.threads.b.b implements com.google.firebase.messaging.threads.a {
        private static final long a = 60L;

        private com.google.firebase.messaging.threads.b.b() {
        }

        com.google.firebase.messaging.threads.b.b(a b$a0) {
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public ScheduledExecutorService a(int v, c c0) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(v));
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public ExecutorService b(int v, ThreadFactory threadFactory0, c c0) {
            ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(v, v, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory0);
            threadPoolExecutor0.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor0);
        }

        @Override  // com.google.firebase.messaging.threads.a
        @NonNull
        public ExecutorService c(int v, c c0) {
            return this.b(v, Executors.defaultThreadFactory(), c0);
        }

        @Override  // com.google.firebase.messaging.threads.a
        @NonNull
        public ExecutorService d(ThreadFactory threadFactory0, c c0) {
            return this.b(1, threadFactory0, c0);
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public ExecutorService e(c c0) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public ScheduledExecutorService f(int v, ThreadFactory threadFactory0, c c0) {
            return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(v, threadFactory0));
        }

        @Override  // com.google.firebase.messaging.threads.a
        @NonNull
        public ExecutorService g(c c0) {
            return this.c(1, c0);
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public Future h(@d String s, @d String s1, c c0, Runnable runnable0) {
            Future future0 = new FutureTask(runnable0, null);
            new Thread(((Runnable)future0), s1).start();
            return future0;
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public void i(@d String s, @d String s1, c c0, Runnable runnable0) {
            new Thread(runnable0, s1).start();
        }

        @Override  // com.google.firebase.messaging.threads.a
        @SuppressLint({"ThreadPoolCreation"})
        @NonNull
        public ExecutorService j(ThreadFactory threadFactory0, c c0) {
            return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(threadFactory0));
        }
    }

    private static final com.google.firebase.messaging.threads.a a;
    private static volatile com.google.firebase.messaging.threads.a b;

    static {
        com.google.firebase.messaging.threads.b.b b$b0 = new com.google.firebase.messaging.threads.b.b(null);
        b.a = b$b0;
        b.b = b$b0;
    }

    public static com.google.firebase.messaging.threads.a a() {
        return b.b;
    }

    static void b(com.google.firebase.messaging.threads.a a0) {
        if(b.b != b.a) {
            throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
        }
        b.b = a0;
    }
}

