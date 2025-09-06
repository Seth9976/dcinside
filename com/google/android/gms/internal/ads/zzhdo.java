package com.google.android.gms.internal.ads;

public final class zzhdo extends zzgxr implements zzgzd {
    private static final zzhdo zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private String zze;

    static {
        zzhdo zzhdo0 = new zzhdo();
        zzhdo.zza = zzhdo0;
        zzgxr.zzbZ(zzhdo.class, zzhdo0);
    }

    private zzhdo() {
        this.zzd = "";
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdo.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzhdo();
            }
            case 4: {
                return new zzhdn(null);
            }
            case 5: {
                return zzhdo.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdo.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhdo.class;
                    synchronized(class0) {
                        zzgzk0 = zzhdo.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdo.zza);
                            zzhdo.zzb = zzgzk0;
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

