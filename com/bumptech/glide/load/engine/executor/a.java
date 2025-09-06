package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ExecutorService {
    static class com.bumptech.glide.load.engine.executor.a.a {
    }

    public static final class b {
        private final boolean a;
        private int b;
        private int c;
        @NonNull
        private ThreadFactory d;
        @NonNull
        private e e;
        private String f;
        private long g;
        public static final long h;

        b(boolean z) {
            this.d = new c(null);
            this.e = e.d;
            this.a = z;
        }

        public a a() {
            if(TextUtils.isEmpty(this.f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
            }
            ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(this.b, this.c, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.d, this.f, this.e, this.a));
            if(this.g != 0L) {
                threadPoolExecutor0.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor0);
        }

        public b b(String s) {
            this.f = s;
            return this;
        }

        public b c(@IntRange(from = 1L) int v) {
            this.b = v;
            this.c = v;
            return this;
        }

        @Deprecated
        public b d(@NonNull ThreadFactory threadFactory0) {
            this.d = threadFactory0;
            return this;
        }

        public b e(long v) {
            this.g = v;
            return this;
        }

        public b f(@NonNull e a$e0) {
            this.e = a$e0;
            return this;
        }
    }

    static final class c implements ThreadFactory {
        private static final int a = 9;

        private c() {
        }

        c(com.bumptech.glide.load.engine.executor.a.a a$a0) {
        }

        @Override
        public Thread newThread(@NonNull Runnable runnable0) {
            class com.bumptech.glide.load.engine.executor.a.c.a extends Thread {
                final c a;

                com.bumptech.glide.load.engine.executor.a.c.a(Runnable runnable0) {
                    super(runnable0);
                }

                @Override
                public void run() {
                    Process.setThreadPriority(9);
                    super.run();
                }
            }

            return new com.bumptech.glide.load.engine.executor.a.c.a(this, runnable0);
        }
    }

    static final class d implements ThreadFactory {
        private final ThreadFactory a;
        private final String b;
        final e c;
        final boolean d;
        private final AtomicInteger e;

        d(ThreadFactory threadFactory0, String s, e a$e0, boolean z) {
            this.e = new AtomicInteger();
            this.a = threadFactory0;
            this.b = s;
            this.c = a$e0;
            this.d = z;
        }

        @Override
        public Thread newThread(@NonNull Runnable runnable0) {
            class com.bumptech.glide.load.engine.executor.a.d.a implements Runnable {
                final Runnable a;
                final d b;

                com.bumptech.glide.load.engine.executor.a.d.a(Runnable runnable0) {
                    this.a = runnable0;
                    super();
                }

                @Override
                public void run() {
                    if(d.this.d) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        this.a.run();
                    }
                    catch(Throwable throwable0) {
                        d.this.c.a(throwable0);
                    }
                }
            }

            com.bumptech.glide.load.engine.executor.a.d.a a$d$a0 = new com.bumptech.glide.load.engine.executor.a.d.a(this, runnable0);
            Thread thread0 = this.a.newThread(a$d$a0);
            thread0.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
            return thread0;
        }
    }

    public interface e {
        class com.bumptech.glide.load.engine.executor.a.e.a implements e {
            com.bumptech.glide.load.engine.executor.a.e.a() {
                super();
            }

            @Override  // com.bumptech.glide.load.engine.executor.a$e
            public void a(Throwable throwable0) {
            }
        }

        class com.bumptech.glide.load.engine.executor.a.e.b implements e {
            com.bumptech.glide.load.engine.executor.a.e.b() {
                super();
            }

            @Override  // com.bumptech.glide.load.engine.executor.a$e
            public void a(Throwable throwable0) {
                if(throwable0 != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", throwable0);
                }
            }
        }

        class com.bumptech.glide.load.engine.executor.a.e.c implements e {
            com.bumptech.glide.load.engine.executor.a.e.c() {
                super();
            }

            @Override  // com.bumptech.glide.load.engine.executor.a$e
            public void a(Throwable throwable0) {
                if(throwable0 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", throwable0);
                }
            }
        }

        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;

        static {
            e.a = new com.bumptech.glide.load.engine.executor.a.e.a();
            com.bumptech.glide.load.engine.executor.a.e.b a$e$b0 = new com.bumptech.glide.load.engine.executor.a.e.b();
            e.b = a$e$b0;
            e.c = new com.bumptech.glide.load.engine.executor.a.e.c();
            e.d = a$e$b0;
        }

        void a(Throwable arg1);
    }

    private final ExecutorService a;
    static final String b = "source";
    static final String c = "disk-cache";
    static final int d = 1;
    private static final String e = "GlideExecutor";
    private static final String f = "source-unlimited";
    static final String g = "animation";
    private static final long h = 0L;
    private static final int i = 4;
    private static volatile int j;

    static {
        a.h = TimeUnit.SECONDS.toMillis(10L);
    }

    @VisibleForTesting
    a(ExecutorService executorService0) {
        this.a = executorService0;
    }

    static int a() {
        return a.b() < 4 ? 1 : 2;
    }

    @Override
    public boolean awaitTermination(long v, @NonNull TimeUnit timeUnit0) throws InterruptedException {
        return this.a.awaitTermination(v, timeUnit0);
    }

    public static int b() {
        if(a.j == 0) {
            a.j = 4;
        }
        return a.j;
    }

    public static b c() {
        int v = a.a();
        return new b(true).c(v).b("animation");
    }

    public static a d() {
        return a.c().a();
    }

    @Deprecated
    public static a e(int v, e a$e0) {
        return a.c().c(v).f(a$e0).a();
    }

    @Override
    public void execute(@NonNull Runnable runnable0) {
        this.a.execute(runnable0);
    }

    public static b f() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a g() {
        return a.f().a();
    }

    @Deprecated
    public static a h(int v, String s, e a$e0) {
        return a.f().c(v).b(s).f(a$e0).a();
    }

    @Deprecated
    public static a i(e a$e0) {
        return a.f().f(a$e0).a();
    }

    @Override
    @NonNull
    public List invokeAll(@NonNull Collection collection0) throws InterruptedException {
        return this.a.invokeAll(collection0);
    }

    @Override
    @NonNull
    public List invokeAll(@NonNull Collection collection0, long v, @NonNull TimeUnit timeUnit0) throws InterruptedException {
        return this.a.invokeAll(collection0, v, timeUnit0);
    }

    @Override
    @NonNull
    public Object invokeAny(@NonNull Collection collection0) throws InterruptedException, ExecutionException {
        return this.a.invokeAny(collection0);
    }

    @Override
    public Object invokeAny(@NonNull Collection collection0, long v, @NonNull TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a.invokeAny(collection0, v, timeUnit0);
    }

    @Override
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    public static b j() {
        return new b(false).c(a.b()).b("source");
    }

    public static a k() {
        return a.j().a();
    }

    @Deprecated
    public static a l(int v, String s, e a$e0) {
        return a.j().c(v).b(s).f(a$e0).a();
    }

    @Deprecated
    public static a m(e a$e0) {
        return a.j().f(a$e0).a();
    }

    public static a n() {
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        SynchronousQueue synchronousQueue0 = new SynchronousQueue();
        d a$d0 = new d(new c(null), "source-unlimited", e.d, false);
        return new a(new ThreadPoolExecutor(0, 0x7FFFFFFF, a.h, timeUnit0, synchronousQueue0, a$d0));
    }

    @Override
    public void shutdown() {
        this.a.shutdown();
    }

    @Override
    @NonNull
    public List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    @NonNull
    public Future submit(@NonNull Runnable runnable0) {
        return this.a.submit(runnable0);
    }

    @Override
    @NonNull
    public Future submit(@NonNull Runnable runnable0, Object object0) {
        return this.a.submit(runnable0, object0);
    }

    @Override
    public Future submit(@NonNull Callable callable0) {
        return this.a.submit(callable0);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

