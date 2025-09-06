package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import java.util.Map;

final class zzbjz implements zzaa {
    boolean zza;
    final boolean zzb;
    final zza zzc;
    final Map zzd;
    final Map zze;

    zzbjz(zzbkb zzbkb0, boolean z, zza zza0, Map map0, Map map1) {
        this.zzb = z;
        this.zzc = zza0;
        this.zzd = map0;
        this.zze = map1;
        super();
        this.zza = false;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if(!this.zza) {
            if(z && this.zzb) {
                ((zzdds)this.zzc).zzdd();
            }
            this.zza = true;
            String s = (String)this.zze.get("event_id");
            this.zzd.put(s, Boolean.valueOf(z));
            ((zzbmk)this.zzc).zzd("openIntentAsync", this.zzd);
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int v) {
    }
}

