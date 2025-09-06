package com.google.android.gms.internal.ads;

public final class zzast extends zzgxr implements zzgzd {
    private static final zzast zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private int zze;

    static {
        zzast zzast0 = new zzast();
        zzast.zza = zzast0;
        zzgxr.zzbZ(zzast.class, zzast0);
    }

    private zzast() {
        this.zzd = -1L;
        this.zze = 1000;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzast.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", zzate.zza});
            }
            case 3: {
                return new zzast();
            }
            case 4: {
                return new zzass(null);
            }
            case 5: {
                return zzast.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzast.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzast.class;
                    synchronized(class0) {
                        zzgzk0 = zzast.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzast.zza);
                            zzast.zzb = zzgzk0;
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

