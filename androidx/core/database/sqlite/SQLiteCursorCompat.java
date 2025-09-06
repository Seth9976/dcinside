package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;

public final class SQLiteCursorCompat {
    @RequiresApi(28)
    static class Api28Impl {
        static void a(SQLiteCursor sQLiteCursor0, boolean z) {
            sQLiteCursor0.setFillWindowForwardOnly(z);
        }
    }

    public static void a(SQLiteCursor sQLiteCursor0, boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.a(sQLiteCursor0, z);
        }
    }
}

