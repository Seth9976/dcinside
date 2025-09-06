package com.google.android.gms.internal.ads;

import j..util.Objects;
import j..util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import o3.a;

public abstract class zzfxs extends zzfxi implements Set, java.util.Set {
    @a
    private transient zzfxn zza;

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof zzfxs) || !this.zzu() || !((zzfxs)object0).zzu() || this.hashCode() == object0.hashCode() ? zzfzp.zzd(this, object0) : false;
    }

    @Override
    public int hashCode() {
        return zzfzp.zza(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public Iterator iterator() {
        return this.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public zzfxn zzd() {
        zzfxn zzfxn0 = this.zza;
        if(zzfxn0 == null) {
            zzfxn0 = this.zzi();
            this.zza = zzfxn0;
        }
        return zzfxn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxi
    public abstract zzfzt zze();

    static int zzh(int v) {
        int v1 = Math.max(v, 2);
        if(v1 < 0x2CCCCCCC) {
            int v2 = Integer.highestOneBit(v1 - 1);
            do {
                v2 += v2;
            }
            while(((double)v2) * 0.7 < ((double)v1));
            return v2;
        }
        zzfun.zzf(v1 < 0x40000000, "collection too large");
        return 0x40000000;
    }

    zzfxn zzi() {
        Object[] arr_object = this.toArray();
        return zzfxn.zzj(arr_object, arr_object.length);
    }

    public static zzfxr zzj(int v) {
        return new zzfxr(v, true);
    }

    public static zzfxs zzl(Collection collection0) {
        if(collection0 instanceof zzfxs && !(collection0 instanceof SortedSet) && !((zzfxs)collection0).zzf()) {
            return (zzfxs)collection0;
        }
        Object[] arr_object = collection0.toArray();
        return zzfxs.zzv(arr_object.length, arr_object);
    }

    public static zzfxs zzm(Object[] arr_object) {
        switch(arr_object.length) {
            case 0: {
                return zzfzf.zza;
            }
            case 1: {
                return new zzfzq(arr_object[0]);
            }
            default: {
                Object[] arr_object1 = (Object[])arr_object.clone();
                return zzfxs.zzv(arr_object.length, arr_object1);
            }
        }
    }

    public static zzfxs zzn() {
        return zzfzf.zza;
    }

    public static zzfxs zzo(Object object0) {
        return new zzfzq(object0);
    }

    public static zzfxs zzp(Object object0, Object object1) {
        return zzfxs.zzv(2, new Object[]{object0, object1});
    }

    public static zzfxs zzq(Object object0, Object object1, Object object2) {
        return zzfxs.zzv(3, new Object[]{object0, object1, object2});
    }

    public static zzfxs zzr(Object object0, Object object1, Object object2, Object object3, Object object4) {
        return zzfxs.zzv(5, new Object[]{object0, object1, object2, object3, object4});
    }

    @SafeVarargs
    public static zzfxs zzs(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object[] arr_object) {
        Object[] arr_object1 = {object0, object1, object2, object3, object4, object5, null, null, null};
        System.arraycopy(arr_object, 0, arr_object1, 6, 3);
        return zzfxs.zzv(9, arr_object1);
    }

    boolean zzu() {
        return false;
    }

    private static zzfxs zzv(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return zzfzf.zza;
            }
            case 1: {
                Object object3 = arr_object[0];
                Objects.requireNonNull(object3);
                return new zzfzq(object3);
            }
            default: {
                int v1 = zzfxs.zzh(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    zzfyx.zza(object0, v2);
                    int v5 = object0.hashCode();
                    for(int v6 = zzfxf.zza(v5); true; ++v6) {
                        int v7 = v6 & v1 - 1;
                        Object object1 = arr_object1[v7];
                        if(object1 == null) {
                            arr_object[v4] = object0;
                            arr_object1[v7] = object0;
                            v3 += v5;
                            ++v4;
                            break;
                        }
                        if(object1.equals(object0)) {
                            break;
                        }
                    }
                }
                Arrays.fill(arr_object, v4, v, null);
                if(v4 == 1) {
                    Object object2 = arr_object[0];
                    Objects.requireNonNull(object2);
                    return new zzfzq(object2);
                }
                if(zzfxs.zzh(v4) < v1 / 2) {
                    return zzfxs.zzv(v4, arr_object);
                }
                if(zzfxs.zzw(v4, arr_object.length)) {
                    arr_object = Arrays.copyOf(arr_object, v4);
                }
                return new zzfzf(arr_object, v3, arr_object1, v1 - 1, v4);
            }
        }
    }

    private static boolean zzw(int v, int v1) {
        return v < (v1 >> 1) + (v1 >> 2);
    }
}

