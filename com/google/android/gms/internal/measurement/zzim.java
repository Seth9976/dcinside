package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class zzim implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        zziq zziq0 = (zziq)((zzik)object0).iterator();
        zziq zziq1 = (zziq)((zzik)object1).iterator();
        while(zziq0.hasNext() && zziq1.hasNext()) {
            int v = Integer.compare(zzik.zza(zziq0.zza()), zzik.zza(zziq1.zza()));
            if(v != 0) {
                return v;
            }
            if(false) {
                break;
            }
        }
        return Integer.compare(((zzik)object0).zzb(), ((zzik)object1).zzb());
    }
}

