package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import o3.a;

final class zzfwy extends zzfyy implements Serializable {
    final Comparator zza;

    zzfwy(Comparator comparator0) {
        this.zza = comparator0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyy
    public final int compare(Object object0, Object object1) {
        return this.zza.compare(object0, object1);
    }

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzfwy ? this.zza.equals(((zzfwy)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zza.toString();
    }
}

