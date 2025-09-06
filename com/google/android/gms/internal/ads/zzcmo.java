package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.List;

public final class zzcmo implements zzcvw {
    private final zzfbr zza;
    private final zzfca zzb;
    private final zzfiv zzc;
    private final zzfja zzd;

    public zzcmo(zzfca zzfca0, zzfja zzfja0, zzfiv zzfiv0) {
        this.zzb = zzfca0;
        this.zzd = zzfja0;
        this.zzc = zzfiv0;
        this.zza = zzfca0.zzb.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        List list0 = this.zzc.zzc(this.zzb, null, this.zza.zza);
        this.zzd.zze(list0, null);
    }
}

