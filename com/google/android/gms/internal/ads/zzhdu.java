package com.google.android.gms.internal.ads;

public final class zzhdu extends zzgxr implements zzgzd {
    private static final zzhdu zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;

    static {
        zzhdu zzhdu0 = new zzhdu();
        zzhdu.zza = zzhdu0;
        zzgxr.zzbZ(zzhdu.class, zzhdu0);
    }

    private zzhdu() {
        this.zzd = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdu.zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzhdu();
            }
            case 4: {
                return new zzhdt(null);
            }
            case 5: {
                return zzhdu.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdu.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhdu.class;
                    synchronized(class0) {
                        zzgzk0 = zzhdu.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdu.zza);
                            zzhdu.zzb = zzgzk0;
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

