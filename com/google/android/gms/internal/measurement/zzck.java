package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class zzck extends SQLiteOpenHelper {
    public zzck(Context context0, String s, SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0, int v) {
        this(context0, s, null, 1, zzcm.zza);
    }

    private zzck(Context context0, String s, SQLiteDatabase.CursorFactory sQLiteDatabase$CursorFactory0, int v, zzcm zzcm0) {
        if(s == null) {
            s = null;
        }
        else if(zzcf.zza().zza(s, zzcm0, zzcj.zzb).equals("")) {
            s = null;
        }
        super(context0, s, null, 1);
    }
}

