package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.W0;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;

@W0(markerClass = {l.class})
@h0(version = "1.6")
public enum h {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);

    @y4.l
    private final TimeUnit a;
    private static final h[] i;
    private static final a j;

    static {
        h.i = arr_h;
        L.p(arr_h, "entries");
        h.j = new d(arr_h);
    }

    private h(TimeUnit timeUnit0) {
        this.a = timeUnit0;
    }

    private static final h[] a() [...] // Inlined contents

    @y4.l
    public static a b() {
        return h.j;
    }

    @y4.l
    public final TimeUnit c() {
        return this.a;
    }
}

