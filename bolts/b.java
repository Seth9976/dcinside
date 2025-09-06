package bolts;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class b {
    static class a {
    }

    static class bolts.b.b implements Executor {
        private bolts.b.b() {
        }

        bolts.b.b(a b$a0) {
        }

        @Override
        public void execute(Runnable runnable0) {
            new Handler(Looper.getMainLooper()).post(runnable0);
        }
    }

    private final Executor a;
    private static final b b = null;
    private static final int c = 0;
    static final int d = 0;
    static final int e = 0;
    static final long f = 1L;

    static {
        b.b = new b();
        int v = Runtime.getRuntime().availableProcessors();
        b.c = v;
        b.d = v + 1;
        b.e = v * 2 + 1;
    }

    private b() {
        this.a = new bolts.b.b(null);
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor0, boolean z) {
        threadPoolExecutor0.allowCoreThreadTimeOut(z);
    }

    public static ExecutorService b() {
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        ExecutorService executorService0 = new ThreadPoolExecutor(b.d, b.e, 1L, timeUnit0, linkedBlockingQueue0);
        b.a(((ThreadPoolExecutor)executorService0), true);
        return executorService0;
    }

    public static ExecutorService c(ThreadFactory threadFactory0) {
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        ExecutorService executorService0 = new ThreadPoolExecutor(b.d, b.e, 1L, timeUnit0, linkedBlockingQueue0, threadFactory0);
        b.a(((ThreadPoolExecutor)executorService0), true);
        return executorService0;
    }

    public static Executor d() {
        return b.b.a;
    }
}

