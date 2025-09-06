package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfy.zzf.zza;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzjt;
import java.util.List;

final class zzy {
    private zzf zza;
    private Long zzb;
    private long zzc;
    private final zzt zzd;

    private zzy(zzt zzt0) {
        this.zzd = zzt0;
        super();
    }

    zzy(zzt zzt0, zzac zzac0) {
        this(zzt0);
    }

    final zzf zza(String s, zzf zzfy$zzf0) {
        List list0 = zzfy$zzf0.zzh();
        this.zzd.g_();
        Object object0 = zzoo.zzb(zzfy$zzf0, "_eid");
        if(((Long)object0) != null) {
            this.zzb = (Long)object0;
            this.zza = zzfy$zzf0;
            this.zzd.g_();
            long v = (long)(((Long)zzoo.zza(zzfy$zzf0, "_epc", 0L)));
            this.zzc = v;
            if(v <= 0L) {
                this.zzd.zzj().zzn().zza("Complex event with zero extra param count. eventName", "");
                return (zzf)(((zzjt)((zza)zzfy$zzf0.zzcd()).zza("").zzd().zza(list0).zzai()));
            }
            this.zzd.zzh().zza(s, ((Long)Preconditions.checkNotNull(((Long)object0))), this.zzc, zzfy$zzf0);
        }
        return (zzf)(((zzjt)((zza)zzfy$zzf0.zzcd()).zza("").zzd().zza(list0).zzai()));
    }
}

