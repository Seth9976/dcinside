package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzghg extends zzgeu {
    private final String zza;
    private final zzghf zzb;

    private zzghg(String s, zzghf zzghf0) {
        this.zza = s;
        this.zzb = zzghf0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzghg ? ((zzghg)object0).zza.equals(this.zza) && ((zzghg)object0).zzb.equals(this.zzb) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzghg.class, this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + this.zzb.toString() + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzb != zzghf.zzb;
    }

    public final zzghf zzb() {
        return this.zzb;
    }

    public static zzghg zzc(String s, zzghf zzghf0) {
        return new zzghg(s, zzghf0);
    }

    public final String zzd() {
        return this.zza;
    }
}

