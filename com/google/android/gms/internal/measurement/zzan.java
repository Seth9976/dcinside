package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzan {
    public static zzaq zza(zzak zzak0, zzaq zzaq0, zzh zzh0, List list0) {
        if(zzak0.zzc(zzaq0.zzf())) {
            zzaq zzaq1 = zzak0.zza(zzaq0.zzf());
            if(!(zzaq1 instanceof zzal)) {
                throw new IllegalArgumentException(String.format("%s is not a function", zzaq0.zzf()));
            }
            return ((zzal)zzaq1).zza(zzh0, list0);
        }
        if(!"hasOwnProperty".equals(zzaq0.zzf())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", zzaq0.zzf()));
        }
        zzg.zza("hasOwnProperty", 1, list0);
        return zzak0.zzc(zzh0.zza(((zzaq)list0.get(0))).zzf()) ? zzaq.zzh : zzaq.zzi;
    }

    public static Iterator zza(Map map0) {
        return new zzam(map0.keySet().iterator());
    }
}

