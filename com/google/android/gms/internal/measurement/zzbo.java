package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbo extends zzay {
    protected zzbo() {
        this.zza.add(zzbv.zza);
        this.zza.add(zzbv.zzu);
        this.zza.add(zzbv.zzap);
        this.zza.add(zzbv.zzaq);
        this.zza.add(zzbv.zzar);
        this.zza.add(zzbv.zzaw);
        this.zza.add(zzbv.zzax);
        this.zza.add(zzbv.zzaz);
        this.zza.add(zzbv.zzba);
        this.zza.add(zzbv.zzbd);
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        switch(zzg.zza(s)) {
            case 1: {
                zzg.zza(zzbv.zza, 2, list0);
                zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
                zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
                return !(zzaq0 instanceof zzak) && !(zzaq0 instanceof zzas) && !(zzaq1 instanceof zzak) && !(zzaq1 instanceof zzas) ? new zzai(((double)(((double)zzaq0.zze()) + ((double)zzaq1.zze())))) : new zzas(zzaq0.zzf() + zzaq1.zzf());
            }
            case 2: {
                zzg.zza(zzbv.zzu, 2, list0);
                return new zzai(((double)(((double)zzh0.zza(((zzaq)list0.get(0))).zze()) / ((double)zzh0.zza(((zzaq)list0.get(1))).zze()))));
            }
            case 3: {
                zzg.zza(zzbv.zzap, 2, list0);
                return new zzai(((double)(((double)zzh0.zza(((zzaq)list0.get(0))).zze()) % ((double)zzh0.zza(((zzaq)list0.get(1))).zze()))));
            }
            case 4: {
                zzg.zza(zzbv.zzaq, 2, list0);
                return new zzai(((double)(((double)zzh0.zza(((zzaq)list0.get(0))).zze()) * ((double)zzh0.zza(((zzaq)list0.get(1))).zze()))));
            }
            case 5: {
                zzg.zza(zzbv.zzar, 1, list0);
                return new zzai(((double)(((double)zzh0.zza(((zzaq)list0.get(0))).zze()) * -1.0)));
            }
            case 6: 
            case 7: {
                zzg.zza(s, 2, list0);
                zzaq zzaq2 = zzh0.zza(((zzaq)list0.get(0)));
                zzh0.zza(((zzaq)list0.get(1)));
                return zzaq2;
            }
            case 8: 
            case 9: {
                zzg.zza(s, 1, list0);
                return zzh0.zza(((zzaq)list0.get(0)));
            }
            case 10: {
                zzg.zza(zzbv.zzbd, 2, list0);
                zzaq zzaq3 = zzh0.zza(((zzaq)list0.get(0)));
                zzai zzai0 = new zzai(((double)(((double)zzh0.zza(((zzaq)list0.get(1))).zze()) * -1.0)));
                return new zzai(((double)(((double)zzaq3.zze()) + ((double)zzai0.zze()))));
            }
            default: {
                return super.zza(s);
            }
        }
    }
}

