package com.google.android.gms.internal.ads;

public final class zzark extends zzgxr implements zzgzd {
    private static final zzark zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private String zze;

    static {
        zzark zzark0 = new zzark();
        zzark.zza = zzark0;
        zzgxr.zzbZ(zzark.class, zzark0);
    }

    private zzark() {
        this.zzd = "";
        this.zze = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzark.zza, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzark();
            }
            case 4: {
                return new zzarj(null);
            }
            case 5: {
                return zzark.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzark.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzark.class;
                    synchronized(class0) {
                        zzgzk0 = zzark.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzark.zza);
                            zzark.zzb = zzgzk0;
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

