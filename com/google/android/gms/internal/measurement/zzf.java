package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.concurrent.Callable;

public final class zzf {
    @e
    final zzh zza;
    @e
    final zzh zzb;
    @e
    private final zzbb zzc;
    @e
    private final zzl zzd;

    public zzf() {
        zzbb zzbb0 = new zzbb();
        this.zzc = zzbb0;
        zzh zzh0 = new zzh(null, zzbb0);
        this.zzb = zzh0;
        this.zza = zzh0.zza();
        zzl zzl0 = new zzl();
        this.zzd = zzl0;
        zzh0.zzc("require", new zzz(zzl0));
        zzl0.zza("internal.platform", new zze());
        zzh0.zzc("runtime.counter", new zzai(0.0));
    }

    public final zzaq zza(zzh zzh0, zzd[] arr_zzgd$zzd) {
        zzaq zzaq0 = zzaq.zzc;
        for(int v = 0; v < arr_zzgd$zzd.length; ++v) {
            zzaq0 = zzj.zza(arr_zzgd$zzd[v]);
            zzg.zza(this.zzb);
            if(zzaq0 instanceof zzat || zzaq0 instanceof zzar) {
                zzaq0 = this.zzc.zza(zzh0, zzaq0);
            }
        }
        return zzaq0;
    }

    public final void zza(String s, Callable callable0) {
        this.zzd.zza(s, callable0);
    }
}

