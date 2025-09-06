package com.google.android.gms.internal.ads;

public final class zzatc extends zzgxr implements zzgzd {
    private static final zzatc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;
    private zzgwj zze;
    private zzgwj zzf;
    private zzgwj zzg;

    static {
        zzatc zzatc0 = new zzatc();
        zzatc.zza = zzatc0;
        zzgxr.zzbZ(zzatc.class, zzatc0);
    }

    private zzatc() {
        this.zzd = zzgwj.zzb;
        this.zze = zzgwj.zzb;
        this.zzf = zzgwj.zzb;
        this.zzg = zzgwj.zzb;
    }

    public static zzatb zza() {
        return (zzatb)zzatc.zza.zzaZ();
    }

    public static zzatc zzc(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzatc)zzgxr.zzbx(zzatc.zza, arr_b, zzgxb0);
    }

    public final zzgwj zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzatc.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzatc();
            }
            case 4: {
                return new zzatb(null);
            }
            case 5: {
                return zzatc.zza;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzatc.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzatc.class) {
                        zzgzk0 = zzatc.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzatc.zza);
                            zzatc.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public final zzgwj zzf() {
        return this.zze;
    }

    public final zzgwj zzg() {
        return this.zzg;
    }

    public final zzgwj zzh() {
        return this.zzf;
    }

    static void zzi(zzatc zzatc0, zzgwj zzgwj0) {
        zzatc0.zzc |= 1;
        zzatc0.zzd = zzgwj0;
    }

    static void zzj(zzatc zzatc0, zzgwj zzgwj0) {
        zzatc0.zzc |= 2;
        zzatc0.zze = zzgwj0;
    }

    static void zzk(zzatc zzatc0, zzgwj zzgwj0) {
        zzatc0.zzc |= 8;
        zzatc0.zzg = zzgwj0;
    }

    static void zzl(zzatc zzatc0, zzgwj zzgwj0) {
        zzatc0.zzc |= 4;
        zzatc0.zzf = zzgwj0;
    }
}

