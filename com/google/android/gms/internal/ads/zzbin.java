package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzbin implements zzbjp {
    public final zzdds zza;
    public final zzcmk zzb;

    public zzbin(zzdds zzdds0, zzcmk zzcmk0) {
        this.zza = zzdds0;
        this.zzb = zzcmk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzbjo.zzc(map0, this.zza);
        String s = (String)map0.get("u");
        if(s == null) {
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        zzgch.zzr(((zzgby)zzgch.zzn(zzgby.zzu(zzbjo.zza(((zzcex)object0), s)), new zzbiq(this.zzb, s), zzbzw.zza)), new zzbjd(((zzcex)object0)), zzbzw.zza);
    }
}

