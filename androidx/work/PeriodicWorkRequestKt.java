package androidx.work;

import androidx.annotation.RequiresApi;
import j..time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;

public final class PeriodicWorkRequestKt {
    public static final Builder a(long v, TimeUnit timeUnit0) {
        L.p(timeUnit0, "repeatIntervalTimeUnit");
        L.y(4, "W");
        return new Builder(ListenableWorker.class, v, timeUnit0);
    }

    public static final Builder b(long v, TimeUnit timeUnit0, long v1, TimeUnit timeUnit1) {
        L.p(timeUnit0, "repeatIntervalTimeUnit");
        L.p(timeUnit1, "flexTimeIntervalUnit");
        L.y(4, "W");
        return new Builder(ListenableWorker.class, v, timeUnit0, v1, timeUnit1);
    }

    @RequiresApi(26)
    public static final Builder c(Duration duration0) {
        L.p(duration0, "repeatInterval");
        L.y(4, "W");
        return new Builder(ListenableWorker.class, duration0);
    }

    @RequiresApi(26)
    public static final Builder d(Duration duration0, Duration duration1) {
        L.p(duration0, "repeatInterval");
        L.p(duration1, "flexTimeInterval");
        L.y(4, "W");
        return new Builder(ListenableWorker.class, duration0, duration1);
    }
}

