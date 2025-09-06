package com.google.android.gms.internal.ads;

public final class zzata extends zzgxr implements zzgzd {
    private static final zzata zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private boolean zzf;
    private zzgxz zzg;
    private long zzh;

    static {
        zzata zzata0 = new zzata();
        zzata.zza = zzata0;
        zzgxr.zzbZ(zzata.class, zzata0);
    }

    private zzata() {
        this.zzg = zzgxr.zzbG();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzata.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzata();
            }
            case 4: {
                return new zzasz(null);
            }
            case 5: {
                return zzata.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzata.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzata.class;
                    synchronized(class0) {
                        zzgzk0 = zzata.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzata.zza);
                            zzata.zzb = zzgzk0;
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

