package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbxx {
    private final zzg zza;

    zzbxx(Clock clock0, zzg zzg0, zzbyi zzbyi0) {
        this.zza = zzg0;
    }

    public final void zza(int v, long v1) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaD)).booleanValue()) {
            return;
        }
        if(v1 - this.zza.zzf() < 0L) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzaE)).booleanValue()) {
            this.zza.zzH(-1);
            this.zza.zzI(v1);
            return;
        }
        this.zza.zzH(v);
        this.zza.zzI(v1);
    }
}

