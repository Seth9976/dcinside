package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzj {
    public static zzaq zza(zzd zzgd$zzd0) {
        if(zzgd$zzd0 == null) {
            return zzaq.zzc;
        }
        switch(zzgd$zzd0.zzb()) {
            case 1: {
                return zzgd$zzd0.zzj() ? new zzas("") : zzaq.zzj;
            }
            case 2: {
                return zzgd$zzd0.zzi() ? new zzai(zzgd$zzd0.zza()) : new zzai(null);
            }
            case 3: {
                return zzgd$zzd0.zzh() ? new zzag(Boolean.valueOf(zzgd$zzd0.zzg())) : new zzag(null);
            }
            case 4: {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: zzgd$zzd0.zzf()) {
                    arrayList0.add(zzj.zza(((zzd)object0)));
                }
                return new zzat("", arrayList0);
            }
            case 5: {
                throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
            }
            default: {
                throw new IllegalStateException("Invalid entity: " + zzgd$zzd0);
            }
        }
    }

    public static zzaq zza(Object object0) {
        if(object0 == null) {
            return zzaq.zzd;
        }
        if(object0 instanceof String) {
            return new zzas(((String)object0));
        }
        if(object0 instanceof Double) {
            return new zzai(((Double)object0));
        }
        if(object0 instanceof Long) {
            return new zzai(((Long)object0).doubleValue());
        }
        if(object0 instanceof Integer) {
            return new zzai(((Integer)object0).doubleValue());
        }
        if(object0 instanceof Boolean) {
            return new zzag(((Boolean)object0));
        }
        if(object0 instanceof Map) {
            zzaq zzaq0 = new zzap();
            for(String s: ((Map)object0).keySet()) {
                zzaq zzaq1 = zzj.zza(((Map)object0).get(s));
                if(s != null) {
                    if(!(s instanceof String)) {
                        s = s.toString();
                    }
                    ((zzap)zzaq0).zza(s, zzaq1);
                }
            }
            return zzaq0;
        }
        if(!(object0 instanceof List)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        zzaq zzaq2 = new zzaf();
        for(Object object1: ((List)object0)) {
            ((zzaf)zzaq2).zza(zzj.zza(object1));
        }
        return zzaq2;
    }
}

