package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzfrs extends zzfsd {
    @Nullable
    private final String zza;
    @Nullable
    private final String zzb;

    zzfrs(String s, String s1, zzfrr zzfrr0) {
        this.zza = s;
        this.zzb = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfsd) {
            String s = this.zza;
            if(s == null) {
                if(((zzfsd)object0).zzb() == null) {
                    return this.zzb == null ? ((zzfsd)object0).zza() == null : this.zzb.equals(((zzfsd)object0).zza());
                }
            }
            else if(s.equals(((zzfsd)object0).zzb())) {
                return this.zzb == null ? ((zzfsd)object0).zza() == null : this.zzb.equals(((zzfsd)object0).zza());
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zza == null ? 0 : this.zza.hashCode();
        String s = this.zzb;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.zza + ", appId=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfsd
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsd
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}

