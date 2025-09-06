package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class zzfr implements zzfy {
    private final boolean zza;
    private final ArrayList zzb;
    private int zzc;
    @Nullable
    private zzgd zzd;

    protected zzfr(boolean z) {
        this.zza = z;
        this.zzb = new ArrayList(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public Map zze() {
        return Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgy0) {
        zzgy0.getClass();
        if(!this.zzb.contains(zzgy0)) {
            this.zzb.add(zzgy0);
            ++this.zzc;
        }
    }

    protected final void zzg(int v) {
        zzgd zzgd0 = this.zzd;
        for(int v1 = 0; v1 < this.zzc; ++v1) {
            ((zzgy)this.zzb.get(v1)).zza(this, zzgd0, this.zza, v);
        }
    }

    protected final void zzh() {
        zzgd zzgd0 = this.zzd;
        for(int v = 0; v < this.zzc; ++v) {
            ((zzgy)this.zzb.get(v)).zzb(this, zzgd0, this.zza);
        }
        this.zzd = null;
    }

    protected final void zzi(zzgd zzgd0) {
        for(int v = 0; v < this.zzc; ++v) {
            ((zzgy)this.zzb.get(v)).zzc(this, zzgd0, this.zza);
        }
    }

    protected final void zzj(zzgd zzgd0) {
        this.zzd = zzgd0;
        for(int v = 0; v < this.zzc; ++v) {
            ((zzgy)this.zzb.get(v)).zzd(this, zzgd0, this.zza);
        }
    }
}

