package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

public final class zzdes implements zzcxh {
    public final Context zza;
    public final VersionInfoParcel zzb;
    public final zzfbo zzc;
    public final zzfcj zzd;

    public zzdes(Context context0, VersionInfoParcel versionInfoParcel0, zzfbo zzfbo0, zzfcj zzfcj0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
        this.zzc = zzfbo0;
        this.zzd = zzfcj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzv.zzt().zzn(this.zza, this.zzb.afmaVersion, this.zzc.zzC.toString(), this.zzd.zzf);
    }
}

