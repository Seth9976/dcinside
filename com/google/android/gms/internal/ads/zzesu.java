package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.t0;
import java.util.List;

public final class zzesu implements zzgbn {
    public final zzesx zza;
    public final String zzb;
    public final List zzc;
    public final Bundle zzd;
    public final boolean zze;
    public final boolean zzf;

    public zzesu(zzesx zzesx0, String s, List list0, Bundle bundle0, boolean z, boolean z1) {
        this.zza = zzesx0;
        this.zzb = s;
        this.zzc = list0;
        this.zzd = bundle0;
        this.zze = z;
        this.zzf = z1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbn
    public final t0 zza() {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

