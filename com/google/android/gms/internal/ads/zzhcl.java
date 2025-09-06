package com.google.android.gms.internal.ads;

public final class zzhcl extends zzgxr implements zzgzd {
    private static final zzhcl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzhcl zzhcl0 = new zzhcl();
        zzhcl.zza = zzhcl0;
        zzgxr.zzbZ(zzhcl.class, zzhcl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcl.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", zzhcj.zza, "zze", "zzf", zzhcj.zza});
            }
            case 3: {
                return new zzhcl();
            }
            case 4: {
                return new zzhck(null);
            }
            case 5: {
                return zzhcl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcl.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcl.zza);
                            zzhcl.zzb = zzgzk0;
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

