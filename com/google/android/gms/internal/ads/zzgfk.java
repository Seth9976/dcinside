package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgfk extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgfi zze;
    private final zzgfh zzf;

    zzgfk(int v, int v1, int v2, int v3, zzgfi zzgfi0, zzgfh zzgfh0, zzgfj zzgfj0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = zzgfi0;
        this.zzf = zzgfh0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgfk ? ((zzgfk)object0).zza == this.zza && ((zzgfk)object0).zzb == this.zzb && ((zzgfk)object0).zzc == this.zzc && ((zzgfk)object0).zzd == this.zzd && ((zzgfk)object0).zze == this.zze && ((zzgfk)object0).zzf == this.zzf : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzgfk.class, this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf});
    }

    @Override
    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + this.zze + ", hashType: " + this.zzf + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zze != zzgfi.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public static zzgfg zzf() {
        return new zzgfg(null);
    }

    public final zzgfh zzg() {
        return this.zzf;
    }

    public final zzgfi zzh() {
        return this.zze;
    }
}

