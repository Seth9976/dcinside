package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;

public final class zzfcv {
    private final zzfbo zza;
    private final zzfbr zzb;
    private final zzfja zzc;
    private final zzfir zzd;
    private final zzfhh zze;
    private final zzcmk zzf;

    @VisibleForTesting
    public zzfcv(zzfja zzfja0, zzfir zzfir0, zzfbo zzfbo0, zzfbr zzfbr0, zzcmk zzcmk0, zzfhh zzfhh0) {
        this.zza = zzfbo0;
        this.zzb = zzfbr0;
        this.zzc = zzfja0;
        this.zzd = zzfir0;
        this.zzf = zzcmk0;
        this.zze = zzfhh0;
    }

    public final void zza(List list0) {
        for(Object object0: list0) {
            this.zzb(((String)object0), 2);
        }
    }

    public final void zzb(String s, int v) {
        zzfbo zzfbo0 = this.zza;
        if(!zzfbo0.zzai) {
            this.zzc.zzd(s, zzfbo0.zzax, this.zze);
            return;
        }
        this.zzd.zza(s, this.zzb.zzb, v);
    }

    public final void zzc(List list0, int v) {
        for(Object object0: list0) {
            String s = (String)object0;
            zzgch.zzr((!((Boolean)zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() || !zzcmk.zzj(s) ? zzgch.zzh(s) : this.zzf.zzb(s, zzbc.zze())), new zzfcu(this, v), zzbzw.zza);
        }
    }
}

