package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzfry extends zzfta {
    private final int zza;
    @Nullable
    private final String zzb;

    zzfry(int v, String s, zzfrx zzfrx0) {
        this.zza = v;
        this.zzb = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfta) {
            int v = ((zzfta)object0).zza();
            if(this.zza == v) {
                return this.zzb == null ? ((zzfta)object0).zzb() == null : this.zzb.equals(((zzfta)object0).zzb());
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zzb == null ? (this.zza ^ 1000003) * 1000003 : this.zzb.hashCode() ^ (this.zza ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.zza + ", sessionToken=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.ads.zzfta
    public final int zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzfta
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}

