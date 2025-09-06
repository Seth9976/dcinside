package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.io.InputStream;
import java.util.List;

public final class zzaqk {
    private final int zza;
    private final List zzb;
    private final int zzc;
    @Nullable
    private final InputStream zzd;

    public zzaqk(int v, List list0, int v1, InputStream inputStream0) {
        this.zza = v;
        this.zzb = list0;
        this.zzc = v1;
        this.zzd = inputStream0;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    @Nullable
    public final InputStream zzc() {
        return this.zzd == null ? null : this.zzd;
    }

    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.zzb);
    }
}

