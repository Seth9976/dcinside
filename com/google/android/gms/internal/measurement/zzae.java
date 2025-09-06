package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzae implements Iterator {
    private final Iterator zza;
    private final Iterator zzb;

    zzae(zzaf zzaf0, Iterator iterator0, Iterator iterator1) {
        this.zza = iterator0;
        this.zzb = iterator1;
        super();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zza.hasNext() ? true : this.zzb.hasNext();
    }

    @Override
    public final Object next() {
        if(this.zza.hasNext()) {
            Object object0 = this.zza.next();
            return new zzas(((Integer)object0).toString());
        }
        if(!this.zzb.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = this.zzb.next();
        return new zzas(((String)object1));
    }
}

