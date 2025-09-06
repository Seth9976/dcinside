package com.google.android.gms.internal.ads;

public final class zzfhr extends zzgxr implements zzgzd {
    private static final zzfhr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzfho zzd;

    static {
        zzfhr zzfhr0 = new zzfhr();
        zzfhr.zza = zzfhr0;
        zzgxr.zzbZ(zzfhr.class, zzfhr0);
    }

    public static zzfhq zza() {
        return (zzfhq)zzfhr.zza.zzaZ();
    }

    static void zzc(zzfhr zzfhr0, zzfho zzfho0) {
        zzfho0.getClass();
        zzfhr0.zzd = zzfho0;
        zzfhr0.zzc |= 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfhr.zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzfhr();
            }
            case 4: {
                return new zzfhq(null);
            }
            case 5: {
                return zzfhr.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfhr.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfhr.class;
                    synchronized(class0) {
                        zzgzk0 = zzfhr.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfhr.zza);
                            zzfhr.zzb = zzgzk0;
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

