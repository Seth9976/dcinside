package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Q;
import o3.h;

final class zzgv extends zzhu {
    private final Context zza;
    @h
    private final Q zzb;

    zzgv(Context context0, @h Q q0) {
        if(context0 == null) {
            throw new NullPointerException("Null context");
        }
        this.zza = context0;
        this.zzb = q0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzhu) {
            Context context0 = ((zzhu)object0).zza();
            if(this.zza.equals(context0)) {
                return this.zzb == null ? ((zzhu)object0).zzb() == null : this.zzb.equals(((zzhu)object0).zzb());
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

    @Override  // com.google.android.gms.internal.measurement.zzhu
    final Context zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhu
    @h
    final Q zzb() {
        return this.zzb;
    }
}

