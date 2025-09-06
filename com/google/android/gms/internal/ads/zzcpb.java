package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class zzcpb implements zzher {
    private final zzcot zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzcpb(zzcot zzcot0, zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzcot0;
        this.zzb = zzhfj0;
        this.zzc = zzhfj1;
        this.zzd = zzhfj2;
        this.zze = zzhfj3;
    }

    public static zzddk zza(zzcot zzcot0, Context context0, VersionInfoParcel versionInfoParcel0, zzfbo zzfbo0, zzfcj zzfcj0) {
        return new zzddk(new zzcor(context0, versionInfoParcel0, zzfbo0, zzfcj0), zzbzw.zzg);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Context context0 = (Context)this.zzb.zzb();
        VersionInfoParcel versionInfoParcel0 = ((zzchs)this.zzc).zza();
        zzfbo zzfbo0 = ((zzcrq)this.zzd).zza();
        zzfcj zzfcj0 = ((zzcvk)this.zze).zza();
        return zzcpb.zza(this.zza, context0, versionInfoParcel0, zzfbo0, zzfcj0);
    }
}

