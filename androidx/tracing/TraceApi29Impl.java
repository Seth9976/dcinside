package androidx.tracing;

import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
final class TraceApi29Impl {
    public static void a(@NonNull String s, int v) {
        Trace.beginAsyncSection(s, v);
    }

    public static void b(@NonNull String s, int v) {
        Trace.endAsyncSection(s, v);
    }

    @DoNotInline
    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(@NonNull String s, int v) {
        Trace.setCounter(s, ((long)v));
    }
}

