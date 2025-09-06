package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzgzs implements Iterator {
    private final ArrayDeque zza;
    private zzgwf zzb;

    zzgzs(zzgwj zzgwj0, zzgzt zzgzt0) {
        if(zzgwj0 instanceof zzgzu) {
            ArrayDeque arrayDeque0 = new ArrayDeque(((zzgzu)zzgwj0).zzf());
            this.zza = arrayDeque0;
            arrayDeque0.push(((zzgzu)zzgwj0));
            this.zzb = this.zzb(((zzgzu)zzgwj0).zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgwf)zzgwj0;
    }

    @Override
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override
    public final Object next() {
        return this.zza();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final zzgwf zza() {
        zzgwf zzgwf1;
        zzgwf zzgwf0 = this.zzb;
        if(zzgwf0 == null) {
            throw new NoSuchElementException();
        }
        do {
            zzgwf1 = null;
            if(this.zza == null || this.zza.isEmpty()) {
                break;
            }
            zzgwf1 = this.zzb(((zzgzu)this.zza.pop()).zze);
        }
        while(zzgwf1.zzd() == 0);
        this.zzb = zzgwf1;
        return zzgwf0;
    }

    private final zzgwf zzb(zzgwj zzgwj0) {
        while(zzgwj0 instanceof zzgzu) {
            this.zza.push(((zzgzu)zzgwj0));
            zzgwj0 = ((zzgzu)zzgwj0).zzd;
        }
        return (zzgwf)zzgwj0;
    }
}

