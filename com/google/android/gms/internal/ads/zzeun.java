package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzeun implements zzetq {
    @VisibleForTesting
    final String zza;
    final int zzb;

    zzeun(String s, int v, zzeum zzeum0) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            if(!TextUtils.isEmpty(this.zza)) {
                ((zzcuv)object0).zza.putString("topics", this.zza);
            }
            int v = this.zzb;
            if(v != -1) {
                ((zzcuv)object0).zza.putInt("atps", v);
            }
        }
    }
}

