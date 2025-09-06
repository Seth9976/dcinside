package com.google.android.gms.internal.ads;

@Deprecated
public final class zzgts extends zzgxr implements zzgzd {
    public static final int zza;
    private static final zzgts zzb;
    private static volatile zzgzk zzc;
    private String zzd;
    private zzgyd zze;

    static {
        zzgts zzgts0 = new zzgts();
        zzgts.zzb = zzgts0;
        zzgxr.zzbZ(zzgts.class, zzgts0);
    }

    private zzgts() {
        this.zzd = "";
        this.zze = zzgxr.zzbK();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgts.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001B", new Object[]{"zzd", "zze", zzgss.class});
            }
            case 3: {
                return new zzgts();
            }
            case 4: {
                return new zzgtq(null);
            }
            case 5: {
                return zzgts.zzb;
            }
            case 6: {
                zzgzk zzgzk0 = zzgts.zzc;
                if(zzgzk0 == null) {
                    Class class0 = zzgts.class;
                    synchronized(class0) {
                        zzgzk0 = zzgts.zzc;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgts.zzb);
                            zzgts.zzc = zzgzk0;
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

