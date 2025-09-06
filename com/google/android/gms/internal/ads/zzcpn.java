package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;

public final class zzcpn implements zzcwn {
    @Nullable
    private final zzcex zza;
    private final zzdrw zzb;
    private final zzfbo zzc;

    zzcpn(@Nullable zzcex zzcex0, zzdrw zzdrw0, zzfbo zzfbo0) {
        this.zza = zzcex0;
        this.zzb = zzdrw0;
        this.zzc = zzfbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
            zzcex zzcex0 = this.zza;
            if(zzcex0 != null) {
                String s = zzac.zza(zzcex0.zzF()) ? "1" : "0";
                zzdrv zzdrv0 = this.zzb.zza();
                zzdrv0.zzb("action", "hcp");
                zzdrv0.zzb("hcp", s);
                zzdrv0.zzc(this.zzc);
                zzdrv0.zzg();
            }
        }
    }
}

