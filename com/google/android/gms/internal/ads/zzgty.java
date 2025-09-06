package com.google.android.gms.internal.ads;

public final class zzgty extends zzgxr implements zzgzd {
    private static final zzgty zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgub zze;

    static {
        zzgty zzgty0 = new zzgty();
        zzgty.zza = zzgty0;
        zzgxr.zzbZ(zzgty.class, zzgty0);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgtw zzb() {
        return (zzgtw)zzgty.zza.zzaZ();
    }

    public static zzgty zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgty)zzgxr.zzbr(zzgty.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgty.zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000B\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgty();
            }
            case 4: {
                return new zzgtw(null);
            }
            case 5: {
                return zzgty.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgty.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgty.class;
                    synchronized(class0) {
                        zzgzk0 = zzgty.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgty.zza);
                            zzgty.zzb = zzgzk0;
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

    public final zzgub zzf() {
        return this.zze == null ? zzgub.zzd() : this.zze;
    }

    static void zzg(zzgty zzgty0, zzgub zzgub0) {
        zzgub0.getClass();
        zzgty0.zze = zzgub0;
        zzgty0.zzc |= 1;
    }
}

