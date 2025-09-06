package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzlp implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final zzlh zzd;

    private zzlp(zzlh zzlh0) {
        this.zzd = zzlh0;
        super();
        this.zza = -1;
    }

    zzlp(zzlh zzlh0, zzlg zzlg0) {
        this(zzlh0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean hasNext() {
        return this.zza + 1 < this.zzd.zzb.size() || !this.zzd.zzc.isEmpty() && this.zza().hasNext();
    }

    @Override
    public final Object next() {
        this.zzb = true;
        int v = this.zza + 1;
        this.zza = v;
        return v < this.zzd.zzb.size() ? ((Map.Entry)this.zzd.zzb.get(this.zza)) : this.zza().next();
    }

    @Override
    public final void remove() {
        if(!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzf();
        if(this.zza < this.zzd.zzb.size()) {
            int v = this.zza;
            this.zza = v - 1;
            this.zzd.zzc(v);
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

