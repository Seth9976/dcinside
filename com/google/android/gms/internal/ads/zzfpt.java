package com.google.android.gms.internal.ads;

final class zzfpt extends zzfqa {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    zzfpt(String s, boolean z, int v, zzfpp zzfpp0, zzfpq zzfpq0, int v1, zzfps zzfps0) {
        this.zzb = s;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfqa) {
            String s = ((zzfqa)object0).zzc();
            if(this.zzb.equals(s)) {
                ((zzfqa)object0).zzd();
                int v = this.zzc;
                int v1 = ((zzfqa)object0).zze();
                if(v == 0) {
                    throw null;
                }
                if(v == v1) {
                    ((zzfqa)object0).zza();
                    ((zzfqa)object0).zzb();
                    int v2 = ((zzfqa)object0).zzf();
                    if(this.zzd == 0) {
                        throw null;
                    }
                    return v2 == 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb.hashCode();
        int v1 = this.zzc;
        if(v1 == 0 || this.zzd == 0) {
            throw null;
        }
        return (((v ^ 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ v1) * 0x22CD8CDB ^ 1;
    }

    @Override
    public final String toString() {
        String s1;
        String s = "null";
        switch(this.zzc) {
            case 1: {
                s1 = "ALL_CHECKS";
                break;
            }
            case 2: {
                s1 = "SKIP_COMPLIANCE_CHECK";
                break;
            }
            case 3: {
                s1 = "SKIP_SECURITY_CHECK";
                break;
            }
            case 4: {
                s1 = "NO_CHECKS";
                break;
            }
            default: {
                s1 = "null";
            }
        }
        if(this.zzd == 1) {
            s = "READ_AND_WRITE";
        }
        return "FileComplianceOptions{fileOwner=" + this.zzb + ", hasDifferentDmaOwner=false, fileChecks=" + s1 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + s + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfqa
    public final zzfpp zza() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqa
    public final zzfpq zzb() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqa
    public final String zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqa
    public final boolean zzd() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqa
    public final int zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqa
    public final int zzf() {
        return this.zzd;
    }
}

