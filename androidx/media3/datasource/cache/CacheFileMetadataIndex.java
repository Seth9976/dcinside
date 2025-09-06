package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.Assertions;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.DatabaseProvider;
import androidx.media3.database.VersionTable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class CacheFileMetadataIndex {
    private final DatabaseProvider a;
    private String b;
    private static final String c = "ExoPlayerCacheFileMetadata";
    private static final int d = 1;
    private static final String e = "name";
    private static final String f = "length";
    private static final String g = "last_touch_timestamp";
    private static final int h = 0;
    private static final int i = 1;
    private static final int j = 2;
    private static final String k = "name = ?";
    private static final String[] l = null;
    private static final String m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    static {
        CacheFileMetadataIndex.l = new String[]{"name", "length", "last_touch_timestamp"};
    }

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider0) {
        this.a = databaseProvider0;
    }

    @WorkerThread
    public static void a(DatabaseProvider databaseProvider0, long v) throws DatabaseIOException {
        try {
            String s = Long.toHexString(v);
            SQLiteDatabase sQLiteDatabase0 = databaseProvider0.getWritableDatabase();
            sQLiteDatabase0.beginTransactionNonExclusive();
            try {
                VersionTable.c(sQLiteDatabase0, 2, s);
                CacheFileMetadataIndex.b(sQLiteDatabase0, "ExoPlayerCacheFileMetadata" + s);
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            return;
        }
        catch(SQLException sQLException0) {
        }
        throw new DatabaseIOException(sQLException0);
    }

    private static void b(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS " + s);
    }

    @WorkerThread
    public Map c() throws DatabaseIOException {
        try(Cursor cursor0 = this.d()) {
            Map map0 = new HashMap(cursor0.getCount());
            while(true) {
                if(!cursor0.moveToNext()) {
                    break;
                }
                map0.put(((String)Assertions.g(cursor0.getString(0))), new CacheFileMetadata(cursor0.getLong(1), cursor0.getLong(2)));
            }
            return map0;
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    private Cursor d() {
        Assertions.g(this.b);
        return this.a.getReadableDatabase().query(this.b, CacheFileMetadataIndex.l, null, null, null, null, null);
    }

    private static String e(String s) [...] // Inlined contents

    @WorkerThread
    public void f(long v) throws DatabaseIOException {
        try {
            String s = Long.toHexString(v);
            this.b = "ExoPlayerCacheFileMetadata" + s;
            if(VersionTable.b(this.a.getReadableDatabase(), 2, s) != 1) {
                SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
                sQLiteDatabase0.beginTransactionNonExclusive();
                try {
                    VersionTable.d(sQLiteDatabase0, 2, s, 1);
                    CacheFileMetadataIndex.b(sQLiteDatabase0, this.b);
                    sQLiteDatabase0.execSQL("CREATE TABLE " + this.b + " " + "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    sQLiteDatabase0.setTransactionSuccessful();
                }
                finally {
                    sQLiteDatabase0.endTransaction();
                }
                return;
            }
            return;
        }
        catch(SQLException sQLException0) {
        }
        throw new DatabaseIOException(sQLException0);
    }

    @WorkerThread
    public void g(String s) throws DatabaseIOException {
        Assertions.g(this.b);
        try {
            this.a.getWritableDatabase().delete(this.b, "name = ?", new String[]{s});
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    @WorkerThread
    public void h(Set set0) throws DatabaseIOException {
        Assertions.g(this.b);
        try {
            SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
            sQLiteDatabase0.beginTransactionNonExclusive();
            try {
                for(Object object0: set0) {
                    sQLiteDatabase0.delete(this.b, "name = ?", new String[]{((String)object0)});
                }
                sQLiteDatabase0.setTransactionSuccessful();
            }
            finally {
                sQLiteDatabase0.endTransaction();
            }
            return;
        }
        catch(SQLException sQLException0) {
        }
        throw new DatabaseIOException(sQLException0);
    }

    @WorkerThread
    public void i(String s, long v, long v1) throws DatabaseIOException {
        Assertions.g(this.b);
        try {
            SQLiteDatabase sQLiteDatabase0 = this.a.getWritableDatabase();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("name", s);
            contentValues0.put("length", v);
            contentValues0.put("last_touch_timestamp", v1);
            sQLiteDatabase0.replaceOrThrow(this.b, null, contentValues0);
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }
}

