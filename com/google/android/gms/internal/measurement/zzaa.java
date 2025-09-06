package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.Collections;
import java.util.TreeMap;

public final class zzaa {
    @e
    private final TreeMap zza;
    @e
    private final TreeMap zzb;

    public zzaa() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    private static int zza(zzh zzh0, zzar zzar0, zzaq zzaq0) {
        zzaq zzaq1 = zzar0.zza(zzh0, Collections.singletonList(zzaq0));
        return zzaq1 instanceof zzai ? zzg.zzb(((double)zzaq1.zze())) : -1;
    }

    public final void zza(zzh zzh0, zzac zzac0) {
        zzn zzn0 = new zzn(zzac0);
        for(Object object0: this.zza.keySet()) {
            zzad zzad0 = (zzad)zzac0.zzb().clone();
            switch(zzaa.zza(zzh0, ((zzar)this.zza.get(((Integer)object0))), zzn0)) {
                case -1: 
                case 2: {
                    zzac0.zzb(zzad0);
                }
            }
        }
        for(Object object1: this.zzb.keySet()) {
            zzaa.zza(zzh0, ((zzar)this.zzb.get(((Integer)object1))), zzn0);
        }
    }

    public final void zza(String s, int v, zzar zzar0, String s1) {
        TreeMap treeMap0;
        if("create".equals(s1)) {
            treeMap0 = this.zzb;
        }
        else if("edit".equals(s1)) {
            treeMap0 = this.zza;
        }
        else {
            throw new IllegalStateException("Unknown callback type: " + s1);
        }
        if(treeMap0.containsKey(v)) {
            v = ((int)(((Integer)treeMap0.lastKey()))) + 1;
        }
        treeMap0.put(v, zzar0);
    }
}

