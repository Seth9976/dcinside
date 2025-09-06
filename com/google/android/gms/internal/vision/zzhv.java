package com.google.android.gms.internal.vision;

import java.util.Comparator;

final class zzhv implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        zzhy zzhy0 = (zzhy)((zzht)object0).iterator();
        zzhy zzhy1 = (zzhy)((zzht)object1).iterator();
        while(zzhy0.hasNext() && zzhy1.hasNext()) {
            int v = Integer.compare(zzht.zza(zzhy0.zza()), zzht.zza(zzhy1.zza()));
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return Integer.compare(((zzht)object0).zza(), ((zzht)object1).zza());
    }
}

