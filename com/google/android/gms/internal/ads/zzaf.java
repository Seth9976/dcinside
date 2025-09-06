package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public final class zzaf {
    @Nullable
    private String zza;
    @Nullable
    private Uri zzb;
    private final zzag zzc;
    private final List zzd;
    private final zzfxn zze;
    private final zzak zzf;
    private final zzao zzg;

    public zzaf() {
        this.zzc = new zzag();
        this.zzd = Collections.emptyList();
        this.zze = zzfxn.zzn();
        this.zzf = new zzak();
        this.zzg = zzao.zza;
    }

    public final zzaf zza(String s) {
        this.zza = s;
        return this;
    }

    public final zzaf zzb(@Nullable Uri uri0) {
        this.zzb = uri0;
        return this;
    }

    public final zzar zzc() {
        zzam zzam0 = this.zzb == null ? null : new zzam(this.zzb, null, null, null, this.zzd, null, this.zze, null, 0x8000000000000001L, null);
        return new zzar((this.zza == null ? "" : this.zza), new zzai(this.zzc, null), zzam0, new zzal(this.zzf, null), zzav.zza, this.zzg, null);
    }
}

