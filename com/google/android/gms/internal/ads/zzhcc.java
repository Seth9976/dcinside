package com.google.android.gms.internal.ads;

public final class zzhcc extends zzgxr implements zzgzd {
    private static final zzhcc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;
    private zzgwj zze;
    private zzgwj zzf;

    static {
        zzhcc zzhcc0 = new zzhcc();
        zzhcc.zza = zzhcc0;
        zzgxr.zzbZ(zzhcc.class, zzhcc0);
    }

    private zzhcc() {
        this.zzd = zzgwj.zzb;
        this.zze = zzgwj.zzb;
        this.zzf = zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcc.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzhcc();
            }
            case 4: {
                return new zzhcb(null);
            }
            case 5: {
                return zzhcc.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcc.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcc.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcc.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcc.zza);
                            zzhcc.zzb = zzgzk0;
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

