package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

final class zzdk implements zzdj {
    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final int zzb(int v, Object object0, Object object1) {
        if(((zzdi)object0).isEmpty()) {
            return 0;
        }
        Iterator iterator0 = ((zzdi)object0).entrySet().iterator();
        if(!iterator0.hasNext()) {
            return 0;
        }
        Object object2 = iterator0.next();
        ((Map.Entry)object2).getKey();
        ((Map.Entry)object2).getValue();
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzb(Object object0, Object object1) {
        zzdi zzdi0 = (zzdi)object0;
        if(!((zzdi)object1).isEmpty()) {
            if(!zzdi0.isMutable()) {
                zzdi0 = zzdi0.zzca();
            }
            zzdi0.zza(((zzdi)object1));
        }
        return zzdi0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final Map zzg(Object object0) {
        return (zzdi)object0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final Map zzh(Object object0) {
        return (zzdi)object0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final boolean zzi(Object object0) {
        return !((zzdi)object0).isMutable();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzj(Object object0) {
        ((zzdi)object0).zzv();
        return object0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzk(Object object0) {
        return zzdi.zzbz().zzca();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzdj
    public final zzdh zzl(Object object0) {
        throw new NoSuchMethodError();
    }
}

