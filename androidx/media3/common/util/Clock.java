package androidx.media3.common.util;

import android.os.Handler.Callback;
import android.os.Looper;
import androidx.annotation.Nullable;

@UnstableApi
public interface Clock {
    public static final Clock a;

    static {
        Clock.a = new SystemClock();
    }

    long a();

    void b();

    HandlerWrapper c(Looper arg1, @Nullable Handler.Callback arg2);

    long currentTimeMillis();

    long elapsedRealtime();

    long nanoTime();
}

