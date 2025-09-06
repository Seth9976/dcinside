package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
public final class StartupLogger {
    private static final String a = "StartupLogger";
    static final boolean b = false;

    public static void a(@NonNull String s, @Nullable Throwable throwable0) {
        Log.e("StartupLogger", s, throwable0);
    }

    public static void b(@NonNull String s) {
        Log.i("StartupLogger", s);
    }

    public static void c(@NonNull String s) {
        Log.w("StartupLogger", s);
    }
}

