package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgll extends zzgek {
    private final zzgni zza;

    public zzgll(zzgni zzgni0) {
        this.zza = zzgni0;
    }

    // 去混淆评级： 低(22)
    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzgll)) {
            return false;
        }
        zzgni zzgni0 = ((zzgll)object0).zza;
        return this.zza.zzc().zzg().equals(zzgni0.zzc().zzg()) && this.zza.zzc().zzh().equals(zzgni0.zzc().zzh());
    }

    @Override
    public final int hashCode() {
        zzgvo zzgvo0 = this.zza.zzd();
        return Objects.hash(new Object[]{this.zza.zzc(), zzgvo0});
    }

    @Override
    public final String toString() {
        String s = this.zza.zzc().zzi();
        switch(this.zza.zzc().zzg().ordinal()) {
            case 1: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "TINK");
            }
            case 2: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "LEGACY");
            }
            case 3: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "RAW");
            }
            case 4: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "CRUNCHY");
            }
            default: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "UNKNOWN");
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgtp.zzd;
    }

    public final zzgni zzb() {
        return this.zza;
    }
}

