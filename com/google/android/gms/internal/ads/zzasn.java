package com.google.android.gms.internal.ads;

public final class zzasn extends zzgxr implements zzgzd {
    private static final zzasn zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;

    static {
        zzasn zzasn0 = new zzasn();
        zzasn.zza = zzasn0;
        zzgxr.zzbZ(zzasn.class, zzasn0);
    }

    private zzasn() {
        this.zzd = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasn.zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzasn();
            }
            case 4: {
                return new zzasm(null);
            }
            case 5: {
                return zzasn.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzasn.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzasn.class;
                    synchronized(class0) {
                        zzgzk0 = zzasn.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasn.zza);
                            zzasn.zzb = zzgzk0;
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

