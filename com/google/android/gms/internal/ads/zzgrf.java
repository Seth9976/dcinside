package com.google.android.gms.internal.ads;

public final class zzgrf extends zzgxr implements zzgzd {
    private static final zzgrf zza;
    private static volatile zzgzk zzb;
    private int zzc;

    static {
        zzgrf zzgrf0 = new zzgrf();
        zzgrf.zza = zzgrf0;
        zzgxr.zzbZ(zzgrf.class, zzgrf0);
    }

    public final int zza() {
        return this.zzc;
    }

    public static zzgrd zzb() {
        return (zzgrd)zzgrf.zza.zzaZ();
    }

    public static zzgrf zzd() {
        return zzgrf.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgrf.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000B", new Object[]{"zzc"});
            }
            case 3: {
                return new zzgrf();
            }
            case 4: {
                return new zzgrd(null);
            }
            case 5: {
                return zzgrf.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgrf.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgrf.class;
                    synchronized(class0) {
                        zzgzk0 = zzgrf.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgrf.zza);
                            zzgrf.zzb = zzgzk0;
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

