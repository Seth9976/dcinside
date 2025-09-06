package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy.zzf.zza;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzjt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.TWR;

public final class zzar {
    private final String zza;
    private long zzb;
    private final zzal zzc;

    public zzar(zzal zzal0, String s) {
        this.zzc = zzal0;
        super();
        this.zzb = -1L;
        Preconditions.checkNotEmpty(s);
        this.zza = s;
    }

    public final List zza() {
        zza zzfy$zzf$zza0;
        List list1;
        List list0 = new ArrayList();
        String[] arr_s = {this.zza, String.valueOf(this.zzb)};
        Cursor cursor0 = null;
        try {
            cursor0 = this.zzc.e_().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", arr_s, null, null, "rowid", "1000");
            if(!cursor0.moveToFirst()) {
                list1 = Collections.emptyList();
                goto label_6;
            }
            goto label_8;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_32;
        }
    label_6:
        cursor0.close();
        return list1;
        try {
            do {
            label_8:
                long v = cursor0.getLong(0);
                long v1 = cursor0.getLong(3);
                boolean z = cursor0.getLong(5) == 1L;
                byte[] arr_b = cursor0.getBlob(4);
                if(v > this.zzb) {
                    this.zzb = v;
                }
                try {
                    zzfy$zzf$zza0 = (zza)zzoo.zza(zzf.zze(), arr_b);
                }
                catch(IOException iOException0) {
                    this.zzc.zzj().zzg().zza("Data loss. Failed to merge raw event. appId", zzgo.zza(this.zza), iOException0);
                    continue;
                }
                String s = cursor0.getString(1);
                if(s == null) {
                    s = "";
                }
                zzfy$zzf$zza0.zza(s).zzb(cursor0.getLong(2));
                list0.add(new zzap(v, v1, z, ((zzf)(((zzjt)zzfy$zzf$zza0.zzai())))));
            }
            while(cursor0.moveToNext());
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_27:
                this.zzc.zzj().zzg().zza("Data loss. Error querying raw events batch. appId", zzgo.zza(this.zza), sQLiteException0);
                if(cursor0 != null) {
                    goto label_29;
                }
                return list0;
            }
            catch(Throwable throwable0) {
                goto label_32;
            }
        label_29:
            cursor0.close();
            return list0;
        }
        catch(Throwable throwable0) {
        label_32:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return list0;
    }
}

