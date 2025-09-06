package com.google.android.gms.internal.ads;

public final class zzhcg extends zzgxr implements zzgzd {
    private static final zzhcg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgwj zze;
    private zzgwj zzf;

    static {
        zzhcg zzhcg0 = new zzhcg();
        zzhcg.zza = zzhcg0;
        zzgxr.zzbZ(zzhcg.class, zzhcg0);
    }

    private zzhcg() {
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
                return zzgxr.zzbQ(zzhcg.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzhcg();
            }
            case 4: {
                return new zzhcf(null);
            }
            case 5: {
                return zzhcg.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcg.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcg.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcg.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcg.zza);
                            zzhcg.zzb = zzgzk0;
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

