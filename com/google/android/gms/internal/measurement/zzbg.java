package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbg extends zzay {
    protected zzbg() {
        this.zza.add(zzbv.zzb);
        this.zza.add(zzbv.zzas);
        this.zza.add(zzbv.zzav);
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        int v = zzbj.zza[zzg.zza(s).ordinal()];
        switch(v) {
            case 1: {
                zzg.zza(zzbv.zzb, 2, list0);
                zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(0)));
                return zzaq1.zzd().booleanValue() ? zzh0.zza(((zzaq)list0.get(1))) : zzaq1;
            }
            case 2: {
                zzg.zza(zzbv.zzas, 1, list0);
                return new zzag(Boolean.valueOf(!zzh0.zza(((zzaq)list0.get(0))).zzd().booleanValue()));
            }
            default: {
                if(v != 3) {
                    return super.zza(s);
                }
                zzg.zza(zzbv.zzav, 2, list0);
                zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
                return zzaq0.zzd().booleanValue() ? zzaq0 : zzh0.zza(((zzaq)list0.get(1)));
            }
        }
    }
}

