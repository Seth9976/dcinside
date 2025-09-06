package com.google.android.gms.internal.ads;

public final class zzhcu extends zzgxr implements zzgzd {
    private static final zzhcu zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzhcu zzhcu0 = new zzhcu();
        zzhcu.zza = zzhcu0;
        zzgxr.zzbZ(zzhcu.class, zzhcu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcu.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhct.zza, "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzhcu();
            }
            case 4: {
                return new zzhcs(null);
            }
            case 5: {
                return zzhcu.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcu.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcu.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcu.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcu.zza);
                            zzhcu.zzb = zzgzk0;
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

