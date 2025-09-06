package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzp extends zzal {
    private final zzo zzk;

    zzp(zzm zzm0, String s, zzo zzo0) {
        this.zzk = zzo0;
        super(s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzh0, List list0) {
        zzg.zza("getValue", 2, list0);
        zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
        zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
        String s = zzaq0.zzf();
        String s1 = this.zzk.zza(s);
        return s1 != null ? new zzas(s1) : zzaq1;
    }
}

