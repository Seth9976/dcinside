package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class zzhei extends AbstractList {
    final List zza;
    final Iterator zzb;
    private static final zzhej zzc;

    static {
        zzhei.zzc = zzhej.zzb(zzhei.class);
    }

    public zzhei(List list0, Iterator iterator0) {
        this.zza = list0;
        this.zzb = iterator0;
    }

    @Override
    public final Object get(int v) {
        if(this.zza.size() > v) {
            return this.zza.get(v);
        }
        if(!this.zzb.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.zzb.next();
        this.zza.add(object0);
        return this.get(v);
    }

    @Override
    public final Iterator iterator() {
        return new zzheh(this);
    }

    @Override
    public final int size() {
        zzhei.zzc.zza("potentially expensive size() call");
        zzhei.zzc.zza("blowup running");
        while(this.zzb.hasNext()) {
            Object object0 = this.zzb.next();
            this.zza.add(object0);
        }
        return this.zza.size();
    }
}

