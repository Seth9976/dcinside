package com.google.android.gms.internal.ads;

public final class zzhba extends zzgxr implements zzgzd {
    private static final zzhba zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        zzhba zzhba0 = new zzhba();
        zzhba.zza = zzhba0;
        zzgxr.zzbZ(zzhba.class, zzhba0);
    }

    public static zzhaz zzc() {
        return (zzhaz)zzhba.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhba.zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzhba();
            }
            case 4: {
                return new zzhaz(null);
            }
            case 5: {
                return zzhba.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhba.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhba.class;
                    synchronized(class0) {
                        zzgzk0 = zzhba.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhba.zza);
                            zzhba.zzb = zzgzk0;
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

