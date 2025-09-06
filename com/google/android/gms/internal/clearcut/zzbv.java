package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Map.Entry;

final class zzbv extends zzbu {
    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final int zza(Map.Entry map$Entry0) {
        return ((zze)map$Entry0.getKey()).number;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final zzby zza(Object object0) {
        return ((zzd)object0).zzjv;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final void zza(zzfr zzfr0, Map.Entry map$Entry0) throws IOException {
        zze zzcg$zze0 = (zze)map$Entry0.getKey();
        switch(zzbw.zzgq[zzcg$zze0.zzjx.ordinal()]) {
            case 1: {
                double f = (double)(((Double)map$Entry0.getValue()));
                zzfr0.zza(zzcg$zze0.number, f);
                return;
            }
            case 2: {
                float f1 = (float)(((Float)map$Entry0.getValue()));
                zzfr0.zza(zzcg$zze0.number, f1);
                return;
            }
            case 3: {
                long v = (long)(((Long)map$Entry0.getValue()));
                zzfr0.zzi(zzcg$zze0.number, v);
                return;
            }
            case 4: {
                long v1 = (long)(((Long)map$Entry0.getValue()));
                zzfr0.zza(zzcg$zze0.number, v1);
                return;
            }
            case 5: {
                int v2 = (int)(((Integer)map$Entry0.getValue()));
                zzfr0.zzc(zzcg$zze0.number, v2);
                return;
            }
            case 6: {
                long v3 = (long)(((Long)map$Entry0.getValue()));
                zzfr0.zzc(zzcg$zze0.number, v3);
                return;
            }
            case 7: {
                int v4 = (int)(((Integer)map$Entry0.getValue()));
                zzfr0.zzf(zzcg$zze0.number, v4);
                return;
            }
            case 8: {
                boolean z = ((Boolean)map$Entry0.getValue()).booleanValue();
                zzfr0.zzb(zzcg$zze0.number, z);
                return;
            }
            case 9: {
                int v5 = (int)(((Integer)map$Entry0.getValue()));
                zzfr0.zzd(zzcg$zze0.number, v5);
                return;
            }
            case 10: {
                int v6 = (int)(((Integer)map$Entry0.getValue()));
                zzfr0.zzm(zzcg$zze0.number, v6);
                return;
            }
            case 11: {
                long v7 = (long)(((Long)map$Entry0.getValue()));
                zzfr0.zzj(zzcg$zze0.number, v7);
                return;
            }
            case 12: {
                int v8 = (int)(((Integer)map$Entry0.getValue()));
                zzfr0.zze(zzcg$zze0.number, v8);
                return;
            }
            case 13: {
                long v9 = (long)(((Long)map$Entry0.getValue()));
                zzfr0.zzb(zzcg$zze0.number, v9);
                return;
            }
            case 14: {
                int v10 = (int)(((Integer)map$Entry0.getValue()));
                zzfr0.zzc(zzcg$zze0.number, v10);
                return;
            }
            case 15: {
                zzbb zzbb0 = (zzbb)map$Entry0.getValue();
                zzfr0.zza(zzcg$zze0.number, zzbb0);
                return;
            }
            case 16: {
                String s = (String)map$Entry0.getValue();
                zzfr0.zza(zzcg$zze0.number, s);
                return;
            }
            case 17: {
                Object object0 = map$Entry0.getValue();
                zzef zzef0 = zzea.zzcm().zze(map$Entry0.getValue().getClass());
                zzfr0.zzb(zzcg$zze0.number, object0, zzef0);
                return;
            }
            case 18: {
                Object object1 = map$Entry0.getValue();
                zzef zzef1 = zzea.zzcm().zze(map$Entry0.getValue().getClass());
                zzfr0.zza(zzcg$zze0.number, object1, zzef1);
            }
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final void zza(Object object0, zzby zzby0) {
        ((zzd)object0).zzjv = zzby0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final zzby zzb(Object object0) {
        zzby zzby0 = this.zza(object0);
        if(zzby0.isImmutable()) {
            zzby0 = (zzby)zzby0.clone();
            this.zza(object0, zzby0);
        }
        return zzby0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final void zzc(Object object0) {
        this.zza(object0).zzv();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzbu
    final boolean zze(zzdo zzdo0) {
        return zzdo0 instanceof zzd;
    }
}

