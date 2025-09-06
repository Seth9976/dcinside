package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import o3.a;

final class zzfvs implements Iterator {
    final Iterator zza;
    @a
    Collection zzb;
    final zzfvt zzc;

    zzfvs(zzfvt zzfvt0) {
        this.zzc = zzfvt0;
        super();
        this.zza = zzfvt0.zza.entrySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override
    public final Object next() {
        Object object0 = this.zza.next();
        this.zzb = (Collection)((Map.Entry)object0).getValue();
        return this.zzc.zza(((Map.Entry)object0));
    }

    @Override
    public final void remove() {
        zzfun.zzm(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        this.zzc.zzb.zzb -= this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}

