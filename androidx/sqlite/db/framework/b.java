package androidx.sqlite.db.framework;

import A3.q;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public final class b implements SQLiteDatabase.CursorFactory {
    public final q a;

    public b(q q0) {
        this.a = q0;
    }

    @Override  // android.database.sqlite.SQLiteDatabase$CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        return FrameworkSQLiteDatabase.e(this.a, sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
    }
}

