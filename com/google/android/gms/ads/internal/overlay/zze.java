package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcgn;

public final class zze implements zzcgn {
    public final zzm zza;

    public zze(zzm zzm0) {
        this.zza = zzm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zza(boolean z, int v, String s, String s1) {
        zzcex zzcex0 = this.zza.zzd;
        if(zzcex0 != null) {
            zzcex0.zzaa();
        }
    }
}

