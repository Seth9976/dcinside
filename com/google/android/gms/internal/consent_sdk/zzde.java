package com.google.android.gms.internal.consent_sdk;

import j..util.Objects;
import j..util.Set;
import java.util.Arrays;
import java.util.Iterator;
import o3.a;

public abstract class zzde extends zzda implements Set, java.util.Set {
    @a
    private transient zzdd zza;

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzde && this.zzk() && ((zzde)object0).zzk() && this.hashCode() != object0.hashCode()) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof java.util.Set) {
            java.util.Set set0 = (java.util.Set)object0;
            try {
                return this.size() == set0.size() && this.containsAll(set0);
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: this) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    public Iterator iterator() {
        return this.zzd();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzda
    public abstract zzdj zzd();

    static int zzf(int v) {
        int v1 = Math.max(v, 2);
        if(v1 < 0x2CCCCCCC) {
            int v2 = Integer.highestOneBit(v1 - 1);
            do {
                v2 += v2;
            }
            while(((double)v2) * 0.7 < ((double)v1));
            return v2;
        }
        if(v1 >= 0x40000000) {
            throw new IllegalArgumentException("collection too large");
        }
        return 0x40000000;
    }

    public final zzdd zzg() {
        zzdd zzdd0 = this.zza;
        if(zzdd0 == null) {
            zzdd0 = this.zzh();
            this.zza = zzdd0;
        }
        return zzdd0;
    }

    zzdd zzh() {
        Object[] arr_object = this.toArray();
        return zzdd.zzg(arr_object, arr_object.length);
    }

    public static zzde zzi() {
        return zzdh.zza;
    }

    public static zzde zzj(Object object0, Object object1, Object object2, Object object3) {
        return zzde.zzl(4, new Object[]{"IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String"});
    }

    boolean zzk() {
        return false;
    }

    private static zzde zzl(int v, Object[] arr_object) {
        switch(v) {
            case 0: {
                return zzdh.zza;
            }
            case 1: {
                Object object3 = arr_object[0];
                Objects.requireNonNull(object3);
                return new zzdi(object3);
            }
            default: {
                int v1 = zzde.zzf(v);
                Object[] arr_object1 = new Object[v1];
                int v3 = 0;
                int v4 = 0;
                for(int v2 = 0; v2 < v; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 == null) {
                        throw new NullPointerException("at index " + v2);
                    }
                    int v5 = object0.hashCode();
                    for(int v6 = zzcz.zza(v5); true; ++v6) {
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
                    return new zzdi(object2);
                }
                if(zzde.zzf(v4) >= v1 / 2) {
                    if(v4 < 3) {
                        arr_object = Arrays.copyOf(arr_object, v4);
                    }
                    return new zzdh(arr_object, v3, arr_object1, v1 - 1, v4);
                }
                return zzde.zzl(v4, arr_object);
            }
        }
    }
}

