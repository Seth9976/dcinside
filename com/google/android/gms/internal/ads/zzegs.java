package com.google.android.gms.internal.ads;

import o3.h;

public final class zzegs {
    private final zzfdb zza;
    private final zzdpj zzb;
    private final zzdrw zzc;

    public zzegs(zzfdb zzfdb0, zzdpj zzdpj0, zzdrw zzdrw0) {
        this.zza = zzfdb0;
        this.zzb = zzdpj0;
        this.zzc = zzdrw0;
    }

    public final void zza(zzfbr zzfbr0, zzfbo zzfbo0, int v, @h zzeda zzeda0, long v1) {
        zzdrv zzdrv0 = this.zzc.zza();
        zzdrv0.zzd(zzfbr0);
        zzdrv0.zzc(zzfbo0);
        zzdrv0.zzb("action", "adapter_status");
        zzdrv0.zzb("adapter_l", String.valueOf(v1));
        zzdrv0.zzb("sc", Integer.toString(v));
        if(zzeda0 != null) {
            zzdrv0.zzb("arec", Integer.toString(zzeda0.zzb().zza));
            String s = this.zza.zza(zzeda0.getMessage());
            if(s != null) {
                zzdrv0.zzb("areec", s);
            }
        }
        zzdpi zzdpi0 = null;
        zzdpj zzdpj0 = this.zzb;
        for(Object object0: zzfbo0.zzt) {
            zzdpi zzdpi1 = zzdpj0.zza(((String)object0));
            if(zzdpi1 != null) {
                zzdpi0 = zzdpi1;
                break;
            }
        }
        if(zzdpi0 != null) {
            zzdrv0.zzb("ancn", zzdpi0.zza);
            zzbrs zzbrs0 = zzdpi0.zzb;
            if(zzbrs0 != null) {
                zzdrv0.zzb("adapter_v", zzbrs0.toString());
            }
            zzbrs zzbrs1 = zzdpi0.zzc;
            if(zzbrs1 != null) {
                zzdrv0.zzb("adapter_sv", zzbrs1.toString());
            }
        }
        zzdrv0.zzg();
    }
}

