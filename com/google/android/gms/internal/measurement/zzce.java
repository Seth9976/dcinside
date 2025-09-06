package com.google.android.gms.internal.measurement;

final class zzce extends zzcm {
    private final String zzc;
    private final boolean zzd;
    private final zzco zze;
    private final zzcc zzf;
    private final zzcb zzg;
    private final zzcn zzh;

    private zzce(String s, boolean z, zzco zzco0, zzcc zzcc0, zzcb zzcb0, zzcn zzcn0) {
        this.zzc = s;
        this.zzd = z;
        this.zze = zzco0;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzcn0;
    }

    zzce(String s, boolean z, zzco zzco0, zzcc zzcc0, zzcb zzcb0, zzcn zzcn0, zzcg zzcg0) {
        this(s, false, zzco0, null, null, zzcn0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzcm) {
            String s = ((zzcm)object0).zze();
            if(this.zzc.equals(s)) {
                boolean z = ((zzcm)object0).zzf();
                if(this.zzd == z) {
                    zzco zzco0 = ((zzcm)object0).zzc();
                    if(this.zze.equals(zzco0)) {
                        zzcc zzcc0 = this.zzf;
                        if(zzcc0 != null) {
                            if(zzcc0.equals(((zzcm)object0).zza())) {
                            label_14:
                                zzcb zzcb0 = this.zzg;
                                if(zzcb0 != null) {
                                    if(zzcb0.equals(((zzcm)object0).zzb())) {
                                    label_19:
                                        zzcn zzcn0 = ((zzcm)object0).zzd();
                                        return this.zzh.equals(zzcn0);
                                    }
                                }
                                else if(((zzcm)object0).zzb() == null) {
                                    goto label_19;
                                }
                            }
                        }
                        else if(((zzcm)object0).zza() == null) {
                            goto label_14;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzc.hashCode();
        int v1 = this.zzd ? 0x4CF : 0x4D5;
        int v2 = this.zze.hashCode();
        int v3 = 0;
        int v4 = this.zzf == null ? 0 : this.zzf.hashCode();
        zzcb zzcb0 = this.zzg;
        if(zzcb0 != null) {
            v3 = zzcb0.hashCode();
        }
        return (((((v ^ 1000003) * 1000003 ^ v1) * 1000003 ^ v2) * 1000003 ^ v4) * 1000003 ^ v3) * 1000003 ^ this.zzh.hashCode();
    }

    @Override
    public final String toString() {
        return "FileComplianceOptions{fileOwner=" + this.zzc + ", hasDifferentDmaOwner=" + this.zzd + ", fileChecks=" + this.zze + ", dataForwardingNotAllowedResolver=" + this.zzf + ", multipleProductIdGroupsResolver=" + this.zzg + ", filePurpose=" + this.zzh + "}";
    }

    @Override  // com.google.android.gms.internal.measurement.zzcm
    public final zzcc zza() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcm
    public final zzcb zzb() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcm
    public final zzco zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcm
    public final zzcn zzd() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcm
    public final String zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcm
    public final boolean zzf() {
        return this.zzd;
    }
}

