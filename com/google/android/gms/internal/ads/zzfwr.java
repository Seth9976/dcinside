package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzfwr implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final zzfww zze;

    zzfwr(zzfww zzfww0, zzfwv zzfwv0) {
        this.zze = zzfww0;
        super();
        this.zzb = zzfww0.zzf;
        this.zzc = zzfww0.zze();
        this.zzd = -1;
    }

    @Override
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override
    public final Object next() {
        this.zzb();
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzd = this.zzc;
        Object object0 = this.zza(this.zzc);
        this.zzc = this.zze.zzf(this.zzc);
        return object0;
    }

    @Override
    public final void remove() {
        this.zzb();
        zzfun.zzm(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 0x20;
        Object object0 = zzfww.zzg(this.zze, this.zzd);
        this.zze.remove(object0);
        --this.zzc;
        this.zzd = -1;
    }

    abstract Object zza(int arg1);

    private final void zzb() {
        if(this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}

