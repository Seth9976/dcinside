package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;

public final class zzfxp {
    Object[] zza;
    int zzb;
    zzfxo zzc;

    public zzfxp() {
        this(4);
    }

    zzfxp(int v) {
        this.zza = new Object[v + v];
        this.zzb = 0;
    }

    public final zzfxp zza(Object object0, Object object1) {
        this.zzd(this.zzb + 1);
        zzfwk.zzb(object0, object1);
        Object[] arr_object = this.zza;
        int v = this.zzb;
        int v1 = v + v;
        arr_object[v1] = object0;
        arr_object[v1 + 1] = object1;
        this.zzb = v + 1;
        return this;
    }

    public final zzfxp zzb(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            this.zzd(this.zzb + ((Collection)iterable0).size());
        }
        for(Object object0: iterable0) {
            this.zza(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return this;
    }

    public final zzfxq zzc() {
        zzfxo zzfxo0 = this.zzc;
        if(zzfxo0 != null) {
            throw zzfxo0.zza();
        }
        zzfxq zzfxq0 = zzfze.zzj(this.zzb, this.zza, this);
        zzfxo zzfxo1 = this.zzc;
        if(zzfxo1 != null) {
            throw zzfxo1.zza();
        }
        return zzfxq0;
    }

    private final void zzd(int v) {
        Object[] arr_object = this.zza;
        int v1 = v + v;
        if(v1 > arr_object.length) {
            this.zza = Arrays.copyOf(arr_object, zzfxh.zze(arr_object.length, v1));
        }
    }
}

