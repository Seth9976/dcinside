package com.google.android.gms.internal.ads;

import java.io.Serializable;
import o3.a;

final class zzfzh extends zzfyy implements Serializable {
    final zzfyy zza;

    zzfzh(zzfyy zzfyy0) {
        this.zza = zzfyy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyy
    public final int compare(Object object0, Object object1) {
        return this.zza.compare(object1, object0);
    }

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzfzh ? this.zza.equals(((zzfzh)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return -this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zza.toString() + ".reverse()";
    }
}

