package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;

public final class zzeiz implements zzg {
    private zzg zza;

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zza(View view0) {
        synchronized(this) {
            zzg zzg0 = this.zza;
            if(zzg0 != null) {
                zzg0.zza(view0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        synchronized(this) {
            zzg zzg0 = this.zza;
            if(zzg0 != null) {
                zzg0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        synchronized(this) {
            zzg zzg0 = this.zza;
            if(zzg0 != null) {
                zzg0.zzc();
            }
        }
    }

    public final void zzd(zzg zzg0) {
        synchronized(this) {
            this.zza = zzg0;
        }
    }
}

