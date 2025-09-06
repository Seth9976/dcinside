package com.google.android.gms.internal.ads;

public class zzbdv {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbdv(String s, Object object0, int v) {
        this.zza = s;
        this.zzb = object0;
        this.zzc = v;
    }

    public static zzbdv zza(String s, double f) {
        return new zzbdv(s, f, 3);
    }

    public static zzbdv zzb(String s, long v) {
        return new zzbdv(s, v, 2);
    }

    public static zzbdv zzc(String s, String s1) {
        return new zzbdv("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbdv zzd(String s, boolean z) {
        return new zzbdv(s, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbfa zzbfa0 = zzbfc.zza();
        if(zzbfa0 == null) {
            if(zzbfc.zzb() != null) {
                zzbfc.zzb().zza();
            }
            return this.zzb;
        }
        switch(this.zzc - 1) {
            case 0: {
                return zzbfa0.zza(this.zza, ((Boolean)this.zzb).booleanValue());
            }
            case 1: {
                return zzbfa0.zzc(this.zza, ((long)(((Long)this.zzb))));
            }
            case 2: {
                return zzbfa0.zzb(this.zza, ((double)(((Double)this.zzb))));
            }
            default: {
                return zzbfa0.zzd(this.zza, ((String)this.zzb));
            }
        }
    }
}

