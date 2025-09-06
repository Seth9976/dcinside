package com.google.android.gms.internal.ads;

public final class zzhcd extends zzgxr implements zzgzd {
    private static final zzhcd zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzhcc zzd;
    private zzgyd zze;
    private zzgwj zzf;
    private zzgwj zzg;
    private int zzh;
    private byte zzi;

    static {
        zzhcd zzhcd0 = new zzhcd();
        zzhcd.zza = zzhcd0;
        zzgxr.zzbZ(zzhcd.class, zzhcd0);
    }

    private zzhcd() {
        this.zzi = 2;
        this.zze = zzgxr.zzbK();
        this.zzf = zzgwj.zzb;
        this.zzg = zzgwj.zzb;
    }

    public static zzhca zzc() {
        return (zzhca)zzhcd.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        byte b = 1;
        switch(zzgxq0.ordinal()) {
            case 0: {
                return this.zzi;
            }
            case 1: {
                if(object0 == null) {
                    b = 0;
                }
                this.zzi = b;
                return null;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcd.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", zzhbz.class, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzhcd();
            }
            case 4: {
                return new zzhca(null);
            }
            case 5: {
                return zzhcd.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcd.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhcd.class) {
                        zzgzk0 = zzhcd.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcd.zza);
                            zzhcd.zzb = zzgzk0;
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

    static void zzf(zzhcd zzhcd0, zzhbz zzhbz0) {
        zzhbz0.getClass();
        zzgyd zzgyd0 = zzhcd0.zze;
        if(!zzgyd0.zzc()) {
            zzhcd0.zze = zzgxr.zzbL(zzgyd0);
        }
        zzhcd0.zze.add(zzhbz0);
    }
}

