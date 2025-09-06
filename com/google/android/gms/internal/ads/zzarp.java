package com.google.android.gms.internal.ads;

public final class zzarp extends zzgxr implements zzgzd {
    private static final zzarp zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzarr zzd;
    private zzaru zze;

    static {
        zzarp zzarp0 = new zzarp();
        zzarp.zza = zzarp0;
        zzgxr.zzbZ(zzarp.class, zzarp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzarp.zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzarp();
            }
            case 4: {
                return new zzaro(null);
            }
            case 5: {
                return zzarp.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzarp.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzarp.class;
                    synchronized(class0) {
                        zzgzk0 = zzarp.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzarp.zza);
                            zzarp.zzb = zzgzk0;
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

