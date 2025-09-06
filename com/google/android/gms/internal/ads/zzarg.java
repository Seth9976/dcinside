package com.google.android.gms.internal.ads;

public final class zzarg extends zzgxr implements zzgzd {
    private static final zzarg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzary zzi;
    private zzasb zzj;
    private boolean zzk;

    static {
        zzarg zzarg0 = new zzarg();
        zzarg.zza = zzarg0;
        zzgxr.zzbZ(zzarg.class, zzarg0);
    }

    private zzarg() {
        this.zze = true;
        this.zzf = "unknown_host";
        this.zzh = true;
    }

    public static zzare zza() {
        return (zzare)zzarg.zza.zzaZ();
    }

    public final zzary zzc() {
        return this.zzi == null ? zzary.zzc() : this.zzi;
    }

    public final zzasb zzd() {
        return this.zzj == null ? zzasb.zzb() : this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzarg.zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zzarh.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzarg();
            }
            case 4: {
                return new zzare(null);
            }
            case 5: {
                return zzarg.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzarg.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzarg.class;
                    synchronized(class0) {
                        zzgzk0 = zzarg.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzarg.zza);
                            zzarg.zzb = zzgzk0;
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

    public final String zzf() [...] // 潜在的解密器

    static void zzg(zzarg zzarg0, boolean z) {
        zzarg0.zzc |= 8;
        zzarg0.zzg = z;
    }

    static void zzh(zzarg zzarg0, String s) {
        s.getClass();
        zzarg0.zzc |= 4;
        zzarg0.zzf = s;
    }

    public final boolean zzi() {
        return this.zzg;
    }
}

