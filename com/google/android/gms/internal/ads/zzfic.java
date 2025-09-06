package com.google.android.gms.internal.ads;

public final class zzfic extends zzgxr implements zzgzd {
    private static final zzfic zza;
    private static volatile zzgzk zzb;
    private String zzc;

    static {
        zzfic zzfic0 = new zzfic();
        zzfic.zza = zzfic0;
        zzgxr.zzbZ(zzfic.class, zzfic0);
    }

    private zzfic() {
        this.zzc = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfic.zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            }
            case 3: {
                return new zzfic();
            }
            case 4: {
                return new zzfia(null);
            }
            case 5: {
                return zzfic.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfic.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfic.class;
                    synchronized(class0) {
                        zzgzk0 = zzfic.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfic.zza);
                            zzfic.zzb = zzgzk0;
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

