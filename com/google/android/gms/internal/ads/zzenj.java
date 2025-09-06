package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

public final class zzenj implements zzetq {
    @Nullable
    @VisibleForTesting
    final String zza;
    @VisibleForTesting
    final int zzb;

    public zzenj(@Nullable String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        if(!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            Bundle bundle1 = zzfcx.zza(bundle0, "pii");
            bundle0.putBundle("pii", bundle1);
            bundle1.putString("pvid", this.zza);
            bundle1.putInt("pvid_s", this.zzb);
        }
    }
}

