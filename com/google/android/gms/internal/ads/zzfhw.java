package com.google.android.gms.internal.ads;

public final class zzfhw extends zzgxr implements zzgzd {
    private static final zzfhw zza;
    private static volatile zzgzk zzb;
    private String zzc;

    static {
        zzfhw zzfhw0 = new zzfhw();
        zzfhw.zza = zzfhw0;
        zzgxr.zzbZ(zzfhw.class, zzfhw0);
    }

    private zzfhw() {
        this.zzc = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfhw.zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            }
            case 3: {
                return new zzfhw();
            }
            case 4: {
                return new zzfhu(null);
            }
            case 5: {
                return zzfhw.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfhw.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfhw.class;
                    synchronized(class0) {
                        zzgzk0 = zzfhw.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfhw.zza);
                            zzfhw.zzb = zzgzk0;
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

