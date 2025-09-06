package com.google.android.gms.internal.ads;

public final class zzgqq extends zzgxr implements zzgzd {
    private static final zzgqq zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqw zze;
    private zzgwj zzf;

    static {
        zzgqq zzgqq0 = new zzgqq();
        zzgqq.zza = zzgqq0;
        zzgxr.zzbZ(zzgqq.class, zzgqq0);
    }

    private zzgqq() {
        this.zzf = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgqo zzb() {
        return (zzgqo)zzgqq.zza.zzaZ();
    }

    public static zzgqq zzd() {
        return zzgqq.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqq.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgqq();
            }
            case 4: {
                return new zzgqo(null);
            }
            case 5: {
                return zzgqq.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqq.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqq.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqq.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqq.zza);
                            zzgqq.zzb = zzgzk0;
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

    public final zzgqw zzf() {
        return this.zze == null ? zzgqw.zzd() : this.zze;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }

    static void zzi(zzgqq zzgqq0, zzgqw zzgqw0) {
        zzgqw0.getClass();
        zzgqq0.zze = zzgqw0;
        zzgqq0.zzc |= 1;
    }
}

