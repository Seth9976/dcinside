package androidx.sqlite.db.framework;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;

public final class c implements DatabaseErrorHandler {
    public final Callback a;
    public final DBRefHolder b;

    public c(Callback supportSQLiteOpenHelper$Callback0, DBRefHolder frameworkSQLiteOpenHelper$DBRefHolder0) {
        this.a = supportSQLiteOpenHelper$Callback0;
        this.b = frameworkSQLiteOpenHelper$DBRefHolder0;
    }

    @Override  // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase0) {
        OpenHelper.b(this.a, this.b, sQLiteDatabase0);
    }
}

