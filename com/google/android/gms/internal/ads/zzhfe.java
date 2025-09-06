package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzhfe {
    private final List zza;
    private final List zzb;

    zzhfe(int v, int v1, zzhfd zzhfd0) {
        this.zza = zzheo.zzc(v);
        this.zzb = zzheo.zzc(v1);
    }

    public final zzhfe zza(zzhfa zzhfa0) {
        this.zzb.add(zzhfa0);
        return this;
    }

    public final zzhfe zzb(zzhfa zzhfa0) {
        this.zza.add(zzhfa0);
        return this;
    }

    public final zzhff zzc() {
        return new zzhff(this.zza, this.zzb, null);
    }
}

