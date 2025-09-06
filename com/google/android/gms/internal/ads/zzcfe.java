package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzr;

final class zzcfe implements zzr {
    private final zzcex zza;
    @Nullable
    private final zzr zzb;

    public zzcfe(zzcex zzcex0, @Nullable zzr zzr0) {
        this.zza = zzcex0;
        this.zzb = zzr0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzr zzr0 = this.zzb;
        if(zzr0 != null) {
            zzr0.zzdo();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzr zzr0 = this.zzb;
        if(zzr0 != null) {
            zzr0.zzdp();
        }
        this.zza.zzaa();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzr zzr0 = this.zzb;
        if(zzr0 != null) {
            zzr0.zzdr();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        zzr zzr0 = this.zzb;
        if(zzr0 != null) {
            zzr0.zzds(v);
        }
        this.zza.zzY();
    }
}

