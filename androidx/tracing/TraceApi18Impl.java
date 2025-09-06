package androidx.tracing;

import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
final class TraceApi18Impl {
    public static void a(@NonNull String s) {
        Trace.beginSection(s);
    }

    public static void b() {
        Trace.endSection();
    }
}

