package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzeae implements zzcvw, zzcxh {
    private static final Object zza;
    private static int zzb;
    private final zzg zzc;
    private final zzeao zzd;

    static {
        zzeae.zza = new Object();
    }

    public zzeae(zzeao zzeao0, zzg zzg0) {
        this.zzd = zzeao0;
        this.zzc = zzg0;
    }

    private final void zzb(boolean z) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && !this.zzc.zzN()) {
            Object object0 = zzeae.zza;
            synchronized(object0) {
                int v = zzeae.zzb;
                int v1 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzgc)));
            }
            if(v < v1) {
                this.zzd.zzd(z);
                synchronized(object0) {
                    ++zzeae.zzb;
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        this.zzb(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        this.zzb(true);
    }
}

