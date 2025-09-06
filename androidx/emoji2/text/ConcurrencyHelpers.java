package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ConcurrencyHelpers {
    @RequiresApi(28)
    static class Handler28Impl {
        @DoNotInline
        public static Handler a(Looper looper0) {
            return Handler.createAsync(looper0);
        }
    }

    private static final int a = 15;

    @NonNull
    @Deprecated
    static Executor b(@NonNull Handler handler0) {
        Objects.requireNonNull(handler0);
        return new a(handler0);
    }

    static ThreadPoolExecutor c(@NonNull String s) {
        b b0 = (Runnable runnable0) -> {
            Thread thread0 = new Thread(runnable0, s);
            thread0.setPriority(10);
            return thread0;
        };
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), b0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        return threadPoolExecutor0;
    }

    // 检测为 Lambda 实现
    private static Thread d(String s, Runnable runnable0) [...]

    static Handler e() {
        return Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : Handler28Impl.a(Looper.getMainLooper());
    }
}

