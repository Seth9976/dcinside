package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import o3.a;

class zzfvu implements Iterator {
    final Iterator zza;
    @a
    Collection zzb;
    Iterator zzc;
    final zzfwg zzd;

    zzfvu(zzfwg zzfwg0) {
        this.zzd = zzfwg0;
        super();
        this.zza = zzfwg0.zza.entrySet().iterator();
        this.zzb = null;
        this.zzc = zzfxv.zza;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    @Override
    public final Object next() {
        if(!this.zzc.hasNext()) {
            Object object0 = this.zza.next();
            ((Map.Entry)object0).getKey();
            Collection collection0 = (Collection)((Map.Entry)object0).getValue();
            this.zzb = collection0;
            this.zzc = collection0.iterator();
        }
        return this.zzc.next();
    }

    @Override
    public final void remove() {
        this.zzc.remove();
        Collection collection0 = this.zzb;
        Objects.requireNonNull(collection0);
        if(collection0.isEmpty()) {
            this.zza.remove();
        }
        --this.zzd.zzb;
    }
}

