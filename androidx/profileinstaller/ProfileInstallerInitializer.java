package androidx.profileinstaller;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements Initializer {
    @RequiresApi(28)
    static class Handler28Impl {
        public static Handler a(Looper looper0) {
            return Handler.createAsync(looper0);
        }
    }

    public static class Result {
    }

    private static final int a = 5000;

    @Override  // androidx.startup.Initializer
    @NonNull
    public Object create(@NonNull Context context0) {
        return this.d(context0);
    }

    @NonNull
    public Result d(@NonNull Context context0) {
        if(Build.VERSION.SDK_INT < 24) {
            return new Result();
        }
        Context context1 = context0.getApplicationContext();
        Choreographer.getInstance().postFrameCallback((long v) -> this.e(context1));
        return new Result();
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public List dependencies() {
        return Collections.emptyList();
    }

    void e(@NonNull Context context0) {
        Handler handler0 = Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : Handler28Impl.a(Looper.getMainLooper());
        int v = new Random().nextInt(1000);
        handler0.postDelayed(() -> new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(context0)), ((long)(v + 5000)));
    }

    // 检测为 Lambda 实现
    private void f(Context context0, long v) [...]

    // 检测为 Lambda 实现
    private static void i(@NonNull Context context0) [...]
}

