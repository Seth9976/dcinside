package androidx.media3.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class VersionTable {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 1000;
    private static final String f = "ExoPlayerVersions";
    private static final String g = "feature";
    private static final String h = "instance_uid";
    private static final String i = "version";
    private static final String j = "feature = ? AND instance_uid = ?";
    private static final String k = "PRIMARY KEY (feature, instance_uid)";
    private static final String l = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    static {
        MediaLibraryInfo.a("media3.database");
    }

    private static String[] a(int v, String s) {
        return new String[]{Integer.toString(v), s};
    }

    public static int b(SQLiteDatabase sQLiteDatabase0, int v, String s) throws DatabaseIOException {
        try {
            if(!Util.s2(sQLiteDatabase0, "ExoPlayerVersions")) {
                return -1;
            }
            try(Cursor cursor0 = sQLiteDatabase0.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", VersionTable.a(v, s), null, null, null)) {
                if(cursor0.getCount() == 0) {
                    return -1;
                }
                cursor0.moveToNext();
                return cursor0.getInt(0);
            }
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase0, int v, String s) throws DatabaseIOException {
        try {
            if(!Util.s2(sQLiteDatabase0, "ExoPlayerVersions")) {
                return;
            }
            sQLiteDatabase0.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", VersionTable.a(v, s));
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase0, int v, String s, int v1) throws DatabaseIOException {
        try {
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("feature", v);
            contentValues0.put("instance_uid", s);
            contentValues0.put("version", v1);
            sQLiteDatabase0.replaceOrThrow("ExoPlayerVersions", null, contentValues0);
        }
        catch(SQLException sQLException0) {
            throw new DatabaseIOException(sQLException0);
        }
    }
}

