package com.google.android.gms.internal.ads;

public final class zzhbz extends zzgxr implements zzgzd {
    private static final zzhbz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;
    private zzgwj zze;
    private byte zzf;

    static {
        zzhbz zzhbz0 = new zzhbz();
        zzhbz.zza = zzhbz0;
        zzgxr.zzbZ(zzhbz.class, zzhbz0);
    }

    private zzhbz() {
        this.zzf = 2;
        this.zzd = zzgwj.zzb;
        this.zze = zzgwj.zzb;
    }

    public static zzhby zzc() {
        return (zzhby)zzhbz.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        byte b = 1;
        switch(zzgxq0.ordinal()) {
            case 0: {
                return this.zzf;
            }
            case 1: {
                if(object0 == null) {
                    b = 0;
                }
                this.zzf = b;
                return null;
            }
            case 2: {
                return zzgxr.zzbQ(zzhbz.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzhbz();
            }
            case 4: {
                return new zzhby(null);
            }
            case 5: {
                return zzhbz.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhbz.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhbz.class) {
                        zzgzk0 = zzhbz.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhbz.zza);
                            zzhbz.zzb = zzgzk0;
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

    static void zzf(zzhbz zzhbz0, zzgwj zzgwj0) {
        zzhbz0.zzc |= 1;
        zzhbz0.zzd = zzgwj0;
    }

    static void zzg(zzhbz zzhbz0, zzgwj zzgwj0) {
        zzhbz0.zzc |= 2;
        zzhbz0.zze = zzgwj0;
    }
}

