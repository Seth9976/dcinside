package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class zzky implements zzkv {
    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final int zza(int v, Object object0, Object object1) {
        zzku zzku0 = (zzku)object1;
        if(((zzkw)object0).isEmpty()) {
            return 0;
        }
        Iterator iterator0 = ((zzkw)object0).entrySet().iterator();
        if(!iterator0.hasNext()) {
            return 0;
        }
        Object object2 = iterator0.next();
        ((Map.Entry)object2).getKey();
        ((Map.Entry)object2).getValue();
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final zzkt zza(Object object0) {
        zzku zzku0 = (zzku)object0;
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final Object zza(Object object0, Object object1) {
        zzkw zzkw0 = (zzkw)object0;
        if(!((zzkw)object1).isEmpty()) {
            if(!zzkw0.zzd()) {
                zzkw0 = zzkw0.zzb();
            }
            zzkw0.zza(((zzkw)object1));
        }
        return zzkw0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final Object zzb(Object object0) {
        return zzkw.zza().zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final Object zzc(Object object0) {
        ((zzkw)object0).zzc();
        return object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final Map zzd(Object object0) {
        return (zzkw)object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final Map zze(Object object0) {
        return (zzkw)object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkv
    public final boolean zzf(Object object0) {
        return !((zzkw)object0).zzd();
    }
}

