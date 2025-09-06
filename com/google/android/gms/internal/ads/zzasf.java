package com.google.android.gms.internal.ads;

public final class zzasf extends zzgxr implements zzgzd {
    private static final zzasf zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzasf zzasf0 = new zzasf();
        zzasf.zza = zzasf0;
        zzgxr.zzbZ(zzasf.class, zzasf0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasf.zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzasj.zza});
            }
            case 3: {
                return new zzasf();
            }
            case 4: {
                return new zzase(null);
            }
            case 5: {
                return zzasf.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzasf.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzasf.class;
                    synchronized(class0) {
                        zzgzk0 = zzasf.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasf.zza);
                            zzasf.zzb = zzgzk0;
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

