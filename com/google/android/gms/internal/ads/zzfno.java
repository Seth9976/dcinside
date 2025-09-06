package com.google.android.gms.internal.ads;

final class zzfno extends zzfnk {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    zzfno(String s, boolean z, boolean z1, boolean z2, long v, boolean z3, long v1, zzfnn zzfnn0) {
        this.zza = s;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = v;
        this.zze = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfnk) {
            String s = ((zzfnk)object0).zzd();
            if(this.zza.equals(s)) {
                boolean z = ((zzfnk)object0).zzh();
                if(this.zzb == z) {
                    boolean z1 = ((zzfnk)object0).zzg();
                    if(this.zzc == z1) {
                        ((zzfnk)object0).zzf();
                        long v = ((zzfnk)object0).zzb();
                        if(this.zzd == v) {
                            ((zzfnk)object0).zze();
                            long v1 = ((zzfnk)object0).zza();
                            return this.zze == v1;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        int v1 = 0x4CF;
        int v2 = this.zzb ? 0x4CF : 0x4D5;
        if(!this.zzc) {
            v1 = 0x4D5;
        }
        return ((((((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v1) * 1000003 ^ 0x4D5) * 1000003 ^ ((int)this.zzd)) * 1000003 ^ 0x4D5) * 1000003 ^ ((int)this.zze);
    }

    @Override
    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.zzd + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.zze + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final long zza() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final long zzb() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final String zzd() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final boolean zze() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzg() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzh() {
        return this.zzb;
    }
}

