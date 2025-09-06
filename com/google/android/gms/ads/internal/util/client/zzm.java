package com.google.android.gms.ads.internal.util.client;

final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    zzm(int v, int v1, boolean z) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzw) {
            int v = ((zzw)object0).zzb();
            if(this.zza == v) {
                int v1 = ((zzw)object0).zza();
                if(this.zzb == v1) {
                    boolean z = ((zzw)object0).zzc();
                    return this.zzc == z;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zzc ? 0x4CF ^ ((this.zza ^ 1000003) * 1000003 ^ this.zzb) * 1000003 : 0x4D5 ^ ((this.zza ^ 1000003) * 1000003 ^ this.zzb) * 1000003;
    }

    @Override
    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.zza + ", clickPrerequisite=" + this.zzb + ", notificationFlowEnabled=" + this.zzc + "}";
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }
}

