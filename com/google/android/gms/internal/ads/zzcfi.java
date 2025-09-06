package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.common.util.concurrent.t0;

public final class zzcfi implements zzgbn {
    public final Context zza;
    public final zzava zzb;
    public final VersionInfoParcel zzc;
    public final zza zzd;
    public final zzebv zze;
    public final zzfcn zzf;
    public final String zzg;

    public zzcfi(Context context0, zzava zzava0, VersionInfoParcel versionInfoParcel0, zza zza0, zzebv zzebv0, zzfcn zzfcn0, String s) {
        this.zza = context0;
        this.zzb = zzava0;
        this.zzc = versionInfoParcel0;
        this.zzd = zza0;
        this.zze = zzebv0;
        this.zzf = zzfcn0;
        this.zzg = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbn
    public final t0 zza() {
        zzcgr zzcgr0 = zzcgr.zza();
        zzbbj zzbbj0 = zzbbj.zza();
        zzcex zzcex0 = zzcfk.zza(this.zza, zzcgr0, "", false, false, this.zzb, null, this.zzc, null, null, this.zzd, zzbbj0, null, null, this.zze, this.zzf);
        t0 t00 = zzcaa.zza(zzcex0);
        zzcex0.zzN().zzC(new zzcfh(((zzcaa)t00)));
        zzcex0.loadUrl(this.zzg);
        return t00;
    }
}

