package com.google.android.gms.internal.ads;

public final class zzarr extends zzgxr implements zzgzd {
    private static final zzarr zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzarr zzarr0 = new zzarr();
        zzarr.zza = zzarr0;
        zzgxr.zzbZ(zzarr.class, zzarr0);
    }

    private zzarr() {
        this.zzd = 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzarr.zza, "\u0004\u0001\u0000\u0001\u001B\u001B\u0001\u0000\u0000\u0000\u001B᠌\u0000", new Object[]{"zzc", "zzd", zzars.zza});
            }
            case 3: {
                return new zzarr();
            }
            case 4: {
                return new zzarq(null);
            }
            case 5: {
                return zzarr.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzarr.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzarr.class;
                    synchronized(class0) {
                        zzgzk0 = zzarr.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzarr.zza);
                            zzarr.zzb = zzgzk0;
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

