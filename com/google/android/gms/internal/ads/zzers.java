package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

public final class zzers implements zzetq {
    public final zzfbn zza;

    public zzers(zzfbn zzfbn0) {
        this.zza = zzfbn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        if(this.zza != null && !((Boolean)zzbe.zzc().zza(zzbcl.zzlN)).booleanValue()) {
            boolean z = this.zza.zzd();
            ((zzcuv)object0).zza.putBoolean("render_in_browser", z);
            boolean z1 = this.zza.zzc();
            ((zzcuv)object0).zza.putBoolean("disable_ml", z1);
        }
    }
}

