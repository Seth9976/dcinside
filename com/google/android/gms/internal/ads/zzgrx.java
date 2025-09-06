package com.google.android.gms.internal.ads;

public final class zzgrx extends zzgxr implements zzgzd {
    private static final zzgrx zza;
    private static volatile zzgzk zzb;

    static {
        zzgrx zzgrx0 = new zzgrx();
        zzgrx.zza = zzgrx0;
        zzgxr.zzbZ(zzgrx.class, zzgrx0);
    }

    public static zzgrx zzb() {
        return zzgrx.zza;
    }

    public static zzgrx zzc(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgrx)zzgxr.zzbr(zzgrx.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgrx.zza, "\u0000\u0000", null);
            }
            case 3: {
                return new zzgrx();
            }
            case 4: {
                return new zzgrv(null);
            }
            case 5: {
                return zzgrx.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgrx.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgrx.class;
                    synchronized(class0) {
                        zzgzk0 = zzgrx.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgrx.zza);
                            zzgrx.zzb = zzgzk0;
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

