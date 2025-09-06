package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.regex.Matcher;

final class zzdxd implements zzgcd {
    final zzdxe zza;

    zzdxd(zzdxe zzdxe0) {
        this.zza = zzdxe0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            Matcher matcher0 = zzdxe.zza.matcher(throwable0.getMessage());
            if(matcher0.matches()) {
                String s = matcher0.group(1);
                this.zza.zzf.zzi(Integer.parseInt(s));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            this.zza.zzf.zzi(((zzfca)object0).zzb.zzb.zzf);
            this.zza.zzf.zzj(((zzfca)object0).zzb.zzb.zzg);
        }
    }
}

