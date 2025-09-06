package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.util.List;
import o3.h;

public final class zzglu {
    private final zzglo zza;
    private final List zzb;
    @h
    private final Integer zzc;

    zzglu(zzglo zzglo0, List list0, Integer integer0, zzglt zzglt0) {
        this.zza = zzglo0;
        this.zzb = list0;
        this.zzc = integer0;
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzglu ? this.zza.equals(((zzglu)object0).zza) && this.zzb.equals(((zzglu)object0).zzb) && Objects.equals(this.zzc, ((zzglu)object0).zzc) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}

