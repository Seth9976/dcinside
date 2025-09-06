package com.google.android.gms.internal.ads;

public final class zzfim extends zzgxr implements zzgzd {
    private static final zzfim zza;
    private static volatile zzgzk zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfim zzfim0 = new zzfim();
        zzfim.zza = zzfim0;
        zzgxr.zzbZ(zzfim.class, zzfim0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfim.zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzfim();
            }
            case 4: {
                return new zzfik(null);
            }
            case 5: {
                return zzfim.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfim.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfim.class;
                    synchronized(class0) {
                        zzgzk0 = zzfim.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfim.zza);
                            zzfim.zzb = zzgzk0;
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

