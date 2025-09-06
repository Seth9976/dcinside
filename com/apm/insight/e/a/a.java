package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.runtime.j;
import java.util.HashMap;

public abstract class a {
    protected final String a;
    private String b;

    protected a(String s) {
        this.b = "_id";
        this.a = s;
    }

    protected abstract ContentValues a(Object arg1);

    protected abstract HashMap a();

    public final void a(SQLiteDatabase sQLiteDatabase0) {
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("CREATE TABLE ");
            stringBuilder0.append(this.a);
            stringBuilder0.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
            HashMap hashMap0 = this.a();
            for(Object object0: hashMap0.keySet()) {
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(" ");
                stringBuilder0.append(((String)hashMap0.get(((String)object0))));
                stringBuilder0.append(",");
            }
            stringBuilder0.delete(stringBuilder0.length() - 1, stringBuilder0.length());
            stringBuilder0.append(")");
            sQLiteDatabase0.execSQL(stringBuilder0.toString());
            return;
        }
        catch(Throwable throwable0) {
        }
        j.a(throwable0, "NPTH_CATCH");
    }

    public void a(SQLiteDatabase sQLiteDatabase0, Object object0) {
        if(sQLiteDatabase0 != null && object0 != null) {
            try {
                ContentValues contentValues0 = this.a(object0);
                sQLiteDatabase0.insert(this.a, null, contentValues0);
            }
            catch(Throwable throwable0) {
                com.apm.insight.a.b(throwable0);
            }
        }
    }
}

