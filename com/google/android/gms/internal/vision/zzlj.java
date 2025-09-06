package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;

final class zzlj implements Iterator {
    private int zza;
    private Iterator zzb;
    private final zzlh zzc;

    private zzlj(zzlh zzlh0) {
        this.zzc = zzlh0;
        super();
        this.zza = zzlh0.zzb.size();
    }

    zzlj(zzlh zzlh0, zzlg zzlg0) {
        this(zzlh0);
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean hasNext() {
        return this.zza > 0 && this.zza <= this.zzc.zzb.size() || this.zza().hasNext();
    }

    @Override
    public final Object next() {
        if(this.zza().hasNext()) {
            return this.zza().next();
        }
        int v = this.zza - 1;
        this.zza = v;
        return (Map.Entry)this.zzc.zzb.get(v);
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

