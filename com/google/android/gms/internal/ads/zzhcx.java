package com.google.android.gms.internal.ads;

public final class zzhcx extends zzgxr implements zzgzd {
    private static final zzhcx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze;
    private zzgwj zzf;
    private zzgwj zzg;

    static {
        zzhcx zzhcx0 = new zzhcx();
        zzhcx.zza = zzhcx0;
        zzgxr.zzbZ(zzhcx.class, zzhcx0);
    }

    private zzhcx() {
        this.zze = "";
        this.zzf = zzgwj.zzb;
        this.zzg = zzgwj.zzb;
    }

    public static zzhcv zzc() {
        return (zzhcv)zzhcx.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcx.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", zzhcw.zza, "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzhcx();
            }
            case 4: {
                return new zzhcv(null);
            }
            case 5: {
                return zzhcx.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcx.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcx.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcx.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcx.zza);
                            zzhcx.zzb = zzgzk0;
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

    static void zzf(zzhcx zzhcx0, zzgwj zzgwj0) {
        zzgwj0.getClass();
        zzhcx0.zzc |= 4;
        zzhcx0.zzf = zzgwj0;
    }

    static void zzg(zzhcx zzhcx0, String s) {
        zzhcx0.zzc |= 2;
        zzhcx0.zze = "image/png";
    }

    static void zzh(zzhcx zzhcx0, int v) {
        zzhcx0.zzd = 1;
        zzhcx0.zzc |= 1;
    }
}

