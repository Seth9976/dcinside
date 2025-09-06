package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class zzfxt {
    public static Object zza(Iterable iterable0, Object object0) {
        zzfzt zzfzt0 = ((zzfzj)iterable0).zza();
        return zzfzt0.hasNext() ? zzfzt0.next() : object0;
    }

    public static boolean zzb(Iterable iterable0, zzfuo zzfuo0) {
        if(iterable0 instanceof RandomAccess && iterable0 instanceof List) {
            zzfuo0.getClass();
            return zzfxt.zzd(((List)iterable0), zzfuo0);
        }
        Iterator iterator0 = iterable0.iterator();
        zzfuo0.getClass();
        boolean z = false;
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(zzfuo0.zza(object0)) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    private static void zzc(List list0, zzfuo zzfuo0, int v, int v1) {
        int v2 = list0.size();
        while(true) {
            --v2;
            if(v2 <= v1) {
                break;
            }
            if(zzfuo0.zza(list0.get(v2))) {
                list0.remove(v2);
            }
        }
        while(true) {
            --v1;
            if(v1 < v) {
                break;
            }
            list0.remove(v1);
        }
    }

    private static boolean zzd(List list0, zzfuo zzfuo0) {
        int v = 0;
        int v1 = 0;
        while(v < list0.size()) {
            Object object0 = list0.get(v);
            if(!zzfuo0.zza(object0)) {
                if(v > v1) {
                    try {
                        list0.set(v1, object0);
                    }
                    catch(UnsupportedOperationException unused_ex) {
                        zzfxt.zzc(list0, zzfuo0, v1, v);
                        return true;
                    }
                    catch(IllegalArgumentException unused_ex) {
                        zzfxt.zzc(list0, zzfuo0, v1, v);
                        return true;
                    }
                }
                ++v1;
            }
            ++v;
        }
        list0.subList(v1, list0.size()).clear();
        return v != v1;
    }
}

