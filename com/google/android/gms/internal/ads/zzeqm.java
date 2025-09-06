package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

final class zzeqm implements zzetq {
    private final String zza;
    private final String zzb;
    @Nullable
    private final Bundle zzc;

    zzeqm(String s, String s1, Bundle bundle0, zzeqn zzeqn0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        bundle0.putString("consent_string", this.zza);
        bundle0.putString("fc_consent", this.zzb);
        Bundle bundle1 = this.zzc;
        if(bundle1 != null) {
            bundle0.putBundle("iab_consent_info", bundle1);
        }
    }
}

