package com.google.android.gms.internal.vision;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzdw implements Iterator {
    private int zza;
    private int zzb;
    private int zzc;
    private final zzdp zzd;

    private zzdw(zzdp zzdp0) {
        this.zzd = zzdp0;
        super();
        this.zza = zzdp0.zzf;
        this.zzb = zzdp0.zzd();
        this.zzc = -1;
    }

    zzdw(zzdp zzdp0, zzds zzds0) {
        this(zzdp0);
    }

    @Override
    public boolean hasNext() {
        return this.zzb >= 0;
    }

    @Override
    public Object next() {
        this.zza();
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzc = this.zzb;
        Object object0 = this.zza(this.zzb);
        this.zzb = this.zzd.zza(this.zzb);
        return object0;
    }

    @Override
    public void remove() {
        this.zza();
        zzde.zzb(this.zzc >= 0, "no calls to next() since the last call to remove()");
        this.zza += 0x20;
        this.zzd.remove(this.zzd.zzb[this.zzc]);
        --this.zzb;
        this.zzc = -1;
    }

    private final void zza() {
        if(this.zzd.zzf != this.zza) {
            throw new ConcurrentModificationException();
        }
    }

    abstract Object zza(int arg1);
}

