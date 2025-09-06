package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzebk extends zzfpy {
    private final Context zza;
    private final zzgcs zzb;

    public zzebk(Context context0, zzgcs zzgcs0) {
        super(context0, "AdMobOfflineBufferedPings.db", null, ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzik)))), zzfqa.zza);
        this.zza = context0;
        this.zzb = zzgcs0;
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase0) {
        sQLiteDatabase0.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override  // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase0, int v, int v1) {
        sQLiteDatabase0.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final Void zza(zzebm zzebm0, SQLiteDatabase sQLiteDatabase0) throws Exception {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("timestamp", zzebm0.zza);
        contentValues0.put("gws_query_id", zzebm0.zzb);
        contentValues0.put("url", zzebm0.zzc);
        contentValues0.put("event_state", ((int)(zzebm0.zzd - 1)));
        sQLiteDatabase0.insert("offline_buffered_pings", null, contentValues0);
        zzbr zzbr0 = zzs.zzA(this.zza);
        if(zzbr0 != null) {
            try {
                zzbr0.zze(ObjectWrapper.wrap(this.zza));
                return null;
            }
            catch(RemoteException remoteException0) {
                zze.zzb("Failed to schedule offline ping sender.", remoteException0);
            }
        }
        return null;
    }

    static Void zzb(zzu zzu0, SQLiteDatabase sQLiteDatabase0) throws Exception {
        zzebk.zzj(sQLiteDatabase0, zzu0);
        return null;
    }

    public final void zzc(String s) {
        this.zze(new zzebi(this, s));
    }

    public final void zzd(zzebm zzebm0) {
        this.zze(new zzebe(this, zzebm0));
    }

    final void zze(zzffr zzffr0) {
        zzebg zzebg0 = new zzebg(this);
        zzgch.zzr(this.zzb.zzb(zzebg0), new zzebj(this, zzffr0), this.zzb);
    }

    // 检测为 Lambda 实现
    static void zzf(SQLiteDatabase sQLiteDatabase0, String s, zzu zzu0) [...]

    final void zzg(SQLiteDatabase sQLiteDatabase0, zzu zzu0, String s) {
        zzebh zzebh0 = () -> {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("event_state", 1);
            sQLiteDatabase0.update("offline_buffered_pings", contentValues0, "gws_query_id = ?", new String[]{s});
            zzebk.zzj(sQLiteDatabase0, zzu0);
        };
        this.zzb.execute(zzebh0);
    }

    public final void zzh(zzu zzu0, String s) {
        this.zze(new zzebf(this, zzu0, s));
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase0, String s) {
        sQLiteDatabase0.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{s, "0"});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase0, zzu zzu0) {
        String[] arr_s;
        String s1;
        sQLiteDatabase0.beginTransaction();
        try {
            Cursor cursor0 = sQLiteDatabase0.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = " + 1, null, null, null, "timestamp ASC", null);
            int v1 = cursor0.getCount();
            arr_s = new String[v1];
            for(int v3 = 0; cursor0.moveToNext(); ++v3) {
                int v4 = cursor0.getColumnIndex("timestamp");
                int v5 = cursor0.getColumnIndex("url");
                if(v5 != -1) {
                    long v6 = cursor0.getLong(v4);
                    String s = cursor0.getString(v5);
                    if(s == null) {
                        s1 = "";
                    }
                    else {
                        Uri uri0 = Uri.parse(s);
                        long v7 = zzv.zzC().currentTimeMillis();
                        String s2 = uri0.getEncodedQuery();
                        Uri.Builder uri$Builder0 = uri0.buildUpon().clearQuery();
                        uri$Builder0.appendQueryParameter("bd", Long.toString(v7 - v6));
                        s1 = uri$Builder0.build() + "&" + s2;
                    }
                    arr_s[v3] = s1;
                }
            }
            cursor0.close();
            sQLiteDatabase0.delete("offline_buffered_pings", "event_state = ?", new String[]{"1"});
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            zzu0.zza(arr_s[v2]);
        }
    }
}

