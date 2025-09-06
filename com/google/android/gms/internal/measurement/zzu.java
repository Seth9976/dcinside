package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzu extends zzal {
    private boolean zzk;
    private boolean zzl;
    private final zzr zzm;

    public zzu(zzr zzr0, boolean z, boolean z1) {
        this.zzm = zzr0;
        super("log");
        this.zzk = z;
        this.zzl = z1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        zzg.zzb("log", 1, list0);
        if(list0.size() == 1) {
            String s = zzh0.zza(((zzaq)list0.get(0))).zzf();
            List list1 = Collections.emptyList();
            this.zzm.zzk.zza(zzs.zzc, s, list1, this.zzk, this.zzl);
            return zzaq.zzc;
        }
        zzs zzs0 = zzs.zza(zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())));
        String s1 = zzh0.zza(((zzaq)list0.get(1))).zzf();
        if(list0.size() == 2) {
            this.zzm.zzk.zza(zzs0, s1, Collections.emptyList(), this.zzk, this.zzl);
            return zzaq.zzc;
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 2; v < Math.min(list0.size(), 5); ++v) {
            arrayList0.add(zzh0.zza(((zzaq)list0.get(v))).zzf());
        }
        this.zzm.zzk.zza(zzs0, s1, arrayList0, this.zzk, this.zzl);
        return zzaq.zzc;
    }
}

