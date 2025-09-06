package com.google.android.gms.internal.ads;

public final class zzatl extends zzgxr implements zzgzd {
    private static final zzatl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;

    static {
        zzatl zzatl0 = new zzatl();
        zzatl.zza = zzatl0;
        zzgxr.zzbZ(zzatl.class, zzatl0);
    }

    private zzatl() {
        this.zzd = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzatl.zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzatl();
            }
            case 4: {
                return new zzatk(null);
            }
            case 5: {
                return zzatl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzatl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzatl.class;
                    synchronized(class0) {
                        zzgzk0 = zzatl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzatl.zza);
                            zzatl.zzb = zzgzk0;
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

