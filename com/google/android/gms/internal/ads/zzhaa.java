package com.google.android.gms.internal.ads;

import java.util.Iterator;

final class zzhaa implements Iterator {
    final zzhad zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    zzhaa(zzhad zzhad0, zzhac zzhac0) {
        this.zza = zzhad0;
        super();
        this.zzb = -1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zzb + 1 < this.zza.zzb || !this.zza.zzc.isEmpty() && this.zza().hasNext();
    }

    @Override
    public final Object next() {
        this.zzc = true;
        int v = this.zzb + 1;
        this.zzb = v;
        zzhad zzhad0 = this.zza;
        return v < zzhad0.zzb ? ((zzgzz)zzhad0.zza[v]) : this.zza().next();
    }

    @Override
    public final void remove() {
        if(!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int v = this.zzb;
        zzhad zzhad0 = this.zza;
        if(v < zzhad0.zzb) {
            this.zzb = v - 1;
            zzhad0.zzm(v);
            return;
        }
        this.zza().remove();
    }

    private final Iterator zza() {
        if(this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }
}

