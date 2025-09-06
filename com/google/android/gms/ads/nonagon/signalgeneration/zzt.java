package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class zzt extends LinkedHashMap {
    final zzv zza;

    zzt(zzv zzv0) {
        this.zza = zzv0;
        super();
    }

    @Override
    protected final boolean removeEldestEntry(Map.Entry map$Entry0) {
        synchronized(this.zza) {
            zzv zzv1 = this.zza;
            boolean z = false;
            if(this.size() <= zzv1.zza) {
                return false;
            }
            zzv1.zzf.add(new Pair(((String)map$Entry0.getKey()), ((zzu)map$Entry0.getValue()).zzb));
            if(this.size() > this.zza.zza) {
                z = true;
            }
            return z;
        }
    }
}

