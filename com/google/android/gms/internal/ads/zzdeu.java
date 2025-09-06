package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdeu {
    private final zzdgc zza;
    @Nullable
    private final zzcex zzb;

    public zzdeu(zzdgc zzdgc0, @Nullable zzcex zzcex0) {
        this.zza = zzdgc0;
        this.zzb = zzcex0;
    }

    @Nullable
    public final View zza() {
        zzcex zzcex0 = this.zzb;
        return zzcex0 == null ? null : zzcex0.zzG();
    }

    @Nullable
    public final View zzb() {
        zzcex zzcex0 = this.zzb;
        return zzcex0 != null ? zzcex0.zzG() : null;
    }

    @Nullable
    public final zzcex zzc() {
        return this.zzb;
    }

    public final zzddk zzd(Executor executor0) {
        return new zzddk(new zzdet(this.zzb), executor0);
    }

    public final zzdgc zze() {
        return this.zza;
    }

    public Set zzf(zzcuo zzcuo0) {
        return Collections.singleton(new zzddk(zzcuo0, zzbzw.zzg));
    }

    public Set zzg(zzcuo zzcuo0) {
        return Collections.singleton(new zzddk(zzcuo0, zzbzw.zzg));
    }
}

