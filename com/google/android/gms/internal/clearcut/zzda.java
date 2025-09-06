package com.google.android.gms.internal.clearcut;

import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzda extends zzcy {
    private static final Class zzlv;

    static {
        zzda.zzlv = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();
    }

    private zzda() {
        super(null);
    }

    zzda(zzcz zzcz0) {
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcy
    final void zza(Object object0, long v) {
        List list1;
        List list0 = (List)zzfd.zzo(object0, v);
        if(list0 instanceof zzcx) {
            list1 = ((zzcx)list0).zzbu();
        }
        else {
            Class class0 = list0.getClass();
            if(zzda.zzlv.isAssignableFrom(class0)) {
                return;
            }
            list1 = DesugarCollections.unmodifiableList(list0);
        }
        zzfd.zza(object0, v, list1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzcy
    final void zza(Object object0, Object object1, long v) {
        ArrayList arrayList0;
        List list0 = zzda.zzb(object1, v);
        int v1 = list0.size();
        List list1 = zzda.zzb(object0, v);
        if(list1.isEmpty()) {
            list1 = list1 instanceof zzcx ? new zzcw(v1) : new ArrayList(v1);
            zzfd.zza(object0, v, list1);
        }
        else {
            Class class0 = list1.getClass();
            if(zzda.zzlv.isAssignableFrom(class0)) {
                arrayList0 = new ArrayList(list1.size() + v1);
                arrayList0.addAll(list1);
                zzfd.zza(object0, v, arrayList0);
                list1 = arrayList0;
            }
            else if(list1 instanceof zzfa) {
                arrayList0 = new zzcw(list1.size() + v1);
                ((zzav)arrayList0).addAll(((zzfa)list1));
                zzfd.zza(object0, v, arrayList0);
                list1 = arrayList0;
            }
        }
        int v2 = list1.size();
        if(v2 > 0 && list0.size() > 0) {
            list1.addAll(list0);
        }
        if(v2 > 0) {
            list0 = list1;
        }
        zzfd.zza(object0, v, list0);
    }

    private static List zzb(Object object0, long v) {
        return (List)zzfd.zzo(object0, v);
    }
}

