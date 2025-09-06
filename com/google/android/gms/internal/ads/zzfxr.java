package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.util.Arrays;
import o3.a;

public final class zzfxr extends zzfxg {
    @a
    Object[] zzd;
    private int zze;

    public zzfxr() {
        super(4);
    }

    zzfxr(int v, boolean z) {
        super(v);
        this.zzd = new Object[zzfxs.zzh(v)];
    }

    @Override  // com.google.android.gms.internal.ads.zzfxg
    public final zzfxh zzb(Object object0) {
        this.zzf(object0);
        return this;
    }

    public final zzfxr zzf(Object object0) {
        object0.getClass();
        if(this.zzd != null) {
            int v = zzfxs.zzh(this.zzb);
            Object[] arr_object = this.zzd;
            if(v <= arr_object.length) {
                int v1 = arr_object.length - 1;
                int v2 = object0.hashCode();
                for(int v3 = zzfxf.zza(v2); true; v3 = v4 + 1) {
                    int v4 = v3 & v1;
                    Object[] arr_object1 = this.zzd;
                    Object object1 = arr_object1[v4];
                    if(object1 == null) {
                        arr_object1[v4] = object0;
                        this.zze += v2;
                        super.zza(object0);
                        return this;
                    }
                    if(object1.equals(object0)) {
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(object0);
        return this;
    }

    public final zzfxr zzg(Object[] arr_object) {
        if(this.zzd != null) {
            for(int v = 0; v < 2; ++v) {
                this.zzf(arr_object[v]);
            }
            return this;
        }
        this.zzd(arr_object, 2);
        return this;
    }

    public final zzfxr zzh(Iterable iterable0) {
        iterable0.getClass();
        if(this.zzd != null) {
            for(Object object0: iterable0) {
                this.zzf(object0);
            }
            return this;
        }
        super.zzc(iterable0);
        return this;
    }

    public final zzfxs zzi() {
        zzfxs zzfxs0;
        int v = this.zzb;
        switch(v) {
            case 0: {
                return zzfzf.zza;
            }
            case 1: {
                Object object0 = this.zza[0];
                Objects.requireNonNull(object0);
                return new zzfzq(object0);
            }
            default: {
                if(this.zzd == null || zzfxs.zzh(v) != this.zzd.length) {
                    zzfxs0 = zzfxs.zzv(this.zzb, this.zza);
                    this.zzb = zzfxs0.size();
                }
                else {
                    zzfxs0 = new zzfzf((zzfxs.zzw(this.zzb, this.zza.length) ? Arrays.copyOf(this.zza, this.zzb) : this.zza), this.zze, this.zzd, this.zzd.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzfxs0;
            }
        }
    }
}

