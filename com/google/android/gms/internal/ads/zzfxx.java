package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import o3.a;

public final class zzfxx {
    @a
    static Object zza(Iterator iterator0) {
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            return object0;
        }
        return null;
    }

    static void zzb(Iterator iterator0) {
        while(iterator0.hasNext()) {
            iterator0.next();
            iterator0.remove();
        }
    }

    public static boolean zzc(Collection collection0, Iterator iterator0) {
        boolean z;
        for(z = false; iterator0.hasNext(); z |= collection0.add(object0)) {
            Object object0 = iterator0.next();
        }
        return z;
    }
}

