package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzfcr implements zzbjp {
    public final zzdds zza;
    public final zzcmk zzb;
    public final zzfja zzc;
    public final zzebk zzd;

    public zzfcr(zzdds zzdds0, zzcmk zzcmk0, zzfja zzfja0, zzebk zzebk0) {
        this.zza = zzdds0;
        this.zzb = zzcmk0;
        this.zzc = zzfja0;
        this.zzd = zzebk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzbjo.zzc(map0, this.zza);
        String s = (String)map0.get("u");
        if(s == null) {
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        zzgch.zzr(zzbjo.zza(((zzcex)object0), s), new zzfct(((zzcex)object0), this.zzb, this.zzc, this.zzd), zzbzw.zza);
    }
}

