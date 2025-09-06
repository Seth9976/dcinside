package com.google.android.gms.internal.ads;

public final class zzgsv extends zzgxr implements zzgzd {
    private static final zzgsv zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgsl zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgsv zzgsv0 = new zzgsv();
        zzgsv.zza = zzgsv0;
        zzgxr.zzbZ(zzgsv.class, zzgsv0);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgsl zzb() {
        return this.zzd == null ? zzgsl.zzd() : this.zzd;
    }

    public static zzgsu zzc() {
        return (zzgsu)zzgsv.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        int v = zzgxq0.ordinal();
        switch(v) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgsv.zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000B\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzgsv();
            }
            case 4: {
                return new zzgsu(null);
            }
            case 5: {
                return zzgsv.zza;
            }
            default: {
                if(v != 6) {
                    throw null;
                }
                zzgzk zzgzk0 = zzgsv.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzgsv.class) {
                        zzgzk0 = zzgsv.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgsv.zza);
                            zzgsv.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
        }
    }

    public final zzgtp zzf() {
        zzgtp zzgtp0 = zzgtp.zzb(this.zzg);
        return zzgtp0 == null ? zzgtp.zzf : zzgtp0;
    }

    static void zzg(zzgsv zzgsv0, zzgsl zzgsl0) {
        zzgsl0.getClass();
        zzgsv0.zzd = zzgsl0;
        zzgsv0.zzc |= 1;
    }

    static void zzi(zzgsv zzgsv0, zzgtp zzgtp0) {
        zzgsv0.zzg = zzgtp0.zza();
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int v = this.zze;
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    return 4;
                }
                case 3: {
                    return 5;
                }
                default: {
                    return 1;
                }
            }
        }
        return v1 == 0 ? 1 : v1;
    }

    static void zzl(zzgsv zzgsv0, int v) {
        zzgsv0.zze = zzgsm.zza(v);
    }
}

