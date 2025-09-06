package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

public final class zzezh implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzezh(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
    }

    public final zzezf zza() {
        Context context0 = (Context)this.zza.zzb();
        zzfds zzfds0 = (zzfds)this.zzb.zzb();
        zzfek zzfek0 = (zzfek)this.zzc.zzb();
        zzbzg zzbzg0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzgg)).booleanValue() ? zzv.zzp().zzi().zzg() : zzv.zzp().zzi().zzh();
        if(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgw)))) > 0 && (!((Boolean)zzbe.zzc().zza(zzbcl.zzgf)).booleanValue() || zzbzg0 != null && zzbzg0.zzh())) {
            zzeyj zzeyj0 = new zzeyj(new zzeyg());
            zzfej zzfej0 = zzfek0.zza(zzfea.zzc, context0, zzfds0, zzeyj0);
            zzeyv zzeyv0 = new zzeyv(new zzeyu());
            zzeyr zzeyr0 = new zzeyr(zzfej0.zza, zzbzw.zza);
            zzfed zzfed0 = zzfej0.zza.zza();
            return new zzeyl(zzeyv0, zzeyr0, zzfej0.zzb, zzfed0.zzf, zzbzw.zza);
        }
        return new zzeyu();
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

