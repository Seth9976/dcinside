package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Set;

public class zzcot {
    private final zzcqx zza;
    private final View zzb;
    private final zzfbp zzc;
    @Nullable
    private final zzcex zzd;

    public zzcot(View view0, @Nullable zzcex zzcex0, zzcqx zzcqx0, zzfbp zzfbp0) {
        this.zzb = view0;
        this.zzd = zzcex0;
        this.zza = zzcqx0;
        this.zzc = zzfbp0;
    }

    public final View zza() {
        return this.zzb;
    }

    @Nullable
    public final zzcex zzb() {
        return this.zzd;
    }

    public final zzcqx zzc() {
        return this.zza;
    }

    public zzcxf zzd(Set set0) {
        return new zzcxf(set0);
    }

    public final zzfbp zze() {
        return this.zzc;
    }
}

