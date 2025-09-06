package com.google.android.gms.internal.ads;

public final class zzasb extends zzgxr implements zzgzd {
    public static final int zza;
    private static final zzasb zzb;
    private static volatile zzgzk zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    static {
        zzasb zzasb0 = new zzasb();
        zzasb.zzb = zzasb0;
        zzgxr.zzbZ(zzasb.class, zzasb0);
    }

    private zzasb() {
        this.zze = 100L;
        this.zzh = 300L;
        this.zzi = 1000L;
    }

    public static zzasb zzb() {
        return zzasb.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasb.zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzasb();
            }
            case 4: {
                return new zzarz(null);
            }
            case 5: {
                return zzasb.zzb;
            }
            case 6: {
                zzgzk zzgzk0 = zzasb.zzc;
                if(zzgzk0 == null) {
                    Class class0 = zzasb.class;
                    synchronized(class0) {
                        zzgzk0 = zzasb.zzc;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasb.zzb);
                            zzasb.zzc = zzgzk0;
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

