package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class zzcvp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcvp(zzcvo zzcvo0, zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @Nullable
    public final Object zzb() {
        Object object0 = this.zza.zzb();
        VersionInfoParcel versionInfoParcel0 = ((zzchs)this.zzb).zza();
        zzfbo zzfbo0 = ((zzcrq)this.zzc).zza();
        zzbxq zzbxq0 = new zzbxq();
        zzbxr zzbxr0 = zzfbo0.zzA;
        if(zzbxr0 != null) {
            return zzfbo0.zzs == null ? new zzbxp(((Context)object0), versionInfoParcel0, zzbxr0, null, zzbxq0) : new zzbxp(((Context)object0), versionInfoParcel0, zzbxr0, zzfbo0.zzs.zzb, zzbxq0);
        }
        return null;
    }
}

