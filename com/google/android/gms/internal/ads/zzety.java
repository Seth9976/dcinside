package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzety implements zzetq {
    private final int zza;
    private final int zzb;

    zzety(int v, int v1) {
        this.zza = v;
        this.zzb = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        int v = this.zza;
        if(v != -1 && this.zzb != -1) {
            bundle0.putInt("sessions_without_flags", v);
            bundle0.putInt("crashes_without_flags", this.zzb);
            if(zzbe.zzc().zze()) {
                bundle0.putBoolean("did_reset", true);
            }
        }
    }
}

