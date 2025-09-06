package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

public final class zzeax {
    private final zzbbj zza;
    private final Context zzb;
    private final zzeac zzc;
    private final VersionInfoParcel zzd;

    public zzeax(Context context0, VersionInfoParcel versionInfoParcel0, zzbbj zzbbj0, zzeac zzeac0) {
        this.zzb = context0;
        this.zzd = versionInfoParcel0;
        this.zza = zzbbj0;
        this.zzc = zzeac0;
    }

    final Void zza(boolean z, SQLiteDatabase sQLiteDatabase0) throws Exception {
        if(z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        Cursor cursor0 = sQLiteDatabase0.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while(cursor0.moveToNext()) {
            byte[] arr_b = cursor0.getBlob(cursor0.getColumnIndexOrThrow("serialized_proto_data"));
            try {
                arrayList0.add(zzbbq.zzaf.zza.zzx(arr_b));
            }
            catch(zzgyg zzgyg0) {
                zzo.zzg("Unable to deserialize proto from offline signals database:");
                zzo.zzg(zzgyg0.getMessage());
            }
        }
        cursor0.close();
        zzbbq.zzaf.zzc zzbbq$zzaf$zzc0 = zzbbq.zzaf.zzi();
        zzbbq$zzaf$zzc0.zzv("com.dcinside.app.android");
        zzbbq$zzaf$zzc0.zzy(Build.MODEL);
        zzbbq$zzaf$zzc0.zzA(zzear.zza(sQLiteDatabase0, 0));
        zzbbq$zzaf$zzc0.zzh(arrayList0);
        zzbbq$zzaf$zzc0.zzE(zzear.zza(sQLiteDatabase0, 1));
        zzbbq$zzaf$zzc0.zzx(zzear.zza(sQLiteDatabase0, 3));
        zzbbq$zzaf$zzc0.zzF(zzv.zzC().currentTimeMillis());
        zzbbq$zzaf$zzc0.zzB(zzear.zzb(sQLiteDatabase0, 2));
        zzbbq.zzaf zzbbq$zzaf0 = (zzbbq.zzaf)zzbbq$zzaf$zzc0.zzbn();
        int v = arrayList0.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            zzbbq.zzaf.zza zzbbq$zzaf$zza0 = (zzbbq.zzaf.zza)arrayList0.get(v2);
            if(zzbbq$zzaf$zza0.zzk() == zzbbq.zzq.zzb && zzbbq$zzaf$zza0.zze() > v1) {
                v1 = zzbbq$zzaf$zza0.zze();
            }
        }
        if(v1 != 0L) {
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("value", v1);
            sQLiteDatabase0.update("offline_signal_statistics", contentValues0, "statistic_name = \'last_successful_request_time\'", null);
        }
        zzeav zzeav0 = new zzeav(zzbbq$zzaf0);
        this.zza.zzb(zzeav0);
        zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzd();
        zzbbq$zzar$zza0.zzg(this.zzd.buddyApkVersion);
        zzbbq$zzar$zza0.zzi(this.zzd.clientJarVersion);
        zzbbq$zzar$zza0.zzh((this.zzd.isClientJar ? 0 : 2));
        zzeaw zzeaw0 = new zzeaw(((zzbbq.zzar)zzbbq$zzar$zza0.zzbn()));
        this.zza.zzb(zzeaw0);
        this.zza.zzc(10004);
        zzear.zze(sQLiteDatabase0);
        return null;
    }

    public final void zzb(boolean z) {
        try {
            zzeau zzeau0 = new zzeau(this, z);
            this.zzc.zza(zzeau0);
        }
        catch(Exception exception0) {
            zzo.zzg(("Error in offline signals database startup: " + exception0.getMessage()));
        }
    }
}

