package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

public final class zzn extends zzap {
    private final zzac zza;

    public zzn(zzac zzac0) {
        this.zza = zzac0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzap
    public final zzaq zza(String s, zzh zzh0, List list0) {
        s.hashCode();
        switch(s) {
            case "getEventName": {
                zzg.zza("getEventName", 0, list0);
                return new zzas(this.zza.zzb().zzb());
            }
            case "getParamValue": {
                zzg.zza("getParamValue", 1, list0);
                String s1 = zzh0.zza(((zzaq)list0.get(0))).zzf();
                return zzj.zza(this.zza.zzb().zza(s1));
            }
            case "getParams": {
                zzg.zza("getParams", 0, list0);
                Map map0 = this.zza.zzb().zzc();
                zzaq zzaq0 = new zzap();
                for(Object object0: map0.keySet()) {
                    ((zzap)zzaq0).zza(((String)object0), zzj.zza(map0.get(((String)object0))));
                }
                return zzaq0;
            }
            case "getTimestamp": {
                zzg.zza("getTimestamp", 0, list0);
                return new zzai(((double)this.zza.zzb().zza()));
            }
            case "setEventName": {
                zzg.zza("setEventName", 1, list0);
                zzaq zzaq2 = zzh0.zza(((zzaq)list0.get(0)));
                if(zzaq.zzc.equals(zzaq2) || zzaq.zzd.equals(zzaq2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                String s3 = zzaq2.zzf();
                this.zza.zzb().zzb(s3);
                return new zzas(zzaq2.zzf());
            }
            case "setParamValue": {
                zzg.zza("setParamValue", 2, list0);
                String s2 = zzh0.zza(((zzaq)list0.get(0))).zzf();
                zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
                Object object1 = zzg.zza(zzaq1);
                this.zza.zzb().zza(s2, object1);
                return zzaq1;
            }
            default: {
                return super.zza(s, zzh0, list0);
            }
        }
    }
}

