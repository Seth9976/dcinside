package com.google.android.gms.ads.internal.util.client;

final class zzn extends zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    zzn(int v, int v1, double f, boolean z) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = f;
        this.zzd = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzx) {
            int v = ((zzx)object0).zzc();
            if(this.zza == v) {
                int v1 = ((zzx)object0).zzb();
                if(this.zzb == v1) {
                    long v2 = Double.doubleToLongBits(((zzx)object0).zza());
                    if(Double.doubleToLongBits(this.zzc) == v2) {
                        boolean z = ((zzx)object0).zzd();
                        return this.zzd == z;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.zzc);
        long v1 = Double.doubleToLongBits(this.zzc);
        return this.zzd ? (((int)(v >>> 0x20 ^ v1)) ^ ((this.zza ^ 1000003) * 1000003 ^ this.zzb) * 1000003) * 1000003 ^ 0x4CF : (((int)(v >>> 0x20 ^ v1)) ^ ((this.zza ^ 1000003) * 1000003 ^ this.zzb) * 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.zza + ", initialBackoffMs=" + this.zzb + ", backoffMultiplier=" + this.zzc + ", bufferAfterMaxAttempts=" + this.zzd + "}";
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzx
    public final double zza() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzc() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.zzd;
    }
}

