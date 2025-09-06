package com.google.android.gms.internal.ads;

public final class zzaxz extends zzgxr implements zzgzd {
    private static final zzaxz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzaxz zzaxz0 = new zzaxz();
        zzaxz.zza = zzaxz0;
        zzgxr.zzbZ(zzaxz.class, zzaxz0);
    }

    private zzaxz() {
        this.zzd = "";
        this.zze = "";
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    public static zzaxx zzd() {
        return (zzaxx)zzaxz.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzaxz.zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzaxz();
            }
            case 4: {
                return new zzaxx(null);
            }
            case 5: {
                return zzaxz.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzaxz.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzaxz.class;
                    synchronized(class0) {
                        zzgzk0 = zzaxz.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzaxz.zza);
                            zzaxz.zzb = zzgzk0;
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

    public static zzaxz zzg() {
        return zzaxz.zza;
    }

    public static zzaxz zzh(zzgwj zzgwj0) throws zzgyg {
        return (zzaxz)zzgxr.zzbm(zzaxz.zza, zzgwj0);
    }

    public static zzaxz zzi(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzaxz)zzgxr.zzbr(zzaxz.zza, zzgwj0, zzgxb0);
    }

    public final String zzj() [...] // 潜在的解密器

    public final String zzk() [...] // 潜在的解密器

    static void zzl(zzaxz zzaxz0, String s) {
        s.getClass();
        zzaxz0.zzc |= 2;
        zzaxz0.zze = s;
    }

    static void zzm(zzaxz zzaxz0, long v) {
        zzaxz0.zzc |= 8;
        zzaxz0.zzg = v;
    }

    static void zzn(zzaxz zzaxz0, long v) {
        zzaxz0.zzc |= 4;
        zzaxz0.zzf = v;
    }

    static void zzo(zzaxz zzaxz0, long v) {
        zzaxz0.zzc |= 16;
        zzaxz0.zzh = v;
    }

    static void zzp(zzaxz zzaxz0, String s) {
        s.getClass();
        zzaxz0.zzc |= 1;
        zzaxz0.zzd = s;
    }
}

