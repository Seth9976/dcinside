package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;

final class zzbzi extends zzb {
    final zzbzm zza;

    zzbzi(zzbzm zzbzm0) {
        this.zza = zzbzm0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbco zzbco0 = new zzbco(this.zza.zze, this.zza.zzf.afmaVersion);
        synchronized(this.zza.zza) {
            try {
                zzbcr.zza(this.zza.zzh, zzbco0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzo.zzk("Cannot config CSI reporter.", illegalArgumentException0);
            }
        }
    }
}

