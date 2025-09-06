package androidx.work.impl.utils;

import androidx.annotation.RequiresApi;
import j..time.Duration;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@RequiresApi(26)
@i(name = "DurationApi26Impl")
public final class DurationApi26Impl {
    public static final long a(@l Duration duration0) {
        L.p(duration0, "<this>");
        return duration0.toMillis();
    }
}

