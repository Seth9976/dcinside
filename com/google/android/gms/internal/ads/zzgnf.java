package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o3.h;

public final class zzgnf {
    private final Map zza;
    private final zzgnd zzb;
    private final Class zzc;
    private final zzglo zzd;

    zzgnf(Map map0, List list0, zzgnd zzgnd0, zzglo zzglo0, Class class0, zzgne zzgne0) {
        this.zza = map0;
        this.zzb = zzgnd0;
        this.zzc = class0;
        this.zzd = zzglo0;
    }

    public final zzglo zza() {
        return this.zzd;
    }

    public static zzgnc zzb(Class class0) {
        return new zzgnc(class0, null);
    }

    @h
    public final zzgnd zzc() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] arr_b) {
        zzgvo zzgvo0 = zzgvo.zzb(arr_b);
        List list0 = (List)this.zza.get(zzgvo0);
        return list0 == null ? Collections.emptyList() : list0;
    }

    public final boolean zzg() {
        return !this.zzd.zza().isEmpty();
    }
}

