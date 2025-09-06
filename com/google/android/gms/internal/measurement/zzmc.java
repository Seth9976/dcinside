package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzmc implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final zzlv zzd;

    private zzmc(zzlv zzlv0) {
        this.zzd = zzlv0;
        super();
        this.zza = -1;
    }

    zzmc(zzlv zzlv0, zzme zzme0) {
        this(zzlv0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zza + 1 < this.zzd.zzb || !this.zzd.zzc.isEmpty() && this.zza().hasNext();
    }

    @Override
    public final Object next() {
        this.zzb = true;
        int v = this.zza + 1;
        this.zza = v;
        return v < this.zzd.zzb ? ((zzlz)this.zzd.zza[this.zza]) : this.zza().next();
    }

    @Override
    public final void remove() {
        if(!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        if(this.zza < this.zzd.zzb) {
            int v = this.zza;
            this.zza = v - 1;
            this.zzd.zzb(v);
            return;
        }
        this.zza().remove();
    }

    private final Iterator zza() {
        if(this.zzc == null) {
            this.zzc = this.zzd.zzc.entrySet().iterator();
        }
        return this.zzc;
    }
}

