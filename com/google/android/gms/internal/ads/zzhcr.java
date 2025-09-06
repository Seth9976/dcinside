package com.google.android.gms.internal.ads;

public final class zzhcr extends zzgxr implements zzgzd {
    private static final zzhcr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private long zze;

    static {
        zzhcr zzhcr0 = new zzhcr();
        zzhcr.zza = zzhcr0;
        zzgxr.zzbZ(zzhcr.class, zzhcr0);
    }

    private zzhcr() {
        this.zzd = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcr.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzhcr();
            }
            case 4: {
                return new zzhcq(null);
            }
            case 5: {
                return zzhcr.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcr.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcr.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcr.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcr.zza);
                            zzhcr.zzb = zzgzk0;
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

