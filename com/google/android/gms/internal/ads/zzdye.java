package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.Map;

public final class zzdye implements zzdyg {
    private final Map zza;
    private final zzgcs zzb;
    private final zzcyo zzc;

    public zzdye(Map map0, zzgcs zzgcs0, zzcyo zzcyo0) {
        this.zza = map0;
        this.zzb = zzgcs0;
        this.zzc = zzcyo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdyg
    public final t0 zzb(zzbvk zzbvk0) {
        this.zzc.zzdl(zzbvk0);
        t0 t00 = zzgch.zzg(new zzdvy(3));
        String[] arr_s = ((String)zzbe.zzc().zza(zzbcl.zzic)).split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            zzhfj zzhfj0 = (zzhfj)this.zza.get(arr_s[v].trim());
            if(zzhfj0 != null) {
                zzdyc zzdyc0 = new zzdyc(zzhfj0, zzbvk0);
                t00 = zzgch.zzf(t00, zzdvy.class, zzdyc0, this.zzb);
            }
        }
        zzgch.zzr(t00, new zzdyd(this), zzbzw.zzg);
        return t00;
    }
}

