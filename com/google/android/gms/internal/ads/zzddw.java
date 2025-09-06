package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.List;

public final class zzddw {
    private final List zza;
    private final zzfja zzb;
    @Nullable
    private final zzv zzc;
    private boolean zzd;

    public zzddw(zzfbo zzfbo0, zzfja zzfja0) {
        this.zza = zzfbo0.zzp;
        this.zzb = zzfja0;
        this.zzc = zzfbo0.zzax;
    }

    public final void zza() {
        if(!this.zzd) {
            this.zzb.zze(this.zza, this.zzc);
            this.zzd = true;
        }
    }
}

