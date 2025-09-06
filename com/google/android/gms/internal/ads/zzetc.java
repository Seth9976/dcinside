package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzetc implements zzetq {
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    @Nullable
    public final Long zze;

    public zzetc(@Nullable String s, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable Long long0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = s3;
        this.zze = long0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        zzfcx.zzc(((zzcuv)object0).zzb, "fbs_aeid", this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        zzfcx.zzc(bundle0, "gmp_app_id", this.zza);
        zzfcx.zzc(bundle0, "fbs_aiid", this.zzb);
        zzfcx.zzc(bundle0, "fbs_aeid", this.zzc);
        zzfcx.zzc(bundle0, "apm_id_origin", this.zzd);
        Long long0 = this.zze;
        if(long0 != null) {
            bundle0.putLong("sai_timeout", ((long)long0));
        }
    }
}

