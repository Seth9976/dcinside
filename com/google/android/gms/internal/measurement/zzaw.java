package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzaw extends zzay {
    public zzaw() {
        this.zza.add(zzbv.zze);
        this.zza.add(zzbv.zzf);
        this.zza.add(zzbv.zzg);
        this.zza.add(zzbv.zzh);
        this.zza.add(zzbv.zzi);
        this.zza.add(zzbv.zzj);
        this.zza.add(zzbv.zzk);
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        switch(zzg.zza(s)) {
            case 1: {
                zzg.zza(zzbv.zze, 2, list0);
                return new zzai(((double)(zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())) & zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(1))).zze())))));
            }
            case 2: {
                zzg.zza(zzbv.zzf, 2, list0);
                return new zzai(((double)(zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())) << ((int)(zzg.zzc(((double)zzh0.zza(((zzaq)list0.get(1))).zze())) & 0x1FL)))));
            }
            case 3: {
                zzg.zza(zzbv.zzg, 1, list0);
                return new zzai(((double)(~zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())))));
            }
            case 4: {
                zzg.zza(zzbv.zzh, 2, list0);
                return new zzai(((double)(zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())) | zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(1))).zze())))));
            }
            case 5: {
                zzg.zza(zzbv.zzi, 2, list0);
                return new zzai(((double)(zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())) >> ((int)(zzg.zzc(((double)zzh0.zza(((zzaq)list0.get(1))).zze())) & 0x1FL)))));
            }
            case 6: {
                zzg.zza(zzbv.zzj, 2, list0);
                return new zzai(((double)(zzg.zzc(((double)zzh0.zza(((zzaq)list0.get(0))).zze())) >>> ((int)(zzg.zzc(((double)zzh0.zza(((zzaq)list0.get(1))).zze())) & 0x1FL)))));
            }
            case 7: {
                zzg.zza(zzbv.zzk, 2, list0);
                return new zzai(((double)(zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(0))).zze())) ^ zzg.zzb(((double)zzh0.zza(((zzaq)list0.get(1))).zze())))));
            }
            default: {
                return super.zza(s);
            }
        }
    }
}

