package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzesf implements zzetq {
    @Nullable
    private final String zza;
    @Nullable
    private final Integer zzb;
    @Nullable
    private final String zzc;
    @Nullable
    private final String zzd;
    @Nullable
    private final String zze;
    @Nullable
    private final String zzf;

    public zzesf(@Nullable String s, @Nullable Integer integer0, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable String s4) {
        this.zza = s;
        this.zzb = integer0;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = s3;
        this.zzf = s4;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        zzfcx.zzc(((zzcuv)object0).zzb, "pn", this.zza);
        zzfcx.zzc(((zzcuv)object0).zzb, "dl", this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        zzfcx.zzc(bundle0, "pn", this.zza);
        Integer integer0 = this.zzb;
        if(integer0 != null) {
            bundle0.putInt("vc", ((int)integer0));
        }
        zzfcx.zzc(bundle0, "vnm", this.zzc);
        zzfcx.zzc(bundle0, "dl", this.zzd);
        zzfcx.zzc(bundle0, "ins_pn", this.zze);
        zzfcx.zzc(bundle0, "ini_pn", this.zzf);
    }
}

