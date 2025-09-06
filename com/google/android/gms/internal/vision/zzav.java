package com.google.android.gms.internal.vision;

import android.content.Context;
import o3.h;

final class zzav extends zzbr {
    private final Context zza;
    private final zzdf zzb;

    zzav(Context context0, @h zzdf zzdf0) {
        if(context0 == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context0;
        this.zzb = zzdf0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzbr) {
            Context context0 = ((zzbr)object0).zza();
            if(this.zza.equals(context0)) {
                return this.zzb == null ? ((zzbr)object0).zzb() == null : this.zzb.equals(((zzbr)object0).zzb());
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zza.hashCode();
        return this.zzb == null ? (v ^ 1000003) * 1000003 : (v ^ 1000003) * 1000003 ^ this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return "FlagsContext{context=" + this.zza + ", hermeticFileOverrides=" + this.zzb + "}";
    }

    @Override  // com.google.android.gms.internal.vision.zzbr
    final Context zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.vision.zzbr
    @h
    final zzdf zzb() {
        return this.zzb;
    }
}

