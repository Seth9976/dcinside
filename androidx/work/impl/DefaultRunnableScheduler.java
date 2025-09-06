package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

@RestrictTo({Scope.b})
public class DefaultRunnableScheduler implements RunnableScheduler {
    private final Handler a;

    public DefaultRunnableScheduler() {
        this.a = HandlerCompat.a(Looper.getMainLooper());
    }

    @Override  // androidx.work.RunnableScheduler
    public void a(@NonNull Runnable runnable0) {
        this.a.removeCallbacks(runnable0);
    }

    @Override  // androidx.work.RunnableScheduler
    public void b(long v, @NonNull Runnable runnable0) {
        this.a.postDelayed(runnable0, v);
    }

    @NonNull
    public Handler c() {
        return this.a;
    }
}

