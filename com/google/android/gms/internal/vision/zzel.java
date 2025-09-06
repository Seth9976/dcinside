package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;

public final class zzel extends zzek {
    public final zzem zza() {
        zzej zzej0;
        int v6;
        int v5;
        int v3;
        Object[] arr_object1;
        Set set0 = this.zza.entrySet();
        if(set0.isEmpty()) {
            return zzdz.zza;
        }
        zzei zzei0 = new zzei(set0.size());
        int v = 0;
        for(Object object0: set0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Collection collection0 = (Collection)((Map.Entry)object0).getValue();
            if(!(collection0 instanceof zzej) || collection0 instanceof SortedSet || ((zzej)collection0).zzf()) {
                Object[] arr_object = collection0.toArray();
                int v1 = arr_object.length;
            alab1:
                while(true) {
                    switch(v1) {
                        case 0: {
                            zzej0 = zzev.zza;
                            goto label_53;
                        }
                        case 1: {
                            goto label_52;
                        }
                        default: {
                            int v2 = zzej.zza(v1);
                            arr_object1 = new Object[v2];
                            v3 = v2 - 1;
                            v5 = 0;
                            v6 = 0;
                            for(int v4 = 0; v4 < v1; ++v4) {
                                Object object2 = zzeq.zza(arr_object[v4], v4);
                                int v7 = object2.hashCode();
                                for(int v8 = zzec.zza(v7); true; ++v8) {
                                    int v9 = v8 & v3;
                                    Object object3 = arr_object1[v9];
                                    if(object3 == null) {
                                        arr_object[v5] = object2;
                                        arr_object1[v9] = object2;
                                        v6 += v7;
                                        ++v5;
                                        break;
                                    }
                                    if(object3.equals(object2)) {
                                        break;
                                    }
                                }
                            }
                            Arrays.fill(arr_object, v5, v1, null);
                            if(v5 == 1) {
                                zzej0 = new zzex(arr_object[0], v6);
                                goto label_53;
                            }
                            else {
                                if(zzej.zza(v5) < v2 / 2) {
                                    v1 = v5;
                                    break;
                                }
                                break alab1;
                            }
                            zzej0 = zzev.zza;
                            goto label_53;
                        }
                    }
                }
                if(v5 < (arr_object.length >> 1) + (arr_object.length >> 2)) {
                    arr_object = Arrays.copyOf(arr_object, v5);
                }
                zzej0 = new zzev(arr_object, v6, arr_object1, v3, v5);
                goto label_53;
            label_52:
                zzej0 = new zzex(arr_object[0]);
            }
            else {
                zzej0 = (zzej)collection0;
            }
        label_53:
            if(!zzej0.isEmpty()) {
                int v10 = zzei0.zzb + 1 << 1;
                Object[] arr_object2 = zzei0.zza;
                if(v10 > arr_object2.length) {
                    if(v10 < 0) {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                    int v11 = arr_object2.length + (arr_object2.length >> 1) + 1 >= v10 ? arr_object2.length + (arr_object2.length >> 1) + 1 : Integer.highestOneBit(v10 - 1) << 1;
                    if(v11 < 0) {
                        v11 = 0x7FFFFFFF;
                    }
                    zzei0.zza = Arrays.copyOf(arr_object2, v11);
                    zzei0.zzc = false;
                }
                zzdq.zza(object1, zzej0);
                Object[] arr_object3 = zzei0.zza;
                int v12 = zzei0.zzb;
                arr_object3[v12 * 2] = object1;
                arr_object3[v12 * 2 + 1] = zzej0;
                zzei0.zzb = v12 + 1;
                v += zzej0.size();
            }
        }
        zzei0.zzc = true;
        return new zzem(zzes.zza(zzei0.zzb, zzei0.zza), v, null);
    }
}

