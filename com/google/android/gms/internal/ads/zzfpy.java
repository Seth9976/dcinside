package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class zzfpy extends SQLiteOpenHelper {
    public zzfpy(Context context0, String s, SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0, int v, zzfqa zzfqa0) {
        if(s.equals("")) {
            s = null;
        }
        super(context0, s, null, v);
    }
}

