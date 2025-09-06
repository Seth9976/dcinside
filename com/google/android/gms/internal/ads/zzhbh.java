package com.google.android.gms.internal.ads;

public final class zzhbh extends zzgxr implements zzgzd {
    private static final zzhbh zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgwj zzf;

    static {
        zzhbh zzhbh0 = new zzhbh();
        zzhbh.zza = zzhbh0;
        zzgxr.zzbZ(zzhbh.class, zzhbh0);
    }

    private zzhbh() {
        this.zzf = zzgwj.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbh.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", zzhbg.zza, "zze", "zzf"});
            }
            case 3: {
                return new zzhbh();
            }
            case 4: {
                return new zzhbf(null);
            }
            case 5: {
                return zzhbh.zza;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzhbh.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhbh.class) {
                        zzgzk0 = zzhbh.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbh.zza);
                            zzhbh.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }
}

