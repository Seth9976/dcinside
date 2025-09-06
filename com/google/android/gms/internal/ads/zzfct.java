package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzv;

final class zzfct implements zzgcd {
    final zzcex zza;
    final zzcmk zzb;
    final zzfja zzc;
    final zzebk zzd;

    zzfct(zzcex zzcex0, zzcmk zzcmk0, zzfja zzfja0, zzebk zzebk0) {
        this.zza = zzcex0;
        this.zzb = zzcmk0;
        this.zzc = zzfja0;
        this.zzd = zzebk0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        zzfbo zzfbo0 = this.zza.zzD();
        if(zzfbo0 != null && !zzfbo0.zzai) {
            zzv zzv0 = zzfbo0.zzax;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && this.zzb != null && zzcmk.zzj(((String)object0))) {
                this.zzb.zzi(((String)object0), this.zzc, zzbc.zze(), zzv0);
                return;
            }
            this.zzc.zzd(((String)object0), zzv0, null);
            return;
        }
        zzfbr zzfbr0 = this.zza.zzR();
        if(zzfbr0 == null) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long v = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        boolean z = com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza.getContext());
        boolean z1 = false;
        boolean z2 = ((Boolean)zzbe.zzc().zza(zzbcl.zzgd)).booleanValue() && zzfbo0 != null && zzfbo0.zzS;
        if(zzfbo0 != null && zzfbo0.zzad != null) {
            z1 = true;
        }
        zzebm zzebm0 = new zzebm(v, zzfbr0.zzb, ((String)object0), (!z && !z2 && !z1 ? 1 : 2));
        this.zzd.zzd(zzebm0);
    }
}

