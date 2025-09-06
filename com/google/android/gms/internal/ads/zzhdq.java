package com.google.android.gms.internal.ads;

public final class zzhdq extends zzgxr implements zzgzd {
    private static final zzhdq zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze;
    private zzgxz zzf;
    private int zzg;
    private zzgyd zzh;
    private zzgwj zzi;

    static {
        zzhdq zzhdq0 = new zzhdq();
        zzhdq.zza = zzhdq0;
        zzgxr.zzbZ(zzhdq.class, zzhdq0);
    }

    private zzhdq() {
        this.zze = "";
        this.zzf = zzgxr.zzbG();
        this.zzh = zzgxr.zzbK();
        this.zzi = zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdq.zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001B\u0007ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhdo.class, "zzi"});
            }
            case 3: {
                return new zzhdq();
            }
            case 4: {
                return new zzhdp(null);
            }
            case 5: {
                return zzhdq.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdq.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhdq.class;
                    synchronized(class0) {
                        zzgzk0 = zzhdq.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdq.zza);
                            zzhdq.zzb = zzgzk0;
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

