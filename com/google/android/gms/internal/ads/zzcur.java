package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

final class zzcur implements zzcwo, zzcxh {
    private final zzfbo zza;

    public zzcur(Context context0, zzfbo zzfbo0, zzbtj zzbtj0) {
        this.zza = zzfbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzbtk zzbtk0 = this.zza.zzad;
        if(zzbtk0 != null && zzbtk0.zza) {
            ArrayList arrayList0 = new ArrayList();
            if(!this.zza.zzad.zzb.isEmpty()) {
                arrayList0.add(this.zza.zzad.zzb);
            }
        }
    }
}

