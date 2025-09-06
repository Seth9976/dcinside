package androidx.media3.common.util;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

@UnstableApi
public class SystemClock implements Clock {
    @Override  // androidx.media3.common.util.Clock
    public long a() {
        return android.os.SystemClock.uptimeMillis();
    }

    @Override  // androidx.media3.common.util.Clock
    public void b() {
    }

    @Override  // androidx.media3.common.util.Clock
    public HandlerWrapper c(Looper looper0, @Nullable Handler.Callback handler$Callback0) {
        return new SystemHandlerWrapper(new Handler(looper0, handler$Callback0));
    }

    @Override  // androidx.media3.common.util.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override  // androidx.media3.common.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override  // androidx.media3.common.util.Clock
    public long nanoTime() {
        return System.nanoTime();
    }
}

