package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o3.a;

final class zzgap extends AbstractList implements Serializable, RandomAccess {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzgap(int[] arr_v, int v, int v1) {
        this.zza = arr_v;
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final boolean contains(@a Object object0) {
        return object0 instanceof Integer && zzgaq.zza(this.zza, ((int)(((Integer)object0))), this.zzb, this.zzc) != -1;
    }

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzgap) {
            int v = this.zzc - this.zzb;
            if(((zzgap)object0).zzc - ((zzgap)object0).zzb == v) {
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.zza[this.zzb + v1] != ((zzgap)object0).zza[((zzgap)object0).zzb + v1]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return super.equals(object0);
    }

    @Override
    public final Object get(int v) {
        zzfun.zza(v, this.zzc - this.zzb, "index");
        return (int)this.zza[this.zzb + v];
    }

    @Override
    public final int hashCode() {
        int v = this.zzb;
        int v1 = 1;
        while(v < this.zzc) {
            v1 = v1 * 0x1F + this.zza[v];
            ++v;
        }
        return v1;
    }

    @Override
    public final int indexOf(@a Object object0) {
        if(object0 instanceof Integer) {
            int v = zzgaq.zza(this.zza, ((int)(((Integer)object0))), this.zzb, this.zzc);
            return v < 0 ? -1 : v - this.zzb;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(@a Object object0) {
        if(object0 instanceof Integer) {
            int[] arr_v = this.zza;
            int v = (int)(((Integer)object0));
            int v1 = this.zzb;
            int v2;
            for(v2 = this.zzc - 1; true; --v2) {
                if(v2 < v1) {
                    v2 = -1;
                    break;
                }
                if(arr_v[v2] == v) {
                    break;
                }
            }
            return v2 < 0 ? -1 : v2 - this.zzb;
        }
        return -1;
    }

    @Override
    public final Object set(int v, Object object0) {
        zzfun.zza(v, this.zzc - this.zzb, "index");
        int v1 = this.zzb + v;
        int v2 = this.zza[v1];
        ((Integer)object0).getClass();
        this.zza[v1] = (int)(((Integer)object0));
        return v2;
    }

    @Override
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override
    public final List subList(int v, int v1) {
        zzfun.zzk(v, v1, this.zzc - this.zzb);
        return v == v1 ? Collections.emptyList() : new zzgap(this.zza, this.zzb + v, v1 + this.zzb);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder((this.zzc - this.zzb) * 5);
        stringBuilder0.append('[');
        stringBuilder0.append(this.zza[this.zzb]);
        int v = this.zzb;
        while(true) {
            ++v;
            if(v >= this.zzc) {
                break;
            }
            stringBuilder0.append(", ");
            stringBuilder0.append(this.zza[v]);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

