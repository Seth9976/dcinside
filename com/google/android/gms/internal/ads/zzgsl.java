package com.google.android.gms.internal.ads;

public final class zzgsl extends zzgxr implements zzgzd {
    private static final zzgsl zza;
    private static volatile zzgzk zzb;
    private String zzc;
    private zzgwj zzd;
    private int zze;

    static {
        zzgsl zzgsl0 = new zzgsl();
        zzgsl.zza = zzgsl0;
        zzgxr.zzbZ(zzgsl.class, zzgsl0);
    }

    private zzgsl() {
        this.zzc = "";
        this.zzd = zzgwj.zzb;
    }

    public static zzgsi zza() {
        return (zzgsi)zzgsl.zza.zzaZ();
    }

    public final zzgsj zzb() {
        switch(this.zze) {
            case 0: {
                return zzgsj.zza == null ? zzgsj.zzf : zzgsj.zza;
            }
            case 1: {
                return zzgsj.zzb == null ? zzgsj.zzf : zzgsj.zzb;
            }
            case 2: {
                return zzgsj.zzc == null ? zzgsj.zzf : zzgsj.zzc;
            }
            case 3: {
                return zzgsj.zzd == null ? zzgsj.zzf : zzgsj.zzd;
            }
            case 4: {
                return zzgsj.zze == null ? zzgsj.zzf : zzgsj.zze;
            }
            default: {
                return zzgsj.zzf;
            }
        }
    }

    public static zzgsl zzd() {
        return zzgsl.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgsl.zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgsl();
            }
            case 4: {
                return new zzgsi(null);
            }
            case 5: {
                return zzgsl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgsl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgsl.class;
                    synchronized(class0) {
                        zzgzk0 = zzgsl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgsl.zza);
                            zzgsl.zzb = zzgzk0;
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

    public final zzgwj zzf() {
        return this.zzd;
    }

    public final String zzg() [...] // 潜在的解密器

    static void zzh(zzgsl zzgsl0, zzgsj zzgsj0) {
        zzgsl0.zze = zzgsj0.zza();
    }

    static void zzi(zzgsl zzgsl0, String s) {
        s.getClass();
        zzgsl0.zzc = s;
    }

    static void zzj(zzgsl zzgsl0, zzgwj zzgwj0) {
        zzgwj0.getClass();
        zzgsl0.zzd = zzgwj0;
    }
}

