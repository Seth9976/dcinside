package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import o3.a;

public final class zzfzp {
    static int zza(Set set0) {
        int v = 0;
        for(Object object0: set0) {
            v += (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }

    public static zzfzn zzb(Set set0, Set set1) {
        zzfun.zzc(set0, "set1");
        zzfun.zzc(set1, "set2");
        return new zzfzj(set0, set1);
    }

    public static Set zzc(Set set0, zzfuo zzfuo0) {
        if(set0 instanceof SortedSet) {
            if(((SortedSet)set0) instanceof zzfzk) {
                zzfuo zzfuo1 = zzfur.zza(((zzfzk)(((SortedSet)set0))).zzb, zzfuo0);
                return new zzfzl(((SortedSet)((zzfzk)(((SortedSet)set0))).zza), zzfuo1);
            }
            ((SortedSet)set0).getClass();
            return new zzfzl(((SortedSet)set0), zzfuo0);
        }
        if(set0 instanceof zzfzk) {
            zzfuo zzfuo2 = zzfur.zza(((zzfzk)set0).zzb, zzfuo0);
            return new zzfzk(((Set)((zzfzk)set0).zza), zzfuo2);
        }
        set0.getClass();
        return new zzfzk(set0, zzfuo0);
    }

    static boolean zzd(Set set0, @a Object object0) {
        if(set0 == object0) {
            return true;
        }
        if(object0 instanceof Set) {
            Set set1 = (Set)object0;
            try {
                if(set0.size() == set1.size() && set0.containsAll(set1)) {
                    return true;
                }
            }
            catch(NullPointerException | ClassCastException unused_ex) {
            }
        }
        return false;
    }

    static boolean zze(Set set0, Collection collection0) {
        collection0.getClass();
        if(collection0 instanceof zzfyv) {
            collection0 = ((zzfyv)collection0).zza();
        }
        if(collection0 instanceof Set && collection0.size() > set0.size()) {
            Iterator iterator0 = set0.iterator();
            collection0.getClass();
            boolean z = false;
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(collection0.contains(object0)) {
                    iterator0.remove();
                    z = true;
                }
            }
            return z;
        }
        return zzfzp.zzf(set0, collection0.iterator());
    }

    static boolean zzf(Set set0, Iterator iterator0) {
        boolean z;
        for(z = false; iterator0.hasNext(); z |= set0.remove(object0)) {
            Object object0 = iterator0.next();
        }
        return z;
    }
}

