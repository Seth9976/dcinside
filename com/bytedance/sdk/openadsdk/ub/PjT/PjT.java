package com.bytedance.sdk.openadsdk.ub.PjT;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.RD;
import java.util.ArrayList;

public class PjT extends SQLiteOpenHelper {
    final Context PjT;
    private static volatile PjT Zh;

    static {
    }

    private PjT(Context context0) {
        super(context0, "pag_monitor.db", null, 1);
        this.PjT = context0;
    }

    public static SQLiteDatabase PjT() {
        try {
            PjT pjT0 = PjT.ReZ();
            if(pjT0 != null) {
                SQLiteDatabase sQLiteDatabase0 = pjT0.getWritableDatabase();
                if(sQLiteDatabase0.isOpen()) {
                    return sQLiteDatabase0;
                }
            }
        }
        catch(Throwable throwable0) {
            Log.i("MonitorSQLiteOpenHelper", throwable0.getMessage());
        }
        return null;
    }

    private void PjT(SQLiteDatabase sQLiteDatabase0) {
        ArrayList arrayList0 = this.Zh(sQLiteDatabase0);
        if(arrayList0 != null && arrayList0.size() > 0) {
            for(Object object0: arrayList0) {
                sQLiteDatabase0.execSQL(String.format("DROP TABLE IF EXISTS %s ;", ((String)object0)));
            }
        }
    }

    private static PjT ReZ() {
        if(PjT.Zh == null) {
            Class class0 = PjT.class;
            __monitor_enter(class0);
            try {
                if(PjT.Zh == null) {
                    PjT.Zh = new PjT(com.bytedance.sdk.openadsdk.ub.PjT.PjT());
                }
                __monitor_exit(class0);
                return PjT.Zh;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return PjT.Zh;
    }

    public static SQLiteDatabase Zh() {
        try {
            PjT pjT0 = PjT.ReZ();
            if(pjT0 != null) {
                SQLiteDatabase sQLiteDatabase0 = pjT0.getReadableDatabase();
                if(sQLiteDatabase0.isOpen()) {
                    return sQLiteDatabase0;
                }
            }
        }
        catch(Throwable throwable0) {
            Log.i("MonitorSQLiteOpenHelper", throwable0.getMessage());
        }
        return null;
    }

    private ArrayList Zh(SQLiteDatabase sQLiteDatabase0) {
        ArrayList arrayList0 = new ArrayList();
        try {
            Cursor cursor0 = sQLiteDatabase0.rawQuery("select name from sqlite_master where type=\'table\' order by name", null);
            if(cursor0 != null) {
                while(cursor0.moveToNext()) {
                    String s = cursor0.getString(0);
                    if(!s.equals("android_metadata") && !s.equals("sqlite_sequence")) {
                        arrayList0.add(s);
                    }
                }
                cursor0.close();
                return arrayList0;
            }
        }
        catch(Exception exception0) {
            RD.Zh("MonitorSQLiteOpenHelper", exception0.getMessage());
        }
        return arrayList0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
        try {
            sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        }
        catch(Throwable throwable0) {
            Log.e("MonitorSQLiteOpenHelper", throwable0.getMessage());
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        try {
            if(v > v1) {
                this.PjT(sQLiteDatabase0);
                this.onCreate(sQLiteDatabase0);
                return;
            }
            this.onCreate(sQLiteDatabase0);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
    }
}

