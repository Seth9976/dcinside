package com.google.android.gms.internal.ads;

public final class zzhbt extends zzgxr implements zzgzd {
    private static final zzhbt zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private zzhbs zze;
    private long zzf;
    private String zzg;

    static {
        zzhbt zzhbt0 = new zzhbt();
        zzhbt.zza = zzhbt0;
        zzgxr.zzbZ(zzhbt.class, zzhbt0);
    }

    private zzhbt() {
        this.zzd = "";
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbt.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzhbt();
            }
            case 4: {
                return new zzhbq(null);
            }
            case 5: {
                return zzhbt.zza;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzhbt.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhbt.class) {
                        zzgzk0 = zzhbt.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbt.zza);
                            zzhbt.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }
}

