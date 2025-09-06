package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class f {
    class a implements Executor {
        a() {
            super();
        }

        @Override
        public void execute(@NonNull Runnable runnable0) {
            o.y(runnable0);
        }
    }

    class b implements Executor {
        b() {
            super();
        }

        @Override
        public void execute(@NonNull Runnable runnable0) {
            runnable0.run();
        }
    }

    private static final Executor a;
    private static final Executor b;

    static {
        f.a = new a();
        f.b = new b();
    }

    public static Executor a() {
        return f.b;
    }

    public static Executor b() {
        return f.a;
    }

    @VisibleForTesting
    public static void c(ExecutorService executorService0) {
        executorService0.shutdownNow();
        try {
            TimeUnit timeUnit0 = TimeUnit.SECONDS;
            if(!executorService0.awaitTermination(5L, timeUnit0)) {
                executorService0.shutdownNow();
                if(!executorService0.awaitTermination(5L, timeUnit0)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        }
        catch(InterruptedException interruptedException0) {
            executorService0.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(interruptedException0);
        }
    }
}

