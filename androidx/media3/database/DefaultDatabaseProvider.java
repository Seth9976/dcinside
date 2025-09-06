package androidx.media3.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class DefaultDatabaseProvider implements DatabaseProvider {
    private final SQLiteOpenHelper a;

    public DefaultDatabaseProvider(SQLiteOpenHelper sQLiteOpenHelper0) {
        this.a = sQLiteOpenHelper0;
    }

    @Override  // androidx.media3.database.DatabaseProvider
    public SQLiteDatabase getReadableDatabase() {
        return this.a.getReadableDatabase();
    }

    @Override  // androidx.media3.database.DatabaseProvider
    public SQLiteDatabase getWritableDatabase() {
        return this.a.getWritableDatabase();
    }
}

