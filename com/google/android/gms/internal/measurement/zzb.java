package com.google.android.gms.internal.measurement;

import J1.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzb {
    @e
    zzac zza;
    @e
    private final zzf zzb;
    @e
    private zzh zzc;
    private final zzaa zzd;

    public zzb() {
        this(new zzf());
    }

    private zzb(zzf zzf0) {
        this.zzb = zzf0;
        this.zzc = zzf0.zza.zza();
        this.zza = new zzac();
        this.zzd = new zzaa();
        zzf0.zza("internal.registerCallback", () -> new zzw(this.zzd));
        zzf0.zza("internal.eventLogger", new zzd(this));
    }

    public final zzac zza() {
        return this.zza;
    }

    public final void zza(zzc zzgd$zzc0) throws com.google.android.gms.internal.measurement.zzc {
        zzal zzal0;
        try {
            this.zzc = this.zzb.zza.zza();
            zzh zzh0 = this.zzc;
            com.google.android.gms.internal.measurement.zzgd.zzd[] arr_zzgd$zzd = (com.google.android.gms.internal.measurement.zzgd.zzd[])zzgd$zzc0.zzc().toArray(new com.google.android.gms.internal.measurement.zzgd.zzd[0]);
            if(this.zzb.zza(zzh0, arr_zzgd$zzd) instanceof zzaj) {
                throw new IllegalStateException("Program loading failed");
            }
            Iterator iterator0 = zzgd$zzc0.zza().zzd().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                List list0 = ((com.google.android.gms.internal.measurement.zzgd.zzb)object0).zzc();
                String s = ((com.google.android.gms.internal.measurement.zzgd.zzb)object0).zzb();
                for(Object object1: list0) {
                    zzaq zzaq0 = this.zzb.zza(this.zzc, new com.google.android.gms.internal.measurement.zzgd.zzd[]{((com.google.android.gms.internal.measurement.zzgd.zzd)object1)});
                    if(!(zzaq0 instanceof zzap)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzh zzh1 = this.zzc;
                    if(zzh1.zzb(s)) {
                        zzaq zzaq1 = zzh1.zza(s);
                        if(!(zzaq1 instanceof zzal)) {
                            throw new IllegalStateException("Invalid function name: " + s);
                        }
                        zzal0 = (zzal)zzaq1;
                    }
                    else {
                        zzal0 = null;
                    }
                    if(zzal0 == null) {
                        throw new IllegalStateException("Rule function is undefined: " + s);
                    }
                    zzal0.zza(this.zzc, Collections.singletonList(zzaq0));
                }
            }
        }
        catch(Throwable throwable0) {
        }
        throw new com.google.android.gms.internal.measurement.zzc(throwable0);
    }

    public final void zza(String s, Callable callable0) {
        this.zzb.zza(s, callable0);
    }

    public final boolean zza(zzad zzad0) throws com.google.android.gms.internal.measurement.zzc {
        try {
            this.zza.zza(zzad0);
            zzai zzai0 = new zzai(0.0);
            this.zzb.zzb.zzc("runtime.counter", zzai0);
            zzh zzh0 = this.zzc.zza();
            this.zzd.zza(zzh0, this.zza);
            return !this.zzd() && !this.zzc() ? false : true;
        }
        catch(Throwable throwable0) {
            throw new com.google.android.gms.internal.measurement.zzc(throwable0);
        }
    }

    // 检测为 Lambda 实现
    final zzal zzb() throws Exception [...]

    public final boolean zzc() {
        return !this.zza.zzc().isEmpty();
    }

    public final boolean zzd() {
        return !this.zza.zzb().equals(this.zza.zza());
    }
}

