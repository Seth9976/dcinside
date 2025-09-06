package com.google.android.gms.internal.ads;

public final class zzasx extends zzgxr implements zzgzd {
    private static final zzasx zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;

    static {
        zzasx zzasx0 = new zzasx();
        zzasx.zza = zzasx0;
        zzgxr.zzbZ(zzasx.class, zzasx0);
    }

    private zzasx() {
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
        this.zzi = -1L;
        this.zzj = -1L;
        this.zzk = -1L;
    }

    public static zzasw zza() {
        return (zzasw)zzasx.zza.zzaZ();
    }

    static void zzc(zzasx zzasx0, long v) {
        zzasx0.zzc |= 0x20;
        zzasx0.zzi = v;
    }

    static void zzd(zzasx zzasx0, long v) {
        zzasx0.zzc |= 4;
        zzasx0.zzf = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzasx.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzasx();
            }
            case 4: {
                return new zzasw(null);
            }
            case 5: {
                return zzasx.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzasx.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzasx.class;
                    synchronized(class0) {
                        zzgzk0 = zzasx.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzasx.zza);
                            zzasx.zzb = zzgzk0;
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

    static void zzf(zzasx zzasx0, long v) {
        zzasx0.zzc |= 1;
        zzasx0.zzd = v;
    }

    static void zzg(zzasx zzasx0, long v) {
        zzasx0.zzc |= 8;
        zzasx0.zzg = v;
    }

    static void zzh(zzasx zzasx0, long v) {
        zzasx0.zzc |= 16;
        zzasx0.zzh = v;
    }
}

