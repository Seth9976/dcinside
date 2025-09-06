package androidx.media3.database;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class StandaloneDatabaseProvider extends SQLiteOpenHelper implements DatabaseProvider {
    public static final String a = "exoplayer_internal.db";
    private static final int b = 1;
    private static final String c = "SADatabaseProvider";

    public StandaloneDatabaseProvider(Context context0) {
        super(context0.getApplicationContext(), "exoplayer_internal.db", null, 1);
    }

    private static void a(SQLiteDatabase sQLiteDatabase0) {
        try(Cursor cursor0 = sQLiteDatabase0.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null)) {
            while(true) {
                if(!cursor0.moveToNext()) {
                    return;
                }
                String s = cursor0.getString(0);
                String s1 = cursor0.getString(1);
                if(!"sqlite_sequence".equals(s1)) {
                    String s2 = "DROP " + s + " IF EXISTS " + s1;
                    try {
                        sQLiteDatabase0.execSQL(s2);
                    }
                    catch(SQLException sQLException0) {
                        Log.e("SADatabaseProvider", "Error executing " + s2, sQLException0);
                    }
                }
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        StandaloneDatabaseProvider.a(sQLiteDatabase0);
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

