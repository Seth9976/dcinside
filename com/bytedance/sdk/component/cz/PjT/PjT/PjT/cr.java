package com.bytedance.sdk.component.cz.PjT.PjT.PjT;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.cz.PjT.Au;
import com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.PjT;
import com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.XX;
import com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.cz;
import java.util.ArrayList;

public class cr extends SQLiteOpenHelper {
    final Context PjT;

    public cr(Context context0) {
        super(context0, "ttadlog.db", null, 1);
        this.PjT = context0;
    }

    private void PjT(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL(PjT.Zh(Au.XX().cr().Zh()));
        sQLiteDatabase0.execSQL(com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT.cr.ReZ(Au.XX().cr().PjT()));
        sQLiteDatabase0.execSQL(XX.ReZ(Au.XX().cr().cr()));
        sQLiteDatabase0.execSQL(cz.PjT(Au.XX().cr().JQp()));
        sQLiteDatabase0.execSQL("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)");
    }

    private ArrayList ReZ(SQLiteDatabase sQLiteDatabase0) {
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
            }
        }
        catch(Exception unused_ex) {
        }
        return arrayList0;
    }

    private void Zh(SQLiteDatabase sQLiteDatabase0) {
        ArrayList arrayList0 = this.ReZ(sQLiteDatabase0);
        if(arrayList0 != null && arrayList0.size() > 0) {
            for(Object object0: arrayList0) {
                sQLiteDatabase0.execSQL(String.format("DROP TABLE IF EXISTS %s ;", ((String)object0)));
            }
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase0) {
        try {
            this.PjT(sQLiteDatabase0);
        }
        catch(Throwable unused_ex) {
        }
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        try {
            if(v > v1) {
                this.Zh(sQLiteDatabase0);
                this.PjT(sQLiteDatabase0);
                return;
            }
            this.PjT(sQLiteDatabase0);
        }
        catch(Throwable unused_ex) {
        }
    }
}

