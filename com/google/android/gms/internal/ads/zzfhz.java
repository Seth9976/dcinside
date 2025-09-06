package com.google.android.gms.internal.ads;

public final class zzfhz extends zzgxr implements zzgzd {
    private static final zzfhz zza;
    private static volatile zzgzk zzb;
    private String zzc;
    private int zzd;

    static {
        zzfhz zzfhz0 = new zzfhz();
        zzfhz.zza = zzfhz0;
        zzgxr.zzbZ(zzfhz.class, zzfhz0);
    }

    private zzfhz() {
        this.zzc = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfhz.zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzfhz();
            }
            case 4: {
                return new zzfhx(null);
            }
            case 5: {
                return zzfhz.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfhz.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfhz.class;
                    synchronized(class0) {
                        zzgzk0 = zzfhz.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfhz.zza);
                            zzfhz.zzb = zzgzk0;
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

