package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzcf;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import jeb.synthetic.TWR;

public final class zzaw {
    @WorkerThread
    private static Set zza(SQLiteDatabase sQLiteDatabase0, String s) {
        try {
            Set set0 = new HashSet();
            try(Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT * FROM " + s + " LIMIT 0", null)) {
                Collections.addAll(set0, cursor0.getColumnNames());
            }
            return set0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    static void zza(zzgo zzgo0, SQLiteDatabase sQLiteDatabase0) {
        if(zzgo0 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file0 = new File(zzcf.zza().zza(sQLiteDatabase0.getPath()));
        if(!file0.setReadable(false, false)) {
            zzgo0.zzu().zza("Failed to turn off database read permission");
        }
        if(!file0.setWritable(false, false)) {
            zzgo0.zzu().zza("Failed to turn off database write permission");
        }
        if(!file0.setReadable(true, true)) {
            zzgo0.zzu().zza("Failed to turn on database read permission for owner");
        }
        if(!file0.setWritable(true, true)) {
            zzgo0.zzu().zza("Failed to turn on database write permission for owner");
        }
    }

    @WorkerThread
    static void zza(zzgo zzgo0, SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2, String[] arr_s) throws SQLiteException {
        if(zzgo0 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if(!zzaw.zza(zzgo0, sQLiteDatabase0, s)) {
            sQLiteDatabase0.execSQL(s1);
        }
        try {
            Set set0 = zzaw.zza(sQLiteDatabase0, s);
            String[] arr_s1 = s2.split(",");
            for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                String s3 = arr_s1[v1];
                if(!set0.remove(s3)) {
                    throw new SQLiteException("Table " + s + " is missing required column: " + s3);
                }
            }
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; v += 2) {
                    if(!set0.remove(arr_s[v])) {
                        sQLiteDatabase0.execSQL(arr_s[v + 1]);
                    }
                }
            }
            if(!set0.isEmpty()) {
                zzgo0.zzu().zza("Table has extra columns. table, columns", s, TextUtils.join(", ", set0));
            }
            return;
        }
        catch(SQLiteException sQLiteException0) {
        }
        zzgo0.zzg().zza("Failed to verify columns on table that was just created", s);
        throw sQLiteException0;
    }

    @WorkerThread
    private static boolean zza(zzgo zzgo0, SQLiteDatabase sQLiteDatabase0, String s) {
        boolean z;
        Cursor cursor0;
        if(zzgo0 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        try {
            try {
                cursor0 = null;
                cursor0 = sQLiteDatabase0.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{s}, null, null, null);
                z = cursor0.moveToFirst();
                goto label_13;
            }
            catch(SQLiteException sQLiteException0) {
            }
            zzgo0.zzu().zza("Error querying for table", s, sQLiteException0);
            if(cursor0 != null) {
                goto label_8;
            }
            return false;
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
    label_8:
        cursor0.close();
        return false;
    label_11:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_13:
        cursor0.close();
        return z;
    }
}

