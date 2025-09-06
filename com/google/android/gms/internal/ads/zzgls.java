package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgls {
    private final zzgdz zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    zzgls(zzgdz zzgdz0, int v, String s, String s1, zzglt zzglt0) {
        this.zza = zzgdz0;
        this.zzb = v;
        this.zzc = s;
        this.zzd = s1;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgls ? this.zza == ((zzgls)object0).zza && this.zzb == ((zzgls)object0).zzb && this.zzc.equals(((zzgls)object0).zzc) && this.zzd.equals(((zzgls)object0).zzd) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override
    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType=\'%s\', keyPrefix=\'%s\')", this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}

