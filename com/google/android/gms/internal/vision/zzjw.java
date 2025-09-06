package com.google.android.gms.internal.vision;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzjw extends zzju {
    private static final Class zza;

    static {
        zzjw.zza = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();
    }

    private zzjw() {
        super(null);
    }

    zzjw(zzjx zzjx0) {
    }

    private static List zza(Object object0, long v, int v1) {
        ArrayList arrayList0;
        List list0 = zzjw.zzc(object0, v);
        if(list0.isEmpty()) {
            if(list0 instanceof zzjv) {
                list0 = new zzjs(v1);
            }
            else if(!(list0 instanceof zzkw) || !(list0 instanceof zzjl)) {
                list0 = new ArrayList(v1);
            }
            else {
                list0 = ((zzjl)list0).zza(v1);
            }
            zzma.zza(object0, v, list0);
            return list0;
        }
        Class class0 = list0.getClass();
        if(zzjw.zza.isAssignableFrom(class0)) {
            arrayList0 = new ArrayList(list0.size() + v1);
            arrayList0.addAll(list0);
            zzma.zza(object0, v, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzlz) {
            arrayList0 = new zzjs(list0.size() + v1);
            ((zzhj)arrayList0).addAll(((zzlz)list0));
            zzma.zza(object0, v, arrayList0);
            return arrayList0;
        }
        if(list0 instanceof zzkw && list0 instanceof zzjl && !((zzjl)list0).zza()) {
            list0 = ((zzjl)list0).zza(list0.size() + v1);
            zzma.zza(object0, v, list0);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.vision.zzju
    final List zza(Object object0, long v) {
        return zzjw.zza(object0, v, 10);
    }

    @Override  // com.google.android.gms.internal.vision.zzju
    final void zza(Object object0, Object object1, long v) {
        List list0 = zzjw.zzc(object1, v);
        List list1 = zzjw.zza(object0, v, list0.size());
        int v1 = list1.size();
        if(v1 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v1 > 0) {
            list0 = list1;
        }
        zzma.zza(object0, v, list0);
    }

    @Override  // com.google.android.gms.internal.vision.zzju
    final void zzb(Object object0, long v) {
        List list1;
        List list0 = (List)zzma.zzf(object0, v);
        if(list0 instanceof zzjv) {
            list1 = ((zzjv)list0).zze();
        }
        else {
            Class class0 = list0.getClass();
            if(zzjw.zza.isAssignableFrom(class0)) {
                return;
            }
            if(list0 instanceof zzkw && list0 instanceof zzjl) {
                if(((zzjl)list0).zza()) {
                    ((zzjl)list0).zzb();
                }
                return;
            }
            list1 = DesugarCollections.unmodifiableList(list0);
        }
        zzma.zza(object0, v, list1);
    }

    private static List zzc(Object object0, long v) {
        return (List)zzma.zzf(object0, v);
    }
}

