package com.google.android.gms.internal.ads;

import java.io.Serializable;

final class zzfzg extends zzfyy implements Serializable {
    static final zzfzg zza;

    static {
        zzfzg.zza = new zzfzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyy
    public final int compare(Object object0, Object object1) {
        ((Comparable)object0).getClass();
        return ((Comparable)object0) == ((Comparable)object1) ? 0 : ((Comparable)object1).compareTo(((Comparable)object0));
    }

    @Override
    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

