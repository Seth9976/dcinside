package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

public final class zzcia implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcia(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    public final zzbve zza() {
        Context context0 = ((zzche)this.zza).zza();
        zzfhk zzfhk0 = (zzfhk)this.zzb.zzb();
        zzv.zzg().zzb(context0, VersionInfoParcel.forPackage(), zzfhk0).zza("google.afma.request.getAdDictionary", zzbod.zza, zzbod.zza);
        return new zzbvg(context0, zzv.zzg().zzb(context0, VersionInfoParcel.forPackage(), zzfhk0).zza("google.afma.sdkConstants.getSdkConstants", zzbod.zza, zzbod.zza), VersionInfoParcel.forPackage());
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

