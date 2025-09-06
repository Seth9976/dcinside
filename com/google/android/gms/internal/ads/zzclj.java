package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;

final class zzclj implements zzcla {
    private final zzecu zza;

    zzclj(zzecu zzecu0) {
        this.zza = zzecu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            return;
        }
        zzgby zzgby0 = zzgby.zzu(this.zza.zza(true));
        zzcli zzcli0 = new zzcli();
        zzgby zzgby1 = (zzgby)zzgch.zzf(zzgby0, Throwable.class, zzcli0, zzbzw.zza);
    }
}

