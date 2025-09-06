package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class zzfgs implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzfgs(zzfgr zzfgr0, zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Context context0 = ((zzche)this.zza).zza();
        VersionInfoParcel versionInfoParcel0 = ((zzchs)this.zzb).zza();
        zzfhk zzfhk0 = (zzfhk)this.zzc.zzb();
        zzbog zzbog0 = new zzbnx().zza(context0, versionInfoParcel0, zzfhk0);
        zzhez.zzb(zzbog0);
        return zzbog0;
    }
}

