package com.google.android.gms.internal.ads;

public final class zzhbs extends zzgxr implements zzgzd {
    private static final zzhbs zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;

    static {
        zzhbs zzhbs0 = new zzhbs();
        zzhbs.zza = zzhbs0;
        zzgxr.zzbZ(zzhbs.class, zzhbs0);
    }

    private zzhbs() {
        this.zzd = zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbs.zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzhbs();
            }
            case 4: {
                return new zzhbr(null);
            }
            case 5: {
                return zzhbs.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhbs.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhbs.class;
                    synchronized(class0) {
                        zzgzk0 = zzhbs.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbs.zza);
                            zzhbs.zzb = zzgzk0;
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

