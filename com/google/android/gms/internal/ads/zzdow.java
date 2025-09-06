package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;

public final class zzdow {
    private final Context zza;
    private final zzava zzb;
    private final zzbds zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbbj zzf;
    private final zzcyl zzg;
    private final zzebv zzh;
    private final zzfcn zzi;

    public zzdow(zzcfk zzcfk0, Context context0, zzava zzava0, zzbds zzbds0, VersionInfoParcel versionInfoParcel0, zza zza0, zzbbj zzbbj0, zzcyl zzcyl0, zzebv zzebv0, zzfcn zzfcn0) {
        this.zza = context0;
        this.zzb = zzava0;
        this.zzc = zzbds0;
        this.zzd = versionInfoParcel0;
        this.zze = zza0;
        this.zzf = zzbbj0;
        this.zzg = zzcyl0;
        this.zzh = zzebv0;
        this.zzi = zzfcn0;
    }

    public final zzcex zza(zzs zzs0, zzfbo zzfbo0, zzfbr zzfbr0) throws zzcfj {
        zzcgr zzcgr0 = zzcgr.zzc(zzs0);
        zzdol zzdol0 = new zzdol(this);
        return zzcfk.zza(this.zza, zzcgr0, zzs0.zza, false, false, this.zzb, this.zzc, this.zzd, null, zzdol0, this.zze, this.zzf, zzfbo0, zzfbr0, this.zzh, this.zzi);
    }
}

