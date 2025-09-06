package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzlx implements Iterator {
    private int zza;
    private Iterator zzb;
    private final zzlv zzc;

    private zzlx(zzlv zzlv0) {
        this.zzc = zzlv0;
        super();
        this.zza = zzlv0.zzb;
    }

    zzlx(zzlv zzlv0, zzme zzme0) {
        this(zzlv0);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean hasNext() {
        return this.zza > 0 && this.zza <= this.zzc.zzb || this.zza().hasNext();
    }

    @Override
    public final Object next() {
        if(this.zza().hasNext()) {
            return this.zza().next();
        }
        int v = this.zza - 1;
        this.zza = v;
        return (zzlz)this.zzc.zza[v];
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator zza() {
        if(this.zzb == null) {
            this.zzb = this.zzc.zzf.entrySet().iterator();
        }
        return this.zzb;
    }
}

