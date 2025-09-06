package com.google.android.gms.internal.ads;

@Deprecated
public final class zzhcm extends zzgxr implements zzgzd {
    private static final zzhcm zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzhcl zze;
    private zzhcl zzf;

    static {
        zzhcm zzhcm0 = new zzhcm();
        zzhcm.zza = zzhcm0;
        zzgxr.zzbZ(zzhcm.class, zzhcm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcm.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzc", "zzd", zzhcj.zza, "zze", "zzf"});
            }
            case 3: {
                return new zzhcm();
            }
            case 4: {
                return new zzhci(null);
            }
            case 5: {
                return zzhcm.zza;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzhcm.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhcm.class) {
                        zzgzk0 = zzhcm.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcm.zza);
                            zzhcm.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }
}

