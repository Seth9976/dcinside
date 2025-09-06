package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import o3.a;

final class zzfwi extends AbstractCollection {
    final zzfwj zza;

    zzfwi(zzfwj zzfwj0) {
        this.zza = zzfwj0;
        super();
    }

    @Override
    public final void clear() {
        this.zza.zzp();
    }

    @Override
    public final boolean contains(@a Object object0) {
        for(Object object1: this.zza.zzs().values()) {
            if(((Collection)object1).contains(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.zza.zzg();
    }

    @Override
    public final int size() {
        return this.zza.zze();
    }
}

