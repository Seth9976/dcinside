package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import o3.a;

final class zzfup implements zzfuo, Serializable {
    private final List zza;

    zzfup(List list0, zzfuq zzfuq0) {
        this.zza = list0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@a Object object0) {
        return object0 instanceof zzfup ? this.zza.equals(((zzfup)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Predicates.");
        stringBuilder0.append("and(");
        boolean z = true;
        for(Object object0: this.zza) {
            if(!z) {
                stringBuilder0.append(',');
            }
            stringBuilder0.append(object0);
            z = false;
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfuo
    public final boolean zza(Object object0) {
        for(int v = 0; v < this.zza.size(); ++v) {
            if(!((zzfuo)this.zza.get(v)).zza(object0)) {
                return false;
            }
        }
        return true;
    }
}

