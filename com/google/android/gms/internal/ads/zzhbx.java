package com.google.android.gms.internal.ads;

public final class zzhbx extends zzgxr implements zzgzd {
    private static final zzhbx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    static {
        zzhbx zzhbx0 = new zzhbx();
        zzhbx.zza = zzhbx0;
        zzgxr.zzbZ(zzhbx.class, zzhbx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbx.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhbw.zza, "zze", zzhbu.zza, "zzf", "zzg"});
            }
            case 3: {
                return new zzhbx();
            }
            case 4: {
                return new zzhbv(null);
            }
            case 5: {
                return zzhbx.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhbx.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhbx.class;
                    synchronized(class0) {
                        zzgzk0 = zzhbx.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbx.zza);
                            zzhbx.zzb = zzgzk0;
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

