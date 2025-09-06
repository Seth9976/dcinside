package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class zzkg implements zzkh {
    @Override  // com.google.android.gms.internal.vision.zzkh
    public final int zza(int v, Object object0, Object object1) {
        zzkc zzkc0 = (zzkc)object1;
        if(((zzke)object0).isEmpty()) {
            return 0;
        }
        Iterator iterator0 = ((zzke)object0).entrySet().iterator();
        if(!iterator0.hasNext()) {
            return 0;
        }
        Object object2 = iterator0.next();
        ((Map.Entry)object2).getKey();
        ((Map.Entry)object2).getValue();
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final Object zza(Object object0, Object object1) {
        zzke zzke0 = (zzke)object0;
        if(!((zzke)object1).isEmpty()) {
            if(!zzke0.zzd()) {
                zzke0 = zzke0.zzb();
            }
            zzke0.zza(((zzke)object1));
        }
        return zzke0;
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final Map zza(Object object0) {
        return (zzke)object0;
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final zzkf zzb(Object object0) {
        zzkc zzkc0 = (zzkc)object0;
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final Map zzc(Object object0) {
        return (zzke)object0;
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final boolean zzd(Object object0) {
        return !((zzke)object0).zzd();
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final Object zze(Object object0) {
        ((zzke)object0).zzc();
        return object0;
    }

    @Override  // com.google.android.gms.internal.vision.zzkh
    public final Object zzf(Object object0) {
        return zzke.zza().zzb();
    }
}

