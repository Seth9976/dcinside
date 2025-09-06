package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

class zzfxg extends zzfxh {
    Object[] zza;
    int zzb;
    boolean zzc;

    zzfxg(int v) {
        zzfwk.zza(v, "initialCapacity");
        this.zza = new Object[v];
        this.zzb = 0;
    }

    public final zzfxg zza(Object object0) {
        object0.getClass();
        this.zzf(1);
        int v = this.zzb;
        this.zzb = v + 1;
        this.zza[v] = object0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxh
    public zzfxh zzb(Object object0) {
        throw null;
    }

    public final zzfxh zzc(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            this.zzf(((Collection)iterable0).size());
            if(((Collection)iterable0) instanceof zzfxi) {
                this.zzb = ((zzfxi)(((Collection)iterable0))).zza(this.zza, this.zzb);
                return this;
            }
        }
        for(Object object0: iterable0) {
            this.zzb(object0);
        }
        return this;
    }

    final void zzd(Object[] arr_object, int v) {
        zzfyx.zzb(arr_object, 2);
        this.zzf(2);
        System.arraycopy(arr_object, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }

    private final void zzf(int v) {
        int v1 = this.zza.length;
        int v2 = zzfxh.zze(v1, this.zzb + v);
        if(v2 <= v1 && !this.zzc) {
            return;
        }
        this.zza = Arrays.copyOf(this.zza, v2);
        this.zzc = false;
    }
}

