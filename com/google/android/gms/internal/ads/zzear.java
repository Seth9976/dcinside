package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class zzear {
    public static int zza(SQLiteDatabase sQLiteDatabase0, int v) {
        int v1 = 0;
        if(v == 2) {
            return 0;
        }
        Cursor cursor0 = zzear.zzg(sQLiteDatabase0, v);
        if(cursor0.getCount() > 0) {
            cursor0.moveToNext();
            v1 = cursor0.getInt(cursor0.getColumnIndexOrThrow("value"));
        }
        cursor0.close();
        return v1;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase0, int v) {
        long v1;
        Cursor cursor0 = zzear.zzg(sQLiteDatabase0, 2);
        if(cursor0.getCount() > 0) {
            cursor0.moveToNext();
            v1 = cursor0.getLong(cursor0.getColumnIndexOrThrow("value"));
        }
        else {
            v1 = 0L;
        }
        cursor0.close();
        return v1;
    }

    public static void zzc(SQLiteDatabase sQLiteDatabase0, long v, byte[] arr_b) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("timestamp", v);
        contentValues0.put("serialized_proto_data", arr_b);
        if(sQLiteDatabase0.update("offline_signal_contents", contentValues0, "timestamp = ?", new String[]{String.valueOf(v)}) == 0) {
            sQLiteDatabase0.insert("offline_signal_contents", null, contentValues0);
        }
    }

    public static void zzd(SQLiteDatabase sQLiteDatabase0) {
        zzear.zzh(sQLiteDatabase0, "failed_requests", 0);
        zzear.zzh(sQLiteDatabase0, "total_requests", 0);
        zzear.zzh(sQLiteDatabase0, "completed_requests", 0);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("statistic_name", "last_successful_request_time");
        contentValues0.put("value", 0L);
        sQLiteDatabase0.insert("offline_signal_statistics", null, contentValues0);
    }

    public static void zze(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.delete("offline_signal_contents", null, null);
        zzear.zzi(sQLiteDatabase0, "failed_requests", 0);
        zzear.zzi(sQLiteDatabase0, "total_requests", 0);
        zzear.zzi(sQLiteDatabase0, "completed_requests", 0);
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase0, boolean z, boolean z1) {
        if(!z1) {
            sQLiteDatabase0.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'total_requests\'");
            return;
        }
        sQLiteDatabase0.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'completed_requests\'");
        if(!z) {
            sQLiteDatabase0.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = \'failed_requests\'");
        }
    }

    private static Cursor zzg(SQLiteDatabase sQLiteDatabase0, int v) {
        String[] arr_s = new String[1];
        switch(v) {
            case 0: {
                arr_s[0] = "failed_requests";
                return sQLiteDatabase0.query("offline_signal_statistics", new String[]{"value"}, "statistic_name = ?", arr_s, null, null, null);
            }
            case 1: {
                arr_s[0] = "total_requests";
                return sQLiteDatabase0.query("offline_signal_statistics", new String[]{"value"}, "statistic_name = ?", arr_s, null, null, null);
            }
            default: {
                if(v != 2) {
                    arr_s[0] = "completed_requests";
                    return sQLiteDatabase0.query("offline_signal_statistics", new String[]{"value"}, "statistic_name = ?", arr_s, null, null, null);
                }
                arr_s[0] = "last_successful_request_time";
                return sQLiteDatabase0.query("offline_signal_statistics", new String[]{"value"}, "statistic_name = ?", arr_s, null, null, null);
            }
        }
    }

    private static void zzh(SQLiteDatabase sQLiteDatabase0, String s, int v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("statistic_name", s);
        contentValues0.put("value", 0);
        sQLiteDatabase0.insert("offline_signal_statistics", null, contentValues0);
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase0, String s, int v) {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("value", 0);
        sQLiteDatabase0.update("offline_signal_statistics", contentValues0, "statistic_name = ?", new String[]{s});
    }
}

