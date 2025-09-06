package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class zzdpv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzdpv(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Context context0 = ((zzche)this.zza).zza();
        String s = ((zzdws)this.zzb).zza();
        VersionInfoParcel versionInfoParcel0 = ((zzchs)this.zzc).zza();
        zzbbq.zza.zza zzbbq$zza$zza0 = (zzbbq.zza.zza)this.zzd.zzb();
        String s1 = (String)this.zze.zzb();
        zzbbj zzbbj0 = new zzbbj(new zzbbp(context0));
        zzbbq.zzar.zza zzbbq$zzar$zza0 = zzbbq.zzar.zzd();
        zzbbq$zzar$zza0.zzg(versionInfoParcel0.buddyApkVersion);
        zzbbq$zzar$zza0.zzi(versionInfoParcel0.clientJarVersion);
        zzbbq$zzar$zza0.zzh((versionInfoParcel0.isClientJar ? 0 : 2));
        zzbbj0.zzb(new zzdpu(zzbbq$zza$zza0, s, ((zzbbq.zzar)zzbbq$zzar$zza0.zzbn()), s1));
        return zzbbj0;
    }
}

