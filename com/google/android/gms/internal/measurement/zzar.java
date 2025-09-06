package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.ArrayList;
import java.util.List;

public final class zzar extends zzal implements zzak {
    @e
    private final List zzk;
    @e
    private final List zzl;
    @e
    private zzh zzm;

    private zzar(zzar zzar0) {
        super(zzar0.zza);
        ArrayList arrayList0 = new ArrayList(zzar0.zzk.size());
        this.zzk = arrayList0;
        arrayList0.addAll(zzar0.zzk);
        ArrayList arrayList1 = new ArrayList(zzar0.zzl.size());
        this.zzl = arrayList1;
        arrayList1.addAll(zzar0.zzl);
        this.zzm = zzar0.zzm;
    }

    public zzar(String s, List list0, List list1, zzh zzh0) {
        super(s);
        this.zzk = new ArrayList();
        this.zzm = zzh0;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                String s1 = ((zzaq)object0).zzf();
                this.zzk.add(s1);
            }
        }
        this.zzl = new ArrayList(list1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        zzh zzh1 = this.zzm.zza();
        for(int v = 0; v < this.zzk.size(); ++v) {
            if(v < list0.size()) {
                zzh1.zza(((String)this.zzk.get(v)), zzh0.zza(((zzaq)list0.get(v))));
            }
            else {
                zzh1.zza(((String)this.zzk.get(v)), zzaq.zzc);
            }
        }
        for(Object object0: this.zzl) {
            zzaq zzaq0 = (zzaq)object0;
            zzaq zzaq1 = zzh1.zza(zzaq0);
            if(zzaq1 instanceof zzat) {
                zzaq1 = zzh1.zza(zzaq0);
            }
            if(zzaq1 instanceof zzaj) {
                return ((zzaj)zzaq1).zza();
            }
            if(false) {
                break;
            }
        }
        return zzaq.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zzc() {
        return new zzar(this);
    }
}

