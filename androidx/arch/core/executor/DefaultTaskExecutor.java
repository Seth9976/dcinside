package androidx.arch.core.executor;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({Scope.c})
public class DefaultTaskExecutor extends TaskExecutor {
    @RequiresApi(28)
    static class Api28Impl {
        @NonNull
        public static Handler a(@NonNull Looper looper0) {
            return Handler.createAsync(looper0);
        }
    }

    private final Object a;
    private final ExecutorService b;
    @Nullable
    private volatile Handler c;

    public DefaultTaskExecutor() {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new ThreadFactory() {
            private final AtomicInteger a;
            final DefaultTaskExecutor b;
            private static final String c = "arch_disk_io_";

            {
                this.a = new AtomicInteger(0);
            }

            @Override
            public Thread newThread(Runnable runnable0) {
                Thread thread0 = new Thread(runnable0);
                thread0.setName("arch_disk_io_" + this.a.getAndIncrement());
                return thread0;
            }
        });
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void a(@NonNull Runnable runnable0) {
        this.b.execute(runnable0);
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override  // androidx.arch.core.executor.TaskExecutor
    public void d(@NonNull Runnable runnable0) {
        if(this.c == null) {
            Object object0 = this.a;
            synchronized(object0) {
                if(this.c == null) {
                    this.c = DefaultTaskExecutor.e(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable0);
    }

    @NonNull
    private static Handler e(@NonNull Looper looper0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.a(looper0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, null, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException unused_ex) {
            return new Handler(looper0);
        }
        catch(InvocationTargetException unused_ex) {
            return new Handler(looper0);
        }
    }
}

