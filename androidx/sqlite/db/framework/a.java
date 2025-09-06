package androidx.sqlite.db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

public final class a implements SQLiteDatabase.CursorFactory {
    public final SupportSQLiteQuery a;

    public a(SupportSQLiteQuery supportSQLiteQuery0) {
        this.a = supportSQLiteQuery0;
    }

    @Override  // android.database.sqlite.SQLiteDatabase$CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase0, SQLiteCursorDriver sQLiteCursorDriver0, String s, SQLiteQuery sQLiteQuery0) {
        return FrameworkSQLiteDatabase.f(this.a, sQLiteDatabase0, sQLiteCursorDriver0, s, sQLiteQuery0);
    }
}

