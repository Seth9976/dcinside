package androidx.media3.common.util;

import android.os.Trace;

@UnstableApi
public final class TraceUtil {
    public static void a(String s) {
        Trace.beginSection(s);
    }

    public static void b() {
        Trace.endSection();
    }
}

