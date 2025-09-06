package com.google.android.gms.internal.ads;

public final class zzhdi extends zzgxr implements zzgzd {
    private static final zzhdi zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private zzgwj zze;

    static {
        zzhdi zzhdi0 = new zzhdi();
        zzhdi.zza = zzhdi0;
        zzgxr.zzbZ(zzhdi.class, zzhdi0);
    }

    private zzhdi() {
        this.zzd = "";
        this.zze = zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdi.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzhdi();
            }
            case 4: {
                return new zzhdh(null);
            }
            case 5: {
                return zzhdi.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdi.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhdi.class;
                    synchronized(class0) {
                        zzgzk0 = zzhdi.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdi.zza);
                            zzhdi.zzb = zzgzk0;
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

