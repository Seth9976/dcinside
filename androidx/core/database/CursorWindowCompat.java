package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;

public final class CursorWindowCompat {
    @RequiresApi(28)
    static class Api28Impl {
        static CursorWindow a(String s, long v) {
            return new CursorWindow(s, v);
        }
    }

    public static CursorWindow a(String s, long v) {
        return Build.VERSION.SDK_INT < 28 ? new CursorWindow(s) : Api28Impl.a(s, v);
    }
}

