package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;

public final class zzfln {
    private final zzfnb zza;
    private final String zzb;
    private final zzfkw zzc;
    private final String zzd;

    public zzfln(View view0, zzfkw zzfkw0, @Nullable String s) {
        this.zza = new zzfnb(view0);
        this.zzb = view0.getClass().getCanonicalName();
        this.zzc = zzfkw0;
        this.zzd = "Ad overlay";
    }

    public final zzfkw zza() {
        return this.zzc;
    }

    public final zzfnb zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}

