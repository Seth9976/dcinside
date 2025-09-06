package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.ArrayList;
import java.util.concurrent.Callable;

final class zziy implements Callable {
    private final zzo zza;
    private final Bundle zzb;
    private final zzic zzc;

    zziy(zzic zzic0, zzo zzo0, Bundle bundle0) {
        this.zza = zzo0;
        this.zzb = bundle0;
        this.zzc = zzic0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        this.zzc.zza.zzr();
        zznv zznv0 = this.zzc.zza;
        zzo zzo0 = this.zza;
        Bundle bundle0 = this.zzb;
        zznv0.zzl().zzt();
        if(zzpn.zza() && zznv0.zze().zze(zzo0.zza, zzbh.zzch) && zzo0.zza != null) {
            if(bundle0 != null) {
                int[] arr_v = bundle0.getIntArray("uriSources");
                long[] arr_v1 = bundle0.getLongArray("uriTimestamps");
                if(arr_v != null) {
                    if(arr_v1 != null && arr_v1.length == arr_v.length) {
                        for(int v = 0; v < arr_v.length; ++v) {
                            zzal zzal0 = zznv0.zzf();
                            String s = zzo0.zza;
                            int v1 = arr_v[v];
                            long v2 = arr_v1[v];
                            Preconditions.checkNotEmpty(s);
                            zzal0.zzt();
                            zzal0.zzal();
                            try {
                                int v3 = zzal0.e_().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{s, String.valueOf(v1), String.valueOf(v2)});
                                zzal0.zzj().zzp().zza("Pruned " + v3 + " trigger URIs. appId, source, timestamp", s, v1, v2);
                            }
                            catch(SQLiteException sQLiteException0) {
                                zzal0.zzj().zzg().zza("Error pruning trigger URIs. appId", zzgo.zza(s), sQLiteException0);
                            }
                        }
                        return zznv0.zzf().zzk(zzo0.zza);
                    }
                    zznv0.zzj().zzg().zza("Uri sources and timestamps do not match");
                }
            }
            return zznv0.zzf().zzk(zzo0.zza);
        }
        return new ArrayList();
    }
}

