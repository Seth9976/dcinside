package com.google.android.gms.internal.ads;

public final class zzhch extends zzgxr implements zzgzd {
    private static final zzhch zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzhcg zzd;
    private zzgyd zze;
    private zzgwj zzf;
    private zzgwj zzg;
    private int zzh;
    private zzgwj zzi;
    private byte zzj;

    static {
        zzhch zzhch0 = new zzhch();
        zzhch.zza = zzhch0;
        zzgxr.zzbZ(zzhch.class, zzhch0);
    }

    private zzhch() {
        this.zzj = 2;
        this.zze = zzgxr.zzbK();
        this.zzf = zzgwj.zzb;
        this.zzg = zzgwj.zzb;
        this.zzi = zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        byte b = 1;
        switch(zzgxq0.ordinal()) {
            case 0: {
                return this.zzj;
            }
            case 1: {
                if(object0 == null) {
                    b = 0;
                }
                this.zzj = b;
                return null;
            }
            case 2: {
                return zzgxr.zzbQ(zzhch.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhbz.class, "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzhch();
            }
            case 4: {
                return new zzhce(null);
            }
            case 5: {
                return zzhch.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhch.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhch.class) {
                        zzgzk0 = zzhch.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhch.zza);
                            zzhch.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
            default: {
                throw null;
            }
        }
    }
}

